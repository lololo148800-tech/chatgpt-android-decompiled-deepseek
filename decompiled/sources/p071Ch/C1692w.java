package p071Ch;

import android.app.Application;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import ni.C17629c;
import p025An.AbstractC0575H;
import p025An.C0583L;
import p025An.C0644w;
import p044Bh.C1302o;
import p044Bh.InterfaceC1301n;
import p097Dh.C2051d;
import p1053v3.p1054lN.IGDwkYw;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21949O1;
import p1155zi.C21952P1;
import p123Eh.C2439c;
import p195Hh.C3430e;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6226E;
import p364Oh.C6248v;
import p432Rh.C6906s;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8218w0;
import p571X9.AbstractC9150J;
import p571X9.AbstractC9233X;
import p857kl.C16464l;
import p909nm.AbstractC17659D;
import p948pi.C18426i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C1692w {

    /* JADX INFO: renamed from: a */
    public final Application f4793a;

    /* JADX INFO: renamed from: b */
    public final C2051d f4794b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1301n f4795c;

    /* JADX INFO: renamed from: d */
    public final C6906s f4796d;

    /* JADX INFO: renamed from: e */
    public final C6226E f4797e;

    /* JADX INFO: renamed from: f */
    public final C17629c f4798f;

    /* JADX INFO: renamed from: g */
    public final C3430e f4799g = AbstractC8168p6.m8749b("PlayIntegrityService", null);

    /* JADX INFO: renamed from: h */
    public final C4816c f4800h = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: i */
    public C0583L f4801i;

    public C1692w(Application application, C2051d c2051d, InterfaceC1301n interfaceC1301n, C6906s c6906s, C6226E c6226e, C17629c c17629c) {
        this.f4793a = application;
        this.f4794b = c2051d;
        this.f4795c = interfaceC1301n;
        this.f4796d = c6906s;
        this.f4797e = c6226e;
        this.f4798f = c17629c;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ed, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final Object m2507a(C1692w c1692w, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        C1690u c1690u;
        Object objM6734a;
        C1692w c1692w2;
        boolean z10;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21933K1 abstractC21933K1;
        C21949O1 c21949o1;
        String str;
        String str2;
        if (abstractC19687c instanceof C1690u) {
            c1690u = (C1690u) abstractC19687c;
            int i10 = c1690u.f4789q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1690u.f4789q0 = i10 - Integer.MIN_VALUE;
            } else {
                c1690u = new C1690u(c1692w, abstractC19687c);
            }
        } else {
            c1690u = new C1690u(c1692w, abstractC19687c);
        }
        Object objM2494a = c1690u.f4787o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1690u.f4789q0;
        Object objM2510d = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM2494a);
            if (c1692w.f4797e.f20275g) {
                String string = c1692w.f4793a.getString(R.string.emulator_token);
                AbstractC16544l.m18093f(string, "getString(...)");
                return new C21952P1(new C18426i(string));
            }
            String strM8846a = AbstractC8218w0.m8846a(256);
            c1690u.f4785Y = c1692w;
            c1690u.f4786Z = z6;
            c1690u.f4789q0 = 1;
            objM2494a = ((C1663C) c1692w.f4795c).m2494a(strM8846a, z6, c1690u);
            if (objM2494a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC9233X.m9807c(objM2494a);
                        C18426i c18426i = (C18426i) objM2494a;
                        if (c18426i != null) {
                            objM2510d = c18426i.f58788a;
                        }
                        str = (String) objM2510d;
                        if (str != null) {
                            objM6734a = new C21952P1(new C18426i(str));
                        } else {
                            objM6734a = new C21941M1(new Exception("Cookie not found in store"));
                        }
                        return objM6734a;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM2494a);
                    C18426i c18426i2 = (C18426i) objM2494a;
                    if (c18426i2 != null) {
                        objM2510d = c18426i2.f58788a;
                    }
                    str2 = (String) objM2510d;
                    if (str2 != null) {
                        objM6734a = new C21952P1(new C18426i(str2));
                    } else {
                        objM6734a = new C21941M1(new Exception("Cookie not found in store"));
                    }
                    return objM6734a;
                }
                z10 = c1690u.f4786Z;
                c1692w2 = c1690u.f4785Y;
                AbstractC9233X.m9807c(objM2494a);
                abstractC21955Q1 = (AbstractC21955Q1) objM2494a;
                if (abstractC21955Q1 instanceof C21952P1) {
                    c1690u.f4785Y = c1692w2;
                    c1690u.f4789q0 = 3;
                    objM2510d = c1692w2.m2510d(z10, c1690u);
                    if (objM2510d == enumC19250a) {
                        return enumC19250a;
                    }
                    str = (String) objM2510d;
                    if (str != null) {
                        objM6734a = new C21952P1(new C18426i(str));
                    } else {
                        objM6734a = new C21941M1(new Exception("Cookie not found in store"));
                    }
                } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                    C3430e c3430e = c1692w2.f4799g;
                    String str3 = "Error refreshing Play Integrity cookie for preAuth=" + z10;
                    Throwable th2 = abstractC21933K1.f69485a;
                    if (abstractC21933K1 instanceof C21949O1) {
                        c21949o1 = (C21949O1) abstractC21933K1;
                    } else {
                        c21949o1 = null;
                    }
                    objM2510d = c21949o1 != null ? c21949o1.f69507c : null;
                    if (objM2510d == null) {
                        objM2510d = "";
                    }
                    c3430e.mo4186a(str3, th2, AbstractC17659D.m19244f(new C17309l(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, objM2510d), new C17309l(IGDwkYw.SAfBWKQCvSjAt, Boolean.valueOf(z10))));
                    objM6734a = abstractC21933K1;
                } else {
                    if (abstractC21955Q1 instanceof C21929J1) {
                        throw new C0644w();
                    }
                    c1690u.f4785Y = c1692w2;
                    c1690u.f4789q0 = 4;
                    objM2510d = c1692w2.m2510d(z10, c1690u);
                    if (objM2510d == enumC19250a) {
                        return enumC19250a;
                    }
                    str2 = (String) objM2510d;
                    if (str2 != null) {
                        objM6734a = new C21952P1(new C18426i(str2));
                    } else {
                        objM6734a = new C21941M1(new Exception("Cookie not found in store"));
                    }
                }
                return objM6734a;
            }
            z6 = c1690u.f4786Z;
            c1692w = c1690u.f4785Y;
            AbstractC9233X.m9807c(objM2494a);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM2494a;
        if (abstractC6224C instanceof C6223B) {
            C1302o c1302o = (C1302o) ((C6223B) abstractC6224C).f20258a;
            c1690u.f4785Y = c1692w;
            c1690u.f4786Z = z6;
            c1690u.f4789q0 = 2;
            objM2494a = c1692w.m2508b(z6, c1302o, c1690u);
            if (objM2494a == enumC19250a) {
                return enumC19250a;
            }
            boolean z11 = z6;
            c1692w2 = c1692w;
            z10 = z11;
            abstractC21955Q1 = (AbstractC21955Q1) objM2494a;
            if (abstractC21955Q1 instanceof C21952P1) {
                c1690u.f4785Y = c1692w2;
                c1690u.f4789q0 = 3;
                objM2510d = c1692w2.m2510d(z10, c1690u);
                if (objM2510d == enumC19250a) {
                    return enumC19250a;
                }
                str = (String) objM2510d;
                if (str != null) {
                    objM6734a = new C21952P1(new C18426i(str));
                } else {
                    objM6734a = new C21941M1(new Exception("Cookie not found in store"));
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                C3430e c3430e2 = c1692w2.f4799g;
                String str4 = "Error refreshing Play Integrity cookie for preAuth=" + z10;
                Throwable th3 = abstractC21933K1.f69485a;
                if (abstractC21933K1 instanceof C21949O1) {
                    c21949o1 = (C21949O1) abstractC21933K1;
                } else {
                    c21949o1 = null;
                }
                if (c21949o1 != null) {
                }
                if (objM2510d == null) {
                    objM2510d = "";
                }
                c3430e2.mo4186a(str4, th3, AbstractC17659D.m19244f(new C17309l(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, objM2510d), new C17309l(IGDwkYw.SAfBWKQCvSjAt, Boolean.valueOf(z10))));
                objM6734a = abstractC21933K1;
            } else {
                if (abstractC21955Q1 instanceof C21929J1) {
                    throw new C0644w();
                }
                c1690u.f4785Y = c1692w2;
                c1690u.f4789q0 = 4;
                objM2510d = c1692w2.m2510d(z10, c1690u);
                if (objM2510d == enumC19250a) {
                    return enumC19250a;
                }
                str2 = (String) objM2510d;
                if (str2 != null) {
                    objM6734a = new C21952P1(new C18426i(str2));
                } else {
                    objM6734a = new C21941M1(new Exception("Cookie not found in store"));
                }
            }
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        return objM6734a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m2508b(boolean z6, C1302o c1302o, AbstractC19687c abstractC19687c) {
        C1686q c1686q;
        if (abstractC19687c instanceof C1686q) {
            c1686q = (C1686q) abstractC19687c;
            int i10 = c1686q.f4771o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1686q.f4771o0 = i10 - Integer.MIN_VALUE;
            } else {
                c1686q = new C1686q(this, abstractC19687c);
            }
        } else {
            c1686q = new C1686q(this, abstractC19687c);
        }
        C1686q c1686q2 = c1686q;
        Object objM9699d = c1686q2.f4769Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1686q2.f4771o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9699d);
            C1687r c1687r = new C1687r(z6, this, new C2439c(c1302o.f3435a, c1302o.f3436b, c1302o.f3437c, c1302o.f3438d), null);
            c1686q2.f4771o0 = 1;
            objM9699d = AbstractC9150J.m9699d(0, 0L, null, null, c1687r, c1686q2, 63);
            if (objM9699d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9699d);
        }
        return ((AbstractC6224C) objM9699d).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m2509c(boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        C1688s c1688s;
        C4816c c4816c;
        C1692w c1692w;
        if (abstractC19687c instanceof C1688s) {
            c1688s = (C1688s) abstractC19687c;
            int i10 = c1688s.f4781r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1688s.f4781r0 = i10 - Integer.MIN_VALUE;
            } else {
                c1688s = new C1688s(this, abstractC19687c);
            }
        } else {
            c1688s = new C1688s(this, abstractC19687c);
        }
        Object objM1309u = c1688s.f4779p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1688s.f4781r0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    z6 = c1688s.f4778o0;
                    c4816c = c1688s.f4777Z;
                    c1692w = c1688s.f4776Y;
                    AbstractC9233X.m9807c(objM1309u);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM1309u);
                }
            }
            AbstractC9233X.m9807c(objM1309u);
            c1688s.f4776Y = this;
            c4816c = this.f4800h;
            c1688s.f4777Z = c4816c;
            c1688s.f4778o0 = z6;
            c1688s.f4781r0 = 1;
            if (c4816c.m5448e(null, c1688s) == enumC19250a) {
                return enumC19250a;
            }
            c1692w = this;
            C0583L c0583l = c1692w.f4801i;
            if (c0583l == null || c0583l.m1296M()) {
                c1692w.f4801i = AbstractC0575H.m1177f(AbstractC0575H.m1174c(c1692w.f4798f.f56414Y), null, new C1689t(c1692w, z6, null), 3);
            }
            C0583L c0583l2 = c1692w.f4801i;
            AbstractC16544l.m18091d(c0583l2);
            c4816c.m5450g(null);
            c1688s.f4776Y = null;
            c1688s.f4777Z = null;
            c1688s.f4781r0 = 2;
            objM1309u = c0583l2.m1309u(c1688s);
            return objM1309u == enumC19250a ? enumC19250a : objM1309u;
        } catch (Throwable th2) {
            c4816c.m5450g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m2510d(boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        C1691v c1691v;
        if (abstractC19687c instanceof C1691v) {
            c1691v = (C1691v) abstractC19687c;
            int i10 = c1691v.f4792o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1691v.f4792o0 = i10 - Integer.MIN_VALUE;
            } else {
                c1691v = new C1691v(this, abstractC19687c);
            }
        } else {
            c1691v = new C1691v(this, abstractC19687c);
        }
        Object objM7293e = c1691v.f4790Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1691v.f4792o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7293e);
            if (this.f4797e.f20275g) {
                String string = this.f4793a.getString(R.string.emulator_token);
                AbstractC16544l.m18093f(string, "getString(...)");
                return string;
            }
            String str = z6 ? "_preauth_playintegrity" : "_playintegrity";
            c1691v.f4792o0 = 1;
            objM7293e = this.f4796d.m7293e(str, c1691v);
            if (objM7293e == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM7293e);
        }
        C16464l c16464l = (C16464l) objM7293e;
        if (c16464l == null) {
            return null;
        }
        String value = c16464l.f51071b;
        AbstractC16544l.m18094g(value, "value");
        return value;
    }
}
