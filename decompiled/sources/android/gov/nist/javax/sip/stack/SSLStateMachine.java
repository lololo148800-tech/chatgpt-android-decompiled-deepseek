package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public class SSLStateMachine {
    protected NioTlsChannelInterface channel;
    protected SSLEngine sslEngine;
    protected ByteBuffer tlsRecordBuffer;
    private static StackLogger logger = CommonLogger.getLogger(SSLStateMachine.class);
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.wrap(new byte[0]);
    protected Queue<MessageSendItem> pendingOutboundBuffers = new LinkedList();
    private Object unwrapLock = new Object();
    private Object wrapLock = new Object();

    /* JADX INFO: renamed from: android.gov.nist.javax.sip.stack.SSLStateMachine$1 */
    public static /* synthetic */ class C107911 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface MessageSendCallback {
        void doSend(byte[] bArr);
    }

    public static class MessageSendItem {
        private MessageSendCallback callback;
        private ByteBuffer message;

        public MessageSendItem(ByteBuffer byteBuffer, MessageSendCallback messageSendCallback) {
            this.message = byteBuffer;
            this.callback = messageSendCallback;
        }

        public MessageSendCallback getCallBack() {
            return this.callback;
        }

        public String toString() {
            return MessageSendItem.class.getSimpleName() + " [" + this.message + ", " + this.callback + "]";
        }
    }

    public SSLStateMachine(SSLEngine sSLEngine, NioTlsChannelInterface nioTlsChannelInterface) {
        this.sslEngine = sSLEngine;
        this.channel = nioTlsChannelInterface;
    }

    private void clearBuffer() {
        this.tlsRecordBuffer = null;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Buffer cleared");
        }
    }

    private ByteBuffer normalizeTlsRecordBuffer(ByteBuffer byteBuffer) {
        if (this.tlsRecordBuffer == null) {
            return byteBuffer;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Normalize buffer " + byteBuffer + " into record buffer " + this.tlsRecordBuffer);
        }
        ByteBuffer byteBuffer2 = this.tlsRecordBuffer;
        byteBuffer2.position(byteBuffer2.limit());
        ByteBuffer byteBuffer3 = this.tlsRecordBuffer;
        byteBuffer3.limit(byteBuffer3.capacity());
        this.tlsRecordBuffer.put(byteBuffer);
        this.tlsRecordBuffer.flip();
        return this.tlsRecordBuffer;
    }

    private void runDelegatedTasks(SSLEngineResult sSLEngineResult) throws IOException {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Running delegated task for " + sSLEngineResult);
        }
        if (sSLEngineResult.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            while (true) {
                Runnable delegatedTask = this.sslEngine.getDelegatedTask();
                if (delegatedTask == null) {
                    break;
                } else {
                    delegatedTask.run();
                }
            }
            SSLEngineResult.HandshakeStatus handshakeStatus = this.sslEngine.getHandshakeStatus();
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Handshake status after delegated tasks " + handshakeStatus);
            }
            if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                throw new IOException("handshake shouldn't need additional tasks");
            }
        }
    }

    private void startBuffer(ByteBuffer byteBuffer) {
        if (this.tlsRecordBuffer == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBufferFactory.getInstance().allocateDirect(33270);
            this.tlsRecordBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(byteBuffer);
            this.tlsRecordBuffer.flip();
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Allocated record buffer for reading " + this.tlsRecordBuffer + " for src = " + byteBuffer);
            }
        }
    }

    private void wrapNonAppData() throws IOException {
        SSLEngineResult sSLEngineResultWrap;
        ByteBuffer byteBufferPrepareEncryptedDataBuffer = this.channel.prepareEncryptedDataBuffer();
        do {
            sSLEngineResultWrap = this.sslEngine.wrap(EMPTY_BUFFER, byteBufferPrepareEncryptedDataBuffer);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("NonAppWrap result " + sSLEngineResultWrap + " buffers size " + this.pendingOutboundBuffers.size());
            }
            if (sSLEngineResultWrap.bytesProduced() > 0) {
                byteBufferPrepareEncryptedDataBuffer.flip();
                byte[] bArr = new byte[byteBufferPrepareEncryptedDataBuffer.remaining()];
                byteBufferPrepareEncryptedDataBuffer.get(bArr);
                sendSSLMetadata(bArr);
                byteBufferPrepareEncryptedDataBuffer.clear();
            }
            int i10 = C107911.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[sSLEngineResultWrap.getHandshakeStatus().ordinal()];
            if (i10 == 3) {
                runDelegatedTasks(sSLEngineResultWrap);
            } else if (i10 == 4) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Handshake complete!");
                }
                NioTlsChannelInterface nioTlsChannelInterface = this.channel;
                if (nioTlsChannelInterface instanceof NioTlsMessageChannel) {
                    ((NioTlsMessageChannel) nioTlsChannelInterface).setHandshakeCompleted(true);
                    if (this.sslEngine.getSession() != null) {
                        if (!ClientAuthType.Disabled.equals(this.channel.getSIPStack().getClientAuth()) && !ClientAuthType.DisabledAll.equals(this.channel.getSIPStack().getClientAuth())) {
                            try {
                                ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setPeerCertificates(this.sslEngine.getSession().getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled");
                                }
                            } catch (SSLException e10) {
                                throw e10;
                            }
                        }
                        ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setLocalCertificates(this.sslEngine.getSession().getLocalCertificates());
                        ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setCipherSuite(this.sslEngine.getSession().getCipherSuite());
                    }
                }
            }
        } while (sSLEngineResultWrap.bytesProduced() != 0);
    }

    public void sendSSLMetadata(byte[] bArr) {
        this.channel.sendEncryptedData(bArr);
    }

    public void unwrap(ByteBuffer byteBuffer) {
        unwrap(byteBuffer, this.channel.prepareAppDataBuffer());
    }

    public void wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, MessageSendCallback messageSendCallback) {
        synchronized (this.wrapLock) {
            try {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Wrapping " + byteBuffer + ", buffers size " + this.pendingOutboundBuffers.size());
                }
                if (byteBuffer != null) {
                    this.pendingOutboundBuffers.offer(new MessageSendItem(byteBuffer, messageSendCallback));
                }
                while (true) {
                    MessageSendItem messageSendItemPeek = this.pendingOutboundBuffers.peek();
                    if (messageSendItemPeek == null) {
                        break;
                    }
                    try {
                        SSLEngineResult sSLEngineResultWrap = this.sslEngine.wrap(messageSendItemPeek.message, byteBuffer2);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Wrap result " + sSLEngineResultWrap + " buffers size " + this.pendingOutboundBuffers.size());
                        }
                        if (!messageSendItemPeek.message.hasRemaining()) {
                            this.pendingOutboundBuffers.remove();
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("REMOVED item from encryption queue because it has no more data, all is done, buffers size now is " + this.pendingOutboundBuffers.size() + " current buffer is " + messageSendItemPeek);
                            }
                        }
                        int iRemaining = messageSendItemPeek.message.remaining();
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Remaining " + iRemaining + " queue size is " + this.pendingOutboundBuffers.size());
                        }
                        if (sSLEngineResultWrap.bytesProduced() <= 0) {
                            int i10 = C107911.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[sSLEngineResultWrap.getHandshakeStatus().ordinal()];
                            if (i10 == 1) {
                                if (!messageSendItemPeek.message.hasRemaining()) {
                                    break;
                                }
                            } else {
                                if (i10 == 2) {
                                    break;
                                }
                                if (i10 == 3) {
                                    runDelegatedTasks(sSLEngineResultWrap);
                                } else if (i10 == 4) {
                                    NioTlsChannelInterface nioTlsChannelInterface = this.channel;
                                    if (nioTlsChannelInterface instanceof NioTlsMessageChannel) {
                                        ((NioTlsMessageChannel) nioTlsChannelInterface).setHandshakeCompleted(true);
                                        if (this.sslEngine.getSession() != null) {
                                            if (!ClientAuthType.Disabled.equals(this.channel.getSIPStack().getClientAuth()) && !ClientAuthType.DisabledAll.equals(this.channel.getSIPStack().getClientAuth())) {
                                                try {
                                                    ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setPeerCertificates(this.sslEngine.getSession().getPeerCertificates());
                                                } catch (SSLPeerUnverifiedException unused) {
                                                    if (logger.isLoggingEnabled(32)) {
                                                        logger.logDebug("sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled");
                                                    }
                                                }
                                            }
                                            ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setLocalCertificates(this.sslEngine.getSession().getLocalCertificates());
                                            ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setCipherSuite(this.sslEngine.getSession().getCipherSuite());
                                        }
                                    }
                                } else if (i10 == 5) {
                                    break;
                                }
                            }
                        } else {
                            byteBuffer2.flip();
                            byte[] bArr = new byte[byteBuffer2.remaining()];
                            byteBuffer2.get(bArr);
                            if (messageSendItemPeek.getCallBack() != null) {
                                messageSendItemPeek.getCallBack().doSend(bArr);
                            } else {
                                sendSSLMetadata(bArr);
                            }
                            byteBuffer2.clear();
                        }
                    } catch (Throwable th2) {
                        if (!messageSendItemPeek.message.hasRemaining()) {
                            this.pendingOutboundBuffers.remove();
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("REMOVED item from encryption queue because it has no more data, all is done, buffers size now is " + this.pendingOutboundBuffers.size() + " current buffer is " + messageSendItemPeek);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void wrapRemaining() {
        wrap(null, this.channel.prepareEncryptedDataBuffer(), null);
    }

    private void unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        synchronized (this.unwrapLock) {
            while (true) {
                try {
                    byteBuffer = normalizeTlsRecordBuffer(byteBuffer);
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Unwrap src " + byteBuffer + " dst " + byteBuffer2);
                    }
                    try {
                        SSLEngineResult sSLEngineResultUnwrap = this.sslEngine.unwrap(byteBuffer, byteBuffer2);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Unwrap result " + sSLEngineResultUnwrap + " buffers size " + this.pendingOutboundBuffers.size() + " src=" + byteBuffer + " dst=" + byteBuffer2);
                        }
                        if (sSLEngineResultUnwrap.getStatus().equals(SSLEngineResult.Status.BUFFER_UNDERFLOW)) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Buffer underflow, wait for the next inbound chunk of data to feed the SSL engine");
                            }
                            startBuffer(byteBuffer);
                            break;
                        }
                        clearBuffer();
                        if (sSLEngineResultUnwrap.getStatus().equals(SSLEngineResult.Status.BUFFER_OVERFLOW)) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Buffer overflow , must prepare the buffer again. outNetBuffer remaining: " + byteBuffer2.remaining() + " outNetBuffer postion: " + byteBuffer2.position() + " Packet buffer size: " + this.sslEngine.getSession().getPacketBufferSize() + " new buffer size: " + this.sslEngine.getSession().getPacketBufferSize() + byteBuffer2.position());
                            }
                            byteBuffer2 = this.channel.prepareAppDataBuffer(this.sslEngine.getSession().getPacketBufferSize());
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug(" new outNetBuffer remaining: " + byteBuffer2.remaining() + " new outNetBuffer postion: " + byteBuffer2.position());
                            }
                        } else {
                            if (sSLEngineResultUnwrap.bytesProduced() > 0) {
                                byteBuffer2.flip();
                                byte[] bArr = new byte[byteBuffer2.remaining()];
                                byteBuffer2.get(bArr);
                                this.channel.addPlaintextBytes(bArr);
                            }
                            int i10 = C107911.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[sSLEngineResultUnwrap.getHandshakeStatus().ordinal()];
                            if (i10 == 1) {
                                wrapNonAppData();
                            } else if (i10 == 2) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Unwrap has remaining: " + byteBuffer.hasRemaining() + " buffer " + byteBuffer);
                                }
                                if (!byteBuffer.hasRemaining()) {
                                    break;
                                }
                            } else if (i10 == 3) {
                                runDelegatedTasks(sSLEngineResultUnwrap);
                            } else if (i10 == 4) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Handshaking just finnished, but has remaining. Will try to wrap the queues app items.");
                                }
                                wrapRemaining();
                                if (!byteBuffer.hasRemaining()) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Handshake passed");
                                    }
                                    NioTlsChannelInterface nioTlsChannelInterface = this.channel;
                                    if (!(nioTlsChannelInterface instanceof NioTlsMessageChannel)) {
                                        break;
                                    }
                                    ((NioTlsMessageChannel) nioTlsChannelInterface).setHandshakeCompleted(true);
                                    if (this.sslEngine.getSession() != null) {
                                        if (!ClientAuthType.Disabled.equals(this.channel.getSIPStack().getClientAuth()) && !ClientAuthType.DisabledAll.equals(this.channel.getSIPStack().getClientAuth())) {
                                            try {
                                                ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setPeerCertificates(this.sslEngine.getSession().getPeerCertificates());
                                            } catch (SSLPeerUnverifiedException unused) {
                                                if (logger.isLoggingEnabled(32)) {
                                                    logger.logDebug("sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled");
                                                }
                                            }
                                        }
                                        ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setLocalCertificates(this.sslEngine.getSession().getLocalCertificates());
                                        ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setCipherSuite(this.sslEngine.getSession().getCipherSuite());
                                    }
                                    try {
                                        this.channel.getSIPStack().getTlsSecurityPolicy().enforceTlsPolicy(this.channel.getEncapsulatedClientTransaction());
                                        if (!logger.isLoggingEnabled(32)) {
                                            break;
                                        }
                                        logger.logDebug("TLS Security policy passed");
                                        break;
                                    } catch (SecurityException e10) {
                                        throw new IOException(e10.getMessage());
                                    }
                                }
                            } else if (i10 == 5) {
                                wrapRemaining();
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Not handshaking, but has remaining: " + byteBuffer.hasRemaining() + " buffer " + byteBuffer);
                                }
                                if (!byteBuffer.hasRemaining()) {
                                    break;
                                }
                            }
                        }
                    } catch (Exception e11) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("A problem occured while trying to unwrap the message " + e11.getMessage());
                        }
                        throw e11;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
