package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p275Kn.C4816c;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p692d0.C12987z;
import p758g0.C13781p0;
import p758g0.C13796x;
import p773h0.C14288i0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C16782u {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f53859a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16546n f53860b;

    /* JADX INFO: renamed from: c */
    public final C13781p0 f53861c;

    /* JADX INFO: renamed from: d */
    public final C13796x f53862d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f53863e;

    /* JADX INFO: renamed from: f */
    public final C14292k0 f53864f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f53865g;

    /* JADX INFO: renamed from: h */
    public final C6002f0 f53866h;

    /* JADX INFO: renamed from: i */
    public final C5944C f53867i;

    /* JADX INFO: renamed from: j */
    public final C5994b0 f53868j;

    /* JADX INFO: renamed from: k */
    public final C5994b0 f53869k;

    /* JADX INFO: renamed from: l */
    public final C6002f0 f53870l;

    /* JADX INFO: renamed from: m */
    public final C6002f0 f53871m;

    /* JADX INFO: renamed from: n */
    public final C16779t f53872n;

    /* JADX WARN: Multi-variable type inference failed */
    public C16782u(Object obj, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, C13781p0 c13781p0, C13796x c13796x, InterfaceC1436k interfaceC1436k2) {
        this.f53859a = (AbstractC16546n) interfaceC1436k;
        this.f53860b = (AbstractC16546n) interfaceC1426a;
        this.f53861c = c13781p0;
        this.f53862d = c13796x;
        this.f53863e = interfaceC1436k2;
        this.f53864f = new C14292k0();
        C5975S c5975s = C5975S.f19448r0;
        this.f53865g = C5997d.m6430Q(obj, c5975s);
        this.f53866h = C5997d.m6430Q(obj, c5975s);
        this.f53867i = C5997d.m6421H(new C16761n(this, 3));
        this.f53868j = C5997d.m6428O(Float.NaN);
        C5997d.m6422I(new C16761n(this, 2), c5975s);
        this.f53869k = C5997d.m6428O(0.0f);
        this.f53870l = C5997d.m6430Q(null, c5975s);
        this.f53871m = C5997d.m6430Q(new C16670E0(new C12987z()), c5975s);
        this.f53872n = new C16779t(this);
    }

    /* JADX INFO: renamed from: h */
    public static void m18546h(C16782u c16782u, C16670E0 c16670e0) {
        Object value;
        C5994b0 c5994b0 = c16782u.f53868j;
        boolean zIsNaN = Float.isNaN(c5994b0.m6409g());
        C5944C c5944c = c16782u.f53867i;
        if (zIsNaN || (value = c16670e0.m18491a(c5994b0.m6409g())) == null) {
            value = c5944c.getValue();
        }
        c16782u.m18553g(c16670e0, value);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m18547a(Object obj, EnumC14284g0 enumC14284g0, InterfaceC1441p interfaceC1441p, AbstractC19687c abstractC19687c) {
        C16770q c16770q;
        C16782u c16782u;
        if (abstractC19687c instanceof C16770q) {
            c16770q = (C16770q) abstractC19687c;
            int i10 = c16770q.f53815p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16770q.f53815p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16770q = new C16770q(this, abstractC19687c);
            }
        } else {
            c16770q = new C16770q(this, abstractC19687c);
        }
        Object obj2 = c16770q.f53813Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16770q.f53815p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            if (m18548b().f53389a.m14719c(obj) >= 0) {
                try {
                    C14292k0 c14292k0 = this.f53864f;
                    C16776s c16776s = new C16776s(this, obj, interfaceC1441p, null);
                    c16770q.f53812Y = this;
                    c16770q.f53815p0 = 1;
                    try {
                        c14292k0.getClass();
                        if (AbstractC0575H.m1183l(new C14288i0(enumC14284g0, c14292k0, c16776s, null), c16770q) == enumC19250a) {
                            return enumC19250a;
                        }
                        c16782u = this;
                        c16782u.f53870l.setValue(null);
                    } catch (Throwable th2) {
                        th = th2;
                        c16782u = this;
                        c16782u.f53870l.setValue(null);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else if (((Boolean) this.f53863e.invoke(obj)).booleanValue()) {
                this.f53866h.setValue(obj);
                m18551e(obj);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16782u = c16770q.f53812Y;
            try {
                AbstractC9233X.m9807c(obj2);
                c16782u.f53870l.setValue(null);
            } catch (Throwable th4) {
                th = th4;
                c16782u.f53870l.setValue(null);
                throw th;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public final C16670E0 m18548b() {
        return (C16670E0) this.f53871m.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final float m18549c(float f10) {
        C5994b0 c5994b0 = this.f53868j;
        return AbstractC8301I.m8920k((Float.isNaN(c5994b0.m6409g()) ? 0.0f : c5994b0.m6409g()) + f10, m18548b().m18494d(), m18548b().m18493c());
    }

    /* JADX INFO: renamed from: d */
    public final float m18550d() {
        C5994b0 c5994b0 = this.f53868j;
        if (Float.isNaN(c5994b0.m6409g())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c5994b0.m6409g();
    }

    /* JADX INFO: renamed from: e */
    public final void m18551e(Object obj) {
        this.f53865g.setValue(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: f */
    public final Object m18552f(float f10, AbstractC19694j abstractC19694j) {
        Object objM18492b;
        Object value = this.f53865g.getValue();
        float fM18550d = m18550d();
        C16670E0 c16670e0M18548b = m18548b();
        float fM18495e = c16670e0M18548b.m18495e(value);
        float fFloatValue = ((Number) this.f53860b.invoke()).floatValue();
        if (fM18495e == fM18550d || Float.isNaN(fM18495e)) {
            objM18492b = value;
        } else {
            if (Math.abs(f10) >= Math.abs(fFloatValue)) {
                objM18492b = c16670e0M18548b.m18492b(fM18550d, Math.signum(f10) > 0.0f);
                AbstractC16544l.m18091d(objM18492b);
            } else {
                Object objM18492b2 = c16670e0M18548b.m18492b(fM18550d, fM18550d - fM18495e > 0.0f);
                AbstractC16544l.m18091d(objM18492b2);
                if (Math.abs(fM18495e - fM18550d) <= Math.abs(((Number) this.f53859a.invoke(Float.valueOf(Math.abs(fM18495e - c16670e0M18548b.m18495e(objM18492b2))))).floatValue())) {
                    objM18492b = value;
                } else {
                    objM18492b = objM18492b2;
                }
            }
        }
        return ((Boolean) this.f53863e.invoke(objM18492b)).booleanValue() ? AbstractC10840a.m11220f(this, objM18492b, f10, abstractC19694j) : AbstractC10840a.m11220f(this, value, f10, abstractC19694j);
    }

    /* JADX INFO: renamed from: g */
    public final void m18553g(C16670E0 c16670e0, Object obj) {
        if (AbstractC16544l.m18089b(m18548b(), c16670e0)) {
            return;
        }
        this.f53871m.setValue(c16670e0);
        C14292k0 c14292k0 = this.f53864f;
        C4816c c4816c = c14292k0.f44873b;
        C4816c c4816c2 = c14292k0.f44873b;
        boolean zM5449f = c4816c.m5449f(null);
        C6002f0 c6002f0 = this.f53870l;
        if (zM5449f) {
            try {
                C16779t c16779t = this.f53872n;
                float fM18495e = m18548b().m18495e(obj);
                if (!Float.isNaN(fM18495e)) {
                    c16779t.m18544a(fM18495e, 0.0f);
                    c6002f0.setValue(null);
                }
                m18551e(obj);
                this.f53866h.setValue(obj);
                c4816c2.m5450g(null);
            } catch (Throwable th2) {
                c4816c2.m5450g(null);
                throw th2;
            }
        }
        if (zM5449f) {
            return;
        }
        c6002f0.setValue(obj);
    }

    public /* synthetic */ C16782u(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, C13781p0 c13781p0, C13796x c13796x) {
        this(0, interfaceC1436k, interfaceC1426a, c13781p0, c13796x, C16725b.f53596o0);
    }
}
