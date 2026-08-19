package p178H;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p001A.C0011F0;
import p001A.C0063g0;
import p001A.RunnableC0074m;
import p003A1.AbstractC0168G;
import p1009s9.C19506i;
import p1138z.C21572a;
import p117Eb.C2392v;
import p228J.AbstractC3794B0;
import p228J.C3799E;
import p228J.C3814P;
import p228J.C3825a0;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.C3857q0;
import p228J.C3859r0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p277L.ExecutorC4833f;
import p301M.AbstractC5229k;
import p326N.InterfaceC5570l;
import p523V9.AbstractC8064c6;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: H.E */
/* JADX INFO: loaded from: classes.dex */
public final class C3112E extends AbstractC3174u0 {

    /* JADX INFO: renamed from: u */
    public static final C3110C f9352u = new C3110C();

    /* JADX INFO: renamed from: o */
    public final AbstractC3115H f9353o;

    /* JADX INFO: renamed from: p */
    public final Object f9354p;

    /* JADX INFO: renamed from: q */
    public InterfaceC3108A f9355q;

    /* JADX INFO: renamed from: r */
    public C3857q0 f9356r;

    /* JADX INFO: renamed from: s */
    public C3162o0 f9357s;

    /* JADX INFO: renamed from: t */
    public C3859r0 f9358t;

