package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p379Pb.LVf.efyhmdM;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NIOHandler {
    private static StackLogger logger = CommonLogger.getLogger(NIOHandler.class);
    private NioTcpMessageProcessor messageProcessor;
    private SipStackImpl sipStack;
    protected SocketTimeoutAuditor socketTimeoutAuditor;
    private AtomicBoolean stopped = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, SocketChannel> socketTable = new ConcurrentHashMap<>();
    protected HashMap<SocketChannel, NioTcpMessageChannel> channelMap = new HashMap<>();
    KeyedSemaphore keyedSemaphore = new KeyedSemaphore();

    public NIOHandler(SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        this.socketTimeoutAuditor = null;
        this.sipStack = (SipStackImpl) sIPTransactionStack;
        this.messageProcessor = nioTcpMessageProcessor;
        if (sIPTransactionStack.nioSocketMaxIdleTime <= 0 || !(nioTcpMessageProcessor instanceof ConnectionOrientedMessageProcessor)) {
            return;
        }
        this.socketTimeoutAuditor = new SocketTimeoutAuditor(sIPTransactionStack.nioSocketMaxIdleTime, this);
        SipTimer timer = sIPTransactionStack.getTimer();
        SocketTimeoutAuditor socketTimeoutAuditor = this.socketTimeoutAuditor;
        long j10 = sIPTransactionStack.nioSocketMaxIdleTime;
        timer.scheduleWithFixedDelay(socketTimeoutAuditor, j10, j10);
    }

    public static String makeKey(InetAddress inetAddress, int i10) {
        return inetAddress.getHostAddress() + ":" + i10;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    private SocketChannel openOutgoingConnection(InetAddress inetAddress, InetAddress inetAddress2, int i10, boolean z6, String str) throws Throwable {
        boolean z10;
        boolean z11;
        SocketChannel socketChannelConnect;
        String str2 = str;
        char c9 = z6 ? (char) 2 : (char) 1;
        boolean z12 = false;
        try {
            this.keyedSemaphore.enterIOCriticalSection(str2);
            try {
                SocketChannel socket = getSocket(str2);
                if (socket != null && (!socket.isConnected() || !socket.isOpen())) {
                    if (!socket.isConnectionPending()) {
                        removeSocket(str2, false);
                        socket = null;
                    }
                }
                if (socket == null) {
                    if (c9 > 0 && socket == null) {
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("inaddr = " + inetAddress2);
                                logger.logDebug("port = " + i10);
                            }
                            try {
                                socket = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i10), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                putSocket(str2, socket);
                            } catch (SocketException e10) {
                                if (logger.isLoggingEnabled(16)) {
                                    logger.logInfo("Problem connecting " + inetAddress2 + Separators.f31991SP + i10 + Separators.f31991SP + inetAddress);
                                }
                                removeSocket(str2, false);
                                throw new SocketException(e10.getClass() + Separators.f31991SP + e10.getMessage() + Separators.f31991SP + e10.getCause() + " Problem connecting " + inetAddress2 + Separators.f31991SP + i10 + Separators.f31991SP + inetAddress);
                            }
                        } catch (IOException e11) {
                            e = e11;
                            z11 = true;
                            z10 = true;
                            try {
                                if (logger.isLoggingEnabled(16)) {
                                    logger.logInfo("Problem OpeningConn:  inAddr " + inetAddress2.getHostAddress() + " port = " + i10 + " retry " + z6);
                                }
                                removeSocket(str2, false);
                                if (z6) {
                                    logger.logError("IOException occured at ", e);
                                    throw e;
                                }
                                int i11 = i10 <= 0 ? SIPConstants.DEFAULT_PORT : i10;
                                String strMakeKey = makeKey(inetAddress2, i11);
                                try {
                                    SocketChannel socket2 = getSocket(strMakeKey);
                                    if (socket2 != null && socket2.isConnected() && socket2.isOpen()) {
                                        socketChannelConnect = socket2;
                                    } else {
                                        removeSocket(strMakeKey, false);
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("inaddr = " + inetAddress2 + " port = " + i11);
                                        }
                                        socketChannelConnect = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i11), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                        putSocket(strMakeKey, socketChannelConnect);
                                    }
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("sending to " + strMakeKey);
                                    }
                                    if (z11) {
                                        if (z10) {
                                            removeSocket(strMakeKey, true);
                                        }
                                        this.keyedSemaphore.leaveIOCriticalSection(strMakeKey);
                                    }
                                    return socketChannelConnect;
                                } catch (Throwable th2) {
                                    th = th2;
                                    str2 = strMakeKey;
                                    z12 = z11;
                                    if (z12) {
                                        if (z10) {
                                            removeSocket(str2, true);
                                        }
                                        this.keyedSemaphore.leaveIOCriticalSection(str2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z10 = true;
                            z12 = true;
                            if (z12) {
                                if (z10) {
                                    removeSocket(str2, true);
                                }
                                this.keyedSemaphore.leaveIOCriticalSection(str2);
                            }
                            throw th;
                        }
                    }
                    z12 = true;
                }
                if (z12) {
                    removeSocket(str2, true);
                }
                this.keyedSemaphore.leaveIOCriticalSection(str2);
                return socket;
            } catch (IOException e12) {
                e = e12;
                z10 = false;
                z11 = true;
            } catch (Throwable th5) {
                th = th5;
                z10 = false;
            }
        } catch (IOException e13) {
            e = e13;
            z11 = false;
            z10 = false;
        } catch (Throwable th6) {
            th = th6;
            z10 = false;
        }
    }

    private void removeSocket(String str, boolean z6) throws Throwable {
        boolean z10 = false;
        try {
            try {
                this.keyedSemaphore.enterIOCriticalSection(str);
                try {
                    SocketChannel socketChannelRemove = this.socketTable.remove(str);
                    if (logger.isLoggingEnabled(32)) {
                        boolean z11 = socketChannelRemove != null;
                        logger.logDebug("removed Socket for key " + str + ", removed:" + z11);
                    }
                    if (z6) {
                        this.keyedSemaphore.remove(str);
                        if (logger.isLoggingEnabled(32)) {
                            z10 = socketChannelRemove != null;
                            logger.logDebug("removed Semaphore for key " + str + ", removed:" + z10);
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    z10 = true;
                    if (logger.isLoggingEnabled(32)) {
                        logger.logError("Failed on putting socket", e);
                    }
                    if (!z10) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                    if (z10) {
                        this.keyedSemaphore.leaveIOCriticalSection(str);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
        this.keyedSemaphore.leaveIOCriticalSection(str);
    }

    private void writeChunks(SocketChannel socketChannel, byte[] bArr, int i10) {
        this.messageProcessor.send(socketChannel, bArr);
    }

    public void closeAll() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Closing " + this.socketTable.size() + " sockets from IOHandler");
        }
        Enumeration<SocketChannel> enumerationElements = this.socketTable.elements();
        while (enumerationElements.hasMoreElements()) {
            try {
                enumerationElements.nextElement().close();
            } catch (IOException unused) {
            }
        }
    }

    public SocketChannel createOrReuseSocket(InetAddress inetAddress, int i10) throws Throwable {
        SocketChannel socketChannelOpenOutgoingConnection = null;
        if (this.stopped.get()) {
            return null;
        }
        String strMakeKey = makeKey(inetAddress, i10);
        SocketChannel socket = getSocket(strMakeKey);
        if (socket == null || ((socket.isConnected() && socket.isOpen()) || socket.isConnectionPending())) {
            socketChannelOpenOutgoingConnection = socket;
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Channel disconnected " + socket);
        }
        if (socketChannelOpenOutgoingConnection == null) {
            socketChannelOpenOutgoingConnection = openOutgoingConnection(this.messageProcessor.getIpAddress(), inetAddress, i10, false, strMakeKey);
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Returning socket " + strMakeKey + " channel = " + socketChannelOpenOutgoingConnection);
        }
        return socketChannelOpenOutgoingConnection;
    }

    public int getCurrentChannelSize() {
        return this.channelMap.size();
    }

    public NioTcpMessageChannel getMessageChannel(SocketChannel socketChannel) {
        return this.channelMap.get(socketChannel);
    }

    public SocketChannel getSocket(String str) {
        return this.socketTable.get(str);
    }

    public void putMessageChannel(SocketChannel socketChannel, NioTcpMessageChannel nioTcpMessageChannel) {
        this.channelMap.put(socketChannel, nioTcpMessageChannel);
    }

    public void putSocket(String str, SocketChannel socketChannel) {
        if (this.stopped.get()) {
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("adding socket for key ", str, logger);
        }
        boolean z6 = false;
        try {
            try {
                this.keyedSemaphore.enterIOCriticalSection(str);
                z6 = true;
                this.socketTable.put(str, socketChannel);
            } catch (IOException e10) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logError("Failed on putting socket", e10);
                }
                if (!z6) {
                    return;
                }
            }
            this.keyedSemaphore.leaveIOCriticalSection(str);
        } catch (Throwable th2) {
            if (z6) {
                this.keyedSemaphore.leaveIOCriticalSection(str);
            }
            throw th2;
        }
    }

    public void removeMessageChannel(SocketChannel socketChannel) {
        this.channelMap.remove(socketChannel);
    }

    public SocketChannel sendBytes(InetAddress inetAddress, InetAddress inetAddress2, int i10, String str, byte[] bArr, boolean z6, NioTcpMessageChannel nioTcpMessageChannel) throws Throwable {
        boolean z10;
        if (this.stopped.get()) {
            return null;
        }
        int length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbM11058p = AbstractC10763a.m11058p("sendBytes ", str, " inAddr ");
            sbM11058p.append(inetAddress2.getHostAddress());
            sbM11058p.append(" port = ");
            sbM11058p.append(i10);
            sbM11058p.append(" length = ");
            sbM11058p.append(length);
            sbM11058p.append(" retry ");
            sbM11058p.append(z6);
            stackLogger.logDebug(sbM11058p.toString());
        }
        if (logger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            logger.logStackTrace(16);
        }
        String strMakeKey = makeKey(inetAddress2, i10);
        SocketChannel socket = getSocket(strMakeKey);
        SocketChannel socketChannelOpenOutgoingConnection = (socket == null || (socket.isConnected() && socket.isOpen()) || socket.isConnectionPending()) ? socket : null;
        if (socketChannelOpenOutgoingConnection == null) {
            socketChannelOpenOutgoingConnection = openOutgoingConnection(inetAddress, inetAddress2, i10, z6, strMakeKey);
            nioTcpMessageChannel.peerPort = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (socketChannelOpenOutgoingConnection != null) {
            if (z10 && (nioTcpMessageChannel instanceof NioTlsMessageChannel)) {
                NioTlsMessageChannel nioTlsMessageChannel = (NioTlsMessageChannel) nioTcpMessageChannel;
                nioTlsMessageChannel.setHandshakeCompletedListener(new HandshakeCompletedListenerImpl(nioTlsMessageChannel, socketChannelOpenOutgoingConnection));
            } else {
                writeChunks(socketChannelOpenOutgoingConnection, bArr, length);
            }
        }
        if (socketChannelOpenOutgoingConnection != null) {
            return socketChannelOpenOutgoingConnection;
        }
        if (logger.isLoggingEnabled(4)) {
            logger.logError(this.socketTable.toString());
            logger.logError("Could not connect to " + inetAddress2 + ":" + i10);
        }
        throw new IOException("Could not connect to " + inetAddress2 + ":" + i10);
    }

    public static String makeKey(String str, int i10) {
        return str + ":" + i10;
    }

    public void stop() {
        String str = efyhmdM.pSMIay;
        this.stopped.set(true);
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("keys to check for inactivity removal " + this.channelMap.keySet());
                logger.logDebug(str + this.socketTable.keySet());
            }
            Iterator<Map.Entry<SocketChannel, NioTcpMessageChannel>> it = this.channelMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<SocketChannel, NioTcpMessageChannel> next = it.next();
                SocketChannel key = next.getKey();
                NioTcpMessageChannel value = next.getValue();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("stop() : Removing socket " + value.key + " socketChannel = " + key);
                }
                value.close();
                this.channelMap.remove(key);
                it = this.channelMap.entrySet().iterator();
            }
        } catch (Exception unused) {
        }
    }

    public void removeSocket(SocketChannel socketChannel) throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Trying to remove cached socketChannel without key" + this + " socketChannel = " + socketChannel);
        }
        LinkedList<String> linkedList = new LinkedList();
        for (Map.Entry<String, SocketChannel> entry : this.socketTable.entrySet()) {
            if (entry.getValue().equals(socketChannel)) {
                linkedList.add(entry.getKey());
            }
        }
        for (String str : linkedList) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Removing cached socketChannel without key" + this + " socketChannel = " + socketChannel + " key = " + str);
            }
            removeSocket(str, true);
        }
    }
}
