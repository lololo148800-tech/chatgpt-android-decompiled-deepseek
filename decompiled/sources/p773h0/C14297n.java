package p773h0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19737n;
import p102Dm.AbstractC2119a;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7550o;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: h0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C14297n implements InterfaceC14300o0 {

    /* JADX INFO: renamed from: Y */
    public C13800b f44885Y;

    /* JADX INFO: renamed from: Z */
    public final C14251F f44886Z;

    /* JADX INFO: renamed from: o0 */
    public final C6002f0 f44887o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f44888p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f44889q0;

    /* JADX INFO: renamed from: r0 */
    public long f44890r0;

    /* JADX INFO: renamed from: s0 */
    public C19737n f44891s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC10459q f44892t0;

    public C14297n(Context context, C14296m0 c14296m0) {
        C14251F c14251f = new C14251F(context, AbstractC14334L.m15617F(c14296m0.f44883a));
        this.f44886Z = c14251f;
        C17296C c17296c = C17296C.f55119a;
        this.f44887o0 = C5997d.m6430Q(c17296c, C5975S.f19445o0);
        this.f44888p0 = true;
        this.f44890r0 = 0L;
        this.f44892t0 = AbstractC9306j0.m9882a(new SuspendPointerInputElement(c17296c, null, new C14295m(this, null), 6), Build.VERSION.SDK_INT >= 31 ? new C14250E(this, c14251f) : new C14250E(this, c14251f, c14296m0));
    }

    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: a */
    public final InterfaceC10459q mo15579a() {
        return this.f44892t0;
    }

    /* JADX INFO: renamed from: b */
    public final void m15583b() {
        boolean zIsFinished;
        C14251F c14251f = this.f44886Z;
        EdgeEffect edgeEffect = c14251f.f44723d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c14251f.f44724e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = c14251f.f44725f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = c14251f.f44726g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            m15585g();
        }
    }

    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: c */
    public final boolean mo15580c() {
        C14251F c14251f = this.f44886Z;
        EdgeEffect edgeEffect = c14251f.f44723d;
        C14299o c14299o = C14299o.f44894a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c14299o.m15592b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c14251f.f44724e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c14299o.m15592b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c14251f.f44725f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c14299o.m15592b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c14251f.f44726g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c14299o.m15592b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: d */
    public final long mo15581d(long j10, int i10, InterfaceC1436k interfaceC1436k) {
        float fM15586h;
        float fM15588j;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        if (C13803e.m15334f(this.f44890r0)) {
            return ((C13800b) interfaceC1436k.invoke(new C13800b(j10))).f43584a;
        }
        boolean z13 = this.f44889q0;
        boolean z14 = true;
        C14251F c14251f = this.f44886Z;
        if (!z13) {
            if (C14251F.m15548g(c14251f.f44725f)) {
                m15587i(0L);
            }
            if (C14251F.m15548g(c14251f.f44726g)) {
                m15588j(0L);
            }
            if (C14251F.m15548g(c14251f.f44723d)) {
                m15589k(0L);
            }
            if (C14251F.m15548g(c14251f.f44724e)) {
                m15586h(0L);
            }
            this.f44889q0 = true;
        }
        if (C13800b.m15307h(j10) == 0.0f) {
            fM15586h = 0.0f;
        } else if (C14251F.m15548g(c14251f.f44723d)) {
            fM15586h = m15589k(j10);
            if (!C14251F.m15548g(c14251f.f44723d)) {
                c14251f.m15553e().onRelease();
            }
        } else if (C14251F.m15548g(c14251f.f44724e)) {
            fM15586h = m15586h(j10);
            if (!C14251F.m15548g(c14251f.f44724e)) {
                c14251f.m15550b().onRelease();
            }
        } else {
            fM15586h = 0.0f;
        }
        if (C13800b.m15306g(j10) == 0.0f) {
            fM15588j = 0.0f;
        } else if (C14251F.m15548g(c14251f.f44725f)) {
            fM15588j = m15587i(j10);
            if (!C14251F.m15548g(c14251f.f44725f)) {
                c14251f.m15551c().onRelease();
            }
        } else if (C14251F.m15548g(c14251f.f44726g)) {
            fM15588j = m15588j(j10);
            if (!C14251F.m15548g(c14251f.f44726g)) {
                c14251f.m15552d().onRelease();
            }
        } else {
            fM15588j = 0.0f;
        }
        long jM8536b = AbstractC8088f6.m8536b(fM15588j, fM15586h);
        if (!C13800b.m15303d(jM8536b, 0L)) {
            m15585g();
        }
        long jM15310k = C13800b.m15310k(j10, jM8536b);
        long j11 = ((C13800b) interfaceC1436k.invoke(new C13800b(jM15310k))).f43584a;
        long jM15310k2 = C13800b.m15310k(jM15310k, j11);
        if (AbstractC8226x0.m8860a(i10, 1)) {
            if (C13800b.m15306g(jM15310k2) > 0.5f) {
                m15587i(jM15310k2);
            } else {
                if (C13800b.m15306g(jM15310k2) < -0.5f) {
                    m15588j(jM15310k2);
                } else {
                    z11 = false;
                }
                if (C13800b.m15307h(jM15310k2) > 0.5f) {
                    m15589k(jM15310k2);
                } else {
                    if (C13800b.m15307h(jM15310k2) < -0.5f) {
                        m15586h(jM15310k2);
                    } else {
                        z12 = false;
                    }
                    if (!z11 || z12) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                z12 = true;
                if (z11) {
                }
                z6 = true;
            }
            z11 = true;
            if (C13800b.m15307h(jM15310k2) > 0.5f) {
                m15589k(jM15310k2);
            } else {
                if (C13800b.m15307h(jM15310k2) < -0.5f) {
                    m15586h(jM15310k2);
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                z6 = true;
            }
            z12 = true;
            if (z11) {
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (!C14251F.m15547f(c14251f.f44725f) || C13800b.m15306g(j10) >= 0.0f) {
            z10 = false;
        } else {
            EdgeEffect edgeEffectM15551c = c14251f.m15551c();
            float fM15306g = C13800b.m15306g(j10);
            if (edgeEffectM15551c instanceof C14260O) {
                C14260O c14260o = (C14260O) edgeEffectM15551c;
                float f10 = c14260o.f44751b + fM15306g;
                c14260o.f44751b = f10;
                if (Math.abs(f10) > c14260o.f44750a) {
                    c14260o.onRelease();
                }
            } else {
                edgeEffectM15551c.onRelease();
            }
            z10 = !C14251F.m15547f(c14251f.f44725f);
        }
        if (C14251F.m15547f(c14251f.f44726g) && C13800b.m15306g(j10) > 0.0f) {
            EdgeEffect edgeEffectM15552d = c14251f.m15552d();
            float fM15306g2 = C13800b.m15306g(j10);
            if (edgeEffectM15552d instanceof C14260O) {
                C14260O c14260o2 = (C14260O) edgeEffectM15552d;
                float f11 = c14260o2.f44751b + fM15306g2;
                c14260o2.f44751b = f11;
                if (Math.abs(f11) > c14260o2.f44750a) {
                    c14260o2.onRelease();
                }
            } else {
                edgeEffectM15552d.onRelease();
            }
            z10 = z10 || !C14251F.m15547f(c14251f.f44726g);
        }
        if (C14251F.m15547f(c14251f.f44723d) && C13800b.m15307h(j10) < 0.0f) {
            EdgeEffect edgeEffectM15553e = c14251f.m15553e();
            float fM15307h = C13800b.m15307h(j10);
            if (edgeEffectM15553e instanceof C14260O) {
                C14260O c14260o3 = (C14260O) edgeEffectM15553e;
                float f12 = c14260o3.f44751b + fM15307h;
                c14260o3.f44751b = f12;
                if (Math.abs(f12) > c14260o3.f44750a) {
                    c14260o3.onRelease();
                }
            } else {
                edgeEffectM15553e.onRelease();
            }
            z10 = z10 || !C14251F.m15547f(c14251f.f44723d);
        }
        if (C14251F.m15547f(c14251f.f44724e) && C13800b.m15307h(j10) > 0.0f) {
            EdgeEffect edgeEffectM15550b = c14251f.m15550b();
            float fM15307h2 = C13800b.m15307h(j10);
            if (edgeEffectM15550b instanceof C14260O) {
                C14260O c14260o4 = (C14260O) edgeEffectM15550b;
                float f13 = c14260o4.f44751b + fM15307h2;
                c14260o4.f44751b = f13;
                if (Math.abs(f13) > c14260o4.f44750a) {
                    c14260o4.onRelease();
                }
            } else {
                edgeEffectM15550b.onRelease();
            }
            z10 = z10 || !C14251F.m15547f(c14251f.f44724e);
        }
        if (!z10 && !z6) {
            z14 = false;
        }
        if (z14) {
            m15585g();
        }
        return C13800b.m15311l(jM8536b, j11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:112:0x0204  */
    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0192  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b8  */
    @Override // p773h0.InterfaceC14300o0
    /* JADX INFO: renamed from: e */
    public final Object mo15582e(long j10, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        C14291k c14291k;
        float fM7902c;
        float fM7903d;
        long jM7904e;
        C14297n c14297n;
        long jM7904e2;
        float fM7902c2;
        C14251F c14251f;
        EdgeEffect edgeEffectM15552d;
        int i10;
        EdgeEffect edgeEffectM15550b;
        int i11;
        EdgeEffect edgeEffectM15553e;
        int iM3195i;
        EdgeEffect edgeEffectM15551c;
        int iM3195i2;
        if (interfaceC18770c instanceof C14291k) {
            c14291k = (C14291k) interfaceC18770c;
            int i12 = c14291k.f44871q0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c14291k.f44871q0 = i12 - Integer.MIN_VALUE;
            } else {
                c14291k = new C14291k(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c14291k = new C14291k(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objInvoke = c14291k.f44869o0;
        Object obj = EnumC19250a.f61036Y;
        int i13 = c14291k.f44871q0;
        C17296C c17296c = C17296C.f55119a;
        if (i13 != 0) {
            if (i13 == 1) {
                AbstractC9233X.m9807c(objInvoke);
            }
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jM7904e = c14291k.f44868Z;
            c14297n = c14291k.f44867Y;
            AbstractC9233X.m9807c(objInvoke);
            jM7904e2 = C7550o.m7904e(jM7904e, ((C7550o) objInvoke).f23912a);
            c14297n.f44889q0 = false;
            fM7902c2 = C7550o.m7902c(jM7904e2);
            c14251f = c14297n.f44886Z;
            if (fM7902c2 > 0.0f) {
                edgeEffectM15551c = c14251f.m15551c();
                iM3195i2 = AbstractC2119a.m3195i(C7550o.m7902c(jM7904e2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectM15551c.isFinished()) {
                    edgeEffectM15551c.onAbsorb(iM3195i2);
                }
            } else if (C7550o.m7902c(jM7904e2) < 0.0f) {
                edgeEffectM15552d = c14251f.m15552d();
                i10 = -AbstractC2119a.m3195i(C7550o.m7902c(jM7904e2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectM15552d.isFinished()) {
                    edgeEffectM15552d.onAbsorb(i10);
                }
            }
            if (C7550o.m7903d(jM7904e2) > 0.0f) {
                edgeEffectM15553e = c14251f.m15553e();
                iM3195i = AbstractC2119a.m3195i(C7550o.m7903d(jM7904e2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectM15553e.isFinished()) {
                    edgeEffectM15553e.onAbsorb(iM3195i);
                }
            } else if (C7550o.m7903d(jM7904e2) < 0.0f) {
                edgeEffectM15550b = c14251f.m15550b();
                i11 = -AbstractC2119a.m3195i(C7550o.m7903d(jM7904e2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectM15550b.isFinished()) {
                    edgeEffectM15550b.onAbsorb(i11);
                }
            }
            if (jM7904e2 != 0) {
                c14297n.m15585g();
            }
            c14297n.m15583b();
            return c17296c;
        }
        AbstractC9233X.m9807c(objInvoke);
        if (C13803e.m15334f(this.f44890r0)) {
            Object c7550o = new C7550o(j10);
            c14291k.f44871q0 = 1;
            return interfaceC1439n.invoke(c7550o, c14291k) == obj ? obj : c17296c;
        }
        float fM7902c3 = C7550o.m7902c(j10);
        C14251F c14251f2 = this.f44886Z;
        if (fM7902c3 > 0.0f && C14251F.m15548g(c14251f2.f44725f)) {
            EdgeEffect edgeEffectM15551c2 = c14251f2.m15551c();
            int iM3195i3 = AbstractC2119a.m3195i(C7550o.m7902c(j10));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM15551c2.isFinished()) {
                edgeEffectM15551c2.onAbsorb(iM3195i3);
            }
            fM7902c = C7550o.m7902c(j10);
        } else if (C7550o.m7902c(j10) >= 0.0f || !C14251F.m15548g(c14251f2.f44726g)) {
            fM7902c = 0.0f;
        } else {
            EdgeEffect edgeEffectM15552d2 = c14251f2.m15552d();
            int i14 = -AbstractC2119a.m3195i(C7550o.m7902c(j10));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM15552d2.isFinished()) {
                edgeEffectM15552d2.onAbsorb(i14);
            }
            fM7902c = C7550o.m7902c(j10);
        }
        if (C7550o.m7903d(j10) > 0.0f && C14251F.m15548g(c14251f2.f44723d)) {
            EdgeEffect edgeEffectM15553e2 = c14251f2.m15553e();
            int iM3195i4 = AbstractC2119a.m3195i(C7550o.m7903d(j10));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM15553e2.isFinished()) {
                edgeEffectM15553e2.onAbsorb(iM3195i4);
            }
            fM7903d = C7550o.m7903d(j10);
        } else if (C7550o.m7903d(j10) >= 0.0f || !C14251F.m15548g(c14251f2.f44724e)) {
            fM7903d = 0.0f;
        } else {
            EdgeEffect edgeEffectM15550b2 = c14251f2.m15550b();
            int i15 = -AbstractC2119a.m3195i(C7550o.m7903d(j10));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM15550b2.isFinished()) {
                edgeEffectM15550b2.onAbsorb(i15);
            }
            fM7903d = C7550o.m7903d(j10);
        }
        long jM9659a = AbstractC9125E4.m9659a(fM7902c, fM7903d);
        if (jM9659a != 0) {
            m15585g();
        }
        jM7904e = C7550o.m7904e(j10, jM9659a);
        Object c7550o2 = new C7550o(jM7904e);
        c14291k.f44867Y = this;
        c14291k.f44868Z = jM7904e;
        c14291k.f44871q0 = 2;
        objInvoke = interfaceC1439n.invoke(c7550o2, c14291k);
        if (objInvoke == obj) {
            return obj;
        }
        c14297n = this;
        jM7904e2 = C7550o.m7904e(jM7904e, ((C7550o) objInvoke).f23912a);
        c14297n.f44889q0 = false;
        fM7902c2 = C7550o.m7902c(jM7904e2);
        c14251f = c14297n.f44886Z;
        if (fM7902c2 > 0.0f) {
            edgeEffectM15551c = c14251f.m15551c();
            iM3195i2 = AbstractC2119a.m3195i(C7550o.m7902c(jM7904e2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectM15551c.onAbsorb(iM3195i2);
            } else {
                edgeEffectM15551c.onAbsorb(iM3195i2);
            }
        } else if (C7550o.m7902c(jM7904e2) < 0.0f) {
            edgeEffectM15552d = c14251f.m15552d();
            i10 = -AbstractC2119a.m3195i(C7550o.m7902c(jM7904e2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectM15552d.onAbsorb(i10);
            } else {
                edgeEffectM15552d.onAbsorb(i10);
            }
        }
        if (C7550o.m7903d(jM7904e2) > 0.0f) {
            edgeEffectM15553e = c14251f.m15553e();
            iM3195i = AbstractC2119a.m3195i(C7550o.m7903d(jM7904e2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectM15553e.onAbsorb(iM3195i);
            } else {
                edgeEffectM15553e.onAbsorb(iM3195i);
            }
        } else if (C7550o.m7903d(jM7904e2) < 0.0f) {
            edgeEffectM15550b = c14251f.m15550b();
            i11 = -AbstractC2119a.m3195i(C7550o.m7903d(jM7904e2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectM15550b.onAbsorb(i11);
            } else {
                edgeEffectM15550b.onAbsorb(i11);
            }
        }
        if (jM7904e2 != 0) {
            c14297n.m15585g();
        }
        c14297n.m15583b();
        return c17296c;
    }

    /* JADX INFO: renamed from: f */
    public final long m15584f() {
        C13800b c13800b = this.f44885Y;
        long jM8605c = c13800b != null ? c13800b.f43584a : AbstractC8112i6.m8605c(this.f44890r0);
        return AbstractC8088f6.m8536b(C13800b.m15306g(jM8605c) / C13803e.m15333e(this.f44890r0), C13800b.m15307h(jM8605c) / C13803e.m15331c(this.f44890r0));
    }

    /* JADX INFO: renamed from: g */
    public final void m15585g() {
        if (this.f44888p0) {
            this.f44887o0.setValue(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m15586h(long j10) {
        float fM15306g = C13800b.m15306g(m15584f());
        float fM15307h = C13800b.m15307h(j10) / C13803e.m15331c(this.f44890r0);
        EdgeEffect edgeEffectM15550b = this.f44886Z.m15550b();
        float fM15593c = -fM15307h;
        float f10 = 1 - fM15306g;
        int i10 = Build.VERSION.SDK_INT;
        C14299o c14299o = C14299o.f44894a;
        if (i10 >= 31) {
            fM15593c = c14299o.m15593c(edgeEffectM15550b, fM15593c, f10);
        } else {
            edgeEffectM15550b.onPull(fM15593c, f10);
        }
        return (i10 >= 31 ? c14299o.m15592b(edgeEffectM15550b) : 0.0f) == 0.0f ? C13803e.m15331c(this.f44890r0) * (-fM15593c) : C13800b.m15307h(j10);
    }

    /* JADX INFO: renamed from: i */
    public final float m15587i(long j10) {
        float fM15307h = C13800b.m15307h(m15584f());
        float fM15306g = C13800b.m15306g(j10) / C13803e.m15333e(this.f44890r0);
        EdgeEffect edgeEffectM15551c = this.f44886Z.m15551c();
        float f10 = 1 - fM15307h;
        int i10 = Build.VERSION.SDK_INT;
        C14299o c14299o = C14299o.f44894a;
        if (i10 >= 31) {
            fM15306g = c14299o.m15593c(edgeEffectM15551c, fM15306g, f10);
        } else {
            edgeEffectM15551c.onPull(fM15306g, f10);
        }
        return (i10 >= 31 ? c14299o.m15592b(edgeEffectM15551c) : 0.0f) == 0.0f ? C13803e.m15333e(this.f44890r0) * fM15306g : C13800b.m15306g(j10);
    }

    /* JADX INFO: renamed from: j */
    public final float m15588j(long j10) {
        float fM15307h = C13800b.m15307h(m15584f());
        float fM15306g = C13800b.m15306g(j10) / C13803e.m15333e(this.f44890r0);
        EdgeEffect edgeEffectM15552d = this.f44886Z.m15552d();
        float fM15593c = -fM15306g;
        int i10 = Build.VERSION.SDK_INT;
        C14299o c14299o = C14299o.f44894a;
        if (i10 >= 31) {
            fM15593c = c14299o.m15593c(edgeEffectM15552d, fM15593c, fM15307h);
        } else {
            edgeEffectM15552d.onPull(fM15593c, fM15307h);
        }
        return (i10 >= 31 ? c14299o.m15592b(edgeEffectM15552d) : 0.0f) == 0.0f ? C13803e.m15333e(this.f44890r0) * (-fM15593c) : C13800b.m15306g(j10);
    }

    /* JADX INFO: renamed from: k */
    public final float m15589k(long j10) {
        float fM15306g = C13800b.m15306g(m15584f());
        float fM15307h = C13800b.m15307h(j10) / C13803e.m15331c(this.f44890r0);
        EdgeEffect edgeEffectM15553e = this.f44886Z.m15553e();
        int i10 = Build.VERSION.SDK_INT;
        C14299o c14299o = C14299o.f44894a;
        if (i10 >= 31) {
            fM15307h = c14299o.m15593c(edgeEffectM15553e, fM15307h, fM15306g);
        } else {
            edgeEffectM15553e.onPull(fM15307h, fM15306g);
        }
        return (i10 >= 31 ? c14299o.m15592b(edgeEffectM15553e) : 0.0f) == 0.0f ? C13803e.m15331c(this.f44890r0) * fM15307h : C13800b.m15307h(j10);
    }

    /* JADX INFO: renamed from: l */
    public final void m15590l(long j10) {
        boolean zM15330b = C13803e.m15330b(this.f44890r0, 0L);
        boolean zM15330b2 = C13803e.m15330b(j10, this.f44890r0);
        this.f44890r0 = j10;
        if (!zM15330b2) {
            long jM9643a = AbstractC9113C4.m9643a(AbstractC2119a.m3195i(C13803e.m15333e(j10)), AbstractC2119a.m3195i(C13803e.m15331c(j10)));
            C14251F c14251f = this.f44886Z;
            c14251f.f44722c = jM9643a;
            EdgeEffect edgeEffect = c14251f.f44723d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c14251f.f44724e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c14251f.f44725f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM9643a & 4294967295L), (int) (jM9643a >> 32));
            }
            EdgeEffect edgeEffect4 = c14251f.f44726g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM9643a & 4294967295L), (int) (jM9643a >> 32));
            }
            EdgeEffect edgeEffect5 = c14251f.f44727h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c14251f.f44728i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c14251f.f44729j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM9643a & 4294967295L), (int) (jM9643a >> 32));
            }
            EdgeEffect edgeEffect8 = c14251f.f44730k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jM9643a & 4294967295L), (int) (jM9643a >> 32));
            }
        }
        if (zM15330b || zM15330b2) {
            return;
        }
        m15585g();
        m15583b();
    }
}
