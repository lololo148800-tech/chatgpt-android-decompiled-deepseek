package p432Rh;

import io.sentry.hints.C15370i;
import java.io.IOException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p060C6.AbstractC1604a;
import p060C6.C1605b;
import p060C6.C1606c;
import p060C6.C1609f;
import p060C6.C1610g;
import p096Dg.C2046c;
import p195Hh.C3430e;
import p248Jk.C4471b;
import p364Oh.AbstractC6231e;
import p364Oh.C6222A;
import p364Oh.C6228b;
import p364Oh.C6230d;
import p364Oh.C6246t;
import p364Oh.C6250x;
import p364Oh.C6251y;
import p364Oh.C6252z;
import p364Oh.InterfaceC6247u;
import p384Ph.AbstractC6412b;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p556Wk.C8915b0;
import p556Wk.C8920e;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p857kl.C16440G;
import p876lm.InterfaceC17068a;
import p996rm.EnumC19250a;
import pl.C18506a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6900m implements InterfaceC6247u {

    /* JADX INFO: renamed from: a */
    public final C2046c f22115a;

    /* JADX INFO: renamed from: b */
    public final C4471b f22116b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f22117c;

    /* JADX INFO: renamed from: d */
    public final C3430e f22118d;

    public C6900m(C2046c c2046c, C4471b unauthorizedLogoutObserver, InterfaceC17068a staleAccountInformationObserver) {
        AbstractC16544l.m18094g(unauthorizedLogoutObserver, "unauthorizedLogoutObserver");
        AbstractC16544l.m18094g(staleAccountInformationObserver, "staleAccountInformationObserver");
        this.f22115a = c2046c;
        this.f22116b = unauthorizedLogoutObserver;
        this.f22117c = staleAccountInformationObserver;
        this.f22118d = AbstractC8168p6.m8749b("NetworkErrorMapper", null);
    }

    @Override // p364Oh.InterfaceC6247u
    /* JADX INFO: renamed from: a */
    public final Object mo6741a(Throwable th2, AbstractC19687c abstractC19687c) {
        return m7289b(th2, new C6896i(this, null), new C6897j(this, null), new C6898k(2, this.f22115a, C2046c.class, "onNetworkCertificateError", "onNetworkCertificateError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), abstractC19687c);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:116:0x021c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0226  */
    /* JADX WARN: Code duplicated, block: B:124:0x022c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b7  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final Object m7289b(Throwable th2, C6896i c6896i, C6897j c6897j, C6898k c6898k, AbstractC19687c abstractC19687c) {
        C6899l c6899l;
        Throwable th3;
        C6896i c6896i2;
        InterfaceC1436k interfaceC1436k;
        Throwable th4;
        Throwable th5;
        AbstractC6412b abstractC6412b;
        C6228b c6228b;
        C6222A c6222a;
        Exception exc;
        String str;
        String str2;
        AbstractC6412b abstractC6412b2;
        Throwable th6;
        AbstractC6412b abstractC6412b3;
        C6228b c6228b2;
        Exception exc2;
        String str3;
        String str4;
        Throwable th7 = th2;
        if (abstractC19687c instanceof C6899l) {
            c6899l = (C6899l) abstractC19687c;
            int i10 = c6899l.f22114q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6899l.f22114q0 = i10 - Integer.MIN_VALUE;
            } else {
                c6899l = new C6899l(this, abstractC19687c);
            }
        } else {
            c6899l = new C6899l(this, abstractC19687c);
        }
        Object objM16628p = c6899l.f22112o0;
        Object obj = EnumC19250a.f61036Y;
        switch (c6899l.f22114q0) {
            case 0:
                AbstractC9233X.m9807c(objM16628p);
                if (th7 instanceof C6246t) {
                    return new C6251y(th7);
                }
                if (th7 instanceof AbstractC1604a) {
                    if (th7 instanceof C1605b) {
                        return new C6222A(th2, ((C1605b) th7).f4485Y, (String) null, (String) null, 28);
                    }
                    if (!(th7 instanceof C1606c)) {
                        if (th7 instanceof C1609f) {
                            return new C6252z(th7);
                        }
                        return th7 instanceof C1610g ? new C6252z(th7) : new C6251y(th7);
                    }
                    C15370i c15370i = AbstractC6412b.f20855Z;
                    Throwable thM16627m = C15370i.m16627m((C1606c) th7);
                    if (thM16627m == null) {
                        thM16627m = (Exception) th7;
                    }
                    return new C6250x(thM16627m);
                }
                if (th7 instanceof C6230d) {
                    return AbstractC6231e.m6737b(((C6230d) th7).f20292Y);
                }
                if (th7 instanceof SSLHandshakeException ? true : th7 instanceof CertificateException) {
                    if (c6898k != null) {
                        c6899l.f22110Y = th7;
                        c6899l.f22114q0 = 1;
                        c6898k.invoke(th7, c6899l);
                        if (C17296C.f55119a == obj) {
                            return obj;
                        }
                    }
                    th4 = th7;
                    return new C6250x(th4);
                }
                if (!(th7 instanceof C8920e)) {
                    if (!(th7 instanceof C8915b0)) {
                        if (th7 instanceof IOException) {
                            return new C6250x(th7);
                        }
                        boolean z6 = th7 instanceof IllegalArgumentException ? true : th7 instanceof C18506a;
                        C3430e c3430e = this.f22118d;
                        if (z6) {
                            AbstractC8160o6.m8731f(c3430e, "Serialization error", th7, null, 4);
                            return new C6252z(th7);
                        }
                        AbstractC8160o6.m8731f(c3430e, "Unexpected exception from network request", th7, null, 4);
                        return new C6251y(th7);
                    }
                    c6899l.f22110Y = th7;
                    c6899l.f22114q0 = 6;
                    objM16628p = AbstractC6412b.f20855Z.m16628p((C8915b0) th7, c6899l);
                    if (objM16628p == obj) {
                        return obj;
                    }
                    th3 = th7;
                    abstractC6412b2 = (AbstractC6412b) objM16628p;
                    c6899l.f22110Y = th3;
                    c6899l.f22111Z = abstractC6412b2;
                    c6899l.f22114q0 = 7;
                    objM16628p = C6228b.f20281q0.m7941L((C8915b0) th3, c6899l);
                    if (objM16628p == obj) {
                        return obj;
                    }
                    th6 = th3;
                    abstractC6412b3 = abstractC6412b2;
                    c6228b2 = (C6228b) objM16628p;
                    if (abstractC6412b3 != null) {
                        exc2 = abstractC6412b3;
                    } else if (c6228b2 != null) {
                        exc2 = c6228b2;
                    } else {
                        exc2 = (Exception) th6;
                    }
                    C8915b0 c8915b0 = (C8915b0) th6;
                    int i11 = c8915b0.f27285Y.mo7307f().f51013Y;
                    AbstractC14527b abstractC14527b = c8915b0.f27285Y;
                    AbstractC16544l.m18094g(abstractC14527b, "<this>");
                    String strMo7982g = abstractC14527b.mo7301a().mo7982g("cf-ray");
                    if (abstractC6412b3 != null || (str4 = abstractC6412b3.f20857Y) == null) {
                        str3 = c6228b2 != null ? c6228b2.f20283Y : null;
                    } else {
                        str3 = str4;
                    }
                    c6222a = new C6222A(exc2, i11, strMo7982g, str3, c6228b2 != null ? c6228b2.f20286p0 : false);
                    return c6222a;
                }
                if (!AbstractC16544l.m18089b(((C8920e) th7).f27285Y.mo7307f(), C16440G.f51009w0) || c6897j == null) {
                    c6896i2 = c6896i;
                } else {
                    c6899l.f22110Y = th7;
                    c6896i2 = c6896i;
                    c6899l.f22111Z = c6896i2;
                    c6899l.f22114q0 = 2;
                    if (c6897j.invoke(c6899l) == obj) {
                        return obj;
                    }
                }
                interfaceC1436k = c6896i2;
                if (AbstractC16544l.m18089b(((C8920e) th7).f27285Y.mo7307f(), C16440G.f51008v0) && interfaceC1436k != null) {
                    c6899l.f22110Y = th7;
                    c6899l.f22111Z = null;
                    c6899l.f22114q0 = 3;
                    if (interfaceC1436k.invoke(c6899l) == obj) {
                        return obj;
                    }
                    th5 = th7;
                    th7 = th5;
                }
                c6899l.f22110Y = th7;
                c6899l.f22111Z = null;
                c6899l.f22114q0 = 4;
                objM16628p = AbstractC6412b.f20855Z.m16628p((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                abstractC6412b = (AbstractC6412b) objM16628p;
                c6899l.f22110Y = th7;
                c6899l.f22111Z = abstractC6412b;
                c6899l.f22114q0 = 5;
                objM16628p = C6228b.f20281q0.m7941L((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                c6228b = (C6228b) objM16628p;
                if (abstractC6412b != null) {
                    exc = abstractC6412b;
                } else if (c6228b != null) {
                    exc = c6228b;
                } else {
                    exc = (Exception) th7;
                }
                C8920e c8920e = (C8920e) th7;
                int i12 = c8920e.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b2 = c8920e.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b2, "<this>");
                String strMo7982g2 = abstractC14527b2.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b != null || (str2 = abstractC6412b.f20857Y) == null) {
                    str = c6228b != null ? c6228b.f20283Y : null;
                } else {
                    str = str2;
                }
                c6222a = new C6222A(exc, i12, strMo7982g2, str, c6228b != null ? c6228b.f20286p0 : false);
                return c6222a;
            case 1:
                th4 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                return new C6250x(th4);
            case 2:
                interfaceC1436k = (InterfaceC1436k) c6899l.f22111Z;
                th7 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                if (AbstractC16544l.m18089b(((C8920e) th7).f27285Y.mo7307f(), C16440G.f51008v0)) {
                    c6899l.f22110Y = th7;
                    c6899l.f22111Z = null;
                    c6899l.f22114q0 = 3;
                    if (interfaceC1436k.invoke(c6899l) == obj) {
                        return obj;
                    }
                    th5 = th7;
                    th7 = th5;
                }
                c6899l.f22110Y = th7;
                c6899l.f22111Z = null;
                c6899l.f22114q0 = 4;
                objM16628p = AbstractC6412b.f20855Z.m16628p((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                abstractC6412b = (AbstractC6412b) objM16628p;
                c6899l.f22110Y = th7;
                c6899l.f22111Z = abstractC6412b;
                c6899l.f22114q0 = 5;
                objM16628p = C6228b.f20281q0.m7941L((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                c6228b = (C6228b) objM16628p;
                if (abstractC6412b != null) {
                    exc = abstractC6412b;
                } else if (c6228b != null) {
                    exc = c6228b;
                } else {
                    exc = (Exception) th7;
                }
                C8920e c8920e2 = (C8920e) th7;
                int i13 = c8920e2.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b3 = c8920e2.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b3, "<this>");
                String strMo7982g3 = abstractC14527b3.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b != null) {
                    str = c6228b != null ? c6228b.f20283Y : null;
                } else {
                    str = c6228b != null ? c6228b.f20283Y : null;
                }
                c6222a = new C6222A(exc, i13, strMo7982g3, str, c6228b != null ? c6228b.f20286p0 : false);
                return c6222a;
            case 3:
                th5 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                th7 = th5;
                c6899l.f22110Y = th7;
                c6899l.f22111Z = null;
                c6899l.f22114q0 = 4;
                objM16628p = AbstractC6412b.f20855Z.m16628p((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                abstractC6412b = (AbstractC6412b) objM16628p;
                c6899l.f22110Y = th7;
                c6899l.f22111Z = abstractC6412b;
                c6899l.f22114q0 = 5;
                objM16628p = C6228b.f20281q0.m7941L((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                c6228b = (C6228b) objM16628p;
                if (abstractC6412b != null) {
                    exc = abstractC6412b;
                } else if (c6228b != null) {
                    exc = c6228b;
                } else {
                    exc = (Exception) th7;
                }
                C8920e c8920e3 = (C8920e) th7;
                int i14 = c8920e3.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b4 = c8920e3.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b4, "<this>");
                String strMo7982g4 = abstractC14527b4.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b != null) {
                    str = c6228b != null ? c6228b.f20283Y : null;
                } else {
                    str = c6228b != null ? c6228b.f20283Y : null;
                }
                c6222a = new C6222A(exc, i14, strMo7982g4, str, c6228b != null ? c6228b.f20286p0 : false);
                return c6222a;
            case 4:
                Throwable th8 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                th7 = th8;
                abstractC6412b = (AbstractC6412b) objM16628p;
                c6899l.f22110Y = th7;
                c6899l.f22111Z = abstractC6412b;
                c6899l.f22114q0 = 5;
                objM16628p = C6228b.f20281q0.m7941L((C8915b0) th7, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                c6228b = (C6228b) objM16628p;
                if (abstractC6412b != null) {
                    exc = abstractC6412b;
                } else if (c6228b != null) {
                    exc = c6228b;
                } else {
                    exc = (Exception) th7;
                }
                C8920e c8920e4 = (C8920e) th7;
                int i15 = c8920e4.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b5 = c8920e4.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b5, "<this>");
                String strMo7982g5 = abstractC14527b5.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b != null) {
                    str = c6228b != null ? c6228b.f20283Y : null;
                } else {
                    str = c6228b != null ? c6228b.f20283Y : null;
                }
                c6222a = new C6222A(exc, i15, strMo7982g5, str, c6228b != null ? c6228b.f20286p0 : false);
                return c6222a;
            case 5:
                abstractC6412b = (AbstractC6412b) c6899l.f22111Z;
                th7 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                c6228b = (C6228b) objM16628p;
                if (abstractC6412b != null) {
                    exc = abstractC6412b;
                } else if (c6228b != null) {
                    exc = c6228b;
                } else {
                    exc = (Exception) th7;
                }
                C8920e c8920e5 = (C8920e) th7;
                int i16 = c8920e5.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b6 = c8920e5.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b6, "<this>");
                String strMo7982g6 = abstractC14527b6.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b != null) {
                    str = c6228b != null ? c6228b.f20283Y : null;
                } else {
                    str = c6228b != null ? c6228b.f20283Y : null;
                }
                c6222a = new C6222A(exc, i16, strMo7982g6, str, c6228b != null ? c6228b.f20286p0 : false);
                return c6222a;
            case 6:
                th3 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                abstractC6412b2 = (AbstractC6412b) objM16628p;
                c6899l.f22110Y = th3;
                c6899l.f22111Z = abstractC6412b2;
                c6899l.f22114q0 = 7;
                objM16628p = C6228b.f20281q0.m7941L((C8915b0) th3, c6899l);
                if (objM16628p == obj) {
                    return obj;
                }
                th6 = th3;
                abstractC6412b3 = abstractC6412b2;
                c6228b2 = (C6228b) objM16628p;
                if (abstractC6412b3 != null) {
                    exc2 = abstractC6412b3;
                } else if (c6228b2 != null) {
                    exc2 = c6228b2;
                } else {
                    exc2 = (Exception) th6;
                }
                C8915b0 c8915b1 = (C8915b0) th6;
                int i17 = c8915b1.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b7 = c8915b1.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b7, "<this>");
                String strMo7982g7 = abstractC14527b7.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b3 != null) {
                    str3 = c6228b2 != null ? c6228b2.f20283Y : null;
                } else {
                    str3 = c6228b2 != null ? c6228b2.f20283Y : null;
                }
                c6222a = new C6222A(exc2, i17, strMo7982g7, str3, c6228b2 != null ? c6228b2.f20286p0 : false);
                return c6222a;
            case 7:
                abstractC6412b3 = (AbstractC6412b) c6899l.f22111Z;
                th6 = c6899l.f22110Y;
                AbstractC9233X.m9807c(objM16628p);
                c6228b2 = (C6228b) objM16628p;
                if (abstractC6412b3 != null) {
                    exc2 = abstractC6412b3;
                } else if (c6228b2 != null) {
                    exc2 = c6228b2;
                } else {
                    exc2 = (Exception) th6;
                }
                C8915b0 c8915b2 = (C8915b0) th6;
                int i18 = c8915b2.f27285Y.mo7307f().f51013Y;
                AbstractC14527b abstractC14527b8 = c8915b2.f27285Y;
                AbstractC16544l.m18094g(abstractC14527b8, "<this>");
                String strMo7982g8 = abstractC14527b8.mo7301a().mo7982g("cf-ray");
                if (abstractC6412b3 != null) {
                    str3 = c6228b2 != null ? c6228b2.f20283Y : null;
                } else {
                    str3 = c6228b2 != null ? c6228b2.f20283Y : null;
                }
                c6222a = new C6222A(exc2, i18, strMo7982g8, str3, c6228b2 != null ? c6228b2.f20286p0 : false);
                return c6222a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
