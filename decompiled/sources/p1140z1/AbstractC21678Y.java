package p1140z1;

import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0240d0;
import p045Bj.C1313k;
import p049Bm.InterfaceC1436k;
import p1062vd.C20567q;
import p1071w0.C20714I0;
import p1095x1.AbstractC21075b0;
import p1095x1.C21055I;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21098s;
import p392Q0.C6546d;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8112i6;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9394x4;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p615Z6.C10235r;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p635a1.AbstractC10458p;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14325C;
import p774h1.AbstractC14334L;
import p774h1.C14328F;
import p774h1.C14336N;
import p774h1.C14343V;
import p774h1.InterfaceC14362r;
import p843k1.C16308b;
import p870le.C16886i0;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p985r9.C18903m;

/* JADX INFO: renamed from: z1.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21678Y extends AbstractC21668N implements InterfaceC21056J, InterfaceC21098s, InterfaceC21689e0 {

    /* JADX INFO: renamed from: R0 */
    public static final C14336N f68797R0;

    /* JADX INFO: renamed from: S0 */
    public static final C21716u f68798S0;

    /* JADX INFO: renamed from: T0 */
    public static final float[] f68799T0;

    /* JADX INFO: renamed from: U0 */
    public static final C21686d f68800U0;

    /* JADX INFO: renamed from: V0 */
    public static final C21686d f68801V0;

    /* JADX INFO: renamed from: A0 */
    public boolean f68802A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f68803B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC1436k f68804C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC7537b f68805D0;

    /* JADX INFO: renamed from: E0 */
    public EnumC7546k f68806E0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC21058L f68808G0;

    /* JADX INFO: renamed from: H0 */
    public LinkedHashMap f68809H0;

    /* JADX INFO: renamed from: J0 */
    public float f68811J0;

    /* JADX INFO: renamed from: K0 */
    public C10235r f68812K0;

    /* JADX INFO: renamed from: L0 */
    public C21716u f68813L0;

    /* JADX INFO: renamed from: O0 */
    public boolean f68816O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC21687d0 f68817P0;

    /* JADX INFO: renamed from: Q0 */
    public C16308b f68818Q0;

    /* JADX INFO: renamed from: x0 */
    public final C21658D f68819x0;

    /* JADX INFO: renamed from: y0 */
    public AbstractC21678Y f68820y0;

    /* JADX INFO: renamed from: z0 */
    public AbstractC21678Y f68821z0;

    /* JADX INFO: renamed from: F0 */
    public float f68807F0 = 0.8f;

    /* JADX INFO: renamed from: I0 */
    public long f68810I0 = 0;

    /* JADX INFO: renamed from: M0 */
    public final C20567q f68814M0 = new C20567q(this, 5);

    /* JADX INFO: renamed from: N0 */
    public final C20714I0 f68815N0 = new C20714I0(this, 12);

    static {
        C14336N c14336n = new C14336N();
        c14336n.f44985Z = 1.0f;
        c14336n.f44986o0 = 1.0f;
        c14336n.f44987p0 = 1.0f;
        long j10 = AbstractC14325C.f44961a;
        c14336n.f44991t0 = j10;
        c14336n.f44992u0 = j10;
        c14336n.f44996y0 = 8.0f;
        c14336n.f44997z0 = C14343V.f45023b;
        c14336n.f44977A0 = AbstractC14334L.f44973a;
        c14336n.f44979C0 = 0;
        c14336n.f44980D0 = 9205357640488583168L;
        c14336n.f44981E0 = AbstractC9394x4.m9976a();
        c14336n.f44982F0 = EnumC7546k.f23904Y;
        f68797R0 = c14336n;
        f68798S0 = new C21716u();
        f68799T0 = C14328F.m15602a();
        f68800U0 = new C21686d(1);
        f68801V0 = new C21686d(2);
    }

    public AbstractC21678Y(C21658D c21658d) {
        this.f68819x0 = c21658d;
        this.f68805D0 = c21658d.f68633D0;
        this.f68806E0 = c21658d.f68634E0;
    }

    /* JADX INFO: renamed from: a1 */
    public static AbstractC21678Y m22149a1(InterfaceC21098s interfaceC21098s) {
        AbstractC21678Y abstractC21678Y;
        C21055I c21055i = interfaceC21098s instanceof C21055I ? (C21055I) interfaceC21098s : null;
        if (c21055i != null && (abstractC21678Y = c21055i.f66971Y.f68765x0) != null) {
            return abstractC21678Y;
        }
        AbstractC16544l.m18092e(interfaceC21098s, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC21678Y) interfaceC21098s;
    }

    /* JADX INFO: renamed from: A0 */
    public final float m22150A0(long j10, long j11) {
        if (mo21549L() >= C13803e.m15333e(j11) && mo21548K() >= C13803e.m15331c(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM22183z0 = m22183z0(j11);
        float fM15333e = C13803e.m15333e(jM22183z0);
        float fM15331c = C13803e.m15331c(jM22183z0);
        float fM15306g = C13800b.m15306g(j10);
        float fMax = Math.max(0.0f, fM15306g < 0.0f ? -fM15306g : fM15306g - mo21549L());
        float fM15307h = C13800b.m15307h(j10);
        long jM8536b = AbstractC8088f6.m8536b(fMax, Math.max(0.0f, fM15307h < 0.0f ? -fM15307h : fM15307h - mo21548K()));
        if ((fM15333e > 0.0f || fM15331c > 0.0f) && C13800b.m15306g(jM8536b) <= fM15333e && C13800b.m15307h(jM8536b) <= fM15331c) {
            return C13800b.m15305f(jM8536b);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: B */
    public final long mo21516B(long j10) {
        if (mo22159J0().f30972y0) {
            return m22167R0(AbstractC21075b0.m21568i(this), ((AndroidComposeView) AbstractC21661G.m22082a(this.f68819x0)).m11334F(j10));
        }
        AbstractC8111i5.m8592c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m22151B0(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 != null) {
            interfaceC21687d0.mo540c(interfaceC14362r, c16308b);
            return;
        }
        long j10 = this.f68810I0;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & 4294967295L);
        interfaceC14362r.mo15717p(f10, f11);
        m22153D0(interfaceC14362r, c16308b);
        interfaceC14362r.mo15717p(-f10, -f11);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m22152C0(InterfaceC14362r interfaceC14362r, C18903m c18903m) {
        long j10 = this.f66983o0;
        interfaceC14362r.mo15704c(new C13801c(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f), c18903m);
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: D */
    public final long mo21517D(long j10) {
        if (!mo22159J0().f30972y0) {
            AbstractC8111i5.m8592c("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        m22168S0();
        for (AbstractC21678Y abstractC21678Y = this; abstractC21678Y != null; abstractC21678Y = abstractC21678Y.f68821z0) {
            j10 = abstractC21678Y.m22176b1(j10, true);
        }
        return j10;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m22153D0(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        AbstractC10458p abstractC10458pM22160K0 = m22160K0(4);
        if (abstractC10458pM22160K0 == null) {
            mo22171V0(interfaceC14362r, c16308b);
            return;
        }
        C21658D c21658d = this.f68819x0;
        c21658d.getClass();
        C21660F sharedDrawScope = AbstractC21661G.m22082a(c21658d).getSharedDrawScope();
        long jM9645c = AbstractC9113C4.m9645c(this.f66983o0);
        sharedDrawScope.getClass();
        C6546d c6546d = null;
        while (abstractC10458pM22160K0 != null) {
            if (abstractC10458pM22160K0 instanceof InterfaceC21708o) {
                sharedDrawScope.m22081b(interfaceC14362r, jM9645c, this, (InterfaceC21708o) abstractC10458pM22160K0, c16308b);
            } else if ((abstractC10458pM22160K0.f30962o0 & 4) != 0 && (abstractC10458pM22160K0 instanceof AbstractC21706n)) {
                int i10 = 0;
                for (AbstractC10458p abstractC10458p = ((AbstractC21706n) abstractC10458pM22160K0).f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
                    if ((abstractC10458p.f30962o0 & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC10458pM22160K0 = abstractC10458p;
                        } else {
                            if (c6546d == null) {
                                c6546d = new C6546d(new AbstractC10458p[16]);
                            }
                            if (abstractC10458pM22160K0 != null) {
                                c6546d.m7099c(abstractC10458pM22160K0);
                                abstractC10458pM22160K0 = null;
                            }
                            c6546d.m7099c(abstractC10458p);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            abstractC10458pM22160K0 = AbstractC21690f.m22201f(c6546d);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo22154E0();

    /* JADX INFO: renamed from: F0 */
    public final AbstractC21678Y m22155F0(AbstractC21678Y abstractC21678Y) {
        C21658D c21658dM22009G = abstractC21678Y.f68819x0;
        C21658D c21658d = this.f68819x0;
        if (c21658dM22009G == c21658d) {
            AbstractC10458p abstractC10458pMo22159J0 = abstractC21678Y.mo22159J0();
            AbstractC10458p abstractC10458p = mo22159J0().f30960Y;
            if (!abstractC10458p.f30972y0) {
                AbstractC8111i5.m8592c("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30964q0) {
                if ((abstractC10458p2.f30962o0 & 2) != 0 && abstractC10458p2 == abstractC10458pMo22159J0) {
                    return abstractC21678Y;
                }
            }
            return this;
        }
        while (c21658dM22009G.f68660w0 > c21658d.f68660w0) {
            c21658dM22009G = c21658dM22009G.m22009G();
            AbstractC16544l.m18091d(c21658dM22009G);
        }
        C21658D c21658dM22009G2 = c21658d;
        while (c21658dM22009G2.f68660w0 > c21658dM22009G.f68660w0) {
            c21658dM22009G2 = c21658dM22009G2.m22009G();
            AbstractC16544l.m18091d(c21658dM22009G2);
        }
        while (c21658dM22009G != c21658dM22009G2) {
            c21658dM22009G = c21658dM22009G.m22009G();
            c21658dM22009G2 = c21658dM22009G2.m22009G();
            if (c21658dM22009G == null || c21658dM22009G2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c21658dM22009G2 == c21658d) {
            return this;
        }
        return c21658dM22009G == abstractC21678Y.f68819x0 ? abstractC21678Y : (C21715t) c21658dM22009G.f68638I0.f3468c;
    }

    /* JADX INFO: renamed from: G0 */
    public final long m22156G0(long j10, boolean z6) {
        if (z6 || !this.f68756r0) {
            long j11 = this.f68810I0;
            j10 = AbstractC8088f6.m8536b(C13800b.m15306g(j10) - ((int) (j11 >> 32)), C13800b.m15307h(j10) - ((int) (j11 & 4294967295L)));
        }
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        return interfaceC21687d0 != null ? interfaceC21687d0.mo541d(j10, true) : j10;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract AbstractC21669O mo22157H0();

    /* JADX INFO: renamed from: I0 */
    public final long m22158I0() {
        return this.f68805D0.mo7867r0(this.f68819x0.f68635F0.mo501d());
    }

    /* JADX INFO: renamed from: J0 */
    public abstract AbstractC10458p mo22159J0();

    /* JADX INFO: renamed from: K0 */
    public final AbstractC10458p m22160K0(int i10) {
        boolean zM22191h = AbstractC21679Z.m22191h(i10);
        AbstractC10458p abstractC10458pMo22159J0 = mo22159J0();
        if (!zM22191h && (abstractC10458pMo22159J0 = abstractC10458pMo22159J0.f30964q0) == null) {
            return null;
        }
        for (AbstractC10458p abstractC10458pM22161L0 = m22161L0(zM22191h); abstractC10458pM22161L0 != null && (abstractC10458pM22161L0.f30963p0 & i10) != 0; abstractC10458pM22161L0 = abstractC10458pM22161L0.f30965r0) {
            if ((abstractC10458pM22161L0.f30962o0 & i10) != 0) {
                return abstractC10458pM22161L0;
            }
            if (abstractC10458pM22161L0 == abstractC10458pMo22159J0) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public final AbstractC10458p m22161L0(boolean z6) {
        AbstractC10458p abstractC10458pMo22159J0;
        C1313k c1313k = this.f68819x0.f68638I0;
        if (((AbstractC21678Y) c1313k.f3469d) == this) {
            return (AbstractC10458p) c1313k.f3471f;
        }
        if (z6) {
            AbstractC21678Y abstractC21678Y = this.f68821z0;
            if (abstractC21678Y != null && (abstractC10458pMo22159J0 = abstractC21678Y.mo22159J0()) != null) {
                return abstractC10458pMo22159J0.f30965r0;
            }
        } else {
            AbstractC21678Y abstractC21678Y2 = this.f68821z0;
            if (abstractC21678Y2 != null) {
                return abstractC21678Y2.mo22159J0();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
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
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: M0 */
    public final void m22162M0(AbstractC10458p abstractC10458p, C21686d c21686d, long j10, C21713r c21713r, boolean z6, boolean z10) {
        if (abstractC10458p == null) {
            mo22164O0(c21686d, j10, c21713r, z6, z10);
            return;
        }
        c21713r.m22227j(abstractC10458p, -1.0f, z10, new C21676W(this, abstractC10458p, c21686d, j10, c21713r, z6, z10));
        AbstractC21678Y abstractC21678Y = abstractC10458p.f30967t0;
        if (abstractC21678Y != null) {
            AbstractC10458p abstractC10458pM22161L0 = abstractC21678Y.m22161L0(AbstractC21679Z.m22191h(16));
            if (abstractC10458pM22161L0 != null && abstractC10458pM22161L0.f30972y0) {
                AbstractC10458p abstractC10458p2 = abstractC10458pM22161L0.f30960Y;
                if (!abstractC10458p2.f30972y0) {
                    AbstractC8111i5.m8592c("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((abstractC10458p2.f30963p0 & 16) != 0) {
                    while (abstractC10458p2 != null) {
                        if ((abstractC10458p2.f30962o0 & 16) != 0) {
                            ?? M22201f = abstractC10458p2;
                            ?? c6546d = 0;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC21697i0) {
                                    if (((InterfaceC21697i0) M22201f).mo15565q0()) {
                                        return;
                                    }
                                } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i10 = 0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                    while (abstractC10458p3 != null) {
                                        if ((abstractC10458p3.f30962o0 & 16) != 0) {
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
                                M22201f = AbstractC21690f.m22201f(c6546d);
                            }
                        }
                        abstractC10458p2 = abstractC10458p2.f30965r0;
                    }
                }
            }
            c21713r.f68890q0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if (p1140z1.AbstractC21690f.m22203h(r21.m22226f(), p1140z1.AbstractC21690f.m22196a(r15, r23)) > 0) goto L50;
     */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22163N0(C21686d c21686d, long j10, C21713r c21713r, boolean z6, boolean z10) {
        InterfaceC21687d0 interfaceC21687d0;
        AbstractC10458p abstractC10458pM22160K0 = m22160K0(c21686d.m22195b());
        if (!AbstractC8088f6.m8537c(j10) || ((interfaceC21687d0 = this.f68817P0) != null && this.f68803B0 && !interfaceC21687d0.mo539b(j10))) {
            if (z6) {
                float fM22150A0 = m22150A0(j10, m22158I0());
                if (Float.isInfinite(fM22150A0) || Float.isNaN(fM22150A0)) {
                    return;
                }
                if (c21713r.f68888o0 != AbstractC17681o.m19381j(c21713r)) {
                    if (AbstractC21690f.m22203h(c21713r.m22226f(), AbstractC21690f.m22196a(fM22150A0, false)) <= 0) {
                        return;
                    }
                }
                boolean z11 = false;
                if (abstractC10458pM22160K0 == null) {
                    mo22164O0(c21686d, j10, c21713r, z6, false);
                    return;
                } else {
                    c21713r.m22227j(abstractC10458pM22160K0, fM22150A0, false, new C21677X(this, abstractC10458pM22160K0, c21686d, j10, c21713r, z6, z11, fM22150A0, 0));
                    return;
                }
            }
            return;
        }
        if (abstractC10458pM22160K0 == null) {
            mo22164O0(c21686d, j10, c21713r, z6, z10);
            return;
        }
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        if (fM15306g >= 0.0f && fM15307h >= 0.0f && fM15306g < mo21549L() && fM15307h < mo21548K()) {
            m22162M0(abstractC10458pM22160K0, c21686d, j10, c21713r, z6, z10);
            return;
        }
        float fM22150A1 = !z6 ? Float.POSITIVE_INFINITY : m22150A0(j10, m22158I0());
        if (!Float.isInfinite(fM22150A1) && !Float.isNaN(fM22150A1)) {
            if (c21713r.f68888o0 != AbstractC17681o.m19381j(c21713r)) {
            }
            c21713r.m22227j(abstractC10458pM22160K0, fM22150A1, z10, new C21677X(this, abstractC10458pM22160K0, c21686d, j10, c21713r, z6, z10, fM22150A1, 0));
            return;
        }
        m22175Z0(abstractC10458pM22160K0, c21686d, j10, c21713r, z6, z10, fM22150A1);
    }

    /* JADX INFO: renamed from: O0 */
    public void mo22164O0(C21686d c21686d, long j10, C21713r c21713r, boolean z6, boolean z10) {
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        if (abstractC21678Y != null) {
            abstractC21678Y.m22163N0(c21686d, abstractC21678Y.m22156G0(j10, true), c21713r, z6, z10);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m22165P0() {
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 != null) {
            interfaceC21687d0.invalidate();
            return;
        }
        AbstractC21678Y abstractC21678Y = this.f68821z0;
        if (abstractC21678Y != null) {
            abstractC21678Y.m22165P0();
        }
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: Q */
    public abstract void mo21552Q(long j10, float f10, C16308b c16308b);

    /* JADX INFO: renamed from: Q0 */
    public final boolean m22166Q0() {
        if (this.f68817P0 != null && this.f68807F0 <= 0.0f) {
            return true;
        }
        AbstractC21678Y abstractC21678Y = this.f68821z0;
        if (abstractC21678Y != null) {
            return abstractC21678Y.m22166Q0();
        }
        return false;
    }

    /* JADX INFO: renamed from: R0 */
    public final long m22167R0(InterfaceC21098s interfaceC21098s, long j10) {
        if (interfaceC21098s instanceof C21055I) {
            ((C21055I) interfaceC21098s).f66971Y.f68765x0.m22168S0();
            return ((C21055I) interfaceC21098s).m21519b(this, j10 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC21678Y abstractC21678YM22149a1 = m22149a1(interfaceC21098s);
        abstractC21678YM22149a1.m22168S0();
        AbstractC21678Y abstractC21678YM22155F0 = m22155F0(abstractC21678YM22149a1);
        while (abstractC21678YM22149a1 != abstractC21678YM22155F0) {
            j10 = abstractC21678YM22149a1.m22176b1(j10, true);
            abstractC21678YM22149a1 = abstractC21678YM22149a1.f68821z0;
            AbstractC16544l.m18091d(abstractC21678YM22149a1);
        }
        return m22182y0(abstractC21678YM22155F0, j10);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m22168S0() {
        C21665K c21665kM22060t = this.f68819x0.m22060t();
        int iM22064w = c21665kM22060t.f68729a.m22064w();
        if (iM22064w == 3 || iM22064w == 4) {
            if (c21665kM22060t.f68746r.f68709J0) {
                c21665kM22060t.m22111e(true);
            } else {
                c21665kM22060t.m22110d(true);
            }
        }
        if (iM22064w == 4) {
            C21663I c21663i = c21665kM22060t.f68747s;
            if (c21663i == null || !c21663i.f68686G0) {
                c21665kM22060t.m22112f(true);
            } else {
                c21665kM22060t.m22113g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v7, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: T0 */
    public final void m22169T0() {
        AbstractC10458p abstractC10458pMo22159J0;
        AbstractC10458p abstractC10458pM22161L0 = m22161L0(AbstractC21679Z.m22191h(128));
        if (abstractC10458pM22161L0 == null || (abstractC10458pM22161L0.f30960Y.f30963p0 & 128) == 0) {
            return;
        }
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            boolean zM22191h = AbstractC21679Z.m22191h(128);
            if (!zM22191h) {
                abstractC10458pMo22159J0 = mo22159J0().f30964q0;
                if (abstractC10458pMo22159J0 == null) {
                }
            }
            abstractC10458pMo22159J0 = mo22159J0();
            for (AbstractC10458p abstractC10458pM22161L1 = m22161L0(zM22191h); abstractC10458pM22161L1 != null && (abstractC10458pM22161L1.f30963p0 & 128) != 0; abstractC10458pM22161L1 = abstractC10458pM22161L1.f30965r0) {
                if ((abstractC10458pM22161L1.f30962o0 & 128) != 0) {
                    ?? c6546d = 0;
                    ?? M22201f = abstractC10458pM22161L1;
                    while (M22201f != 0) {
                        if (M22201f instanceof InterfaceC21717v) {
                            ((InterfaceC21717v) M22201f).mo11281q(this.f66983o0);
                        } else if ((M22201f.f30962o0 & 128) != 0 && (M22201f instanceof AbstractC21706n)) {
                            AbstractC10458p abstractC10458p = ((AbstractC21706n) M22201f).f68881A0;
                            int i10 = 0;
                            M22201f = M22201f;
                            c6546d = c6546d;
                            while (abstractC10458p != null) {
                                if ((abstractC10458p.f30962o0 & 128) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        c6546d = c6546d;
                                        M22201f = abstractC10458p;
                                    } else {
                                        if (c6546d == 0) {
                                            c6546d = new C6546d(new AbstractC10458p[16]);
                                        }
                                        if (M22201f != 0) {
                                            c6546d.m7099c(M22201f);
                                            M22201f = 0;
                                        }
                                        c6546d.m7099c(abstractC10458p);
                                    }
                                }
                                abstractC10458p = abstractC10458p.f30965r0;
                                M22201f = M22201f;
                                c6546d = c6546d;
                            }
                            if (i10 == 1) {
                            }
                        }
                        M22201f = AbstractC21690f.m22201f(c6546d);
                    }
                }
                if (abstractC10458pM22161L1 != abstractC10458pMo22159J0) {
                }
            }
        } finally {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: U0 */
    public final void m22170U0() {
        boolean zM22191h = AbstractC21679Z.m22191h(128);
        AbstractC10458p abstractC10458pMo22159J0 = mo22159J0();
        if (!zM22191h && (abstractC10458pMo22159J0 = abstractC10458pMo22159J0.f30964q0) == null) {
            return;
        }
        for (AbstractC10458p abstractC10458pM22161L0 = m22161L0(zM22191h); abstractC10458pM22161L0 != null && (abstractC10458pM22161L0.f30963p0 & 128) != 0; abstractC10458pM22161L0 = abstractC10458pM22161L0.f30965r0) {
            if ((abstractC10458pM22161L0.f30962o0 & 128) != 0) {
                ?? M22201f = abstractC10458pM22161L0;
                ?? c6546d = 0;
                while (M22201f != 0) {
                    if (M22201f instanceof InterfaceC21717v) {
                        ((InterfaceC21717v) M22201f).mo11280l0(this);
                    } else if ((M22201f.f30962o0 & 128) != 0 && (M22201f instanceof AbstractC21706n)) {
                        AbstractC10458p abstractC10458p = ((AbstractC21706n) M22201f).f68881A0;
                        int i10 = 0;
                        M22201f = M22201f;
                        c6546d = c6546d;
                        while (abstractC10458p != null) {
                            if ((abstractC10458p.f30962o0 & 128) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    c6546d = c6546d;
                                    M22201f = abstractC10458p;
                                } else {
                                    if (c6546d == 0) {
                                        c6546d = new C6546d(new AbstractC10458p[16]);
                                    }
                                    if (M22201f != 0) {
                                        c6546d.m7099c(M22201f);
                                        M22201f = 0;
                                    }
                                    c6546d.m7099c(abstractC10458p);
                                }
                            }
                            abstractC10458p = abstractC10458p.f30965r0;
                            M22201f = M22201f;
                            c6546d = c6546d;
                        }
                        if (i10 == 1) {
                        }
                    }
                    M22201f = AbstractC21690f.m22201f(c6546d);
                }
            }
            if (abstractC10458pM22161L0 == abstractC10458pMo22159J0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public abstract void mo22171V0(InterfaceC14362r interfaceC14362r, C16308b c16308b);

    /* JADX INFO: renamed from: W0 */
    public final void m22172W0(long j10, float f10, InterfaceC1436k interfaceC1436k, C16308b c16308b) {
        C21658D c21658d = this.f68819x0;
        if (c16308b == null) {
            if (this.f68818Q0 != null) {
                this.f68818Q0 = null;
                m22179e1(null, false);
            }
            m22179e1(interfaceC1436k, false);
        } else {
            if (interfaceC1436k != null) {
                AbstractC8111i5.m8591b("both ways to create layers shouldn't be used together");
                throw null;
            }
            if (this.f68818Q0 != c16308b) {
                this.f68818Q0 = null;
                m22179e1(null, false);
                this.f68818Q0 = c16308b;
            }
            if (this.f68817P0 == null) {
                AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC21661G.m22082a(c21658d);
                C20567q c20567q = this.f68814M0;
                C20714I0 c20714i0 = this.f68815N0;
                InterfaceC21687d0 interfaceC21687d0M11339i = androidComposeView.m11339i(c20567q, c20714i0, c16308b);
                interfaceC21687d0M11339i.mo543f(this.f66983o0);
                interfaceC21687d0M11339i.mo547j(j10);
                this.f68817P0 = interfaceC21687d0M11339i;
                c21658d.f68641L0 = true;
                c20714i0.invoke();
            }
        }
        if (!C7543h.m7880b(this.f68810I0, j10)) {
            this.f68810I0 = j10;
            c21658d.m22060t().f68746r.m22101h0();
            InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
            if (interfaceC21687d0 != null) {
                interfaceC21687d0.mo547j(j10);
            } else {
                AbstractC21678Y abstractC21678Y = this.f68821z0;
                if (abstractC21678Y != null) {
                    abstractC21678Y.m22165P0();
                }
            }
            AbstractC21668N.m22116s0(this);
            AndroidComposeView androidComposeView2 = c21658d.f68658u0;
            if (androidComposeView2 != null) {
                androidComposeView2.m11350x(c21658d);
            }
        }
        this.f68811J0 = f10;
        if (this.f68758t0) {
            return;
        }
        m22118e0(new C21695h0(mo22123n0(), this));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f68819x0.f68633D0.mo7863X();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m22173X0(C10235r c10235r, boolean z6, boolean z10) {
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 != null) {
            if (this.f68803B0) {
                if (z10) {
                    long jM22158I0 = m22158I0();
                    float fM15333e = C13803e.m15333e(jM22158I0) / 2.0f;
                    float fM15331c = C13803e.m15331c(jM22158I0) / 2.0f;
                    long j10 = this.f66983o0;
                    c10235r.m10794a(-fM15333e, -fM15331c, ((int) (j10 >> 32)) + fM15333e, ((int) (j10 & 4294967295L)) + fM15331c);
                } else if (z6) {
                    long j11 = this.f66983o0;
                    c10235r.m10794a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (c10235r.m10795b()) {
                    return;
                }
            }
            interfaceC21687d0.mo545h(c10235r, false);
        }
        long j12 = this.f68810I0;
        float f10 = (int) (j12 >> 32);
        c10235r.f30390b += f10;
        c10235r.f30392d += f10;
        float f11 = (int) (j12 & 4294967295L);
        c10235r.f30391c += f11;
        c10235r.f30393e += f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: Y0 */
    public final void m22174Y0(InterfaceC21058L interfaceC21058L) {
        AbstractC21678Y abstractC21678Y;
        InterfaceC21058L interfaceC21058L2 = this.f68808G0;
        if (interfaceC21058L != interfaceC21058L2) {
            this.f68808G0 = interfaceC21058L;
            C21658D c21658d = this.f68819x0;
            if (interfaceC21058L2 == null || interfaceC21058L.getWidth() != interfaceC21058L2.getWidth() || interfaceC21058L.getHeight() != interfaceC21058L2.getHeight()) {
                int width = interfaceC21058L.getWidth();
                int height = interfaceC21058L.getHeight();
                InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
                if (interfaceC21687d0 != null) {
                    interfaceC21687d0.mo543f(AbstractC9113C4.m9643a(width, height));
                } else if (c21658d.m22025W() && (abstractC21678Y = this.f68821z0) != null) {
                    abstractC21678Y.m22165P0();
                }
                m21553S(AbstractC9113C4.m9643a(width, height));
                if (this.f68804C0 != null) {
                    m22180f1(false);
                }
                boolean zM22191h = AbstractC21679Z.m22191h(4);
                AbstractC10458p abstractC10458pMo22159J0 = mo22159J0();
                if (zM22191h || (abstractC10458pMo22159J0 = abstractC10458pMo22159J0.f30964q0) != null) {
                    for (AbstractC10458p abstractC10458pM22161L0 = m22161L0(zM22191h); abstractC10458pM22161L0 != null && (abstractC10458pM22161L0.f30963p0 & 4) != 0; abstractC10458pM22161L0 = abstractC10458pM22161L0.f30965r0) {
                        if ((abstractC10458pM22161L0.f30962o0 & 4) != 0) {
                            ?? M22201f = abstractC10458pM22161L0;
                            ?? c6546d = 0;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC21708o) {
                                    ((InterfaceC21708o) M22201f).mo427L();
                                } else if ((M22201f.f30962o0 & 4) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p = ((AbstractC21706n) M22201f).f68881A0;
                                    int i10 = 0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                    while (abstractC10458p != null) {
                                        if ((abstractC10458p.f30962o0 & 4) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                c6546d = c6546d;
                                                M22201f = abstractC10458p;
                                            } else {
                                                if (c6546d == 0) {
                                                    c6546d = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d.m7099c(abstractC10458p);
                                            }
                                        }
                                        abstractC10458p = abstractC10458p.f30965r0;
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                M22201f = AbstractC21690f.m22201f(c6546d);
                            }
                        }
                        if (abstractC10458pM22161L0 == abstractC10458pMo22159J0) {
                            break;
                        }
                    }
                }
                AndroidComposeView androidComposeView = c21658d.f68658u0;
                if (androidComposeView != null) {
                    androidComposeView.m11350x(c21658d);
                }
            }
            LinkedHashMap linkedHashMap = this.f68809H0;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && interfaceC21058L.mo19805a().isEmpty()) || AbstractC16544l.m18089b(interfaceC21058L.mo19805a(), this.f68809H0)) {
                return;
            }
            c21658d.m22060t().f68746r.f68706G0.m22077f();
            LinkedHashMap linkedHashMap2 = this.f68809H0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f68809H0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC21058L.mo19805a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: Z0 */
    public final void m22175Z0(AbstractC10458p abstractC10458p, C21686d c21686d, long j10, C21713r c21713r, boolean z6, boolean z10, float f10) {
        boolean z11;
        if (abstractC10458p == null) {
            mo22164O0(c21686d, j10, c21713r, z6, z10);
            return;
        }
        switch (c21686d.f68831Y) {
            case 1:
                ?? c6546d = 0;
                ?? M22201f = abstractC10458p;
                while (true) {
                    int i10 = 0;
                    if (M22201f == 0) {
                        z11 = false;
                    } else {
                        if (M22201f instanceof InterfaceC21697i0) {
                            ((InterfaceC21697i0) M22201f).mo15563N();
                        } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                            AbstractC10458p abstractC10458p2 = ((AbstractC21706n) M22201f).f68881A0;
                            M22201f = M22201f;
                            c6546d = c6546d;
                            while (abstractC10458p2 != null) {
                                if ((abstractC10458p2.f30962o0 & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        c6546d = c6546d;
                                        M22201f = abstractC10458p2;
                                    } else {
                                        if (c6546d == 0) {
                                            c6546d = new C6546d(new AbstractC10458p[16]);
                                        }
                                        if (M22201f != 0) {
                                            c6546d.m7099c(M22201f);
                                            M22201f = 0;
                                        }
                                        c6546d.m7099c(abstractC10458p2);
                                    }
                                }
                                abstractC10458p2 = abstractC10458p2.f30965r0;
                                M22201f = M22201f;
                                c6546d = c6546d;
                            }
                            if (i10 == 1) {
                            }
                        }
                        M22201f = AbstractC21690f.m22201f(c6546d);
                    }
                    break;
                }
                break;
            default:
                z11 = false;
                break;
        }
        if (!z11) {
            m22175Z0(AbstractC21690f.m22200e(abstractC10458p, c21686d.m22195b()), c21686d, j10, c21713r, z6, z10, f10);
            return;
        }
        C21677X c21677x = new C21677X(this, abstractC10458p, c21686d, j10, c21713r, z6, z10, f10, 1);
        if (c21713r.f68888o0 == AbstractC17681o.m19381j(c21713r)) {
            c21713r.m22227j(abstractC10458p, f10, z10, c21677x);
            if (c21713r.f68888o0 + 1 == AbstractC17681o.m19381j(c21713r)) {
                c21713r.m22228m();
                return;
            }
            return;
        }
        long jM22226f = c21713r.m22226f();
        int i11 = c21713r.f68888o0;
        c21713r.f68888o0 = AbstractC17681o.m19381j(c21713r);
        c21713r.m22227j(abstractC10458p, f10, z10, c21677x);
        if (c21713r.f68888o0 + 1 < AbstractC17681o.m19381j(c21713r) && AbstractC21690f.m22203h(jM22226f, c21713r.m22226f()) > 0) {
            int i12 = c21713r.f68888o0 + 1;
            int i13 = i11 + 1;
            Object[] objArr = c21713r.f68886Y;
            AbstractC17678l.m19304k(i13, i12, c21713r.f68889p0, objArr, objArr);
            long[] jArr = c21713r.f68887Z;
            System.arraycopy(jArr, i12, jArr, i13, c21713r.f68889p0 - i12);
            c21713r.f68888o0 = ((c21713r.f68889p0 + i11) - c21713r.f68888o0) - 1;
        }
        c21713r.m22228m();
        c21713r.f68888o0 = i11;
    }

    /* JADX INFO: renamed from: b1 */
    public final long m22176b1(long j10, boolean z6) {
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 != null) {
            j10 = interfaceC21687d0.mo541d(j10, false);
        }
        if (!z6 && this.f68756r0) {
            return j10;
        }
        long j11 = this.f68810I0;
        return AbstractC8088f6.m8536b(C13800b.m15306g(j10) + ((int) (j11 >> 32)), C13800b.m15307h(j10) + ((int) (j11 & 4294967295L)));
    }

    /* JADX INFO: renamed from: c1 */
    public final void m22177c1(AbstractC21678Y abstractC21678Y, float[] fArr) {
        if (AbstractC16544l.m18089b(abstractC21678Y, this)) {
            return;
        }
        AbstractC21678Y abstractC21678Y2 = this.f68821z0;
        AbstractC16544l.m18091d(abstractC21678Y2);
        abstractC21678Y2.m22177c1(abstractC21678Y, fArr);
        if (!C7543h.m7880b(this.f68810I0, 0L)) {
            float[] fArr2 = f68799T0;
            C14328F.m15605d(fArr2);
            long j10 = this.f68810I0;
            C14328F.m15609h(fArr2, -((int) (j10 >> 32)), -((int) (j10 & 4294967295L)), 0.0f);
            C14328F.m15608g(fArr, fArr2);
        }
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 != null) {
            interfaceC21687d0.mo546i(fArr);
        }
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: d */
    public final long mo21520d(long j10) {
        long jMo21517D = mo21517D(j10);
        AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC21661G.m22082a(this.f68819x0);
        androidComposeView.m11331B();
        return C14328F.m15603b(jMo21517D, androidComposeView.f32786a1);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m22178d1(AbstractC21678Y abstractC21678Y, float[] fArr) {
        AbstractC21678Y abstractC21678Y2 = this;
        while (!abstractC21678Y2.equals(abstractC21678Y)) {
            InterfaceC21687d0 interfaceC21687d0 = abstractC21678Y2.f68817P0;
            if (interfaceC21687d0 != null) {
                interfaceC21687d0.mo538a(fArr);
            }
            long j10 = abstractC21678Y2.f68810I0;
            if (!C7543h.m7880b(j10, 0L)) {
                float[] fArr2 = f68799T0;
                C14328F.m15605d(fArr2);
                C14328F.m15609h(fArr2, (int) (j10 >> 32), (int) (j10 & 4294967295L), 0.0f);
                C14328F.m15608g(fArr, fArr2);
            }
            abstractC21678Y2 = abstractC21678Y2.f68821z0;
            AbstractC16544l.m18091d(abstractC21678Y2);
        }
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: e */
    public final long mo21521e(InterfaceC21098s interfaceC21098s, long j10) {
        return m22167R0(interfaceC21098s, j10);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m22179e1(InterfaceC1436k interfaceC1436k, boolean z6) {
        AndroidComposeView androidComposeView;
        if (!(interfaceC1436k == null || this.f68818Q0 == null)) {
            AbstractC8111i5.m8591b("layerBlock can't be provided when explicitLayer is provided");
            throw null;
        }
        C21658D c21658d = this.f68819x0;
        boolean z10 = (!z6 && this.f68804C0 == interfaceC1436k && AbstractC16544l.m18089b(this.f68805D0, c21658d.f68633D0) && this.f68806E0 == c21658d.f68634E0) ? false : true;
        this.f68805D0 = c21658d.f68633D0;
        this.f68806E0 = c21658d.f68634E0;
        boolean zM22024V = c21658d.m22024V();
        C20714I0 c20714i0 = this.f68815N0;
        if (!zM22024V || interfaceC1436k == null) {
            this.f68804C0 = null;
            InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
            if (interfaceC21687d0 != null) {
                interfaceC21687d0.destroy();
                c21658d.f68641L0 = true;
                c20714i0.invoke();
                if (mo22159J0().f30972y0 && (androidComposeView = c21658d.f68658u0) != null) {
                    androidComposeView.m11350x(c21658d);
                }
            }
            this.f68817P0 = null;
            this.f68816O0 = false;
            return;
        }
        this.f68804C0 = interfaceC1436k;
        if (this.f68817P0 != null) {
            if (z10) {
                m22180f1(true);
                return;
            }
            return;
        }
        InterfaceC21687d0 interfaceC21687d0M11339i = ((AndroidComposeView) AbstractC21661G.m22082a(c21658d)).m11339i(this.f68814M0, c20714i0, null);
        interfaceC21687d0M11339i.mo543f(this.f66983o0);
        interfaceC21687d0M11339i.mo547j(this.f68810I0);
        this.f68817P0 = interfaceC21687d0M11339i;
        m22180f1(true);
        c21658d.f68641L0 = true;
        c20714i0.invoke();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m22180f1(boolean z6) {
        AndroidComposeView androidComposeView;
        if (this.f68818Q0 != null) {
            return;
        }
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 == null) {
            if (this.f68804C0 == null) {
                return;
            }
            AbstractC8111i5.m8592c("null layer with a non-null layerBlock");
            throw null;
        }
        InterfaceC1436k interfaceC1436k = this.f68804C0;
        if (interfaceC1436k == null) {
            AbstractC8111i5.m8593d("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        C14336N c14336n = f68797R0;
        c14336n.m15655g(1.0f);
        c14336n.m15656h(1.0f);
        c14336n.m15649a(1.0f);
        c14336n.m15661o(0.0f);
        c14336n.m15662p(0.0f);
        c14336n.m15657j(0.0f);
        long j10 = AbstractC14325C.f44961a;
        c14336n.m15650b(j10);
        c14336n.m15659l(j10);
        c14336n.m15652d(0.0f);
        c14336n.m15653e(0.0f);
        c14336n.m15654f(0.0f);
        if (c14336n.f44996y0 != 8.0f) {
            c14336n.f44984Y |= 2048;
            c14336n.f44996y0 = 8.0f;
        }
        c14336n.m15660n(C14343V.f45023b);
        c14336n.m15658k(AbstractC14334L.f44973a);
        c14336n.m15651c(false);
        if (!AbstractC16544l.m18089b(null, null)) {
            c14336n.f44984Y |= 131072;
        }
        if (!AbstractC14334L.m15640r(c14336n.f44979C0, 0)) {
            c14336n.f44984Y |= 32768;
            c14336n.f44979C0 = 0;
        }
        c14336n.f44980D0 = 9205357640488583168L;
        c14336n.f44983G0 = null;
        c14336n.f44984Y = 0;
        C21658D c21658d = this.f68819x0;
        c14336n.f44981E0 = c21658d.f68633D0;
        c14336n.f44982F0 = c21658d.f68634E0;
        c14336n.f44980D0 = AbstractC9113C4.m9645c(this.f66983o0);
        AbstractC21661G.m22082a(c21658d).getSnapshotObserver().m22222a(this, C21688e.f68835q0, new C16886i0(19, interfaceC1436k));
        C21716u c21716u = this.f68813L0;
        if (c21716u == null) {
            c21716u = new C21716u();
            this.f68813L0 = c21716u;
        }
        c21716u.f68894a = c14336n.f44985Z;
        c21716u.f68895b = c14336n.f44986o0;
        c21716u.f68896c = c14336n.f44988q0;
        c21716u.f68897d = c14336n.f44989r0;
        c21716u.f68898e = c14336n.f44993v0;
        c21716u.f68899f = c14336n.f44994w0;
        c21716u.f68900g = c14336n.f44995x0;
        c21716u.f68901h = c14336n.f44996y0;
        c21716u.f68902i = c14336n.f44997z0;
        interfaceC21687d0.mo544g(c14336n);
        this.f68803B0 = c14336n.f44978B0;
        this.f68807F0 = c14336n.f44987p0;
        if (!z6 || (androidComposeView = c21658d.f68658u0) == null) {
            return;
        }
        androidComposeView.m11350x(c21658d);
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: g0 */
    public final AbstractC21668N mo22119g0() {
        return this.f68820y0;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f68819x0.f68633D0.getDensity();
    }

    @Override // p1095x1.InterfaceC21095p
    public final EnumC7546k getLayoutDirection() {
        return this.f68819x0.f68634E0;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: h */
    public final boolean mo21522h() {
        return mo22159J0().f30972y0;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: j */
    public final void mo21523j(float[] fArr) {
        Owner ownerM22082a = AbstractC21661G.m22082a(this.f68819x0);
        m22178d1(m22149a1(AbstractC21075b0.m21568i(this)), fArr);
        AndroidComposeView androidComposeView = (AndroidComposeView) ownerM22082a;
        androidComposeView.m11331B();
        C14328F.m15608g(fArr, androidComposeView.f32786a1);
        float fM15306g = C13800b.m15306g(androidComposeView.f32790e1);
        float fM15307h = C13800b.m15307h(androidComposeView.f32790e1);
        float[] fArr2 = androidComposeView.f32785Z0;
        C14328F.m15605d(fArr2);
        C14328F.m15609h(fArr2, fM15306g, fM15307h, 0.0f);
        AbstractC0240d0.m804o(fArr, fArr2);
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: j0 */
    public final boolean mo22121j0() {
        return this.f68808G0 != null;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: k */
    public final long mo21524k() {
        return this.f66983o0;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: l0 */
    public final C21658D mo22122l0() {
        return this.f68819x0;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: n */
    public final void mo21525n(InterfaceC21098s interfaceC21098s, float[] fArr) {
        AbstractC21678Y abstractC21678YM22149a1 = m22149a1(interfaceC21098s);
        abstractC21678YM22149a1.m22168S0();
        AbstractC21678Y abstractC21678YM22155F0 = m22155F0(abstractC21678YM22149a1);
        C14328F.m15605d(fArr);
        abstractC21678YM22149a1.m22178d1(abstractC21678YM22155F0, fArr);
        m22177c1(abstractC21678YM22155F0, fArr);
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC21058L mo22123n0() {
        InterfaceC21058L interfaceC21058L = this.f68808G0;
        if (interfaceC21058L != null) {
            return interfaceC21058L;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: p0 */
    public final AbstractC21668N mo22124p0() {
        return this.f68821z0;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: q0 */
    public final long mo22125q0() {
        return this.f68810I0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // p1095x1.AbstractC21069X, p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: t */
    public final Object mo21534t() {
        C21658D c21658d = this.f68819x0;
        if (!c21658d.f68638I0.m2020g(64)) {
            return null;
        }
        mo22159J0();
        Object objMo19470b = null;
        for (AbstractC10458p abstractC10458p = (C21703l0) c21658d.f68638I0.f3470e; abstractC10458p != null; abstractC10458p = abstractC10458p.f30964q0) {
            if ((abstractC10458p.f30962o0 & 64) != 0) {
                ?? M22201f = abstractC10458p;
                ?? c6546d = 0;
                while (M22201f != 0) {
                    if (M22201f instanceof InterfaceC21693g0) {
                        objMo19470b = ((InterfaceC21693g0) M22201f).mo19470b(c21658d.f68633D0, objMo19470b);
                    } else if ((M22201f.f30962o0 & 64) != 0 && (M22201f instanceof AbstractC21706n)) {
                        AbstractC10458p abstractC10458p2 = ((AbstractC21706n) M22201f).f68881A0;
                        int i10 = 0;
                        M22201f = M22201f;
                        c6546d = c6546d;
                        while (abstractC10458p2 != null) {
                            if ((abstractC10458p2.f30962o0 & 64) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    c6546d = c6546d;
                                    M22201f = abstractC10458p2;
                                } else {
                                    if (c6546d == 0) {
                                        c6546d = new C6546d(new AbstractC10458p[16]);
                                    }
                                    if (M22201f != 0) {
                                        c6546d.m7099c(M22201f);
                                        M22201f = 0;
                                    }
                                    c6546d.m7099c(abstractC10458p2);
                                }
                            }
                            abstractC10458p2 = abstractC10458p2.f30965r0;
                            M22201f = M22201f;
                            c6546d = c6546d;
                        }
                        if (i10 == 1) {
                        }
                    }
                    M22201f = AbstractC21690f.m22201f(c6546d);
                }
            }
        }
        return objMo19470b;
    }

    @Override // p1140z1.InterfaceC21689e0
    /* JADX INFO: renamed from: u */
    public final boolean mo874u() {
        return (this.f68817P0 == null || this.f68802A0 || !this.f68819x0.m22024V()) ? false : true;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: u0 */
    public final void mo22126u0() {
        C16308b c16308b = this.f68818Q0;
        if (c16308b != null) {
            mo21552Q(this.f68810I0, this.f68811J0, c16308b);
        } else {
            mo21551N(this.f68810I0, this.f68811J0, this.f68804C0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m22181w0(AbstractC21678Y abstractC21678Y, C10235r c10235r, boolean z6) {
        if (abstractC21678Y == this) {
            return;
        }
        AbstractC21678Y abstractC21678Y2 = this.f68821z0;
        if (abstractC21678Y2 != null) {
            abstractC21678Y2.m22181w0(abstractC21678Y, c10235r, z6);
        }
        long j10 = this.f68810I0;
        float f10 = (int) (j10 >> 32);
        c10235r.f30390b -= f10;
        c10235r.f30392d -= f10;
        float f11 = (int) (j10 & 4294967295L);
        c10235r.f30391c -= f11;
        c10235r.f30393e -= f11;
        InterfaceC21687d0 interfaceC21687d0 = this.f68817P0;
        if (interfaceC21687d0 != null) {
            interfaceC21687d0.mo545h(c10235r, true);
            if (this.f68803B0 && z6) {
                long j11 = this.f66983o0;
                c10235r.m10794a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
            }
        }
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: x */
    public final InterfaceC21098s mo21527x() {
        if (mo22159J0().f30972y0) {
            m22168S0();
            return ((AbstractC21678Y) this.f68819x0.f68638I0.f3469d).f68821z0;
        }
        AbstractC8111i5.m8592c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: y */
    public final C13801c mo21528y(InterfaceC21098s interfaceC21098s, boolean z6) {
        if (!mo22159J0().f30972y0) {
            AbstractC8111i5.m8592c("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC21098s.mo21522h()) {
            AbstractC8111i5.m8592c("LayoutCoordinates " + interfaceC21098s + " is not attached!");
            throw null;
        }
        AbstractC21678Y abstractC21678YM22149a1 = m22149a1(interfaceC21098s);
        abstractC21678YM22149a1.m22168S0();
        AbstractC21678Y abstractC21678YM22155F0 = m22155F0(abstractC21678YM22149a1);
        C10235r c10235r = this.f68812K0;
        if (c10235r == null) {
            c10235r = new C10235r();
            c10235r.f30390b = 0.0f;
            c10235r.f30391c = 0.0f;
            c10235r.f30392d = 0.0f;
            c10235r.f30393e = 0.0f;
            this.f68812K0 = c10235r;
        }
        c10235r.f30390b = 0.0f;
        c10235r.f30391c = 0.0f;
        c10235r.f30392d = (int) (interfaceC21098s.mo21524k() >> 32);
        c10235r.f30393e = (int) (interfaceC21098s.mo21524k() & 4294967295L);
        while (abstractC21678YM22149a1 != abstractC21678YM22155F0) {
            abstractC21678YM22149a1.m22173X0(c10235r, z6, false);
            if (c10235r.m10795b()) {
                return C13801c.f43585e;
            }
            abstractC21678YM22149a1 = abstractC21678YM22149a1.f68821z0;
            AbstractC16544l.m18091d(abstractC21678YM22149a1);
        }
        m22181w0(abstractC21678YM22155F0, c10235r, z6);
        return new C13801c(c10235r.f30390b, c10235r.f30391c, c10235r.f30392d, c10235r.f30393e);
    }

    /* JADX INFO: renamed from: y0 */
    public final long m22182y0(AbstractC21678Y abstractC21678Y, long j10) {
        if (abstractC21678Y == this) {
            return j10;
        }
        AbstractC21678Y abstractC21678Y2 = this.f68821z0;
        return (abstractC21678Y2 == null || AbstractC16544l.m18089b(abstractC21678Y, abstractC21678Y2)) ? m22156G0(j10, true) : m22156G0(abstractC21678Y2.m22182y0(abstractC21678Y, j10), true);
    }

    /* JADX INFO: renamed from: z0 */
    public final long m22183z0(long j10) {
        return AbstractC8112i6.m8603a(Math.max(0.0f, (C13803e.m15333e(j10) - mo21549L()) / 2.0f), Math.max(0.0f, (C13803e.m15331c(j10) - mo21548K()) / 2.0f));
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: q */
    public final long mo21526q(long j10) {
        if (mo22159J0().f30972y0) {
            InterfaceC21098s interfaceC21098sM21568i = AbstractC21075b0.m21568i(this);
            AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC21661G.m22082a(this.f68819x0);
            androidComposeView.m11331B();
            return m22167R0(interfaceC21098sM21568i, C13800b.m15310k(C14328F.m15603b(j10, androidComposeView.f32787b1), interfaceC21098sM21568i.mo21517D(0L)));
        }
        AbstractC8111i5.m8592c(tpXhEMGxfXFVSh.bQYkTZpklfrBYv);
        throw null;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC21098s mo22120h0() {
        return this;
    }
}
