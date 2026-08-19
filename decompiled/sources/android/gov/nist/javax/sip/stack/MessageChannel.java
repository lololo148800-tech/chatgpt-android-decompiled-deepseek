package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import p571X9.AbstractC9306j0;
import p691d.InterfaceC12943b;
import p713e.InterfaceC13216Y;
import p713e.InterfaceC13238l;

/* JADX INFO: loaded from: classes.dex */
public abstract class MessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(MessageChannel.class);
    static ThreadLocal<String> messageTxId = new ThreadLocal<>();
    private SIPClientTransaction encapsulatedClientTransaction;
    protected transient MessageProcessor messageProcessor;
    protected int useCount;

    private static final boolean copyHeader(String str, String str2, StringBuilder sb2) {
        int iIndexOf;
        int iIndexOf2 = str2.indexOf(str);
        if (iIndexOf2 == -1 || (iIndexOf = str2.indexOf(Separators.NEWLINE, iIndexOf2)) == -1) {
            return false;
        }
        sb2.append(str2.subSequence(iIndexOf2 - 2, iIndexOf));
        return true;
    }

    private static final boolean copyViaHeaders(String str, StringBuilder sb2) {
        int iIndexOf = str.indexOf(SIPHeaderNames.VIA);
        boolean z6 = false;
        while (iIndexOf != -1) {
            int iIndexOf2 = str.indexOf(Separators.NEWLINE, iIndexOf);
            if (iIndexOf2 == -1) {
                return false;
            }
            sb2.append(str.subSequence(iIndexOf - 2, iIndexOf2));
            iIndexOf = str.indexOf(SIPHeaderNames.VIA, iIndexOf2);
            z6 = true;
        }
        return z6;
    }

    public static String getKey(InetAddress inetAddress, int i10, String str) {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, ":");
        sbM9895n.append(inetAddress.getHostAddress().replaceAll("[\\[\\]]", ""));
        sbM9895n.append(":");
        sbM9895n.append(i10);
        return sbM9895n.toString().toLowerCase();
    }

    public abstract void close();

    public final String createBadReqRes(String str, ParseException parseException) {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append("SIP/2.0 400 Bad Request (" + parseException.getLocalizedMessage() + ')');
        if (!copyViaHeaders(str, sb2) || !copyHeader(SIPHeaderNames.CSEQ, str, sb2) || !copyHeader(SIPHeaderNames.CALL_ID, str, sb2) || !copyHeader(SIPHeaderNames.FROM, str, sb2) || !copyHeader(SIPHeaderNames.f32002TO, str, sb2)) {
            return null;
        }
        int iIndexOf = sb2.indexOf(SIPHeaderNames.f32002TO);
        if (iIndexOf != -1 && sb2.indexOf(ParameterNames.TAG, iIndexOf) == -1) {
            sb2.append(";tag=badreq");
        }
        InterfaceC13216Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
        if (defaultServerHeader != null) {
            sb2.append(Separators.NEWLINE + defaultServerHeader.toString());
        }
        int length = str.length();
        if (!(this instanceof UDPMessageChannel) || sb2.length() + length + 45 < 1300) {
            sb2.append(Separators.NEWLINE + new ContentType("message", "sipfrag").toString());
            sb2.append(Separators.NEWLINE + new ContentLength(length).toString());
            sb2.append("\r\n\r\n".concat(str));
        } else {
            sb2.append(Separators.NEWLINE + new ContentLength(0).toString());
        }
        return sb2.toString();
    }

    public SIPClientTransaction getEncapsulatedClientTransaction() {
        return this.encapsulatedClientTransaction;
    }

    public String getHost() {
        return getMessageProcessor().getIpAddress().getHostAddress();
    }

    public HostPort getHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getHost()));
        hostPort.setPort(getPort());
        return hostPort;
    }

    public abstract String getKey();

    public MessageProcessor getMessageProcessor() {
        return this.messageProcessor;
    }

    public abstract String getPeerAddress();

    public HostPort getPeerHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getPeerAddress()));
        hostPort.setPort(getPeerPort());
        return hostPort;
    }

    public abstract InetAddress getPeerInetAddress();

    public abstract InetAddress getPeerPacketSourceAddress();

    public abstract int getPeerPacketSourcePort();

    public abstract int getPeerPort();

    public abstract String getPeerProtocol();

    public int getPort() {
        MessageProcessor messageProcessor = this.messageProcessor;
        if (messageProcessor != null) {
            return messageProcessor.getPort();
        }
        return -1;
    }

    public String getRawIpSourceAddress() {
        try {
            return InetAddress.getByName(getPeerAddress()).getHostAddress();
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public abstract SIPTransactionStack getSIPStack();

    public abstract String getTransport();

    public Via getViaHeader() {
        Via via = new Via();
        try {
            via.setTransport(getTransport());
        } catch (ParseException unused) {
        }
        via.setSentBy(getHostPort());
        return via;
    }

    public abstract String getViaHost();

    public HostPort getViaHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getViaHost()));
        hostPort.setPort(getViaPort());
        return hostPort;
    }

    public abstract int getViaPort();

    public abstract boolean isReliable();

    public abstract boolean isSecure();

    public void logMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10, long j10) {
        if (logger.isLoggingEnabled(16)) {
            if (i10 == -1) {
                i10 = SIPConstants.DEFAULT_PORT;
            }
            getSIPStack().serverLogger.logMessage(sIPMessage, getHost() + ":" + getPort(), inetAddress.getHostAddress().toString() + ":" + i10, true, j10);
        }
    }

    public void logResponse(SIPResponse sIPResponse, long j10, String str) {
        int peerPort = getPeerPort();
        if (peerPort == 0 && sIPResponse.getContactHeaders() != null) {
            peerPort = ((AddressImpl) ((InterfaceC13238l) sIPResponse.getContactHeaders().getFirst()).getAddress()).getPort();
        }
        getSIPStack().serverLogger.logMessage(sIPResponse, getPeerAddress().toString() + ":" + peerPort, getHost() + ":" + getPort(), str, false, j10);
    }

    public abstract void sendMessage(SIPMessage sIPMessage);

    public void sendMessage(final SIPMessage sIPMessage, InterfaceC12943b interfaceC12943b) throws UnknownHostException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InetAddress byName = InetAddress.getByName(interfaceC12943b.getHost());
        try {
            try {
                for (MessageProcessor messageProcessor : getSIPStack().getMessageProcessors()) {
                    if (messageProcessor.getIpAddress().equals(byName) && messageProcessor.getPort() == interfaceC12943b.getPort() && messageProcessor.getTransport().equalsIgnoreCase(interfaceC12943b.getTransport())) {
                        Object objCreateMessageChannel = messageProcessor.createMessageChannel(byName, interfaceC12943b.getPort());
                        if (objCreateMessageChannel instanceof RawMessageChannel) {
                            final RawMessageChannel rawMessageChannel = (RawMessageChannel) objCreateMessageChannel;
                            getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.MessageChannel.1
                                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                                public Object getThreadHash() {
                                    return sIPMessage.getCallId().getCallId();
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                    } catch (Exception e10) {
                                        if (MessageChannel.logger.isLoggingEnabled(4)) {
                                            MessageChannel.logger.logError("Error self routing message cause by: ", e10);
                                        }
                                    }
                                }
                            });
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Self routing message");
                            }
                            messageTxId.remove();
                            if (logger.isLoggingEnabled(16)) {
                                logMessage(sIPMessage, byName, interfaceC12943b.getPort(), jCurrentTimeMillis);
                                return;
                            }
                            return;
                        }
                    }
                }
                messageTxId.set(sIPMessage.getTransactionId());
                sendMessage(sIPMessage.encodeAsBytes(getTransport()), byName, interfaceC12943b.getPort(), sIPMessage instanceof SIPRequest);
                sIPMessage.setRemoteAddress(byName);
                sIPMessage.setRemotePort(interfaceC12943b.getPort());
                sIPMessage.setLocalPort(getPort());
                sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
                messageTxId.remove();
                if (logger.isLoggingEnabled(16)) {
                    logMessage(sIPMessage, byName, interfaceC12943b.getPort(), jCurrentTimeMillis);
                }
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                if (logger.isLoggingEnabled(4)) {
                    logger.logError("Error self routing message cause by: ", e11);
                }
                throw new IOException("Error self routing message");
            }
        } catch (Throwable th2) {
            messageTxId.remove();
            if (!logger.isLoggingEnabled(16)) {
                throw th2;
            }
            logMessage(sIPMessage, byName, interfaceC12943b.getPort(), jCurrentTimeMillis);
            throw th2;
        }
    }

    public abstract void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z6);

    public void setEncapsulatedClientTransaction(SIPClientTransaction sIPClientTransaction) {
        this.encapsulatedClientTransaction = sIPClientTransaction;
    }

    public void uncache() {
    }

    public static String getKey(HostPort hostPort, String str) {
        String ipAddress = hostPort.getHost().getIpAddress();
        if (ipAddress == null) {
            ipAddress = hostPort.getHost().getHostname();
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, ":");
        sbM9895n.append(ipAddress.replaceAll("[\\[\\]]", ""));
        sbM9895n.append(":");
        sbM9895n.append(hostPort.getPort());
        return sbM9895n.toString().toLowerCase();
    }

    public void sendMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrEncodeAsBytes = sIPMessage.encodeAsBytes(getTransport());
        messageTxId.set(sIPMessage.getTransactionId());
        try {
            sendMessage(bArrEncodeAsBytes, inetAddress, i10, sIPMessage instanceof SIPRequest);
            messageTxId.remove();
            sIPMessage.setRemoteAddress(inetAddress);
            sIPMessage.setRemotePort(i10);
            sIPMessage.setLocalPort(getPort());
            sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
            logMessage(sIPMessage, inetAddress, i10, jCurrentTimeMillis);
        } catch (Throwable th2) {
            messageTxId.remove();
            throw th2;
        }
    }
}
