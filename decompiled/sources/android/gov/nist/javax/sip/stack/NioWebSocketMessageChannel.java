package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicBoolean;
import p571X9.AbstractC9306j0;
import p691d.InterfaceC12945d;
import p713e.InterfaceC13208P;
import p713e.InterfaceC13231g0;
import p713e.InterfaceC13238l;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public class NioWebSocketMessageChannel extends NioTcpMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(NioWebSocketMessageChannel.class);
    boolean client;
    private WebSocketCodec codec;
    AtomicBoolean httpClientRequestSent;
    String httpHostHeader;
    String httpInput;
    String httpLocation;
    String httpMethod;
    boolean readingHttp;
    private SIPTransactionStack stack;

    public NioWebSocketMessageChannel(SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        super(nioTcpMessageProcessor, socketChannel);
        this.codec = new WebSocketCodec(true, true);
        this.readingHttp = true;
        this.httpInput = "";
        this.httpClientRequestSent = new AtomicBoolean(false);
        this.stack = sIPTransactionStack;
        this.messageProcessor = nioTcpMessageProcessor;
        this.myClientInputStream = socketChannel.socket().getInputStream();
    }

    public static byte[] wrapBufferIntoWebSocketFrame(byte[] bArr, boolean z6) {
        try {
            return WebSocketCodec.encode(bArr, 0, true, z6);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void addBytes(byte[] bArr) throws Throwable {
        String str = new String(bArr);
        boolean z6 = this.readingHttp;
        if (z6) {
            byte[] bArr2 = null;
            for (int i10 = 0; i10 < bArr.length - 3; i10++) {
                if (bArr[i10] == 13 && bArr[i10 + 1] == 10 && bArr[i10 + 2] == 13 && bArr[i10 + 3] == 10) {
                    int i11 = i10 + 4;
                    str = str.substring(0, i11);
                    int length = (bArr.length - i10) - 4;
                    byte[] bArr3 = new byte[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        bArr3[i12] = bArr[i11 + i12];
                    }
                    bArr2 = bArr3;
                }
            }
            this.httpInput = AbstractC9306j0.m9891j(this.httpInput, str, new StringBuilder());
            if (str.endsWith(Separators.NEWLINE) || str.endsWith(Separators.RETURN)) {
                this.readingHttp = false;
                if (this.httpInput.startsWith("HTTP")) {
                    logger.logDebug("HTTP Response. We are websocket client.\n" + this.httpInput);
                } else {
                    sendNonWebSocketMessage(new WebSocketHttpHandshake().createHttpResponse(str), false);
                }
            }
            if (bArr2 != null) {
                addBytes(bArr2);
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (true) {
            byte[] bArrDecode = this.codec.decode(byteArrayInputStream);
            if (this.codec.isCloseOpcodeReceived()) {
                logger.logDebug("Websocket close, sending polite close response");
                this.socketChannel.write(ByteBuffer.wrap(new byte[]{-120, 0}));
                return;
            } else {
                if (bArrDecode == null) {
                    return;
                }
                this.nioParser.addBytes(bArrDecode);
                logger.logDebug("Nio websocket bytes were added " + bArrDecode.length);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return this.messageProcessor.transport;
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void onNewSocket(byte[] bArr) {
        super.onNewSocket(bArr);
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel, android.gov.nist.javax.sip.parser.SIPMessageListener, android.gov.nist.javax.sip.stack.RawMessageChannel
    public void processMessage(SIPMessage sIPMessage) throws Exception {
        if (this.stack.isPatchWebSocketHeaders()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Patching WebSocket headers");
            }
            if (sIPMessage instanceof InterfaceC13461b) {
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) sIPMessage.getHeader(SIPHeaderNames.CONTACT);
                InterfaceC13208P interfaceC13208P = (InterfaceC13208P) sIPMessage.getHeader(SIPHeaderNames.RECORD_ROUTE);
                InterfaceC13231g0 topmostViaHeader = sIPMessage.getTopmostViaHeader();
                if (interfaceC13208P != null) {
                    rewriteUri((InterfaceC12945d) interfaceC13208P.getAddress().getURI());
                } else if (interfaceC13238l != null) {
                    rewriteUri((InterfaceC12945d) interfaceC13238l.getAddress().getURI());
                }
                if (topmostViaHeader.getHost().endsWith(".invalid")) {
                    topmostViaHeader.setHost(getPeerAddress());
                    topmostViaHeader.setPort(getPeerPort());
                }
            } else {
                InterfaceC13238l interfaceC13238l2 = (InterfaceC13238l) sIPMessage.getHeader(SIPHeaderNames.CONTACT);
                if (interfaceC13238l2 != null) {
                    rewriteUri((InterfaceC12945d) interfaceC13238l2.getAddress().getURI());
                }
            }
        }
        super.processMessage(sIPMessage);
    }

    public void rewriteUri(InterfaceC12945d interfaceC12945d) {
        try {
            if (interfaceC12945d.getHost().endsWith(".invalid")) {
                interfaceC12945d.setHost(getPeerAddress());
            }
        } catch (ParseException e10) {
            logger.logError("Cant parse address", e10);
        }
        interfaceC12945d.setPort(getPeerPort());
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void sendMessage(byte[] bArr, boolean z6) throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sendMessage isClient  = " + z6 + " this = " + this);
        }
        this.lastActivityTimeStamp = System.currentTimeMillis();
        NIOHandler nIOHandler = ((NioTcpMessageProcessor) this.messageProcessor).nioHandler;
        SocketChannel socketChannel = this.socketChannel;
        if (socketChannel != null && socketChannel.isConnected() && this.socketChannel.isOpen()) {
            nIOHandler.putSocket(NIOHandler.makeKey(this.peerAddress, this.peerPort), this.socketChannel);
        }
        sendWrapped(bArr, this.peerAddress, this.peerPort, z6);
    }

    public void sendNonWebSocketMessage(byte[] bArr, boolean z6) throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sendMessage isClient  = " + z6 + " this = " + this);
        }
        this.lastActivityTimeStamp = System.currentTimeMillis();
        NIOHandler nIOHandler = ((NioTcpMessageProcessor) this.messageProcessor).nioHandler;
        SocketChannel socketChannel = this.socketChannel;
        if (socketChannel != null && socketChannel.isConnected() && this.socketChannel.isOpen()) {
            nIOHandler.putSocket(NIOHandler.makeKey(this.peerAddress, this.peerPort), this.socketChannel);
        }
        super.sendTCPMessage(bArr, this.peerAddress, this.peerPort, z6);
    }

    public void sendWrapped(byte[] bArr, InetAddress inetAddress, int i10, boolean z6) throws Throwable {
        if (this.client && this.readingHttp && this.httpClientRequestSent.compareAndSet(false, true)) {
            super.sendTCPMessage("null null HTTP/1.1\r\nHost: null \r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n".getBytes(), inetAddress, i10, false);
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
        super.sendTCPMessage(wrapBufferIntoWebSocketFrame(bArr, this.client), inetAddress, i10, z6);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z6) throws Throwable {
        sendWrapped(bArr, inetAddress, i10, z6);
    }

    public NioWebSocketMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        super(inetAddress, i10, sIPTransactionStack, nioTcpMessageProcessor);
        this.codec = new WebSocketCodec(true, true);
        this.readingHttp = true;
        this.httpInput = "";
        this.httpClientRequestSent = new AtomicBoolean(false);
        this.client = true;
        this.stack = sIPTransactionStack;
        this.codec = new WebSocketCodec(false, true);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10) throws Throwable {
        if ((sIPMessage instanceof SIPRequest) && this.client && this.httpClientRequestSent.compareAndSet(false, true)) {
            InterfaceC12945d interfaceC12945d = (InterfaceC12945d) ((SIPRequest) sIPMessage).getRequestURI();
            this.httpHostHeader = interfaceC12945d.getHeader("Host");
            this.httpLocation = interfaceC12945d.getHeader("Location");
            this.httpMethod = interfaceC12945d.getMethodParam();
            super.sendTCPMessage((this.httpMethod + Separators.f31991SP + this.httpLocation + " HTTP/1.1\r\nHost: " + this.httpHostHeader + "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n").getBytes(), inetAddress, i10, false);
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
        super.sendMessage(sIPMessage, inetAddress, i10);
    }
}
