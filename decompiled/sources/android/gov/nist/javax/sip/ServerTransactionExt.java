package android.gov.nist.javax.sip;

import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10806m;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface ServerTransactionExt extends InterfaceC10806m, TransactionExt {
    /* synthetic */ void enableRetransmissionAlerts();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ Object getApplicationData();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ String getBranchId();

    InterfaceC10806m getCanceledInviteTransaction();

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ InterfaceC10795b getDialog();

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ InterfaceC13461b getRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ int getRetransmitTimer();

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ C10815v getState();

    /* synthetic */ void sendResponse(InterfaceC13462c interfaceC13462c);

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setApplicationData(Object obj);

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setRetransmitTimer(int i10);

    @Override // android.javax.sip.InterfaceC10814u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void terminate();
}
