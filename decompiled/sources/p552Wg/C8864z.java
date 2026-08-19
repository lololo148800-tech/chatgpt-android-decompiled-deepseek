package p552Wg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p039Bc.C0885s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.C4042e0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.C6207k;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8190s4;
import p537W0.AbstractC8411c;
import p547Wc.C8816z;
import p594Y9.AbstractC9798R3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Wg.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8864z extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27129Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8838B f27130Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f27131o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8864z(C8838B c8838b, InterfaceC3759g interfaceC3759g, int i10) {
        super(3);
        this.f27129Y = i10;
        this.f27130Z = c8838b;
        this.f27131o0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f27129Y) {
            case 0:
                InterfaceC17783s0 TopAppBar = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TopAppBar, "$this$TopAppBar");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C8838B c8838b = this.f27130Z;
                    C5975S c5975s = C6013l.f19514a;
                    boolean z6 = c8838b.f27035j;
                    InterfaceC3759g interfaceC3759g = this.f27131o0;
                    if (z6) {
                        c6021p.m6524S(1516048181);
                        c6021p.m6524S(1157282610);
                        Object objM6514H = c6021p.m6514H();
                        if (objM6514H == c5975s) {
                            objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                            c6021p.m6537c0(objM6514H);
                        }
                        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
                        Object objM530s = AbstractC0168G.m530s(1157285092, c6021p, false);
                        if (objM530s == c5975s) {
                            objM530s = new C6207k(interfaceC5985X, 21);
                            c6021p.m6537c0(objM530s);
                        }
                        InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM530s;
                        Object objM530s2 = AbstractC0168G.m530s(1157287331, c6021p, false);
                        if (objM530s2 == c5975s) {
                            objM530s2 = new C6207k(interfaceC5985X, 19);
                            c6021p.m6537c0(objM530s2);
                        }
                        c6021p.m6553p(false);
                        AbstractC3984T1.m4693l((InterfaceC1426a) objM530s2, null, false, null, null, AbstractC8842d.f27068c, c6021p, 196614, 30);
                        boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                        c6021p.m6524S(1157302564);
                        Object objM6514H2 = c6021p.m6514H();
                        if (objM6514H2 == c5975s) {
                            objM6514H2 = new C6207k(interfaceC5985X, 20);
                            c6021p.m6537c0(objM6514H2);
                        }
                        c6021p.m6553p(false);
                        AbstractC8190s4.m8770a(zBooleanValue, (InterfaceC1426a) objM6514H2, null, 0L, null, null, AbstractC8411c.m8969c(-181397454, c6021p, new C0885s(interfaceC3759g, 18, interfaceC1426a)), c6021p, 1572912, 60);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1518310282);
                        c6021p.m6524S(1157357637);
                        boolean zM6542f = c6021p.m6542f(interfaceC3759g);
                        Object objM6514H3 = c6021p.m6514H();
                        if (zM6542f || objM6514H3 == c5975s) {
                            objM6514H3 = new C8846h(interfaceC3759g, 1);
                            c6021p.m6537c0(objM6514H3);
                        }
                        c6021p.m6553p(false);
                        AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H3, null, false, null, null, AbstractC8842d.f27073h, c6021p, 196608, 30);
                        c6021p.m6553p(false);
                    }
                }
                break;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p2, 0);
                    int i10 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    C17794y c17794y = C17794y.f56777a;
                    C8838B c8838b2 = this.f27130Z;
                    AbstractC9798R3.m10415a(c8838b2.f27030e, c8838b2.f27037l, c8838b2.f27038m, c8838b2.f27036k, c17794y.m19544b(c10456n, true), c8838b2.f27027b, c8838b2.f27029d, AbstractC8842d.f27074i, c6021p2, 12582912, 0);
                    float f10 = AbstractC7313q.f23201f;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11234l(c10456n, f10, f10), 1.0f);
                    boolean z10 = !c8838b2.f27027b;
                    C4042e0 c4042e0M4732a = AbstractC4048f0.m4732a(c6021p2);
                    c6021p2.m6524S(1157398677);
                    InterfaceC3759g interfaceC3759g2 = this.f27131o0;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC3759g2) | c6021p2.m6542f(c8838b2);
                    Object objM6514H4 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H4 == C6013l.f19514a) {
                        objM6514H4 = new C8816z(interfaceC3759g2, 5, c8838b2);
                        c6021p2.m6537c0(objM6514H4);
                    }
                    c6021p2.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H4, interfaceC10459qM11244d, z10, null, c4042e0M4732a, null, null, null, null, AbstractC8842d.f27075j, c6021p2, 805306368, 488);
                    c6021p2.m6553p(true);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
