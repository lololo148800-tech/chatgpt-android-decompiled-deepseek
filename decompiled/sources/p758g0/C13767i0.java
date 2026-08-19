package p758g0;

import kotlin.jvm.internal.AbstractC16544l;
import p349O0.AbstractC5993b;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C5998d0;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p586Y0.C9566r;

/* JADX INFO: renamed from: g0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13767i0 implements InterfaceC5982V0 {

    /* JADX INFO: renamed from: Y */
    public final C13783q0 f43461Y;

    /* JADX INFO: renamed from: Z */
    public final C6002f0 f43462Z;

    /* JADX INFO: renamed from: o0 */
    public final C6002f0 f43463o0;

    /* JADX INFO: renamed from: p0 */
    public final C6002f0 f43464p0;

    /* JADX INFO: renamed from: q0 */
    public final C6002f0 f43465q0;

    /* JADX INFO: renamed from: r0 */
    public final C5994b0 f43466r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f43467s0;

    /* JADX INFO: renamed from: t0 */
    public final C6002f0 f43468t0;

    /* JADX INFO: renamed from: u0 */
    public AbstractC13784r f43469u0;

    /* JADX INFO: renamed from: v0 */
    public final C5998d0 f43470v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f43471w0;

    /* JADX INFO: renamed from: x0 */
    public final C13746W f43472x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C13771k0 f43473y0;

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Map] */
    public C13767i0(C13771k0 c13771k0, Object obj, AbstractC13784r abstractC13784r, C13783q0 c13783q0) {
        this.f43473y0 = c13771k0;
        this.f43461Y = c13783q0;
        C5975S c5975s = C5975S.f19448r0;
        C6002f0 c6002f0M6430Q = C5997d.m6430Q(obj, c5975s);
        this.f43462Z = c6002f0M6430Q;
        Object objInvoke = null;
        C6002f0 c6002f0M6430Q2 = C5997d.m6430Q(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), c5975s);
        this.f43463o0 = c6002f0M6430Q2;
        this.f43464p0 = C5997d.m6430Q(new C13757d0((InterfaceC13726B) c6002f0M6430Q2.getValue(), c13783q0, obj, c6002f0M6430Q.getValue(), abstractC13784r), c5975s);
        this.f43465q0 = C5997d.m6430Q(Boolean.TRUE, c5975s);
        this.f43466r0 = C5997d.m6428O(-1.0f);
        this.f43468t0 = C5997d.m6430Q(obj, c5975s);
        this.f43469u0 = abstractC13784r;
        long jMo15230e = m15263c().mo15230e();
        int i10 = AbstractC5993b.f19471b;
        this.f43470v0 = new C5998d0(jMo15230e);
        Float f10 = (Float) AbstractC13795w0.f43580a.get(c13783q0);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            AbstractC13784r abstractC13784r2 = (AbstractC13784r) c13783q0.f43526a.invoke(obj);
            int iMo15284b = abstractC13784r2.mo15284b();
            for (int i11 = 0; i11 < iMo15284b; i11++) {
                abstractC13784r2.mo15287e(i11, fFloatValue);
            }
            objInvoke = this.f43461Y.f43527b.invoke(abstractC13784r2);
        }
        this.f43472x0 = AbstractC13758e.m15254s(0.0f, 0.0f, objInvoke, 3);
    }

    /* JADX INFO: renamed from: c */
    public final C13757d0 m15263c() {
        return (C13757d0) this.f43464p0.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m15264d() {
        if (this.f43466r0.m6409g() == -1.0f) {
            this.f43471w0 = true;
            boolean zM18089b = AbstractC16544l.m18089b(m15263c().f43423c, m15263c().f43424d);
            C6002f0 c6002f0 = this.f43468t0;
            if (zM18089b) {
                c6002f0.setValue(m15263c().f43423c);
            } else {
                c6002f0.setValue(m15263c().mo15234i(0L));
                this.f43469u0 = m15263c().mo15232g(0L);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15265e(Object obj, boolean z6) {
        C6002f0 c6002f0 = this.f43462Z;
        boolean zM18089b = AbstractC16544l.m18089b(null, c6002f0.getValue());
        C5998d0 c5998d0 = this.f43470v0;
        C6002f0 c6002f1 = this.f43464p0;
        InterfaceC13726B interfaceC13726B = this.f43472x0;
        if (zM18089b) {
            c6002f1.setValue(new C13757d0(interfaceC13726B, this.f43461Y, obj, obj, this.f43469u0.mo15285c()));
            this.f43467s0 = true;
            c5998d0.m6472h(m15263c().mo15230e());
            return;
        }
        C6002f0 c6002f2 = this.f43463o0;
        if (!z6 || this.f43471w0 || (((InterfaceC13726B) c6002f2.getValue()) instanceof C13746W)) {
            interfaceC13726B = (InterfaceC13726B) c6002f2.getValue();
        }
        C13771k0 c13771k0 = this.f43473y0;
        long jMax = 0;
        c6002f1.setValue(new C13757d0(c13771k0.m15274e() <= 0 ? interfaceC13726B : new C13747X(interfaceC13726B, c13771k0.m15274e()), this.f43461Y, obj, c6002f0.getValue(), this.f43469u0));
        c5998d0.m6472h(m15263c().mo15230e());
        this.f43467s0 = false;
        Boolean bool = Boolean.TRUE;
        C6002f0 c6002f3 = c13771k0.f43496h;
        c6002f3.setValue(bool);
        if (c13771k0.m15276g()) {
            C9566r c9566r = c13771k0.f43497i;
            int size = c9566r.size();
            for (int i10 = 0; i10 < size; i10++) {
                C13767i0 c13767i0 = (C13767i0) c9566r.get(i10);
                jMax = Math.max(jMax, c13767i0.f43470v0.m6471g());
                c13767i0.m15264d();
            }
            c6002f3.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15266f(Object obj, Object obj2, InterfaceC13726B interfaceC13726B) {
        this.f43462Z.setValue(obj2);
        this.f43463o0.setValue(interfaceC13726B);
        if (AbstractC16544l.m18089b(m15263c().f43424d, obj) && AbstractC16544l.m18089b(m15263c().f43423c, obj2)) {
            return;
        }
        m15265e(obj, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m15267g(Object obj, InterfaceC13726B interfaceC13726B) {
        if (this.f43467s0 && AbstractC16544l.m18089b(obj, null)) {
            return;
        }
        C6002f0 c6002f0 = this.f43462Z;
        boolean zM18089b = AbstractC16544l.m18089b(c6002f0.getValue(), obj);
        C5994b0 c5994b0 = this.f43466r0;
        if (zM18089b && c5994b0.m6409g() == -1.0f) {
            return;
        }
        c6002f0.setValue(obj);
        this.f43463o0.setValue(interfaceC13726B);
        float fM6409g = c5994b0.m6409g();
        C6002f0 c6002f1 = this.f43468t0;
        Object value = fM6409g == -3.0f ? obj : c6002f1.getValue();
        C6002f0 c6002f2 = this.f43465q0;
        m15265e(value, !((Boolean) c6002f2.getValue()).booleanValue());
        c6002f2.setValue(Boolean.valueOf(c5994b0.m6409g() == -3.0f));
        if (c5994b0.m6409g() >= 0.0f) {
            c6002f1.setValue(m15263c().mo15234i((long) (c5994b0.m6409g() * m15263c().mo15230e())));
        } else if (c5994b0.m6409g() == -3.0f) {
            c6002f1.setValue(obj);
        }
        this.f43467s0 = false;
        c5994b0.m6410h(-1.0f);
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return this.f43468t0.getValue();
    }

    public final String toString() {
        return "current value: " + this.f43468t0.getValue() + ", target: " + this.f43462Z.getValue() + ", spec: " + ((InterfaceC13726B) this.f43463o0.getValue());
    }
}
