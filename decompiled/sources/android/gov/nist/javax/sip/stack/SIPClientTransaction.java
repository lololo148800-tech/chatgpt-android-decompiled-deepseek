package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ClientTransactionExt;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.javax.sip.InterfaceC10795b;
import p691d.InterfaceC12943b;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public interface SIPClientTransaction extends ClientTransactionExt, SIPTransaction, ServerResponseInterface {
    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    void alertIfStillInCallingStateBy(int i10);

    boolean checkFromTag(SIPResponse sIPResponse);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void cleanUp();

    void clearState();

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    InterfaceC13461b createAck();

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    InterfaceC13461b createCancel();

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    SIPDialog getDefaultDialog();

    SIPDialog getDialog(String str);

    @Override // android.gov.nist.javax.sip.ClientTransactionExt, android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    InterfaceC10795b getDialog();

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    InterfaceC12943b getNextHop();

    String getOriginalRequestCallId();

    Contact getOriginalRequestContact();

    Event getOriginalRequestEvent();

    String getOriginalRequestFromTag();

    String getOriginalRequestScheme();

    Via getOutgoingViaHeader();

    MessageChannel getRequestChannel();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    String getViaHost();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    int getViaPort();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    boolean isMessagePartOfTransaction(SIPMessage sIPMessage);

    boolean isNotifyOnRetransmit();

    @Override // android.gov.nist.javax.sip.stack.ServerResponseInterface
    void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel);

    @Override // android.gov.nist.javax.sip.stack.ServerResponseInterface
    void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void sendMessage(SIPMessage sIPMessage);

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    void sendRequest();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setDialog(SIPDialog sIPDialog, String str);

    void setNextHop(InterfaceC12943b interfaceC12943b);

    @Override // android.gov.nist.javax.sip.ClientTransactionExt
    void setNotifyOnRetransmit(boolean z6);

    void setResponseInterface(ServerResponseInterface serverResponseInterface);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setState(int i10);

    void setTerminateDialogOnCleanUp(boolean z6);

    void setViaHost(String str);

    void setViaPort(int i10);

    void stopExpiresTimer();

    @Override // android.gov.nist.javax.sip.ClientTransactionExt, android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    void terminate();
}
