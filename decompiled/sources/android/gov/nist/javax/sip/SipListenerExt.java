package android.gov.nist.javax.sip;

import android.javax.sip.AbstractC10804k;
import android.javax.sip.AbstractC10805l;
import android.javax.sip.C10798e;
import android.javax.sip.C10799f;
import android.javax.sip.C10813t;
import android.javax.sip.C10816w;
import android.javax.sip.InterfaceC10809p;

/* JADX INFO: loaded from: classes.dex */
public interface SipListenerExt extends InterfaceC10809p {
    @Override // android.javax.sip.InterfaceC10809p
    /* synthetic */ void processDialogTerminated(C10798e c10798e);

    void processDialogTimeout(DialogTimeoutEvent dialogTimeoutEvent);

    @Override // android.javax.sip.InterfaceC10809p
    /* synthetic */ void processIOException(C10799f c10799f);

    @Override // android.javax.sip.InterfaceC10809p
    /* synthetic */ void processRequest(AbstractC10804k abstractC10804k);

    @Override // android.javax.sip.InterfaceC10809p
    /* synthetic */ void processResponse(AbstractC10805l abstractC10805l);

    @Override // android.javax.sip.InterfaceC10809p
    /* synthetic */ void processTimeout(C10813t c10813t);

    @Override // android.javax.sip.InterfaceC10809p
    /* synthetic */ void processTransactionTerminated(C10816w c10816w);
}
