package android.gov.nist.javax.sip;

import android.javax.sip.InterfaceC10801h;
import p713e.InterfaceC13231g0;
import p713e.InterfaceC13238l;

/* JADX INFO: loaded from: classes.dex */
public interface ListeningPointExt extends InterfaceC10801h {

    /* JADX INFO: renamed from: WS */
    public static final String f31993WS = "WS";
    public static final String WSS = "WSS";

    InterfaceC13238l createContactHeader();

    InterfaceC13231g0 createViaHeader();

    @Override // android.javax.sip.InterfaceC10801h
    /* synthetic */ String getIPAddress();

    @Override // android.javax.sip.InterfaceC10801h
    /* synthetic */ int getPort();

    /* synthetic */ String getSentBy();

    @Override // android.javax.sip.InterfaceC10801h
    /* synthetic */ String getTransport();

    void sendHeartbeat(String str, int i10);

    /* synthetic */ void setSentBy(String str);
}
