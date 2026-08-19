package android.gov.nist.javax.sip;

import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10795b;
import p691d.InterfaceC12943b;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public interface ClientTransactionExt extends InterfaceC10794a, TransactionExt {
    void alertIfStillInCallingStateBy(int i10);

    /* synthetic */ InterfaceC13461b createAck();

    /* synthetic */ InterfaceC13461b createCancel();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ Object getApplicationData();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ String getBranchId();

    InterfaceC10795b getDefaultDialog();

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ InterfaceC10795b getDialog();

    InterfaceC12943b getNextHop();

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ InterfaceC13461b getRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ int getRetransmitTimer();

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ C10815v getState();

    boolean isSecure();

    /* synthetic */ void sendRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setApplicationData(Object obj);

    void setNotifyOnRetransmit(boolean z6);

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setRetransmitTimer(int i10);

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void terminate();
}
