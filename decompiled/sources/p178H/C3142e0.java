package p178H;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p001A.C0011F0;
import p001A.C0063g0;
import p001A.RunnableC0000A;
import p001A.RunnableC0074m;
import p003A1.AbstractC0168G;
import p1138z.C21572a;
import p117Eb.C2392v;
import p147Fh.RunnableC2748e;
import p155G.C2953e;
import p228J.AbstractC3794B0;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.C3837g0;
import p228J.C3857q0;
import p228J.C3859r0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p277L.ScheduledExecutorServiceC4831d;
import p283L5.AbstractC4941g;
import p414R.C6778l;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: H.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3142e0 extends AbstractC3174u0 {

    /* JADX INFO: renamed from: v */
    public static final C3138c0 f9446v = new C3138c0();

    /* JADX INFO: renamed from: w */
    public static final ScheduledExecutorServiceC4831d f9447w = AbstractC8577W2.m9243e();

    /* JADX INFO: renamed from: o */
    public InterfaceC3140d0 f9448o;

    /* JADX INFO: renamed from: p */
    public ScheduledExecutorServiceC4831d f9449p;

    /* JADX INFO: renamed from: q */
    public C3857q0 f9450q;

    /* JADX INFO: renamed from: r */
    public C3162o0 f9451r;

    /* JADX INFO: renamed from: s */
    public C6778l f9452s;

    /* JADX INFO: renamed from: t */
    public C3170s0 f9453t;

    /* JADX INFO: renamed from: u */
    public C3859r0 f9454u;

    /* JADX INFO: renamed from: B */
    public final void m3982B() {
        C3859r0 c3859r0 = this.f9454u;
        if (c3859r0 != null) {
            c3859r0.m4587b();
            this.f9454u = null;
        }
        C3162o0 c3162o0 = this.f9451r;
        if (c3162o0 != null) {
            c3162o0.mo4507a();
            this.f9451r = null;
        }
        C6778l c6778l = this.f9452s;
        if (c6778l != null) {
            c6778l.m7224b();
            this.f9452s = null;
        }
        this.f9453t = null;
    }

    /* JADX INFO: renamed from: C */
    public final void m3983C(InterfaceC3140d0 interfaceC3140d0) {
        AbstractC8488H2.m9140a();
        if (interfaceC3140d0 == null) {
            this.f9448o = null;
            this.f9562c = 2;
            m4019o();
            return;
        }
        this.f9448o = interfaceC3140d0;
        this.f9449p = f9447w;
        C3836g c3836g = this.f9566g;
        if ((c3836g != null ? c3836g.f11606a : null) != null) {
            m3984D((C3837g0) this.f9565f, c3836g);
            m4018n();
        }
        m4017m();
    }

    /* JADX INFO: renamed from: D */
    public final void m3984D(C3837g0 c3837g0, C3836g c3836g) {
        Rect rect;
        AbstractC8488H2.m9140a();
        InterfaceC3870x interfaceC3870xM4009b = m4009b();
        Objects.requireNonNull(interfaceC3870xM4009b);
        m3982B();
        AbstractC4941g.m5559R(null, this.f9452s == null);
        Matrix matrix = this.f9569j;
        boolean zMo120p = interfaceC3870xM4009b.mo120p();
        Size size = c3836g.f11606a;
        Rect rect2 = this.f9568i;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        C6778l c6778l = new C6778l(1, 34, c3836g, matrix, zMo120p, rect, m4013g(interfaceC3870xM4009b, m4015k(interfaceC3870xM4009b)), ((InterfaceC3818U) this.f9565f).mo4546S(), interfaceC3870xM4009b.mo120p() && m4015k(interfaceC3870xM4009b));
        this.f9452s = c6778l;
        RunnableC0000A runnableC0000A = new RunnableC0000A(this, 17);
        AbstractC8488H2.m9140a();
        c6778l.m7223a();
        c6778l.f21774m.add(runnableC0000A);
        C3170s0 c3170s0M7225c = this.f9452s.m7225c(interfaceC3870xM4009b, true);
        this.f9453t = c3170s0M7225c;
        this.f9451r = c3170s0M7225c.f9544k;
        if (this.f9448o != null) {
            InterfaceC3870x interfaceC3870xM4009b2 = m4009b();
            C6778l c6778l2 = this.f9452s;
            if (interfaceC3870xM4009b2 != null && c6778l2 != null) {
                AbstractC8488H2.m9142c(new RunnableC2748e(c6778l2, m4013g(interfaceC3870xM4009b2, m4015k(interfaceC3870xM4009b2)), ((InterfaceC3818U) this.f9565f).mo4546S(), 2));
            }
            InterfaceC3140d0 interfaceC3140d0 = this.f9448o;
            interfaceC3140d0.getClass();
            C3170s0 c3170s0 = this.f9453t;
            c3170s0.getClass();
            this.f9449p.execute(new RunnableC0074m(interfaceC3140d0, 22, c3170s0));
        }
        C3857q0 c3857q0M4583d = C3857q0.m4583d(c3837g0, c3836g.f11606a);
        C0063g0 c0063g0 = c3857q0M4583d.f11656b;
        c0063g0.getClass();
        ((C3825a0) c0063g0.f287e).m4561x(C3799E.f11481k, c3836g.f11608c);
        int iM4477b = AbstractC3794B0.m4477b(c3837g0);
        if (iM4477b != 0) {
            c0063g0.getClass();
            if (iM4477b != 0) {
                ((C3825a0) c0063g0.f287e).m4561x(InterfaceC3800E0.f11494H, Integer.valueOf(iM4477b));
            }
        }
        C21572a c21572a = c3836g.f11609d;
        if (c21572a != null) {
            c0063g0.m243c(c21572a);
        }
        if (this.f9448o != null) {
            c3857q0M4583d.m4585b(this.f9451r, c3836g.f11607b, ((InterfaceC3818U) this.f9565f).mo4549j());
        }
        C3859r0 c3859r0 = this.f9454u;
        if (c3859r0 != null) {
            c3859r0.m4587b();
        }
        C3859r0 c3859r1 = new C3859r0(new C0011F0(this, 3));
        this.f9454u = c3859r1;
        c3857q0M4583d.f11660f = c3859r1;
        this.f9450q = c3857q0M4583d;
        Object[] objArr = {c3857q0M4583d.m4586c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4007A(DesugarCollections.unmodifiableList(arrayList));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: e */
    public final InterfaceC3800E0 mo3936e(boolean z6, InterfaceC3806H0 interfaceC3806H0) {
        f9446v.getClass();
        C3837g0 c3837g0 = C3138c0.f9441a;
        c3837g0.getClass();
        InterfaceC3805H interfaceC3805HMo248a = interfaceC3806H0.mo248a(AbstractC3794B0.m4476a(c3837g0), 1);
        if (z6) {
            interfaceC3805HMo248a = AbstractC0168G.m509D(interfaceC3805HMo248a, c3837g0);
        }
        if (interfaceC3805HMo248a == null) {
            return null;
        }
        return new C3837g0(C3835f0.m4568a(((C2953e) mo3937j(interfaceC3805HMo248a)).f8836Z));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: i */
    public final Set mo3961i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: j */
    public final InterfaceC3798D0 mo3937j(InterfaceC3805H interfaceC3805H) {
        return new C2953e(C3825a0.m4559o(interfaceC3805H));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: r */
    public final InterfaceC3800E0 mo3939r(InterfaceC3866v interfaceC3866v, InterfaceC3798D0 interfaceC3798D0) {
        interfaceC3798D0.mo3780o().m4561x(InterfaceC3816S.f11560j, 34);
        return interfaceC3798D0.mo3781x();
    }

    public final String toString() {
        return "Preview:".concat(m4012f());
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: u */
    public final C3836g mo3940u(C21572a c21572a) {
        this.f9450q.m4584a(c21572a);
        Object[] objArr = {this.f9450q.m4586c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4007A(DesugarCollections.unmodifiableList(arrayList));
        C2392v c2392vM4569a = this.f9566g.m4569a();
        c2392vM4569a.f7439q0 = c21572a;
        return c2392vM4569a.m3557n();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: v */
    public final C3836g mo3941v(C3836g c3836g, C3836g c3836g2) {
        m3984D((C3837g0) this.f9565f, c3836g);
        return c3836g;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: w */
    public final void mo3942w() {
        m3982B();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: y */
    public final void mo3944y(Rect rect) {
        this.f9568i = rect;
        InterfaceC3870x interfaceC3870xM4009b = m4009b();
        C6778l c6778l = this.f9452s;
        if (interfaceC3870xM4009b == null || c6778l == null) {
            return;
        }
        AbstractC8488H2.m9142c(new RunnableC2748e(c6778l, m4013g(interfaceC3870xM4009b, m4015k(interfaceC3870xM4009b)), ((InterfaceC3818U) this.f9565f).mo4546S(), 2));
    }
}
