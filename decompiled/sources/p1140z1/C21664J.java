package p1140z1;

import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p045Bj.C1313k;
import p049Bm.InterfaceC1436k;
import p1039ud.C20198o;
import p1071w0.AbstractC20734X;
import p1071w0.C20714I0;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p1095x1.InterfaceC21056J;
import p1139z0.C21638r0;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p492U1.C7536a;
import p492U1.C7543h;
import p492U1.C7545j;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9113C4;
import p843k1.C16308b;

/* JADX INFO: renamed from: z1.J */
/* JADX INFO: loaded from: classes.dex */
public final class C21664J extends AbstractC21069X implements InterfaceC21056J, InterfaceC21680a, InterfaceC21673T {

    /* JADX INFO: renamed from: A0 */
    public C16308b f68700A0;

    /* JADX INFO: renamed from: B0 */
    public float f68701B0;

    /* JADX INFO: renamed from: D0 */
    public Object f68703D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f68704E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f68705F0;

    /* JADX INFO: renamed from: J0 */
    public boolean f68709J0;

    /* JADX INFO: renamed from: L0 */
    public float f68711L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f68712M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC1436k f68713N0;

    /* JADX INFO: renamed from: O0 */
    public C16308b f68714O0;

    /* JADX INFO: renamed from: Q0 */
    public float f68716Q0;

    /* JADX INFO: renamed from: R0 */
    public final C21638r0 f68717R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f68718S0;

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ C21665K f68719T0;

    /* JADX INFO: renamed from: r0 */
    public boolean f68720r0;

    /* JADX INFO: renamed from: u0 */
    public boolean f68723u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f68724v0;

    /* JADX INFO: renamed from: x0 */
    public boolean f68726x0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC1436k f68728z0;

    /* JADX INFO: renamed from: s0 */
    public int f68721s0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t0 */
    public int f68722t0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: w0 */
    public int f68725w0 = 3;

    /* JADX INFO: renamed from: y0 */
    public long f68727y0 = 0;

    /* JADX INFO: renamed from: C0 */
    public boolean f68702C0 = true;

    /* JADX INFO: renamed from: G0 */
    public final C21659E f68706G0 = new C21659E(this, 0);

    /* JADX INFO: renamed from: H0 */
    public final C6546d f68707H0 = new C6546d(new C21664J[16]);

    /* JADX INFO: renamed from: I0 */
    public boolean f68708I0 = true;

    /* JADX INFO: renamed from: K0 */
    public final C20714I0 f68710K0 = new C20714I0(this, 10);

    /* JADX INFO: renamed from: P0 */
    public long f68715P0 = 0;

