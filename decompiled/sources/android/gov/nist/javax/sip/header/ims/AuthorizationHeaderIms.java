package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13232h;

/* JADX INFO: loaded from: classes.dex */
public interface AuthorizationHeaderIms extends InterfaceC13232h {

    /* JADX INFO: renamed from: NO */
    public static final String f32003NO = "no";
    public static final String YES = "yes";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    /* synthetic */ String getAlgorithm();

    @Override // p713e.InterfaceC13232h
    /* synthetic */ String getCNonce();

    String getIntegrityProtected();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13232h
    /* synthetic */ String getNonce();

    /* synthetic */ int getNonceCount();

    /* synthetic */ String getOpaque();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    /* synthetic */ String getQop();

    @Override // p713e.InterfaceC13232h
    /* synthetic */ String getRealm();

    @Override // p713e.InterfaceC13232h
    /* synthetic */ String getResponse();

    /* synthetic */ String getScheme();

    @Override // p713e.InterfaceC13232h
    /* synthetic */ InterfaceC12947f getURI();

    @Override // p713e.InterfaceC13232h
    /* synthetic */ String getUsername();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setAlgorithm(String str);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setCNonce(String str);

    void setIntegrityProtected(String str);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setNonce(String str);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setNonceCount(int i10);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setOpaque(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setQop(String str);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setRealm(String str);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setResponse(String str);

    /* synthetic */ void setScheme(String str);

    /* synthetic */ void setURI(InterfaceC12947f interfaceC12947f);

    @Override // p713e.InterfaceC13232h
    /* synthetic */ void setUsername(String str);
}
