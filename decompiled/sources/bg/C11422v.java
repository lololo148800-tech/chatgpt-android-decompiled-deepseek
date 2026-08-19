package bg;

import af.C10564U;
import android.app.Application;
import eg.C13386i;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17636j;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1081wc.C20877X;
import p1081wc.InterfaceC20904w;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9150J;
import p571X9.AbstractC9233X;
import p623Zf.C10307c;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p707dg.C13110f;
import p707dg.C13113i;
import p872lg.C16941a;
import p872lg.C16942b;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C11422v {

    /* JADX INFO: renamed from: a */
    public final C11400B f34489a;

    /* JADX INFO: renamed from: b */
    public final C11399A f34490b;

    /* JADX INFO: renamed from: c */
    public final AbstractC21864z f34491c;

    /* JADX INFO: renamed from: d */
    public final Application f34492d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC13849E f34493e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC20904w f34494f;

    /* JADX INFO: renamed from: g */
    public final C3430e f34495g = AbstractC8168p6.m8749b("OnboardingRepository", null);

    /* JADX INFO: renamed from: h */
    public final C1970n f34496h;

    /* JADX INFO: renamed from: i */
    public final C0564B0 f34497i;

    public C11422v(C17636j c17636j, C11400B c11400b, C11399A c11399a, AbstractC21864z abstractC21864z, Application application, InterfaceC13849E interfaceC13849E, InterfaceC20904w interfaceC20904w) {
        this.f34489a = c11400b;
        this.f34490b = c11399a;
        this.f34491c = abstractC21864z;
        this.f34492d = application;
        this.f34493e = interfaceC13849E;
        this.f34494f = interfaceC20904w;
        this.f34496h = c11400b.f64176f;
        this.f34497i = AbstractC0575H.m1156D(c17636j, null, null, new C11415o(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m12786a(AbstractC19687c abstractC19687c) {
        C11408h c11408h;
        C11422v c11422v;
        C10327w c10327w;
        C11422v c11422v2;
        C10330z c10330z;
        C10307c c10307c;
        String str;
        String str2;
        C10327w c10327w2;
        C11422v c11422v3;
        AbstractC6224C abstractC6224C;
        Object objM6734a;
        boolean z6;
        C17690x c17690x;
        C20877X c20877x;
        C20877X c20877x2;
        C13386i c13386i;
        C3430e logger;
        String str3;
        int i10 = 1;
        if (abstractC19687c instanceof C11408h) {
            c11408h = (C11408h) abstractC19687c;
            int i11 = c11408h.f34448q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c11408h.f34448q0 = i11 - Integer.MIN_VALUE;
            } else {
                c11408h = new C11408h(this, abstractC19687c);
            }
        } else {
            c11408h = new C11408h(this, abstractC19687c);
        }
        C11408h c11408h2 = c11408h;
        Object objM12787b = c11408h2.f34446o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c11408h2.f34448q0;
        Object c16942b = null;
        if (i12 != 0) {
            if (i12 == 1) {
                c11422v = c11408h2.f34444Y;
                AbstractC9233X.m9807c(objM12787b);
            } else if (i12 == 2) {
                C10327w c10327w3 = c11408h2.f34445Z;
                C11422v c11422v4 = c11408h2.f34444Y;
                AbstractC9233X.m9807c(objM12787b);
                c10327w = c10327w3;
                c11422v2 = c11422v4;
                c10330z = (C10330z) objM12787b;
                c10307c = c10330z.f30658b;
                if (c10307c == null) {
                    return new C21941M1(new IllegalStateException("Account info is null"));
                }
                C11399A c11399a = c11422v2.f34490b;
                str = c10330z.f30659c;
                if (str == null) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                c11408h2.f34444Y = c11422v2;
                c11408h2.f34445Z = c10327w;
                c11408h2.f34448q0 = 3;
                C21554a c21554a = C21555b.f68260Z;
                objM12787b = AbstractC9150J.m9699d(3, AbstractC8128k6.m8644j(3, EnumC21557d.SECONDS), new C11425y(c11399a, 0), new C11425y(c11399a, i10), new C11426z(c11399a, c10307c.f30599a, c10307c.f30600b, c10307c.f30603e, str2, null), c11408h2, 12);
                if (objM12787b == enumC19250a) {
                    return enumC19250a;
                }
                c10327w2 = c10327w;
                c11422v3 = c11422v2;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c10327w2 = c11408h2.f34445Z;
                c11422v3 = c11408h2.f34444Y;
                AbstractC9233X.m9807c(objM12787b);
            }
            abstractC6224C = (AbstractC6224C) objM12787b;
            if (abstractC6224C instanceof C6223B) {
                c13386i = (C13386i) ((C6223B) abstractC6224C).f20258a;
                logger = c11422v3.f34495g;
                AbstractC16544l.m18094g(c13386i, "<this>");
                AbstractC16544l.m18094g(logger, "logger");
                if (c13386i.f42430d) {
                    str3 = c13386i.f42431e;
                    if (str3 == null) {
                        AbstractC8160o6.m8727b(logger, "Inquiry id is null", null, 6);
                    } else {
                        c16942b = new C16942b(str3, c13386i.f42432f);
                    }
                } else {
                    c16942b = C16941a.f54390a;
                }
                if (c16942b != null) {
                    objM6734a = new C21952P1(c16942b);
                } else {
                    objM6734a = new C21941M1(new IllegalStateException("Failed to parse"));
                }
            } else if (abstractC6224C instanceof C6248v) {
                objM6734a = C21929J1.f69476a;
            } else {
                if (abstractC6224C instanceof AbstractC6249w) {
                    throw new C0644w();
                }
                abstractC6224C.getClass();
                objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
            }
            z6 = objM6734a instanceof C21952P1;
            c17690x = C17690x.f56481Y;
            if (z6) {
                InterfaceC20904w interfaceC20904w = c11422v3.f34494f;
                if (c10327w2.f30650f) {
                    c20877x2 = C20877X.f66466c;
                } else {
                    c20877x2 = C20877X.f66467d;
                }
                interfaceC20904w.mo21447a(c20877x2, c17690x);
            }
            if (objM6734a instanceof AbstractC21933K1) {
                InterfaceC20904w interfaceC20904w2 = c11422v3.f34494f;
                if (c10327w2.f30650f) {
                    c20877x = C20877X.f66468e;
                } else {
                    c20877x = C20877X.f66469f;
                }
                interfaceC20904w2.mo21447a(c20877x, c17690x);
            }
            return objM6734a;
        }
        AbstractC9233X.m9807c(objM12787b);
        c11408h2.f34444Y = this;
        c11408h2.f34448q0 = 1;
        objM12787b = m12787b(c11408h2);
        if (objM12787b == enumC19250a) {
            return enumC19250a;
        }
        c11422v = this;
        C10327w c10327w4 = (C10327w) objM12787b;
        C11400B c11400b = c11422v.f34489a;
        c11408h2.f34444Y = c11422v;
        c11408h2.f34445Z = c10327w4;
        c11408h2.f34448q0 = 2;
        Object objM3221t = AbstractC2124C.m3221t(c11400b.f64176f, c11408h2);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c10327w = c10327w4;
        c11422v2 = c11422v;
        objM12787b = objM3221t;
        c10330z = (C10330z) objM12787b;
        c10307c = c10330z.f30658b;
        if (c10307c == null) {
            return new C21941M1(new IllegalStateException("Account info is null"));
        }
        C11399A c11399a2 = c11422v2.f34490b;
        str = c10330z.f30659c;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str;
        }
        c11408h2.f34444Y = c11422v2;
        c11408h2.f34445Z = c10327w;
        c11408h2.f34448q0 = 3;
        C21554a c21554a2 = C21555b.f68260Z;
        objM12787b = AbstractC9150J.m9699d(3, AbstractC8128k6.m8644j(3, EnumC21557d.SECONDS), new C11425y(c11399a2, 0), new C11425y(c11399a2, i10), new C11426z(c11399a2, c10307c.f30599a, c10307c.f30600b, c10307c.f30603e, str2, null), c11408h2, 12);
        if (objM12787b == enumC19250a) {
            return enumC19250a;
        }
        c10327w2 = c10327w;
        c11422v3 = c11422v2;
        abstractC6224C = (AbstractC6224C) objM12787b;
        if (abstractC6224C instanceof C6223B) {
            c13386i = (C13386i) ((C6223B) abstractC6224C).f20258a;
            logger = c11422v3.f34495g;
            AbstractC16544l.m18094g(c13386i, "<this>");
            AbstractC16544l.m18094g(logger, "logger");
            if (c13386i.f42430d) {
                str3 = c13386i.f42431e;
                if (str3 == null) {
                    AbstractC8160o6.m8727b(logger, "Inquiry id is null", null, 6);
                } else {
                    c16942b = new C16942b(str3, c13386i.f42432f);
                }
            } else {
                c16942b = C16941a.f54390a;
            }
            if (c16942b != null) {
                objM6734a = new C21952P1(c16942b);
            } else {
                objM6734a = new C21941M1(new IllegalStateException("Failed to parse"));
            }
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = C21929J1.f69476a;
        } else {
            if (abstractC6224C instanceof AbstractC6249w) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        z6 = objM6734a instanceof C21952P1;
        c17690x = C17690x.f56481Y;
        if (z6) {
            InterfaceC20904w interfaceC20904w3 = c11422v3.f34494f;
            if (c10327w2.f30650f) {
                c20877x2 = C20877X.f66466c;
            } else {
                c20877x2 = C20877X.f66467d;
            }
            interfaceC20904w3.mo21447a(c20877x2, c17690x);
        }
        if (objM6734a instanceof AbstractC21933K1) {
            InterfaceC20904w interfaceC20904w4 = c11422v3.f34494f;
            if (c10327w2.f30650f) {
                c20877x = C20877X.f66468e;
            } else {
                c20877x = C20877X.f66469f;
            }
            interfaceC20904w4.mo21447a(c20877x, c17690x);
        }
        return objM6734a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m12787b(AbstractC19687c abstractC19687c) {
        C11409i c11409i;
        if (abstractC19687c instanceof C11409i) {
            c11409i = (C11409i) abstractC19687c;
            int i10 = c11409i.f34451o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11409i.f34451o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11409i = new C11409i(this, abstractC19687c);
            }
        } else {
            c11409i = new C11409i(this, abstractC19687c);
        }
        Object objM3221t = c11409i.f34449Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11409i.f34451o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            C11400B c11400b = this.f34489a;
            c11409i.f34451o0 = 1;
            objM3221t = AbstractC2124C.m3221t(c11400b.f64176f, c11409i);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM3221t);
        }
        C10327w c10327w = ((C10330z) objM3221t).f30661e;
        if (c10327w != null) {
            return c10327w;
        }
        C10327w.Companion.getClass();
        return C10327w.f30644m;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m12788c(AbstractC19687c abstractC19687c) {
        C11417q c11417q;
        C11422v c11422v;
        AbstractC6224C abstractC6224C;
        C10564U c10564u;
        if (abstractC19687c instanceof C11417q) {
            c11417q = (C11417q) abstractC19687c;
            int i10 = c11417q.f34474p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11417q.f34474p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11417q = new C11417q(this, abstractC19687c);
            }
        } else {
            c11417q = new C11417q(this, abstractC19687c);
        }
        Object objM3221t = c11417q.f34472Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11417q.f34474p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c11422v = c11417q.f34471Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                c11422v = c11417q.f34471Y;
                AbstractC9233X.m9807c(objM3221t);
                abstractC6224C = (AbstractC6224C) objM3221t;
                if (!(abstractC6224C instanceof C6223B)) {
                    if (abstractC6224C instanceof C6248v) {
                        return C21929J1.f69476a;
                    }
                    if (abstractC6224C instanceof AbstractC6249w) {
                        throw new C0644w();
                    }
                    abstractC6224C.getClass();
                    return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                }
                c10564u = new C10564U((C6223B) abstractC6224C, 12);
                c11417q.f34471Y = null;
                c11417q.f34474p0 = 3;
                if (c11422v.m12791f(c10564u, c11417q) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return new C21952P1(C17296C.f55119a);
        }
        AbstractC9233X.m9807c(objM3221t);
        c11417q.f34471Y = this;
        c11417q.f34474p0 = 1;
        objM3221t = AbstractC2124C.m3221t(this.f34489a.f64176f, c11417q);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c11422v = this;
        C10307c c10307c = ((C10330z) objM3221t).f30658b;
        if (c10307c == null) {
            return new C21941M1(new IllegalStateException("Account info is null"));
        }
        String str = c10307c.f30601c;
        if (str == null) {
            C21941M1 c21941m1 = new C21941M1(new IllegalStateException("Phone number is null"));
            AbstractC8160o6.m8727b(c11422v.f34495g, "Requested OTP code without a phone number", null, 6);
            return c21941m1;
        }
        C11399A c11399a = c11422v.f34490b;
        String str2 = c10307c.f30602d.f54394a;
        c11417q.f34471Y = c11422v;
        c11417q.f34474p0 = 2;
        objM3221t = c11399a.f34429a.m13039e(new C13113i(str, str2), c11417q);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        abstractC6224C = (AbstractC6224C) objM3221t;
        if (!(abstractC6224C instanceof C6223B)) {
            c10564u = new C10564U((C6223B) abstractC6224C, 12);
            c11417q.f34471Y = null;
            c11417q.f34474p0 = 3;
            if (c11422v.m12791f(c10564u, c11417q) == enumC19250a) {
                return enumC19250a;
            }
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC6224C instanceof C6248v) {
            return C21929J1.f69476a;
        }
        if (abstractC6224C instanceof AbstractC6249w) {
            throw new C0644w();
        }
        abstractC6224C.getClass();
        return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m12789d(String str, AbstractC19687c abstractC19687c) {
        C11418r c11418r;
        if (abstractC19687c instanceof C11418r) {
            c11418r = (C11418r) abstractC19687c;
            int i10 = c11418r.f34477o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11418r.f34477o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11418r = new C11418r(this, abstractC19687c);
            }
        } else {
            c11418r = new C11418r(this, abstractC19687c);
        }
        Object objM13041g = c11418r.f34475Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11418r.f34477o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13041g);
            c11418r.f34477o0 = 1;
            objM13041g = this.f34490b.f34429a.m13041g(str, c11418r);
            if (objM13041g == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM13041g);
        }
        return ((AbstractC6224C) objM13041g).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m12790e(String str, AbstractC19687c abstractC19687c) {
        C11419s c11419s;
        if (abstractC19687c instanceof C11419s) {
            c11419s = (C11419s) abstractC19687c;
            int i10 = c11419s.f34480o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11419s.f34480o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11419s = new C11419s(this, abstractC19687c);
            }
        } else {
            c11419s = new C11419s(this, abstractC19687c);
        }
        Object objM13040f = c11419s.f34478Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11419s.f34480o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13040f);
            c11419s.f34480o0 = 1;
            objM13040f = this.f34490b.f34429a.m13040f(str, c11419s);
            if (objM13040f == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM13040f);
        }
        return ((AbstractC6224C) objM13040f).m6735b();
    }

    /* JADX INFO: renamed from: f */
    public final Object m12791f(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        Object objM21029b = this.f34489a.m21029b(interfaceC1436k, abstractC19687c);
        return objM21029b == EnumC19250a.f61036Y ? objM21029b : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m12792g(String str, String str2, AbstractC19687c abstractC19687c) {
        C11420t c11420t;
        if (abstractC19687c instanceof C11420t) {
            c11420t = (C11420t) abstractC19687c;
            int i10 = c11420t.f34483o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11420t.f34483o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11420t = new C11420t(this, abstractC19687c);
            }
        } else {
            c11420t = new C11420t(this, abstractC19687c);
        }
        Object objM13042h = c11420t.f34481Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11420t.f34483o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13042h);
            c11420t.f34483o0 = 1;
            objM13042h = this.f34490b.f34429a.m13042h(str, str2, c11420t);
            if (objM13042h == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM13042h);
        }
        return ((AbstractC6224C) objM13042h).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m12793h(String str, AbstractC19687c abstractC19687c) {
        C11421u c11421u;
        Object obj;
        String str2;
        C11422v c11422v;
        AbstractC6224C abstractC6224C;
        Object objM6734a;
        if (abstractC19687c instanceof C11421u) {
            c11421u = (C11421u) abstractC19687c;
            int i10 = c11421u.f34488q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11421u.f34488q0 = i10 - Integer.MIN_VALUE;
            } else {
                c11421u = new C11421u(this, abstractC19687c);
            }
        } else {
            c11421u = new C11421u(this, abstractC19687c);
        }
        Object objM13038d = c11421u.f34486o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11421u.f34488q0;
        if (i11 != 0) {
            if (i11 == 1) {
                String str3 = c11421u.f34485Z;
                C11422v c11422v2 = c11421u.f34484Y;
                AbstractC9233X.m9807c(objM13038d);
                str2 = str3;
                c11422v = c11422v2;
                obj = objM13038d;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c11422v = c11421u.f34484Y;
                AbstractC9233X.m9807c(objM13038d);
            }
            abstractC6224C = (AbstractC6224C) objM13038d;
            if (abstractC6224C instanceof C6223B) {
                objM6734a = new C21952P1(C17296C.f55119a);
            } else if (abstractC6224C instanceof C6248v) {
                objM6734a = C21929J1.f69476a;
            } else {
                if (abstractC6224C instanceof AbstractC6249w) {
                    throw new C0644w();
                }
                abstractC6224C.getClass();
                objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
            }
            if (objM6734a instanceof AbstractC21933K1) {
                c11422v.f34494f.mo21447a(C20877X.f66482s, C17690x.f56481Y);
            }
            return objM6734a;
        }
        AbstractC9233X.m9807c(objM13038d);
        c11421u.f34484Y = this;
        c11421u.f34485Z = str;
        c11421u.f34488q0 = 1;
        Object objM3221t = AbstractC2124C.m3221t(this.f34489a.f64176f, c11421u);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        obj = objM3221t;
        str2 = str;
        c11422v = this;
        String str4 = ((C10330z) obj).f30659c;
        if (str4 == null) {
            return new C21941M1(new IllegalStateException("Phone verification id is null"));
        }
        C11399A c11399a = c11422v.f34490b;
        c11421u.f34484Y = c11422v;
        c11421u.f34485Z = null;
        c11421u.f34488q0 = 2;
        objM13038d = c11399a.f34429a.m13038d(new C13110f(str4, str2), c11421u);
        if (objM13038d == enumC19250a) {
            return enumC19250a;
        }
        abstractC6224C = (AbstractC6224C) objM13038d;
        if (abstractC6224C instanceof C6223B) {
            objM6734a = new C21952P1(C17296C.f55119a);
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = C21929J1.f69476a;
        } else {
            if (abstractC6224C instanceof AbstractC6249w) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (objM6734a instanceof AbstractC21933K1) {
            c11422v.f34494f.mo21447a(C20877X.f66482s, C17690x.f56481Y);
        }
        return objM6734a;
    }
}
