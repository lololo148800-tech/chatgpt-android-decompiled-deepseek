package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.DialogExt;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipListenerExt;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.ContactList;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.RAck;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.Reason;
import android.gov.nist.javax.sip.header.RecordRoute;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.Require;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.TimeStamp;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.AddressParser;
import android.gov.nist.javax.sip.parser.CallIDParser;
import android.gov.nist.javax.sip.parser.ContactParser;
import android.gov.nist.javax.sip.parser.RecordRouteParser;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.C10796c;
import android.javax.sip.C10797d;
import android.javax.sip.C10799f;
import android.javax.sip.C10800g;
import android.javax.sip.C10802i;
import android.javax.sip.C10807n;
import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10814u;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p174Gk.uSfJ.HpucjswO;
import p279L1.VOxZ.sVoFrD;
import p315Me.Myis.CxcULo;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p691d.InterfaceC12942a;
import p691d.InterfaceC12943b;
import p691d.InterfaceC12945d;
import p713e.InterfaceC13198F;
import p713e.InterfaceC13203K;
import p713e.InterfaceC13211T;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13236j;
import p713e.InterfaceC13238l;
import p713e.InterfaceC13246t;
import p713e.InterfaceC13250x;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class SIPDialog implements InterfaceC10795b, DialogExt {
    public static final int CONFIRMED_STATE = 1;
    public static final int EARLY_STATE = 0;
    public static final int NULL_STATE = -1;
    public static final int TERMINATED_STATE = 3;
    private static StackLogger logger = CommonLogger.getLogger(SIPDialog.class);
    private static final long serialVersionUID = -1429794423085204069L;
    private transient int ackLine;
    protected transient boolean ackProcessed;
    private transient Semaphore ackSem;
    private transient AckSendingStrategy ackSendingStrategy;
    private transient Object applicationData;
    public transient long auditTag;
    protected transient boolean byeSent;
    protected InterfaceC13236j callIdHeader;
    protected String callIdHeaderString;
    protected Contact contactHeader;
    protected String contactHeaderStringified;
    private transient DialogDeleteIfNoAckSentTask dialogDeleteIfNoAckSentTask;
    private transient DialogDeleteTask dialogDeleteTask;
    protected String dialogId;
    private int dialogState;
    private transient boolean dialogTerminatedEventDelivered;
    protected transient String earlyDialogId;
    private int earlyDialogTimeout;
    private transient EarlyStateTimerTask earlyStateTimerTask;
    protected InterfaceC13246t eventHeader;
    private transient Set<SIPDialogEventListener> eventListeners;
    protected SIPTransaction firstTransaction;
    protected String firstTransactionId;
    protected boolean firstTransactionIsServerTransaction;
    protected String firstTransactionMergeId;
    protected String firstTransactionMethod;
    protected int firstTransactionPort;
    protected boolean firstTransactionSecure;
    protected boolean firstTransactionSeen;
    private transient long highestSequenceNumberAcknowledged;
    protected String hisTag;
    protected transient boolean isAcknowledged;
    protected transient boolean isAssigned;
    protected boolean isBackToBackUserAgent;
    protected Long lastAckReceivedCSeqNumber;
    private transient ACKWrapper lastAckSent;
    protected transient long lastInviteOkReceived;
    protected long lastInviteResponseCSeqNumber;
    protected int lastInviteResponseCode;
    protected long lastResponseCSeqNumber;
    protected String lastResponseDialogId;
    protected String lastResponseFromTag;
    protected String lastResponseMethod;
    protected Integer lastResponseStatusCode;
    protected String lastResponseToTag;
    private Via lastResponseTopMostVia;
    protected SIPTransaction lastTransaction;
    protected InterfaceC12942a localParty;
    protected String localPartyStringified;
    protected long localSequenceNumber;
    protected String method;
    protected String myTag;
    protected transient long nextSeqno;
    private SIPDialog originalDialog;
    protected long originalLocalSequenceNumber;
    private transient SIPRequest originalRequest;
    protected transient RecordRouteList originalRequestRecordRouteHeaders;
    protected transient String originalRequestRecordRouteHeadersString;
    private boolean pendingRouteUpdateOn202Response;
    private transient int prevRetransmissionTicks;
    protected InterfaceC13203K proxyAuthorizationHeader;
    protected boolean reInviteFlag;
    protected transient int reInviteWaitTime;
    private ReleaseReferencesStrategy releaseReferencesStrategy;
    protected InterfaceC12942a remoteParty;
    protected String remotePartyStringified;
    protected long remoteSequenceNumber;
    protected InterfaceC12942a remoteTarget;
    protected String remoteTargetStringified;
    private Set<String> responsesReceivedInForkingCase;
    private transient int retransmissionTicksLeft;
    protected RouteList routeList;
    protected boolean sequenceNumberValidation;
    protected boolean serverTransactionFlag;
    private transient SipProviderImpl sipProvider;
    private transient SIPTransactionStack sipStack;
    private transient String stackTrace;
    protected boolean terminateOnBye;
    protected transient DialogTimerTask timerTask;
    private transient Semaphore timerTaskLock;

    public final class ACKWrapper {
        InterfaceC13234i cSeq;
        String dialogId;
        String fromTag;
        String msgBytes;

        public ACKWrapper(SIPRequest sIPRequest) {
            sIPRequest.setTransaction(null);
            this.msgBytes = sIPRequest.encode();
            this.fromTag = sIPRequest.getFromTag();
            this.dialogId = sIPRequest.getDialogId(false);
            this.cSeq = sIPRequest.getCSeq();
        }

        public InterfaceC13234i getCSeq() {
            return this.cSeq;
        }

        public String getDialogId() {
            return this.dialogId;
        }

        public String getFromTag() {
            return this.fromTag;
        }

        public SIPRequest reparseRequest() {
            try {
                return (SIPRequest) SIPDialog.this.sipStack.getMessageParserFactory().createMessageParser(SIPDialog.this.sipStack).parseSIPMessage(this.msgBytes.getBytes("UTF-8"), true, false, null);
            } catch (Exception unused) {
                if (SIPDialog.logger.isLoggingEnabled(32)) {
                    SIPDialog.logger.logDebug("SIPDialog::resendAck:lastAck failed reparsing, hence not resending ACK");
                }
                return null;
            }
        }
    }

    public class AckSendingStrategyImpl implements AckSendingStrategy {
        private InterfaceC12943b hop = null;

        public AckSendingStrategyImpl() {
        }

        @Override // android.gov.nist.javax.sip.stack.AckSendingStrategy
        public InterfaceC12943b getLastHop() {
            return this.hop;
        }

        @Override // android.gov.nist.javax.sip.stack.AckSendingStrategy
        public void send(SIPRequest sIPRequest) throws C10807n, UnknownHostException {
            InterfaceC12943b nextHop = SIPDialog.this.sipStack.getNextHop(sIPRequest);
            this.hop = nextHop;
            if (nextHop == null) {
                throw new C10807n("No route!");
            }
            if (SIPDialog.logger.isLoggingEnabled(32)) {
                SIPDialog.logger.logDebug("hop = " + this.hop);
            }
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) SIPDialog.this.sipProvider.getListeningPoint(this.hop.getTransport());
            if (listeningPointImpl != null) {
                listeningPointImpl.getMessageProcessor().createMessageChannel(InetAddress.getByName(this.hop.getHost()), this.hop.getPort()).sendMessage(sIPRequest);
            } else {
                throw new C10807n("No listening point for this provider registered at " + this.hop);
            }
        }
    }

    public class DialogDeleteIfNoAckSentTask extends SIPStackTimerTask implements Serializable {
        private long seqno;

        public DialogDeleteIfNoAckSentTask(long j10) {
            this.seqno = j10;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPDialog.this.highestSequenceNumberAcknowledged < this.seqno) {
                SIPDialog.this.dialogDeleteIfNoAckSentTask = null;
                if (!SIPDialog.this.isBackToBackUserAgent) {
                    if (SIPDialog.logger.isLoggingEnabled()) {
                        SIPDialog.logger.logError("ACK Was not sent. killing dialog " + SIPDialog.this.dialogId);
                    }
                    if (SIPDialog.this.sipProvider.getSipListener() instanceof SipListenerExt) {
                        SIPDialog.this.raiseErrorEvent(2);
                        return;
                    } else {
                        SIPDialog.this.delete();
                        return;
                    }
                }
                if (SIPDialog.logger.isLoggingEnabled()) {
                    SIPDialog.logger.logError("ACK Was not sent. Sending BYE " + SIPDialog.this.dialogId);
                }
                if (SIPDialog.this.sipProvider.getSipListener() instanceof SipListenerExt) {
                    SIPDialog.this.raiseErrorEvent(2);
                    return;
                }
                try {
                    InterfaceC13461b interfaceC13461bCreateRequest = SIPDialog.this.createRequest(TokenNames.BYE);
                    if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
                        interfaceC13461bCreateRequest.addHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
                    }
                    Reason reason = new Reason();
                    reason.setProtocol("SIP");
                    reason.setCause(1025);
                    reason.setText("Timed out waiting to send ACK " + SIPDialog.this.dialogId);
                    interfaceC13461bCreateRequest.addHeader(reason);
                    SIPDialog.this.sendRequest(SIPDialog.this.getSipProvider().getNewClientTransaction(interfaceC13461bCreateRequest));
                } catch (Exception unused) {
                    SIPDialog.this.delete();
                }
            }
        }
    }

    public class DialogDeleteTask extends SIPStackTimerTask implements Serializable {
        public DialogDeleteTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPDialog.this.delete();
        }
    }

    public class DialogTimerTask extends SIPStackTimerTask implements Serializable {
        int nRetransmissions = 0;
        SIPServerTransaction transaction;

        public DialogTimerTask(SIPServerTransaction sIPServerTransaction) {
            this.transaction = sIPServerTransaction;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void cleanUpBeforeCancel() {
            this.transaction = null;
            SIPDialog.this.cleanUpOnAck();
            super.cleanUpBeforeCancel();
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            StackLogger stackLogger;
            StringBuilder sb2;
            SIPDialog sIPDialog = SIPDialog.this;
            if (SIPDialog.logger.isLoggingEnabled(32)) {
                SIPDialog.logger.logDebug("Running dialog timer");
            }
            int i10 = this.nRetransmissions + 1;
            this.nRetransmissions = i10;
            SIPServerTransaction sIPServerTransaction = this.transaction;
            if (i10 > SIPDialog.this.sipStack.getAckTimeoutFactor()) {
                if (SIPDialog.this.getSipProvider().getSipListener() == null || !(SIPDialog.this.getSipProvider().getSipListener() instanceof SipListenerExt)) {
                    SIPDialog.this.delete();
                } else {
                    SIPDialog.this.raiseErrorEvent(1);
                }
                if (sIPServerTransaction != null && sIPServerTransaction.getState() != C10815v.f32051t0) {
                    sIPServerTransaction.raiseErrorEvent(1);
                }
            } else if (sIPServerTransaction != null && !sIPDialog.isAckSeen() && SIPDialog.this.lastResponseStatusCode.intValue() / 100 == 2) {
                try {
                    try {
                        if (sIPDialog.toRetransmitFinalResponse(sIPServerTransaction.getTimerT2())) {
                            sIPServerTransaction.resendLastResponseAsBytes();
                        }
                        SIPTransactionStack unused = sIPDialog.sipStack;
                        if (SIPDialog.logger.isLoggingEnabled(32)) {
                            stackLogger = SIPDialog.logger;
                            sb2 = new StringBuilder("resend 200 response from ");
                            sb2.append(sIPDialog);
                            stackLogger.logDebug(sb2.toString());
                        }
                    } catch (IOException unused2) {
                        SIPDialog.this.raiseIOException(sIPServerTransaction.getPeerAddress(), sIPServerTransaction.getPeerPort(), sIPServerTransaction.getPeerProtocol());
                        SIPTransactionStack unused3 = sIPDialog.sipStack;
                        if (SIPDialog.logger.isLoggingEnabled(32)) {
                            stackLogger = SIPDialog.logger;
                            sb2 = new StringBuilder("resend 200 response from ");
                        }
                        sIPServerTransaction.fireTimer();
                    }
                    sIPServerTransaction.fireTimer();
                } catch (Throwable th2) {
                    SIPTransactionStack unused4 = sIPDialog.sipStack;
                    if (SIPDialog.logger.isLoggingEnabled(32)) {
                        SIPDialog.logger.logDebug("resend 200 response from " + sIPDialog);
                    }
                    sIPServerTransaction.fireTimer();
                    throw th2;
                }
            }
            if (sIPDialog.isAckSeen() || sIPDialog.dialogState == 3) {
                this.transaction = null;
                SIPDialog.this.getStack().getTimer().cancel(this);
            }
        }
    }

    public class EarlyStateTimerTask extends SIPStackTimerTask implements Serializable {
        public EarlyStateTimerTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            try {
                if (SIPDialog.this.getState().equals(C10797d.f32033o0)) {
                    SIPDialog.this.raiseErrorEvent(4);
                } else if (SIPDialog.logger.isLoggingEnabled(32)) {
                    SIPDialog.logger.logDebug("EarlyStateTimerTask : Dialog state is " + SIPDialog.this.getState());
                }
            } catch (Exception e10) {
                SIPDialog.logger.logError("Unexpected exception delivering event", e10);
            }
        }
    }

    public class LingerTimer extends SIPStackTimerTask implements Serializable {
        public LingerTimer() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPDialog sIPDialog = SIPDialog.this;
            sIPDialog.sipStack.removeDialog(sIPDialog);
            if (((SipStackImpl) SIPDialog.this.getStack()).isReEntrantListener()) {
                SIPDialog.this.cleanUp();
            }
        }
    }

    public class ReInviteSender implements Runnable, Serializable {
        private static final long serialVersionUID = 1019346148741070635L;
        InterfaceC10794a ctx;

        public ReInviteSender(InterfaceC10794a interfaceC10794a) {
            this.ctx = interfaceC10794a;
            if (SIPDialog.logger.isLoggingEnabled(32)) {
                SIPDialog.logger.logDebug("ReInviteSender::ReInviteSender: ctx = " + interfaceC10794a);
                SIPDialog.logger.logStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (SIPDialog.logger.isLoggingEnabled(32)) {
                        SIPDialog.logger.logDebug("SIPDialog::reInviteSender: dialog = " + this.ctx.getDialog() + " lastTransaction = " + SIPDialog.this.lastTransaction + " lastTransactionState " + SIPDialog.this.lastTransaction.getState());
                    }
                    SIPTransaction sIPTransaction = SIPDialog.this.lastTransaction;
                    if (sIPTransaction != null && (sIPTransaction instanceof SIPServerTransaction) && sIPTransaction.isInviteTransaction() && SIPDialog.this.lastTransaction.getState() != C10815v.f32051t0) {
                        ((SIPServerTransaction) SIPDialog.this.lastTransaction).waitForTermination();
                        Thread.sleep(50L);
                    }
                    if (SIPDialog.this.takeAckSem()) {
                        z6 = false;
                    } else {
                        if (SIPDialog.logger.isLoggingEnabled()) {
                            SIPDialog.logger.logError("Could not send re-INVITE time out ClientTransaction");
                        }
                        ((SIPClientTransaction) this.ctx).fireTimeoutTimer();
                        if (SIPDialog.this.sipProvider.getSipListener() == null || !(SIPDialog.this.sipProvider.getSipListener() instanceof SipListenerExt)) {
                            InterfaceC13461b interfaceC13461bCreateRequest = SIPDialog.this.createRequest(TokenNames.BYE);
                            if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
                                interfaceC13461bCreateRequest.addHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
                            }
                            Reason reason = new Reason();
                            reason.setCause(1024);
                            reason.setText("Timed out waiting to re-INVITE");
                            interfaceC13461bCreateRequest.addHeader(reason);
                            SIPDialog.this.sendRequest(SIPDialog.this.getSipProvider().getNewClientTransaction(interfaceC13461bCreateRequest));
                            return;
                        }
                        SIPDialog.this.raiseErrorEvent(3, (SIPClientTransaction) this.ctx);
                        z6 = true;
                    }
                    C10797d state = SIPDialog.this.getState();
                    C10797d c10797d = C10797d.f32035q0;
                    if ((state != c10797d ? System.currentTimeMillis() - jCurrentTimeMillis : 0L) != 0) {
                        try {
                            Thread.sleep(SIPDialog.this.reInviteWaitTime);
                        } catch (InterruptedException unused) {
                            if (SIPDialog.logger.isLoggingEnabled(32)) {
                                SIPDialog.logger.logDebug("Interrupted sleep");
                            }
                            return;
                        }
                    }
                    if (SIPDialog.this.getState() != c10797d && !z6 && this.ctx.getState() != C10815v.f32051t0) {
                        SIPDialog.this.sendRequest(this.ctx, true);
                        if (SIPDialog.logger.isLoggingEnabled(32)) {
                            SIPDialog.logger.logDebug("re-INVITE successfully sent");
                        }
                    }
                } catch (Exception e10) {
                    SIPDialog.logger.logError("Error sending re-INVITE", e10);
                }
            } finally {
                this.ctx = null;
            }
        }

        public void terminate() {
            try {
                if (SIPDialog.logger.isLoggingEnabled(32)) {
                    SIPDialog.logger.logDebug("ReInviteSender::terminate: ctx = " + this.ctx);
                }
                this.ctx.terminate();
                Thread.currentThread().interrupt();
            } catch (C10802i e10) {
                SIPDialog.logger.logError("unexpected error", e10);
            }
        }
    }

    private SIPDialog(SipProviderImpl sipProviderImpl) {
        this.auditTag = 0L;
        this.ackSem = new Semaphore(1);
        this.reInviteWaitTime = 100;
        this.highestSequenceNumberAcknowledged = -1L;
        this.sequenceNumberValidation = true;
        this.timerTaskLock = new Semaphore(1);
        this.firstTransactionPort = SIPConstants.DEFAULT_PORT;
        this.earlyDialogTimeout = 180;
        this.responsesReceivedInForkingCase = new HashSet(0);
        this.ackSendingStrategy = new AckSendingStrategyImpl();
        this.terminateOnBye = true;
        this.routeList = new RouteList();
        this.dialogState = -1;
        this.localSequenceNumber = 0L;
        this.remoteSequenceNumber = -1L;
        this.sipProvider = sipProviderImpl;
        this.eventListeners = new CopyOnWriteArraySet();
        this.earlyDialogTimeout = ((SIPTransactionStack) sipProviderImpl.getSipStack()).getEarlyDialogTimeout();
    }

    private void addRoute(RecordRouteList recordRouteList) {
        try {
            if (isServer()) {
                this.routeList = new RouteList();
                ListIterator<RecordRoute> listIterator = recordRouteList.listIterator();
                while (listIterator.hasNext()) {
                    RecordRoute next = listIterator.next();
                    Route route = new Route();
                    route.setAddress((AddressImpl) ((AddressImpl) next.getAddress()).clone());
                    route.setParameters((NameValueList) next.getParameters().clone());
                    this.routeList.add(route);
                }
            } else {
                this.routeList = new RouteList();
                ListIterator<RecordRoute> listIterator2 = recordRouteList.listIterator(recordRouteList.size());
                while (listIterator2.hasPrevious()) {
                    RecordRoute recordRoutePrevious = listIterator2.previous();
                    Route route2 = new Route();
                    route2.setAddress((AddressImpl) ((AddressImpl) recordRoutePrevious.getAddress()).clone());
                    route2.setParameters((NameValueList) recordRoutePrevious.getParameters().clone());
                    this.routeList.add(route2);
                }
            }
            if (logger.isLoggingEnabled()) {
                Iterator<Route> it = this.routeList.iterator();
                while (it.hasNext()) {
                    InterfaceC12945d interfaceC12945d = (InterfaceC12945d) it.next().getAddress().getURI();
                    if (interfaceC12945d.hasLrParam()) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("route = " + interfaceC12945d);
                        }
                    } else if (logger.isLoggingEnabled()) {
                        logger.logWarning("NON LR route in Route set detected for dialog : " + this);
                        logger.logStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled()) {
                Iterator<Route> it2 = this.routeList.iterator();
                while (it2.hasNext()) {
                    InterfaceC12945d interfaceC12945d2 = (InterfaceC12945d) it2.next().getAddress().getURI();
                    if (interfaceC12945d2.hasLrParam()) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("route = " + interfaceC12945d2);
                        }
                    } else if (logger.isLoggingEnabled()) {
                        logger.logWarning("NON LR route in Route set detected for dialog : " + this);
                        logger.logStackTrace();
                    }
                }
            }
            throw th2;
        }
    }

    private void doTargetRefresh(SIPMessage sIPMessage) {
        ContactList contactHeaders = sIPMessage.getContactHeaders();
        if (contactHeaders != null) {
            setRemoteTarget((Contact) contactHeaders.getFirst());
        }
    }

    private synchronized RouteList getRouteList() {
        RouteList routeList;
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("getRouteList " + this);
            }
            new RouteList();
            routeList = new RouteList();
            RouteList routeList2 = this.routeList;
            if (routeList2 != null) {
                ListIterator<Route> listIterator = routeList2.listIterator();
                while (listIterator.hasNext()) {
                    routeList.add((Route) listIterator.next().clone());
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("----- ");
                logger.logDebug("getRouteList for " + this);
                logger.logDebug("RouteList = " + routeList.encode());
                if (this.routeList != null) {
                    logger.logDebug("myRouteList = " + this.routeList.encode());
                }
                logger.logDebug("----- ");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return routeList;
    }

    private static final boolean optionPresent(ListIterator listIterator, String str) {
        while (listIterator.hasNext()) {
            InterfaceC13198F interfaceC13198F = (InterfaceC13198F) listIterator.next();
            if (interfaceC13198F != null && str.equalsIgnoreCase(interfaceC13198F.getOptionTag())) {
                return true;
            }
        }
        return false;
    }

    private void printRouteList() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("this : " + this);
            logger.logDebug("printRouteList : " + this.routeList.encode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseErrorEvent(int i10, SIPClientTransaction sIPClientTransaction) {
        SIPDialogErrorEvent sIPDialogErrorEvent = new SIPDialogErrorEvent(this, i10);
        sIPDialogErrorEvent.setClientTransaction(sIPClientTransaction);
        synchronized (this.eventListeners) {
            try {
                Iterator<SIPDialogEventListener> it = this.eventListeners.iterator();
                while (it.hasNext()) {
                    it.next().dialogErrorEvent(sIPDialogErrorEvent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.eventListeners.clear();
        if (i10 != 2 && i10 != 1 && i10 != 4 && i10 != 3) {
            delete();
        }
        stopTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseIOException(String str, int i10, String str2) {
        this.sipProvider.handleEvent(new C10799f(this, str, i10, str2), null);
        setState(3);
    }

    private void recordStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Exception().printStackTrace(new PrintWriter(stringWriter));
        String string = Integer.toString(Math.abs(new Random().nextInt()));
        logger.logDebug("TraceRecord = " + string);
        this.stackTrace = "TraceRecord = " + string + ":" + stringWriter.getBuffer().toString();
    }

    private void sendAck(InterfaceC13461b interfaceC13461b, boolean z6) throws C10807n {
        SIPRequest sIPRequest = (SIPRequest) interfaceC13461b;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sendAck" + this);
        }
        if (!sIPRequest.getMethod().equals(TokenNames.ACK)) {
            throw new C10807n("Bad request method -- should be ACK");
        }
        if (getState() == null || getState().f32036Y == 0) {
            if (logger.isLoggingEnabled(4)) {
                logger.logError("Bad Dialog State for " + this + " dialogID = " + getDialogId());
            }
            throw new C10807n("Bad dialog state " + getState());
        }
        if (!getCallId().getCallId().equals(sIPRequest.getCallId().getCallId())) {
            if (logger.isLoggingEnabled(32)) {
                logger.logError("CallID " + getCallId());
                logger.logError("RequestCallID = " + sIPRequest.getCallId().getCallId());
                logger.logError("dialog =  " + this);
            }
            throw new C10807n("Bad call ID in request");
        }
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("setting from tag For outgoing ACK= " + getLocalTag());
                logger.logDebug("setting To tag for outgoing ACK = " + getRemoteTag());
                logger.logDebug("ack = " + sIPRequest);
            }
            if (getLocalTag() != null) {
                sIPRequest.getFrom().setTag(getLocalTag());
            }
            if (getRemoteTag() != null) {
                sIPRequest.getTo().setTag(getRemoteTag());
            }
            boolean zIsAckSent = isAckSent(sIPRequest.getCSeq().getSeqNumber());
            boolean z10 = !zIsAckSent;
            setLastAckSent(sIPRequest);
            try {
                this.ackSendingStrategy.send(sIPRequest);
                this.isAcknowledged = true;
                this.highestSequenceNumberAcknowledged = Math.max(this.highestSequenceNumberAcknowledged, sIPRequest.getCSeq().getSeqNumber());
                if (!zIsAckSent && this.isBackToBackUserAgent) {
                    releaseAckSem();
                } else if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Not releasing ack sem for " + this + " isAckSent " + z10);
                }
            } catch (C10807n e10) {
                if (logger.isLoggingEnabled()) {
                    logger.logException(e10);
                }
                throw e10;
            } catch (IOException e11) {
                if (z6) {
                    throw new C10807n("Could not send ack", e11);
                }
                InterfaceC12943b lastHop = this.ackSendingStrategy.getLastHop();
                if (lastHop == null) {
                    lastHop = this.sipStack.getNextHop(sIPRequest);
                }
                raiseIOException(lastHop.getHost(), lastHop.getPort(), lastHop.getTransport());
            } catch (Exception e12) {
                if (logger.isLoggingEnabled()) {
                    logger.logException(e12);
                }
                throw new C10807n("Could not create message channel", e12);
            }
            if (this.dialogDeleteTask != null) {
                getStack().getTimer().cancel(this.dialogDeleteTask);
                this.dialogDeleteTask = null;
            }
        } catch (ParseException e13) {
            throw new C10807n(e13.getMessage());
        }
    }

    private final void setBranch(Via via, String str) {
        String branch;
        if (str.equals(TokenNames.ACK)) {
            branch = getLastResponseStatusCode().intValue() >= 300 ? this.lastResponseTopMostVia.getBranch() : Utils.getInstance().generateBranchId();
        } else if (!str.equals("CANCEL")) {
            return;
        } else {
            branch = this.lastResponseTopMostVia.getBranch();
        }
        try {
            via.setBranch(branch);
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    private void setCallId(SIPRequest sIPRequest) {
        this.callIdHeader = sIPRequest.getCallId();
    }

    private void setLastAckSent(SIPRequest sIPRequest) {
        this.lastAckSent = new ACKWrapper(sIPRequest);
    }

    private void setLocalSequenceNumber(long j10) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setLocalSequenceNumber: original  " + this.localSequenceNumber + " new  = " + j10);
        }
        if (j10 <= this.localSequenceNumber) {
            throw new RuntimeException("Sequence number should not decrease !");
        }
        this.localSequenceNumber = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean toRetransmitFinalResponse(int i10) {
        int i11 = this.retransmissionTicksLeft - 1;
        this.retransmissionTicksLeft = i11;
        if (i11 != 0) {
            return false;
        }
        int i12 = this.prevRetransmissionTicks;
        if (i12 * 2 <= i10) {
            this.retransmissionTicksLeft = i12 * 2;
        } else {
            this.retransmissionTicksLeft = i12;
        }
        this.prevRetransmissionTicks = this.retransmissionTicksLeft;
        return true;
    }

    private void updateRequest(SIPRequest sIPRequest) {
        RouteList routeList = getRouteList();
        if (routeList.size() > 0) {
            sIPRequest.setHeader((InterfaceC13250x) routeList);
        } else {
            sIPRequest.removeHeader(SIPHeaderNames.ROUTE);
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        if (this.proxyAuthorizationHeader == null || sIPRequest.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION) != null) {
            return;
        }
        sIPRequest.setHeader(this.proxyAuthorizationHeader);
    }

    public void ackReceived(long j10) {
        if (isAckSeen()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Ack already seen for response -- dropping");
                return;
            }
            return;
        }
        SIPServerTransaction inviteTransaction = getInviteTransaction();
        if (inviteTransaction == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("tr is null -- not updating the ack state");
                return;
            }
            return;
        }
        if (inviteTransaction.getCSeq() == j10) {
            acquireTimerTaskSem();
            try {
                if (this.timerTask != null) {
                    getStack().getTimer().cancel(this.timerTask);
                    this.timerTask = null;
                }
                releaseTimerTaskSem();
                if (this.dialogDeleteTask != null) {
                    getStack().getTimer().cancel(this.dialogDeleteTask);
                    this.dialogDeleteTask = null;
                }
                this.lastAckReceivedCSeqNumber = Long.valueOf(j10);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("ackReceived for " + inviteTransaction.getMethod());
                    this.ackLine = logger.getLineCount();
                    printDebugInfo();
                }
                if (this.isBackToBackUserAgent) {
                    releaseAckSem();
                }
                setState(1);
            } catch (Throwable th2) {
                releaseTimerTaskSem();
                throw th2;
            }
        }
    }

    public void acquireTimerTaskSem() {
        boolean zTryAcquire;
        try {
            zTryAcquire = this.timerTaskLock.tryAcquire(10L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zTryAcquire = false;
        }
        if (!zTryAcquire) {
            throw new IllegalStateException("Impossible to acquire the dialog timer task lock");
        }
    }

    public void addEventListener(SIPDialogEventListener sIPDialogEventListener) {
        this.eventListeners.add(sIPDialogEventListener);
    }

    public boolean addTransaction(SIPTransaction sIPTransaction) {
        SIPRequest originalRequest = sIPTransaction.getOriginalRequest();
        if (this.firstTransactionSeen && !this.firstTransactionId.equals(sIPTransaction.getBranchId()) && sIPTransaction.getMethod().equals(this.firstTransactionMethod)) {
            setReInviteFlag(true);
            this.ackProcessed = false;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SipDialog.addTransaction() " + this + " transaction = " + sIPTransaction);
        }
        if (!this.firstTransactionSeen) {
            storeFirstTransactionInfo(this, sIPTransaction);
            if (originalRequest.getMethod().equals(TokenNames.SUBSCRIBE)) {
                this.eventHeader = (InterfaceC13246t) originalRequest.getHeader(SIPHeaderNames.EVENT);
            }
            setLocalParty(originalRequest);
            setRemoteParty(originalRequest);
            setCallId(originalRequest);
            if (this.originalRequest == null && sIPTransaction.isInviteTransaction()) {
                this.originalRequest = originalRequest;
            } else if (this.originalRequest != null) {
                this.originalRequestRecordRouteHeaders = originalRequest.getRecordRouteHeaders();
            }
            if (this.method == null) {
                this.method = originalRequest.getMethod();
            }
            if (sIPTransaction instanceof SIPServerTransaction) {
                this.hisTag = originalRequest.getFrom().getTag();
            } else {
                setLocalSequenceNumber(originalRequest.getCSeq().getSeqNumber());
                this.originalLocalSequenceNumber = getLocalSeqNumber();
                setLocalTag(originalRequest.getFrom().getTag());
                if (this.myTag == null && logger.isLoggingEnabled()) {
                    logger.logError("The request's From header is missing the required Tag parameter.");
                }
            }
        } else if (sIPTransaction.getMethod().equals(this.firstTransactionMethod) && this.firstTransactionIsServerTransaction != sIPTransaction.isServerTransaction()) {
            storeFirstTransactionInfo(this, sIPTransaction);
            setLocalParty(originalRequest);
            setRemoteParty(originalRequest);
            setCallId(originalRequest);
            if (sIPTransaction.isInviteTransaction()) {
                this.originalRequest = originalRequest;
            } else {
                this.originalRequestRecordRouteHeaders = originalRequest.getRecordRouteHeaders();
            }
            this.method = originalRequest.getMethod();
        } else if (this.firstTransaction == null && sIPTransaction.isInviteTransaction()) {
            this.firstTransaction = sIPTransaction;
        }
        if (sIPTransaction instanceof SIPServerTransaction) {
            setRemoteSequenceNumber(originalRequest.getCSeq().getSeqNumber());
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("isBackToBackUserAgent = " + this.isBackToBackUserAgent);
        }
        if (sIPTransaction.isInviteTransaction()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::setLastTransaction:dialog= " + this + " lastTransaction = " + sIPTransaction);
            }
            this.lastTransaction = sIPTransaction;
        }
        try {
            if (sIPTransaction.getRequest().getMethod().equals("REFER") && (sIPTransaction instanceof SIPServerTransaction)) {
                long seqNumber = ((SIPRequest) sIPTransaction.getRequest()).getCSeq().getSeqNumber();
                Event event = new Event();
                this.eventHeader = event;
                event.setEventType(ReferencesHeader.REFER);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::setLastTransaction:lastReferCSeq = " + seqNumber);
                }
                this.eventHeader.setEventId(Long.toString(seqNumber));
            }
        } catch (Exception unused) {
            logger.logFatalError("Unexpected exception in REFER processing");
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Transaction Added " + this + this.myTag + Separators.SLASH + this.hisTag);
            logger.logDebug("TID = " + sIPTransaction.getTransactionId() + Separators.SLASH + sIPTransaction.isServerTransaction());
            logger.logStackTrace();
        }
        return true;
    }

    public void cleanUp() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            cleanUpOnAck();
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("dialog cleanup : " + getDialogId());
            }
            Set<SIPDialogEventListener> set = this.eventListeners;
            if (set != null) {
                set.clear();
            }
            this.timerTaskLock = null;
            this.ackSem = null;
            this.contactHeader = null;
            this.eventHeader = null;
            this.firstTransactionId = null;
            this.firstTransactionMethod = null;
            this.lastResponseDialogId = null;
            this.lastResponseMethod = null;
            this.lastResponseTopMostVia = null;
            RecordRouteList recordRouteList = this.originalRequestRecordRouteHeaders;
            if (recordRouteList != null) {
                recordRouteList.clear();
                this.originalRequestRecordRouteHeaders = null;
                this.originalRequestRecordRouteHeadersString = null;
            }
            RouteList routeList = this.routeList;
            if (routeList != null) {
                routeList.clear();
                this.routeList = null;
            }
            this.responsesReceivedInForkingCase.clear();
        }
    }

    public void cleanUpOnAck() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanupOnAck : " + getDialogId());
            }
            if (this.originalRequest != null) {
                RecordRouteList recordRouteList = this.originalRequestRecordRouteHeaders;
                if (recordRouteList != null) {
                    this.originalRequestRecordRouteHeadersString = recordRouteList.toString();
                }
                this.originalRequestRecordRouteHeaders = null;
                this.originalRequest = null;
            }
            SIPTransaction sIPTransaction = this.firstTransaction;
            if (sIPTransaction != null) {
                if (sIPTransaction.getOriginalRequest() != null) {
                    this.firstTransaction.getOriginalRequest().cleanUp();
                }
                this.firstTransaction = null;
            }
            SIPTransaction sIPTransaction2 = this.lastTransaction;
            if (sIPTransaction2 != null) {
                if (sIPTransaction2.getOriginalRequest() != null) {
                    this.lastTransaction.getOriginalRequest().cleanUp();
                }
                this.lastTransaction = null;
            }
            InterfaceC13236j interfaceC13236j = this.callIdHeader;
            if (interfaceC13236j != null) {
                this.callIdHeaderString = interfaceC13236j.toString();
                this.callIdHeader = null;
            }
            Contact contact = this.contactHeader;
            if (contact != null) {
                this.contactHeaderStringified = contact.toString();
                this.contactHeader = null;
            }
            InterfaceC12942a interfaceC12942a = this.remoteTarget;
            if (interfaceC12942a != null) {
                this.remoteTargetStringified = interfaceC12942a.toString();
                this.remoteTarget = null;
            }
            InterfaceC12942a interfaceC12942a2 = this.remoteParty;
            if (interfaceC12942a2 != null) {
                this.remotePartyStringified = interfaceC12942a2.toString();
                this.remoteParty = null;
            }
            InterfaceC12942a interfaceC12942a3 = this.localParty;
            if (interfaceC12942a3 != null) {
                this.localPartyStringified = interfaceC12942a3.toString();
                this.localParty = null;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC13462c createReliableProvisionalResponse(int i10) throws C10807n, C10800g {
        ListIterator<SIPHeader> headers;
        if (!this.firstTransactionIsServerTransaction) {
            throw new C10807n("Not a Server Dialog!");
        }
        if (i10 <= 100 || i10 > 199) {
            throw new C10800g("Bad status code ");
        }
        SIPRequest sIPRequest = this.originalRequest;
        if (!sIPRequest.getMethod().equals(TokenNames.INVITE)) {
            throw new C10807n("Bad method");
        }
        ListIterator<SIPHeader> headers2 = sIPRequest.getHeaders(SIPHeaderNames.SUPPORTED);
        if ((headers2 == null || !optionPresent(headers2, "100rel")) && ((headers = sIPRequest.getHeaders(SIPHeaderNames.REQUIRE)) == null || !optionPresent(headers, "100rel"))) {
            throw new C10807n("No Supported/Require 100rel header in the request");
        }
        SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(i10);
        Require require = new Require();
        try {
            require.setOptionTag("100rel");
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
        }
        sIPResponseCreateResponse.addHeader(require);
        new RSeq().setSeqNumber(1L);
        RecordRouteList recordRouteHeaders = sIPRequest.getRecordRouteHeaders();
        if (recordRouteHeaders != null) {
            sIPResponseCreateResponse.setHeader((InterfaceC13250x) recordRouteHeaders.clone());
        }
        return sIPResponseCreateResponse;
    }

    @Override // android.javax.sip.InterfaceC10795b
    public InterfaceC13461b createRequest(String str) throws C10807n {
        if (str.equals(TokenNames.ACK) || str.equals("PRACK")) {
            throw new C10807n("Invalid method specified for createRequest:".concat(str));
        }
        Via via = this.lastResponseTopMostVia;
        if (via != null) {
            return createRequest(str, via.getTransport());
        }
        throw new C10807n("Dialog not yet established -- no response!");
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void delete() {
        setState(3);
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void disableSequenceNumberValidation() {
        this.sequenceNumberValidation = false;
    }

    public void doDeferredDelete() {
        if (this.sipStack.getTimer() == null) {
            setState(3);
            return;
        }
        this.dialogDeleteTask = new DialogDeleteTask();
        if (this.sipStack.getTimer() == null || !this.sipStack.getTimer().isStarted()) {
            delete();
        } else {
            SIPTransaction sIPTransaction = this.lastTransaction;
            this.sipStack.getTimer().schedule(this.dialogDeleteTask, (sIPTransaction != null ? sIPTransaction.getBaseTimerInterval() : 500) * 64);
        }
    }

    public synchronized void doDeferredDeleteIfNoAckSent(long j10) {
        try {
            if (this.sipStack.getTimer() == null) {
                setState(3);
            } else if (this.dialogDeleteIfNoAckSentTask == null) {
                this.dialogDeleteIfNoAckSentTask = new DialogDeleteIfNoAckSentTask(j10);
                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                    SIPTransaction sIPTransaction = this.lastTransaction;
                    this.sipStack.getTimer().schedule(this.dialogDeleteIfNoAckSentTask, this.sipStack.getAckTimeoutFactor() * (sIPTransaction != null ? sIPTransaction.getBaseTimerInterval() : 500));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public Object getApplicationData() {
        return this.applicationData;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC13236j getCallId() {
        if (this.callIdHeader == null && this.callIdHeaderString != null) {
            try {
                this.callIdHeader = (InterfaceC13236j) new CallIDParser(this.callIdHeaderString).parse();
            } catch (ParseException e10) {
                logger.logError("error reparsing the call id header", e10);
            }
        }
        return this.callIdHeader;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public String getDialogId() {
        String str;
        if (this.dialogId == null && (str = this.lastResponseDialogId) != null) {
            this.dialogId = str;
        }
        return this.dialogId;
    }

    public String getEarlyDialogId() {
        return this.earlyDialogId;
    }

    public InterfaceC13246t getEventHeader() {
        return this.eventHeader;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    @Deprecated
    public InterfaceC10814u getFirstTransaction() {
        throw new UnsupportedOperationException("This method has been deprecated and is no longer supported");
    }

    public InterfaceC10814u getFirstTransactionInt() {
        SIPTransaction sIPTransaction = this.firstTransaction;
        return sIPTransaction != null ? sIPTransaction : this.sipStack.findTransaction(this.firstTransactionId, this.firstTransactionIsServerTransaction);
    }

    public SIPServerTransaction getInviteTransaction() {
        DialogTimerTask dialogTimerTask = this.timerTask;
        if (dialogTimerTask != null) {
            return dialogTimerTask.transaction;
        }
        return null;
    }

    public InterfaceC13234i getLastAckSentCSeq() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            return aCKWrapper.getCSeq();
        }
        return null;
    }

    public String getLastAckSentDialogId() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            return aCKWrapper.getDialogId();
        }
        return null;
    }

    public String getLastAckSentFromTag() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            return aCKWrapper.getFromTag();
        }
        return null;
    }

    public long getLastResponseCSeqNumber() {
        return this.lastResponseCSeqNumber;
    }

    public String getLastResponseMethod() {
        return this.lastResponseMethod;
    }

    public Integer getLastResponseStatusCode() {
        return this.lastResponseStatusCode;
    }

    public Via getLastResponseTopMostVia() {
        return this.lastResponseTopMostVia;
    }

    public SIPTransaction getLastTransaction() {
        return this.lastTransaction;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC12942a getLocalParty() {
        if (this.localParty == null && this.localPartyStringified != null) {
            try {
                this.localParty = new AddressParser(this.localPartyStringified).address(true);
            } catch (ParseException e10) {
                logger.logError("error reparsing the localParty", e10);
            }
        }
        return this.localParty;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public long getLocalSeqNumber() {
        return this.localSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public int getLocalSequenceNumber() {
        return (int) this.localSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public String getLocalTag() {
        return this.myTag;
    }

    public String getMergeId() {
        return this.firstTransactionMergeId;
    }

    public String getMethod() {
        return this.method;
    }

    public Contact getMyContactHeader() {
        if (this.contactHeader == null && this.contactHeaderStringified != null) {
            try {
                this.contactHeader = (Contact) new ContactParser(this.contactHeaderStringified).parse();
            } catch (ParseException e10) {
                logger.logError("error reparsing the contact header", e10);
            }
        }
        return this.contactHeader;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC10795b getOriginalDialog() {
        return this.originalDialog;
    }

    public long getOriginalLocalSequenceNumber() {
        return this.originalLocalSequenceNumber;
    }

    public RecordRouteList getOriginalRequestRecordRouteHeaders() {
        if (this.originalRequestRecordRouteHeaders == null && this.originalRequestRecordRouteHeadersString != null) {
            try {
                this.originalRequestRecordRouteHeaders = (RecordRouteList) new RecordRouteParser(this.originalRequestRecordRouteHeadersString).parse();
            } catch (ParseException e10) {
                logger.logError("error reparsing the originalRequest RecordRoute Headers", e10);
            }
            this.originalRequestRecordRouteHeadersString = null;
        }
        return this.originalRequestRecordRouteHeaders;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public ReleaseReferencesStrategy getReleaseReferencesStrategy() {
        return this.releaseReferencesStrategy;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC12942a getRemoteParty() {
        if (this.remoteParty == null && this.remotePartyStringified != null) {
            try {
                this.remoteParty = new AddressParser(this.remotePartyStringified).address(true);
            } catch (ParseException e10) {
                logger.logError("error reparsing the remoteParty", e10);
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("gettingRemoteParty " + this.remoteParty);
        }
        return this.remoteParty;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public long getRemoteSeqNumber() {
        return this.remoteSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public int getRemoteSequenceNumber() {
        return (int) this.remoteSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public String getRemoteTag() {
        return this.hisTag;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC12942a getRemoteTarget() {
        if (this.remoteTarget == null && this.remoteTargetStringified != null) {
            try {
                this.remoteTarget = new AddressParser(this.remoteTargetStringified).address(true);
            } catch (ParseException e10) {
                logger.logError("error reparsing the remoteTarget", e10);
            }
        }
        return this.remoteTarget;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public Iterator getRouteSet() {
        return this.routeList == null ? new LinkedList().listIterator() : getRouteList().listIterator();
    }

    public SIPTransactionStack getStack() {
        return this.sipStack;
    }

    @Override // android.javax.sip.InterfaceC10795b
    public C10797d getState() {
        int i10 = this.dialogState;
        if (i10 == -1) {
            return null;
        }
        C10797d[] c10797dArr = C10797d.f32032Z;
        if (i10 < 0 || i10 >= 4) {
            throw new IllegalArgumentException("Invalid dialogState value");
        }
        return C10797d.f32032Z[i10];
    }

    public boolean handleAck(SIPServerTransaction sIPServerTransaction) {
        if (isAckSeen() && getRemoteSeqNumber() == sIPServerTransaction.getCSeq()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::handleAck: ACK already seen by dialog -- dropping Ack retransmission");
            }
            acquireTimerTaskSem();
            try {
                if (this.timerTask != null) {
                    getStack().getTimer().cancel(this.timerTask);
                    this.timerTask = null;
                }
                return false;
            } finally {
                releaseTimerTaskSem();
            }
        }
        if (getState() == C10797d.f32035q0) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::handleAck: Dialog is terminated -- dropping ACK");
            }
            return false;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPDialog::handleAck: lastResponseCSeqNumber = " + this.lastInviteOkReceived + " ackTxCSeq " + sIPServerTransaction.getCSeq());
        }
        if (this.lastResponseStatusCode == null || this.lastInviteResponseCode / 100 != 2 || this.lastInviteResponseCSeqNumber != sIPServerTransaction.getCSeq()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(" INVITE transaction not found");
            }
            if (isBackToBackUserAgent()) {
                releaseAckSem();
            }
            return false;
        }
        sIPServerTransaction.setDialog(this, this.lastResponseDialogId);
        ackReceived(sIPServerTransaction.getCSeq());
        if (!logger.isLoggingEnabled(32)) {
            return true;
        }
        logger.logDebug("SIPDialog::handleACK: ACK for 2XX response --- sending to TU ");
        return true;
    }

    public boolean handlePrack(SIPRequest sIPRequest) {
        if (!isServer()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- not a server Dialog");
            }
            return false;
        }
        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) getFirstTransactionInt();
        if (sIPServerTransaction.getReliableProvisionalResponse() == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- ReliableResponse not found");
            }
            return false;
        }
        RAck rAck = (RAck) sIPRequest.getHeader(SIPHeaderNames.RACK);
        if (rAck == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- rack header not found");
            }
            return false;
        }
        if (!rAck.getMethod().equals(sIPServerTransaction.getPendingReliableResponseMethod())) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- CSeq Header does not match PRACK");
            }
            return false;
        }
        if (rAck.getCSeqNumberLong() != sIPServerTransaction.getPendingReliableCSeqNumber()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- CSeq Header does not match PRACK");
            }
            return false;
        }
        if (rAck.getRSequenceNumber() == sIPServerTransaction.getPendingReliableRSeqNumber()) {
            return sIPServerTransaction.prackRecieved();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Dropping Prack -- RSeq Header does not match PRACK");
        }
        return false;
    }

    public int hashCode() {
        if (this.callIdHeader == null && this.callIdHeaderString == null) {
            return 0;
        }
        return getCallId().getCallId().hashCode();
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void incrementLocalSequenceNumber() {
        this.localSequenceNumber++;
    }

    public boolean isAckSeen() {
        if (this.lastAckReceivedCSeqNumber == null && this.lastResponseStatusCode.intValue() == 200) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::isAckSeen:" + this + "lastAckReceived is null -- returning false");
            }
            return false;
        }
        if (this.lastResponseMethod == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::isAckSeen:" + this + "lastResponse is null -- returning false");
            }
            return false;
        }
        if (this.lastAckReceivedCSeqNumber == null && this.lastResponseStatusCode.intValue() / 100 > 2) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::isAckSeen:" + this + "lastResponse statusCode " + this.lastResponseStatusCode);
            }
            return true;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPDialog::isAckSeen:lastAckReceivedCSeqNumber = " + this.lastAckReceivedCSeqNumber + " remoteCSeqNumber = " + getRemoteSeqNumber());
        }
        Long l4 = this.lastAckReceivedCSeqNumber;
        return l4 != null && l4.longValue() >= getRemoteSeqNumber();
    }

    public boolean isAckSent() {
        return isAckSent(-1L);
    }

    public boolean isAssigned() {
        return this.isAssigned;
    }

    public boolean isAtleastOneAckSent() {
        return this.isAcknowledged;
    }

    public boolean isBackToBackUserAgent() {
        return this.isBackToBackUserAgent;
    }

    public boolean isBlockedForReInvite() {
        return this.ackSem.availablePermits() == 0;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public boolean isForked() {
        return this.originalDialog != null;
    }

    public boolean isLastAckPresent() {
        return this.lastAckSent != null;
    }

    public boolean isReInvite() {
        return this.reInviteFlag;
    }

    public synchronized boolean isRequestConsumable(SIPRequest sIPRequest) {
        if (sIPRequest.getMethod().equals(TokenNames.ACK)) {
            throw new RuntimeException("Illegal method");
        }
        if (isSequenceNumberValidation()) {
            return this.remoteSequenceNumber < sIPRequest.getCSeq().getSeqNumber();
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public boolean isSecure() {
        return this.firstTransactionSecure;
    }

    public boolean isSequenceNumberValidation() {
        return this.sequenceNumberValidation;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public boolean isServer() {
        return !this.firstTransactionSeen ? this.serverTransactionFlag : this.firstTransactionIsServerTransaction;
    }

    public boolean isTerminatedOnBye() {
        return this.terminateOnBye;
    }

    public void printDebugInfo() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("isServer = " + isServer());
            logger.logDebug("localTag = " + getLocalTag());
            logger.logDebug("remoteTag = " + getRemoteTag());
            logger.logDebug("localSequenceNumer = " + getLocalSeqNumber());
            logger.logDebug("remoteSequenceNumer = " + getRemoteSeqNumber());
            logger.logDebug("ackLine:" + getRemoteTag() + Separators.f31991SP + this.ackLine);
        }
    }

    public void releaseAckSem() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("releaseAckSem-enter]]" + this + " sem=" + this.ackSem + " b2bua=" + this.isBackToBackUserAgent);
            logger.logStackTrace();
        }
        if (this.isBackToBackUserAgent) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("releaseAckSem]]" + this + " sem=" + this.ackSem);
                logger.logStackTrace();
            }
            if (this.ackSem.availablePermits() == 0) {
                this.ackSem.release();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("releaseAckSem]]" + this + " sem=" + this.ackSem);
                }
            }
        }
    }

    public void releaseTimerTaskSem() {
        this.timerTaskLock.release();
    }

    public void removeEventListener(SIPDialogEventListener sIPDialogEventListener) {
        this.eventListeners.remove(sIPDialogEventListener);
    }

    public synchronized void requestConsumed() {
        this.nextSeqno = getRemoteSeqNumber() + 1;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Request Consumed -- next consumable Request Seqno = " + this.nextSeqno);
        }
    }

    public void resendAck() throws C10807n {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::resendAck:lastAck sent is NULL hence not resending ACK");
                return;
            }
            return;
        }
        InterfaceC13461b interfaceC13461bReparseRequest = aCKWrapper.reparseRequest();
        if (interfaceC13461bReparseRequest.getHeader(SIPHeaderNames.TIMESTAMP) != null && this.sipStack.generateTimeStampHeader) {
            TimeStamp timeStamp = new TimeStamp();
            try {
                timeStamp.setTimeStamp(System.currentTimeMillis());
                interfaceC13461bReparseRequest.setHeader(timeStamp);
            } catch (C10800g unused) {
            }
        }
        sendAck(interfaceC13461bReparseRequest, false);
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void sendRequest(InterfaceC10794a interfaceC10794a) throws C10807n {
        sendRequest(interfaceC10794a, !this.isBackToBackUserAgent);
    }

    public void setAckSendingStrategy(AckSendingStrategy ackSendingStrategy) {
        this.ackSendingStrategy = ackSendingStrategy;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setApplicationData(Object obj) {
        this.applicationData = obj;
    }

    public void setAssigned() {
        this.isAssigned = true;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setBackToBackUserAgent() {
        this.isBackToBackUserAgent = true;
    }

    public void setDialogId(String str) {
        SIPTransaction sIPTransaction = this.firstTransaction;
        if (sIPTransaction != null) {
            sIPTransaction.setDialog(this, str);
        }
        this.dialogId = str;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setEarlyDialogTimeoutSeconds(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid value "));
        }
        this.earlyDialogTimeout = i10;
    }

    public void setEventHeader(InterfaceC13246t interfaceC13246t) {
        this.eventHeader = interfaceC13246t;
    }

    public void setLastResponse(SIPTransaction sIPTransaction, SIPResponse sIPResponse) throws Throwable {
        boolean z6;
        boolean z10;
        this.callIdHeader = sIPResponse.getCallId();
        int statusCode = sIPResponse.getStatusCode();
        if (statusCode == 100) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Invalid status code - 100 in setLastResponse - ignoring");
                return;
            }
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
        }
        try {
            this.lastResponseStatusCode = Integer.valueOf(statusCode);
            this.lastResponseTopMostVia = (Via) sIPResponse.getTopmostVia().clone();
            String method = sIPResponse.getCSeqHeader().getMethod();
            this.lastResponseMethod = method;
            long seqNumber = sIPResponse.getCSeq().getSeqNumber();
            boolean z11 = statusCode / 100 == 1;
            boolean z12 = statusCode / 100 == 2;
            this.lastResponseCSeqNumber = seqNumber;
            if (TokenNames.INVITE.equals(method)) {
                this.lastInviteResponseCSeqNumber = seqNumber;
                this.lastInviteResponseCode = statusCode;
            }
            if (sIPResponse.getToTag() != null) {
                this.lastResponseToTag = sIPResponse.getToTag();
            }
            if (sIPResponse.getFromTag() != null) {
                this.lastResponseFromTag = sIPResponse.getFromTag();
            }
            if (sIPTransaction != null) {
                this.lastResponseDialogId = sIPResponse.getDialogId(sIPTransaction.isServerTransaction());
            }
            setAssigned();
            try {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("sipDialog: setLastResponse:" + this + " lastResponse = " + this.lastResponseStatusCode + " response " + sIPResponse.toString() + " topMostViaHeader " + this.lastResponseTopMostVia);
                }
                C10797d state = getState();
                C10797d c10797d = C10797d.f32035q0;
                if (state == c10797d) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("sipDialog: setLastResponse -- dialog is terminated - ignoring ");
                    }
                    if (method.equals(TokenNames.INVITE) && statusCode == 200) {
                        this.lastInviteOkReceived = Math.max(seqNumber, this.lastInviteOkReceived);
                    }
                    if (!sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) || sIPTransaction == null || !(sIPTransaction instanceof InterfaceC10794a) || getState() == c10797d) {
                        return;
                    }
                    acquireTimerTaskSem();
                    try {
                        if (getState() == C10797d.f32033o0) {
                            if (this.earlyStateTimerTask != null) {
                                this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                            }
                            logger.logDebug("EarlyStateTimerTask craeted " + (this.earlyDialogTimeout * 1000));
                            this.earlyStateTimerTask = new EarlyStateTimerTask();
                            if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                                this.sipStack.getTimer().schedule(this.earlyStateTimerTask, this.earlyDialogTimeout * 1000);
                            }
                        } else if (this.earlyStateTimerTask != null) {
                            this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                            this.earlyStateTimerTask = null;
                        }
                        return;
                    } finally {
                        releaseTimerTaskSem();
                    }
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                    logger.logDebug("cseqMethod = " + method);
                    logger.logDebug("dialogState = " + getState());
                    logger.logDebug("method = " + getMethod());
                    logger.logDebug("statusCode = " + statusCode);
                    logger.logDebug("transaction = " + sIPTransaction);
                }
                try {
                    if (sIPTransaction == null || (sIPTransaction instanceof InterfaceC10794a)) {
                        if (SIPTransactionStack.isDialogCreated(method)) {
                            if (getState() == null && z11) {
                                setState(0);
                                if ((sIPResponse.getToTag() != null || this.sipStack.rfc2543Supported) && getRemoteTag() == null) {
                                    setRemoteTag(sIPResponse.getToTag());
                                    setDialogId(sIPResponse.getDialogId(false));
                                    this.sipStack.putDialog(this);
                                    addRoute(sIPResponse);
                                }
                            } else if (getState() != null && getState().equals(C10797d.f32033o0) && z11) {
                                if (method.equals(getMethod()) && sIPTransaction != null && (sIPResponse.getToTag() != null || this.sipStack.rfc2543Supported)) {
                                    setRemoteTag(sIPResponse.getToTag());
                                    setDialogId(sIPResponse.getDialogId(false));
                                    this.sipStack.putDialog(this);
                                    addRoute(sIPResponse);
                                }
                            } else if (z12) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("pendingRouteUpdateOn202Response : " + this.pendingRouteUpdateOn202Response);
                                }
                                if (method.equals(getMethod()) && (sIPResponse.getToTag() != null || this.sipStack.rfc2543Supported)) {
                                    C10797d state2 = getState();
                                    C10797d c10797d2 = C10797d.f32034p0;
                                    if (state2 != c10797d2 || (getState() == c10797d2 && method.equals(TokenNames.SUBSCRIBE) && this.pendingRouteUpdateOn202Response && z12)) {
                                        if (getState() != c10797d2) {
                                            setRemoteTag(sIPResponse.getToTag());
                                            setDialogId(sIPResponse.getDialogId(false));
                                            this.sipStack.putDialog(this);
                                            addRoute(sIPResponse);
                                            setState(1);
                                        }
                                        if (method.equals(TokenNames.SUBSCRIBE) && z12 && this.pendingRouteUpdateOn202Response) {
                                            setRemoteTag(sIPResponse.getToTag());
                                            addRoute(sIPResponse);
                                            this.pendingRouteUpdateOn202Response = false;
                                        }
                                    }
                                }
                                if (method.equals(TokenNames.INVITE)) {
                                    this.lastInviteOkReceived = Math.max(seqNumber, this.lastInviteOkReceived);
                                    if (getState() != null && getState().f32036Y == 1 && sIPTransaction != null) {
                                        doTargetRefresh(sIPResponse);
                                    }
                                }
                            } else if (statusCode >= 300 && statusCode <= 699 && (getState() == null || (method.equals(getMethod()) && getState().f32036Y == 0))) {
                                setState(3);
                            }
                            if (getState() != C10797d.f32034p0 && getState() != c10797d && getOriginalRequestRecordRouteHeaders() != null) {
                                ListIterator<RecordRoute> listIterator = getOriginalRequestRecordRouteHeaders().listIterator(getOriginalRequestRecordRouteHeaders().size());
                                while (listIterator.hasPrevious()) {
                                    RecordRoute recordRoutePrevious = listIterator.previous();
                                    Route route = (Route) this.routeList.getFirst();
                                    if (route == null || !recordRoutePrevious.getAddress().equals(route.getAddress())) {
                                        break;
                                    } else {
                                        this.routeList.removeFirst();
                                    }
                                }
                            }
                        } else if (method.equals(TokenNames.NOTIFY) && ((getMethod().equals(TokenNames.SUBSCRIBE) || getMethod().equals("REFER")) && z12 && getState() == null)) {
                            setDialogId(sIPResponse.getDialogId(true));
                            this.sipStack.putDialog(this);
                            setState(1);
                        } else if (method.equals(TokenNames.BYE) && z12 && isTerminatedOnBye()) {
                            setState(3);
                        }
                    } else if (method.equals(TokenNames.BYE) && z12 && isTerminatedOnBye()) {
                        setState(3);
                    } else {
                        if (getLocalTag() == null && sIPResponse.getTo().getTag() != null && SIPTransactionStack.isDialogCreated(method) && method.equals(getMethod())) {
                            setLocalTag(sIPResponse.getTo().getTag());
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z12) {
                            if (this.dialogState > 0 || !(method.equals(TokenNames.INVITE) || method.equals(TokenNames.SUBSCRIBE) || method.equals("REFER"))) {
                                z10 = true;
                            } else {
                                z10 = true;
                                setState(1);
                            }
                            if (z6) {
                                setDialogId(sIPResponse.getDialogId(z10));
                                this.sipStack.putDialog(this);
                            }
                        } else if (z11) {
                            if (z6) {
                                setState(0);
                                setDialogId(sIPResponse.getDialogId(true));
                                this.sipStack.putDialog(this);
                            }
                        } else if (statusCode == 489 && (method.equals(TokenNames.NOTIFY) || method.equals(TokenNames.SUBSCRIBE))) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("RFC 3265 : Not setting dialog to TERMINATED for 489");
                            }
                        } else if (!isReInvite() && getState() != C10797d.f32034p0) {
                            setState(3);
                        }
                    }
                    if (!sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) || sIPTransaction == null || !(sIPTransaction instanceof InterfaceC10794a) || getState() == C10797d.f32035q0) {
                        return;
                    }
                    acquireTimerTaskSem();
                    try {
                        if (getState() == C10797d.f32033o0) {
                            if (this.earlyStateTimerTask != null) {
                                this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                            }
                            logger.logDebug("EarlyStateTimerTask craeted " + (this.earlyDialogTimeout * 1000));
                            this.earlyStateTimerTask = new EarlyStateTimerTask();
                            if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                                this.sipStack.getTimer().schedule(this.earlyStateTimerTask, this.earlyDialogTimeout * 1000);
                            }
                        } else if (this.earlyStateTimerTask != null) {
                            this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                            this.earlyStateTimerTask = null;
                        }
                    } finally {
                        releaseTimerTaskSem();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) && sIPTransaction != null && (sIPTransaction instanceof InterfaceC10794a) && getState() != C10797d.f32035q0) {
                        acquireTimerTaskSem();
                        try {
                            if (getState() == C10797d.f32033o0) {
                                if (this.earlyStateTimerTask != null) {
                                    this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                }
                                logger.logDebug("EarlyStateTimerTask craeted " + (this.earlyDialogTimeout * 1000));
                                this.earlyStateTimerTask = new EarlyStateTimerTask();
                                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                                    this.sipStack.getTimer().schedule(this.earlyStateTimerTask, this.earlyDialogTimeout * 1000);
                                }
                            } else if (this.earlyStateTimerTask != null) {
                                this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                this.earlyStateTimerTask = null;
                            }
                        } finally {
                            releaseTimerTaskSem();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void setLocalParty(SIPMessage sIPMessage) {
        if (isServer()) {
            this.localParty = sIPMessage.getTo().getAddress();
        } else {
            this.localParty = sIPMessage.getFrom().getAddress();
        }
    }

    public void setLocalTag(String str) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("set Local tag " + str + " dialog = " + this);
            logger.logStackTrace();
        }
        this.myTag = str;
    }

    public void setOriginalDialog(SIPDialog sIPDialog) {
        this.originalDialog = sIPDialog;
    }

    public void setPendingRouteUpdateOn202Response(SIPRequest sIPRequest) {
        this.pendingRouteUpdateOn202Response = true;
        String tag = sIPRequest.getFromHeader().getTag();
        if (tag != null) {
            setRemoteTag(tag);
        }
    }

    public void setReInviteFlag(boolean z6) {
        this.reInviteFlag = z6;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy) {
        this.releaseReferencesStrategy = releaseReferencesStrategy;
    }

    public void setRemoteParty(SIPMessage sIPMessage) {
        if (isServer()) {
            this.remoteParty = sIPMessage.getFrom().getAddress();
        } else {
            this.remoteParty = sIPMessage.getTo().getAddress();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("settingRemoteParty " + this.remoteParty);
        }
    }

    public void setRemoteSequenceNumber(long j10) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setRemoteSeqno " + this + Separators.SLASH + j10);
        }
        this.remoteSequenceNumber = j10;
    }

    public void setRemoteTag(String str) {
        boolean z6;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setRemoteTag(): " + this + " remoteTag = " + this.hisTag + " new tag = " + str);
        }
        String str2 = this.hisTag;
        if (str2 == null || str == null || str.equals(str2)) {
            if (str != null) {
                this.hisTag = str;
                return;
            } else {
                if (logger.isLoggingEnabled()) {
                    logger.logWarning("setRemoteTag : called with null argument ");
                    return;
                }
                return;
            }
        }
        if (getState() != C10797d.f32033o0) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dialog is already established -- ignoring remote tag re-assignment");
                return;
            }
            return;
        }
        if (this.sipStack.isRemoteTagReassignmentAllowed()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("UNSAFE OPERATION !  tag re-assignment " + this.hisTag + " trying to set to " + str + " can cause unexpected effects ");
            }
            if (this.sipStack.getDialog(this.dialogId) == this) {
                this.sipStack.removeDialog(this.dialogId);
                z6 = true;
            } else {
                z6 = false;
            }
            this.dialogId = null;
            this.hisTag = str;
            if (z6) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("ReInserting Dialog");
                }
                this.sipStack.putDialog(this);
            }
        }
    }

    public void setRemoteTarget(InterfaceC13238l interfaceC13238l) {
        this.remoteTarget = interfaceC13238l.getAddress();
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Dialog.setRemoteTarget: " + this.remoteTarget);
            logger.logStackTrace();
        }
    }

    public void setResponseTags(SIPResponse sIPResponse) {
        if (getLocalTag() == null && getRemoteTag() == null) {
            String fromTag = sIPResponse.getFromTag();
            if (fromTag == null) {
                if (logger.isLoggingEnabled()) {
                    logger.logWarning("No from tag in response! Not RFC 3261 compatible.");
                }
            } else if (fromTag.equals(getLocalTag())) {
                sIPResponse.setToTag(getRemoteTag());
            } else if (fromTag.equals(getRemoteTag())) {
                sIPResponse.setToTag(getLocalTag());
            }
        }
    }

    public void setRetransmissionTicks() {
        this.retransmissionTicksLeft = 1;
        this.prevRetransmissionTicks = 1;
    }

    public void setRouteList(RouteList routeList) {
        this.routeList = routeList;
    }

    public void setServerTransactionFlag(boolean z6) {
        this.serverTransactionFlag = z6;
    }

    public void setSipProvider(SipProviderImpl sipProviderImpl) {
        this.sipProvider = sipProviderImpl;
    }

    public void setStack(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
    }

    public void setState(int i10) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPDialog::setState:Setting dialog state for " + this + "newState = " + i10);
            logger.logStackTrace();
            if (i10 != -1 && i10 != this.dialogState && logger.isLoggingEnabled()) {
                logger.logDebug("SIPDialog::setState:" + this + "  old dialog state is " + getState());
                StackLogger stackLogger = logger;
                StringBuilder sb2 = new StringBuilder("SIPDialog::setState:");
                sb2.append(this);
                sb2.append("  New dialog state is ");
                C10797d[] c10797dArr = C10797d.f32032Z;
                if (i10 < 0 || i10 >= 4) {
                    throw new IllegalArgumentException("Invalid dialogState value");
                }
                sb2.append(C10797d.f32032Z[i10]);
                stackLogger.logDebug(sb2.toString());
            }
        }
        if (i10 == 0) {
            addEventListener(getSipProvider());
        }
        this.dialogState = i10;
        if (i10 == 3) {
            removeEventListener(getSipProvider());
            if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                if (this.sipStack.getConnectionLingerTimer() > 0) {
                    this.sipStack.getTimer().schedule(new LingerTimer(), this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    new LingerTimer().runTask();
                }
            }
            stopTimer();
        }
    }

    public void startRetransmitTimer(SIPServerTransaction sIPServerTransaction, InterfaceC13462c interfaceC13462c) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("startRetransmitTimer() " + interfaceC13462c.getStatusCode() + " method " + sIPServerTransaction.getMethod());
        }
        if (sIPServerTransaction.isInviteTransaction() && interfaceC13462c.getStatusCode() / 100 == 2) {
            startTimer(sIPServerTransaction);
        }
    }

    public void startTimer(SIPServerTransaction sIPServerTransaction) {
        DialogTimerTask dialogTimerTask = this.timerTask;
        if (dialogTimerTask != null && dialogTimerTask.transaction == sIPServerTransaction) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Timer already running for " + getDialogId());
                return;
            }
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Starting dialog timer for " + getDialogId());
        }
        acquireTimerTaskSem();
        try {
            DialogTimerTask dialogTimerTask2 = this.timerTask;
            if (dialogTimerTask2 != null) {
                dialogTimerTask2.transaction = sIPServerTransaction;
            } else {
                this.timerTask = new DialogTimerTask(sIPServerTransaction);
                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                    this.sipStack.getTimer().scheduleWithFixedDelay(this.timerTask, sIPServerTransaction.getBaseTimerInterval(), sIPServerTransaction.getBaseTimerInterval());
                }
            }
            releaseTimerTaskSem();
            setRetransmissionTicks();
        } catch (Throwable th2) {
            releaseTimerTaskSem();
            throw th2;
        }
    }

    public void stopTimer() {
        try {
            acquireTimerTaskSem();
            try {
                if (this.timerTask != null) {
                    getStack().getTimer().cancel(this.timerTask);
                    this.timerTask = null;
                }
                if (this.earlyStateTimerTask != null) {
                    getStack().getTimer().cancel(this.earlyStateTimerTask);
                    this.earlyStateTimerTask = null;
                }
            } finally {
                releaseTimerTaskSem();
            }
        } catch (Exception unused) {
        }
    }

    public void storeFirstTransactionInfo(SIPDialog sIPDialog, SIPTransaction sIPTransaction) {
        sIPDialog.firstTransactionSeen = true;
        sIPDialog.firstTransaction = sIPTransaction;
        boolean zIsServerTransaction = sIPTransaction.isServerTransaction();
        sIPDialog.firstTransactionIsServerTransaction = zIsServerTransaction;
        if (zIsServerTransaction) {
            sIPDialog.firstTransactionSecure = sIPTransaction.getRequest().getRequestURI().getScheme().equalsIgnoreCase("sips");
        } else {
            sIPDialog.firstTransactionSecure = ((SIPClientTransaction) sIPTransaction).getOriginalRequestScheme().equalsIgnoreCase("sips");
        }
        sIPDialog.firstTransactionPort = sIPTransaction.getPort();
        sIPDialog.firstTransactionId = sIPTransaction.getBranchId();
        String method = sIPTransaction.getMethod();
        sIPDialog.firstTransactionMethod = method;
        if ((sIPTransaction instanceof SIPServerTransaction) && method.equals(TokenNames.INVITE)) {
            this.sipStack.removeMergeDialog(this.firstTransactionMergeId);
            sIPDialog.firstTransactionMergeId = sIPTransaction.getMergeId();
            this.sipStack.putMergeDialog(this);
        }
        if (sIPTransaction.isServerTransaction()) {
            SIPResponse lastResponse = ((SIPServerTransaction) sIPTransaction).getLastResponse();
            sIPDialog.contactHeader = lastResponse != null ? lastResponse.getContactHeader() : null;
        } else {
            sIPDialog.contactHeader = ((SIPClientTransaction) sIPTransaction).getOriginalRequestContact();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("firstTransaction = " + sIPDialog.firstTransaction);
            logger.logDebug("firstTransactionIsServerTransaction = " + this.firstTransactionIsServerTransaction);
            logger.logDebug("firstTransactionSecure = " + this.firstTransactionSecure);
            logger.logDebug("firstTransactionPort = " + this.firstTransactionPort);
            logger.logDebug("firstTransactionId = " + this.firstTransactionId);
            logger.logDebug("firstTransactionMethod = " + this.firstTransactionMethod);
            logger.logDebug("firstTransactionMergeId = " + this.firstTransactionMergeId);
        }
    }

    public boolean takeAckSem() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("[takeAckSem " + this + " sem=" + this.ackSem);
        }
        try {
            if (this.ackSem.tryAcquire(2L, TimeUnit.SECONDS)) {
                if (!logger.isLoggingEnabled(32)) {
                    return true;
                }
                recordStackTrace();
                return true;
            }
            if (logger.isLoggingEnabled()) {
                logger.logError("Cannot aquire ACK semaphore ");
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Semaphore previously acquired at " + this.stackTrace + " sem=" + this.ackSem);
                logger.logStackTrace();
            }
            return false;
        } catch (InterruptedException unused) {
            logger.logError("Cannot aquire ACK semaphore");
            return false;
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void terminateOnBye(boolean z6) {
        this.terminateOnBye = z6;
    }

    public synchronized boolean testAndSetIsDialogTerminatedEventDelivered() {
        boolean z6;
        z6 = this.dialogTerminatedEventDelivered;
        this.dialogTerminatedEventDelivered = true;
        return z6;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC13461b createAck(long j10) throws C10807n, C10800g {
        ListeningPointImpl listeningPointImpl;
        NameValueList parameters;
        String str = QzvfuIgrngtl.aEqNQz;
        if (!this.method.equals(TokenNames.INVITE)) {
            throw new C10807n("Dialog was not created with an INVITE" + this.method);
        }
        if (j10 <= 0) {
            throw new C10800g("bad cseq <= 0 ");
        }
        if (j10 > 4294967295L) {
            throw new C10800g("bad cseq > 4294967295");
        }
        if (getRemoteTarget() == null) {
            throw new C10807n("Cannot create ACK - no remote Target!");
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("createAck " + this + " cseqno " + j10);
        }
        if (this.lastInviteOkReceived < j10) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("WARNING : Attempt to crete ACK without OK " + this);
                logger.logDebug("LAST RESPONSE = " + getLastResponseStatusCode());
            }
            throw new C10807n("Dialog not yet established -- no OK response! lastInviteOkReceived=" + this.lastInviteOkReceived + " cseqno=" + j10);
        }
        try {
            RouteList routeList = this.routeList;
            InterfaceC12945d interfaceC12945d = (routeList == null || routeList.isEmpty()) ? (InterfaceC12945d) getRemoteTarget().getURI() : (InterfaceC12945d) ((Route) this.routeList.getFirst()).getAddress().getURI();
            String transportParam = interfaceC12945d.getTransportParam();
            if (interfaceC12945d.isSecure()) {
                if (transportParam != null && transportParam.equalsIgnoreCase("UDP")) {
                    throw new C10807n("Cannot create ACK - impossible to use sips uri with transport UDP:" + interfaceC12945d);
                }
                transportParam = "TLS";
            }
            if (transportParam != null) {
                listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint(transportParam);
            } else if (interfaceC12945d.isSecure()) {
                listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint("TLS");
            } else {
                listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint("UDP");
                if (listeningPointImpl == null) {
                    listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint("TCP");
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("uri4transport =  " + interfaceC12945d);
            }
            if (listeningPointImpl == null) {
                if (!interfaceC12945d.isSecure()) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("No Listening point for " + interfaceC12945d + " Using last response topmost");
                    }
                    listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint(this.lastResponseTopMostVia.getTransport());
                }
                if (listeningPointImpl == null) {
                    if (logger.isLoggingEnabled(4)) {
                        logger.logError("remoteTargetURI " + getRemoteTarget().getURI());
                        logger.logError("uri4transport = " + interfaceC12945d);
                        logger.logError("No LP found for transport=" + transportParam);
                    }
                    throw new C10807n(str + transportParam);
                }
            }
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setMethod(TokenNames.ACK);
            sIPRequest.setRequestURI((SipUri) getRemoteTarget().getURI().clone());
            sIPRequest.setCallId(getCallId());
            sIPRequest.setCSeq(new CSeq(j10, TokenNames.ACK));
            ArrayList arrayList = new ArrayList();
            Via via = this.lastResponseTopMostVia;
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("lastResponseTopMostVia " + this.lastResponseTopMostVia);
            }
            via.removeParameters();
            SIPRequest sIPRequest2 = this.originalRequest;
            if (sIPRequest2 != null && sIPRequest2.getTopmostVia() != null && (parameters = this.originalRequest.getTopmostVia().getParameters()) != null && parameters.size() > 0) {
                via.setParameters((NameValueList) parameters.clone());
            }
            via.setBranch(Utils.getInstance().generateBranchId());
            arrayList.add(via);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Adding via to the ACK we are creating : " + via + " lastResponseTopMostVia " + this.lastResponseTopMostVia);
            }
            sIPRequest.setVia(arrayList);
            From from = new From();
            from.setAddress(getLocalParty());
            from.setTag(this.myTag);
            sIPRequest.setFrom(from);
            C10766To c10766To = new C10766To();
            c10766To.setAddress(getRemoteParty());
            String str2 = this.hisTag;
            if (str2 != null) {
                c10766To.setTag(str2);
            }
            sIPRequest.setTo(c10766To);
            sIPRequest.setMaxForwards(new MaxForwards(70));
            SIPRequest sIPRequest3 = this.originalRequest;
            if (sIPRequest3 != null) {
                InterfaceC13250x authorization = sIPRequest3.getAuthorization();
                if (authorization != null) {
                    sIPRequest.setHeader(authorization);
                }
                this.originalRequestRecordRouteHeaders = this.originalRequest.getRecordRouteHeaders();
                this.originalRequest = null;
            }
            updateRequest(sIPRequest);
            return sIPRequest;
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
            throw new C10807n("unexpected exception ", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public SipProviderImpl getSipProvider() {
        return this.sipProvider;
    }

    public boolean isAckSent(long j10) {
        if (getLastTransaction() != null && (getLastTransaction() instanceof InterfaceC10794a)) {
            return this.lastAckSent != null && j10 <= getLastAckSentCSeq().getSeqNumber();
        }
        return true;
    }

    public void sendRequest(InterfaceC10794a interfaceC10794a, boolean z6) throws C10807n {
        if (interfaceC10794a == null) {
            throw new NullPointerException("null parameter");
        }
        if (!z6 && interfaceC10794a.getRequest().getMethod().equals(TokenNames.INVITE)) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::sendRequest " + this + " clientTransaction = " + interfaceC10794a);
            }
            this.sipStack.getReinviteExecutor().execute(new ReInviteSender(interfaceC10794a));
            return;
        }
        SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) interfaceC10794a;
        SIPRequest originalRequest = sIPClientTransaction.getOriginalRequest();
        this.proxyAuthorizationHeader = (InterfaceC13203K) originalRequest.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPDialog::sendRequest:dialog.sendRequest  dialog = " + this + "\ndialogRequest = \n" + originalRequest);
        }
        if (originalRequest.getMethod().equals(TokenNames.ACK) || originalRequest.getMethod().equals("CANCEL")) {
            throw new C10807n("Bad Request Method. " + originalRequest.getMethod());
        }
        if (this.byeSent && isTerminatedOnBye() && !originalRequest.getMethod().equals(TokenNames.BYE)) {
            if (logger.isLoggingEnabled()) {
                logger.logError("BYE already sent for " + this);
            }
            throw new C10807n("Cannot send request; BYE already sent");
        }
        if (originalRequest.getTopmostVia() == null) {
            originalRequest.addHeader(sIPClientTransaction.getOutgoingViaHeader());
        }
        if (!getCallId().getCallId().equalsIgnoreCase(originalRequest.getCallId().getCallId())) {
            if (logger.isLoggingEnabled()) {
                logger.logError("CallID " + getCallId());
                logger.logError("SIPDialog::sendRequest:RequestCallID = " + originalRequest.getCallId().getCallId());
                logger.logError("dialog =  " + this);
            }
            throw new C10807n("Bad call ID in request");
        }
        sIPClientTransaction.setDialog(this, this.dialogId);
        addTransaction((SIPTransaction) interfaceC10794a);
        sIPClientTransaction.setTransactionMapped(true);
        From from = (From) originalRequest.getFrom();
        C10766To c10766To = (C10766To) originalRequest.getTo();
        if (getLocalTag() != null && from.getTag() != null && !from.getTag().equals(getLocalTag())) {
            throw new C10807n("From tag mismatch expecting  " + getLocalTag());
        }
        if (getRemoteTag() != null && c10766To.getTag() != null && !c10766To.getTag().equals(getRemoteTag()) && logger.isLoggingEnabled()) {
            logger.logWarning("SIPDialog::sendRequest:To header tag mismatch expecting " + getRemoteTag());
        }
        if (getLocalTag() == null && originalRequest.getMethod().equals(TokenNames.NOTIFY)) {
            if (!getMethod().equals(TokenNames.SUBSCRIBE)) {
                throw new C10807n("Trying to send NOTIFY without SUBSCRIBE Dialog!");
            }
            setLocalTag(from.getTag());
        }
        try {
            if (getLocalTag() != null) {
                from.setTag(getLocalTag());
            }
            if (getRemoteTag() != null) {
                c10766To.setTag(getRemoteTag());
            }
        } catch (ParseException e10) {
            InternalErrorHandler.handleException(e10);
        }
        InterfaceC12943b nextHop = sIPClientTransaction.getNextHop();
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPDialog::sendRequest:Using hop = " + nextHop.getHost() + " : " + nextHop.getPort());
        }
        try {
            MessageChannel messageChannelCreateRawMessageChannel = this.sipStack.createRawMessageChannel(getSipProvider().getListeningPoint(nextHop.getTransport()).getIPAddress(), this.firstTransactionPort, nextHop);
            MessageChannel messageChannel = ((SIPClientTransaction) interfaceC10794a).getMessageChannel();
            messageChannel.uncache();
            if (!this.sipStack.cacheClientConnections) {
                messageChannel.useCount--;
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::sendRequest:oldChannel: useCount " + messageChannel.useCount);
                }
            }
            if (messageChannelCreateRawMessageChannel == null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Null message channel using outbound proxy !");
                }
                InterfaceC12943b outboundProxy = this.sipStack.getRouter(originalRequest).getOutboundProxy();
                if (outboundProxy == null) {
                    throw new C10807n("No route found! hop=" + nextHop);
                }
                messageChannelCreateRawMessageChannel = this.sipStack.createRawMessageChannel(getSipProvider().getListeningPoint(outboundProxy.getTransport()).getIPAddress(), this.firstTransactionPort, outboundProxy);
                if (messageChannelCreateRawMessageChannel != null) {
                    ((SIPClientTransaction) interfaceC10794a).setEncapsulatedChannel(messageChannelCreateRawMessageChannel);
                }
            } else {
                ((SIPClientTransaction) interfaceC10794a).setEncapsulatedChannel(messageChannelCreateRawMessageChannel);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::sendRequest:using message channel " + messageChannelCreateRawMessageChannel);
                }
            }
            if (messageChannelCreateRawMessageChannel != null) {
                messageChannelCreateRawMessageChannel.useCount++;
            }
            if (!this.sipStack.cacheClientConnections && messageChannel.useCount <= 0) {
                messageChannel.close();
            }
            try {
                long localSeqNumber = originalRequest.getCSeq() == null ? getLocalSeqNumber() : originalRequest.getCSeq().getSeqNumber();
                if (localSeqNumber > getLocalSeqNumber()) {
                    setLocalSequenceNumber(localSeqNumber);
                } else {
                    setLocalSequenceNumber(getLocalSeqNumber() + 1);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::sendRequest:setting Seq Number to " + getLocalSeqNumber());
                }
                originalRequest.getCSeq().setSeqNumber(getLocalSeqNumber());
            } catch (C10800g e11) {
                logger.logFatalError(e11.getMessage());
            }
            try {
                ((SIPClientTransaction) interfaceC10794a).sendMessage(originalRequest);
                if (originalRequest.getMethod().equals(TokenNames.BYE)) {
                    this.byeSent = true;
                    if (isTerminatedOnBye()) {
                        setState(3);
                    }
                }
            } catch (IOException e12) {
                throw new C10807n("error sending message", e12);
            }
        } catch (Exception e13) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e13);
            }
            throw new C10807n("Could not create message channel", e13);
        }
    }

    public void checkRetransmissionForForking(SIPResponse sIPResponse) {
        int statusCode = sIPResponse.getStatusCode();
        String method = sIPResponse.getCSeqHeader().getMethod();
        long seqNumber = sIPResponse.getCSeq().getSeqNumber();
        RSeq rSeq = (RSeq) sIPResponse.getHeader(wNrQXvwLiB.YTrfcQMQEUdqS);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(statusCode);
        String str = sVoFrD.PohcwUViavPJMlU;
        sb2.append(str);
        sb2.append(seqNumber);
        sb2.append(str);
        sb2.append(method);
        String string = sb2.toString();
        if (rSeq != null) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, str);
            sbM9895n.append(rSeq.getSeqNumber());
            string = sbM9895n.toString();
        }
        boolean z6 = !this.responsesReceivedInForkingCase.add(string);
        sIPResponse.setRetransmission(z6);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("marking response as retransmission " + z6 + " for dialog " + this);
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public InterfaceC13461b createPrack(InterfaceC13462c interfaceC13462c) throws C10807n {
        if (getState() != null && !getState().equals(C10797d.f32035q0)) {
            if (((RSeq) interfaceC13462c.getHeader(SIPHeaderNames.RSEQ)) != null) {
                try {
                    SIPResponse sIPResponse = (SIPResponse) interfaceC13462c;
                    SIPRequest sIPRequestCreateRequest = createRequest("PRACK", sIPResponse.getTopmostVia().getTransport());
                    sIPRequestCreateRequest.setToTag(sIPResponse.getTo().getTag());
                    RAck rAck = new RAck();
                    RSeq rSeq = (RSeq) interfaceC13462c.getHeader(SIPHeaderNames.RSEQ);
                    rAck.setMethod(sIPResponse.getCSeq().getMethod());
                    rAck.setCSequenceNumber((int) sIPResponse.getCSeq().getSeqNumber());
                    rAck.setRSequenceNumber(rSeq.getSeqNumber());
                    sIPRequestCreateRequest.setHeader(rAck);
                    InterfaceC13203K interfaceC13203K = this.proxyAuthorizationHeader;
                    if (interfaceC13203K != null) {
                        sIPRequestCreateRequest.addHeader(interfaceC13203K);
                    }
                    return sIPRequestCreateRequest;
                } catch (Exception e10) {
                    InternalErrorHandler.handleException(e10);
                    return null;
                }
            }
            throw new C10807n(HpucjswO.FiGcfqxUyo);
        }
        throw new C10796c("Dialog not initialized or terminated");
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void sendReliableProvisionalResponse(InterfaceC13462c interfaceC13462c) throws Throwable {
        if (isServer()) {
            SIPResponse sIPResponse = (SIPResponse) interfaceC13462c;
            if (interfaceC13462c.getStatusCode() != 100) {
                if (interfaceC13462c.getStatusCode() / 100 <= 2) {
                    if (sIPResponse.getToTag() != null) {
                        ListIterator headers = interfaceC13462c.getHeaders(SIPHeaderNames.REQUIRE);
                        boolean z6 = false;
                        if (headers != null) {
                            while (headers.hasNext() && !z6) {
                                if (((InterfaceC13211T) headers.next()).getOptionTag().equalsIgnoreCase("100rel")) {
                                    z6 = true;
                                }
                            }
                        }
                        if (!z6) {
                            interfaceC13462c.addHeader(new Require("100rel"));
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Require header with optionTag 100rel is needed -- adding one");
                            }
                        }
                        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) getFirstTransactionInt();
                        setLastResponse(sIPServerTransaction, sIPResponse);
                        setDialogId(sIPResponse.getDialogId(true));
                        sIPServerTransaction.sendReliableProvisionalResponse(interfaceC13462c);
                        startRetransmitTimer(sIPServerTransaction, interfaceC13462c);
                        return;
                    }
                    throw new C10807n("Badly formatted response -- To tag mandatory for Reliable Provisional Response");
                }
                throw new C10807n("Response code is not a 1xx response - should be in the range 101 to 199 ");
            }
            throw new C10807n(bQBnquXS.uqAovFEUOcwi);
        }
        throw new C10807n("Not a Server Dialog");
    }

    private SIPRequest createRequest(String str, String str2) throws C10807n {
        SipUri sipUri;
        InterfaceC13250x interfaceC13250x;
        InterfaceC13250x interfaceC13250x2;
        if (str != null && str2 != null) {
            if (!str.equals("CANCEL")) {
                if (getState() != null) {
                    int i10 = getState().f32036Y;
                    String str3 = wNrQXvwLiB.ymkCQguD;
                    if ((i10 != 3 || str.equalsIgnoreCase(str3)) && (!isServer() || getState().f32036Y != 0 || !str.equalsIgnoreCase(str3))) {
                        if (getRemoteTarget() != null) {
                            sipUri = (SipUri) getRemoteTarget().getURI().clone();
                        } else {
                            sipUri = (SipUri) getRemoteParty().getURI().clone();
                            sipUri.clearUriParms();
                        }
                        SipUri sipUri2 = sipUri;
                        CSeq cSeq = new CSeq();
                        try {
                            cSeq.setMethod(str);
                            cSeq.setSeqNumber(getLocalSeqNumber());
                        } catch (Exception e10) {
                            if (logger.isLoggingEnabled()) {
                                logger.logError("Unexpected error");
                            }
                            InternalErrorHandler.handleException(e10);
                        }
                        ListeningPointImpl listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint(str2);
                        if (listeningPointImpl == null) {
                            boolean zIsLoggingEnabled = logger.isLoggingEnabled();
                            String str4 = CxcULo.ZjjeWMNGXG;
                            if (zIsLoggingEnabled) {
                                logger.logError(str4.concat(str2));
                            }
                            throw new C10807n(str4.concat(str2));
                        }
                        Via viaHeader = listeningPointImpl.getViaHeader();
                        From from = new From();
                        from.setAddress(getLocalParty());
                        C10766To c10766To = new C10766To();
                        c10766To.setAddress(getRemoteParty());
                        SIPRequest sIPRequestCreateRequest = createRequest(sipUri2, viaHeader, cSeq, from, c10766To);
                        if (SIPRequest.isTargetRefresh(str)) {
                            InterfaceC13238l interfaceC13238lCreateContactHeader = ((ListeningPointImpl) this.sipProvider.getListeningPoint(listeningPointImpl.getTransport())).createContactHeader();
                            ((InterfaceC12945d) interfaceC13238lCreateContactHeader.getAddress().getURI()).setSecure(isSecure());
                            sIPRequestCreateRequest.setHeader(interfaceC13238lCreateContactHeader);
                        }
                        try {
                            CSeq cSeq2 = (CSeq) sIPRequestCreateRequest.getCSeq();
                            cSeq2.setSeqNumber(getLocalSeqNumber() + 1);
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("SIPDialog::createRequest:setting Request Seq Number to " + cSeq2.getSeqNumber());
                            }
                        } catch (C10800g e11) {
                            InternalErrorHandler.handleException(e11);
                        }
                        if (str.equals(TokenNames.SUBSCRIBE) && (interfaceC13250x2 = this.eventHeader) != null) {
                            sIPRequestCreateRequest.addHeader(interfaceC13250x2);
                        }
                        if (str.equals(TokenNames.NOTIFY) && (interfaceC13250x = this.eventHeader) != null) {
                            sIPRequestCreateRequest.addHeader(interfaceC13250x);
                        }
                        try {
                            if (getLocalTag() != null) {
                                from.setTag(getLocalTag());
                            } else {
                                from.removeTag();
                            }
                            if (getRemoteTag() != null) {
                                c10766To.setTag(getRemoteTag());
                            } else {
                                c10766To.removeTag();
                            }
                        } catch (ParseException e12) {
                            InternalErrorHandler.handleException(e12);
                        }
                        updateRequest(sIPRequestCreateRequest);
                        return sIPRequestCreateRequest;
                    }
                }
                throw new C10807n("Dialog  " + getDialogId() + " not yet established or terminated " + getState());
            }
            throw new C10807n("Dialog.createRequest(): Invalid request");
        }
        throw new NullPointerException("null argument");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseErrorEvent(int i10) {
        raiseErrorEvent(i10, null);
    }

    public SIPDialog(SIPTransaction sIPTransaction) {
        this(sIPTransaction.getSipProvider());
        SIPRequest sIPRequest = (SIPRequest) sIPTransaction.getRequest();
        this.callIdHeader = sIPRequest.getCallId();
        this.earlyDialogId = sIPRequest.getDialogId(false);
        this.sipStack = sIPTransaction.getSIPStack();
        SipProviderImpl sipProvider = sIPTransaction.getSipProvider();
        this.sipProvider = sipProvider;
        if (sipProvider != null) {
            this.isBackToBackUserAgent = this.sipStack.isBackToBackUserAgent;
            addTransaction(sIPTransaction);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Creating a dialog : " + this);
                logger.logDebug("provider port = " + this.sipProvider.getListeningPoint().getPort());
                logger.logStackTrace();
            }
            addEventListener(this.sipStack);
            this.releaseReferencesStrategy = this.sipStack.getReleaseReferencesStrategy();
            return;
        }
        throw new NullPointerException("Null Provider!");
    }

    public SIPDialog(SIPClientTransaction sIPClientTransaction, SIPResponse sIPResponse) throws Throwable {
        this(sIPClientTransaction);
        if (sIPResponse != null) {
            setLastResponse(sIPClientTransaction, sIPResponse);
            this.isBackToBackUserAgent = this.sipStack.isBackToBackUserAgent;
            return;
        }
        throw new NullPointerException("Null SipResponse");
    }

    public SIPDialog(SipProviderImpl sipProviderImpl, SIPResponse sIPResponse) throws Throwable {
        this(sipProviderImpl);
        this.sipStack = (SIPTransactionStack) sipProviderImpl.getSipStack();
        setLastResponse(null, sIPResponse);
        long seqNumber = sIPResponse.getCSeq().getSeqNumber();
        this.localSequenceNumber = seqNumber;
        this.originalLocalSequenceNumber = seqNumber;
        this.localParty = sIPResponse.getFrom().getAddress();
        this.remoteParty = sIPResponse.getTo().getAddress();
        this.method = sIPResponse.getCSeq().getMethod();
        this.callIdHeader = sIPResponse.getCallId();
        this.serverTransactionFlag = false;
        setLocalTag(sIPResponse.getFrom().getTag());
        setRemoteTag(sIPResponse.getTo().getTag());
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Creating a dialog : " + this);
            logger.logStackTrace();
        }
        SIPTransactionStack sIPTransactionStack = this.sipStack;
        this.isBackToBackUserAgent = sIPTransactionStack.isBackToBackUserAgent;
        addEventListener(sIPTransactionStack);
        this.releaseReferencesStrategy = this.sipStack.getReleaseReferencesStrategy();
    }

    private synchronized void addRoute(SIPResponse sIPResponse) {
        ContactList contactHeaders;
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("setContact: dialogState: " + this + "state = " + getState());
            }
            if (sIPResponse.getStatusCode() == 100) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                }
                return;
            }
            int i10 = this.dialogState;
            if (i10 == 3) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                }
                return;
            }
            if (i10 == 1) {
                if (sIPResponse.getStatusCode() / 100 == 2 && !isServer() && (contactHeaders = sIPResponse.getContactHeaders()) != null && SIPRequest.isTargetRefresh(sIPResponse.getCSeq().getMethod())) {
                    setRemoteTarget((InterfaceC13238l) contactHeaders.getFirst());
                }
                if (!this.pendingRouteUpdateOn202Response) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logStackTrace();
                    }
                    return;
                }
            }
            if (!isServer() || this.pendingRouteUpdateOn202Response) {
                if ((getState() != C10797d.f32034p0 && getState() != C10797d.f32035q0) || this.pendingRouteUpdateOn202Response) {
                    RecordRouteList recordRouteHeaders = sIPResponse.getRecordRouteHeaders();
                    if (recordRouteHeaders != null) {
                        addRoute(recordRouteHeaders);
                    } else {
                        this.routeList = new RouteList();
                    }
                }
                ContactList contactHeaders2 = sIPResponse.getContactHeaders();
                if (contactHeaders2 != null) {
                    setRemoteTarget((InterfaceC13238l) contactHeaders2.getFirst());
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logStackTrace();
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32)) {
                logger.logStackTrace();
            }
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void sendAck(InterfaceC13461b interfaceC13461b) throws C10807n {
        sendAck(interfaceC13461b, true);
    }

    public SIPDialog(SIPClientTransaction sIPClientTransaction, SIPTransaction sIPTransaction) throws Throwable {
        this(sIPTransaction);
        this.serverTransactionFlag = false;
        this.lastTransaction = sIPClientTransaction;
        storeFirstTransactionInfo(this, sIPClientTransaction);
        this.terminateOnBye = false;
        this.localSequenceNumber = sIPClientTransaction.getCSeq();
        SIPRequest sIPRequest = (SIPRequest) sIPTransaction.getRequest();
        this.remoteSequenceNumber = sIPRequest.getCSeq().getSeqNumber();
        setDialogId(sIPRequest.getDialogId(true));
        setLocalTag(sIPRequest.getToTag());
        setRemoteTag(sIPRequest.getFromTag());
        setLastResponse(sIPClientTransaction, sIPClientTransaction.getLastResponse());
        this.localParty = sIPRequest.getTo().getAddress();
        this.remoteParty = sIPRequest.getFrom().getAddress();
        addRoute(sIPRequest);
        setState(1);
    }

    public SIPRequest createRequest(SipUri sipUri, Via via, CSeq cSeq, From from, C10766To c10766To) {
        SIPRequest sIPRequest = new SIPRequest();
        String method = cSeq.getMethod();
        sIPRequest.setMethod(method);
        sIPRequest.setRequestURI(sipUri);
        setBranch(via, method);
        sIPRequest.setHeader(via);
        sIPRequest.setHeader(cSeq);
        sIPRequest.setHeader(from);
        sIPRequest.setHeader(c10766To);
        sIPRequest.setHeader(getCallId());
        try {
            sIPRequest.attachHeader(new MaxForwards(70), false);
        } catch (Exception unused) {
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public synchronized void addRoute(SIPRequest sIPRequest) {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("setContact: dialogState: " + this + "state = " + getState());
            }
            if (this.dialogState == 1 && SIPRequest.isTargetRefresh(sIPRequest.getMethod())) {
                doTargetRefresh(sIPRequest);
            }
            int i10 = this.dialogState;
            if (i10 != 1 && i10 != 3) {
                ContactList contactHeaders = sIPRequest.getContactHeaders();
                if (contactHeaders != null) {
                    setRemoteTarget((InterfaceC13238l) contactHeaders.getFirst());
                }
                if (sIPRequest.getToTag() != null) {
                    return;
                }
                RecordRouteList recordRouteHeaders = sIPRequest.getRecordRouteHeaders();
                if (recordRouteHeaders != null) {
                    addRoute(recordRouteHeaders);
                } else {
                    this.routeList = new RouteList();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
