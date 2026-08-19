package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.RetryAfter;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.gov.nist.javax.sip.stack.ServerRequestInterface;
import android.gov.nist.javax.sip.stack.ServerResponseInterface;
import android.javax.sip.C10797d;
import android.javax.sip.C10802i;
import android.javax.sip.C10807n;
import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10806m;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import p011A9.p012Ra.ahZQMZ;
import p713e.InterfaceC13209Q;
import p713e.InterfaceC13216Y;
import p713e.InterfaceC13250x;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
class DialogFilter implements ServerRequestInterface, ServerResponseInterface {
    private static StackLogger logger = CommonLogger.getLogger(DialogFilter.class);
    protected ListeningPointImpl listeningPoint;
    private SIPTransactionStack sipStack;
    protected SIPTransaction transactionChannel;

    public DialogFilter(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
    }

    private void sendCallOrTransactionDoesNotExistResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) throws Throwable {
        if (sIPServerTransaction.getState() != C10815v.f32051t0) {
            SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(481);
            InterfaceC13216Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponseCreateResponse.setHeader(defaultServerHeader);
            }
            try {
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                }
                sIPServerTransaction.sendResponse(sIPResponseCreateResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendLoopDetectedResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) throws Throwable {
        SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(482);
        if (sIPServerTransaction.getState() != C10815v.f32051t0) {
            InterfaceC13216Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponseCreateResponse.setHeader(defaultServerHeader);
            }
            try {
                this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                sIPServerTransaction.sendResponse(sIPResponseCreateResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendRequestPendingResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) throws Throwable {
        if (sIPServerTransaction.getState() != C10815v.f32051t0) {
            InterfaceC13462c interfaceC13462cCreateResponse = sIPRequest.createResponse(491);
            InterfaceC13250x defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                interfaceC13462cCreateResponse.setHeader(defaultServerHeader);
            }
            try {
                RetryAfter retryAfter = new RetryAfter();
                retryAfter.setRetryAfter(1);
                interfaceC13462cCreateResponse.setHeader(retryAfter);
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                }
                sIPServerTransaction.sendResponse(interfaceC13462cCreateResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendServerInternalErrorResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) throws Throwable {
        if (sIPServerTransaction.getState() != C10815v.f32051t0) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Sending 500 response for out of sequence message");
            }
            InterfaceC13462c interfaceC13462cCreateResponse = sIPRequest.createResponse(500);
            interfaceC13462cCreateResponse.setReasonPhrase("Request out of order");
            if (MessageFactoryImpl.getDefaultServerHeader() != null) {
                interfaceC13462cCreateResponse.setHeader(MessageFactoryImpl.getDefaultServerHeader());
            }
            try {
                RetryAfter retryAfter = new RetryAfter();
                retryAfter.setRetryAfter(10);
                interfaceC13462cCreateResponse.setHeader(retryAfter);
                this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                sIPServerTransaction.sendResponse(interfaceC13462cCreateResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendTryingResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) throws Throwable {
        SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(100);
        if (sIPServerTransaction.getState() != C10815v.f32051t0) {
            InterfaceC13216Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponseCreateResponse.setHeader(defaultServerHeader);
            }
            try {
                sIPServerTransaction.sendResponse(sIPResponseCreateResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    public String getProcessingInfo() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.stack.ServerResponseInterface
    public void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("PROCESSING INCOMING RESPONSE" + ((Object) sIPResponse.encodeMessage(new StringBuilder())));
        }
        if (this.listeningPoint == null) {
            if (logger.isLoggingEnabled()) {
                logger.logError("Dropping message: No listening point registered!");
                return;
            }
            return;
        }
        if (this.sipStack.checkBranchId() && !Utils.getInstance().responseBelongsToUs(sIPResponse)) {
            if (logger.isLoggingEnabled()) {
                logger.logError("Dropping response - topmost VIA header does not originate from this stack");
                return;
            }
            return;
        }
        SipProviderImpl provider = this.listeningPoint.getProvider();
        if (provider == null) {
            if (logger.isLoggingEnabled()) {
                logger.logError("Dropping message:  no provider");
                return;
            }
            return;
        }
        if (provider.getSipListener() == null) {
            if (logger.isLoggingEnabled()) {
                logger.logError("No listener -- dropping response!");
                return;
            }
            return;
        }
        SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) this.transactionChannel;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Transaction = " + sIPClientTransaction);
        }
        if (sIPClientTransaction != null) {
            ResponseEventExt responseEventExt = new ResponseEventExt(provider, sIPClientTransaction, sIPDialog, sIPResponse);
            if (this.sipStack.getMaxForkTime() != 0 && SIPTransactionStack.isDialogCreated(sIPResponse.getCSeqHeader().getMethod())) {
                SIPClientTransaction forkedTransaction = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
                if (sIPDialog != null && forkedTransaction != null) {
                    sIPDialog.checkRetransmissionForForking(sIPResponse);
                    if (forkedTransaction.getDefaultDialog() != null && !sIPDialog.equals(forkedTransaction.getDefaultDialog())) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("forkedId= " + sIPResponse.getForkId() + " forked dialog " + sIPDialog + " original tx " + forkedTransaction + " original dialog " + forkedTransaction.getDefaultDialog());
                        }
                        responseEventExt.setOriginalTransaction(forkedTransaction);
                        responseEventExt.setForkedResponse(true);
                    }
                }
            }
            if (sIPDialog != null && sIPResponse.getStatusCode() != 100) {
                sIPDialog.setLastResponse(sIPClientTransaction, sIPResponse);
                sIPClientTransaction.setDialog(sIPDialog, sIPDialog.getDialogId());
            }
            responseEventExt.setRetransmission(sIPResponse.isRetransmission());
            responseEventExt.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
            responseEventExt.setRemotePort(sIPResponse.getRemotePort());
            provider.handleEvent(responseEventExt, sIPClientTransaction);
            return;
        }
        if (sIPDialog != null) {
            if (sIPResponse.getStatusCode() / 100 != 2) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Response is not a final response and dialog is found for response -- dropping response!");
                    return;
                }
                return;
            }
            if (sIPDialog.getState() == C10797d.f32035q0) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dialog is terminated -- dropping response!");
                    return;
                }
                return;
            } else if (sIPDialog.isAckSeen() && sIPDialog.isAckSent() && sIPDialog.isLastAckPresent() && sIPDialog.getLastAckSentCSeq().getSeqNumber() == sIPResponse.getCSeq().getSeqNumber() && sIPResponse.getCSeq().getMethod().equals(sIPDialog.getMethod())) {
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Retransmission of OK detected: Resending last ACK");
                    }
                    sIPDialog.resendAck();
                    return;
                } catch (C10807n e10) {
                    logger.logError("could not resend ack", e10);
                }
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("could not find tx, handling statelessly Dialog =  " + sIPDialog);
        }
        ResponseEventExt responseEventExt2 = new ResponseEventExt(provider, sIPClientTransaction, sIPDialog, sIPResponse);
        if (this.sipStack.getMaxForkTime() != 0 && SIPTransactionStack.isDialogCreated(sIPResponse.getCSeqHeader().getMethod())) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Trying to find forked Transaction for forked id " + sIPResponse.getForkId());
            }
            SIPClientTransaction forkedTransaction2 = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
            if (sIPDialog != null && forkedTransaction2 != null) {
                sIPDialog.checkRetransmissionForForking(sIPResponse);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("original dialog " + forkedTransaction2.getDefaultDialog() + " forked dialog " + sIPDialog);
                }
                if (forkedTransaction2.getDefaultDialog() != null && !sIPDialog.equals(forkedTransaction2.getDefaultDialog())) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("forkedId= " + sIPResponse.getForkId() + " forked dialog " + sIPDialog + " original tx " + forkedTransaction2 + " original dialog " + forkedTransaction2.getDefaultDialog());
                    }
                    responseEventExt2.setOriginalTransaction(forkedTransaction2);
                    responseEventExt2.setForkedResponse(true);
                    if (sIPClientTransaction == null && sIPDialog.getState() == C10797d.f32033o0 && sIPResponse.getStatusCode() >= 200 && sIPResponse.getStatusCode() < 300) {
                        sIPDialog.setLastResponse(sIPClientTransaction, sIPResponse);
                    }
                }
            }
        }
        responseEventExt2.setRetransmission(sIPResponse.isRetransmission());
        responseEventExt2.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
        responseEventExt2.setRemotePort(sIPResponse.getRemotePort());
        provider.handleEvent(responseEventExt2, sIPClientTransaction);
    }

    /* JADX WARN: Code duplicated, block: B:411:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:413:0x07fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:424:0x081f  */
    /* JADX WARN: Code duplicated, block: B:426:0x0829  */
    /* JADX WARN: Code duplicated, block: B:429:0x085a  */
    /* JADX WARN: Code duplicated, block: B:441:0x0880 A[Catch: IOException -> 0x0891, TryCatch #3 {IOException -> 0x0891, blocks: (B:439:0x087a, B:441:0x0880, B:444:0x088a), top: B:535:0x087a }] */
    /* JADX WARN: Code duplicated, block: B:443:0x0889 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:444:0x088a A[Catch: IOException -> 0x0891, TRY_LEAVE, TryCatch #3 {IOException -> 0x0891, blocks: (B:439:0x087a, B:441:0x0880, B:444:0x088a), top: B:535:0x087a }] */
    /* JADX WARN: Code duplicated, block: B:450:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:452:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a21 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:520:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:523:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:535:0x087a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:411:0x07e0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:426:0x0829, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:450:0x08a2, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.gov.nist.javax.sip.stack.ServerRequestInterface
    public void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) throws Throwable {
        Object obj;
        String str;
        Object obj2;
        String str2;
        RequestEventExt requestEventExt;
        Contact myContactHeader;
        if (logger.isLoggingEnabled(32) && this.listeningPoint != null) {
            logger.logDebug("PROCESSING INCOMING REQUEST " + sIPRequest + " transactionChannel = " + this.transactionChannel + " listening point = " + this.listeningPoint.getIPAddress() + ":" + this.listeningPoint.getPort());
        }
        if (this.listeningPoint == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping message: No listening point registered!");
                return;
            }
            return;
        }
        SIPTransactionStack sIPStack = this.transactionChannel.getSIPStack();
        SipProviderImpl provider = this.listeningPoint.getProvider();
        if (provider == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("No provider - dropping !!");
                return;
            }
            return;
        }
        if (sIPStack == null) {
            InternalErrorHandler.handleException("Egads! no sip stack!");
        }
        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.transactionChannel;
        if (sIPServerTransaction != null && logger.isLoggingEnabled(32)) {
            logger.logDebug("transaction state = " + sIPServerTransaction.getState());
        }
        String dialogId = sIPRequest.getDialogId(true);
        SIPDialog dialog = sIPStack.getDialog(dialogId);
        int port = SIPConstants.DEFAULT_TLS_PORT;
        if (dialog != null && provider != dialog.getSipProvider() && (myContactHeader = dialog.getMyContactHeader()) != null) {
            SipUri sipUri = (SipUri) myContactHeader.getAddress().getURI();
            String host = sipUri.getHost();
            int port2 = sipUri.getPort();
            String transportParam = sipUri.getTransportParam();
            String str3 = YladLSetV.WNKYYSTea;
            if (transportParam == null) {
                transportParam = str3;
            }
            if (port2 == -1) {
                port2 = (transportParam.equals(str3) || transportParam.equals(ParameterNames.TCP)) ? SIPConstants.DEFAULT_PORT : 5061;
            }
            if (host != null && (!host.equals(this.listeningPoint.getIPAddress()) || port2 != this.listeningPoint.getPort())) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    StringBuilder sbM11057o = AbstractC10763a.m11057o(port2, "nulling dialog -- listening point mismatch!  ", "  lp port = ");
                    sbM11057o.append(this.listeningPoint.getPort());
                    stackLogger.logDebug(sbM11057o.toString());
                }
                dialog = null;
            }
        }
        if (provider.isDialogErrorsAutomaticallyHandled() && sIPRequest.getToTag() == null && sIPStack.findMergedTransaction(sIPRequest)) {
            sendLoopDetectedResponse(sIPRequest, sIPServerTransaction);
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("dialogId = ", dialogId, logger);
            logger.logDebug("dialog = " + dialog);
        }
        if (sIPRequest.getHeader(SIPHeaderNames.ROUTE) != null && sIPServerTransaction.getDialog() != null) {
            RouteList routeHeaders = sIPRequest.getRouteHeaders();
            HostPort hostPort = ((SipUri) ((Route) routeHeaders.getFirst()).getAddress().getURI()).getHostPort();
            if (hostPort.hasPort()) {
                port = hostPort.getPort();
            } else if (!this.listeningPoint.getTransport().equalsIgnoreCase("TLS")) {
                port = SIPConstants.DEFAULT_PORT;
            }
            String strEncode = hostPort.getHost().encode();
            if ((strEncode.equals(this.listeningPoint.getIPAddress()) || strEncode.equalsIgnoreCase(this.listeningPoint.getSentBy())) && port == this.listeningPoint.getPort()) {
                if (routeHeaders.size() == 1) {
                    sIPRequest.removeHeader(SIPHeaderNames.ROUTE);
                } else {
                    routeHeaders.removeFirst();
                }
            }
        }
        String method = sIPRequest.getMethod();
        boolean zEquals = method.equals("REFER");
        String str4 = TokenNames.ACK;
        if (!zEquals || dialog == null || !provider.isDialogErrorsAutomaticallyHandled()) {
            obj = "CANCEL";
            str = Separators.f31991SP;
            if (!method.equals("UPDATE")) {
                if (!method.equals(TokenNames.ACK)) {
                    str4 = TokenNames.ACK;
                    if (method.equals("PRACK")) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Processing PRACK for dialog " + dialog);
                        }
                        if (dialog == null && provider.isAutomaticDialogSupportEnabled()) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Dialog does not exist " + sIPRequest.getFirstLine() + " isServerTransaction = true");
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Sending 481 for PRACK - automatic dialog support is enabled -- cant find dialog!");
                            }
                            try {
                                provider.sendResponse(sIPRequest.createResponse(481));
                            } catch (C10807n e10) {
                                logger.logError("error sending response", e10);
                            }
                            if (sIPServerTransaction != null) {
                                sIPStack.removeTransaction(sIPServerTransaction);
                                sIPServerTransaction.releaseSem();
                                return;
                            }
                            return;
                        }
                        if (dialog != null) {
                            if (!dialog.handlePrack(sIPRequest)) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Dropping out of sequence PRACK ");
                                }
                                if (sIPServerTransaction != null) {
                                    sIPStack.removeTransaction(sIPServerTransaction);
                                    sIPServerTransaction.releaseSem();
                                    return;
                                }
                                return;
                            }
                            try {
                                sIPStack.addTransaction(sIPServerTransaction);
                                dialog.addTransaction(sIPServerTransaction);
                                dialog.addRoute(sIPRequest);
                                sIPServerTransaction.setDialog(dialog, dialogId);
                            } catch (Exception e11) {
                                InternalErrorHandler.handleException(e11);
                            }
                        } else if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Processing PRACK without a DIALOG -- this must be a proxy element");
                        }
                    } else if (!method.equals(TokenNames.BYE)) {
                        obj2 = obj;
                        str2 = str;
                        if (method.equals(obj2)) {
                            SIPServerTransaction sIPServerTransaction2 = (SIPServerTransaction) sIPStack.findCancelTransaction(sIPRequest, true);
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Got a CANCEL, InviteServerTx = " + sIPServerTransaction2 + " cancel Server Tx ID = " + sIPServerTransaction + " isMapped = " + sIPServerTransaction.isTransactionMapped());
                            }
                            if (sIPRequest.getMethod().equals(obj2)) {
                                if (sIPServerTransaction2 != null && sIPServerTransaction2.getInternalState() == 5) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Too late to cancel Transaction");
                                    }
                                    try {
                                        sIPServerTransaction.sendResponse(sIPRequest.createResponse(RCHTTPStatusCodes.SUCCESS));
                                        return;
                                    } catch (Exception e12) {
                                        if (e12.getCause() == null || !(e12.getCause() instanceof IOException)) {
                                            return;
                                        }
                                        sIPServerTransaction2.raiseIOExceptionEvent();
                                        return;
                                    }
                                }
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Cancel transaction = " + sIPServerTransaction2);
                                }
                            }
                            if (sIPServerTransaction != null && sIPServerTransaction2 != null && sIPServerTransaction2.getDialog() != null) {
                                sIPServerTransaction.setDialog((SIPDialog) sIPServerTransaction2.getDialog(), dialogId);
                                dialog = (SIPDialog) sIPServerTransaction2.getDialog();
                            } else if (sIPServerTransaction2 == null && provider.isAutomaticDialogSupportEnabled() && sIPServerTransaction != null) {
                                InterfaceC13462c interfaceC13462cCreateResponse = sIPRequest.createResponse(481);
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("dropping request -- automatic dialog support enabled and INVITE ST does not exist!");
                                }
                                try {
                                    provider.sendResponse(interfaceC13462cCreateResponse);
                                } catch (C10807n e13) {
                                    InternalErrorHandler.handleException(e13);
                                }
                                sIPStack.removeTransaction(sIPServerTransaction);
                                sIPServerTransaction.releaseSem();
                                return;
                            }
                            if (sIPServerTransaction2 != null) {
                                sIPServerTransaction2.setPassToListener();
                                if (sIPServerTransaction != null) {
                                    try {
                                        sIPStack.addTransaction(sIPServerTransaction);
                                        sIPServerTransaction.setPassToListener();
                                        sIPServerTransaction.setInviteTransaction(sIPServerTransaction2);
                                        sIPServerTransaction2.acquireSem();
                                    } catch (Exception e14) {
                                        InternalErrorHandler.handleException(e14);
                                    }
                                }
                            }
                        } else if (method.equals(TokenNames.INVITE)) {
                            SIPServerTransaction inviteTransaction = dialog == null ? null : dialog.getInviteTransaction();
                            if (dialog != null && sIPServerTransaction != null && inviteTransaction != null && sIPRequest.getCSeq().getSeqNumber() > inviteTransaction.getCSeq() && provider.isDialogErrorsAutomaticallyHandled() && dialog.isSequenceNumberValidation() && inviteTransaction.isInviteTransaction() && inviteTransaction.getInternalState() != 3 && inviteTransaction.getInternalState() != 5 && inviteTransaction.getInternalState() != 4) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Sending 500 response for out of sequence message");
                                }
                                sendServerInternalErrorResponse(sIPRequest, sIPServerTransaction);
                                return;
                            }
                            SIPTransaction lastTransaction = dialog == null ? null : dialog.getLastTransaction();
                            if (dialog != null && provider.isDialogErrorsAutomaticallyHandled() && lastTransaction != null && lastTransaction.isInviteTransaction() && (lastTransaction instanceof InterfaceC10794a) && lastTransaction.getState() != C10815v.f32049r0 && lastTransaction.getState() != C10815v.f32051t0) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("DialogFilter::processRequest:lastTransaction.getState(): " + lastTransaction.getState() + " Sending 491 response for clientTx.");
                                }
                                sendRequestPendingResponse(sIPRequest, sIPServerTransaction);
                                return;
                            }
                            if (dialog != null && lastTransaction != null && provider.isDialogErrorsAutomaticallyHandled() && lastTransaction.isInviteTransaction() && (lastTransaction instanceof InterfaceC10806m) && sIPRequest.getCSeq().getSeqNumber() > lastTransaction.getCSeq() && (lastTransaction.getInternalState() == 2 || lastTransaction.getInternalState() == 1)) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Sending 491 response. Last transaction is in PROCEEDING state.");
                                    logger.logDebug("last Transaction state = " + lastTransaction + " state " + lastTransaction.getState());
                                }
                                sendRequestPendingResponse(sIPRequest, sIPServerTransaction);
                                return;
                            }
                        }
                    } else {
                        if (dialog != null && !dialog.isRequestConsumable(sIPRequest)) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Dropping out of sequence BYE " + dialog.getRemoteSeqNumber() + str + sIPRequest.getCSeq().getSeqNumber());
                            }
                            if (dialog.getRemoteSeqNumber() > sIPRequest.getCSeq().getSeqNumber()) {
                                sendServerInternalErrorResponse(sIPRequest, sIPServerTransaction);
                            } else if (sIPServerTransaction.getInternalState() == 2) {
                                sendTryingResponse(sIPRequest, sIPServerTransaction);
                            }
                            sIPStack.removeTransaction(sIPServerTransaction);
                            return;
                        }
                        str2 = str;
                        if (dialog == null && provider.isAutomaticDialogSupportEnabled()) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("dropping request -- automatic dialog support enabled and dialog does not exist!");
                            }
                            sendCallOrTransactionDoesNotExistResponse(sIPRequest, sIPServerTransaction);
                            if (sIPServerTransaction != null) {
                                sIPStack.removeTransaction(sIPServerTransaction);
                                sIPServerTransaction.releaseSem();
                                return;
                            }
                            return;
                        }
                        if (sIPServerTransaction != null && dialog != null) {
                            try {
                                if (provider == dialog.getSipProvider()) {
                                    sIPStack.addTransaction(sIPServerTransaction);
                                    dialog.addTransaction(sIPServerTransaction);
                                    sIPServerTransaction.setDialog(dialog, dialogId);
                                }
                            } catch (IOException e15) {
                                InternalErrorHandler.handleException(e15);
                            }
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("BYE Tx = " + sIPServerTransaction + " isMapped =" + sIPServerTransaction.isTransactionMapped());
                        }
                        obj2 = obj;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("CHECK FOR OUT OF SEQ MESSAGE " + dialog + " transaction " + sIPServerTransaction);
                    }
                    if (dialog != null && sIPServerTransaction != null && !method.equals(TokenNames.BYE) && !method.equals(obj2) && !method.equals(str4) && !method.equals("PRACK")) {
                        if (!dialog.isRequestConsumable(sIPRequest)) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Dropping out of sequence message " + dialog.getRemoteSeqNumber() + str2 + sIPRequest.getCSeq());
                            }
                            if (dialog.getRemoteSeqNumber() <= sIPRequest.getCSeq().getSeqNumber() && provider.isDialogErrorsAutomaticallyHandled()) {
                                sendServerInternalErrorResponse(sIPRequest, sIPServerTransaction);
                                return;
                            }
                            try {
                                sIPServerTransaction.terminate();
                                return;
                            } catch (C10802i e16) {
                                if (logger.isLoggingEnabled()) {
                                    logger.logError("Unexpected exception", e16);
                                    return;
                                }
                                return;
                            }
                        }
                        try {
                            if (provider == dialog.getSipProvider()) {
                                sIPStack.addTransaction(sIPServerTransaction);
                                if (!dialog.addTransaction(sIPServerTransaction)) {
                                    return;
                                }
                                dialog.addRoute(sIPRequest);
                                sIPServerTransaction.setDialog(dialog, dialogId);
                            }
                        } catch (IOException unused) {
                            sIPServerTransaction.raiseIOExceptionEvent();
                            sIPStack.removeTransaction(sIPServerTransaction);
                            return;
                        }
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug(sIPRequest.getMethod() + " transaction.isMapped = " + sIPServerTransaction.isTransactionMapped());
                    }
                    if (dialog != null && method.equals(TokenNames.NOTIFY)) {
                        SIPClientTransaction sIPClientTransactionFindSubscribeTransaction = sIPStack.findSubscribeTransaction(sIPRequest, this.listeningPoint);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("PROCESSING NOTIFY  DIALOG == null " + sIPClientTransactionFindSubscribeTransaction);
                        }
                        if (provider.isAutomaticDialogSupportEnabled() && sIPClientTransactionFindSubscribeTransaction == null && !sIPStack.isDeliverUnsolicitedNotify()) {
                            try {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Could not find Subscription for Notify Tx.");
                                }
                                InterfaceC13462c interfaceC13462cCreateResponse2 = sIPRequest.createResponse(481);
                                interfaceC13462cCreateResponse2.setReasonPhrase("Subscription does not exist");
                                provider.sendResponse(interfaceC13462cCreateResponse2);
                                return;
                            } catch (Exception e17) {
                                logger.logError("Exception while sending error response statelessly", e17);
                                return;
                            }
                        }
                        if (sIPClientTransactionFindSubscribeTransaction != null) {
                            sIPServerTransaction.setPendingSubscribe(sIPClientTransactionFindSubscribeTransaction);
                            SIPDialog defaultDialog = sIPClientTransactionFindSubscribeTransaction.getDefaultDialog();
                            if (defaultDialog == null || defaultDialog.getDialogId() == null || !defaultDialog.getDialogId().equals(dialogId)) {
                                if (defaultDialog == null || defaultDialog.getDialogId() != null) {
                                    defaultDialog = sIPClientTransactionFindSubscribeTransaction.getDialog(dialogId);
                                } else {
                                    defaultDialog.setDialogId(dialogId);
                                    if (logger.isLoggingEnabled(32)) {
                                        defaultDialog = defaultDialog;
                                        logger.logDebug("Dialog id set on default dialog.");
                                        defaultDialog = defaultDialog;
                                    }
                                }
                                defaultDialog = defaultDialog;
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("PROCESSING NOTIFY Subscribe DIALOG " + defaultDialog);
                                }
                                if (defaultDialog == null && ((provider.isAutomaticDialogSupportEnabled() || sIPClientTransactionFindSubscribeTransaction.getDefaultDialog() != null) && sIPStack.isEventForked(((Event) sIPRequest.getHeader(SIPHeaderNames.EVENT)).getEventType()))) {
                                    defaultDialog = sIPStack.createDialog(sIPClientTransactionFindSubscribeTransaction, sIPServerTransaction);
                                }
                                if (defaultDialog != null) {
                                    sIPServerTransaction.setDialog(defaultDialog, dialogId);
                                    C10797d state = defaultDialog.getState();
                                    C10797d c10797d = C10797d.f32034p0;
                                    if (state != c10797d) {
                                        defaultDialog.setPendingRouteUpdateOn202Response(sIPRequest);
                                    }
                                    defaultDialog.setState(c10797d.f32036Y);
                                    sIPStack.putDialog(defaultDialog);
                                    sIPClientTransactionFindSubscribeTransaction.setDialog(defaultDialog, dialogId);
                                    if (!sIPServerTransaction.isTransactionMapped()) {
                                        this.sipStack.mapTransaction(sIPServerTransaction);
                                        sIPServerTransaction.setPassToListener();
                                        try {
                                            this.sipStack.addTransaction(sIPServerTransaction);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                            } else {
                                sIPServerTransaction.setDialog(defaultDialog, dialogId);
                                if (!sIPServerTransaction.isTransactionMapped()) {
                                    this.sipStack.mapTransaction(sIPServerTransaction);
                                    sIPServerTransaction.setPassToListener();
                                    try {
                                        this.sipStack.addTransaction(sIPServerTransaction);
                                    } catch (Exception unused3) {
                                    }
                                }
                                sIPStack.putDialog(defaultDialog);
                                defaultDialog.addTransaction(sIPClientTransactionFindSubscribeTransaction);
                                sIPClientTransactionFindSubscribeTransaction.setDialog(defaultDialog, dialogId);
                            }
                            requestEventExt = sIPServerTransaction.isTransactionMapped() ? new RequestEventExt(provider, sIPServerTransaction, defaultDialog, sIPRequest) : new RequestEventExt(provider, null, defaultDialog, sIPRequest);
                        } else {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("could not find subscribe tx");
                            }
                            requestEventExt = new RequestEventExt(provider, null, null, sIPRequest);
                        }
                    } else if (sIPServerTransaction == null && sIPServerTransaction.isTransactionMapped()) {
                        requestEventExt = new RequestEventExt(provider, sIPServerTransaction, dialog, sIPRequest);
                    } else {
                        requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                    }
                    requestEventExt.setRemoteIpAddress(sIPRequest.getRemoteAddress().getHostAddress());
                    requestEventExt.setRemotePort(sIPRequest.getRemotePort());
                    provider.handleEvent(requestEventExt, sIPServerTransaction);
                }
                if (sIPServerTransaction == null || !sIPServerTransaction.isInviteTransaction()) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Processing ACK for dialog " + dialog);
                    }
                    if (dialog == null) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Dialog does not exist " + sIPRequest.getFirstLine() + " isServerTransaction = true");
                        }
                        SIPServerTransaction retransmissionAlertTransaction = sIPStack.getRetransmissionAlertTransaction(dialogId);
                        if (retransmissionAlertTransaction != null && retransmissionAlertTransaction.isRetransmissionAlertEnabled()) {
                            retransmissionAlertTransaction.disableRetransmissionAlerts();
                        }
                        SIPServerTransaction sIPServerTransactionFindTransactionPendingAck = sIPStack.findTransactionPendingAck(sIPRequest);
                        if (sIPServerTransactionFindTransactionPendingAck != null) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Found Tx pending ACK");
                            }
                            try {
                                sIPServerTransactionFindTransactionPendingAck.setAckSeen();
                                sIPStack.removeTransaction(sIPServerTransactionFindTransactionPendingAck);
                                sIPStack.removeTransactionPendingAck(sIPServerTransactionFindTransactionPendingAck);
                                return;
                            } catch (Exception e18) {
                                if (logger.isLoggingEnabled()) {
                                    logger.logError("Problem terminating transaction", e18);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (dialog.handleAck(sIPServerTransaction)) {
                        dialog.addTransaction(sIPServerTransaction);
                        sIPServerTransaction.passToListener();
                        dialog.addRoute(sIPRequest);
                        sIPServerTransaction.setDialog(dialog, dialogId);
                        if (sIPRequest.getMethod().equals(TokenNames.INVITE) && provider.isDialogErrorsAutomaticallyHandled()) {
                            sIPStack.putInMergeTable(sIPServerTransaction, sIPRequest);
                        }
                        if (sIPStack.isDeliverTerminatedEventForAck()) {
                            try {
                                sIPStack.addTransaction(sIPServerTransaction);
                                sIPServerTransaction.scheduleAckRemoval();
                            } catch (IOException unused4) {
                            }
                        } else {
                            sIPServerTransaction.setMapped(true);
                        }
                    } else if (dialog.isSequenceNumberValidation()) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Dropping ACK - cannot find a transaction or dialog");
                        }
                        SIPServerTransaction sIPServerTransactionFindTransactionPendingAck2 = sIPStack.findTransactionPendingAck(sIPRequest);
                        if (sIPServerTransactionFindTransactionPendingAck2 != null) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Found Tx pending ACK");
                            }
                            try {
                                sIPServerTransactionFindTransactionPendingAck2.setAckSeen();
                                sIPStack.removeTransaction(sIPServerTransactionFindTransactionPendingAck2);
                                sIPStack.removeTransactionPendingAck(sIPServerTransactionFindTransactionPendingAck2);
                            } catch (Exception e19) {
                                if (logger.isLoggingEnabled()) {
                                    logger.logError("Problem terminating transaction", e19);
                                }
                            }
                        }
                        if (!sIPStack.isDeliverRetransmittedAckToListener()) {
                            return;
                        }
                        if (sIPServerTransactionFindTransactionPendingAck2 != null && !sIPStack.isNon2XXAckPassedToListener()) {
                            return;
                        }
                    } else {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Dialog exists with loose dialog validation " + sIPRequest.getFirstLine() + " isServerTransaction = true dialog = " + dialog.getDialogId());
                        }
                        SIPServerTransaction retransmissionAlertTransaction2 = sIPStack.getRetransmissionAlertTransaction(dialogId);
                        if (retransmissionAlertTransaction2 != null && retransmissionAlertTransaction2.isRetransmissionAlertEnabled()) {
                            retransmissionAlertTransaction2.disableRetransmissionAlerts();
                        }
                        SIPServerTransaction sIPServerTransactionFindTransactionPendingAck3 = sIPStack.findTransactionPendingAck(sIPRequest);
                        if (sIPServerTransactionFindTransactionPendingAck3 != null) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Found Tx pending ACK");
                            }
                            try {
                                sIPServerTransactionFindTransactionPendingAck3.setAckSeen();
                                sIPStack.removeTransaction(sIPServerTransactionFindTransactionPendingAck3);
                                sIPStack.removeTransactionPendingAck(sIPServerTransactionFindTransactionPendingAck3);
                            } catch (Exception e20) {
                                if (logger.isLoggingEnabled()) {
                                    logger.logError("Problem terminating transaction", e20);
                                }
                            }
                        }
                    }
                } else if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Processing ACK for INVITE Tx ");
                }
                obj2 = obj;
                str2 = str;
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("CHECK FOR OUT OF SEQ MESSAGE " + dialog + " transaction " + sIPServerTransaction);
                }
                if (dialog != null) {
                    if (!dialog.isRequestConsumable(sIPRequest)) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Dropping out of sequence message " + dialog.getRemoteSeqNumber() + str2 + sIPRequest.getCSeq());
                        }
                        if (dialog.getRemoteSeqNumber() <= sIPRequest.getCSeq().getSeqNumber()) {
                        }
                        sIPServerTransaction.terminate();
                        return;
                    }
                    if (provider == dialog.getSipProvider()) {
                        sIPStack.addTransaction(sIPServerTransaction);
                        if (!dialog.addTransaction(sIPServerTransaction)) {
                            return;
                        }
                        dialog.addRoute(sIPRequest);
                        sIPServerTransaction.setDialog(dialog, dialogId);
                    }
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug(sIPRequest.getMethod() + " transaction.isMapped = " + sIPServerTransaction.isTransactionMapped());
                }
                if (dialog != null) {
                    if (sIPServerTransaction == null) {
                        requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                    } else {
                        requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                    }
                } else if (sIPServerTransaction == null) {
                    requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                } else {
                    requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                }
                requestEventExt.setRemoteIpAddress(sIPRequest.getRemoteAddress().getHostAddress());
                requestEventExt.setRemotePort(sIPRequest.getRemotePort());
                provider.handleEvent(requestEventExt, sIPServerTransaction);
            }
            if (provider.isAutomaticDialogSupportEnabled() && dialog == null) {
                sendCallOrTransactionDoesNotExistResponse(sIPRequest, sIPServerTransaction);
                return;
            }
        } else {
            if (((InterfaceC13209Q) sIPRequest.getHeader("Refer-To")) == null) {
                sendBadRequestResponse(sIPRequest, sIPServerTransaction, "Refer-To header is missing");
                return;
            }
            SIPTransaction lastTransaction2 = dialog.getLastTransaction();
            if (lastTransaction2 == null || !provider.isDialogErrorsAutomaticallyHandled()) {
                obj = "CANCEL";
                str = Separators.f31991SP;
            } else {
                String method2 = lastTransaction2.getMethod();
                obj = "CANCEL";
                if (lastTransaction2 instanceof SIPServerTransaction) {
                    int internalState = lastTransaction2.getInternalState();
                    str = Separators.f31991SP;
                    if ((internalState == 2 || lastTransaction2.getInternalState() == 1) && method2.equals(TokenNames.INVITE)) {
                        sendRequestPendingResponse(sIPRequest, sIPServerTransaction);
                        return;
                    }
                } else {
                    str = Separators.f31991SP;
                    if ((lastTransaction2 instanceof SIPClientTransaction) && method2.equals(TokenNames.INVITE) && lastTransaction2.getInternalState() != 5 && lastTransaction2.getInternalState() != 3) {
                        sendRequestPendingResponse(sIPRequest, sIPServerTransaction);
                        return;
                    }
                }
            }
        }
        str4 = TokenNames.ACK;
        obj2 = obj;
        str2 = str;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("CHECK FOR OUT OF SEQ MESSAGE " + dialog + " transaction " + sIPServerTransaction);
        }
        if (dialog != null) {
            if (!dialog.isRequestConsumable(sIPRequest)) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dropping out of sequence message " + dialog.getRemoteSeqNumber() + str2 + sIPRequest.getCSeq());
                }
                if (dialog.getRemoteSeqNumber() <= sIPRequest.getCSeq().getSeqNumber()) {
                }
                sIPServerTransaction.terminate();
                return;
            }
            if (provider == dialog.getSipProvider()) {
                sIPStack.addTransaction(sIPServerTransaction);
                if (!dialog.addTransaction(sIPServerTransaction)) {
                    return;
                }
                dialog.addRoute(sIPRequest);
                sIPServerTransaction.setDialog(dialog, dialogId);
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug(sIPRequest.getMethod() + " transaction.isMapped = " + sIPServerTransaction.isTransactionMapped());
        }
        if (dialog != null) {
            if (sIPServerTransaction == null) {
                requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
            } else {
                requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
            }
        } else if (sIPServerTransaction == null) {
            requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
        } else {
            requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
        }
        requestEventExt.setRemoteIpAddress(sIPRequest.getRemoteAddress().getHostAddress());
        requestEventExt.setRemotePort(sIPRequest.getRemotePort());
        provider.handleEvent(requestEventExt, sIPServerTransaction);
    }

    private void sendBadRequestResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction, String str) throws Throwable {
        if (sIPServerTransaction.getState() != C10815v.f32051t0) {
            SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(RCHTTPStatusCodes.BAD_REQUEST);
            if (str != null) {
                sIPResponseCreateResponse.setReasonPhrase(str);
            }
            InterfaceC13216Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponseCreateResponse.setHeader(defaultServerHeader);
            }
            try {
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                }
                sIPServerTransaction.sendResponse(sIPResponseCreateResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError(ahZQMZ.BNWDQZMjngD, e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bd  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x018f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01bd, please report this as an issue */
    @Override // android.gov.nist.javax.sip.stack.ServerResponseInterface
    public void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel) throws Throwable {
        String dialogId = sIPResponse.getDialogId(false);
        SIPDialog dialog = this.sipStack.getDialog(dialogId);
        String method = sIPResponse.getCSeq().getMethod();
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("PROCESSING INCOMING RESPONSE: " + ((Object) sIPResponse.encodeMessage(new StringBuilder())));
        }
        if (this.sipStack.checkBranchId() && !Utils.getInstance().responseBelongsToUs(sIPResponse)) {
            if (logger.isLoggingEnabled()) {
                logger.logError("Detected stray response -- dropping");
                return;
            }
            return;
        }
        ListeningPointImpl listeningPointImpl = this.listeningPoint;
        if (listeningPointImpl == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping message: No listening point registered!");
                return;
            }
            return;
        }
        SipProviderImpl provider = listeningPointImpl.getProvider();
        if (provider == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping message:  no provider");
                return;
            }
            return;
        }
        if (provider.getSipListener() == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping message:  no sipListener registered!");
                return;
            }
            return;
        }
        SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) this.transactionChannel;
        if (dialog == null && sIPClientTransaction != null && (dialog = sIPClientTransaction.getDialog(dialogId)) != null && dialog.getState() == C10797d.f32035q0) {
            dialog = null;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Transaction = " + sIPClientTransaction + " sipDialog = " + dialog);
        }
        SIPTransaction sIPTransaction = this.transactionChannel;
        if (sIPTransaction != null) {
            String fromTag = ((SIPRequest) sIPTransaction.getRequest()).getFromTag();
            if ((fromTag == null) ^ (sIPResponse.getFrom().getTag() == null)) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("From tag mismatch -- dropping response");
                    return;
                }
                return;
            } else if (fromTag != null && !fromTag.equalsIgnoreCase(sIPResponse.getFrom().getTag())) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("From tag mismatch -- dropping response");
                    return;
                }
                return;
            }
        }
        if (!SIPTransactionStack.isDialogCreated(method) || sIPResponse.getStatusCode() == 100 || sIPResponse.getFrom().getTag() == null || sIPResponse.getTo().getTag() == null || dialog != null) {
            if (dialog != null && sIPClientTransaction == null) {
                C10797d state = dialog.getState();
                C10797d c10797d = C10797d.f32035q0;
                if (state != c10797d) {
                    if (sIPResponse.getStatusCode() / 100 != 2) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("status code != 200 ; statusCode = " + sIPResponse.getStatusCode());
                        }
                    } else {
                        if (dialog.getState() == c10797d) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Dialog is terminated -- dropping response!");
                            }
                            if (sIPResponse.getStatusCode() / 100 == 2 && sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE)) {
                                try {
                                    dialog.sendAck(dialog.createAck(sIPResponse.getCSeq().getSeqNumber()));
                                    return;
                                } catch (Exception e10) {
                                    logger.logError("Error creating ack", e10);
                                    return;
                                }
                            }
                            return;
                        }
                        if (dialog.isAckSent() && dialog.isLastAckPresent() && dialog.getLastAckSentCSeq().getSeqNumber() == sIPResponse.getCSeq().getSeqNumber() && sIPResponse.getDialogId(false).equals(dialog.getLastAckSentDialogId()) && sIPResponse.getCSeq().getMethod().equals(dialog.getMethod())) {
                            try {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("resending ACK");
                                }
                                dialog.resendAck();
                                return;
                            } catch (C10807n unused) {
                            }
                        }
                    }
                }
            }
        } else if (!provider.isAutomaticDialogSupportEnabled()) {
            SIPClientTransaction forkedTransaction = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
            if (forkedTransaction != null && forkedTransaction.getDefaultDialog() != null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Need to create dialog for response = " + sIPResponse);
                }
                if (this.transactionChannel != null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Creating dialog for forked response " + sIPResponse);
                    }
                    dialog = this.sipStack.createDialog(provider, sIPResponse);
                } else if (dialog == null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Creating dialog for forked response " + sIPResponse);
                    }
                    dialog = this.sipStack.createDialog((SIPClientTransaction) this.transactionChannel, sIPResponse);
                    this.transactionChannel.setDialog(dialog, sIPResponse.getDialogId(false));
                }
            }
        } else if (this.transactionChannel != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Creating dialog for forked response " + sIPResponse);
            }
            dialog = this.sipStack.createDialog(provider, sIPResponse);
        } else if (dialog == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Creating dialog for forked response " + sIPResponse);
            }
            dialog = this.sipStack.createDialog((SIPClientTransaction) this.transactionChannel, sIPResponse);
            this.transactionChannel.setDialog(dialog, sIPResponse.getDialogId(false));
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sending response " + sIPResponse.toString() + " to TU for processing ");
        }
        ResponseEventExt responseEventExt = new ResponseEventExt(provider, sIPClientTransaction, dialog, sIPResponse);
        responseEventExt.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
        responseEventExt.setRemotePort(sIPResponse.getRemotePort());
        if (this.sipStack.getMaxForkTime() != 0 && SIPTransactionStack.isDialogCreated(sIPResponse.getCSeqHeader().getMethod())) {
            SIPClientTransaction forkedTransaction2 = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
            if (dialog != null && forkedTransaction2 != null) {
                dialog.checkRetransmissionForForking(sIPResponse);
                if (forkedTransaction2.getDefaultDialog() != null && !dialog.equals(forkedTransaction2.getDefaultDialog())) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("forkedId= " + sIPResponse.getForkId() + " forked dialog " + dialog + " original tx " + forkedTransaction2 + " original dialog " + forkedTransaction2.getDefaultDialog());
                    }
                    responseEventExt.setOriginalTransaction(forkedTransaction2);
                    responseEventExt.setForkedResponse(true);
                }
            }
        }
        if (dialog != null && sIPResponse.getStatusCode() != 100 && sIPResponse.getTo().getTag() != null) {
            dialog.setLastResponse(sIPClientTransaction, sIPResponse);
        }
        responseEventExt.setRetransmission(sIPResponse.isRetransmission());
        responseEventExt.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
        provider.handleEvent(responseEventExt, sIPClientTransaction);
    }
}
