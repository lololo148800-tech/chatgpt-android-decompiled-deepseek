package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.Expires;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.C10797d;
import android.javax.sip.C10798e;
import android.javax.sip.C10807n;
import android.javax.sip.C10812s;
import android.javax.sip.C10813t;
import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10795b;
import cn.UfGr.EhBykzn;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p691d.InterfaceC12943b;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class SIPServerTransactionImpl extends SIPTransactionImpl implements SIPServerTransaction {
    private SIPDialog dialog;
    protected String dialogId;
    private SIPServerTransaction inviteTransaction;
    protected boolean isAckSeen;
    private byte[] lastResponseAsBytes;
    private String lastResponseHost;
    private int lastResponsePort;
    private int lastResponseStatusCode;
    private String lastResponseTransport;
    private String originalRequestFromTag;
    private HostPort originalRequestSentBy;
    private long pendingReliableCSeqNumber;
    private long pendingReliableRSeqNumber;
    private byte[] pendingReliableResponseAsBytes;
    private String pendingReliableResponseMethod;
    private SIPClientTransaction pendingSubscribeTransaction;
    private Semaphore provisionalResponseSem;
    private ProvisionalResponseTask provisionalResponseTask;
    private transient ServerRequestInterface requestOf;
    private boolean retransmissionAlertEnabled;
    private RetransmissionAlertTimerTask retransmissionAlertTimerTask;
    private int rseqNumber;
    private Semaphore terminationSemaphore;
    private static StackLogger logger = CommonLogger.getLogger(SIPServerTransaction.class);
    private static boolean interlockProvisionalResponses = true;

    public class ProvisionalResponseTask extends SIPStackTimerTask {
        int ticks = 1;
        int ticksLeft = 1;

        public ProvisionalResponseTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            InterfaceC13461b request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() throws Throwable {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            if (sIPServerTransactionImpl.isTerminated()) {
                SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                return;
            }
            int i10 = this.ticksLeft - 1;
            this.ticksLeft = i10;
            if (i10 == -1) {
                sIPServerTransactionImpl.fireReliableResponseRetransmissionTimer();
                int i11 = this.ticks * 2;
                this.ticksLeft = i11;
                this.ticks = i11;
                if (i11 >= 64) {
                    SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                    SIPServerTransactionImpl.this.setState(5);
                    SIPServerTransactionImpl.this.fireTimeoutTimer();
                }
            }
        }
    }

    public class RetransmissionAlertTimerTask extends SIPStackTimerTask {
        String dialogId;
        int ticks = 1;
        int ticksLeft = 1;

        public RetransmissionAlertTimerTask(String str) {
            this.dialogId = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            InterfaceC13461b request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            int i10 = this.ticksLeft - 1;
            this.ticksLeft = i10;
            if (i10 == -1) {
                sIPServerTransactionImpl.fireRetransmissionTimer();
                this.ticksLeft = this.ticks * 2;
            }
        }
    }

    public class SendTrying extends SIPStackTimerTask {
        public SendTrying() {
            if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                SIPServerTransactionImpl.logger.logDebug("scheduled timer for " + SIPServerTransactionImpl.this);
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            InterfaceC13461b request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            int realState = sIPServerTransactionImpl.getRealState();
            if (realState < 0 || 1 == realState) {
                if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                    SIPServerTransactionImpl.logger.logDebug(" sending Trying current state = " + sIPServerTransactionImpl.getRealState());
                }
                try {
                    sIPServerTransactionImpl.sendMessage(sIPServerTransactionImpl.getOriginalRequest().createResponse(100, "Trying"));
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                        SIPServerTransactionImpl.logger.logDebug(" trying sent " + sIPServerTransactionImpl.getRealState());
                    }
                } catch (IOException unused) {
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled()) {
                        SIPServerTransactionImpl.logger.logError("IO error sending  TRYING");
                    }
                }
            }
        }
    }

    public class TransactionTimer extends SIPStackTimerTask {
        public TransactionTimer() {
            if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                SIPServerTransactionImpl.logger.logDebug("TransactionTimer() : " + SIPServerTransactionImpl.this.getTransactionId());
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            InterfaceC13461b request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPServerTransactionImpl.this.isTerminated()) {
                try {
                    SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                } catch (IllegalStateException unused) {
                    if (!SIPServerTransactionImpl.this.sipStack.isAlive()) {
                        return;
                    }
                }
                SIPTransactionImpl.LingerTimer lingerTimer = new SIPTransactionImpl.LingerTimer();
                if (SIPServerTransactionImpl.this.sipStack.getConnectionLingerTimer() != 0) {
                    SIPServerTransactionImpl.this.sipStack.getTimer().schedule(lingerTimer, SIPServerTransactionImpl.this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    lingerTimer.runTask();
                }
            } else {
                SIPServerTransactionImpl.this.fireTimer();
            }
            SIPRequest sIPRequest = SIPServerTransactionImpl.this.originalRequest;
            if (sIPRequest != null) {
                sIPRequest.cleanUp();
            }
        }
    }

    public SIPServerTransactionImpl(SIPTransactionStack sIPTransactionStack, MessageChannel messageChannel) {
        super(sIPTransactionStack, messageChannel);
        this.rseqNumber = -1;
        this.provisionalResponseSem = new Semaphore(1);
        this.terminationSemaphore = new Semaphore(0);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Creating Server Transaction" + getBranchId());
            logger.logStackTrace();
        }
    }

    private boolean checkStateTimers(int i10) throws Throwable {
        if (getRealState() == 1) {
            int i11 = i10 / 100;
            if (i11 == 1) {
                setState(2);
            } else if (200 <= i10 && i10 <= 699) {
                if (isInviteTransaction()) {
                    if (i11 == 2) {
                        disableRetransmissionTimer();
                        disableTimeoutTimer();
                        this.collectionTime = 64;
                        cleanUpOnTimer();
                        setState(5);
                        if (getDialog() != null) {
                            ((SIPDialog) getDialog()).setRetransmissionTicks();
                        }
                    } else {
                        setState(3);
                        if (!isReliable()) {
                            enableRetransmissionTimer();
                        }
                        cleanUpOnTimer();
                        enableTimeoutTimer(64);
                    }
                } else if (isReliable() || getInternalState() == 3) {
                    cleanUpOnTimer();
                    setState(5);
                    startTransactionTimerJ(0L);
                } else {
                    setState(3);
                    startTransactionTimerJ(64L);
                    cleanUpOnTimer();
                }
            }
        } else if (getRealState() == 2) {
            if (isInviteTransaction()) {
                if (i10 / 100 == 2) {
                    disableRetransmissionTimer();
                    disableTimeoutTimer();
                    this.collectionTime = 64;
                    cleanUpOnTimer();
                    setState(5);
                    if (getDialog() != null) {
                        ((SIPDialog) getDialog()).setRetransmissionTicks();
                    }
                } else if (300 <= i10 && i10 <= 699) {
                    setState(3);
                    if (!isReliable()) {
                        enableRetransmissionTimer();
                    }
                    cleanUpOnTimer();
                    enableTimeoutTimer(64);
                }
            } else if (200 <= i10 && i10 <= 699) {
                setState(3);
                if (isReliable()) {
                    setState(5);
                    startTransactionTimerJ(0L);
                } else {
                    disableRetransmissionTimer();
                    startTransactionTimerJ(64L);
                }
                cleanUpOnTimer();
            }
        } else if (3 == getRealState()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireReliableResponseRetransmissionTimer() {
        try {
            resendLastResponseAsBytes();
        } catch (IOException e10) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e10);
            }
            setState(5);
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean ackSeen() {
        return this.isAckSeen;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void cleanUp() throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("removing" + this);
        }
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanup : " + getTransactionId());
            }
            if (this.originalRequest == null && this.originalRequestBytes != null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                try {
                    this.originalRequest = (SIPRequest) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.originalRequestBytes, true, false, null);
                } catch (ParseException e10) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("message " + this.originalRequestBytes + "could not be reparsed !", e10);
                    }
                }
            } else if (this.originalRequest != null && this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null && this.originalRequestBytes == null) {
                this.mergeId = sIPRequest.getMergeId();
            }
            this.sipStack.removeTransaction(this);
            cleanUpOnTimer();
            this.originalRequestFromTag = null;
            this.originalRequestSentBy = null;
            if (this.originalRequest != null) {
                this.originalRequest = null;
            }
            if (!isReliable() && this.inviteTransaction != null) {
                this.inviteTransaction = null;
            }
            this.lastResponse = null;
        } else {
            this.sipStack.removeTransaction(this);
        }
        if (!this.sipStack.cacheServerConnections && isReliable()) {
            MessageChannel messageChannel = getMessageChannel();
            int i10 = messageChannel.useCount - 1;
            messageChannel.useCount = i10;
            if (i10 <= 0) {
                close();
                return;
            }
        }
        if (logger.isLoggingEnabled(32) && !this.sipStack.cacheServerConnections && isReliable()) {
            int i11 = getMessageChannel().useCount;
            logger.logDebug("Use Count = " + i11);
        }
    }

    public void cleanUpOnTimer() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanup on timer : " + getTransactionId());
            }
            if (this.dialog != null && getMethod().equals("CANCEL")) {
                this.dialogId = this.dialog.getDialogId();
            }
            this.dialog = null;
            if (this.inviteTransaction != null && !getMethod().equals("CANCEL")) {
                this.inviteTransaction.releaseSem();
                this.inviteTransaction = null;
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null) {
                this.mergeId = sIPRequest.getMergeId();
                this.originalRequest.setTransaction(null);
                this.originalRequest.setInviteTransaction(null);
                if (!getMethod().equalsIgnoreCase(TokenNames.INVITE)) {
                    if (this.originalRequestSentBy == null) {
                        this.originalRequestSentBy = this.originalRequest.getTopmostVia().getSentBy();
                    }
                    if (this.originalRequestFromTag == null) {
                        this.originalRequestFromTag = this.originalRequest.getFromTag();
                    }
                }
                if (this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                if (!getMethod().equalsIgnoreCase(TokenNames.INVITE) && !getMethod().equalsIgnoreCase("CANCEL")) {
                    this.originalRequest = null;
                }
            }
            if (this.lastResponse != null) {
                if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.lastResponseAsBytes = this.lastResponse.encodeAsBytes(getTransport());
                }
                this.lastResponse = null;
            }
            this.pendingReliableResponseAsBytes = null;
            this.pendingReliableResponseMethod = null;
            this.pendingSubscribeTransaction = null;
            this.provisionalResponseSem = null;
            this.retransmissionAlertTimerTask = null;
            this.requestOf = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void disableRetransmissionAlerts() {
        if (this.retransmissionAlertTimerTask == null || !this.retransmissionAlertEnabled) {
            return;
        }
        this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
        this.retransmissionAlertEnabled = false;
        String str = this.retransmissionAlertTimerTask.dialogId;
        if (str != null) {
            this.sipStack.retransmissionAlertTransactions.remove(str);
        }
        this.retransmissionAlertTimerTask = null;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.ServerTransactionExt
    public void enableRetransmissionAlerts() throws C10807n {
        if (getDialog() != null) {
            throw new C10807n("Dialog associated with tx");
        }
        if (!isInviteTransaction()) {
            throw new C10807n("Request Method must be INVITE");
        }
        this.retransmissionAlertEnabled = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            return getBranch().equalsIgnoreCase(((SIPServerTransaction) obj).getBranch());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireRetransmissionTimer() {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("fireRetransmissionTimer() -- " + this + " state " + getState());
            }
            if (isInviteTransaction()) {
                if (this.lastResponse == null && this.lastResponseAsBytes == null) {
                    return;
                }
                if (this.retransmissionAlertEnabled && !this.sipStack.isTransactionPendingAck(this)) {
                    SipProviderImpl sipProvider = getSipProvider();
                    C10812s[] c10812sArr = C10812s.f32041Z;
                    sipProvider.handleEvent(new C10813t(sipProvider, this), this);
                    return;
                }
                if (this.lastResponseStatusCode / 100 < 2 || this.isAckSeen) {
                    return;
                }
                resendLastResponseAsBytes();
            }
        } catch (IOException e10) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e10);
            }
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireTimeoutTimer() throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPServerTransaction.fireTimeoutTimer this = " + this + " current state = " + getRealState() + " method = " + getMethod());
        }
        if (isInviteTransaction() && this.sipStack.removeTransactionPendingAck(this) && logger.isLoggingEnabled(32)) {
            logger.logDebug("Found tx pending ACK - timer H has kicked");
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (SIPTransactionStack.isDialogCreated(getMethod()) && (getRealState() == 0 || 1 == getRealState())) {
            sIPDialog.setState(3);
        } else if (getMethod().equals(TokenNames.BYE) && sIPDialog != null && sIPDialog.isTerminatedOnBye()) {
            sIPDialog.setState(3);
        }
        if (3 == getRealState() && isInviteTransaction()) {
            raiseErrorEvent(1);
            setState(5);
            this.sipStack.removeTransaction(this);
            return;
        }
        if (3 == getRealState() && !isInviteTransaction()) {
            setState(5);
            if (getMethod().equals("CANCEL")) {
                this.sipStack.removeTransaction(this);
                return;
            } else {
                cleanUp();
                return;
            }
        }
        if (4 == getRealState() && isInviteTransaction()) {
            setState(5);
            this.sipStack.removeTransaction(this);
            return;
        }
        if (!isInviteTransaction() && (3 == getRealState() || 4 == getRealState())) {
            setState(5);
            return;
        }
        if (isInviteTransaction() && 5 == getRealState()) {
            raiseErrorEvent(1);
            if (sIPDialog != null) {
                sIPDialog.setState(3);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public InterfaceC10795b getDialog() {
        String str;
        SIPDialog sIPDialog = this.dialog;
        return (sIPDialog != null || (str = this.dialogId) == null) ? sIPDialog : this.sipStack.getDialog(str);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public int getLastResponseStatusCode() {
        return this.lastResponseStatusCode;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public long getPendingReliableCSeqNumber() {
        return this.pendingReliableCSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public long getPendingReliableRSeqNumber() {
        return this.pendingReliableRSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public String getPendingReliableResponseMethod() {
        return this.pendingReliableResponseMethod;
    }

    public int getRealState() {
        return super.getInternalState();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public byte[] getReliableProvisionalResponse() {
        return this.pendingReliableResponseAsBytes;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public MessageChannel getResponseChannel() {
        return this.encapsulatedChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public C10815v getState() {
        return (isInviteTransaction() && 1 == super.getInternalState()) ? C10815v.f32048q0 : super.getState();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public String getViaHost() {
        return super.getViaHost();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public int getViaPort() {
        return super.getViaPort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isMessagePartOfTransaction(SIPMessage sIPMessage) {
        Via topmostVia;
        String method = sIPMessage.getCSeq().getMethod();
        SIPRequest originalRequest = getOriginalRequest();
        if ((!isInviteTransaction() && isTerminated()) || (topmostVia = sIPMessage.getTopmostVia()) == null) {
            return false;
        }
        String branch = topmostVia.getBranch();
        if (branch != null && !branch.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
            branch = null;
        }
        if (branch == null || getBranch() == null) {
            SIPRequest sIPRequest = (SIPRequest) getRequest();
            String fromTag = sIPRequest.getFromTag();
            String tag = sIPMessage.getFrom().getTag();
            boolean z6 = fromTag == null || tag == null;
            String toTag = sIPRequest.getToTag();
            String tag2 = sIPMessage.getTo().getTag();
            boolean z10 = toTag == null || tag2 == null;
            boolean z11 = sIPMessage instanceof SIPResponse;
            if (sIPMessage.getCSeq().getMethod().equalsIgnoreCase("CANCEL") && !sIPRequest.getCSeq().getMethod().equalsIgnoreCase("CANCEL")) {
                return false;
            }
            if (!z11 && !sIPRequest.getRequestURI().equals(((SIPRequest) sIPMessage).getRequestURI())) {
                return false;
            }
            if (!z6 && (fromTag == null || !fromTag.equalsIgnoreCase(tag))) {
                return false;
            }
            if ((!z10 && (toTag == null || !toTag.equalsIgnoreCase(tag2))) || !sIPRequest.getCallId().getCallId().equalsIgnoreCase(sIPMessage.getCallId().getCallId()) || sIPRequest.getCSeq().getSeqNumber() != sIPMessage.getCSeq().getSeqNumber()) {
                return false;
            }
            if ((sIPMessage.getCSeq().getMethod().equals("CANCEL") && !getMethod().equals(sIPMessage.getCSeq().getMethod())) || !topmostVia.equals(sIPRequest.getTopmostVia())) {
                return false;
            }
        } else if (method.equals("CANCEL")) {
            if (!getMethod().equals("CANCEL") || !getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy())) {
                return false;
            }
        } else if (originalRequest != null) {
            if (!getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy())) {
                return false;
            }
        } else if (!getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(this.originalRequestSentBy)) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean isRetransmissionAlertEnabled() {
        return this.retransmissionAlertEnabled;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void map() {
        int realState = getRealState();
        if (realState < 0 || realState == 1) {
            if (!isInviteTransaction() || this.isMapped || this.sipStack.getTimer() == null) {
                this.isMapped = true;
            } else {
                this.isMapped = true;
                this.sipStack.getTimer().schedule(new SendTrying(), 200L);
            }
        }
        this.sipStack.removePendingTransaction(this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean prackRecieved() {
        if (this.pendingReliableResponseAsBytes == null) {
            return false;
        }
        if (this.provisionalResponseTask != null) {
            this.sipStack.getTimer().cancel(this.provisionalResponseTask);
            this.provisionalResponseTask = null;
        }
        this.pendingReliableResponseAsBytes = null;
        if (!interlockProvisionalResponses || getDialog() == null) {
            return true;
        }
        this.provisionalResponseSem.release();
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void releaseSem() {
        if (this.pendingSubscribeTransaction != null) {
            if (!this.sipStack.isDeliverUnsolicitedNotify()) {
                this.pendingSubscribeTransaction.releaseSem();
            }
        } else if (this.inviteTransaction != null && getMethod().equals("CANCEL")) {
            this.inviteTransaction.releaseSem();
        }
        super.releaseSem();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void resendLastResponseAsBytes() throws IOException {
        if (this.lastResponse != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("resend last response " + this.lastResponse);
            }
            sendMessage(this.lastResponse);
            return;
        }
        if (this.lastResponseAsBytes != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("resend last response ".concat(new String(this.lastResponseAsBytes)));
            }
            if (isReliable()) {
                if (logger.isLoggingEnabled(16)) {
                    try {
                        SIPResponse sIPResponse = (SIPResponse) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.lastResponseAsBytes, true, false, null);
                        sIPResponse.setRemoteAddress(getPeerInetAddress());
                        sIPResponse.setRemotePort(getPeerPort());
                        sIPResponse.setLocalPort(getMessageChannel().getPort());
                        sIPResponse.setLocalAddress(getMessageChannel().getMessageProcessor().getIpAddress());
                        getMessageChannel().logMessage(sIPResponse, getPeerInetAddress(), getPeerPort(), System.currentTimeMillis());
                    } catch (ParseException e10) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("couldn't reparse last response ".concat(new String(this.lastResponseAsBytes)), e10);
                        }
                    }
                }
                getMessageChannel().sendMessage(this.lastResponseAsBytes, getPeerInetAddress(), getPeerPort(), false);
                return;
            }
            InterfaceC12943b interfaceC12943bResolveAddress = this.sipStack.addressResolver.resolveAddress(new HopImpl(this.lastResponseHost, this.lastResponsePort, this.lastResponseTransport));
            MessageChannel messageChannelCreateRawMessageChannel = getSIPStack().createRawMessageChannel(getSipProvider().getListeningPoint(interfaceC12943bResolveAddress.getTransport()).getIPAddress(), getPort(), interfaceC12943bResolveAddress);
            if (messageChannelCreateRawMessageChannel == null) {
                throw new IOException("Could not create a message channel for " + interfaceC12943bResolveAddress + " with source IP:Port " + getSipProvider().getListeningPoint(interfaceC12943bResolveAddress.getTransport()).getIPAddress() + ":" + getPort());
            }
            if (logger.isLoggingEnabled(16)) {
                try {
                    SIPResponse sIPResponse2 = (SIPResponse) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.lastResponseAsBytes, true, false, null);
                    sIPResponse2.setRemoteAddress(messageChannelCreateRawMessageChannel.getPeerInetAddress());
                    sIPResponse2.setRemotePort(messageChannelCreateRawMessageChannel.getPeerPort());
                    sIPResponse2.setLocalPort(messageChannelCreateRawMessageChannel.getPort());
                    sIPResponse2.setLocalAddress(messageChannelCreateRawMessageChannel.getMessageProcessor().getIpAddress());
                    messageChannelCreateRawMessageChannel.logMessage(sIPResponse2, messageChannelCreateRawMessageChannel.getPeerInetAddress(), messageChannelCreateRawMessageChannel.getPeerPort(), System.currentTimeMillis());
                } catch (ParseException e11) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("couldn't reparse last response ".concat(new String(this.lastResponseAsBytes)), e11);
                    }
                }
            }
            messageChannelCreateRawMessageChannel.sendMessage(this.lastResponseAsBytes, InetAddress.getByName(interfaceC12943bResolveAddress.getHost()), interfaceC12943bResolveAddress.getPort(), false);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void sendMessage(SIPMessage sIPMessage) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sipServerTransaction::sendMessage " + sIPMessage.getFirstLine());
        }
        SIPResponse sIPResponse = (SIPResponse) sIPMessage;
        int statusCode = sIPResponse.getStatusCode();
        try {
            try {
                if (this.originalRequestBranch != null) {
                    sIPResponse.getTopmostVia().setBranch(getBranch());
                } else {
                    sIPResponse.getTopmostVia().removeParameter("branch");
                }
                if (!this.originalRequestHasPort) {
                    sIPResponse.getTopmostVia().removePort();
                }
                if (!sIPResponse.getCSeq().getMethod().equals(getMethod())) {
                    sendResponse(sIPResponse);
                    startTransactionTimer();
                    return;
                }
                if (!checkStateTimers(statusCode)) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("checkStateTimers returned false -- not sending message");
                    }
                    startTransactionTimer();
                    return;
                }
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("sendMessage : tx = " + this + " getState = " + getState());
                    }
                    this.lastResponse = sIPResponse;
                    this.lastResponseStatusCode = sIPResponse.getStatusCode();
                    sendResponse(sIPResponse);
                    startTransactionTimer();
                } catch (IOException e10) {
                    setState(5);
                    this.collectionTime = 0;
                    throw e10;
                }
            } catch (ParseException e11) {
                logger.logError("UnexpectedException", e11);
                throw new IOException("Unexpected exception");
            }
        } catch (Throwable th2) {
            startTransactionTimer();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void sendReliableProvisionalResponse(InterfaceC13462c interfaceC13462c) throws C10807n {
        if (this.pendingReliableResponseAsBytes != null) {
            throw new C10807n("Unacknowledged response");
        }
        SIPResponse sIPResponse = (SIPResponse) interfaceC13462c;
        this.pendingReliableResponseAsBytes = sIPResponse.encodeAsBytes(getTransport());
        this.pendingReliableResponseMethod = sIPResponse.getCSeq().getMethod();
        this.pendingReliableCSeqNumber = sIPResponse.getCSeq().getSeqNumber();
        RSeq rSeq = (RSeq) interfaceC13462c.getHeader(SIPHeaderNames.RSEQ);
        if (interfaceC13462c.getHeader(SIPHeaderNames.RSEQ) == null) {
            rSeq = new RSeq();
            interfaceC13462c.setHeader(rSeq);
        }
        try {
            if (this.rseqNumber < 0) {
                this.rseqNumber = (int) (Math.random() * 1000.0d);
            }
            int i10 = this.rseqNumber + 1;
            this.rseqNumber = i10;
            rSeq.setSeqNumber(i10);
            this.pendingReliableRSeqNumber = rSeq.getSeqNumber();
            this.lastResponse = (SIPResponse) interfaceC13462c;
            if (getDialog() != null && interlockProvisionalResponses && !this.provisionalResponseSem.tryAcquire(1L, TimeUnit.SECONDS)) {
                throw new C10807n("Unacknowledged reliable response");
            }
            this.provisionalResponseTask = new ProvisionalResponseTask();
            this.sipStack.getTimer().scheduleWithFixedDelay(this.provisionalResponseTask, 0L, 500L);
            sendMessage((SIPMessage) interfaceC13462c);
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
        }
    }

    public void sendResponse(SIPResponse sIPResponse) {
        String host;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sipServerTransaction::sendResponse " + sIPResponse.getFirstLine());
        }
        try {
            if (!isReliable() || this.sipStack.isPatchReceivedRport()) {
                Via topmostVia = sIPResponse.getTopmostVia();
                String transport = topmostVia.getTransport();
                if (transport == null) {
                    throw new IOException("missing transport!");
                }
                int rPort = topmostVia.getRPort();
                if (rPort == -1) {
                    rPort = topmostVia.getPort();
                }
                if (rPort == -1) {
                    rPort = transport.equalsIgnoreCase("TLS") ? SIPConstants.DEFAULT_TLS_PORT : SIPConstants.DEFAULT_PORT;
                }
                if (topmostVia.getMAddr() != null) {
                    host = topmostVia.getMAddr();
                } else {
                    String parameter = topmostVia.getParameter("received");
                    host = parameter == null ? topmostVia.getHost() : parameter;
                }
                InterfaceC12943b interfaceC12943bResolveAddress = this.sipStack.addressResolver.resolveAddress(new HopImpl(host, rPort, transport));
                MessageChannel messageChannelCreateRawMessageChannel = getSIPStack().createRawMessageChannel(getSipProvider().getListeningPoint(interfaceC12943bResolveAddress.getTransport()).getIPAddress(), getPort(), interfaceC12943bResolveAddress);
                if (messageChannelCreateRawMessageChannel == null) {
                    throw new IOException("Could not create a message channel for " + interfaceC12943bResolveAddress + " with source IP:Port " + getSipProvider().getListeningPoint(interfaceC12943bResolveAddress.getTransport()).getIPAddress() + ":" + getPort());
                }
                messageChannelCreateRawMessageChannel.sendMessage(sIPResponse);
                this.lastResponseHost = host;
                this.lastResponsePort = rPort;
                this.lastResponseTransport = transport;
            } else {
                getMessageChannel().sendMessage(sIPResponse);
            }
            this.lastResponseAsBytes = sIPResponse.encodeAsBytes(getTransport());
            this.lastResponse = null;
            startTransactionTimer();
        } catch (Throwable th2) {
            startTransactionTimer();
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setAckSeen() {
        this.isAckSeen = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setDialog(SIPDialog sIPDialog, String str) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setDialog " + this + " dialog = " + sIPDialog);
        }
        this.dialog = sIPDialog;
        this.dialogId = str;
        if (str != null) {
            sIPDialog.setAssigned();
        }
        if (this.retransmissionAlertEnabled && this.retransmissionAlertTimerTask != null) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            String str2 = this.retransmissionAlertTimerTask.dialogId;
            if (str2 != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str2);
            }
            this.retransmissionAlertTimerTask = null;
        }
        this.retransmissionAlertEnabled = false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setInviteTransaction(SIPServerTransaction sIPServerTransaction) {
        this.inviteTransaction = sIPServerTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setMapped(boolean z6) {
        this.isMapped = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setOriginalRequest(SIPRequest sIPRequest) {
        super.setOriginalRequest(sIPRequest);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setPendingSubscribe(SIPClientTransaction sIPClientTransaction) {
        this.pendingSubscribeTransaction = sIPClientTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setRequestInterface(ServerRequestInterface serverRequestInterface) {
        this.requestOf = serverRequestInterface;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setState(int i10) {
        if (i10 == 5 && isReliable() && !getSIPStack().cacheServerConnections) {
            this.collectionTime = 64;
            this.terminationSemaphore.release();
        }
        super.setState(i10);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void startTransactionTimer() {
        if ((getMethod().equalsIgnoreCase(TokenNames.INVITE) || getMethod().equalsIgnoreCase("CANCEL") || getMethod().equalsIgnoreCase(TokenNames.ACK)) && this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            TransactionTimer transactionTimer = new TransactionTimer();
            if (this.sipStack.getTimer() == null || !this.sipStack.getTimer().isStarted()) {
                return;
            }
            SipTimer timer = this.sipStack.getTimer();
            int i10 = this.baseTimerInterval;
            timer.scheduleWithFixedDelay(transactionTimer, i10, i10);
        }
    }

    public void startTransactionTimerJ(long j10) throws Throwable {
        if (this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("starting TransactionTimerJ() : " + getTransactionId() + " time " + j10);
            }
            SIPStackTimerTask sIPStackTimerTask = new SIPStackTimerTask() { // from class: android.gov.nist.javax.sip.stack.SIPServerTransactionImpl.1
                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                public Object getThreadHash() {
                    InterfaceC13461b request = SIPServerTransactionImpl.this.getRequest();
                    if (request == null || !(request instanceof SIPRequest)) {
                        return null;
                    }
                    return ((SIPRequest) request).getCallIdHeader().getCallId();
                }

                @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
                public void runTask() throws Throwable {
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                        SIPServerTransactionImpl.logger.logDebug("executing TransactionTimerJ() : " + SIPServerTransactionImpl.this.getTransactionId());
                    }
                    SIPServerTransactionImpl.this.fireTimeoutTimer();
                    SIPServerTransactionImpl.this.cleanUp();
                    SIPRequest sIPRequest = SIPServerTransactionImpl.this.originalRequest;
                    if (sIPRequest != null) {
                        sIPRequest.cleanUp();
                    }
                }
            };
            if (j10 > 0) {
                this.sipStack.getTimer().schedule(sIPStackTimerTask, j10 * ((long) this.baseTimerInterval));
            } else {
                sIPStackTimerTask.runTask();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void terminate() throws Throwable {
        setState(5);
        if (this.retransmissionAlertTimerTask != null) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            String str = this.retransmissionAlertTimerTask.dialogId;
            if (str != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str);
            }
            this.retransmissionAlertTimerTask = null;
        }
        if (this.transactionTimerStarted.get()) {
            return;
        }
        testAndSetTransactionTerminatedEvent();
        this.sipStack.removeTransaction(this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void waitForTermination() {
        try {
            this.terminationSemaphore.acquire();
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.ServerTransactionExt
    public SIPServerTransaction getCanceledInviteTransaction() {
        return this.inviteTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.stack.ServerRequestInterface
    public void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        boolean z6;
        ServerRequestInterface serverRequestInterface;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("processRequest: " + sIPRequest.getFirstLine());
            logger.logDebug("tx state = " + getRealState());
        }
        try {
            if (getRealState() < 0) {
                setOriginalRequest(sIPRequest);
                setState(1);
                setPassToListener();
                if (isInviteTransaction() && this.isMapped) {
                    sendMessage(sIPRequest.createResponse(100, "Trying"));
                }
                z6 = true;
            } else {
                if (isInviteTransaction() && 3 == getRealState() && sIPRequest.getMethod().equals(TokenNames.ACK)) {
                    setState(4);
                    disableRetransmissionTimer();
                    if (isReliable()) {
                        setState(5);
                    } else {
                        enableTimeoutTimer(this.timerI);
                    }
                    if (this.sipStack.isNon2XXAckPassedToListener()) {
                        this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                        return;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("ACK received for server Tx " + getTransactionId() + " not delivering to application!");
                    }
                    semRelease();
                    return;
                }
                if (sIPRequest.getMethod().equals(getMethod())) {
                    if (2 == getRealState() || 3 == getRealState()) {
                        semRelease();
                        resendLastResponseAsBytes();
                    } else if (!sIPRequest.getMethod().equals(TokenNames.ACK) || (serverRequestInterface = this.requestOf) == null) {
                        semRelease();
                    } else {
                        serverRequestInterface.processRequest(sIPRequest, this.encapsulatedChannel);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("completed processing retransmitted request : " + sIPRequest.getFirstLine() + this + " txState = " + getState() + " lastResponse = " + this.lastResponseAsBytes);
                        return;
                    }
                    return;
                }
                z6 = false;
            }
            if (3 != getRealState() && 5 != getRealState() && this.requestOf != null) {
                if (getMethod().equals(sIPRequest.getMethod())) {
                    if (z6) {
                        this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                        return;
                    } else {
                        semRelease();
                        return;
                    }
                }
                ServerRequestInterface serverRequestInterface2 = this.requestOf;
                if (serverRequestInterface2 != null) {
                    serverRequestInterface2.processRequest(sIPRequest, this.encapsulatedChannel);
                    return;
                } else {
                    semRelease();
                    return;
                }
            }
            if (SIPTransactionStack.isDialogCreated(getMethod()) && getRealState() == 5 && sIPRequest.getMethod().equals(TokenNames.ACK) && this.requestOf != null) {
                SIPDialog sIPDialog = (SIPDialog) getDialog();
                if (sIPDialog == null || !sIPDialog.ackProcessed) {
                    if (sIPDialog != null) {
                        sIPDialog.ackReceived(sIPRequest.getCSeq().getSeqNumber());
                        sIPDialog.ackProcessed = true;
                    }
                    this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                } else {
                    semRelease();
                }
            } else if (sIPRequest.getMethod().equals("CANCEL")) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Too late to cancel Transaction");
                }
                semRelease();
                try {
                    sendMessage(sIPRequest.createResponse(RCHTTPStatusCodes.SUCCESS));
                } catch (IOException unused) {
                }
            } else {
                semRelease();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping request " + getRealState());
            }
        } catch (IOException e10) {
            if (logger.isLoggingEnabled()) {
                logger.logError(EhBykzn.TManPaFKfqD, e10);
            }
            semRelease();
            raiseIOExceptionEvent();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void scheduleAckRemoval() {
        boolean z6;
        if (getMethod() != null && getMethod().equals(qffLJgOYizGmMj.QQLYyFT)) {
            startTransactionTimer();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Method is null[");
        if (getMethod() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        sb2.append(z6);
        sb2.append("] or method is not ACK[");
        sb2.append(getMethod());
        sb2.append("]");
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.ServerTransactionExt
    public void sendResponse(InterfaceC13462c interfaceC13462c) throws Throwable {
        SIPResponse sIPResponse = (SIPResponse) interfaceC13462c;
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (interfaceC13462c != 0) {
            try {
                sIPResponse.checkHeaders();
                String method = sIPResponse.getCSeq().getMethod();
                if (method.equals(getMethod())) {
                    int statusCode = interfaceC13462c.getStatusCode();
                    if (getMethod().equals(TokenNames.SUBSCRIBE) && statusCode / 100 == 2) {
                        if (interfaceC13462c.getHeader(SIPHeaderNames.EXPIRES) != null) {
                            Expires expires = (Expires) getOriginalRequest().getExpires();
                            Expires expires2 = (Expires) interfaceC13462c.getExpires();
                            if (expires != null && expires2.getExpires() > expires.getExpires()) {
                                throw new C10807n("Response Expires time exceeds request Expires time : See RFC 3265 3.1.1");
                            }
                        } else {
                            throw new IllegalTransactionStateException("Expires header is mandatory in 2xx response of SUBSCRIBE", IllegalTransactionStateException.Reason.ExpiresHeaderMandatory);
                        }
                    }
                    if (statusCode == 200 && method.equals(TokenNames.INVITE) && sIPResponse.getHeader(SIPHeaderNames.CONTACT) == null) {
                        throw new IllegalTransactionStateException("Contact Header is mandatory for the OK to the INVITE", IllegalTransactionStateException.Reason.ContactHeaderMandatory);
                    }
                    if (isMessagePartOfTransaction((SIPMessage) interfaceC13462c)) {
                        try {
                            ContentType contentTypeHeader = ((SIPResponse) interfaceC13462c).getContentTypeHeader();
                            if (this.pendingReliableResponseAsBytes != null && getDialog() != null && getInternalState() != 5 && statusCode / 100 == 2 && contentTypeHeader != null && contentTypeHeader.getContentType().equalsIgnoreCase(SIPServerTransaction.CONTENT_TYPE_APPLICATION) && contentTypeHeader.getContentSubType().equalsIgnoreCase(SIPServerTransaction.CONTENT_SUBTYPE_SDP)) {
                                if (interlockProvisionalResponses) {
                                    try {
                                        if (!this.provisionalResponseSem.tryAcquire(1L, TimeUnit.SECONDS)) {
                                            throw new C10807n("cannot send response -- unacked provisional");
                                        }
                                    } catch (InterruptedException unused) {
                                        logger.logError("Interrupted acuqiring PRACK sem");
                                        throw new C10807n("Cannot aquire PRACK sem");
                                    }
                                } else {
                                    throw new C10807n("cannot send response -- unacked provisional");
                                }
                            } else if (this.pendingReliableResponseAsBytes != null && sIPResponse.isFinalResponse()) {
                                this.sipStack.getTimer().cancel(this.provisionalResponseTask);
                                this.provisionalResponseTask = null;
                            }
                            if (sIPDialog != null) {
                                if (statusCode / 100 == 2 && SIPTransactionStack.isDialogCreated(method)) {
                                    if (sIPDialog.getLocalTag() == null && sIPResponse.getToTag() == null) {
                                        sIPResponse.getTo().setTag(Utils.getInstance().generateTag());
                                    } else if (sIPDialog.getLocalTag() != null && sIPResponse.getToTag() == null) {
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("assigning toTag : serverTransaction = " + this + " dialog " + sIPDialog + " tag = " + sIPDialog.getLocalTag());
                                        }
                                        sIPResponse.setToTag(sIPDialog.getLocalTag());
                                    } else if (sIPDialog.getLocalTag() != null && sIPResponse.getToTag() != null && !sIPDialog.getLocalTag().equals(sIPResponse.getToTag())) {
                                        throw new C10807n("Tag mismatch dialogTag is " + sIPDialog.getLocalTag() + " responseTag is " + sIPResponse.getToTag());
                                    }
                                }
                                if (!sIPResponse.getCallId().getCallId().equals(sIPDialog.getCallId().getCallId())) {
                                    throw new C10807n("Dialog mismatch!");
                                }
                            }
                            String fromTag = this.originalRequestFromTag;
                            if (getRequest() != null) {
                                fromTag = ((SIPRequest) getRequest()).getFromTag();
                            }
                            if (fromTag != null && sIPResponse.getFromTag() != null && !sIPResponse.getFromTag().equals(fromTag)) {
                                throw new C10807n("From tag of request does not match response from tag");
                            }
                            if (fromTag != null) {
                                sIPResponse.getFrom().setTag(fromTag);
                            } else if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("WARNING -- Null From tag in request!!");
                            }
                            if (sIPDialog != null && statusCode != 100) {
                                sIPDialog.setResponseTags(sIPResponse);
                                C10797d state = sIPDialog.getState();
                                sIPDialog.setLastResponse(this, (SIPResponse) interfaceC13462c);
                                if (state == null && sIPDialog.getState() == C10797d.f32035q0) {
                                    sIPDialog.getSipProvider().handleEvent(new C10798e(sIPDialog.getSipProvider(), sIPDialog), this);
                                }
                            } else if (sIPDialog == null && isInviteTransaction() && this.retransmissionAlertEnabled && this.retransmissionAlertTimerTask == null && interfaceC13462c.getStatusCode() / 100 == 2) {
                                String dialogId = ((SIPResponse) interfaceC13462c).getDialogId(true);
                                this.retransmissionAlertTimerTask = new RetransmissionAlertTimerTask(dialogId);
                                this.sipStack.retransmissionAlertTransactions.put(dialogId, this);
                                this.sipStack.getTimer().scheduleWithFixedDelay(this.retransmissionAlertTimerTask, 0L, 500L);
                            }
                            sendMessage((SIPResponse) interfaceC13462c);
                            if (sIPDialog != null) {
                                sIPDialog.startRetransmitTimer(this, (SIPResponse) interfaceC13462c);
                                return;
                            }
                            return;
                        } catch (IOException e10) {
                            if (logger.isLoggingEnabled()) {
                                logger.logException(e10);
                            }
                            setState(5);
                            raiseErrorEvent(2);
                            throw new C10807n(e10.getMessage(), e10);
                        } catch (ParseException e11) {
                            if (logger.isLoggingEnabled()) {
                                logger.logException(e11);
                            }
                            setState(5);
                            throw new C10807n(e11.getMessage(), e11);
                        }
                    }
                    throw new C10807n("Response does not belong to this transaction.");
                }
                throw new IllegalTransactionStateException("CSeq method does not match Request method of request that created the tx.", IllegalTransactionStateException.Reason.UnmatchingCSeq);
            } catch (ParseException e12) {
                throw new IllegalTransactionStateException(e12.getMessage(), IllegalTransactionStateException.Reason.MissingRequiredHeader);
            }
        }
        throw new NullPointerException("null response");
    }
}
