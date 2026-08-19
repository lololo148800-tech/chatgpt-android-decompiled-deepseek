package p1140z1;

import android.view.View;
import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1014t1.C19732i;
import p1095x1.C21094o;
import p1095x1.InterfaceC21095p;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p523V9.AbstractC8111i5;
import p537W0.C8414f;
import p635a1.AbstractC10443a;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: z1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21690f {

    /* JADX INFO: renamed from: a */
    public static final C21686d f68846a = new C21686d(0);

    /* JADX INFO: renamed from: a */
    public static final long m22196a(float f10, boolean z6) {
        return ((z6 ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f10)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final void m22197b(C6546d c6546d, AbstractC10458p abstractC10458p) {
        C6546d c6546dM22014L = m22217v(abstractC10458p).m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = c6546dM22014L.f21182Y;
            do {
                c6546d.m7099c((AbstractC10458p) ((C21658D) objArr[i11]).f68638I0.f3471f);
                i11--;
            } while (i11 >= 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m22198c(AbstractC21668N abstractC21668N, C21094o c21094o) {
        AbstractC21668N abstractC21668NMo22119g0 = abstractC21668N.mo22119g0();
        if (abstractC21668NMo22119g0 == null) {
            AbstractC8111i5.m8592c("Child of " + abstractC21668N + " cannot be null when calculating alignment line");
            throw null;
        }
        if (abstractC21668N.mo22123n0().mo19805a().containsKey(c21094o)) {
            Integer num = (Integer) abstractC21668N.mo22123n0().mo19805a().get(c21094o);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iMo21547H = abstractC21668NMo22119g0.mo21547H(c21094o);
        if (iMo21547H == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        abstractC21668NMo22119g0.f68757s0 = true;
        abstractC21668N.f68758t0 = true;
        abstractC21668N.mo22126u0();
        abstractC21668NMo22119g0.f68757s0 = false;
        abstractC21668N.f68758t0 = false;
        return iMo21547H + ((int) (c21094o instanceof C21094o ? abstractC21668NMo22119g0.mo22125q0() & 4294967295L : abstractC21668NMo22119g0.mo22125q0() >> 32));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m22199d(C21684c c21684c) {
        C21703l0 c21703l0 = (C21703l0) m22217v(c21684c).f68638I0.f3470e;
        AbstractC16544l.m18092e(c21703l0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return c21703l0.f68876z0;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC10458p m22200e(InterfaceC21704m interfaceC21704m, int i10) {
        AbstractC10458p abstractC10458p = ((AbstractC10458p) interfaceC21704m).f30960Y.f30965r0;
        if (abstractC10458p == null || (abstractC10458p.f30963p0 & i10) == 0) {
            return null;
        }
        while (abstractC10458p != null) {
            int i11 = abstractC10458p.f30962o0;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return abstractC10458p;
            }
            abstractC10458p = abstractC10458p.f30965r0;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC10458p m22201f(C6546d c6546d) {
        if (c6546d == null || c6546d.m7108m()) {
            return null;
        }
        return (AbstractC10458p) c6546d.m7111p(c6546d.f21184o0 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC21718w m22202g(AbstractC10458p abstractC10458p) {
        if ((abstractC10458p.f30962o0 & 2) != 0) {
            if (abstractC10458p instanceof InterfaceC21718w) {
                return (InterfaceC21718w) abstractC10458p;
            }
            if (abstractC10458p instanceof AbstractC21706n) {
                AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458p).f68881A0;
                while (abstractC10458p2 != 0) {
                    if (abstractC10458p2 instanceof InterfaceC21718w) {
                        return (InterfaceC21718w) abstractC10458p2;
                    }
                    abstractC10458p2 = (!(abstractC10458p2 instanceof AbstractC21706n) || (abstractC10458p2.f30962o0 & 2) == 0) ? abstractC10458p2.f30965r0 : ((AbstractC21706n) abstractC10458p2).f68881A0;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final int m22203h(long j10, long j11) {
        boolean z6 = ((int) (j10 & 4294967295L)) != 0;
        if (z6 != (((int) (4294967295L & j11)) != 0)) {
            return z6 ? -1 : 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final Object m22204i(InterfaceC21702l interfaceC21702l, AbstractC6012k0 abstractC6012k0) {
        if (!((AbstractC10458p) interfaceC21702l).f30960Y.f30972y0) {
            AbstractC8111i5.m8592c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        C8414f c8414f = (C8414f) m22217v(interfaceC21702l).f68636G0;
        c8414f.getClass();
        return C5997d.m6433T(c8414f, abstractC6012k0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC21707n0 m22205j(InterfaceC21704m interfaceC21704m, Object obj) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p = ((AbstractC10458p) interfaceC21704m).f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = m22217v(interfaceC21704m);
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 262144) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 262144) != 0) {
                        ?? M22201f = abstractC10458p2;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            if (M22201f instanceof InterfaceC21707n0) {
                                InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) M22201f;
                                if (obj.equals(interfaceC21707n0.mo14727o())) {
                                    return interfaceC21707n0;
                                }
                            } else if ((M22201f.f30962o0 & 262144) != 0 && (M22201f instanceof AbstractC21706n)) {
                                AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                int i10 = 0;
                                M22201f = M22201f;
                                c6546d = c6546d;
                                while (abstractC10458p3 != null) {
                                    if ((abstractC10458p3.f30962o0 & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            c6546d = c6546d;
                                            M22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d == 0) {
                                                c6546d = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (M22201f != 0) {
                                                c6546d.m7099c(M22201f);
                                                M22201f = 0;
                                            }
                                            c6546d.m7099c(abstractC10458p3);
                                        }
                                    }
                                    abstractC10458p3 = abstractC10458p3.f30965r0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M22201f = m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, z1.m, z1.n0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC21707n0 m22206k(InterfaceC21707n0 interfaceC21707n0) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p = ((AbstractC10458p) interfaceC21707n0).f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = m22217v(interfaceC21707n0);
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 262144) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 262144) != 0) {
                        ?? M22201f = abstractC10458p2;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            if (M22201f instanceof InterfaceC21707n0) {
                                InterfaceC21707n0 interfaceC21707n1 = (InterfaceC21707n0) M22201f;
                                if (AbstractC16544l.m18089b(interfaceC21707n0.mo14727o(), interfaceC21707n1.mo14727o()) && AbstractC10443a.m10920a(interfaceC21707n0, interfaceC21707n1)) {
                                    return interfaceC21707n1;
                                }
                            } else if ((M22201f.f30962o0 & 262144) != 0 && (M22201f instanceof AbstractC21706n)) {
                                AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                int i10 = 0;
                                M22201f = M22201f;
                                c6546d = c6546d;
                                while (abstractC10458p3 != null) {
                                    if ((abstractC10458p3.f30962o0 & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            c6546d = c6546d;
                                            M22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d == 0) {
                                                c6546d = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (M22201f != 0) {
                                                c6546d.m7099c(M22201f);
                                                M22201f = 0;
                                            }
                                            c6546d.m7099c(abstractC10458p3);
                                        }
                                    }
                                    abstractC10458p3 = abstractC10458p3.f30965r0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M22201f = m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final ArrayList m22207l(InterfaceC21095p interfaceC21095p) {
        AbstractC16544l.m18092e(interfaceC21095p, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        C21658D c21658dMo22122l0 = ((AbstractC21668N) interfaceC21095p).mo22122l0();
        boolean zM22212q = m22212q(c21658dMo22122l0);
        C6543a c6543a = (C6543a) c21658dMo22122l0.m22057r();
        C6546d c6546d = c6543a.f21176Y;
        ArrayList arrayList = new ArrayList(c6546d.f21184o0);
        int i10 = c6546d.f21184o0;
        for (int i11 = 0; i11 < i10; i11++) {
            C21658D c21658d = (C21658D) c6543a.get(i11);
            arrayList.add(zM22212q ? c21658d.m22050n() : c21658d.m22052o());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static final int m22208m(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m22209n(InterfaceC21708o interfaceC21708o) {
        if (((AbstractC10458p) interfaceC21708o).f30960Y.f30972y0) {
            m22215t(interfaceC21708o, 1).m22165P0();
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m22210o(InterfaceC21718w interfaceC21718w) {
        m22217v(interfaceC21718w).m22019Q();
    }

    /* JADX INFO: renamed from: p */
    public static final void m22211p(InterfaceC21701k0 interfaceC21701k0) {
        m22217v(interfaceC21701k0).m22022T();
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m22212q(C21658D c21658d) {
        int iM24h = AbstractC0010F.m24h(c21658d.m22064w());
        if (iM24h != 0) {
            if (iM24h == 1) {
                return true;
            }
            if (iM24h != 2) {
                if (iM24h == 3) {
                    return true;
                }
                if (iM24h != 4) {
                    throw new C0644w();
                }
                C21658D c21658dM22009G = c21658d.m22009G();
                if (c21658dM22009G != null) {
                    return m22212q(c21658dM22009G);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m22213r(C21658D c21658d) {
        if (c21658d.f68652o0 != null) {
            C21658D c21658dM22009G = c21658d.m22009G();
            if ((c21658dM22009G != null ? c21658dM22009G.f68652o0 : null) == null || c21658d.m22060t().f68730b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final void m22214s(AbstractC10458p abstractC10458p, InterfaceC1426a interfaceC1426a) {
        C21683b0 c21683b0 = abstractC10458p.f30966s0;
        if (c21683b0 == null) {
            c21683b0 = new C21683b0((InterfaceC21681a0) abstractC10458p);
            abstractC10458p.f30966s0 = c21683b0;
        }
        m22218w(abstractC10458p).getSnapshotObserver().m22222a(c21683b0, C21688e.f68836r0, interfaceC1426a);
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC21678Y m22215t(InterfaceC21704m interfaceC21704m, int i10) {
        AbstractC21678Y abstractC21678Y = ((AbstractC10458p) interfaceC21704m).f30960Y.f30967t0;
        AbstractC16544l.m18091d(abstractC21678Y);
        if (abstractC21678Y.mo22159J0() != interfaceC21704m || !AbstractC21679Z.m22191h(i10)) {
            return abstractC21678Y;
        }
        AbstractC21678Y abstractC21678Y2 = abstractC21678Y.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y2);
        return abstractC21678Y2;
    }

    /* JADX INFO: renamed from: u */
    public static final AbstractC21678Y m22216u(InterfaceC21704m interfaceC21704m) {
        if (!((AbstractC10458p) interfaceC21704m).f30960Y.f30972y0) {
            AbstractC8111i5.m8592c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        AbstractC21678Y abstractC21678YM22215t = m22215t(interfaceC21704m, 2);
        if (abstractC21678YM22215t.mo22159J0().f30972y0) {
            return abstractC21678YM22215t;
        }
        AbstractC8111i5.m8592c("LayoutCoordinates is not attached.");
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static final C21658D m22217v(InterfaceC21704m interfaceC21704m) {
        AbstractC21678Y abstractC21678Y = ((AbstractC10458p) interfaceC21704m).f30960Y.f30967t0;
        if (abstractC21678Y != null) {
            return abstractC21678Y.f68819x0;
        }
        AbstractC8111i5.m8593d("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static final Owner m22218w(InterfaceC21704m interfaceC21704m) {
        AndroidComposeView androidComposeView = m22217v(interfaceC21704m).f68658u0;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        AbstractC8111i5.m8593d("This node does not have an owner.");
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public static final View m22219x(InterfaceC21704m interfaceC21704m) {
        if (((AbstractC10458p) interfaceC21704m).f30960Y.f30972y0) {
            return (View) AbstractC21661G.m22082a(m22217v(interfaceC21704m));
        }
        AbstractC8111i5.m8592c("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [Bm.k] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: y */
    public static final void m22220y(C19732i c19732i, InterfaceC1436k interfaceC1436k) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p = c19732i.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = m22217v(c19732i);
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 262144) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 262144) != 0) {
                        ?? M22201f = abstractC10458p2;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            boolean zBooleanValue = true;
                            if (M22201f instanceof InterfaceC21707n0) {
                                InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) M22201f;
                                if ("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(interfaceC21707n0.mo14727o()) && AbstractC10443a.m10920a(c19732i, interfaceC21707n0)) {
                                    zBooleanValue = ((Boolean) interfaceC1436k.invoke(interfaceC21707n0)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((M22201f.f30962o0 & 262144) != 0) && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i10 = 0;
                                    while (abstractC10458p3 != null) {
                                        if ((abstractC10458p3.f30962o0 & 262144) != 0) {
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                            i10++;
                                            if (i10 == 1) {
                                                M22201f = M22201f;
                                                c6546d = c6546d;
                                                c6546d = c6546d;
                                                M22201f = abstractC10458p3;
                                            } else {
                                                if (c6546d == 0) {
                                                    c6546d = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d.m7099c(abstractC10458p3);
                                            }
                                        } else {
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                        }
                                        abstractC10458p3 = abstractC10458p3.f30965r0;
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                    if (i10 == 1) {
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    } else {
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                }
                            }
                            M22201f = m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, z1.n0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [Bm.k] */
    /* JADX WARN: Type inference failed for: r7v10, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: z */
    public static final void m22221z(InterfaceC21707n0 interfaceC21707n0, InterfaceC1436k interfaceC1436k) {
        AbstractC10458p abstractC10458p = ((AbstractC10458p) interfaceC21707n0).f30960Y;
        if (!abstractC10458p.f30972y0) {
            AbstractC8111i5.m8592c("visitSubtreeIf called on an unattached node");
            throw null;
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        if (abstractC10458p2 == null) {
            m22197b(c6546d, abstractC10458p);
        } else {
            c6546d.m7099c(abstractC10458p2);
        }
        while (c6546d.m7109n()) {
            AbstractC10458p abstractC10458p3 = (AbstractC10458p) c6546d.m7111p(c6546d.f21184o0 - 1);
            if ((abstractC10458p3.f30963p0 & 262144) != 0) {
                AbstractC10458p abstractC10458p4 = abstractC10458p3;
                while (true) {
                    if (abstractC10458p4 != null) {
                        if ((abstractC10458p4.f30962o0 & 262144) != 0) {
                            ?? c6546d2 = 0;
                            ?? M22201f = abstractC10458p4;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC21707n0) {
                                    InterfaceC21707n0 interfaceC21707n1 = (InterfaceC21707n0) M22201f;
                                    EnumC21705m0 enumC21705m0 = (AbstractC16544l.m18089b(interfaceC21707n0.mo14727o(), interfaceC21707n1.mo14727o()) && AbstractC10443a.m10920a(interfaceC21707n0, interfaceC21707n1)) ? (EnumC21705m0) interfaceC1436k.invoke(interfaceC21707n1) : EnumC21705m0.f68877Y;
                                    if (enumC21705m0 != EnumC21705m0.f68879o0) {
                                        if (enumC21705m0 == EnumC21705m0.f68878Z) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M22201f.f30962o0 & 262144) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p5 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i10 = 0;
                                    while (abstractC10458p5 != null) {
                                        if ((abstractC10458p5.f30962o0 & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                M22201f = M22201f;
                                                c6546d2 = c6546d2;
                                                c6546d2 = c6546d2;
                                                M22201f = abstractC10458p5;
                                            } else {
                                                if (c6546d2 == 0) {
                                                    c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d2.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d2.m7099c(abstractC10458p5);
                                            }
                                        } else {
                                            M22201f = M22201f;
                                            c6546d2 = c6546d2;
                                        }
                                        abstractC10458p5 = abstractC10458p5.f30965r0;
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                    if (i10 == 1) {
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    } else {
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                }
                                M22201f = m22201f(c6546d2);
                            }
                        }
                        abstractC10458p4 = abstractC10458p4.f30965r0;
                    }
                }
            }
            m22197b(c6546d, abstractC10458p3);
        }
    }
}
