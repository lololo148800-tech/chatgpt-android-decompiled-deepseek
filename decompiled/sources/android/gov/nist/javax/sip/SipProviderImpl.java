package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.RouterExt;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPDialogErrorEvent;
import android.gov.nist.javax.sip.stack.SIPDialogEventListener;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionErrorEvent;
import android.gov.nist.javax.sip.stack.SIPTransactionEventListener;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.AbstractC10804k;
import android.javax.sip.AbstractC10805l;
import android.javax.sip.C10796c;
import android.javax.sip.C10797d;
import android.javax.sip.C10800g;
import android.javax.sip.C10802i;
import android.javax.sip.C10807n;
import android.javax.sip.C10812s;
import android.javax.sip.C10813t;
import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10801h;
import android.javax.sip.InterfaceC10806m;
import android.javax.sip.InterfaceC10809p;
import android.javax.sip.InterfaceC10810q;
import android.javax.sip.InterfaceC10811r;
import android.javax.sip.InterfaceC10814u;
import java.io.IOException;
import java.text.ParseException;
import java.util.EventObject;
import java.util.Iterator;
import java.util.TooManyListenersException;
import p138F8.vJO.anhfj;
import p691d.InterfaceC12943b;
import p713e.InterfaceC13236j;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SipProviderImpl implements InterfaceC10810q, SipProviderExt, SIPTransactionEventListener, SIPDialogEventListener {
    private static StackLogger logger = CommonLogger.getLogger(SipProviderImpl.class);
    private boolean automaticDialogSupportEnabled;
    private boolean dialogErrorsAutomaticallyHandled;
    protected EventScanner eventScanner;
    private ConcurrentHashMap<String, InterfaceC10801h> listeningPoints;
    private InterfaceC10809p sipListener;
    protected SipStackImpl sipStack;

    private SipProviderImpl() {
        this.dialogErrorsAutomaticallyHandled = true;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized void addListeningPoint(InterfaceC10801h interfaceC10801h) {
        try {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) interfaceC10801h;
            SipProviderImpl sipProviderImpl = listeningPointImpl.sipProvider;
            if (sipProviderImpl != null && sipProviderImpl != this) {
                throw new C10802i("Listening point assigned to another provider");
            }
            String upperCase = listeningPointImpl.getTransport().toUpperCase();
            if (this.listeningPoints.containsKey(upperCase) && this.listeningPoints.get(upperCase) != interfaceC10801h) {
                throw new C10802i("Listening point already assigned for transport!");
            }
            listeningPointImpl.sipProvider = this;
            this.listeningPoints.put(upperCase, listeningPointImpl);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void addSipListener(InterfaceC10809p interfaceC10809p) throws TooManyListenersException {
        SipStackImpl sipStackImpl = this.sipStack;
        InterfaceC10809p interfaceC10809p2 = sipStackImpl.sipListener;
        if (interfaceC10809p2 == null) {
            sipStackImpl.sipListener = interfaceC10809p;
        } else if (interfaceC10809p2 != interfaceC10809p) {
            throw new TooManyListenersException("Stack already has a listener. Only one listener per stack allowed");
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("add SipListener " + interfaceC10809p);
        }
        this.sipListener = interfaceC10809p;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public SIPClientTransaction createClientTransaction(InterfaceC13461b interfaceC13461b, InterfaceC12943b interfaceC12943b) throws C10796c {
        SIPClientTransaction sIPClientTransaction;
        if (interfaceC13461b == null) {
            throw new NullPointerException("null request");
        }
        if (interfaceC12943b == null) {
            throw new NullPointerException("null hop");
        }
        if (!this.sipStack.isAlive()) {
            throw new C10796c("Stack is stopped");
        }
        SIPRequest sIPRequest = (SIPRequest) interfaceC13461b;
        if (sIPRequest.getTransaction() != null) {
            throw new C10796c("Transaction already assigned to request");
        }
        if (sIPRequest.getMethod().equals(TokenNames.ACK)) {
            throw new C10796c("Cannot create client transaction for  ACK");
        }
        if (sIPRequest.getTopmostVia() == null) {
            String transport = interfaceC12943b.getTransport();
            if (transport == null) {
                transport = ParameterNames.UDP;
            }
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) getListeningPoint(transport);
            if (listeningPointImpl == null) {
                listeningPointImpl = (ListeningPointImpl) getListeningPoints()[0];
            }
            sIPRequest.setHeader(listeningPointImpl.getViaHeader());
        }
        try {
            sIPRequest.checkHeaders();
            if (sIPRequest.getTopmostVia().getBranch() != null && sIPRequest.getTopmostVia().getBranch().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE) && this.sipStack.findTransaction((SIPMessage) sIPRequest, false) != null) {
                throw new C10796c("Transaction already exists!");
            }
            if (sIPRequest.getMethod().equalsIgnoreCase("CANCEL") && (sIPClientTransaction = (SIPClientTransaction) this.sipStack.findCancelTransaction(sIPRequest, false)) != null) {
                SIPClientTransaction sIPClientTransactionCreateClientTransaction = this.sipStack.createClientTransaction(sIPRequest, sIPClientTransaction.getMessageChannel());
                sIPClientTransactionCreateClientTransaction.addEventListener(this);
                this.sipStack.addTransaction(sIPClientTransactionCreateClientTransaction);
                if (sIPClientTransaction.getDialog() != null) {
                    sIPClientTransactionCreateClientTransaction.setDialog((SIPDialog) sIPClientTransaction.getDialog(), sIPRequest.getDialogId(false));
                }
                return sIPClientTransactionCreateClientTransaction;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("could not find existing transaction for " + sIPRequest + " creating a new one ");
            }
            String transport2 = interfaceC12943b.getTransport();
            ListeningPointImpl listeningPointImpl2 = (ListeningPointImpl) getListeningPoint(transport2);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Got following Listenin point " + listeningPointImpl2 + " for transport " + transport2);
            }
            if (listeningPointImpl2 == null) {
                listeningPointImpl2 = (ListeningPointImpl) getListeningPoint(sIPRequest.getTopmostVia().getTransport());
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Listenig point was null using new one from Via header " + listeningPointImpl2 + " for transport " + sIPRequest.getTopmostVia().getTransport());
                }
            }
            SIPDialog dialog = this.sipStack.getDialog(sIPRequest.getDialogId(false));
            if (dialog != null && dialog.getState() == C10797d.f32035q0) {
                this.sipStack.removeDialog(dialog);
            }
            try {
                if (sIPRequest.getTopmostVia().getBranch() == null || !sIPRequest.getTopmostVia().getBranch().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE) || this.sipStack.checkBranchId()) {
                    sIPRequest.getTopmostVia().setBranch(Utils.getInstance().generateBranchId());
                }
                Via topmostVia = sIPRequest.getTopmostVia();
                if (topmostVia.getTransport() == null) {
                    topmostVia.setTransport(transport2);
                }
                if (topmostVia.getPort() == -1) {
                    topmostVia.setPort(listeningPointImpl2.getPort());
                }
                String branch = sIPRequest.getTopmostVia().getBranch();
                SIPClientTransaction sIPClientTransactionCreateClientTransaction2 = this.sipStack.createClientTransaction(sIPRequest, this.sipStack.createMessageChannel(sIPRequest, listeningPointImpl2.getMessageProcessor(), interfaceC12943b));
                if (sIPClientTransactionCreateClientTransaction2 == null) {
                    throw new C10796c("Cound not create tx");
                }
                sIPClientTransactionCreateClientTransaction2.setNextHop(interfaceC12943b);
                sIPClientTransactionCreateClientTransaction2.setOriginalRequest(sIPRequest);
                sIPClientTransactionCreateClientTransaction2.setBranch(branch);
                if (SIPTransactionStack.isDialogCreated(sIPRequest.getMethod())) {
                    if (dialog != null) {
                        sIPClientTransactionCreateClientTransaction2.setDialog(dialog, sIPRequest.getDialogId(false));
                    } else if (isAutomaticDialogSupportEnabled()) {
                        sIPClientTransactionCreateClientTransaction2.setDialog(this.sipStack.createDialog(sIPClientTransactionCreateClientTransaction2), sIPRequest.getDialogId(false));
                    }
                } else if (dialog != null) {
                    sIPClientTransactionCreateClientTransaction2.setDialog(dialog, sIPRequest.getDialogId(false));
                }
                sIPClientTransactionCreateClientTransaction2.addEventListener(this);
                return sIPClientTransactionCreateClientTransaction2;
            } catch (C10800g e10) {
                InternalErrorHandler.handleException(e10);
                throw new C10796c("Unexpected Exception FIXME! ", e10);
            } catch (IOException e11) {
                throw new C10796c("Could not resolve next hop or listening point unavailable! ", e11);
            } catch (ParseException e12) {
                InternalErrorHandler.handleException(e12);
                throw new C10796c("Unexpected Exception FIXME! ", e12);
            }
        } catch (ParseException e13) {
            throw new C10796c(e13.getMessage(), e13);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPDialogEventListener
    public void dialogErrorEvent(SIPDialogErrorEvent sIPDialogErrorEvent) {
        SIPDialog sIPDialog = (SIPDialog) sIPDialogErrorEvent.getSource();
        DialogTimeoutEvent.Reason reason = DialogTimeoutEvent.Reason.AckNotReceived;
        if (sIPDialogErrorEvent.getErrorID() == 2) {
            reason = DialogTimeoutEvent.Reason.AckNotSent;
        } else if (sIPDialogErrorEvent.getErrorID() == 3) {
            reason = DialogTimeoutEvent.Reason.ReInviteTimeout;
        } else if (sIPDialogErrorEvent.getErrorID() == 4) {
            reason = DialogTimeoutEvent.Reason.EarlyStateTimeout;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Dialog TimeoutError occured on " + sIPDialog);
        }
        DialogTimeoutEvent dialogTimeoutEvent = new DialogTimeoutEvent(this, sIPDialog, reason);
        dialogTimeoutEvent.setClientTransaction(sIPDialogErrorEvent.getClientTransaction());
        handleEvent(dialogTimeoutEvent, null);
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public InterfaceC10801h getListeningPoint(String str) {
        if (str != null) {
            return this.listeningPoints.get(str.toUpperCase());
        }
        throw new NullPointerException("Null transport param");
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized InterfaceC10801h[] getListeningPoints() {
        ListeningPointImpl[] listeningPointImplArr;
        listeningPointImplArr = new ListeningPointImpl[this.listeningPoints.size()];
        this.listeningPoints.values().toArray(listeningPointImplArr);
        return listeningPointImplArr;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public InterfaceC13236j getNewCallId() {
        String strGenerateCallIdentifier = Utils.getInstance().generateCallIdentifier(getListeningPoint().getIPAddress());
        CallID callID = new CallID();
        try {
            callID.setCallId(strGenerateCallIdentifier);
        } catch (ParseException unused) {
        }
        return callID;
    }

    @Override // android.javax.sip.InterfaceC10810q
    public InterfaceC10794a getNewClientTransaction(InterfaceC13461b interfaceC13461b) {
        try {
            InterfaceC12943b nextHop = this.sipStack.getNextHop((SIPRequest) interfaceC13461b);
            if (nextHop == null) {
                throw new C10796c("Cannot resolve next hop -- transaction unavailable");
            }
            SIPClientTransaction sIPClientTransactionCreateClientTransaction = createClientTransaction(interfaceC13461b, nextHop);
            this.sipStack.addTransaction(sIPClientTransactionCreateClientTransaction);
            return sIPClientTransactionCreateClientTransaction;
        } catch (C10807n e10) {
            throw new C10796c("Cannot resolve next hop -- transaction unavailable", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public InterfaceC10795b getNewDialog(InterfaceC10814u interfaceC10814u) throws C10807n {
        SIPDialog sIPDialogCreateDialog;
        if (interfaceC10814u == null) {
            throw new NullPointerException("Null transaction!");
        }
        if (!this.sipStack.isAlive()) {
            throw new C10807n("Stack is stopped.");
        }
        if (isAutomaticDialogSupportEnabled()) {
            throw new C10807n(" Error - AUTOMATIC_DIALOG_SUPPORT is on");
        }
        if (!SIPTransactionStack.isDialogCreated(interfaceC10814u.getRequest().getMethod())) {
            throw new C10807n("Dialog cannot be created for this method " + interfaceC10814u.getRequest().getMethod());
        }
        SIPTransaction sIPTransaction = (SIPTransaction) interfaceC10814u;
        if (interfaceC10814u instanceof InterfaceC10806m) {
            SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) interfaceC10814u;
            SIPResponse lastResponse = sIPServerTransaction.getLastResponse();
            if (lastResponse != null && lastResponse.getStatusCode() != 100) {
                throw new C10807n("Cannot set dialog after response has been sent");
            }
            SIPRequest sIPRequest = (SIPRequest) interfaceC10814u.getRequest();
            sIPDialogCreateDialog = this.sipStack.getDialog(sIPRequest.getDialogId(true));
            if (sIPDialogCreateDialog == null) {
                sIPDialogCreateDialog = this.sipStack.createDialog(sIPTransaction);
                sIPDialogCreateDialog.addTransaction(sIPTransaction);
                sIPDialogCreateDialog.addRoute(sIPRequest);
                sIPTransaction.setDialog(sIPDialogCreateDialog, null);
            } else {
                sIPTransaction.setDialog(sIPDialogCreateDialog, sIPRequest.getDialogId(true));
            }
            if (sIPRequest.getMethod().equals(TokenNames.INVITE) && isDialogErrorsAutomaticallyHandled()) {
                this.sipStack.putInMergeTable(sIPServerTransaction, sIPRequest);
            }
        } else {
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) interfaceC10814u;
            if (sIPClientTransaction.getLastResponse() != null) {
                throw new C10807n("Cannot call this method after response is received!");
            }
            if (this.sipStack.getDialog(((SIPRequest) sIPClientTransaction.getRequest()).getDialogId(false)) != null) {
                throw new C10807n("Dialog already exists!");
            }
            sIPDialogCreateDialog = this.sipStack.createDialog(sIPTransaction);
            sIPClientTransaction.setDialog(sIPDialogCreateDialog, null);
        }
        sIPDialogCreateDialog.addEventListener(this);
        return sIPDialogCreateDialog;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public InterfaceC10806m getNewServerTransaction(InterfaceC13461b interfaceC13461b) throws C10796c {
        SIPServerTransaction sIPServerTransactionCreateServerTransaction;
        if (!this.sipStack.isAlive()) {
            throw new C10796c("Stack is stopped");
        }
        SIPRequest sIPRequest = (SIPRequest) interfaceC13461b;
        try {
            sIPRequest.checkHeaders();
            if (interfaceC13461b.getMethod().equals(TokenNames.ACK)) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Creating server transaction for ACK -- makes no sense!");
                }
                throw new C10796c("Cannot create Server transaction for ACK ");
            }
            if (sIPRequest.getMethod().equals(TokenNames.NOTIFY) && sIPRequest.getFromTag() != null && sIPRequest.getToTag() == null && this.sipStack.findSubscribeTransaction(sIPRequest, (ListeningPointImpl) getListeningPoint()) == null && !this.sipStack.isDeliverUnsolicitedNotify()) {
                throw new C10796c("Cannot find matching Subscription (and android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY not set)");
            }
            if (!this.sipStack.acquireSem()) {
                throw new C10796c("Transaction not available -- could not acquire stack lock");
            }
            try {
                if (SIPTransactionStack.isDialogCreated(sIPRequest.getMethod())) {
                    if (this.sipStack.findTransaction((SIPMessage) interfaceC13461b, true) != null) {
                        throw new C10796c("server transaction already exists!");
                    }
                    sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) ((SIPRequest) interfaceC13461b).getTransaction();
                    if (sIPServerTransactionCreateServerTransaction == null) {
                        throw new C10796c("Transaction not available");
                    }
                    if (sIPServerTransactionCreateServerTransaction.getOriginalRequest() == null) {
                        sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                    }
                    try {
                        this.sipStack.addTransaction(sIPServerTransactionCreateServerTransaction);
                        sIPServerTransactionCreateServerTransaction.addEventListener(this);
                        if (isAutomaticDialogSupportEnabled()) {
                            SIPDialog dialog = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                            if (dialog == null) {
                                dialog = this.sipStack.createDialog(sIPServerTransactionCreateServerTransaction);
                            }
                            sIPServerTransactionCreateServerTransaction.setDialog(dialog, sIPRequest.getDialogId(true));
                            if (sIPRequest.getMethod().equals(TokenNames.INVITE) && isDialogErrorsAutomaticallyHandled()) {
                                this.sipStack.putInMergeTable(sIPServerTransactionCreateServerTransaction, sIPRequest);
                            }
                            dialog.addRoute(sIPRequest);
                            if (dialog.getRemoteTag() != null && dialog.getLocalTag() != null) {
                                this.sipStack.putDialog(dialog);
                            }
                        }
                    } catch (IOException unused) {
                        throw new C10796c("Error sending provisional response");
                    }
                } else if (isAutomaticDialogSupportEnabled()) {
                    if (((SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) interfaceC13461b, true)) != null) {
                        throw new C10796c("Transaction exists! ");
                    }
                    sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) ((SIPRequest) interfaceC13461b).getTransaction();
                    if (sIPServerTransactionCreateServerTransaction == null) {
                        throw new C10796c("Transaction not available!");
                    }
                    if (sIPServerTransactionCreateServerTransaction.getOriginalRequest() == null) {
                        sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                    }
                    try {
                        this.sipStack.addTransaction(sIPServerTransactionCreateServerTransaction);
                        SIPDialog dialog2 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                        if (dialog2 != null) {
                            dialog2.addTransaction(sIPServerTransactionCreateServerTransaction);
                            dialog2.addRoute(sIPRequest);
                            sIPServerTransactionCreateServerTransaction.setDialog(dialog2, sIPRequest.getDialogId(true));
                        }
                    } catch (IOException unused2) {
                        throw new C10796c("Could not send back provisional response!");
                    }
                } else {
                    if (((SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) interfaceC13461b, true)) != null) {
                        throw new C10796c("Transaction exists! ");
                    }
                    sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) ((SIPRequest) interfaceC13461b).getTransaction();
                    if (sIPServerTransactionCreateServerTransaction != null) {
                        if (sIPServerTransactionCreateServerTransaction.getOriginalRequest() == null) {
                            sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                        }
                        this.sipStack.mapTransaction(sIPServerTransactionCreateServerTransaction);
                        SIPDialog dialog3 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                        if (dialog3 != null) {
                            dialog3.addTransaction(sIPServerTransactionCreateServerTransaction);
                            dialog3.addRoute(sIPRequest);
                            sIPServerTransactionCreateServerTransaction.setDialog(dialog3, sIPRequest.getDialogId(true));
                        }
                    } else {
                        sIPServerTransactionCreateServerTransaction = this.sipStack.createServerTransaction((MessageChannel) sIPRequest.getMessageChannel());
                        if (sIPServerTransactionCreateServerTransaction == null) {
                            throw new C10796c("Transaction unavailable -- too many servrer transactions");
                        }
                        sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                        this.sipStack.mapTransaction(sIPServerTransactionCreateServerTransaction);
                        SIPDialog dialog4 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                        if (dialog4 != null) {
                            dialog4.addTransaction(sIPServerTransactionCreateServerTransaction);
                            dialog4.addRoute(sIPRequest);
                            sIPServerTransactionCreateServerTransaction.setDialog(dialog4, sIPRequest.getDialogId(true));
                        }
                    }
                }
                this.sipStack.releaseSem();
                return sIPServerTransactionCreateServerTransaction;
            } catch (Throwable th2) {
                this.sipStack.releaseSem();
                throw th2;
            }
        } catch (ParseException e10) {
            throw new C10796c(e10.getMessage(), e10);
        }
    }

    public InterfaceC10809p getSipListener() {
        return this.sipListener;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public InterfaceC10811r getSipStack() {
        return this.sipStack;
    }

    public void handleEvent(EventObject eventObject, SIPTransaction sIPTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("handleEvent " + eventObject + "currentTransaction = " + sIPTransaction + "this.sipListener = " + getSipListener() + "sipEvent.source = " + eventObject.getSource());
            if (eventObject instanceof AbstractC10804k) {
                InterfaceC10795b dialog = ((AbstractC10804k) eventObject).getDialog();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dialog = " + dialog);
                }
            } else if (eventObject instanceof AbstractC10805l) {
                InterfaceC10795b dialog2 = ((AbstractC10805l) eventObject).getDialog();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dialog = " + dialog2);
                }
            }
            logger.logStackTrace();
        }
        EventWrapper eventWrapper = new EventWrapper(eventObject, sIPTransaction);
        if (this.sipStack.isReEntrantListener()) {
            this.eventScanner.deliverEvent(eventWrapper);
        } else {
            this.eventScanner.addEvent(eventWrapper);
        }
    }

    public boolean isAutomaticDialogSupportEnabled() {
        return this.automaticDialogSupportEnabled;
    }

    public boolean isDialogErrorsAutomaticallyHandled() {
        return this.dialogErrorsAutomaticallyHandled;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized void removeListeningPoint(InterfaceC10801h interfaceC10801h) {
        ListeningPointImpl listeningPointImpl = (ListeningPointImpl) interfaceC10801h;
        if (listeningPointImpl.messageProcessor.inUse()) {
            throw new C10802i("Object is in use");
        }
        this.listeningPoints.remove(listeningPointImpl.getTransport().toUpperCase());
    }

    public synchronized void removeListeningPoints() {
        Iterator<InterfaceC10801h> it = this.listeningPoints.values().iterator();
        while (it.hasNext()) {
            ((ListeningPointImpl) it.next()).messageProcessor.stop();
            it.remove();
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void removeSipListener(InterfaceC10809p interfaceC10809p) {
        if (interfaceC10809p == getSipListener()) {
            this.sipListener = null;
        }
        Iterator<SipProviderImpl> sipProviders = this.sipStack.getSipProviders();
        boolean z6 = false;
        while (sipProviders.hasNext()) {
            if (sipProviders.next().getSipListener() != null) {
                z6 = true;
            }
        }
        if (z6) {
            return;
        }
        this.sipStack.sipListener = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void sendResponse(InterfaceC13462c interfaceC13462c) throws C10807n {
        if (!this.sipStack.isAlive()) {
            throw new C10807n("Stack is stopped");
        }
        SIPResponse sIPResponse = (SIPResponse) interfaceC13462c;
        Via topmostVia = sIPResponse.getTopmostVia();
        if (topmostVia == null) {
            throw new C10807n("No via header in response!");
        }
        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) interfaceC13462c, true);
        if (sIPServerTransaction != null && sIPServerTransaction.getInternalState() != 5 && isAutomaticDialogSupportEnabled()) {
            throw new C10807n("Transaction exists -- cannot send response statelessly");
        }
        String transport = topmostVia.getTransport();
        String received = topmostVia.getReceived();
        if (received == null) {
            received = topmostVia.getHost();
        }
        int rPort = topmostVia.getRPort();
        if (rPort == -1 && (rPort = topmostVia.getPort()) == -1) {
            rPort = (transport.equalsIgnoreCase("TLS") || transport.equalsIgnoreCase("SCTP-TLS")) ? SIPConstants.DEFAULT_TLS_PORT : SIPConstants.DEFAULT_PORT;
        }
        if (received.indexOf(":") > 0 && received.indexOf("[") < 0) {
            received = AbstractC10763a.m11054l("[", received, "]");
        }
        InterfaceC12943b interfaceC12943bResolveAddress = this.sipStack.getAddressResolver().resolveAddress(new HopImpl(received, rPort, transport));
        try {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) getListeningPoint(transport);
            if (listeningPointImpl == null) {
                throw new C10807n("whoopsa daisy! no listening point found for transport " + transport);
            }
            MessageChannel messageChannelCreateRawMessageChannel = this.sipStack.createRawMessageChannel(getListeningPoint(interfaceC12943bResolveAddress.getTransport()).getIPAddress(), listeningPointImpl.port, interfaceC12943bResolveAddress);
            if (messageChannelCreateRawMessageChannel != null) {
                messageChannelCreateRawMessageChannel.sendMessage(sIPResponse);
                return;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Could not create a message channel for " + interfaceC12943bResolveAddress.toString() + " listeningPoints = " + this.listeningPoints);
            }
            throw new C10807n("Could not create a message channel for " + interfaceC12943bResolveAddress.toString());
        } catch (IOException e10) {
            throw new C10807n(e10.getMessage());
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void setAutomaticDialogSupportEnabled(boolean z6) {
        this.automaticDialogSupportEnabled = z6;
        if (z6) {
            this.dialogErrorsAutomaticallyHandled = true;
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void setDialogErrorsAutomaticallyHandled() {
        this.dialogErrorsAutomaticallyHandled = true;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized void setListeningPoint(InterfaceC10801h interfaceC10801h) {
        try {
            if (interfaceC10801h == null) {
                throw new NullPointerException("Null listening point");
            }
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) interfaceC10801h;
            listeningPointImpl.sipProvider = this;
            String upperCase = listeningPointImpl.getTransport().toUpperCase();
            this.listeningPoints.clear();
            this.listeningPoints.put(upperCase, interfaceC10801h);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void stop() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Exiting provider");
        }
        Iterator<InterfaceC10801h> it = this.listeningPoints.values().iterator();
        while (it.hasNext()) {
            ((ListeningPointImpl) it.next()).removeSipProvider();
        }
        this.eventScanner.stop();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionEventListener
    public void transactionErrorEvent(SIPTransactionErrorEvent sIPTransactionErrorEvent) {
        C10813t c10813t;
        C10813t c10813t2;
        SIPTransaction sIPTransaction = (SIPTransaction) sIPTransactionErrorEvent.getSource();
        if (sIPTransactionErrorEvent.getErrorID() == 2) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("TransportError occured on " + sIPTransaction);
            }
            Object source = sIPTransactionErrorEvent.getSource();
            C10812s[] c10812sArr = C10812s.f32041Z;
            if (source instanceof SIPServerTransaction) {
                c10813t2 = new C10813t(this, (InterfaceC10806m) source);
            } else {
                InterfaceC12943b nextHop = ((SIPClientTransaction) source).getNextHop();
                if (this.sipStack.getRouter() instanceof RouterExt) {
                    ((RouterExt) this.sipStack.getRouter()).transactionTimeout(nextHop);
                }
                c10813t2 = new C10813t(this, (InterfaceC10794a) source);
            }
            handleEvent(c10813t2, (SIPTransaction) source);
            return;
        }
        if (sIPTransactionErrorEvent.getErrorID() != 1) {
            if (sIPTransactionErrorEvent.getErrorID() == 3) {
                Object source2 = sIPTransactionErrorEvent.getSource();
                if (((InterfaceC10814u) source2).getDialog() != null) {
                    InternalErrorHandler.handleException("Unexpected event !", logger);
                }
                C10812s[] c10812sArr2 = C10812s.f32041Z;
                handleEvent(source2 instanceof SIPServerTransaction ? new C10813t(this, (InterfaceC10806m) source2) : new C10813t(this, (InterfaceC10794a) source2), (SIPTransaction) source2);
                return;
            }
            return;
        }
        Object source3 = sIPTransactionErrorEvent.getSource();
        C10812s[] c10812sArr3 = C10812s.f32041Z;
        if (source3 instanceof SIPServerTransaction) {
            c10813t = new C10813t(this, (InterfaceC10806m) source3);
        } else {
            InterfaceC12943b nextHop2 = ((SIPClientTransaction) source3).getNextHop();
            if (this.sipStack.getRouter() instanceof RouterExt) {
                ((RouterExt) this.sipStack.getRouter()).transactionTimeout(nextHop2);
            }
            c10813t = new C10813t(this, (InterfaceC10794a) source3);
        }
        handleEvent(c10813t, (SIPTransaction) source3);
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void sendRequest(InterfaceC13461b interfaceC13461b) throws C10807n {
        StackLogger stackLogger;
        StringBuilder sb2;
        Via topmostVia;
        String branch;
        SIPDialog dialog;
        if (!this.sipStack.isAlive()) {
            throw new C10807n("Stack is stopped.");
        }
        SIPRequest sIPRequest = (SIPRequest) interfaceC13461b;
        if (sIPRequest.getRequestLine() != null && interfaceC13461b.getMethod().equals(anhfj.oXjC) && (dialog = this.sipStack.getDialog(((SIPRequest) interfaceC13461b).getDialogId(false))) != null && dialog.getState() != null && logger.isLoggingEnabled()) {
            logger.logWarning("Dialog exists -- you may want to use Dialog.sendAck() " + dialog.getState());
        }
        InterfaceC12943b nextHop = this.sipStack.getRouter(sIPRequest).getNextHop(interfaceC13461b);
        if (nextHop == null) {
            throw new C10807n("could not determine next hop!");
        }
        if (!sIPRequest.isNullRequest() && sIPRequest.getTopmostVia() == null) {
            throw new C10807n(anhfj.iyjJJYqkU);
        }
        try {
            try {
                try {
                    if (!sIPRequest.isNullRequest() && ((branch = (topmostVia = sIPRequest.getTopmostVia()).getBranch()) == null || branch.length() == 0)) {
                        topmostVia.setBranch(sIPRequest.getTransactionId());
                    }
                    MessageChannel messageChannelCreateRawMessageChannel = this.listeningPoints.containsKey(nextHop.getTransport().toUpperCase()) ? this.sipStack.createRawMessageChannel(getListeningPoint(nextHop.getTransport()).getIPAddress(), getListeningPoint(nextHop.getTransport()).getPort(), nextHop) : null;
                    if (messageChannelCreateRawMessageChannel != null) {
                        messageChannelCreateRawMessageChannel.sendMessage(sIPRequest, nextHop);
                        if (logger.isLoggingEnabled(32)) {
                            stackLogger = logger;
                            sb2 = new StringBuilder("done sending ");
                            sb2.append(interfaceC13461b.getMethod());
                            sb2.append(" to hop ");
                            sb2.append(nextHop);
                            stackLogger.logDebug(sb2.toString());
                            return;
                        }
                        return;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Could not create a message channel for " + nextHop.toString() + " listeningPoints = " + this.listeningPoints);
                    }
                    throw new C10807n("Could not create a message channel for " + nextHop.toString());
                } catch (ParseException e10) {
                    InternalErrorHandler.handleException(e10);
                    if (!logger.isLoggingEnabled(32)) {
                        return;
                    }
                    stackLogger = logger;
                    sb2 = new StringBuilder("done sending ");
                }
            } catch (IOException e11) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Could not create a message channel for " + nextHop.toString() + " listeningPoints = " + this.listeningPoints + " because of an IO issue " + e11.getMessage());
                }
                throw new C10807n("IO Exception occured while Sending Request", e11);
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("done sending " + interfaceC13461b.getMethod() + " to hop " + nextHop);
            }
            throw th2;
        }
    }

    public SipProviderImpl(SipStackImpl sipStackImpl) {
        this.dialogErrorsAutomaticallyHandled = true;
        EventScanner eventScanner = sipStackImpl.getEventScanner();
        this.eventScanner = eventScanner;
        this.sipStack = sipStackImpl;
        eventScanner.incrementRefcount();
        this.listeningPoints = new ConcurrentHashMap<>();
        this.automaticDialogSupportEnabled = this.sipStack.isAutomaticDialogSupportEnabled();
        this.dialogErrorsAutomaticallyHandled = this.sipStack.isAutomaticDialogErrorHandlingEnabled();
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public InterfaceC10801h getListeningPoint() {
        if (this.listeningPoints.size() > 0) {
            return this.listeningPoints.values().iterator().next();
        }
        return null;
    }
}
