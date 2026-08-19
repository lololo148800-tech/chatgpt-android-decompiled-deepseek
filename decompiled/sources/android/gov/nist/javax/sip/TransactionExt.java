package android.gov.nist.javax.sip;

import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10795b;
import android.javax.sip.InterfaceC10810q;
import android.javax.sip.InterfaceC10814u;
import java.security.cert.Certificate;
import java.util.List;
import p735f.InterfaceC13461b;

/* JADX INFO: loaded from: classes.dex */
public interface TransactionExt extends InterfaceC10814u {
    List<String> extractCertIdentities();

    /* synthetic */ Object getApplicationData();

    /* synthetic */ String getBranchId();

    String getCipherSuite();

    /* synthetic */ InterfaceC10795b getDialog();

    String getHost();

    Certificate[] getLocalCertificates();

    String getPeerAddress();

    Certificate[] getPeerCertificates();

    int getPeerPort();

    int getPort();

    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    /* synthetic */ InterfaceC13461b getRequest();

    /* synthetic */ int getRetransmitTimer();

    InterfaceC10810q getSipProvider();

    /* synthetic */ C10815v getState();

    int getTimerD();

    int getTimerT2();

    int getTimerT4();

    String getTransport();

    /* synthetic */ void setApplicationData(Object obj);

    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    /* synthetic */ void setRetransmitTimer(int i10);

    void setTimerD(int i10);

    void setTimerT2(int i10);

    void setTimerT4(int i10);

    /* synthetic */ void terminate();
}
