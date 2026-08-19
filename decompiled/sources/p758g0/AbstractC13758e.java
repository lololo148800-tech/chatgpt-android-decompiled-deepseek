package p758g0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p003A1.C0219X0;
import p003A1.InterfaceC0222Y0;
import p017Af.C0494y;
import p046Bk.C1419y0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1788W;
import p179H0.C3183a;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p552Wg.C8847i;
import p571X9.AbstractC9233X;
import p635a1.C10444b;
import p635a1.InterfaceC10460r;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13758e {

    /* JADX INFO: renamed from: a */
    public static final C13776n f43430a = new C13776n(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C13778o f43431b = new C13778o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C13780p f43432c = new C13780p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C13782q f43433d = new C13782q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C13776n f43434e = new C13776n(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C13778o f43435f = new C13778o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C13780p f43436g = new C13780p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C13782q f43437h = new C13782q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: a */
    public static C13756d m15236a(float f10) {
        return new C13756d(Float.valueOf(f10), AbstractC13785r0.f43528a, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: b */
    public static C13774m m15237b(float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new C13774m(AbstractC13785r0.f43528a, Float.valueOf(f10), new C13776n(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m15238c(float f10, float f11, float f12, InterfaceC13772l interfaceC13772l, InterfaceC1439n interfaceC1439n, AbstractC19694j abstractC19694j) {
        C13783q0 c13783q0 = AbstractC13785r0.f43528a;
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        Float f15 = new Float(f12);
        C13755c0 c13755c0 = C13755c0.f43401t0;
        AbstractC13784r abstractC13784rMo15285c = (AbstractC13784r) c13755c0.invoke(f15);
        if (abstractC13784rMo15285c == null) {
            abstractC13784rMo15285c = ((AbstractC13784r) c13755c0.invoke(f13)).mo15285c();
        }
        AbstractC13784r abstractC13784r = abstractC13784rMo15285c;
        Object objM15239d = m15239d(new C13774m(c13783q0, f13, abstractC13784r, 56), new C13757d0(interfaceC13772l, c13783q0, f13, f14, abstractC13784r), Long.MIN_VALUE, new C1419y0(interfaceC1439n, 3), abstractC19694j);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objM15239d != enumC19250a) {
            objM15239d = c17296c;
        }
        return objM15239d == enumC19250a ? objM15239d : c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: d */
    public static final Object m15239d(C13774m c13774m, InterfaceC13766i interfaceC13766i, long j10, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C13749Z c13749z;
        C16525B c16525b;
        InterfaceC1436k interfaceC1436k2;
        C13774m c13774m2;
        Object objMo876v0;
        C13770k c13770k;
        C13770k c13770k2;
        Object objMo876v1;
        C13774m c13774m3 = c13774m;
        InterfaceC13766i interfaceC13766i2 = interfaceC13766i;
        if (abstractC19687c instanceof C13749Z) {
            c13749z = (C13749Z) abstractC19687c;
            int i10 = c13749z.f43364r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13749z.f43364r0 = i10 - Integer.MIN_VALUE;
            } else {
                c13749z = new C13749Z(abstractC19687c);
            }
        } else {
            c13749z = new C13749Z(abstractC19687c);
        }
        C13749Z c13749z2 = c13749z;
        Object obj = c13749z2.f43363q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13749z2.f43364r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            Object objMo15234i = interfaceC13766i2.mo15234i(0L);
            AbstractC13784r abstractC13784rMo15232g = interfaceC13766i2.mo15232g(0L);
            C16525B c16525b2 = new C16525B();
            try {
                if (j10 == Long.MIN_VALUE) {
                    C13751a0 c13751a0 = new C13751a0(c16525b2, objMo15234i, interfaceC13766i, abstractC13784rMo15232g, c13774m, m15251p(c13749z2.getContext()), interfaceC1436k);
                    c13749z2.f43359Y = c13774m3;
                    c13749z2.f43360Z = interfaceC13766i2;
                    interfaceC1436k2 = interfaceC1436k;
                    c13749z2.f43361o0 = interfaceC1436k2;
                    c13749z2.f43362p0 = c16525b2;
                    c13749z2.f43364r0 = 1;
                    if (interfaceC13766i.mo15229d()) {
                        objMo876v0 = m15257v(c13751a0, c13749z2);
                    } else {
                        objMo876v0 = C5997d.m6424K(c13749z2.getContext()).mo876v0(new C1419y0(4, c13751a0), c13749z2);
                    }
                    if (objMo876v0 == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    interfaceC1436k2 = interfaceC1436k;
                    try {
                        C13770k c13770k3 = new C13770k(objMo15234i, interfaceC13766i.mo15231f(), abstractC13784rMo15232g, j10, interfaceC13766i.mo15235j(), j10, new C1788W(2, c13774m3));
                        c16525b2 = c16525b2;
                        m15249n(c13770k3, j10, m15251p(c13749z2.getContext()), interfaceC13766i, c13774m, interfaceC1436k);
                        c16525b2.f51262Y = c13770k3;
                    } catch (CancellationException e10) {
                        e = e10;
                        c16525b2 = c16525b2;
                        c16525b = c16525b2;
                        c13770k = (C13770k) c16525b.f51262Y;
                        if (c13770k != null) {
                            c13770k.f43488i.setValue(Boolean.FALSE);
                        }
                        c13770k2 = (C13770k) c16525b.f51262Y;
                        if (c13770k2 != null) {
                            c13774m3.f43506r0 = false;
                        }
                        throw e;
                    }
                }
                c13774m2 = c13774m3;
                c16525b = c16525b2;
            } catch (CancellationException e11) {
                e = e11;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b = c13749z2.f43362p0;
            InterfaceC1436k interfaceC1436k3 = c13749z2.f43361o0;
            InterfaceC13766i interfaceC13766i3 = c13749z2.f43360Z;
            c13774m2 = c13749z2.f43359Y;
            try {
                AbstractC9233X.m9807c(obj);
                interfaceC1436k2 = interfaceC1436k3;
                interfaceC13766i2 = interfaceC13766i3;
            } catch (CancellationException e12) {
                e = e12;
                c13774m3 = c13774m2;
                c13770k = (C13770k) c16525b.f51262Y;
                if (c13770k != null) {
                    c13770k.f43488i.setValue(Boolean.FALSE);
                }
                c13770k2 = (C13770k) c16525b.f51262Y;
                if (c13770k2 != null && c13770k2.f43486g == c13774m3.f43504p0) {
                    c13774m3.f43506r0 = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = c16525b.f51262Y;
            AbstractC16544l.m18091d(obj2);
            if (!((Boolean) ((C13770k) obj2).f43488i.getValue()).booleanValue()) {
                return C17296C.f55119a;
            }
            C13753b0 c13753b0 = new C13753b0(c16525b, m15251p(c13749z2.getContext()), interfaceC13766i2, c13774m2, interfaceC1436k2);
            c13749z2.f43359Y = c13774m2;
            c13749z2.f43360Z = interfaceC13766i2;
            c13749z2.f43361o0 = interfaceC1436k2;
            c13749z2.f43362p0 = c16525b;
            c13749z2.f43364r0 = 2;
            if (interfaceC13766i2.mo15229d()) {
                objMo876v1 = m15257v(c13753b0, c13749z2);
            } else {
                objMo876v1 = C5997d.m6424K(c13749z2.getContext()).mo876v0(new C1419y0(4, c13753b0), c13749z2);
            }
        } while (objMo876v1 != enumC19250a);
        return enumC19250a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m15240e(float f10, float f11, InterfaceC13772l interfaceC13772l, InterfaceC1439n interfaceC1439n, AbstractC19694j abstractC19694j, int i10) {
        if ((i10 & 8) != 0) {
            interfaceC13772l = m15254s(0.0f, 0.0f, null, 7);
        }
        return m15238c(f10, f11, 0.0f, interfaceC13772l, interfaceC1439n, abstractC19694j);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m15241f(C13774m c13774m, C13796x c13796x, boolean z6, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        Object objM15239d = m15239d(c13774m, new C13794w(c13796x, c13774m.f43501Y, c13774m.f43502Z.getValue(), c13774m.f43503o0), z6 ? c13774m.f43504p0 : Long.MIN_VALUE, interfaceC1436k, abstractC19687c);
        return objM15239d == EnumC19250a.f61036Y ? objM15239d : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: g */
    public static final C13733I m15242g(C13736L c13736l, float f10, float f11, C13732H c13732h, String str, C6021p c6021p, int i10, int i11) {
        return m15245j(c13736l, Float.valueOf(f10), Float.valueOf(f11), AbstractC13785r0.f43528a, c13732h, (i11 & 8) != 0 ? "FloatAnimation" : str, c6021p, (i10 & 1022) | 32768 | ((i10 << 3) & 458752), 0);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m15243h(C13774m c13774m, Object obj, InterfaceC13772l interfaceC13772l, boolean z6, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        Object objM15239d = m15239d(c13774m, new C13757d0(interfaceC13772l, c13774m.f43501Y, c13774m.f43502Z.getValue(), obj, c13774m.f43503o0), z6 ? c13774m.f43504p0 : Long.MIN_VALUE, interfaceC1436k, abstractC19687c);
        return objM15239d == EnumC19250a.f61036Y ? objM15239d : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m15244i(C13774m c13774m, Object obj, InterfaceC13772l interfaceC13772l, boolean z6, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC13772l = m15254s(0.0f, 0.0f, null, 7);
        }
        InterfaceC13772l interfaceC13772l2 = interfaceC13772l;
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        boolean z10 = z6;
        if ((i10 & 8) != 0) {
            interfaceC1436k = C13755c0.f43395Z;
        }
        return m15243h(c13774m, obj, interfaceC13772l2, z10, interfaceC1436k, abstractC19687c);
    }

    /* JADX INFO: renamed from: j */
    public static final C13733I m15245j(C13736L c13736l, Number number, Number number2, C13783q0 c13783q0, C13732H c13732h, String str, C6021p c6021p, int i10, int i11) {
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = new C13733I(c13736l, number, number2, c13783q0, c13732h);
            c6021p.m6537c0(objM6514H);
        }
        C13733I c13733i = (C13733I) objM6514H;
        boolean z6 = true;
        boolean z10 = ((((i10 & 112) ^ 48) > 32 && c6021p.m6545h(number)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && c6021p.m6545h(number2)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !c6021p.m6545h(c13732h)) && (i10 & 24576) != 16384) {
            z6 = false;
        }
        boolean z11 = z10 | z6;
        Object objM6514H2 = c6021p.m6514H();
        if (z11 || objM6514H2 == c5975s) {
            objM6514H2 = new C0494y(number, c13733i, number2, c13732h, 11);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6454j((InterfaceC1426a) objM6514H2, c6021p);
        boolean zM6545h = c6021p.m6545h(c13736l);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6545h || objM6514H3 == c5975s) {
            objM6514H3 = new C8847i(c13736l, 27, c13733i);
            c6021p.m6537c0(objM6514H3);
        }
        C5997d.m6444c(c13733i, (InterfaceC1436k) objM6514H3, c6021p);
        return c13733i;
    }

    /* JADX INFO: renamed from: k */
    public static final float m15246k(C13796x c13796x, float f10, float f11) {
        C13783q0 c13783q0 = AbstractC13785r0.f43528a;
        InterfaceC13728D interfaceC13728D = c13796x.f43581a;
        C13776n c13776n = new C13776n(0.0f);
        int iMo15284b = c13776n.mo15284b();
        int i10 = 0;
        while (i10 < iMo15284b) {
            c13776n.mo15287e(i10, interfaceC13728D.mo4029F(i10 == 0 ? f10 : 0.0f, i10 == 0 ? f11 : 0.0f));
            i10++;
        }
        return c13776n.f43510a;
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC13784r m15247l(AbstractC13784r abstractC13784r) {
        AbstractC13784r abstractC13784rMo15285c = abstractC13784r.mo15285c();
        int iMo15284b = abstractC13784rMo15285c.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            abstractC13784rMo15285c.mo15287e(i10, abstractC13784r.mo15283a(i10));
        }
        return abstractC13784rMo15285c;
    }

    /* JADX INFO: renamed from: m */
    public static C13774m m15248m(C13774m c13774m, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) c13774m.f43502Z.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C13776n) c13774m.f43503o0).f43510a;
        }
        return new C13774m(c13774m.f43501Y, Float.valueOf(f10), new C13776n(f11), c13774m.f43504p0, c13774m.f43505q0, c13774m.f43506r0);
    }

    /* JADX INFO: renamed from: n */
    public static final void m15249n(C13770k c13770k, long j10, float f10, InterfaceC13766i interfaceC13766i, C13774m c13774m, InterfaceC1436k interfaceC1436k) {
        long jMo15230e = f10 == 0.0f ? interfaceC13766i.mo15230e() : (long) ((j10 - c13770k.f43482c) / f10);
        c13770k.f43486g = j10;
        c13770k.f43484e.setValue(interfaceC13766i.mo15234i(jMo15230e));
        c13770k.f43485f = interfaceC13766i.mo15232g(jMo15230e);
        if (interfaceC13766i.mo15233h(jMo15230e)) {
            c13770k.f43487h = c13770k.f43486g;
            c13770k.f43488i.setValue(Boolean.FALSE);
        }
        m15256u(c13770k, c13774m);
        interfaceC1436k.invoke(c13770k);
    }

    /* JADX INFO: renamed from: o */
    public static C13796x m15250o() {
        C3183a c3183a = new C3183a();
        c3183a.f9593Y = Math.max(1.0E-7f, Math.abs(0.1f));
        c3183a.f9594Z = Math.max(1.0E-4f, 1.0f) * (-4.2f);
        return new C13796x(c3183a);
    }

    /* JADX INFO: renamed from: p */
    public static final float m15251p(InterfaceC18776i interfaceC18776i) {
        InterfaceC10460r interfaceC10460r = (InterfaceC10460r) interfaceC18776i.get(C10444b.f30933B0);
        float fMo814W = interfaceC10460r != null ? interfaceC10460r.mo814W() : 1.0f;
        if (fMo814W >= 0.0f) {
            return fMo814W;
        }
        throw new IllegalStateException("negative scale factor");
    }

    /* JADX INFO: renamed from: q */
    public static C13732H m15252q(InterfaceC13797y interfaceC13797y, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return new C13732H(interfaceC13797y, i10, 0);
    }

    /* JADX INFO: renamed from: r */
    public static final C13736L m15253r(String str, C6021p c6021p, int i10) {
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = new C13736L();
            c6021p.m6537c0(objM6514H);
        }
        C13736L c13736l = (C13736L) objM6514H;
        c13736l.m15215a(0, c6021p);
        return c13736l;
    }

    /* JADX INFO: renamed from: s */
    public static C13746W m15254s(float f10, float f11, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new C13746W(f10, f11, obj);
    }

    /* JADX INFO: renamed from: t */
    public static C13781p0 m15255t(int i10, int i11, InterfaceC13798z interfaceC13798z, int i12) {
        if ((i12 & 1) != 0) {
            i10 = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC13798z = AbstractC13725A.f43288a;
        }
        return new C13781p0(i10, i11, interfaceC13798z);
    }

    /* JADX INFO: renamed from: u */
    public static final void m15256u(C13770k c13770k, C13774m c13774m) {
        c13774m.f43502Z.setValue(c13770k.f43484e.getValue());
        AbstractC13784r abstractC13784r = c13774m.f43503o0;
        AbstractC13784r abstractC13784r2 = c13770k.f43485f;
        int iMo15284b = abstractC13784r.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            abstractC13784r.mo15287e(i10, abstractC13784r2.mo15283a(i10));
        }
        c13774m.f43505q0 = c13770k.f43487h;
        c13774m.f43504p0 = c13770k.f43486g;
        c13774m.f43506r0 = ((Boolean) c13770k.f43488i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public static final Object m15257v(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        InterfaceC0222Y0 interfaceC0222Y0 = (InterfaceC0222Y0) abstractC19687c.getContext().get(C0219X0.f847Y);
        if (interfaceC0222Y0 == null) {
            return C5997d.m6424K(abstractC19687c.getContext()).mo876v0(interfaceC1436k, abstractC19687c);
        }
        new C13731G(interfaceC1436k, null);
        return interfaceC0222Y0.m691j0();
    }
}
