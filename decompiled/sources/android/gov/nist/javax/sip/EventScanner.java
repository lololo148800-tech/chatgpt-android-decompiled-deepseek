package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.javax.sip.AbstractC10804k;
import android.javax.sip.AbstractC10805l;
import android.javax.sip.C10797d;
import android.javax.sip.C10798e;
import android.javax.sip.C10799f;
import android.javax.sip.C10813t;
import android.javax.sip.C10816w;
import android.javax.sip.InterfaceC10809p;
import java.util.EventObject;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p009A7.FlM.nkFZpTrMPpn;

/* JADX INFO: loaded from: classes.dex */
public class EventScanner implements Runnable {
    private static StackLogger logger = CommonLogger.getLogger(EventScanner.class);
    private boolean isStopped;
    private SipStackImpl sipStack;
    private AtomicInteger refCount = new AtomicInteger(0);
    private BlockingQueue<EventWrapper> pendingEvents = new LinkedBlockingQueue();

    public EventScanner(SipStackImpl sipStackImpl) {
        Thread thread = new Thread(this);
        thread.setDaemon(false);
        this.sipStack = sipStackImpl;
        thread.setName("EventScannerThread");
        thread.start();
    }

    private void deliverDialogTerminatedEvent(C10798e c10798e, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        if (interfaceC10809p != null) {
            try {
                interfaceC10809p.processDialogTerminated(c10798e);
            } catch (AbstractMethodError unused) {
                if (logger.isLoggingEnabled()) {
                    logger.logWarning("Unable to call sipListener.processDialogTerminated");
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[Catch: Exception -> 0x000c, TRY_LEAVE, TryCatch #0 {Exception -> 0x000c, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000e, B:10:0x0018), top: B:15:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000e A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000e, B:10:0x0018), top: B:15:0x0002 }] */
    private void deliverDialogTimeoutEvent(DialogTimeoutEvent dialogTimeoutEvent, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        if (interfaceC10809p != null) {
            try {
                if (interfaceC10809p instanceof SipListenerExt) {
                    ((SipListenerExt) interfaceC10809p).processDialogTimeout(dialogTimeoutEvent);
                } else if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("DialogTimeoutEvent not delivered");
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("DialogTimeoutEvent not delivered");
        }
    }

    private void deliverIOExceptionEvent(C10799f c10799f, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        if (interfaceC10809p != null) {
            try {
                interfaceC10809p.processIOException(c10799f);
            } catch (Exception e10) {
                logger.logException(e10);
            }
        }
    }

    private void deliverRequestEvent(AbstractC10804k abstractC10804k, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        SIPDialog sIPDialog;
        try {
            SIPRequest sIPRequest = (SIPRequest) abstractC10804k.getRequest();
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("deliverEvent : " + sIPRequest.getFirstLine() + " transaction " + eventWrapper.transaction + " sipEvent.serverTx = " + abstractC10804k.getServerTransaction());
            }
            SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) sIPRequest, true);
            if (sIPServerTransaction == null || sIPServerTransaction.passToListener()) {
                if (this.sipStack.findPendingTransaction(sIPRequest.getTransactionId()) != null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("transaction already exists!!");
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Done processing Message " + ((SIPRequest) abstractC10804k.getRequest()).getFirstLine());
                    }
                    SIPTransaction sIPTransaction = eventWrapper.transaction;
                    if (sIPTransaction != null && ((SIPServerTransaction) sIPTransaction).passToListener()) {
                        ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                    }
                    SIPTransaction sIPTransaction2 = eventWrapper.transaction;
                    if (sIPTransaction2 != null) {
                        this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction2);
                    }
                    if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                        eventWrapper.transaction.setState(5);
                        return;
                    }
                    return;
                }
                this.sipStack.putPendingTransaction((SIPServerTransaction) eventWrapper.transaction);
            } else {
                if (!sIPRequest.getMethod().equals(TokenNames.ACK) || !sIPServerTransaction.isInviteTransaction() || (sIPServerTransaction.getLastResponseStatusCode() / 100 != 2 && !this.sipStack.isNon2XXAckPassedToListener())) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("transaction already exists! " + sIPServerTransaction);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Done processing Message " + ((SIPRequest) abstractC10804k.getRequest()).getFirstLine());
                    }
                    SIPTransaction sIPTransaction3 = eventWrapper.transaction;
                    if (sIPTransaction3 != null && ((SIPServerTransaction) sIPTransaction3).passToListener()) {
                        ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                    }
                    SIPTransaction sIPTransaction4 = eventWrapper.transaction;
                    if (sIPTransaction4 != null) {
                        this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction4);
                    }
                    if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                        eventWrapper.transaction.setState(5);
                        return;
                    }
                    return;
                }
                if (!this.sipStack.isNon2XXAckPassedToListener() && logger.isLoggingEnabled(32)) {
                    logger.logDebug("Detected broken client sending ACK with same branch! Passing...");
                }
            }
            sIPRequest.setTransaction(eventWrapper.transaction);
            try {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Calling listener " + sIPRequest.getFirstLine());
                    logger.logDebug("Calling listener " + eventWrapper.transaction);
                }
                if (interfaceC10809p != null) {
                    interfaceC10809p.processRequest(abstractC10804k);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Done processing Message " + sIPRequest.getFirstLine());
                }
                SIPTransaction sIPTransaction5 = eventWrapper.transaction;
                if (sIPTransaction5 != null && (sIPDialog = (SIPDialog) sIPTransaction5.getDialog()) != null) {
                    sIPDialog.requestConsumed();
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Done processing Message " + ((SIPRequest) abstractC10804k.getRequest()).getFirstLine());
            }
            SIPTransaction sIPTransaction6 = eventWrapper.transaction;
            if (sIPTransaction6 != null && ((SIPServerTransaction) sIPTransaction6).passToListener()) {
                ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
            }
            SIPTransaction sIPTransaction7 = eventWrapper.transaction;
            if (sIPTransaction7 != null) {
                this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction7);
            }
            if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                eventWrapper.transaction.setState(5);
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Done processing Message " + ((SIPRequest) abstractC10804k.getRequest()).getFirstLine());
            }
            SIPTransaction sIPTransaction8 = eventWrapper.transaction;
            if (sIPTransaction8 != null && ((SIPServerTransaction) sIPTransaction8).passToListener()) {
                ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
            }
            SIPTransaction sIPTransaction9 = eventWrapper.transaction;
            if (sIPTransaction9 != null) {
                this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction9);
            }
            if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                eventWrapper.transaction.setState(5);
            }
            throw th2;
        }
    }

    private void deliverTimeoutEvent(C10813t c10813t, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        if (interfaceC10809p != null) {
            try {
                interfaceC10809p.processTimeout(c10813t);
            } catch (Exception e10) {
                logger.logException(e10);
            }
        }
    }

    private void deliverTransactionTerminatedEvent(C10816w c10816w, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("About to deliver transactionTerminatedEvent");
                logger.logDebug("tx = " + c10816w.f32054Z);
                logger.logDebug("tx = " + c10816w.f32053Y);
            }
            if (interfaceC10809p != null) {
                interfaceC10809p.processTransactionTerminated(c10816w);
            }
        } catch (AbstractMethodError unused) {
            if (logger.isLoggingEnabled()) {
                logger.logWarning("Unable to call sipListener.processTransactionTerminated");
            }
        } catch (Exception e10) {
            logger.logException(e10);
        }
    }

    public void addEvent(EventWrapper eventWrapper) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("addEvent " + eventWrapper);
        }
        if (this.pendingEvents.offer(eventWrapper)) {
            return;
        }
        logger.logWarning("reached queue capacity limit couldn't addEvent " + eventWrapper);
    }

    public void deliverEvent(EventWrapper eventWrapper) {
        EventObject eventObject = eventWrapper.sipEvent;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sipEvent = " + eventObject + "source = " + eventObject.getSource());
        }
        boolean z6 = eventObject instanceof C10799f;
        InterfaceC10809p sipListener = !z6 ? ((SipProviderImpl) eventObject.getSource()).getSipListener() : this.sipStack.getSipListener();
        if (eventObject instanceof AbstractC10804k) {
            deliverRequestEvent((AbstractC10804k) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof AbstractC10805l) {
            deliverResponseEvent((AbstractC10805l) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof C10813t) {
            deliverTimeoutEvent((C10813t) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof DialogTimeoutEvent) {
            deliverDialogTimeoutEvent((DialogTimeoutEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (z6) {
            deliverIOExceptionEvent((C10799f) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof C10816w) {
            deliverTransactionTerminatedEvent((C10816w) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof C10798e) {
            deliverDialogTerminatedEvent((C10798e) eventObject, eventWrapper, sipListener);
            return;
        }
        logger.logFatalError("bad event" + eventObject);
    }

    public void forceStop() {
        this.isStopped = true;
        this.refCount.set(0);
    }

    public void incrementRefcount() {
        this.refCount.incrementAndGet();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ThreadAuditor.ThreadHandle threadHandleAddCurrentThread = this.sipStack.getThreadAuditor() != null ? this.sipStack.getThreadAuditor().addCurrentThread() : null;
            while (!this.isStopped) {
                if (threadHandleAddCurrentThread != null) {
                    threadHandleAddCurrentThread.ping();
                }
                try {
                    deliverEvent(this.pendingEvents.take());
                } catch (InterruptedException e10) {
                    if (logger.isLoggingEnabled(4)) {
                        logger.logError("Interrupted!", e10);
                    }
                    if (!logger.isLoggingEnabled(32) || this.isStopped) {
                        return;
                    }
                    logger.logFatalError("Event scanner exited abnormally");
                    return;
                } catch (Exception e11) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("Unexpected exception caught while delivering event -- carrying on bravely", e11);
                    }
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Stopped event scanner!!");
            }
            if (!logger.isLoggingEnabled(32) || this.isStopped) {
                return;
            }
            logger.logFatalError("Event scanner exited abnormally");
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32) && !this.isStopped) {
                logger.logFatalError("Event scanner exited abnormally");
            }
            throw th2;
        }
    }

    public void stop() {
        if (this.refCount.get() == 0) {
            this.isStopped = true;
        }
    }

    private void deliverResponseEvent(AbstractC10805l abstractC10805l, EventWrapper eventWrapper, InterfaceC10809p interfaceC10809p) {
        try {
            SIPResponse sIPResponse = (SIPResponse) abstractC10805l.getResponse();
            SIPDialog sIPDialog = (SIPDialog) abstractC10805l.getDialog();
            try {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Calling listener " + interfaceC10809p + " for " + sIPResponse.getFirstLine());
                }
                if (interfaceC10809p != null) {
                    SIPTransaction sIPTransaction = eventWrapper.transaction;
                    if (sIPTransaction != null) {
                        sIPTransaction.setPassToListener();
                    }
                    interfaceC10809p.processResponse(abstractC10805l);
                }
                if (sIPDialog != null && ((sIPDialog.getState() == null || !sIPDialog.getState().equals(C10797d.f32035q0)) && (sIPResponse.getStatusCode() == 481 || sIPResponse.getStatusCode() == 408))) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug(nkFZpTrMPpn.uwhcSm);
                    }
                    sIPDialog.doDeferredDelete();
                }
                if (sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) && sIPDialog != null && sIPResponse.getStatusCode() == 200) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Warning! unacknowledged dialog. " + sIPDialog.getState());
                    }
                    sIPDialog.doDeferredDeleteIfNoAckSent(sIPResponse.getCSeq().getSeqNumber());
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) eventWrapper.transaction;
            if (sIPClientTransaction != null && 3 == sIPClientTransaction.getInternalState() && !sIPClientTransaction.getMethod().equals(TokenNames.INVITE)) {
                sIPClientTransaction.clearState();
            }
            SIPTransaction sIPTransaction2 = eventWrapper.transaction;
            if (sIPTransaction2 == null || !sIPTransaction2.passToListener()) {
                return;
            }
            eventWrapper.transaction.releaseSem();
        } catch (Throwable th2) {
            SIPTransaction sIPTransaction3 = eventWrapper.transaction;
            if (sIPTransaction3 != null && sIPTransaction3.passToListener()) {
                eventWrapper.transaction.releaseSem();
            }
            throw th2;
        }
    }
}
