package android.gov.nist.javax.sip;

import android.javax.sip.C10797d;
import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10810q;
import android.javax.sip.InterfaceC10814u;
import java.util.Iterator;
import p691d.InterfaceC12942a;
import p713e.InterfaceC13236j;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface DialogExt extends InterfaceC10795b {
    /* synthetic */ InterfaceC13461b createAck(long j10);

    /* synthetic */ InterfaceC13461b createPrack(InterfaceC13462c interfaceC13462c);

    /* synthetic */ InterfaceC13462c createReliableProvisionalResponse(int i10);

    @Override // android.javax.sip.InterfaceC10795b
    /* synthetic */ InterfaceC13461b createRequest(String str);

    /* synthetic */ void delete();

    void disableSequenceNumberValidation();

    /* synthetic */ Object getApplicationData();

    /* synthetic */ InterfaceC13236j getCallId();

    /* synthetic */ String getDialogId();

    /* synthetic */ InterfaceC10814u getFirstTransaction();

    /* synthetic */ InterfaceC12942a getLocalParty();

    /* synthetic */ long getLocalSeqNumber();

    /* synthetic */ int getLocalSequenceNumber();

    /* synthetic */ String getLocalTag();

    InterfaceC10795b getOriginalDialog();

    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    /* synthetic */ InterfaceC12942a getRemoteParty();

    /* synthetic */ long getRemoteSeqNumber();

    /* synthetic */ int getRemoteSequenceNumber();

    /* synthetic */ String getRemoteTag();

    /* synthetic */ InterfaceC12942a getRemoteTarget();

    /* synthetic */ Iterator getRouteSet();

    InterfaceC10810q getSipProvider();

    @Override // android.javax.sip.InterfaceC10795b
    /* synthetic */ C10797d getState();

    /* synthetic */ void incrementLocalSequenceNumber();

    boolean isForked();

    /* synthetic */ boolean isSecure();

    /* synthetic */ boolean isServer();

    /* synthetic */ void sendAck(InterfaceC13461b interfaceC13461b);

    /* synthetic */ void sendReliableProvisionalResponse(InterfaceC13462c interfaceC13462c);

    /* synthetic */ void sendRequest(InterfaceC10794a interfaceC10794a);

    /* synthetic */ void setApplicationData(Object obj);

    void setBackToBackUserAgent();

    void setEarlyDialogTimeoutSeconds(int i10);

    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    /* synthetic */ void terminateOnBye(boolean z6);
}
