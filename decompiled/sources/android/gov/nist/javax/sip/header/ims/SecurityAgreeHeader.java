package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface SecurityAgreeHeader extends InterfaceC13200H, InterfaceC13250x {
    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    String getAlgorithm();

    String getEncryptionAlgorithm();

    String getMode();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    int getPortClient();

    int getPortServer();

    float getPreference();

    String getProtocol();

    int getSPIClient();

    int getSPIServer();

    String getSecurityMechanism();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setAlgorithm(String str);

    void setEncryptionAlgorithm(String str);

    void setMode(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setPortClient(int i10);

    void setPortServer(int i10);

    void setPreference(float f10);

    void setProtocol(String str);

    void setSPIClient(int i10);

    void setSPIServer(int i10);

    void setSecurityMechanism(String str);
}
