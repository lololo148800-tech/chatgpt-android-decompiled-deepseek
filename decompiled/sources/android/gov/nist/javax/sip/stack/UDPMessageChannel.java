package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.MessageParser;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import p138F8.vJO.vRJidSveZHcTw;
import p160G5.p161rK.TVCuK;
import p691d.InterfaceC12943b;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: loaded from: classes.dex */
public class UDPMessageChannel extends MessageChannel implements ParseExceptionListener, Runnable, RawMessageChannel {
    private static final StackLogger logger = CommonLogger.getLogger(UDPMessageChannel.class);
    private static Hashtable<String, PingBackTimerTask> pingBackRecord = new Hashtable<>();
    private DatagramPacket incomingPacket;
    private String myAddress;
    protected MessageParser myParser;
    protected int myPort;
    private Thread mythread;
    private InetAddress peerAddress;
    private InetAddress peerPacketSourceAddress;
    private int peerPacketSourcePort;
    private int peerPort;
    private String peerProtocol;
    private long receptionTime;
    protected SIPTransactionStack sipStack;

    public class PingBackTimerTask extends SIPStackTimerTask {
        String ipAddress;
        int port;

        public PingBackTimerTask(String str, int i10) {
            this.ipAddress = str;
            this.port = i10;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        public int hashCode() {
            return (this.ipAddress + ":" + this.port).hashCode();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            UDPMessageChannel.pingBackRecord.remove(this.ipAddress + ":" + this.port);
        }
    }

