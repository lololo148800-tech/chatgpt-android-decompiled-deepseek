package p1140z1;

import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1436k;
import p1039ud.C20198o;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p1095x1.InterfaceC21056J;
import p1106xf.C21202j;
import p392Q0.C6546d;
import p393Q1.C6552d;
import p492U1.C7536a;
import p492U1.C7543h;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9113C4;
import p843k1.C16308b;

/* JADX INFO: renamed from: z1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C21663I extends AbstractC21069X implements InterfaceC21056J, InterfaceC21680a, InterfaceC21673T {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC1436k f68680A0;

    /* JADX INFO: renamed from: B0 */
    public C16308b f68681B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f68682C0;

    /* JADX INFO: renamed from: G0 */
    public boolean f68686G0;

    /* JADX INFO: renamed from: I0 */
    public Object f68688I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f68689J0;

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ C21665K f68690K0;

    /* JADX INFO: renamed from: r0 */
    public boolean f68691r0;

    /* JADX INFO: renamed from: v0 */
    public boolean f68695v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f68696w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f68697x0;

    /* JADX INFO: renamed from: y0 */
    public C7536a f68698y0;

    /* JADX INFO: renamed from: s0 */
    public int f68692s0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t0 */
    public int f68693t0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: u0 */
    public int f68694u0 = 3;

    /* JADX INFO: renamed from: z0 */
    public long f68699z0 = 0;

    /* JADX INFO: renamed from: D0 */
    public final C21659E f68683D0 = new C21659E(this, 1);

    /* JADX INFO: renamed from: E0 */
    public final C6546d f68684E0 = new C6546d(new C21663I[16]);

    /* JADX INFO: renamed from: F0 */
    public boolean f68685F0 = true;

    /* JADX INFO: renamed from: H0 */
    public boolean f68687H0 = true;

    public C21663I(C21665K c21665k) {
        this.f68690K0 = c21665k;
        this.f68688I0 = c21665k.f68746r.f68703D0;
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: A */
    public final boolean mo22083A() {
        return this.f68682C0;
    }

    @Override // p1140z1.InterfaceC21673T
    /* JADX INFO: renamed from: C */
    public final void mo22084C(boolean z6) {
        AbstractC21669O abstractC21669OMo22157H0;
        C21665K c21665k = this.f68690K0;
        AbstractC21669O abstractC21669OMo22157H1 = c21665k.m22107a().mo22157H0();
        if (Boolean.valueOf(z6).equals(abstractC21669OMo22157H1 != null ? Boolean.valueOf(abstractC21669OMo22157H1.f68756r0) : null) || (abstractC21669OMo22157H0 = c21665k.m22107a().mo22157H0()) == null) {
            return;
        }
        abstractC21669OMo22157H0.f68756r0 = z6;
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: E */
    public final void mo22085E() {
        C21658D.m22000q0(this.f68690K0.f68729a, false, 7);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: G */
    public final int mo21529G(int i10) {
        m22093h0();
        AbstractC21669O abstractC21669OMo22157H0 = this.f68690K0.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        return abstractC21669OMo22157H0.mo21529G(i10);
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: H */
    public final int mo21547H(C21094o c21094o) {
        C21665K c21665k = this.f68690K0;
        C21658D c21658dM22009G = c21665k.f68729a.m22009G();
        int iM22064w = c21658dM22009G != null ? c21658dM22009G.m22064w() : 0;
        C21659E c21659e = this.f68683D0;
        if (iM22064w == 2) {
            c21659e.f68666c = true;
        } else {
            C21658D c21658dM22009G2 = c21665k.f68729a.m22009G();
            if ((c21658dM22009G2 != null ? c21658dM22009G2.m22064w() : 0) == 4) {
                c21659e.f68667d = true;
            }
        }
        this.f68695v0 = true;
        AbstractC21669O abstractC21669OMo22157H0 = c21665k.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        int iMo21547H = abstractC21669OMo22157H0.mo21547H(c21094o);
        this.f68695v0 = false;
        return iMo21547H;
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: K */
    public final int mo21548K() {
        AbstractC21669O abstractC21669OMo22157H0 = this.f68690K0.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        return abstractC21669OMo22157H0.mo21548K();
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: L */
    public final int mo21549L() {
        AbstractC21669O abstractC21669OMo22157H0 = this.f68690K0.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        return abstractC21669OMo22157H0.mo21549L();
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: N */
    public final void mo21551N(long j10, float f10, InterfaceC1436k interfaceC1436k) {
        m22095l0(j10, interfaceC1436k, null);
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: Q */
    public final void mo21552Q(long j10, float f10, C16308b c16308b) {
        m22095l0(j10, null, c16308b);
    }

    /* JADX INFO: renamed from: V */
    public final void m22086V() {
        boolean z6 = this.f68682C0;
        this.f68682C0 = true;
        C21665K c21665k = this.f68690K0;
        if (!z6 && c21665k.f68735g) {
            C21658D.m22000q0(c21665k.f68729a, true, 6);
        }
        C6546d c6546dM22014L = c21665k.f68729a.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d = (C21658D) objArr[i11];
                C21663I c21663iM22070z = c21658d.m22070z();
                if (c21663iM22070z == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (c21663iM22070z.f68693t0 != Integer.MAX_VALUE) {
                    c21663iM22070z.m22086V();
                    C21658D.m22002t0(c21658d);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: a */
    public final C21659E mo22087a() {
        return this.f68683D0;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: b */
    public final int mo21530b(int i10) {
        m22093h0();
        AbstractC21669O abstractC21669OMo22157H0 = this.f68690K0.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        return abstractC21669OMo22157H0.mo21530b(i10);
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: c */
    public final void mo22088c(C20198o c20198o) {
        C6546d c6546dM22014L = this.f68690K0.f68729a.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21663I c21663i = ((C21658D) objArr[i11]).m22060t().f68747s;
                AbstractC16544l.m18091d(c21663i);
                c20198o.invoke(c21663i);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m22089e0() {
        if (this.f68682C0) {
            int i10 = 0;
            this.f68682C0 = false;
            C6546d c6546dM22014L = this.f68690K0.f68729a.m22014L();
            int i11 = c6546dM22014L.f21184o0;
            if (i11 > 0) {
                Object[] objArr = c6546dM22014L.f21182Y;
                do {
                    C21663I c21663i = ((C21658D) objArr[i10]).m22060t().f68747s;
                    AbstractC16544l.m18091d(c21663i);
                    c21663i.m22089e0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: f */
    public final C21715t mo22090f() {
        return (C21715t) this.f68690K0.f68729a.f68638I0.f3468c;
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: g */
    public final InterfaceC21680a mo22091g() {
        C21665K c21665kM22060t;
        C21658D c21658dM22009G = this.f68690K0.f68729a.m22009G();
        if (c21658dM22009G == null || (c21665kM22060t = c21658dM22009G.m22060t()) == null) {
            return null;
        }
        return c21665kM22060t.f68747s;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m22092g0() {
        C6546d c6546dM22014L;
        int i10;
        C21665K c21665k = this.f68690K0;
        if (c21665k.f68745q <= 0 || (i10 = (c6546dM22014L = c21665k.f68729a.m22014L()).f21184o0) <= 0) {
            return;
        }
        Object[] objArr = c6546dM22014L.f21182Y;
        int i11 = 0;
        do {
            C21658D c21658d = (C21658D) objArr[i11];
            C21665K c21665kM22060t = c21658d.m22060t();
            if ((c21665kM22060t.f68743o || c21665kM22060t.f68744p) && !c21665kM22060t.f68736h) {
                c21658d.m22055p0(false);
            }
            C21663I c21663i = c21665kM22060t.f68747s;
            if (c21663i != null) {
                c21663i.m22092g0();
            }
            i11++;
        } while (i11 < i10);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m22093h0() {
        int i10;
        C21665K c21665k = this.f68690K0;
        C21658D.m22000q0(c21665k.f68729a, false, 7);
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

    /* JADX INFO: renamed from: j0 */
    public final void m22094j0() {
        this.f68689J0 = true;
        C21658D c21658dM22009G = this.f68690K0.f68729a.m22009G();
        if (!this.f68682C0) {
            m22086V();
            if (this.f68691r0 && c21658dM22009G != null) {
                c21658dM22009G.m22055p0(false);
            }
        }
        if (c21658dM22009G == null) {
            this.f68693t0 = 0;
        } else if (!this.f68691r0 && (c21658dM22009G.m22064w() == 3 || c21658dM22009G.m22064w() == 4)) {
            if (this.f68693t0 != Integer.MAX_VALUE) {
                AbstractC8111i5.m8592c("Place was called on a node which was placed already");
                throw null;
            }
            this.f68693t0 = c21658dM22009G.m22060t().f68738j;
            c21658dM22009G.m22060t().f68738j++;
        }
        mo22097z();
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: l */
    public final int mo21531l(int i10) {
        m22093h0();
        AbstractC21669O abstractC21669OMo22157H0 = this.f68690K0.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        return abstractC21669OMo22157H0.mo21531l(i10);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m22095l0(long j10, InterfaceC1436k interfaceC1436k, C16308b c16308b) {
        C21665K c21665k = this.f68690K0;
        if (c21665k.f68729a.f68647R0) {
            AbstractC8111i5.m8591b("place is called on a deactivated node");
            throw null;
        }
        c21665k.f68731c = 4;
        this.f68696w0 = true;
        this.f68689J0 = false;
        if (!C7543h.m7880b(j10, this.f68699z0)) {
            if (c21665k.f68744p || c21665k.f68743o) {
                c21665k.f68736h = true;
            }
            m22092g0();
        }
        C21658D c21658d = c21665k.f68729a;
        Owner ownerM22082a = AbstractC21661G.m22082a(c21658d);
        if (c21665k.f68736h || !this.f68682C0) {
            c21665k.m22112f(false);
            this.f68683D0.f68670g = false;
            C21691f0 snapshotObserver = ownerM22082a.getSnapshotObserver();
            C21662H c21662h = new C21662H(c21665k, ownerM22082a, j10);
            snapshotObserver.getClass();
            if (c21658d.f68652o0 != null) {
                snapshotObserver.m22222a(c21658d, snapshotObserver.f68853g, c21662h);
            } else {
                snapshotObserver.m22222a(c21658d, snapshotObserver.f68852f, c21662h);
            }
        } else {
            AbstractC21669O abstractC21669OMo22157H0 = c21665k.m22107a().mo22157H0();
            AbstractC16544l.m18091d(abstractC21669OMo22157H0);
            abstractC21669OMo22157H0.m22131z0(C7543h.m7882d(j10, abstractC21669OMo22157H0.f66985q0));
            m22094j0();
        }
        this.f68699z0 = j10;
        this.f68680A0 = interfaceC1436k;
        this.f68681B0 = c16308b;
        c21665k.f68731c = 5;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m22096n0(long j10) {
        C21665K c21665k = this.f68690K0;
        C21658D c21658d = c21665k.f68729a;
        if (c21658d.f68647R0) {
            AbstractC8111i5.m8591b("measure is called on a deactivated node");
            throw null;
        }
        C21658D c21658dM22009G = c21658d.m22009G();
        C21658D c21658d2 = c21665k.f68729a;
        c21658d2.f68637H0 = c21658d2.f68637H0 || (c21658dM22009G != null && c21658dM22009G.f68637H0);
        if (!c21658d2.m22068y()) {
            C7536a c7536a = this.f68698y0;
            if (c7536a == null ? false : C7536a.m7848c(c7536a.f23888a, j10)) {
                AndroidComposeView androidComposeView = c21658d2.f68658u0;
                if (androidComposeView != null) {
                    androidComposeView.f32781V0.m22139f(c21658d2, true);
                }
                c21658d2.m22061u0();
                return false;
            }
        }
        this.f68698y0 = new C7536a(j10);
        m21554T(j10);
        this.f68683D0.f68669f = false;
        C6546d c6546dM22014L = c21658d2.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21663I c21663i = ((C21658D) objArr[i11]).m22060t().f68747s;
                AbstractC16544l.m18091d(c21663i);
                c21663i.f68683D0.f68666c = false;
                i11++;
            } while (i11 < i10);
        }
        long jM9643a = this.f68697x0 ? this.f66983o0 : AbstractC9113C4.m9643a(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f68697x0 = true;
        AbstractC21669O abstractC21669OMo22157H0 = c21665k.m22107a().mo22157H0();
        if (!(abstractC21669OMo22157H0 != null)) {
            AbstractC8111i5.m8592c("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        c21665k.f68731c = 2;
        c21665k.f68735g = false;
        C21691f0 snapshotObserver = AbstractC21661G.m22082a(c21658d2).getSnapshotObserver();
        C6552d c6552d = new C6552d(c21665k, j10, 2);
        snapshotObserver.getClass();
        if (c21658d2.f68652o0 != null) {
            snapshotObserver.m22222a(c21658d2, snapshotObserver.f68848b, c6552d);
        } else {
            snapshotObserver.m22222a(c21658d2, snapshotObserver.f68849c, c6552d);
        }
        c21665k.f68736h = true;
        c21665k.f68737i = true;
        if (AbstractC21690f.m22213r(c21658d2)) {
            c21665k.f68733e = true;
            c21665k.f68734f = true;
        } else {
            c21665k.f68732d = true;
        }
        c21665k.f68731c = 5;
        m21553S(AbstractC9113C4.m9643a(abstractC21669OMo22157H0.f66981Y, abstractC21669OMo22157H0.f66982Z));
        return (((int) (jM9643a >> 32)) == abstractC21669OMo22157H0.f66981Y && ((int) (4294967295L & jM9643a)) == abstractC21669OMo22157H0.f66982Z) ? false : true;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: o */
    public final int mo21532o(int i10) {
        m22093h0();
        AbstractC21669O abstractC21669OMo22157H0 = this.f68690K0.m22107a().mo22157H0();
        AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        return abstractC21669OMo22157H0.mo21532o(i10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: p */
    public final AbstractC21069X mo21533p(long j10) {
        C21665K c21665k = this.f68690K0;
        C21658D c21658dM22009G = c21665k.f68729a.m22009G();
        int iM22064w = c21658dM22009G != null ? c21658dM22009G.m22064w() : 0;
        int i10 = 2;
        C21658D c21658d = c21665k.f68729a;
        if (iM22064w == 2) {
            c21665k.f68730b = false;
        } else {
            C21658D c21658dM22009G2 = c21658d.m22009G();
            if ((c21658dM22009G2 != null ? c21658dM22009G2.m22064w() : 0) == 4) {
                c21665k.f68730b = false;
            }
        }
        C21658D c21658dM22009G3 = c21658d.m22009G();
        if (c21658dM22009G3 == null) {
            this.f68694u0 = 3;
        } else {
            if (this.f68694u0 != 3 && !c21658d.f68637H0) {
                AbstractC8111i5.m8592c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            int iM24h = AbstractC0010F.m24h(c21658dM22009G3.m22064w());
            if (iM24h == 0 || iM24h == 1) {
                i10 = 1;
            } else if (iM24h != 2 && iM24h != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC20734X.m21229F(c21658dM22009G3.m22064w())));
            }
            this.f68694u0 = i10;
        }
        if (c21658d.f68648S0 == 3) {
            c21658d.m22034e();
        }
        m22096n0(j10);
        return this;
    }

    @Override // p1140z1.InterfaceC21680a
    public final void requestLayout() {
        this.f68690K0.f68729a.m22055p0(false);
    }

    @Override // p1095x1.AbstractC21069X, p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: t */
    public final Object mo21534t() {
        return this.f68688I0;
    }

    @Override // p1140z1.InterfaceC21680a
    /* JADX INFO: renamed from: z */
    public final void mo22097z() {
        C6546d c6546dM22014L;
        int i10;
        this.f68686G0 = true;
        C21659E c21659e = this.f68683D0;
        c21659e.m22079h();
        C21665K c21665k = this.f68690K0;
        boolean z6 = c21665k.f68736h;
        C21658D c21658d = c21665k.f68729a;
        if (z6 && (i10 = (c6546dM22014L = c21658d.m22014L()).f21184o0) > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (c21658d2.m22068y() && c21658d2.m22006D() == 1) {
                    C21663I c21663i = c21658d2.m22060t().f68747s;
                    AbstractC16544l.m18091d(c21663i);
                    C21663I c21663i2 = c21658d2.m22060t().f68747s;
                    C7536a c7536a = c21663i2 != null ? c21663i2.f68698y0 : null;
                    AbstractC16544l.m18091d(c7536a);
                    if (c21663i.m22096n0(c7536a.f23888a)) {
                        C21658D.m22000q0(c21658d, false, 7);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        C21714s c21714s = mo22090f().f68893X0;
        AbstractC16544l.m18091d(c21714s);
        if (c21665k.f68737i || (!this.f68695v0 && !c21714s.f68758t0 && c21665k.f68736h)) {
            c21665k.f68736h = false;
            int i12 = c21665k.f68731c;
            c21665k.f68731c = 4;
            Owner ownerM22082a = AbstractC21661G.m22082a(c21658d);
            c21665k.m22113g(false);
            C21691f0 snapshotObserver = ownerM22082a.getSnapshotObserver();
            C21202j c21202j = new C21202j(this, c21714s, c21665k, 3);
            snapshotObserver.getClass();
            if (c21658d.f68652o0 != null) {
                snapshotObserver.m22222a(c21658d, snapshotObserver.f68854h, c21202j);
            } else {
                snapshotObserver.m22222a(c21658d, snapshotObserver.f68851e, c21202j);
            }
            c21665k.f68731c = i12;
            if (c21665k.f68743o && c21714s.f68758t0) {
                requestLayout();
            }
            c21665k.f68737i = false;
        }
        if (c21659e.f68667d) {
            c21659e.f68668e = true;
        }
        if (c21659e.f68665b && c21659e.m22076e()) {
            c21659e.m22078g();
        }
        this.f68686G0 = false;
    }
}
