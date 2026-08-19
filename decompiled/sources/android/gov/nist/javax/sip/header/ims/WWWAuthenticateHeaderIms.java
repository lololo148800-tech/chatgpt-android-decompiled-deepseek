package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13233h0;

/* JADX INFO: loaded from: classes.dex */
public interface WWWAuthenticateHeaderIms extends InterfaceC13233h0 {

    /* JADX INFO: renamed from: CK */
    public static final String f32007CK = "ck";

    /* JADX INFO: renamed from: IK */
    public static final String f32008IK = "ik";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    @Override // p713e.InterfaceC13233h0
    /* synthetic */ String getAlgorithm();

    String getCK();

    /* synthetic */ String getDomain();

    String getIK();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13233h0
    /* synthetic */ String getNonce();

    @Override // p713e.InterfaceC13233h0
    /* synthetic */ String getOpaque();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    @Override // p713e.InterfaceC13233h0
    /* synthetic */ String getQop();

    @Override // p713e.InterfaceC13233h0
    /* synthetic */ String getRealm();

    @Override // p713e.InterfaceC13233h0
    /* synthetic */ String getScheme();

    /* synthetic */ InterfaceC12947f getURI();

    /* synthetic */ boolean isStale();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setAlgorithm(String str);

    void setCK(String str);

    /* synthetic */ void setDomain(String str);

    void setIK(String str);

    /* synthetic */ void setNonce(String str);

    /* synthetic */ void setOpaque(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    /* synthetic */ void setQop(String str);

    /* synthetic */ void setRealm(String str);

    /* synthetic */ void setScheme(String str);

    /* synthetic */ void setStale(boolean z6);

    /* synthetic */ void setURI(InterfaceC12947f interfaceC12947f);
}
