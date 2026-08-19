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
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;
import p315Me.Myis.CxcULo;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes.dex */
public class TCPMessageChannel extends ConnectionOrientedMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(TCPMessageChannel.class);
    protected OutputStream myClientOutputStream;

    public TCPMessageChannel(SIPTransactionStack sIPTransactionStack) {
        super(sIPTransactionStack);
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
                this.mySock = null;
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
        if (this.myClientOutputStream != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing client output stream " + this.myClientOutputStream);
            }
            try {
                this.myClientOutputStream.close();
            } catch (IOException e11) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Error closing client output stream" + e11);
                }
            }
        }
        if (z6) {
            String strSubstring = this.key.substring(4);
            if (logger.isLoggingEnabled(32)) {
                AbstractC10763a.m11065w("Closing TCP socket ", strSubstring, logger);
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
        return getClass().equals(obj.getClass()) && this.mySock == ((TCPMessageChannel) obj).mySock;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return "TCP";
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
            logger.logDebug("Encountered Bad Message \n" + sIPMessage.toString());
        }
        String string = sIPMessage.toString();
        if (string.startsWith("SIP/") || string.startsWith("ACK ") || this.mySock == null) {
            throw parseException;
        }
        if (logger.isLoggingEnabled(4)) {
            logger.logError("Malformed mandatory headers: closing socket! :" + this.mySock.toString());
        }
        try {
            this.mySock.close();
            throw parseException;
        } catch (IOException e10) {
            if (!logger.isLoggingEnabled(4)) {
                throw parseException;
            }
            logger.logError("Exception while closing socket! :" + this.mySock.toString() + ":" + e10.toString());
            throw parseException;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
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
                    socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), this.peerAddress, this.peerPort, this.peerProtocol, bArr, z6, this);
                    e = null;
                } catch (IOException e10) {
                    e = e10;
                    logger.logWarning(str5 + this.peerAddress + ":" + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
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
            if (logger.isLoggingEnabled(8)) {
                logger.logWarning(str6 + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
            }
            InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
            socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, this.peerProtocol, bArr, z6, this);
            int i10 = this.peerPortAdvertisedInHeaders;
            this.peerPort = i10;
            this.peerAddress = byName;
            this.key = MessageChannel.getKey(byName, i10, "TCP");
            if (logger.isLoggingEnabled(8)) {
                logger.logWarning(str7 + this.peerAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
            }
        }
        Socket socket = socketSendBytes;
        Socket socket2 = this.mySock;
        if (socket != socket2 && socket != null) {
            if (socket2 != null) {
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str8 + this.key);
                    logger.logStackTrace();
                    logger.logWarning("Old socket local ip address " + this.mySock.getLocalSocketAddress());
                    logger.logWarning("Old socket remote ip address " + this.mySock.getRemoteSocketAddress());
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
                this.myClientOutputStream = this.mySock.getOutputStream();
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

    public TCPMessageChannel(Socket socket, SIPTransactionStack sIPTransactionStack, TCPMessageProcessor tCPMessageProcessor, String str) {
        super(sIPTransactionStack);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TCPMessageChannel ");
            logger.logStackTrace();
        }
        this.mySock = socket;
        this.peerAddress = socket.getInetAddress();
        this.myAddress = tCPMessageProcessor.getIpAddress().getHostAddress();
        this.myClientInputStream = this.mySock.getInputStream();
        this.myClientOutputStream = this.mySock.getOutputStream();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.setName(str);
        int port = this.mySock.getPort();
        this.peerPort = port;
        this.key = MessageChannel.getKey(this.peerAddress, port, "TCP");
        this.myPort = tCPMessageProcessor.getPort();
        this.messageProcessor = tCPMessageProcessor;
        this.mythread.start();
    }

    public TCPMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, TCPMessageProcessor tCPMessageProcessor) {
        super(sIPTransactionStack);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug(CsqksqyPE.pvlJId);
            logger.logStackTrace();
        }
        this.peerAddress = inetAddress;
        this.peerPort = i10;
        this.myPort = tCPMessageProcessor.getPort();
        this.peerProtocol = "TCP";
        this.myAddress = tCPMessageProcessor.getIpAddress().getHostAddress();
        this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, "TCP");
        this.messageProcessor = tCPMessageProcessor;
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
                    str9 = "Couldn't connect to receiverAddress = ";
                    str4 = "New socket remote ip address ";
                    str6 = "retry suceeded to peerAddress = ";
                    str5 = "New socket local ip address ";
                    str7 = "Old socket different than new socket on channel ";
                    str = "Old socket local ip address ";
                    str2 = "Old socket remote ip address ";
                    try {
                        socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i10, "TCP", bArr, z6, this);
                        e = null;
                    } catch (IOException e10) {
                        e = e10;
                        logger.logWarning(((String) obj) + this.peerAddress + ":" + i10 + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                        logger.logError("Error is ", e);
                    }
                } catch (IOException e11) {
                    e = e11;
                    str = "Old socket local ip address ";
                    str2 = "Old socket remote ip address ";
                    str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                    str4 = "New socket remote ip address ";
                    str5 = "New socket local ip address ";
                    str6 = "retry suceeded to peerAddress = ";
                    str7 = "Old socket different than new socket on channel ";
                    str8 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                    str9 = "Couldn't connect to receiverAddress = ";
                }
                if (socketSendBytes == null) {
                    if (this.peerAddressAdvertisedInHeaders != null && this.peerPortAdvertisedInHeaders > 0) {
                        if (logger.isLoggingEnabled(8)) {
                            logger.logWarning(str9 + inetAddress + " receiverPort = " + i10 + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                        }
                        InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                        socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, "TCP", bArr, z6, this);
                        int i11 = this.peerPortAdvertisedInHeaders;
                        this.peerPort = i11;
                        this.peerAddress = byName;
                        this.key = MessageChannel.getKey(byName, i11, "TCP");
                        if (logger.isLoggingEnabled(8)) {
                            logger.logWarning(str6 + this.peerAddress + CxcULo.zErYbM + this.peerPort + " key = " + this.key);
                        }
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
                        this.myClientOutputStream = this.mySock.getOutputStream();
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