    public C21664J(C21665K c21665k) {
        this.f68719T0 = c21665k;
        this.f68717R0 = new C21638r0(c21665k, 3, this);
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: A */
    public final boolean mo22083A() {
        return this.f68704E0;
    }

    @Override // p1140z1.InterfaceC21673T
    /* JADX INFO: renamed from: C */
    public final void mo22084C(boolean z6) {
        C21665K c21665k = this.f68719T0;
        boolean z10 = c21665k.m22107a().f68756r0;
        if (z6 != z10) {
            c21665k.m22107a().f68756r0 = z10;
            this.f68718S0 = true;
        }
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: E */
    public final void mo22085E() {
        C21658D.m22001s0(this.f68719T0.f68729a, false, 7);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: G */
    public final int mo21529G(int i10) {
        m22102j0();
        return this.f68719T0.m22107a().mo21529G(i10);
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: H */
    public final int mo21547H(C21094o c21094o) {
        C21665K c21665k = this.f68719T0;
        C21658D c21658dM22009G = c21665k.f68729a.m22009G();
        int iM22064w = c21658dM22009G != null ? c21658dM22009G.m22064w() : 0;
        C21659E c21659e = this.f68706G0;
        if (iM22064w == 1) {
            c21659e.f68666c = true;
        } else {
            C21658D c21658dM22009G2 = c21665k.f68729a.m22009G();
            if ((c21658dM22009G2 != null ? c21658dM22009G2.m22064w() : 0) == 3) {
                c21659e.f68667d = true;
            }
        }
        this.f68726x0 = true;
        int iMo21547H = c21665k.m22107a().mo21547H(c21094o);
        this.f68726x0 = false;
        return iMo21547H;
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: K */
    public final int mo21548K() {
        return this.f68719T0.m22107a().mo21548K();
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: L */
    public final int mo21549L() {
        return this.f68719T0.m22107a().mo21549L();
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: N */
    public final void mo21551N(long j10, float f10, InterfaceC1436k interfaceC1436k) {
        m22105p0(j10, f10, interfaceC1436k, null);
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: Q */
    public final void mo21552Q(long j10, float f10, C16308b c16308b) {
        m22105p0(j10, f10, null, c16308b);
    }

    /* JADX INFO: renamed from: V */
    public final List m22098V() {
        C21665K c21665k = this.f68719T0;
        c21665k.f68729a.m22071z0();
        boolean z6 = this.f68708I0;
        C6546d c6546d = this.f68707H0;
        if (!z6) {
            return c6546d.m7103h();
        }
        C21658D c21658d = c21665k.f68729a;
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (c6546d.f21184o0 <= i11) {
                    c6546d.m7099c(c21658d2.m22060t().f68746r);
                } else {
                    C21664J c21664j = c21658d2.m22060t().f68746r;
                    Object[] objArr2 = c6546d.f21182Y;
                    Object obj = objArr2[i11];
                    objArr2[i11] = c21664j;
                }
                i11++;
            } while (i11 < i10);
        }
        c6546d.m7112q(((C6543a) c21658d.m22054p()).f21176Y.f21184o0, c6546d.f21184o0);
        this.f68708I0 = false;
        return c6546d.m7103h();
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: a */
    public final C21659E mo22087a() {
        return this.f68706G0;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: b */
    public final int mo21530b(int i10) {
        m22102j0();
        return this.f68719T0.m22107a().mo21530b(i10);
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: c */
    public final void mo22088c(C20198o c20198o) {
        C6546d c6546dM22014L = this.f68719T0.f68729a.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                c20198o.invoke(((C21658D) objArr[i11]).m22060t().f68746r);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m22099e0() {
        boolean z6 = this.f68704E0;
        this.f68704E0 = true;
        C21658D c21658d = this.f68719T0.f68729a;
        if (!z6) {
            if (c21658d.m22004B()) {
                C21658D.m22001s0(c21658d, true, 6);
            } else if (c21658d.m22068y()) {
                C21658D.m22000q0(c21658d, true, 6);
            }
        }
        C1313k c1313k = c21658d.f68638I0;
        AbstractC21678Y abstractC21678Y = ((C21715t) c1313k.f3468c).f68820y0;
        for (AbstractC21678Y abstractC21678Y2 = (AbstractC21678Y) c1313k.f3469d; !AbstractC16544l.m18089b(abstractC21678Y2, abstractC21678Y) && abstractC21678Y2 != null; abstractC21678Y2 = abstractC21678Y2.f68820y0) {
            if (abstractC21678Y2.f68816O0) {
                abstractC21678Y2.m22165P0();
            }
        }
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (c21658d2.m22010H() != Integer.MAX_VALUE) {
                    c21658d2.m22003A().m22099e0();
                    C21658D.m22002t0(c21658d2);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: f */
    public final C21715t mo22090f() {
        return (C21715t) this.f68719T0.f68729a.f68638I0.f3468c;
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: g */
    public final InterfaceC21680a mo22091g() {
        C21665K c21665kM22060t;
        C21658D c21658dM22009G = this.f68719T0.f68729a.m22009G();
        if (c21658dM22009G == null || (c21665kM22060t = c21658dM22009G.m22060t()) == null) {
            return null;
        }
        return c21665kM22060t.f68746r;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m22100g0() {
        if (this.f68704E0) {
            int i10 = 0;
            this.f68704E0 = false;
            C21665K c21665k = this.f68719T0;
            C1313k c1313k = c21665k.f68729a.f68638I0;
            AbstractC21678Y abstractC21678Y = ((C21715t) c1313k.f3468c).f68820y0;
            for (AbstractC21678Y abstractC21678Y2 = (AbstractC21678Y) c1313k.f3469d; !AbstractC16544l.m18089b(abstractC21678Y2, abstractC21678Y) && abstractC21678Y2 != null; abstractC21678Y2 = abstractC21678Y2.f68820y0) {
                if (abstractC21678Y2.f68817P0 != null) {
                    if (abstractC21678Y2.f68818Q0 != null) {
                        abstractC21678Y2.f68818Q0 = null;
                    }
                    abstractC21678Y2.m22179e1(null, false);
                    abstractC21678Y2.f68819x0.m22058r0(false);
                }
            }
            C6546d c6546dM22014L = c21665k.f68729a.m22014L();
            int i11 = c6546dM22014L.f21184o0;
            if (i11 > 0) {
                Object[] objArr = c6546dM22014L.f21182Y;
                do {
                    ((C21658D) objArr[i10]).m22003A().m22100g0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m22101h0() {
        C6546d c6546dM22014L;
        int i10;
        C21665K c21665k = this.f68719T0;
        if (c21665k.f68742n <= 0 || (i10 = (c6546dM22014L = c21665k.f68729a.m22014L()).f21184o0) <= 0) {
            return;
        }
        Object[] objArr = c6546dM22014L.f21182Y;
        int i11 = 0;
        do {
            C21658D c21658d = (C21658D) objArr[i11];
            C21665K c21665kM22060t = c21658d.m22060t();
            if ((c21665kM22060t.f68740l || c21665kM22060t.f68741m) && !c21665kM22060t.f68733e) {
                c21658d.m22058r0(false);
            }
            c21665kM22060t.f68746r.m22101h0();
            i11++;
        } while (i11 < i10);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m22102j0() {
        int i10;
        C21665K c21665k = this.f68719T0;
        C21658D.m22001s0(c21665k.f68729a, false, 7);
        C21658D c21658d = c21665k.f68729a;
        C21658D c21658dM22009G = c21658d.m22009G();
        if (c21658dM22009G == null || c21658d.f68648S0 != 3) {
            return;
        }
        int iM24h = AbstractC0010F.m24h(c21658dM22009G.m22064w());
        if (iM24h != 0) {
            i10 = 2;
            if (iM24h != 2) {
                i10 = c21658dM22009G.f68648S0;
            }
        } else {
            i10 = 1;
        }
        c21658d.f68648S0 = i10;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: l */
    public final int mo21531l(int i10) {
        m22102j0();
        return this.f68719T0.m22107a().mo21531l(i10);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m22103l0() {
        this.f68712M0 = true;
        C21665K c21665k = this.f68719T0;
        C21658D c21658dM22009G = c21665k.f68729a.m22009G();
        float f10 = mo22090f().f68811J0;
        C1313k c1313k = c21665k.f68729a.f68638I0;
        AbstractC21678Y abstractC21678Y = (AbstractC21678Y) c1313k.f3469d;
        while (abstractC21678Y != ((C21715t) c1313k.f3468c)) {
            AbstractC16544l.m18092e(abstractC21678Y, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C21720y c21720y = (C21720y) abstractC21678Y;
            f10 += c21720y.f68811J0;
            abstractC21678Y = c21720y.f68820y0;
        }
        if (f10 != this.f68711L0) {
            this.f68711L0 = f10;
            if (c21658dM22009G != null) {
                c21658dM22009G.m22042i0();
            }
            if (c21658dM22009G != null) {
                c21658dM22009G.m22017O();
            }
        }
        if (!this.f68704E0) {
            if (c21658dM22009G != null) {
                c21658dM22009G.m22017O();
            }
            m22099e0();
            if (this.f68720r0 && c21658dM22009G != null) {
                c21658dM22009G.m22058r0(false);
            }
        }
        if (c21658dM22009G == null) {
            this.f68722t0 = 0;
        } else if (!this.f68720r0 && c21658dM22009G.m22064w() == 3) {
            if (this.f68722t0 != Integer.MAX_VALUE) {
                AbstractC8111i5.m8592c("Place was called on a node which was placed already");
                throw null;
            }
            this.f68722t0 = c21658dM22009G.m22060t().f68739k;
            c21658dM22009G.m22060t().f68739k++;
        }
        mo22097z();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m22104n0(long j10, float f10, InterfaceC1436k interfaceC1436k, C16308b c16308b) {
        C21665K c21665k = this.f68719T0;
        C21658D c21658d = c21665k.f68729a;
        if (c21658d.f68647R0) {
            AbstractC8111i5.m8591b("place is called on a deactivated node");
            throw null;
        }
        c21665k.f68731c = 3;
        this.f68727y0 = j10;
        this.f68701B0 = f10;
        this.f68728z0 = interfaceC1436k;
        this.f68700A0 = c16308b;
        this.f68724v0 = true;
        this.f68712M0 = false;
        Owner ownerM22082a = AbstractC21661G.m22082a(c21658d);
        if (c21665k.f68733e || !this.f68704E0) {
            this.f68706G0.f68670g = false;
            c21665k.m22110d(false);
            this.f68713N0 = interfaceC1436k;
            this.f68715P0 = j10;
            this.f68716Q0 = f10;
            this.f68714O0 = c16308b;
            C21691f0 snapshotObserver = ownerM22082a.getSnapshotObserver();
            snapshotObserver.m22222a(c21665k.f68729a, snapshotObserver.f68852f, this.f68717R0);
        } else {
            AbstractC21678Y abstractC21678YM22107a = c21665k.m22107a();
            abstractC21678YM22107a.m22172W0(C7543h.m7882d(j10, abstractC21678YM22107a.f66985q0), f10, interfaceC1436k, c16308b);
            m22103l0();
        }
        c21665k.f68731c = 5;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: o */
    public final int mo21532o(int i10) {
        m22102j0();
        return this.f68719T0.m22107a().mo21532o(i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: p */
    public final AbstractC21069X mo21533p(long j10) {
        int i10;
        C21665K c21665k = this.f68719T0;
        C21658D c21658d = c21665k.f68729a;
        if (c21658d.f68648S0 == 3) {
            c21658d.m22034e();
        }
        C21658D c21658d2 = c21665k.f68729a;
        if (AbstractC21690f.m22213r(c21658d2)) {
            C21663I c21663i = c21665k.f68747s;
            AbstractC16544l.m18091d(c21663i);
            c21663i.f68694u0 = 3;
            c21663i.mo21533p(j10);
        }
        C21658D c21658dM22009G = c21658d2.m22009G();
        if (c21658dM22009G == null) {
            this.f68725w0 = 3;
        } else {
            if (this.f68725w0 != 3 && !c21658d2.f68637H0) {
                AbstractC8111i5.m8592c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            int iM24h = AbstractC0010F.m24h(c21658dM22009G.m22064w());
            if (iM24h != 0) {
                i10 = 2;
                if (iM24h != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC20734X.m21229F(c21658dM22009G.m22064w())));
                }
            } else {
                i10 = 1;
            }
            this.f68725w0 = i10;
        }
        m22106q0(j10);
        return this;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m22105p0(long j10, float f10, InterfaceC1436k interfaceC1436k, C16308b c16308b) {
        AbstractC21068W placementScope;
        this.f68705F0 = true;
        boolean zM7880b = C7543h.m7880b(j10, this.f68727y0);
        C21665K c21665k = this.f68719T0;
        if (!zM7880b || this.f68718S0) {
            if (c21665k.f68741m || c21665k.f68740l || this.f68718S0) {
                c21665k.f68733e = true;
                this.f68718S0 = false;
            }
            m22101h0();
        }
        if (AbstractC21690f.m22213r(c21665k.f68729a)) {
            AbstractC21678Y abstractC21678Y = c21665k.m22107a().f68821z0;
            C21658D c21658d = c21665k.f68729a;
            if (abstractC21678Y == null || (placementScope = abstractC21678Y.f68759u0) == null) {
                placementScope = AbstractC21661G.m22082a(c21658d).getPlacementScope();
            }
            C21663I c21663i = c21665k.f68747s;
            AbstractC16544l.m18091d(c21663i);
            C21658D c21658dM22009G = c21658d.m22009G();
            if (c21658dM22009G != null) {
                c21658dM22009G.m22060t().f68738j = 0;
            }
            c21663i.f68693t0 = Integer.MAX_VALUE;
            placementScope.m21545d(c21663i, (int) (j10 >> 32), (int) (4294967295L & j10), 0.0f);
        }
        C21663I c21663i2 = c21665k.f68747s;
        if (c21663i2 == null || c21663i2.f68696w0) {
            m22104n0(j10, f10, interfaceC1436k, c16308b);
        } else {
            AbstractC8111i5.m8592c("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m22106q0(long j10) {
        C21665K c21665k = this.f68719T0;
        C21658D c21658d = c21665k.f68729a;
        if (c21658d.f68647R0) {
            AbstractC8111i5.m8591b("measure is called on a deactivated node");
            throw null;
        }
        Owner ownerM22082a = AbstractC21661G.m22082a(c21658d);
        C21658D c21658d2 = c21665k.f68729a;
        C21658D c21658dM22009G = c21658d2.m22009G();
        boolean z6 = true;
        c21658d2.f68637H0 = c21658d2.f68637H0 || (c21658dM22009G != null && c21658dM22009G.f68637H0);
        if (!c21658d2.m22004B() && C7536a.m7848c(this.f66984p0, j10)) {
            ((AndroidComposeView) ownerM22082a).f32781V0.m22139f(c21658d2, false);
            c21658d2.m22061u0();
            return false;
        }
        this.f68706G0.f68669f = false;
        C6546d c6546dM22014L = c21658d2.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                ((C21658D) objArr[i11]).m22060t().f68746r.f68706G0.f68666c = false;
                i11++;
            } while (i11 < i10);
        }
        this.f68723u0 = true;
        long j11 = c21665k.m22107a().f66983o0;
        m21554T(j10);
        if (c21665k.f68731c != 5) {
            AbstractC8111i5.m8592c("layout state is not idle before measure starts");
            throw null;
        }
        c21665k.f68731c = 1;
        c21665k.f68732d = false;
        c21665k.f68748t = j10;
        C21691f0 snapshotObserver = AbstractC21661G.m22082a(c21658d2).getSnapshotObserver();
        snapshotObserver.m22222a(c21658d2, snapshotObserver.f68849c, c21665k.f68749u);
        if (c21665k.f68731c == 1) {
            c21665k.f68733e = true;
            c21665k.f68734f = true;
            c21665k.f68731c = 5;
        }
        if (C7545j.m7886a(c21665k.m22107a().f66983o0, j11) && c21665k.m22107a().f66981Y == this.f66981Y && c21665k.m22107a().f66982Z == this.f66982Z) {
            z6 = false;
        }
        m21553S(AbstractC9113C4.m9643a(c21665k.m22107a().f66981Y, c21665k.m22107a().f66982Z));
        return z6;
    }

    @Override // p1140z1.InterfaceC21680a
    public final void requestLayout() {
        this.f68719T0.f68729a.m22058r0(false);
    }

    @Override // p1095x1.AbstractC21069X, p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: t */
    public final Object mo21534t() {
        return this.f68703D0;
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: z */
    public final void mo22097z() {
        C6546d c6546dM22014L;
        int i10;
        this.f68709J0 = true;
        C21659E c21659e = this.f68706G0;
        c21659e.m22079h();
        C21665K c21665k = this.f68719T0;
        boolean z6 = c21665k.f68733e;
        C21658D c21658d = c21665k.f68729a;
        if (z6 && (i10 = (c6546dM22014L = c21658d.m22014L()).f21184o0) > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (c21658d2.m22004B() && c21658d2.m22005C() == 1 && C21658D.m21999l0(c21658d2)) {
                    C21658D.m22001s0(c21658d, false, 7);
                }
                i11++;
            } while (i11 < i10);
        }
        if (c21665k.f68734f || (!this.f68726x0 && !mo22090f().f68758t0 && c21665k.f68733e)) {
            c21665k.f68733e = false;
            int i12 = c21665k.f68731c;
            c21665k.f68731c = 3;
            c21665k.m22111e(false);
            C21691f0 snapshotObserver = AbstractC21661G.m22082a(c21658d).getSnapshotObserver();
            snapshotObserver.m22222a(c21658d, snapshotObserver.f68851e, this.f68710K0);
            c21665k.f68731c = i12;
            if (mo22090f().f68758t0 && c21665k.f68740l) {
                requestLayout();
            }
            c21665k.f68734f = false;
        }
        if (c21659e.f68667d) {
            c21659e.f68668e = true;
        }
        if (c21659e.f68665b && c21659e.m22076e()) {
            c21659e.m22078g();
        }
        this.f68709J0 = false;
    }
}
