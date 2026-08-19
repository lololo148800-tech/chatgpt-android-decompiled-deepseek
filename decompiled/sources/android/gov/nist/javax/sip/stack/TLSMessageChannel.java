package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import cn.UfGr.EhBykzn;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import p011A9.p012Ra.ahZQMZ;

/* JADX INFO: loaded from: classes.dex */
public class TLSMessageChannel extends ConnectionOrientedMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(TLSMessageChannel.class);
    private boolean handshakeCompleted;
    private HandshakeCompletedListener handshakeCompletedListener;

    public TLSMessageChannel(Socket socket, SIPTransactionStack sIPTransactionStack, TLSMessageProcessor tLSMessageProcessor, String str) {
        super(sIPTransactionStack);
        this.handshakeCompleted = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TLSMessageChannel (incoming)");
            logger.logStackTrace();
        }
        this.mySock = (SSLSocket) socket;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (sIPTransactionStack.getClientAuth() != ClientAuthType.Want && sIPTransactionStack.getClientAuth() != ClientAuthType.Disabled && sIPTransactionStack.getClientAuth() != ClientAuthType.DisabledAll) {
                sSLSocket.setNeedClientAuth(true);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SSLServerSocket need client auth " + sSLSocket.getNeedClientAuth());
            }
        }
        this.peerAddress = this.mySock.getInetAddress();
        this.myAddress = tLSMessageProcessor.getIpAddress().getHostAddress();
        this.myClientInputStream = this.mySock.getInputStream();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.setName(str);
        this.myPort = tLSMessageProcessor.getPort();
        int port = this.mySock.getPort();
        this.peerPort = port;
        this.key = MessageChannel.getKey(this.peerAddress, port, "TLS");
        this.messageProcessor = tLSMessageProcessor;
        this.mythread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void close(boolean z6, boolean z10) {
        this.isRunning = false;
        if (this.mySock != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing socket " + this.key);
            }
            try {
                this.mySock.close();
            } catch (IOException e10) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Error closing socket " + e10);
                }
            }
        }
        if (this.myParser != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing my parser " + this.myParser);
            }
            this.myParser.close();
        }
        if (z6) {
            String strSubstring = this.key.substring(4);
            if (logger.isLoggingEnabled(32)) {
                AbstractC10763a.m11065w("Closing TLS socket ", strSubstring, logger);
            }
            this.sipStack.ioHandler.removeSocket(strSubstring);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing message Channel (key = " + this.key + Separators.RPAREN + this);
            }
        } else if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("not removing socket key from the cached map since it has already been updated by the iohandler.sendBytes ", this.key.substring(4), logger);
        }
        if (z10) {
            cancelPingKeepAliveTimeoutTaskIfStarted();
        }
    }

    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.mySock == ((TLSMessageChannel) obj).mySock;
    }

    public HandshakeCompletedListenerImpl getHandshakeCompletedListener() {
        return (HandshakeCompletedListenerImpl) this.handshakeCompletedListener;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return "TLS";
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) throws ParseException {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Parsing Exception: ", parseException);
        }
        if (cls == null || !(cls.equals(From.class) || cls.equals(C10766To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            sIPMessage.addUnparsed(str);
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("Encountered bad message \n", str2, logger);
        }
        String string = sIPMessage.toString();
        if (string.startsWith("SIP/") || string.startsWith("ACK ")) {
            throw parseException;
        }
        String strCreateBadReqRes = createBadReqRes(string, parseException);
        if (strCreateBadReqRes == null) {
            if (!logger.isLoggingEnabled(32)) {
                throw parseException;
            }
            logger.logDebug("Could not formulate automatic 400 Bad Request");
            throw parseException;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Sending automatic 400 Bad Request:");
            logger.logDebug(strCreateBadReqRes);
        }
        try {
            sendMessage(strCreateBadReqRes.getBytes(), getPeerInetAddress(), getPeerPort(), false);
            throw parseException;
        } catch (IOException e10) {
            logger.logException(e10);
            throw parseException;
        }
    }

    public boolean isHandshakeCompleted() {
        return this.handshakeCompleted;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel, java.lang.Runnable
    public void run() {
        Socket socket = this.mySock;
        if (socket != null && (socket instanceof SSLSocket) && !this.handshakeCompleted) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl(this, sSLSocket);
            this.handshakeCompletedListener = handshakeCompletedListenerImpl;
            sSLSocket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
            handshakeCompletedListenerImpl.startHandshakeWatchdog();
            try {
                sSLSocket.startHandshake();
                this.handshakeCompleted = true;
                if (!getSIPStack().isSslRenegotiationEnabled()) {
                    sSLSocket.getSession().invalidate();
                    sSLSocket.setEnableSessionCreation(false);
                }
            } catch (IOException e10) {
                logger.logError("A problem occured while Accepting connection", e10);
                sSLSocket.removeHandshakeCompletedListener(this.handshakeCompletedListener);
                this.handshakeCompletedListener = null;
                try {
                    this.myClientInputStream.close();
                } catch (IOException unused) {
                } finally {
                    this.myClientInputStream = null;
                }
                try {
                    this.mySock.close();
                } catch (IOException unused2) {
                } finally {
                    this.mySock = null;
                }
                return;
            }
        }
        super.run();
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public synchronized void sendMessage(byte[] bArr, boolean z6) throws IOException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = ahZQMZ.bVCDZpOKW;
        synchronized (this) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("sendMessage isClient  = " + z6);
            }
            Socket socketSendBytes = null;
            try {
                try {
                    str = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                    str5 = "Failed to connect ";
                    str2 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                    str6 = "Couldn't connect to peerAddress = ";
                    str3 = "New socket remote ip address ";
                    str7 = "retry suceeded to peerAddress = ";
                    str4 = "New socket local ip address ";
                    str8 = "Old socket different than new socket on channel ";
                    try {
                        socketSendBytes = this.sipStack.ioHandler.sendBytes(getMessageProcessor().getIpAddress(), this.peerAddress, this.peerPort, this.peerProtocol, bArr, z6, this);
                        e = null;
                    } catch (IOException e10) {
                        e = e10;
                        logger.logWarning(str5 + this.peerAddress + ":" + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                        logger.logError("Error is ", e);
                    }
                } catch (IOException e11) {
                    e = e11;
                    str = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                    str3 = "New socket remote ip address ";
                    str4 = "New socket local ip address ";
                    str5 = "Failed to connect ";
                    str7 = "retry suceeded to peerAddress = ";
                    str8 = "Old socket different than new socket on channel ";
                    str2 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                    str6 = "Couldn't connect to peerAddress = ";
                }
            } catch (IOException e12) {
                e = e12;
                str = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                str2 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                str3 = "New socket remote ip address ";
                str4 = "New socket local ip address ";
                str5 = "Failed to connect ";
                str6 = "Couldn't connect to peerAddress = ";
                str7 = "retry suceeded to peerAddress = ";
                str8 = "Old socket different than new socket on channel ";
            }
            if (socketSendBytes == null) {
                if (this.peerAddressAdvertisedInHeaders == null || this.peerPortAdvertisedInHeaders <= 0) {
                    throw e;
                }
                logger.logWarning(str6 + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, this.peerProtocol, bArr, z6, this);
                int i10 = this.peerPortAdvertisedInHeaders;
                this.peerPort = i10;
                this.peerAddress = byName;
                this.key = MessageChannel.getKey(byName, i10, "TLS");
                logger.logWarning(str7 + this.peerAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
            }
            Socket socket = socketSendBytes;
            Socket socket2 = this.mySock;
            if (socket != socket2 && socket != null) {
                if (socket2 != null) {
                    if (logger.isLoggingEnabled(8)) {
                        logger.logWarning(str8 + this.key);
                        logger.logStackTrace();
                        logger.logWarning("Old socket local ip address " + this.mySock.getLocalSocketAddress());
                        logger.logWarning(str9 + this.mySock.getRemoteSocketAddress());
                        logger.logWarning(str4 + socket.getLocalSocketAddress());
                        logger.logWarning(str3 + socket.getRemoteSocketAddress());
                    }
                    close(false, false);
                }
                if (e == null) {
                    if (this.mySock != null && logger.isLoggingEnabled(8)) {
                        logger.logWarning(str2 + this.key);
                    }
                    this.mySock = socket;
                    this.myClientInputStream = socket.getInputStream();
                    Thread thread = new Thread(this);
                    thread.setDaemon(true);
                    thread.setName("TCPMessageChannelThread");
                    thread.start();
                } else {
                    if (logger.isLoggingEnabled(8)) {
                        logger.logWarning(str + this.key);
                    }
                    this.mySock = socket;
                }
            }
        }
    }

    public void setHandshakeCompleted(boolean z6) {
        this.handshakeCompleted = z6;
    }

    public void setHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.handshakeCompletedListener = handshakeCompletedListener;
    }

    public TLSMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, TLSMessageProcessor tLSMessageProcessor) {
        super(sIPTransactionStack);
        this.handshakeCompleted = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TLSMessageChannel (outgoing)");
            logger.logStackTrace();
        }
        this.peerAddress = inetAddress;
        this.peerPort = i10;
        this.myPort = tLSMessageProcessor.getPort();
        this.peerProtocol = "TLS";
        this.sipStack = sIPTransactionStack;
        this.myAddress = tLSMessageProcessor.getIpAddress().getHostAddress();
        this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, "TLS");
        this.messageProcessor = tLSMessageProcessor;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public synchronized void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z6) throws IOException {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = EhBykzn.vjfSIhWWxLBigy;
        synchronized (this) {
            try {
                if (bArr != null && inetAddress != null) {
                    if (this.peerPortAdvertisedInHeaders <= 0) {
                        obj = "Failed to connect ";
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("receiver port = " + i10 + " for this channel " + this + " key " + this.key);
                        }
                        if (i10 <= 0) {
                            this.peerPortAdvertisedInHeaders = SIPConstants.DEFAULT_PORT;
                        } else {
                            this.peerPortAdvertisedInHeaders = i10;
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("2.Storing peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " for this channel " + this + " key " + this.key);
                        }
                    } else {
                        obj = "Failed to connect ";
                    }
                    Socket socketSendBytes = null;
                    try {
                        str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                        str8 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                        str9 = str10;
                        str4 = "New socket remote ip address ";
                        str6 = "retry suceeded to receiverAddress = ";
                        str5 = "New socket local ip address ";
                        str7 = "Old socket different than new socket on channel ";
                        str = "Old socket local ip address ";
                        str2 = "Old socket remote ip address ";
                        try {
                            socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i10, "TLS", bArr, z6, this);
                            e = null;
                        } catch (IOException e10) {
                            e = e10;
                            logger.logWarning(((String) obj) + this.peerAddress + ":" + i10 + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on, rcv addr=" + inetAddress + ", port=" + i10);
                            logger.logError("Error is ", e);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        str = "Old socket local ip address ";
                        str2 = "Old socket remote ip address ";
                        str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                        str4 = "New socket remote ip address ";
                        str5 = "New socket local ip address ";
                        str6 = "retry suceeded to receiverAddress = ";
                        str7 = "Old socket different than new socket on channel ";
                        str8 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                        str9 = str10;
                    }
                    if (socketSendBytes == null) {
                        if (this.peerAddressAdvertisedInHeaders != null && this.peerPortAdvertisedInHeaders > 0) {
                            logger.logWarning(str9 + inetAddress + " receiverPort = " + i10 + " key = " + this.key + wNrQXvwLiB.fpaHnYUOO + this.peerPortAdvertisedInHeaders);
                            InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                            socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, "TLS", bArr, z6, this);
                            int i11 = this.peerPortAdvertisedInHeaders;
                            this.peerPort = i11;
                            this.peerAddress = byName;
                            this.key = MessageChannel.getKey(byName, i11, "TLS");
                            logger.logWarning(str6 + inetAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
                        } else {
                            throw e;
                        }
                    }
                    Socket socket = socketSendBytes;
                    Socket socket2 = this.mySock;
                    if (socket != socket2 && socket != null) {
                        if (socket2 != null) {
                            if (logger.isLoggingEnabled(8)) {
                                logger.logWarning(str7 + this.key);
                                logger.logStackTrace();
                                logger.logWarning(str + this.mySock.getLocalSocketAddress());
                                logger.logWarning(str2 + this.mySock.getRemoteSocketAddress());
                                logger.logWarning(str5 + socket.getLocalSocketAddress());
                                logger.logWarning(str4 + socket.getRemoteSocketAddress());
                            }
                            close(false, false);
                        }
                        if (e == null) {
                            if (this.mySock != null && logger.isLoggingEnabled(8)) {
                                logger.logWarning(str8 + this.key);
                            }
                            this.mySock = socket;
                            this.myClientInputStream = socket.getInputStream();
                            Thread thread = new Thread(this);
                            thread.setDaemon(true);
                            thread.setName("TCPMessageChannelThread");
                            thread.start();
                        } else {
                            if (logger.isLoggingEnabled(8)) {
                                logger.logWarning(str3 + this.key);
                            }
                            this.mySock = socket;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Null argument");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
