package p821j1;

import android.graphics.Paint;
import android.graphics.Shader;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p228J.AbstractC3794B0;
import p492U1.C7538c;
import p492U1.EnumC7546k;
import p523V9.AbstractC8112i6;
import p759g1.AbstractC13799a;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14360p;
import p774h1.C14351g;
import p774h1.C14356l;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;
import p985r9.C18903m;

/* JADX INFO: renamed from: j1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16037b implements InterfaceC16039d {

    /* JADX INFO: renamed from: Y */
    public final C16036a f49478Y;

    /* JADX INFO: renamed from: Z */
    public final C13711h f49479Z;

    /* JADX INFO: renamed from: o0 */
    public C18903m f49480o0;

    /* JADX INFO: renamed from: p0 */
    public C18903m f49481p0;

    public C16037b() {
        C7538c c7538c = AbstractC16038c.f49482a;
        EnumC7546k enumC7546k = EnumC7546k.f23904Y;
        C16041f c16041f = new C16041f();
        C16036a c16036a = new C16036a();
        c16036a.f49474a = c7538c;
        c16036a.f49475b = enumC7546k;
        c16036a.f49476c = c16041f;
        c16036a.f49477d = 0L;
        this.f49478Y = c16036a;
        this.f49479Z = new C13711h(this);
    }

    /* JADX INFO: renamed from: a */
    public static C18903m m17589a(C16037b c16037b, long j10, AbstractC16040e abstractC16040e, float f10, C14356l c14356l, int i10) {
        C18903m c18903mM17598d = c16037b.m17598d(abstractC16040e);
        if (f10 != 1.0f) {
            j10 = C14365u.m15774b(C14365u.m15776d(j10) * f10, j10);
        }
        if (!C14365u.m15775c(AbstractC14334L.m15625c(((Paint) c18903mM17598d.f60268b).getColor()), j10)) {
            c18903mM17598d.m20222f(j10);
        }
        if (((Shader) c18903mM17598d.f60269c) != null) {
            c18903mM17598d.m20225i(null);
        }
        if (!AbstractC16544l.m18089b((C14356l) c18903mM17598d.f60270d, c14356l)) {
            c18903mM17598d.m20223g(c14356l);
        }
        if (!AbstractC14334L.m15639q(c18903mM17598d.f60267a, i10)) {
            c18903mM17598d.m20221e(i10);
        }
        if (!AbstractC14334L.m15641s(((Paint) c18903mM17598d.f60268b).isFilterBitmap() ? 1 : 0, 1)) {
            c18903mM17598d.m20224h(1);
        }
        return c18903mM17598d;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m17600e(mo7861O(i10));
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: I */
    public final void mo17590I(C14351g c14351g, long j10, long j11, long j12, long j13, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10, int i11) {
        this.f49478Y.f49476c.mo15705d(c14351g, j10, j11, j12, j13, m17595b(null, abstractC16040e, f10, c14356l, i10, i11));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m17600e(mo7862P(f10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return i10 / getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / getDensity();
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: U */
    public final void mo17591U(long j10, float f10, long j11, float f11, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15720s(f10, j11, m17589a(this, j10, abstractC16040e, f11, c14356l, i10));
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: W */
    public final void mo17592W(AbstractC14360p abstractC14360p, long j10, long j11, long j12, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15715n(C13800b.m15306g(j10), C13800b.m15307h(j10), C13803e.m15333e(j11) + C13800b.m15306g(j10), C13803e.m15331c(j11) + C13800b.m15307h(j10), AbstractC13799a.m15297b(j12), AbstractC13799a.m15298c(j12), m17595b(abstractC14360p, abstractC16040e, f10, c14356l, i10, 1));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f49478Y.f49474a.mo7863X();
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: Y */
    public final void mo17593Y(long j10, long j11, long j12, long j13, AbstractC16040e abstractC16040e, float f10, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15715n(C13800b.m15306g(j11), C13800b.m15307h(j11), C13803e.m15333e(j12) + C13800b.m15306g(j11), C13803e.m15331c(j12) + C13800b.m15307h(j11), AbstractC13799a.m15297b(j13), AbstractC13799a.m15298c(j13), m17589a(this, j10, abstractC16040e, f10, c14356l, i10));
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: a0 */
    public final void mo17594a0(AbstractC14360p abstractC14360p, long j10, long j11, float f10, int i10, float f11, C14356l c14356l, int i11) {
        InterfaceC14362r interfaceC14362r = this.f49478Y.f49476c;
        C18903m c18903mM17596c = m17596c();
        if (abstractC14360p != null) {
            abstractC14360p.mo15664a(f11, this.f49479Z.m15202x(), c18903mM17596c);
        } else if (((Paint) c18903mM17596c.f60268b).getAlpha() / 255.0f != f11) {
            c18903mM17596c.m20220d(f11);
        }
        if (!AbstractC16544l.m18089b((C14356l) c18903mM17596c.f60270d, c14356l)) {
            c18903mM17596c.m20223g(c14356l);
        }
        if (!AbstractC14334L.m15639q(c18903mM17596c.f60267a, i11)) {
            c18903mM17596c.m20221e(i11);
        }
        Paint paint = (Paint) c18903mM17596c.f60268b;
        if (paint.getStrokeWidth() != f10) {
            c18903mM17596c.m20228l(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) c18903mM17596c.f60268b).setStrokeMiter(4.0f);
        }
        if (!AbstractC14334L.m15642t(c18903mM17596c.m20218b(), i10)) {
            c18903mM17596c.m20226j(i10);
        }
        if (!AbstractC14334L.m15643u(c18903mM17596c.m20219c(), 0)) {
            c18903mM17596c.m20227k(0);
        }
        if (!AbstractC16544l.m18089b(null, null)) {
            ((Paint) c18903mM17596c.f60268b).setPathEffect(null);
        }
        if (!AbstractC14334L.m15641s(paint.isFilterBitmap() ? 1 : 0, 1)) {
            c18903mM17596c.m20224h(1);
        }
        interfaceC14362r.mo15711j(j10, j11, c18903mM17596c);
    }

    /* JADX INFO: renamed from: b */
    public final C18903m m17595b(AbstractC14360p abstractC14360p, AbstractC16040e abstractC16040e, float f10, C14356l c14356l, int i10, int i11) {
        C18903m c18903mM17598d = m17598d(abstractC16040e);
        if (abstractC14360p != null) {
            abstractC14360p.mo15664a(f10, this.f49479Z.m15202x(), c18903mM17598d);
        } else {
            if (((Shader) c18903mM17598d.f60269c) != null) {
                c18903mM17598d.m20225i(null);
            }
            long jM15625c = AbstractC14334L.m15625c(((Paint) c18903mM17598d.f60268b).getColor());
            long j10 = C14365u.f45052b;
            if (!C14365u.m15775c(jM15625c, j10)) {
                c18903mM17598d.m20222f(j10);
            }
            if (((Paint) c18903mM17598d.f60268b).getAlpha() / 255.0f != f10) {
                c18903mM17598d.m20220d(f10);
            }
        }
        if (!AbstractC16544l.m18089b((C14356l) c18903mM17598d.f60270d, c14356l)) {
            c18903mM17598d.m20223g(c14356l);
        }
        if (!AbstractC14334L.m15639q(c18903mM17598d.f60267a, i10)) {
            c18903mM17598d.m20221e(i10);
        }
        if (!AbstractC14334L.m15641s(((Paint) c18903mM17598d.f60268b).isFilterBitmap() ? 1 : 0, i11)) {
            c18903mM17598d.m20224h(i11);
        }
        return c18903mM17598d;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return getDensity() * f10;
    }

    /* JADX INFO: renamed from: c */
    public final C18903m m17596c() {
        C18903m c18903m = this.f49481p0;
        if (c18903m != null) {
            return c18903m;
        }
        C18903m c18903mM15630h = AbstractC14334L.m15630h();
        c18903mM15630h.m20229m(1);
        this.f49481p0 = c18903mM15630h;
        return c18903mM15630h;
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: c0 */
    public final void mo17597c0(long j10, long j11, long j12, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15710i(C13800b.m15306g(j11), C13800b.m15307h(j11), C13803e.m15333e(j12) + C13800b.m15306g(j11), C13803e.m15331c(j12) + C13800b.m15307h(j11), m17589a(this, j10, abstractC16040e, f10, c14356l, i10));
    }

    /* JADX INFO: renamed from: d */
    public final C18903m m17598d(AbstractC16040e abstractC16040e) {
        if (AbstractC16544l.m18089b(abstractC16040e, C16042g.f49483a)) {
            C18903m c18903m = this.f49480o0;
            if (c18903m != null) {
                return c18903m;
            }
            C18903m c18903mM15630h = AbstractC14334L.m15630h();
            c18903mM15630h.m20229m(0);
            this.f49480o0 = c18903mM15630h;
            return c18903mM15630h;
        }
        if (!(abstractC16040e instanceof C16043h)) {
            throw new C0644w();
        }
        C18903m c18903mM17596c = m17596c();
        Paint paint = (Paint) c18903mM17596c.f60268b;
        float strokeWidth = paint.getStrokeWidth();
        C16043h c16043h = (C16043h) abstractC16040e;
        float f10 = c16043h.f49484a;
        if (strokeWidth != f10) {
            c18903mM17596c.m20228l(f10);
        }
        int iM20218b = c18903mM17596c.m20218b();
        int i10 = c16043h.f49486c;
        if (!AbstractC14334L.m15642t(iM20218b, i10)) {
            c18903mM17596c.m20226j(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = c16043h.f49485b;
        if (strokeMiter != f11) {
            ((Paint) c18903mM17596c.f60268b).setStrokeMiter(f11);
        }
        int iM20219c = c18903mM17596c.m20219c();
        int i11 = c16043h.f49487d;
        if (!AbstractC14334L.m15643u(iM20219c, i11)) {
            c18903mM17596c.m20227k(i11);
        }
        if (!AbstractC16544l.m18089b(null, null)) {
            ((Paint) c18903mM17596c.f60268b).setPathEffect(null);
        }
        return c18903mM17596c;
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: d0 */
    public final void mo17599d0(AbstractC14360p abstractC14360p, long j10, long j11, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15710i(C13800b.m15306g(j10), C13800b.m15307h(j10), C13803e.m15333e(j11) + C13800b.m15306g(j10), C13803e.m15331c(j11) + C13800b.m15307h(j10), m17595b(abstractC14360p, abstractC16040e, f10, c14356l, i10, 1));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long m17600e(float f10) {
        return AbstractC3794B0.m4490o(this, f10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: f0 */
    public final C13711h mo17601f0() {
        return this.f49479Z;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f49478Y.f49474a.getDensity();
    }

    @Override // p821j1.InterfaceC16039d
    public final EnumC7546k getLayoutDirection() {
        return this.f49478Y.f49475b;
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: i */
    public final long mo17602i() {
        return this.f49479Z.m15202x();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return Math.round(mo7869t0(j10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ int mo7866k0(float f10) {
        return AbstractC3794B0.m4485j(this, f10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: m */
    public final void mo17603m(InterfaceC14333K interfaceC14333K, AbstractC14360p abstractC14360p, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15713l(interfaceC14333K, m17595b(abstractC14360p, abstractC16040e, f10, c14356l, i10, 1));
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: o0 */
    public final long mo17604o0() {
        return AbstractC8112i6.m8605c(this.f49479Z.m15202x());
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: r */
    public final void mo17605r(InterfaceC14333K interfaceC14333K, long j10, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15713l(interfaceC14333K, m17589a(this, j10, abstractC16040e, f10, c14356l, i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long mo7867r0(long j10) {
        return AbstractC3794B0.m4489n(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long mo7868s(long j10) {
        return AbstractC3794B0.m4487l(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float mo7869t0(long j10) {
        return AbstractC3794B0.m4488m(j10, this);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: v */
    public final void mo17606v(long j10, float f10, float f11, long j11, long j12, float f12, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f49478Y.f49476c.mo15718q(C13800b.m15306g(j11), C13800b.m15307h(j11), C13803e.m15333e(j12) + C13800b.m15306g(j11), C13803e.m15331c(j12) + C13800b.m15307h(j11), f10, f11, m17589a(this, j10, abstractC16040e, f12, c14356l, i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float mo7870w(long j10) {
        return AbstractC3794B0.m4486k(j10, this);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: x0 */
    public final void mo17607x0(long j10, long j11, long j12, float f10, int i10, float f11, C14356l c14356l, int i11) {
        InterfaceC14362r interfaceC14362r = this.f49478Y.f49476c;
        C18903m c18903mM17596c = m17596c();
        long jM15774b = f11 == 1.0f ? j10 : C14365u.m15774b(C14365u.m15776d(j10) * f11, j10);
        if (!C14365u.m15775c(AbstractC14334L.m15625c(((Paint) c18903mM17596c.f60268b).getColor()), jM15774b)) {
            c18903mM17596c.m20222f(jM15774b);
        }
        if (((Shader) c18903mM17596c.f60269c) != null) {
            c18903mM17596c.m20225i(null);
        }
        if (!AbstractC16544l.m18089b((C14356l) c18903mM17596c.f60270d, c14356l)) {
            c18903mM17596c.m20223g(c14356l);
        }
        if (!AbstractC14334L.m15639q(c18903mM17596c.f60267a, i11)) {
            c18903mM17596c.m20221e(i11);
        }
        Paint paint = (Paint) c18903mM17596c.f60268b;
        if (paint.getStrokeWidth() != f10) {
            c18903mM17596c.m20228l(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) c18903mM17596c.f60268b).setStrokeMiter(4.0f);
        }
        if (!AbstractC14334L.m15642t(c18903mM17596c.m20218b(), i10)) {
            c18903mM17596c.m20226j(i10);
        }
        if (!AbstractC14334L.m15643u(c18903mM17596c.m20219c(), 0)) {
            c18903mM17596c.m20227k(0);
        }
        if (!AbstractC16544l.m18089b(null, null)) {
            ((Paint) c18903mM17596c.f60268b).setPathEffect(null);
        }
        if (!AbstractC14334L.m15641s(paint.isFilterBitmap() ? 1 : 0, 1)) {
            c18903mM17596c.m20224h(1);
        }
        interfaceC14362r.mo15711j(j11, j12, c18903mM17596c);
    }
}