    public C3112E(C3814P c3814p) {
        super(c3814p);
        this.f9354p = new Object();
        if (((Integer) ((C3835f0) ((C3814P) this.f9565f).getConfig()).mo36M(C3814P.f11541Z, 0)).intValue() == 1) {
            this.f9353o = new C3116I();
        } else {
            this.f9353o = new C3119L((Executor) AbstractC0168G.m520i(c3814p, InterfaceC5570l.f18066b0, AbstractC8577W2.m9241c()));
        }
        this.f9353o.f9381p0 = m3935C();
        AbstractC3115H abstractC3115H = this.f9353o;
        C3814P c3814p2 = (C3814P) this.f9565f;
        Boolean bool = Boolean.FALSE;
        c3814p2.getClass();
        abstractC3115H.f9382q0 = ((Boolean) AbstractC0168G.m520i(c3814p2, C3814P.f11546s0, bool)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX INFO: renamed from: B */
    public final C3857q0 m3934B(C3814P c3814p, C3836g c3836g) {
        int iIntValue;
        boolean z6;
        AbstractC8488H2.m9140a();
        Size size = c3836g.f11606a;
        ExecutorC4833f executorC4833fM9241c = AbstractC8577W2.m9241c();
        c3814p.getClass();
        Executor executor = (Executor) AbstractC0168G.m520i(c3814p, InterfaceC5570l.f18066b0, executorC4833fM9241c);
        executor.getClass();
        boolean z10 = true;
        if (((Integer) ((C3835f0) ((C3814P) this.f9565f).getConfig()).mo36M(C3814P.f11541Z, 0)).intValue() == 1) {
            C3814P c3814p2 = (C3814P) this.f9565f;
            c3814p2.getClass();
            iIntValue = ((Integer) ((C3835f0) c3814p2.getConfig()).mo36M(C3814P.f11542o0, 6)).intValue();
        } else {
            iIntValue = 4;
        }
        if (((C3835f0) c3814p.getConfig()).mo36M(C3814P.f11543p0, null) != null) {
            throw new ClassCastException();
        }
        C3150i0 c3150i0 = new C3150i0(AbstractC8064c6.m8472c(size.getWidth(), size.getHeight(), this.f9565f.getInputFormat(), iIntValue));
        if (m4009b() != null) {
            InterfaceC3870x interfaceC3870xM4009b = m4009b();
            C3814P c3814p3 = (C3814P) this.f9565f;
            Boolean bool = Boolean.FALSE;
            c3814p3.getClass();
            if (!((Boolean) AbstractC0168G.m520i(c3814p3, C3814P.f11546s0, bool)).booleanValue() || m4013g(interfaceC3870xM4009b, false) % 180 == 0) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        int height = z6 ? size.getHeight() : size.getWidth();
        int width = z6 ? size.getWidth() : size.getHeight();
        int i10 = m3935C() == 2 ? 1 : 35;
        boolean z11 = this.f9565f.getInputFormat() == 35 && m3935C() == 2;
        if (this.f9565f.getInputFormat() != 35) {
            z10 = false;
        } else if (m4009b() == null || m4013g(m4009b(), false) == 0) {
            Boolean bool2 = Boolean.TRUE;
            C3814P c3814p4 = (C3814P) this.f9565f;
            c3814p4.getClass();
            if (!bool2.equals((Boolean) AbstractC0168G.m520i(c3814p4, C3814P.f11545r0, null))) {
                z10 = false;
            }
        }
        C3150i0 c3150i1 = (z11 || z10) ? new C3150i0(AbstractC8064c6.m8472c(height, width, i10, c3150i0.mo350t())) : null;
        if (c3150i1 != null) {
            AbstractC3115H abstractC3115H = this.f9353o;
            synchronized (abstractC3115H.f9376D0) {
                abstractC3115H.f9385t0 = c3150i1;
            }
        }
        InterfaceC3870x interfaceC3870xM4009b2 = m4009b();
        if (interfaceC3870xM4009b2 != null) {
            this.f9353o.f9379Z = m4013g(interfaceC3870xM4009b2, false);
        }
        c3150i0.mo347p(this.f9353o, executor);
        C3857q0 c3857q0M4583d = C3857q0.m4583d(c3814p, c3836g.f11606a);
        C21572a c21572a = c3836g.f11609d;
        if (c21572a != null) {
            c3857q0M4583d.f11656b.m243c(c21572a);
        }
        C3162o0 c3162o0 = this.f9357s;
        if (c3162o0 != null) {
            c3162o0.mo4507a();
        }
        C3162o0 c3162o1 = new C3162o0(c3150i0.getSurface(), size, this.f9565f.getInputFormat());
        this.f9357s = c3162o1;
        AbstractC5229k.m5780d(c3162o1.f11530e).mo5766a(new RunnableC0074m(c3150i0, 20, c3150i1), AbstractC8577W2.m9243e());
        Range range = c3836g.f11608c;
        C0063g0 c0063g0 = c3857q0M4583d.f11656b;
        c0063g0.getClass();
        ((C3825a0) c0063g0.f287e).m4561x(C3799E.f11481k, range);
        c3857q0M4583d.m4585b(this.f9357s, c3836g.f11607b, -1);
        C3859r0 c3859r0 = this.f9358t;
        if (c3859r0 != null) {
            c3859r0.m4587b();
        }
        C3859r0 c3859r1 = new C3859r0(new C0011F0(this, 1));
        this.f9358t = c3859r1;
        c3857q0M4583d.f11660f = c3859r1;
        return c3857q0M4583d;
    }

    /* JADX INFO: renamed from: C */
    public final int m3935C() {
        C3814P c3814p = (C3814P) this.f9565f;
        c3814p.getClass();
        return ((Integer) AbstractC0168G.m520i(c3814p, C3814P.f11544q0, 1)).intValue();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: e */
    public final InterfaceC3800E0 mo3936e(boolean z6, InterfaceC3806H0 interfaceC3806H0) {
        f9352u.getClass();
        C3814P c3814p = C3110C.f9351a;
        c3814p.getClass();
        InterfaceC3805H interfaceC3805HMo248a = interfaceC3806H0.mo248a(AbstractC3794B0.m4476a(c3814p), 1);
        if (z6) {
            interfaceC3805HMo248a = AbstractC0168G.m509D(interfaceC3805HMo248a, c3814p);
        }
        if (interfaceC3805HMo248a == null) {
            return null;
        }
        return new C3814P(C3835f0.m4568a((C3825a0) ((C19506i) mo3937j(interfaceC3805HMo248a)).f61960Z));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: j */
    public final InterfaceC3798D0 mo3937j(InterfaceC3805H interfaceC3805H) {
        return new C19506i(C3825a0.m4559o(interfaceC3805H));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: p */
    public final void mo3938p() {
        this.f9353o.f9377E0 = true;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: r */
    public final InterfaceC3800E0 mo3939r(InterfaceC3866v interfaceC3866v, InterfaceC3798D0 interfaceC3798D0) {
        C3814P c3814p = (C3814P) this.f9565f;
        c3814p.getClass();
        Boolean bool = (Boolean) AbstractC0168G.m520i(c3814p, C3814P.f11545r0, null);
        boolean zM4578e = interfaceC3866v.mo145j().m4578e(OnePixelShiftQuirk.class);
        AbstractC3115H abstractC3115H = this.f9353o;
        if (bool != null) {
            zM4578e = bool.booleanValue();
        }
        abstractC3115H.f9383r0 = zM4578e;
        synchronized (this.f9354p) {
        }
        return interfaceC3798D0.mo3781x();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(m4012f());
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: u */
    public final C3836g mo3940u(C21572a c21572a) {
        this.f9356r.m4584a(c21572a);
        Object[] objArr = {this.f9356r.m4586c()};
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
        C3814P c3814p = (C3814P) this.f9565f;
        m4011d();
        C3857q0 c3857q0M3934B = m3934B(c3814p, c3836g);
        this.f9356r = c3857q0M3934B;
        Object[] objArr = {c3857q0M3934B.m4586c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4007A(DesugarCollections.unmodifiableList(arrayList));
        return c3836g;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: w */
    public final void mo3942w() {
        AbstractC8488H2.m9140a();
        C3859r0 c3859r0 = this.f9358t;
        if (c3859r0 != null) {
            c3859r0.m4587b();
            this.f9358t = null;
        }
        C3162o0 c3162o0 = this.f9357s;
        if (c3162o0 != null) {
            c3162o0.mo4507a();
            this.f9357s = null;
        }
        AbstractC3115H abstractC3115H = this.f9353o;
        abstractC3115H.f9377E0 = false;
        abstractC3115H.mo3947c();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: x */
    public final void mo3943x(Matrix matrix) {
        super.mo3943x(matrix);
        AbstractC3115H abstractC3115H = this.f9353o;
        synchronized (abstractC3115H.f9376D0) {
            abstractC3115H.f9389x0 = matrix;
            abstractC3115H.f9390y0 = new Matrix(abstractC3115H.f9389x0);
        }
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: y */
    public final void mo3944y(Rect rect) {
        this.f9568i = rect;
        AbstractC3115H abstractC3115H = this.f9353o;
        synchronized (abstractC3115H.f9376D0) {
            abstractC3115H.f9387v0 = rect;
            abstractC3115H.f9388w0 = new Rect(abstractC3115H.f9387v0);
        }
    }
}
