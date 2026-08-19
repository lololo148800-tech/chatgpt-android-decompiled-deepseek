package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.SipStackImpl;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class IOHandler {
    private static final String TCP = "tcp";
    private static final String TLS = "tls";
    private static StackLogger logger = CommonLogger.getLogger(IOHandler.class);
    private SipStackImpl sipStack;
    private final ConcurrentHashMap<String, Socket> socketTable = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Semaphore> socketCreationMap = new ConcurrentHashMap<>();

    public IOHandler(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = (SipStackImpl) sIPTransactionStack;
    }

    private void leaveIOCriticalSection(String str) {
        Semaphore semaphore = this.socketCreationMap.get(str);
        if (semaphore != null) {
            semaphore.release();
        }
    }

    public static String makeKey(InetAddress inetAddress, int i10) {
        return inetAddress.getHostAddress() + ":" + i10;
    }

    private void writeChunks(OutputStream outputStream, byte[] bArr, int i10) throws IOException {
        synchronized (outputStream) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 8192;
                try {
                    outputStream.write(bArr, i11, i12 < i10 ? 8192 : i10 - i11);
                    i11 = i12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        outputStream.flush();
    }

    public void closeAll() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Closing " + this.socketTable.size() + " sockets from IOHandler");
        }
        Enumeration<Socket> enumerationElements = this.socketTable.elements();
        while (enumerationElements.hasMoreElements()) {
            try {
                enumerationElements.nextElement().close();
            } catch (IOException unused) {
            }
        }
    }

    public SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        String strMakeKey = makeKey(inetAddress, i10);
        Socket socket = getSocket(strMakeKey);
        if (socket == null) {
            socket = this.sipStack.getNetworkLayer().createSocket(inetAddress, i10, inetAddress2, i11);
            putSocket(strMakeKey, socket);
        }
        return socket.getLocalSocketAddress();
    }

    public SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, TLSMessageChannel tLSMessageChannel) throws IOException {
        String strMakeKey = makeKey(inetAddress, i10);
        Socket socket = getSocket(strMakeKey);
        Socket socket2 = socket;
        if (socket == null) {
            SSLSocket sSLSocketCreateSSLSocket = this.sipStack.getNetworkLayer().createSSLSocket(inetAddress, i10, inetAddress2);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("inaddr = " + inetAddress);
                logger.logDebug("port = " + i10);
            }
            HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl(tLSMessageChannel, sSLSocketCreateSSLSocket);
            tLSMessageChannel.setHandshakeCompletedListener(handshakeCompletedListenerImpl);
            sSLSocketCreateSSLSocket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
            sSLSocketCreateSSLSocket.setEnabledProtocols(this.sipStack.getEnabledProtocols());
            sSLSocketCreateSSLSocket.setEnabledCipherSuites(this.sipStack.getEnabledCipherSuites());
            handshakeCompletedListenerImpl.startHandshakeWatchdog();
            sSLSocketCreateSSLSocket.startHandshake();
            tLSMessageChannel.setHandshakeCompleted(true);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Handshake passed");
            }
            try {
                this.sipStack.getTlsSecurityPolicy().enforceTlsPolicy(tLSMessageChannel.getEncapsulatedClientTransaction());
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("TLS Security policy passed");
                }
                putSocket(strMakeKey, sSLSocketCreateSSLSocket);
                socket2 = sSLSocketCreateSSLSocket;
            } catch (SecurityException e10) {
                throw new IOException(e10.getMessage());
            }
        }
        return socket2.getLocalSocketAddress();
    }

    public Socket getSocket(String str) {
        return this.socketTable.get(str);
    }

    public void putSocket(String str, Socket socket) {
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("adding socket for key ", str, logger);
        }
        this.socketTable.put(str, socket);
    }

    public void removeSocket(String str) {
        this.socketTable.remove(str);
        Semaphore semaphoreRemove = this.socketCreationMap.remove(str);
        if (semaphoreRemove != null) {
            semaphoreRemove.release();
        }
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("removed Socket and Semaphore for key ", str, logger);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x03c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0201 A[Catch: all -> 0x00df, TryCatch #14 {all -> 0x00df, blocks: (B:18:0x00a0, B:22:0x00ac, B:24:0x00b6, B:29:0x00e6, B:30:0x00f0, B:32:0x00fa, B:34:0x011d, B:37:0x012c, B:38:0x01a6, B:39:0x01a7, B:43:0x01b2, B:45:0x01be, B:46:0x01d4, B:50:0x01dd, B:51:0x01e1, B:53:0x01f0, B:54:0x01f3, B:56:0x01f8, B:58:0x0201, B:59:0x0257), top: B:130:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0261  */
    /* JADX WARN: Code duplicated, block: B:64:0x026a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0291  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ad A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:114:0x03c7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0201, please report this as an issue */
    public Socket sendBytes(InetAddress inetAddress, InetAddress inetAddress2, int i10, String str, byte[] bArr, boolean z6, MessageChannel messageChannel) throws IOException {
        Socket socket;
        Socket socket2;
        String str2;
        String str3;
        byte[] bArr2 = bArr;
        String str4 = " for message ";
        String str5 = Separators.f31991SP;
        int i11 = z6 ? 2 : 1;
        int length = bArr2.length;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbM11058p = AbstractC10763a.m11058p("sendBytes ", str, " local inAddr ");
            sbM11058p.append(inetAddress.getHostAddress());
            sbM11058p.append(" remote inAddr ");
            sbM11058p.append(inetAddress2.getHostAddress());
            sbM11058p.append(" port = ");
            sbM11058p.append(i10);
            sbM11058p.append(" length = ");
            sbM11058p.append(length);
            sbM11058p.append(" isClient ");
            sbM11058p.append(z6);
            stackLogger.logDebug(sbM11058p.toString());
        }
        if (logger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            logger.logStackTrace(16);
        }
        Socket socket3 = null;
        if (str.compareToIgnoreCase("tcp") != 0) {
            if (str.compareToIgnoreCase("tls") != 0) {
                DatagramSocket datagramSocketCreateDatagramSocket = this.sipStack.getNetworkLayer().createDatagramSocket();
                datagramSocketCreateDatagramSocket.connect(inetAddress2, i10);
                datagramSocketCreateDatagramSocket.send(new DatagramPacket(bArr, 0, length, inetAddress2, i10));
                datagramSocketCreateDatagramSocket.close();
                return null;
            }
            String strMakeKey = makeKey(inetAddress2, i10);
            enterIOCriticalSection(strMakeKey);
            try {
                try {
                    try {
                        socket = getSocket(strMakeKey);
                        int i12 = 0;
                        while (i12 < i11) {
                            if (socket == null) {
                                SSLSocket sSLSocketCreateSSLSocket = this.sipStack.getNetworkLayer().createSSLSocket(inetAddress2, i10, inetAddress);
                                try {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("inaddr = " + inetAddress2);
                                        logger.logDebug("port = " + i10);
                                    }
                                    HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl((TLSMessageChannel) messageChannel, sSLSocketCreateSSLSocket);
                                    ((TLSMessageChannel) messageChannel).setHandshakeCompletedListener(handshakeCompletedListenerImpl);
                                    sSLSocketCreateSSLSocket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
                                    sSLSocketCreateSSLSocket.setEnabledProtocols(this.sipStack.getEnabledProtocols());
                                    handshakeCompletedListenerImpl.startHandshakeWatchdog();
                                    sSLSocketCreateSSLSocket.startHandshake();
                                    ((TLSMessageChannel) messageChannel).setHandshakeCompleted(true);
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Handshake passed");
                                    }
                                    try {
                                        this.sipStack.getTlsSecurityPolicy().enforceTlsPolicy(messageChannel.getEncapsulatedClientTransaction());
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("TLS Security policy passed");
                                        }
                                        writeChunks(sSLSocketCreateSSLSocket.getOutputStream(), bArr, length);
                                        putSocket(strMakeKey, sSLSocketCreateSSLSocket);
                                        socket = sSLSocketCreateSSLSocket;
                                        break;
                                    } catch (SecurityException e10) {
                                        throw new IOException(e10.getMessage());
                                    }
                                } catch (IOException unused) {
                                    socket3 = sSLSocketCreateSSLSocket;
                                    removeSocket(strMakeKey);
                                    leaveIOCriticalSection(strMakeKey);
                                    socket = socket3;
                                }
                            } else {
                                try {
                                    writeChunks(socket.getOutputStream(), bArr, length);
                                    break;
                                } catch (IOException e11) {
                                    try {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logException(e11);
                                        }
                                        removeSocket(strMakeKey);
                                        try {
                                            logger.logDebug("Closing socket");
                                            socket.close();
                                        } catch (Exception unused2) {
                                        }
                                        i12++;
                                        socket = null;
                                    } catch (IOException unused3) {
                                        socket3 = socket;
                                        removeSocket(strMakeKey);
                                        leaveIOCriticalSection(strMakeKey);
                                        socket = socket3;
                                        if (socket != null) {
                                            return socket;
                                        }
                                        throw new IOException("Could not connect to " + inetAddress2 + ":" + i10);
                                    }
                                }
                            }
                        }
                        leaveIOCriticalSection(strMakeKey);
                    } catch (SSLHandshakeException e12) {
                        removeSocket(strMakeKey);
                        throw e12;
                    }
                } catch (IOException unused4) {
                }
                if (socket != null) {
                    return socket;
                }
                throw new IOException("Could not connect to " + inetAddress2 + ":" + i10);
            } catch (Throwable th2) {
                leaveIOCriticalSection(strMakeKey);
                throw th2;
            }
        }
        String strMakeKey2 = makeKey(inetAddress2, i10);
        enterIOCriticalSection(strMakeKey2);
        try {
            try {
                socket2 = getSocket(strMakeKey2);
                int i13 = 0;
                while (i13 < i11) {
                    if (socket2 != null) {
                        try {
                            writeChunks(socket2.getOutputStream(), bArr2, length);
                            break;
                        } catch (IOException e13) {
                            String str6 = str4;
                            try {
                                String str7 = str5;
                                if (logger.isLoggingEnabled(8)) {
                                    logger.logWarning("IOException occured retryCount " + i13);
                                }
                                try {
                                    socket2.close();
                                } catch (Exception unused5) {
                                }
                                i13++;
                                if (!z6) {
                                    removeSocket(strMakeKey2);
                                    throw e13;
                                }
                                if (i13 >= i11) {
                                    removeSocket(strMakeKey2);
                                } else {
                                    this.socketTable.remove(strMakeKey2);
                                }
                                bArr2 = bArr;
                                socket2 = null;
                                str4 = str6;
                                str5 = str7;
                            } catch (IOException unused6) {
                                socket3 = socket2;
                                if (logger.isLoggingEnabled(4)) {
                                    logger.logError("Problem sending: sendBytes " + str + " inAddr " + inetAddress2.getHostAddress() + " port = " + i10 + " remoteHost " + messageChannel.getPeerAddress() + " remotePort " + messageChannel.getPeerPort() + " peerPacketPort " + messageChannel.getPeerPacketSourcePort() + " isClient " + z6);
                                }
                                removeSocket(strMakeKey2);
                                leaveIOCriticalSection(strMakeKey2);
                                socket2 = socket3;
                                if (socket2 != null) {
                                    return socket2;
                                }
                                if (logger.isLoggingEnabled(4)) {
                                    logger.logError(this.socketTable.toString());
                                    StackLogger stackLogger2 = logger;
                                    str3 = "Could not connect to ";
                                    StringBuilder sb2 = new StringBuilder(str3);
                                    sb2.append(inetAddress2);
                                    str2 = ":";
                                    sb2.append(str2);
                                    sb2.append(i10);
                                    stackLogger2.logError(sb2.toString());
                                } else {
                                    str2 = ":";
                                    str3 = "Could not connect to ";
                                }
                                throw new IOException(str3 + inetAddress2 + str2 + i10);
                            }
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError("Problem sending: sendBytes " + str + " inAddr " + inetAddress2.getHostAddress() + " port = " + i10 + " remoteHost " + messageChannel.getPeerAddress() + " remotePort " + messageChannel.getPeerPort() + " peerPacketPort " + messageChannel.getPeerPacketSourcePort() + " isClient " + z6);
                            }
                            removeSocket(strMakeKey2);
                            leaveIOCriticalSection(strMakeKey2);
                            socket2 = socket3;
                            if (socket2 != null) {
                                return socket2;
                            }
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError(this.socketTable.toString());
                                StackLogger stackLogger3 = logger;
                                str3 = "Could not connect to ";
                                StringBuilder sb3 = new StringBuilder(str3);
                                sb3.append(inetAddress2);
                                str2 = ":";
                                sb3.append(str2);
                                sb3.append(i10);
                                stackLogger3.logError(sb3.toString());
                            } else {
                                str2 = ":";
                                str3 = "Could not connect to ";
                            }
                            throw new IOException(str3 + inetAddress2 + str2 + i10);
                        }
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("inaddr = " + inetAddress2);
                        logger.logDebug("port = " + i10);
                    }
                    try {
                        Socket socketCreateSocket = this.sipStack.getNetworkLayer().createSocket(inetAddress2, i10, inetAddress);
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("local inaddr = " + socketCreateSocket.getLocalAddress().getHostAddress());
                            }
                            writeChunks(socketCreateSocket.getOutputStream(), bArr2, length);
                            putSocket(strMakeKey2, socketCreateSocket);
                            socket2 = socketCreateSocket;
                            break;
                        } catch (IOException unused7) {
                            socket3 = socketCreateSocket;
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError("Problem sending: sendBytes " + str + " inAddr " + inetAddress2.getHostAddress() + " port = " + i10 + " remoteHost " + messageChannel.getPeerAddress() + " remotePort " + messageChannel.getPeerPort() + " peerPacketPort " + messageChannel.getPeerPacketSourcePort() + " isClient " + z6);
                            }
                            removeSocket(strMakeKey2);
                            leaveIOCriticalSection(strMakeKey2);
                            socket2 = socket3;
                        }
                    } catch (SocketException e14) {
                        logger.logError("Problem connecting " + inetAddress2 + str5 + i10 + str5 + inetAddress + str4 + new String(bArr2, "UTF-8"));
                        removeSocket(strMakeKey2);
                        throw new SocketException(e14.getClass() + str5 + e14.getMessage() + str5 + e14.getCause() + " Problem connecting " + inetAddress2 + str5 + i10 + str5 + inetAddress + str4 + new String(bArr2, "UTF-8"));
                    }
                }
                leaveIOCriticalSection(strMakeKey2);
            } catch (IOException unused8) {
            }
            if (socket2 != null) {
                return socket2;
            }
            if (logger.isLoggingEnabled(4)) {
                logger.logError(this.socketTable.toString());
                StackLogger stackLogger4 = logger;
                str3 = "Could not connect to ";
                StringBuilder sb4 = new StringBuilder(str3);
                sb4.append(inetAddress2);
                str2 = ":";
                sb4.append(str2);
                sb4.append(i10);
                stackLogger4.logError(sb4.toString());
            } else {
                str2 = ":";
                str3 = "Could not connect to ";
            }
            throw new IOException(str3 + inetAddress2 + str2 + i10);
        } catch (Throwable th3) {
            leaveIOCriticalSection(strMakeKey2);
            throw th3;
        }
    }

    private void enterIOCriticalSection(String str) throws IOException {
        String str2 = MMVKXkcLpuHFDi.OXaJr;
        Semaphore semaphore = this.socketCreationMap.get(str);
        if (semaphore == null) {
            semaphore = new Semaphore(1, true);
            Semaphore semaphorePutIfAbsent = this.socketCreationMap.putIfAbsent(str, semaphore);
            if (semaphorePutIfAbsent != null) {
                semaphore = semaphorePutIfAbsent;
            } else if (logger.isLoggingEnabled(32)) {
                AbstractC10763a.m11065w("new Semaphore added for key ", str, logger);
            }
        }
        try {
            if (semaphore.tryAcquire(10L, TimeUnit.SECONDS)) {
                return;
            }
            throw new IOException(str2 + str + "' after 10 seconds -- giving up ");
        } catch (InterruptedException unused) {
            throw new IOException("exception in acquiring sem");
        }
    }

    public static String makeKey(String str, int i10) {
        return str + ":" + i10;
    }
}
