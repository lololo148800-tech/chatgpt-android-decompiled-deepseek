package android.gov.nist.javax.sip;

import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10801h;
import android.javax.sip.InterfaceC10806m;
import android.javax.sip.InterfaceC10809p;
import android.javax.sip.InterfaceC10810q;
import android.javax.sip.InterfaceC10811r;
import android.javax.sip.InterfaceC10814u;
import p713e.InterfaceC13236j;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface SipProviderExt extends InterfaceC10810q {
    /* synthetic */ void addListeningPoint(InterfaceC10801h interfaceC10801h);

    /* synthetic */ void addSipListener(InterfaceC10809p interfaceC10809p);

    /* synthetic */ InterfaceC10801h getListeningPoint();

    /* synthetic */ InterfaceC10801h getListeningPoint(String str);

    /* synthetic */ InterfaceC10801h[] getListeningPoints();

    /* synthetic */ InterfaceC13236j getNewCallId();

    @Override // android.javax.sip.InterfaceC10810q
    /* synthetic */ InterfaceC10794a getNewClientTransaction(InterfaceC13461b interfaceC13461b);

    /* synthetic */ InterfaceC10795b getNewDialog(InterfaceC10814u interfaceC10814u);

    /* synthetic */ InterfaceC10806m getNewServerTransaction(InterfaceC13461b interfaceC13461b);

    /* synthetic */ InterfaceC10811r getSipStack();

    /* synthetic */ void removeListeningPoint(InterfaceC10801h interfaceC10801h);

    /* synthetic */ void removeSipListener(InterfaceC10809p interfaceC10809p);

    /* synthetic */ void sendRequest(InterfaceC13461b interfaceC13461b);

    /* synthetic */ void sendResponse(InterfaceC13462c interfaceC13462c);

    /* synthetic */ void setAutomaticDialogSupportEnabled(boolean z6);

    void setDialogErrorsAutomaticallyHandled();

    /* synthetic */ void setListeningPoint(InterfaceC10801h interfaceC10801h);
}
