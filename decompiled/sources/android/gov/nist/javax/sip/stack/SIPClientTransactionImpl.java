package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.Expires;
import android.gov.nist.javax.sip.header.RecordRoute;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.TimeStamp;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.C10797d;
import android.javax.sip.C10800g;
import android.javax.sip.C10807n;
import android.javax.sip.C10812s;
import android.javax.sip.C10813t;
import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10795b;
import java.io.IOException;
import java.text.ParseException;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p509Uk.lpqL.SfpOlmlMATQ;
import p691d.InterfaceC12943b;
import p691d.InterfaceC12945d;
import p691d.InterfaceC12947f;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public class SIPClientTransactionImpl extends SIPTransactionImpl implements SIPClientTransaction {
    private static StackLogger logger = CommonLogger.getLogger(SIPClientTransaction.class);
    private int callingStateTimeoutCount;
    private SIPDialog defaultDialog;
    private String defaultDialogId;
    private SIPRequest lastRequest;
    private InterfaceC12943b nextHop;
    private boolean notifyOnRetransmit;
    private String originalRequestCallId;
    private Contact originalRequestContact;
    private Event originalRequestEventHeader;
    private String originalRequestFromTag;
    private String originalRequestScheme;
    private transient ServerResponseInterface respondTo;
    private Set<Integer> responsesReceived;
    private Set<String> sipDialogs;
    private boolean terminateDialogOnCleanUp;
    private boolean timeoutIfStillInCallingState;
    private AtomicBoolean timerKStarted;
    private transient SIPStackTimerTask transactionTimer;
    private boolean transactionTimerCancelled;
    private transient Object transactionTimerLock;
    private String viaHost;
    private int viaPort;

    public class ExpiresTimerTask extends SIPStackTimerTask {
        public ExpiresTimerTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            InterfaceC13461b request = SIPClientTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPClientTransactionImpl sIPClientTransactionImpl = SIPClientTransactionImpl.this;
            SipProviderImpl sipProvider = sIPClientTransactionImpl.getSipProvider();
            if (sIPClientTransactionImpl.getState() != C10815v.f32051t0) {
                C10812s[] c10812sArr = C10812s.f32041Z;
                sipProvider.handleEvent(new C10813t(sipProvider, sIPClientTransactionImpl), sIPClientTransactionImpl);
            } else if (SIPClientTransactionImpl.logger.isLoggingEnabled(32)) {
                SIPClientTransactionImpl.logger.logDebug("state = " + sIPClientTransactionImpl.getState());
            }
        }
    }

    public class TransactionTimer extends SIPStackTimerTask {
        public TransactionTimer() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            InterfaceC13461b request = SIPClientTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() throws Throwable {
            if (!SIPClientTransactionImpl.this.isTerminated()) {
                SIPClientTransactionImpl.this.fireTimer();
                return;
            }
            try {
                SIPClientTransactionImpl.this.sipStack.getTimer().cancel(this);
            } catch (IllegalStateException unused) {
                if (!SIPClientTransactionImpl.this.sipStack.isAlive()) {
                    return;
                }
            }
            SIPClientTransactionImpl.this.cleanUpOnTerminated();
        }
    }

    private final InterfaceC13461b createErrorAck() throws C10807n {
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest == null) {
            throw new C10807n("bad state " + getState());
        }
        if (!isInviteTransaction()) {
            throw new C10807n("Can only ACK an INVITE!");
        }
        SIPResponse sIPResponse = this.lastResponse;
        if (sIPResponse == null) {
            throw new C10807n("bad Transaction state");
        }
        if (sIPResponse.getStatusCode() >= 200) {
            return originalRequest.createErrorAck((C10766To) this.lastResponse.getTo());
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("lastResponse = " + this.lastResponse);
        }
        throw new C10807n("Cannot ACK a provisional response!");
    }

    private void inviteClientTransaction(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) {
        int statusCode = sIPResponse.getStatusCode();
        if (5 == getInternalState()) {
            boolean z6 = sIPDialog != null && sIPDialog.isAckSent(sIPResponse.getCSeq().getSeqNumber()) && sIPDialog.getLastAckSentCSeq().getSeqNumber() == sIPResponse.getCSeq().getSeqNumber() && sIPResponse.getFromTag().equals(sIPDialog.getLastAckSentFromTag());
            if (sIPDialog != null && z6 && sIPResponse.getCSeq().getMethod().equals(sIPDialog.getMethod())) {
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("resending ACK");
                    }
                    sIPDialog.resendAck();
                } catch (C10807n unused) {
                }
            }
            if (logger.isLoggingEnabled(32) && sIPDialog != null) {
                logger.logDebug("Dialog " + sIPDialog + " current state " + sIPDialog.getState());
            }
            if (sIPDialog == null && statusCode >= 200 && statusCode < 300) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Client Transaction " + this + " branch id " + getBranch() + " doesn't have any dialog and is in TERMINATED state");
                }
                if (this.respondTo == null) {
                    semRelease();
                    return;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("passing 2xx response up to the application");
                }
                this.respondTo.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                return;
            }
            if (sIPDialog == null || sIPDialog.getState() != C10797d.f32033o0 || statusCode < 200 || statusCode >= 300) {
                semRelease();
                return;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Client Transaction " + this + " branch id " + getBranch() + " has a early dialog and is in TERMINATED state");
            }
            sIPResponse.setRetransmission(false);
            if (this.respondTo == null) {
                semRelease();
                return;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("passing 2xx response up to the application");
            }
            this.respondTo.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
            return;
        }
        if (getInternalState() == 0) {
            int i10 = statusCode / 100;
            if (i10 == 2) {
                disableRetransmissionTimer();
                disableTimeoutTimer();
                setState(5);
                ServerResponseInterface serverResponseInterface = this.respondTo;
                if (serverResponseInterface != null) {
                    serverResponseInterface.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                    return;
                } else {
                    semRelease();
                    return;
                }
            }
            if (i10 == 1) {
                disableRetransmissionTimer();
                disableTimeoutTimer();
                setState(2);
                ServerResponseInterface serverResponseInterface2 = this.respondTo;
                if (serverResponseInterface2 != null) {
                    serverResponseInterface2.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                    return;
                } else {
                    semRelease();
                    return;
                }
            }
            if (300 > statusCode || statusCode > 699) {
                return;
            }
            try {
                sendMessage((SIPRequest) createErrorAck());
            } catch (Exception e10) {
                logger.logError("Unexpected Exception sending ACK -- sending error AcK ", e10);
            }
            if (getDialog() != null && ((SIPDialog) getDialog()).isBackToBackUserAgent()) {
                ((SIPDialog) getDialog()).releaseAckSem();
            }
            if (isReliable()) {
                setState(5);
            } else {
                setState(3);
                enableTimeoutTimer(this.timerD);
            }
            ServerResponseInterface serverResponseInterface3 = this.respondTo;
            if (serverResponseInterface3 != null) {
                serverResponseInterface3.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
            } else {
                semRelease();
            }
            cleanUpOnTimer();
            return;
        }
        if (2 != getInternalState()) {
            if (3 != getInternalState() || 300 > statusCode) {
                return;
            }
            try {
                if (statusCode <= 699) {
                    try {
                        sendMessage((SIPRequest) createErrorAck());
                    } catch (Exception e11) {
                        InternalErrorHandler.handleException(e11);
                    }
                    return;
                }
                return;
            } finally {
                semRelease();
            }
        }
        int i11 = statusCode / 100;
        if (i11 == 1) {
            ServerResponseInterface serverResponseInterface4 = this.respondTo;
            if (serverResponseInterface4 != null) {
                serverResponseInterface4.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                return;
            } else {
                semRelease();
                return;
            }
        }
        if (i11 == 2) {
            setState(5);
            ServerResponseInterface serverResponseInterface5 = this.respondTo;
            if (serverResponseInterface5 != null) {
                serverResponseInterface5.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                return;
            } else {
                semRelease();
                return;
            }
        }
        if (300 > statusCode || statusCode > 699) {
            return;
        }
        try {
            sendMessage((SIPRequest) createErrorAck());
        } catch (Exception e12) {
            InternalErrorHandler.handleException(e12);
        }
        if (getDialog() != null) {
            ((SIPDialog) getDialog()).releaseAckSem();
        }
        if (isReliable()) {
            setState(5);
        } else {
            setState(3);
            enableTimeoutTimer(this.timerD);
        }
        cleanUpOnTimer();
        ServerResponseInterface serverResponseInterface6 = this.respondTo;
        if (serverResponseInterface6 != null) {
            serverResponseInterface6.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
        } else {
            semRelease();
        }
    }

    private void nonInviteClientTransaction(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) throws Throwable {
        int statusCode = sIPResponse.getStatusCode();
        if (1 == getInternalState()) {
            if (statusCode / 100 == 1) {
                setState(2);
                enableRetransmissionTimer(getTimerT2());
                enableTimeoutTimer(64);
                ServerResponseInterface serverResponseInterface = this.respondTo;
                if (serverResponseInterface != null) {
                    serverResponseInterface.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                    return;
                } else {
                    semRelease();
                    return;
                }
            }
            if (200 > statusCode || statusCode > 699) {
                return;
            }
            if (isReliable()) {
                setState(5);
            } else {
                setState(3);
                scheduleTimerK(this.timerK);
            }
            ServerResponseInterface serverResponseInterface2 = this.respondTo;
            if (serverResponseInterface2 != null) {
                serverResponseInterface2.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
            } else {
                semRelease();
            }
            if (isReliable() && 5 == getInternalState()) {
                cleanUpOnTerminated();
            }
            cleanUpOnTimer();
            return;
        }
        if (2 != getInternalState()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(" Not sending response to TU! " + getState());
            }
            semRelease();
            return;
        }
        if (statusCode / 100 == 1) {
            ServerResponseInterface serverResponseInterface3 = this.respondTo;
            if (serverResponseInterface3 != null) {
                serverResponseInterface3.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                return;
            } else {
                semRelease();
                return;
            }
        }
        if (200 > statusCode || statusCode > 699) {
            return;
        }
        disableRetransmissionTimer();
        disableTimeoutTimer();
        if (isReliable()) {
            setState(5);
        } else {
            setState(3);
            scheduleTimerK(this.timerK);
        }
        ServerResponseInterface serverResponseInterface4 = this.respondTo;
        if (serverResponseInterface4 != null) {
            serverResponseInterface4.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
        } else {
            semRelease();
        }
        if (isReliable() && 5 == getInternalState()) {
            cleanUpOnTerminated();
        }
        cleanUpOnTimer();
    }

    private void scheduleTimerK(long j10) {
        if (this.transactionTimer == null || !this.timerKStarted.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.transactionTimerLock) {
            try {
                if (!this.transactionTimerCancelled) {
                    this.sipStack.getTimer().cancel(this.transactionTimer);
                    this.transactionTimer = null;
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("starting TransactionTimerK() : " + getTransactionId() + " time " + j10);
                    }
                    SIPStackTimerTask sIPStackTimerTask = new SIPStackTimerTask() { // from class: android.gov.nist.javax.sip.stack.SIPClientTransactionImpl.1
                        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                        public Object getThreadHash() {
                            InterfaceC13461b request = SIPClientTransactionImpl.this.getRequest();
                            if (request == null || !(request instanceof SIPRequest)) {
                                return null;
                            }
                            return ((SIPRequest) request).getCallIdHeader().getCallId();
                        }

                        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
                        public void runTask() throws Throwable {
                            if (SIPClientTransactionImpl.logger.isLoggingEnabled(32)) {
                                SIPClientTransactionImpl.logger.logDebug("executing TransactionTimerJ() : " + SIPClientTransactionImpl.this.getTransactionId());
                            }
                            SIPClientTransactionImpl.this.fireTimeoutTimer();
                            SIPClientTransactionImpl.this.cleanUpOnTerminated();
                        }
                    };
                    if (j10 > 0) {
                        this.sipStack.getTimer().schedule(sIPStackTimerTask, j10 * ((long) this.baseTimerInterval));
                    } else {
                        sIPStackTimerTask.runTask();
                    }
                    this.transactionTimerCancelled = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public void alertIfStillInCallingStateBy(int i10) {
        this.timeoutIfStillInCallingState = true;
        this.callingStateTimeoutCount = i10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public boolean checkFromTag(SIPResponse sIPResponse) {
        String originalRequestFromTag = getOriginalRequestFromTag();
        if (this.defaultDialog != null) {
            if ((originalRequestFromTag == null) ^ (sIPResponse.getFrom().getTag() == null)) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("From tag mismatch -- dropping response");
                }
                return false;
            }
            if (originalRequestFromTag != null && !originalRequestFromTag.equalsIgnoreCase(sIPResponse.getFrom().getTag())) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("From tag mismatch -- dropping response");
                }
                return false;
            }
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void cleanUp() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanup : " + getTransactionId());
            }
            SIPDialog sIPDialog = this.defaultDialog;
            if (sIPDialog != null) {
                this.defaultDialogId = sIPDialog.getDialogId();
                this.defaultDialog = null;
            }
            if (this.originalRequest != null && this.originalRequestBytes == null) {
                if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                this.mergeId = this.originalRequest.getMergeId();
            }
            this.originalRequest = null;
            cleanUpOnTimer();
            this.originalRequestCallId = null;
            this.originalRequestEventHeader = null;
            this.originalRequestFromTag = null;
            this.originalRequestContact = null;
            this.originalRequestScheme = null;
            Set<String> set = this.sipDialogs;
            if (set != null) {
                set.clear();
            }
            this.responsesReceived.clear();
            this.respondTo = null;
            this.transactionTimer = null;
            this.lastResponse = null;
            this.transactionTimerLock = null;
            this.timerKStarted = null;
        }
    }

    public void cleanUpOnTerminated() throws Throwable {
        SIPDialog sIPDialog;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("removing  = " + this + " isReliable " + isReliable());
        }
        if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal && this.originalRequest == null && this.originalRequestBytes != null) {
            try {
                this.originalRequest = (SIPRequest) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.originalRequestBytes, true, false, null);
            } catch (ParseException e10) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("message " + this.originalRequestBytes + " could not be reparsed !", e10);
                }
            }
        }
        this.sipStack.removeTransaction(this);
        if (this.sipStack.cacheClientConnections || !isReliable()) {
            if (logger.isLoggingEnabled() && isReliable()) {
                int i10 = getMessageChannel().useCount;
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Client Use Count = " + i10);
                }
            }
            if (((SipStackImpl) getSIPStack()).isReEntrantListener() && getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
                cleanUp();
            }
        } else {
            MessageChannel messageChannel = getMessageChannel();
            int i11 = messageChannel.useCount - 1;
            messageChannel.useCount = i11;
            if (i11 <= 0) {
                SIPTransactionImpl.LingerTimer lingerTimer = new SIPTransactionImpl.LingerTimer();
                if (this.sipStack.getConnectionLingerTimer() != 0) {
                    this.sipStack.getTimer().schedule(lingerTimer, this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    lingerTimer.runTask();
                }
            }
        }
        if (this.terminateDialogOnCleanUp && (sIPDialog = this.defaultDialog) != null && sIPDialog.getState() == null) {
            this.defaultDialog.setState(3);
        }
    }

    public void cleanUpOnTimer() {
        String dialogId;
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanupOnTimer: " + getTransactionId());
            }
            SIPDialog sIPDialog = this.defaultDialog;
            if (sIPDialog != null && (dialogId = sIPDialog.getDialogId()) != null && this.sipStack.getDialog(dialogId) != null) {
                this.defaultDialogId = dialogId;
                this.defaultDialog = null;
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null) {
                this.mergeId = sIPRequest.getMergeId();
                this.originalRequest.setTransaction(null);
                this.originalRequest.setInviteTransaction(null);
                this.originalRequest.cleanUp();
                if (this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                if (!getMethod().equalsIgnoreCase(TokenNames.INVITE) && !getMethod().equalsIgnoreCase("CANCEL")) {
                    this.originalRequestFromTag = this.originalRequest.getFromTag();
                    this.originalRequestCallId = this.originalRequest.getCallId().getCallId();
                    this.originalRequestEventHeader = (Event) this.originalRequest.getHeader(SIPHeaderNames.EVENT);
                    this.originalRequestContact = this.originalRequest.getContactHeader();
                    this.originalRequestScheme = this.originalRequest.getRequestURI().getScheme();
                    this.originalRequest = null;
                }
            }
            if (!getMethod().equalsIgnoreCase(TokenNames.SUBSCRIBE)) {
                this.lastResponse = null;
            }
            this.lastRequest = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void clearState() {
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public InterfaceC13461b createAck() throws C10807n {
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest == null) {
            throw new C10807n("bad state " + getState());
        }
        if (getMethod().equalsIgnoreCase(TokenNames.ACK)) {
            throw new C10807n("Cannot ACK an ACK!");
        }
        SIPResponse sIPResponse = this.lastResponse;
        if (sIPResponse == null) {
            throw new C10807n("bad Transaction state");
        }
        if (sIPResponse.getStatusCode() < 200) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("lastResponse = " + this.lastResponse);
            }
            throw new C10807n("Cannot ACK a provisional response!");
        }
        SIPRequest sIPRequestCreateAckRequest = originalRequest.createAckRequest((C10766To) this.lastResponse.getTo());
        RecordRouteList recordRouteHeaders = this.lastResponse.getRecordRouteHeaders();
        if (recordRouteHeaders == null) {
            if (this.lastResponse.getContactHeaders() != null && this.lastResponse.getStatusCode() / 100 != 3) {
                sIPRequestCreateAckRequest.setRequestURI((InterfaceC12947f) ((Contact) this.lastResponse.getContactHeaders().getFirst()).getAddress().getURI().clone());
            }
            return sIPRequestCreateAckRequest;
        }
        sIPRequestCreateAckRequest.removeHeader(SIPHeaderNames.ROUTE);
        RouteList routeList = new RouteList();
        ListIterator<RecordRoute> listIterator = recordRouteHeaders.listIterator(recordRouteHeaders.size());
        while (listIterator.hasPrevious()) {
            RecordRoute recordRoutePrevious = listIterator.previous();
            Route route = new Route();
            route.setAddress((AddressImpl) ((AddressImpl) recordRoutePrevious.getAddress()).clone());
            route.setParameters((NameValueList) recordRoutePrevious.getParameters().clone());
            routeList.add(route);
        }
        Route route2 = null;
        Contact contact = this.lastResponse.getContactHeaders() != null ? (Contact) this.lastResponse.getContactHeaders().getFirst() : null;
        if (!((InterfaceC12945d) ((Route) routeList.getFirst()).getAddress().getURI()).hasLrParam()) {
            if (contact != null) {
                route2 = new Route();
                route2.setAddress((AddressImpl) ((AddressImpl) contact.getAddress()).clone());
            }
            Route route3 = (Route) routeList.getFirst();
            routeList.removeFirst();
            sIPRequestCreateAckRequest.setRequestURI(route3.getAddress().getURI());
            if (route2 != null) {
                routeList.add(route2);
            }
            sIPRequestCreateAckRequest.addHeader(routeList);
        } else if (contact != null) {
            sIPRequestCreateAckRequest.setRequestURI((InterfaceC12947f) contact.getAddress().getURI().clone());
            sIPRequestCreateAckRequest.addHeader(routeList);
        }
        return sIPRequestCreateAckRequest;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public InterfaceC13461b createCancel() throws C10807n {
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest == null) {
            throw new C10807n("Bad state " + getState());
        }
        if (!originalRequest.getMethod().equals(TokenNames.INVITE)) {
            throw new C10807n("Only INIVTE may be cancelled");
        }
        if (originalRequest.getMethod().equalsIgnoreCase(TokenNames.ACK)) {
            throw new C10807n("Cannot Cancel ACK!");
        }
        SIPRequest sIPRequestCreateCancelRequest = originalRequest.createCancelRequest();
        sIPRequestCreateCancelRequest.setInviteTransaction(this);
        return sIPRequestCreateCancelRequest;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireRetransmissionTimer() {
        try {
            if (getInternalState() >= 0 && this.isMapped) {
                boolean zIsInviteTransaction = isInviteTransaction();
                int internalState = getInternalState();
                if (!zIsInviteTransaction || internalState != 0) {
                    if (zIsInviteTransaction) {
                        return;
                    }
                    if (1 != internalState && 2 != internalState) {
                        return;
                    }
                }
                SIPRequest sIPRequest = this.lastRequest;
                if (sIPRequest != null) {
                    if (this.sipStack.generateTimeStampHeader && sIPRequest.getHeader(SIPHeaderNames.TIMESTAMP) != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        TimeStamp timeStamp = new TimeStamp();
                        try {
                            timeStamp.setTimeStamp(jCurrentTimeMillis);
                        } catch (C10800g e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                        this.lastRequest.setHeader(timeStamp);
                    }
                    super.sendMessage(this.lastRequest);
                    if (this.notifyOnRetransmit) {
                        SipProviderImpl sipProvider = getSipProvider();
                        C10812s[] c10812sArr = C10812s.f32041Z;
                        getSipProvider().handleEvent(new C10813t(sipProvider, this), this);
                    }
                    if (this.timeoutIfStillInCallingState && getInternalState() == 0) {
                        int i10 = this.callingStateTimeoutCount - 1;
                        this.callingStateTimeoutCount = i10;
                        if (i10 == 0) {
                            SipProviderImpl sipProvider2 = getSipProvider();
                            C10812s[] c10812sArr2 = C10812s.f32041Z;
                            getSipProvider().handleEvent(new C10813t(sipProvider2, this), this);
                            this.timeoutIfStillInCallingState = false;
                        }
                    }
                }
            }
        } catch (IOException unused) {
            raiseIOExceptionEvent();
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireTimeoutTimer() {
        SIPClientTransaction sIPClientTransaction;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("fireTimeoutTimer " + this);
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (getInternalState() == 0 || 1 == getInternalState() || 2 == getInternalState()) {
            if (sIPDialog == null || !(sIPDialog.getState() == null || sIPDialog.getState() == C10797d.f32033o0)) {
                if (sIPDialog != null && getMethod().equalsIgnoreCase(TokenNames.BYE) && sIPDialog.isTerminatedOnBye()) {
                    sIPDialog.delete();
                }
            } else if (SIPTransactionStack.isDialogCreated(getMethod())) {
                sIPDialog.delete();
            }
        }
        if (3 == getInternalState() || 5 == getInternalState()) {
            setState(5);
            return;
        }
        raiseErrorEvent(1);
        if (!getMethod().equalsIgnoreCase("CANCEL") || (sIPClientTransaction = (SIPClientTransaction) getOriginalRequest().getInviteTransaction()) == null) {
            return;
        }
        if ((sIPClientTransaction.getInternalState() == 0 || sIPClientTransaction.getInternalState() == 2) && sIPClientTransaction.getDialog() != null) {
            sIPClientTransaction.setState(5);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public InterfaceC10795b getDialog() {
        SIPResponse sIPResponse = this.lastResponse;
        SIPDialog dialog = (sIPResponse == null || sIPResponse.getFromTag() == null || sIPResponse.getToTag() == null || sIPResponse.getStatusCode() == 100) ? null : getDialog(sIPResponse.getDialogId(false));
        if (dialog == null) {
            dialog = getDefaultDialog();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug(" sipDialogs =  " + this.sipDialogs + " default dialog " + getDefaultDialog() + " retval " + dialog);
        }
        return dialog;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public InterfaceC12943b getNextHop() {
        return this.nextHop;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public String getOriginalRequestCallId() {
        SIPRequest sIPRequest = this.originalRequest;
        return sIPRequest == null ? this.originalRequestCallId : sIPRequest.getCallId().getCallId();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public Contact getOriginalRequestContact() {
        SIPRequest sIPRequest = this.originalRequest;
        return sIPRequest == null ? this.originalRequestContact : sIPRequest.getContactHeader();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public Event getOriginalRequestEvent() {
        SIPRequest sIPRequest = this.originalRequest;
        return sIPRequest == null ? this.originalRequestEventHeader : (Event) sIPRequest.getHeader(SIPHeaderNames.EVENT);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public String getOriginalRequestFromTag() {
        SIPRequest sIPRequest = this.originalRequest;
        return sIPRequest == null ? this.originalRequestFromTag : sIPRequest.getFromTag();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public String getOriginalRequestScheme() {
        SIPRequest sIPRequest = this.originalRequest;
        return sIPRequest == null ? this.originalRequestScheme : sIPRequest.getRequestURI().getScheme();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public Via getOutgoingViaHeader() {
        return getMessageProcessor().getViaHeader();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public MessageChannel getRequestChannel() {
        return this.encapsulatedChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public String getViaHost() {
        return this.viaHost;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public int getViaPort() {
        return this.viaPort;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public boolean isNotifyOnRetransmit() {
        return this.notifyOnRetransmit;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.stack.ServerResponseInterface
    public synchronized void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) {
        try {
            if (getInternalState() < 0) {
                return;
            }
            if (3 == getInternalState() || 5 == getInternalState()) {
                if (sIPResponse.getStatusCode() / 100 == 1) {
                    return;
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("processing " + sIPResponse.getFirstLine() + "current state = " + getState());
                StackLogger stackLogger = logger;
                StringBuilder sb2 = new StringBuilder("dialog = ");
                sb2.append(sIPDialog);
                stackLogger.logDebug(sb2.toString());
            }
            this.lastResponse = sIPResponse;
            try {
                if (isInviteTransaction()) {
                    inviteClientTransaction(sIPResponse, messageChannel, sIPDialog);
                } else {
                    nonInviteClientTransaction(sIPResponse, messageChannel, sIPDialog);
                }
            } catch (IOException e10) {
                if (logger.isLoggingEnabled()) {
                    logger.logException(e10);
                }
                setState(5);
                raiseErrorEvent(2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void sendMessage(SIPMessage sIPMessage) {
        try {
            SIPRequest sIPRequest = (SIPRequest) sIPMessage;
            try {
                sIPRequest.getTopmostVia().setBranch(getBranch());
            } catch (ParseException unused) {
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Sending Message " + sIPMessage);
                logger.logDebug("TransactionState " + getState());
            }
            if ((2 == getInternalState() || getInternalState() == 0) && sIPRequest.getMethod().equals(TokenNames.ACK)) {
                if (isReliable()) {
                    setState(5);
                } else {
                    setState(3);
                }
                cleanUpOnTimer();
                super.sendMessage(sIPRequest);
                this.isMapped = true;
                startTransactionTimer();
                return;
            }
            try {
                this.lastRequest = sIPRequest;
                if (getInternalState() < 0) {
                    setOriginalRequest(sIPRequest);
                    if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                        setState(0);
                    } else if (sIPRequest.getMethod().equals(TokenNames.ACK)) {
                        setState(5);
                        cleanUpOnTimer();
                    } else {
                        setState(1);
                    }
                    if (!isReliable()) {
                        enableRetransmissionTimer();
                    }
                    if (isInviteTransaction()) {
                        enableTimeoutTimer(64);
                    } else {
                        enableTimeoutTimer(64);
                    }
                }
                super.sendMessage(sIPRequest);
                this.isMapped = true;
                startTransactionTimer();
            } catch (IOException e10) {
                setState(5);
                throw e10;
            }
        } catch (Throwable th2) {
            this.isMapped = true;
            startTransactionTimer();
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public void sendRequest() throws C10807n {
        SIPDialog defaultDialog;
        SIPRequest originalRequest = getOriginalRequest();
        if (getInternalState() >= 0) {
            throw new IllegalTransactionStateException("Request already sent", IllegalTransactionStateException.Reason.RequestAlreadySent);
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sendRequest() " + originalRequest);
        }
        try {
            originalRequest.checkHeaders();
            if (getMethod().equals(TokenNames.SUBSCRIBE) && originalRequest.getHeader(SIPHeaderNames.EXPIRES) == null && logger.isLoggingEnabled()) {
                logger.logWarning("Expires header missing in outgoing subscribe -- Notifier will assume implied value on event package");
            }
            try {
                if (getMethod().equals("CANCEL") && this.sipStack.isCancelClientTransactionChecked()) {
                    SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) this.sipStack.findCancelTransaction(getOriginalRequest(), false);
                    if (sIPClientTransaction == null) {
                        throw new C10807n("Could not find original tx to cancel. RFC 3261 9.1");
                    }
                    if (sIPClientTransaction.getInternalState() < 0) {
                        throw new C10807n("State is null no provisional response yet -- cannot cancel RFC 3261 9.1");
                    }
                    if (!sIPClientTransaction.isInviteTransaction()) {
                        throw new C10807n("Cannot cancel non-invite requests RFC 3261 9.1");
                    }
                } else if (getMethod().equals(TokenNames.BYE) || getMethod().equals(TokenNames.NOTIFY)) {
                    SIPDialog dialog = this.sipStack.getDialog(getOriginalRequest().getDialogId(false));
                    if (getSipProvider().isAutomaticDialogSupportEnabled() && dialog != null) {
                        throw new C10807n("Dialog is present and AutomaticDialogSupport is enabled for  the provider -- Send the Request using the Dialog.sendRequest(transaction)");
                    }
                }
                if (isInviteTransaction() && (defaultDialog = getDefaultDialog()) != null && defaultDialog.isBackToBackUserAgent() && !defaultDialog.takeAckSem()) {
                    throw new C10807n("Failed to take ACK semaphore");
                }
                this.isMapped = true;
                int expires = originalRequest.getHeader(SIPHeaderNames.EXPIRES) != null ? ((Expires) originalRequest.getHeader(SIPHeaderNames.EXPIRES)).getExpires() : -1;
                if (getDefaultDialog() != null && isInviteTransaction() && expires != -1 && this.expiresTimerTask == null) {
                    this.expiresTimerTask = new ExpiresTimerTask();
                    this.sipStack.getTimer().schedule(this.expiresTimerTask, ((long) expires) * 1000);
                }
                sendMessage(originalRequest);
            } catch (IOException e10) {
                setState(5);
                if (this.expiresTimerTask != null) {
                    this.sipStack.getTimer().cancel(this.expiresTimerTask);
                }
                throw new C10807n(e10.getMessage() == null ? "IO Error sending request" : e10.getMessage(), e10);
            }
        } catch (ParseException e11) {
            if (logger.isLoggingEnabled()) {
                logger.logError("missing required header");
            }
            throw new IllegalTransactionStateException(e11.getMessage(), IllegalTransactionStateException.Reason.MissingRequiredHeader);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setDialog(SIPDialog sIPDialog, String str) {
        Set<String> set;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setDialog: " + str + " sipDialog = " + sIPDialog);
        }
        if (sIPDialog == null) {
            if (logger.isLoggingEnabled(4)) {
                logger.logError("NULL DIALOG!!");
            }
            throw new NullPointerException("bad dialog null");
        }
        if (this.defaultDialog == null && this.defaultDialogId == null) {
            this.defaultDialog = sIPDialog;
            if (isInviteTransaction() && getSIPStack().getMaxForkTime() != 0) {
                getSIPStack().addForkedClientTransaction(this);
            }
        }
        if (str == null || sIPDialog.getDialogId() == null || (set = this.sipDialogs) == null) {
            return;
        }
        set.add(str);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setNextHop(InterfaceC12943b interfaceC12943b) {
        this.nextHop = interfaceC12943b;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public void setNotifyOnRetransmit(boolean z6) {
        this.notifyOnRetransmit = z6;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setResponseInterface(ServerResponseInterface serverResponseInterface) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Setting response interface for " + this + " to " + serverResponseInterface);
            if (serverResponseInterface == null) {
                logger.logStackTrace();
                logger.logDebug("WARNING -- setting to null!");
            }
        }
        this.respondTo = serverResponseInterface;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setState(int i10) {
        if (i10 == 5 && isReliable() && !getSIPStack().cacheClientConnections) {
            this.collectionTime = 64;
        }
        if (super.getInternalState() != 3 && (i10 == 3 || i10 == 5)) {
            this.sipStack.decrementActiveClientTransactionCount();
        }
        super.setState(i10);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setTerminateDialogOnCleanUp(boolean z6) {
        this.terminateDialogOnCleanUp = z6;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setViaHost(String str) {
        this.viaHost = str;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setViaPort(int i10) {
        this.viaPort = i10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void startTransactionTimer() {
        Object obj;
        if (!this.transactionTimerStarted.compareAndSet(false, true) || this.sipStack.getTimer() == null || (obj = this.transactionTimerLock) == null) {
            return;
        }
        synchronized (obj) {
            try {
                if (!this.transactionTimerCancelled) {
                    this.transactionTimer = new TransactionTimer();
                    SipTimer timer = this.sipStack.getTimer();
                    SIPStackTimerTask sIPStackTimerTask = this.transactionTimer;
                    int i10 = this.baseTimerInterval;
                    timer.scheduleWithFixedDelay(sIPStackTimerTask, i10, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void stopExpiresTimer() {
        if (this.expiresTimerTask != null) {
            this.sipStack.getTimer().cancel(this.expiresTimerTask);
            this.expiresTimerTask = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void terminate() throws Throwable {
        setState(5);
        if (!this.transactionTimerStarted.get()) {
            testAndSetTransactionTerminatedEvent();
            this.sipStack.removeTransaction(this);
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (sIPDialog != null) {
            sIPDialog.releaseAckSem();
        }
    }

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    public SIPDialog getDefaultDialog() {
        String str;
        SIPDialog sIPDialog = this.defaultDialog;
        return (sIPDialog != null || (str = this.defaultDialogId) == null) ? sIPDialog : this.sipStack.getDialog(str);
    }

    public SIPClientTransactionImpl(SIPTransactionStack sIPTransactionStack, MessageChannel messageChannel) {
        super(sIPTransactionStack, messageChannel);
        this.transactionTimerLock = new Object();
        this.timerKStarted = new AtomicBoolean(false);
        this.transactionTimerCancelled = false;
        this.responsesReceived = new CopyOnWriteArraySet();
        this.terminateDialogOnCleanUp = true;
        setBranch(Utils.getInstance().generateBranchId());
        setEncapsulatedChannel(messageChannel);
        this.notifyOnRetransmit = false;
        this.timeoutIfStillInCallingState = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug(SfpOlmlMATQ.IngwAYjepKKlqN + this);
            logger.logStackTrace();
        }
        this.sipDialogs = new CopyOnWriteArraySet();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isMessagePartOfTransaction(SIPMessage sIPMessage) {
        boolean z6;
        Via topmostVia = sIPMessage.getTopmostVia();
        String branch = topmostVia.getBranch();
        boolean z10 = true;
        if (getBranch() != null && branch != null) {
            String lowerCase = getBranch().toLowerCase();
            String str = HJrCuD.MSaNFanHn;
            if (lowerCase.startsWith(str) && branch.toLowerCase().startsWith(str)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (3 == getInternalState()) {
            if (z6) {
                if (!getBranch().equalsIgnoreCase(topmostVia.getBranch()) || !getMethod().equals(sIPMessage.getCSeq().getMethod())) {
                    z10 = false;
                }
                return z10;
            }
            return getBranch().equals(sIPMessage.getTransactionId());
        }
        if (isTerminated()) {
            return false;
        }
        if (z6) {
            if (!getBranch().equalsIgnoreCase(topmostVia.getBranch())) {
                return false;
            }
            return getMethod().equals(sIPMessage.getCSeq().getMethod());
        }
        if (getBranch() != null) {
            return getBranch().equalsIgnoreCase(sIPMessage.getTransactionId());
        }
        return ((SIPRequest) getRequest()).getTransactionId().equalsIgnoreCase(sIPMessage.getTransactionId());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public SIPDialog getDialog(String str) {
        Set<String> set = this.sipDialogs;
        if (set == null || !set.contains(str)) {
            return null;
        }
        SIPDialog dialog = this.sipStack.getDialog(str);
        return dialog == null ? this.sipStack.getEarlyDialog(str) : dialog;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.stack.ServerResponseInterface
    public void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel) throws Throwable {
        SIPDialog dialog;
        SIPDialog dialog2;
        SIPRequest sIPRequest;
        SIPResponse sIPResponse2;
        int statusCode = sIPResponse.getStatusCode();
        boolean zAdd = this.responsesReceived.add(Integer.valueOf(statusCode));
        boolean z6 = !zAdd;
        if (statusCode > 100 && statusCode < 200 && !zAdd && (sIPResponse2 = this.lastResponse) != null && !sIPResponse.equals(sIPResponse2)) {
            z6 = false;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("marking response as retransmission " + z6 + " for ctx " + this);
        }
        sIPResponse.setRetransmission(z6);
        String method = sIPResponse.getCSeq().getMethod();
        String dialogId = sIPResponse.getDialogId(false);
        if (method.equals("CANCEL") && (sIPRequest = this.lastRequest) != null) {
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) sIPRequest.getInviteTransaction();
            dialog = sIPClientTransaction != null ? sIPClientTransaction.getDefaultDialog() : null;
        } else {
            dialog = getDialog(dialogId);
        }
        if (dialog == null) {
            if (statusCode > 100 && statusCode < 300 && ((sIPResponse.getToTag() != null || this.sipStack.isRfc2543Supported()) && SIPTransactionStack.isDialogCreated(method))) {
                synchronized (this) {
                    try {
                        if (this.defaultDialog != null) {
                            if (sIPResponse.getFromTag() != null) {
                                String dialogId2 = this.defaultDialog.getDialogId();
                                if (this.defaultDialog.getLastResponseMethod() != null && (!method.equals(TokenNames.SUBSCRIBE) || !this.defaultDialog.getLastResponseMethod().equals(TokenNames.NOTIFY) || !dialogId2.equals(dialogId))) {
                                    dialog2 = this.sipStack.getDialog(dialogId);
                                    if (dialog2 == null && this.defaultDialog.isAssigned()) {
                                        dialog2 = this.sipStack.createDialog(this, sIPResponse);
                                        dialog2.setOriginalDialog(this.defaultDialog);
                                    }
                                } else {
                                    this.defaultDialog.setLastResponse(this, sIPResponse);
                                    dialog2 = this.defaultDialog;
                                }
                                dialog = dialog2;
                                if (dialog != null) {
                                    setDialog(dialog, dialog.getDialogId());
                                } else {
                                    logger.logError("dialog is unexpectedly null", new NullPointerException());
                                }
                            } else {
                                throw new RuntimeException("Response without from-tag");
                            }
                        } else {
                            SIPTransactionStack sIPTransactionStack = this.sipStack;
                            if (sIPTransactionStack.isAutomaticDialogSupportEnabled) {
                                dialog = sIPTransactionStack.createDialog(this, sIPResponse);
                                setDialog(dialog, dialog.getDialogId());
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                dialog = this.defaultDialog;
            }
        } else if (5 != getInternalState()) {
            dialog.setLastResponse(this, sIPResponse);
        }
        processResponse(sIPResponse, messageChannel, dialog);
    }
}