    public UDPMessageChannel(SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor, String str) {
        this.mythread = null;
        this.messageProcessor = uDPMessageProcessor;
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(this.sipStack);
        this.mythread = new Thread(this);
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        this.mythread.setName(str);
        this.mythread.setDaemon(true);
        this.mythread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void close() {
        Thread thread = this.mythread;
        if (thread != null) {
            thread.interrupt();
            this.mythread = null;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            return getKey().equals(((UDPMessageChannel) obj).getKey());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getHost() {
        return this.messageProcessor.getIpAddress().getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getKey() {
        return MessageChannel.getKey(this.peerAddress, this.peerPort, "UDP");
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerAddress() {
        return this.peerAddress.getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerInetAddress() {
        return this.peerAddress;
    }

    public String getPeerName() {
        return this.peerAddress.getHostName();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerPacketSourceAddress() {
        return this.peerPacketSourceAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPacketSourcePort() {
        return this.peerPacketSourcePort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPort() {
        return this.peerPort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerProtocol() {
        return this.peerProtocol;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPort() {
        return ((UDPMessageProcessor) this.messageProcessor).getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return ParameterNames.UDP;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getViaHost() {
        return this.myAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getViaPort() {
        return this.myPort;
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) throws ParseException {
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("Parsing Issue " + parseException.getMessage());
        }
        if (cls == null || !(cls.equals(From.class) || cls.equals(C10766To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            sIPMessage.addUnparsed(str);
        } else {
            if (!stackLogger.isLoggingEnabled(32)) {
                throw parseException;
            }
            AbstractC10763a.m11065w("BAD MESSAGE! ", str2, stackLogger);
            throw parseException;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isReliable() {
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[Catch: InterruptedException -> 0x0049, TryCatch #2 {InterruptedException -> 0x0049, blocks: (B:12:0x0026, B:14:0x002e, B:16:0x003a, B:19:0x0053, B:24:0x005b, B:18:0x004b), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0006 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        DatagramPacket datagramPacket;
        DatagramQueuedMessageDispatch datagramQueuedMessageDispatchPoll;
        UDPMessageProcessor uDPMessageProcessor = (UDPMessageProcessor) this.messageProcessor;
        ThreadAuditor.ThreadHandle threadHandleAddCurrentThread = null;
        while (true) {
            SIPTransactionStack sIPTransactionStack = this.sipStack;
            try {
                if (sIPTransactionStack.threadPoolSize != -1) {
                    if (threadHandleAddCurrentThread == null && sIPTransactionStack.getThreadAuditor() != null) {
                        threadHandleAddCurrentThread = this.sipStack.getThreadAuditor().addCurrentThread();
                    }
                    if (threadHandleAddCurrentThread != null) {
                        threadHandleAddCurrentThread.ping();
                    }
                    if (threadHandleAddCurrentThread != null) {
                        try {
                            if (this.sipStack.getThreadAuditor() == null || !this.sipStack.getThreadAuditor().isEnabled()) {
                                datagramQueuedMessageDispatchPoll = uDPMessageProcessor.messageQueue.take();
                            } else {
                                datagramQueuedMessageDispatchPoll = uDPMessageProcessor.messageQueue.poll(threadHandleAddCurrentThread.getPingIntervalInMillisecs(), TimeUnit.MILLISECONDS);
                            }
                        } catch (InterruptedException unused) {
                            datagramPacket = null;
                            if (!uDPMessageProcessor.isRunning) {
                                return;
                            }
                            processIncomingDataPacket(datagramPacket);
                            if (this.sipStack.threadPoolSize == -1) {
                                return;
                            }
                        }
                    } else {
                        datagramQueuedMessageDispatchPoll = uDPMessageProcessor.messageQueue.take();
                    }
                    if (!uDPMessageProcessor.isRunning) {
                        return;
                    }
                    if (datagramQueuedMessageDispatchPoll != null) {
                        datagramPacket = datagramQueuedMessageDispatchPoll.packet;
                        try {
                            this.incomingPacket = datagramPacket;
                        } catch (InterruptedException unused2) {
                            if (!uDPMessageProcessor.isRunning) {
                                return;
                            }
                        }
                    }
                } else {
                    datagramPacket = this.incomingPacket;
                }
                processIncomingDataPacket(datagramPacket);
            } catch (Exception e10) {
                logger.logError("Error while processing incoming UDP packet" + Arrays.toString(datagramPacket.getData()), e10);
            }
            if (this.sipStack.threadPoolSize == -1) {
                return;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(final SIPMessage sIPMessage) {
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            if (!(sIPMessage instanceof SIPRequest) || ((SIPRequest) sIPMessage).getRequestLine() == null) {
                stackLogger.logStackTrace(16);
            } else {
                stackLogger.logStackTrace(16);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                for (MessageProcessor messageProcessor : this.sipStack.getMessageProcessors()) {
                    if (messageProcessor.getIpAddress().equals(this.peerAddress) && messageProcessor.getPort() == this.peerPort && messageProcessor.getTransport().equalsIgnoreCase(this.peerProtocol)) {
                        Object objCreateMessageChannel = messageProcessor.createMessageChannel(this.peerAddress, this.peerPort);
                        if (objCreateMessageChannel instanceof RawMessageChannel) {
                            final RawMessageChannel rawMessageChannel = (RawMessageChannel) objCreateMessageChannel;
                            getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.UDPMessageChannel.1
                                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                                public Object getThreadHash() {
                                    return sIPMessage.getCallId().getCallId();
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                    } catch (Exception e10) {
                                        if (UDPMessageChannel.logger.isLoggingEnabled(4)) {
                                            UDPMessageChannel.logger.logError("Error self routing message cause by: ", e10);
                                        }
                                    }
                                }
                            });
                            StackLogger stackLogger2 = logger;
                            if (stackLogger2.isLoggingEnabled(32)) {
                                stackLogger2.logDebug("Self routing message");
                            }
                            if (stackLogger2.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                                logMessage(sIPMessage, this.peerAddress, this.peerPort, jCurrentTimeMillis);
                                return;
                            } else {
                                if (stackLogger2.isLoggingEnabled(32)) {
                                    stackLogger2.logDebug("Sent EMPTY Message");
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                sendMessage(sIPMessage.encodeAsBytes(getTransport()), this.peerAddress, this.peerPort, this.peerProtocol, sIPMessage instanceof SIPRequest);
                sIPMessage.setRemoteAddress(this.peerAddress);
                sIPMessage.setRemotePort(this.peerPort);
                sIPMessage.setLocalPort(getPort());
                sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
                StackLogger stackLogger3 = logger;
                if (stackLogger3.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                    logMessage(sIPMessage, this.peerAddress, this.peerPort, jCurrentTimeMillis);
                } else if (stackLogger3.isLoggingEnabled(32)) {
                    stackLogger3.logDebug("Sent EMPTY Message");
                }
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                logger.logError("An exception occured while sending message", e11);
                throw new IOException("An exception occured while sending message");
            }
        } catch (Throwable th2) {
            StackLogger stackLogger4 = logger;
            if (stackLogger4.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                logMessage(sIPMessage, this.peerAddress, this.peerPort, jCurrentTimeMillis);
            } else if (stackLogger4.isLoggingEnabled(32)) {
                stackLogger4.logDebug("Sent EMPTY Message");
            }
            throw th2;
        }
    }

    private void processIncomingDataPacket(DatagramPacket datagramPacket) throws IOException {
        this.peerAddress = datagramPacket.getAddress();
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("UDPMessageChannel: processIncomingDataPacket : peerAddress = " + this.peerAddress.getHostAddress() + Separators.SLASH + datagramPacket.getPort() + " Length = " + length);
        }
        try {
            this.receptionTime = System.currentTimeMillis();
            boolean z6 = true;
            SIPMessage sIPMessage = this.myParser.parseSIPMessage(bArr, true, false, this);
            if (sIPMessage instanceof SIPRequest) {
                String sipVersion = ((SIPRequest) sIPMessage).getRequestLine().getSipVersion();
                if (!sipVersion.equals(TVCuK.QJWyYY)) {
                    sendMessage(((SIPRequest) sIPMessage).createResponse(505, "Bad version ".concat(sipVersion)).toString().getBytes(), this.peerAddress, datagramPacket.getPort(), "UDP", false);
                    return;
                } else if (!((SIPRequest) sIPMessage).getMethod().equalsIgnoreCase(((SIPRequest) sIPMessage).getCSeqHeader().getMethod())) {
                    sendMessage(((SIPRequest) sIPMessage).createResponse(RCHTTPStatusCodes.BAD_REQUEST).encodeAsBytes(getTransport()), this.peerAddress, datagramPacket.getPort(), "UDP", false);
                    return;
                }
            }
            if (sIPMessage == null) {
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("Rejecting message !  + Null message parsed.");
                }
                String str = datagramPacket.getAddress().getHostAddress() + ":" + datagramPacket.getPort();
                if (pingBackRecord.get(str) != null || this.sipStack.getMinKeepAliveInterval() <= 0) {
                    stackLogger.logDebug("Not sending ping back");
                    return;
                }
                byte[] bytes = "\r\n\r\n".getBytes();
                DatagramPacket datagramPacket2 = new DatagramPacket(bytes, 0, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort());
                PingBackTimerTask pingBackTimerTask = new PingBackTimerTask(datagramPacket.getAddress().getHostAddress(), datagramPacket.getPort());
                pingBackRecord.put(str, pingBackTimerTask);
                this.sipStack.getTimer().schedule(pingBackTimerTask, this.sipStack.getMinKeepAliveInterval() * 1000);
                ((UDPMessageProcessor) this.messageProcessor).sock.send(datagramPacket2);
                return;
            }
            Via topmostVia = sIPMessage.getTopmostVia();
            if (sIPMessage.getFrom() == null || sIPMessage.getTo() == null || sIPMessage.getCallId() == null || sIPMessage.getCSeq() == null || topmostVia == null) {
                String str2 = new String(bArr);
                if (stackLogger.isLoggingEnabled()) {
                    stackLogger.logError("bad message ".concat(str2));
                    stackLogger.logError(">>> Dropped Bad Msg From = " + sIPMessage.getFrom() + "To = " + sIPMessage.getTo() + "CallId = " + sIPMessage.getCallId() + "CSeq = " + sIPMessage.getCSeq() + "Via = " + sIPMessage.getViaHeaders());
                    return;
                }
                return;
            }
            SIPEventInterceptor sIPEventInterceptor = this.sipStack.sipEventInterceptor;
            if (sIPEventInterceptor != null) {
                sIPEventInterceptor.beforeMessage(sIPMessage);
            }
            if (sIPMessage instanceof SIPRequest) {
                InterfaceC12943b interfaceC12943bResolveAddress = this.sipStack.addressResolver.resolveAddress(topmostVia.getHop());
                this.peerPort = interfaceC12943bResolveAddress.getPort();
                this.peerProtocol = topmostVia.getTransport();
                this.peerPacketSourceAddress = datagramPacket.getAddress();
                this.peerPacketSourcePort = datagramPacket.getPort();
                try {
                    this.peerAddress = datagramPacket.getAddress();
                    boolean zHasParameter = topmostVia.hasParameter("rport");
                    if (!this.sipStack.isPatchRport() || zHasParameter || topmostVia.getPort() == this.peerPacketSourcePort) {
                        z6 = zHasParameter;
                    } else if (stackLogger.isLoggingEnabled(32)) {
                        stackLogger.logDebug("setting rport since viaPort " + topmostVia.getPort() + " different than peerPacketSourcePort " + this.peerPacketSourcePort + " so that the response can be routed back");
                    }
                    if (z6 || !interfaceC12943bResolveAddress.getHost().equals(this.peerAddress.getHostAddress())) {
                        topmostVia.setParameter("received", this.peerAddress.getHostAddress());
                    }
                    if (z6) {
                        topmostVia.setParameter("rport", Integer.toString(this.peerPacketSourcePort));
                    }
                } catch (ParseException e10) {
                    InternalErrorHandler.handleException(e10);
                }
            } else {
                this.peerPacketSourceAddress = datagramPacket.getAddress();
                this.peerPacketSourcePort = datagramPacket.getPort();
                this.peerAddress = datagramPacket.getAddress();
                this.peerPort = datagramPacket.getPort();
                this.peerProtocol = topmostVia.getTransport();
            }
            processMessage(sIPMessage);
            SIPEventInterceptor sIPEventInterceptor2 = this.sipStack.sipEventInterceptor;
            if (sIPEventInterceptor2 != null) {
                sIPEventInterceptor2.afterMessage(sIPMessage);
            }
        } catch (ParseException e11) {
            StackLogger stackLogger2 = logger;
            if (stackLogger2.isLoggingEnabled(32)) {
                stackLogger2.logDebug("Rejecting message !  " + new String(bArr) + Separators.f31991SP + e11.getMessage());
            }
            String str3 = new String(bArr, 0, length);
            if (str3.startsWith("SIP/") || str3.startsWith("ACK ")) {
                return;
            }
            String strCreateBadReqRes = createBadReqRes(str3, e11);
            if (strCreateBadReqRes == null) {
                if (stackLogger2.isLoggingEnabled(32)) {
                    stackLogger2.logDebug("Could not formulate automatic 400 Bad Request");
                    return;
                }
                return;
            }
            if (stackLogger2.isLoggingEnabled(32)) {
                stackLogger2.logDebug("Sending automatic 400 Bad Request:");
                stackLogger2.logDebug(strCreateBadReqRes);
            }
            try {
                sendMessage(strCreateBadReqRes.getBytes(), this.peerAddress, datagramPacket.getPort(), "UDP", false);
            } catch (IOException e12) {
                logger.logException(e12);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.RawMessageChannel
    public void processMessage(SIPMessage sIPMessage) {
        sIPMessage.setRemoteAddress(this.peerAddress);
        sIPMessage.setRemotePort(getPeerPort());
        sIPMessage.setLocalPort(getPort());
        sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16)) {
            stackLogger.logInfo("Setting SIPMessage peerPacketSource to: " + this.peerPacketSourceAddress + ":" + this.peerPacketSourcePort);
        }
        sIPMessage.setPeerPacketSourceAddress(this.peerPacketSourceAddress);
        sIPMessage.setPeerPacketSourcePort(this.peerPacketSourcePort);
        if (sIPMessage instanceof SIPRequest) {
            SIPRequest sIPRequest = (SIPRequest) sIPMessage;
            if (stackLogger.isLoggingEnabled(16)) {
                this.sipStack.serverLogger.logMessage(sIPMessage, getPeerHostPort().toString(), getHost() + ":" + this.myPort, false, this.receptionTime);
            }
            ServerRequestInterface serverRequestInterfaceNewSIPServerRequest = this.sipStack.newSIPServerRequest(sIPRequest, this);
            if (serverRequestInterfaceNewSIPServerRequest == null) {
                if (stackLogger.isLoggingEnabled()) {
                    stackLogger.logWarning("Null request interface returned -- dropping request");
                    return;
                }
                return;
            }
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug("About to process " + sIPRequest.getFirstLine() + Separators.SLASH + serverRequestInterfaceNewSIPServerRequest);
            }
            try {
                serverRequestInterfaceNewSIPServerRequest.processRequest(sIPRequest, this);
                if ((serverRequestInterfaceNewSIPServerRequest instanceof SIPTransaction) && !((SIPServerTransaction) serverRequestInterfaceNewSIPServerRequest).passToListener()) {
                    ((SIPTransaction) serverRequestInterfaceNewSIPServerRequest).releaseSem();
                }
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("Done processing " + sIPRequest.getFirstLine() + Separators.SLASH + serverRequestInterfaceNewSIPServerRequest);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if ((serverRequestInterfaceNewSIPServerRequest instanceof SIPTransaction) && !((SIPServerTransaction) serverRequestInterfaceNewSIPServerRequest).passToListener()) {
                    ((SIPTransaction) serverRequestInterfaceNewSIPServerRequest).releaseSem();
                }
                throw th2;
            }
        }
        SIPResponse sIPResponse = (SIPResponse) sIPMessage;
        try {
            sIPResponse.checkHeaders();
            if (stackLogger.isLoggingEnabled(16)) {
                this.sipStack.serverLogger.logMessage((SIPMessage) sIPResponse, getPeerHostPort().toString(), getHost() + ":" + this.myPort, false, this.receptionTime);
            }
            ServerResponseInterface serverResponseInterfaceNewSIPServerResponse = this.sipStack.newSIPServerResponse(sIPResponse, this);
            if (serverResponseInterfaceNewSIPServerResponse == null) {
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("null sipServerResponse as could not acquire semaphore or the valve dropped the message.");
                    return;
                }
                return;
            }
            try {
                if (!(serverResponseInterfaceNewSIPServerResponse instanceof SIPClientTransaction) || ((SIPClientTransaction) serverResponseInterfaceNewSIPServerResponse).checkFromTag(sIPResponse)) {
                    serverResponseInterfaceNewSIPServerResponse.processResponse(sIPResponse, this);
                } else {
                    if (stackLogger.isLoggingEnabled()) {
                        stackLogger.logError("Dropping response message with invalid tag >>> " + sIPResponse);
                    }
                }
            } finally {
                if (serverResponseInterfaceNewSIPServerResponse instanceof SIPTransaction) {
                    SIPTransaction sIPTransaction = (SIPTransaction) serverResponseInterfaceNewSIPServerResponse;
                    if (!sIPTransaction.passToListener()) {
                        sIPTransaction.releaseSem();
                    }
                }
            }
        } catch (ParseException unused) {
            if (logger.isLoggingEnabled()) {
                logger.logError(vRJidSveZHcTw.XVCtyqUw + sIPResponse);
            }
        }
    }

    public UDPMessageChannel(SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor, DatagramPacket datagramPacket) {
        this.mythread = null;
        this.incomingPacket = datagramPacket;
        this.messageProcessor = uDPMessageProcessor;
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(this.sipStack);
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.start();
    }

    public UDPMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor) {
        this.mythread = null;
        this.peerAddress = inetAddress;
        this.peerPort = i10;
        this.peerProtocol = "UDP";
        this.messageProcessor = uDPMessageProcessor;
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(sIPTransactionStack);
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("Creating message channel " + inetAddress.getHostAddress() + Separators.SLASH + i10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z6) throws IOException {
        DatagramSocket datagramSocket;
        boolean z10;
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            stackLogger.logStackTrace(16);
        }
        if (i10 == -1) {
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug(getClass().getName().concat(":sendMessage: Dropping reply!"));
            }
            throw new IOException("Receiver port not set ");
        }
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i10 + "\nmessageSize =  " + bArr.length + " message = " + new String(bArr));
            stackLogger.logDebug("*******************\n");
        }
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i10);
        try {
            if (this.sipStack.udpFlag) {
                datagramSocket = ((UDPMessageProcessor) this.messageProcessor).sock;
                z10 = false;
            } else {
                datagramSocket = new DatagramSocket();
                z10 = true;
            }
            datagramSocket.send(datagramPacket);
            if (z10) {
                datagramSocket.close();
            }
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            InternalErrorHandler.handleException(e11);
        }
    }

    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, String str, boolean z6) throws IOException {
        DatagramSocket datagramSocketCreateDatagramSocket;
        if (i10 == -1) {
            StackLogger stackLogger = logger;
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug(getClass().getName().concat(FpwNpGDhomXHZ.WEsRsiqko));
            }
            throw new IOException("Receiver port not set ");
        }
        StackLogger stackLogger2 = logger;
        if (stackLogger2.isLoggingEnabled(32)) {
            stackLogger2.logDebug(":sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i10 + "\n messageSize = " + bArr.length);
        }
        if (str.compareToIgnoreCase("UDP") == 0) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i10);
            try {
                SIPTransactionStack sIPTransactionStack = this.sipStack;
                if (sIPTransactionStack.udpFlag) {
                    datagramSocketCreateDatagramSocket = ((UDPMessageProcessor) this.messageProcessor).sock;
                } else {
                    datagramSocketCreateDatagramSocket = sIPTransactionStack.getNetworkLayer().createDatagramSocket();
                }
                if (stackLogger2.isLoggingEnabled(32)) {
                    stackLogger2.logDebug("sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i10 + Separators.RETURN + new String(bArr));
                }
                datagramSocketCreateDatagramSocket.send(datagramPacket);
                if (this.sipStack.udpFlag) {
                    return;
                }
                datagramSocketCreateDatagramSocket.close();
                return;
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                InternalErrorHandler.handleException(e11);
                return;
            }
        }
        OutputStream outputStream = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i10, ParameterNames.TCP, bArr, z6, this).getOutputStream();
        outputStream.write(bArr, 0, bArr.length);
        outputStream.flush();
    }
}
