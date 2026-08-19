package android.gov.nist.javax.sip.address;

import java.util.Iterator;
import p691d.InterfaceC12945d;

/* JADX INFO: loaded from: classes.dex */
public interface SipURIExt extends InterfaceC12945d {
    @Override // p691d.InterfaceC12947f
    /* synthetic */ Object clone();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getHeader(String str);

    @Override // p691d.InterfaceC12945d
    /* synthetic */ Iterator getHeaderNames();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getHost();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getMAddrParam();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getMethodParam();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ int getPort();

    @Override // p691d.InterfaceC12947f
    /* synthetic */ String getScheme();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ int getTTLParam();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getTransportParam();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getUser();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getUserParam();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ String getUserPassword();

    boolean hasGrParam();

    @Override // p691d.InterfaceC12945d
    boolean hasLrParam();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ boolean isSecure();

    @Override // p691d.InterfaceC12947f
    /* synthetic */ boolean isSipURI();

    void removeHeader(String str);

    void removeHeaders();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void removePort();

    void setGrParam(String str);

    /* synthetic */ void setHeader(String str, String str2);

    @Override // p691d.InterfaceC12945d
    /* synthetic */ void setHost(String str);

    void setLrParam();

    @Override // p691d.InterfaceC12945d
    /* synthetic */ void setMAddrParam(String str);

    /* synthetic */ void setMethodParam(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    @Override // p691d.InterfaceC12945d
    /* synthetic */ void setPort(int i10);

    @Override // p691d.InterfaceC12945d
    /* synthetic */ void setSecure(boolean z6);

    /* synthetic */ void setTTLParam(int i10);

    @Override // p691d.InterfaceC12945d
    /* synthetic */ void setTransportParam(String str);

    @Override // p691d.InterfaceC12945d
    /* synthetic */ void setUser(String str);

    /* synthetic */ void setUserParam(String str);

    /* synthetic */ void setUserPassword(String str);
}
