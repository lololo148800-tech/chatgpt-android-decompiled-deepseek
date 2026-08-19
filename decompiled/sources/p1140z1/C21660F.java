package p1140z1;

import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;
import p392Q0.C6546d;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p774h1.AbstractC14360p;
import p774h1.C14351g;
import p774h1.C14356l;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;
import p821j1.AbstractC16040e;
import p821j1.C16037b;
import p821j1.InterfaceC16039d;
import p843k1.C16308b;

/* JADX INFO: renamed from: z1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C21660F implements InterfaceC16039d {

    /* JADX INFO: renamed from: Y */
    public final C16037b f68674Y = new C16037b();

    /* JADX INFO: renamed from: Z */
    public InterfaceC21708o f68675Z;

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return this.f68674Y.mo7859F(i10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: I */
    public final void mo17590I(C14351g c14351g, long j10, long j11, long j12, long j13, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10, int i11) {
        this.f68674Y.mo17590I(c14351g, j10, j11, j12, j13, f10, abstractC16040e, c14356l, i10, i11);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return this.f68674Y.mo7860J(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return this.f68674Y.mo7861O(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / this.f68674Y.getDensity();
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: U */
    public final void mo17591U(long j10, float f10, long j11, float f11, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17591U(j10, f10, j11, f11, abstractC16040e, c14356l, i10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: W */
    public final void mo17592W(AbstractC14360p abstractC14360p, long j10, long j11, long j12, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17592W(abstractC14360p, j10, j11, j12, f10, abstractC16040e, c14356l, i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f68674Y.mo7863X();
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: Y */
    public final void mo17593Y(long j10, long j11, long j12, long j13, AbstractC16040e abstractC16040e, float f10, C14356l c14356l, int i10) {
        this.f68674Y.mo17593Y(j10, j11, j12, j13, abstractC16040e, f10, c14356l, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m22080a() {
        C16037b c16037b = this.f68674Y;
        InterfaceC14362r interfaceC14362rM15196m = c16037b.f49479Z.m15196m();
        InterfaceC21704m interfaceC21704m = this.f68675Z;
        AbstractC16544l.m18091d(interfaceC21704m);
        AbstractC10458p abstractC10458p = (AbstractC10458p) interfaceC21704m;
        AbstractC10458p abstractC10458pM22201f = abstractC10458p.f30960Y.f30965r0;
        if (abstractC10458pM22201f != null && (abstractC10458pM22201f.f30963p0 & 4) != 0) {
            while (true) {
                if (abstractC10458pM22201f != null) {
                    int i10 = abstractC10458pM22201f.f30962o0;
                    if ((i10 & 2) == 0) {
                        if ((i10 & 4) != 0) {
                            break;
                        } else {
                            abstractC10458pM22201f = abstractC10458pM22201f.f30965r0;
                        }
                    }
                }
                abstractC10458pM22201f = null;
                break;
            }
        } else {
            abstractC10458pM22201f = null;
            break;
        }
        if (abstractC10458pM22201f == null) {
            AbstractC21678Y abstractC21678YM22215t = AbstractC21690f.m22215t(interfaceC21704m, 4);
            if (abstractC21678YM22215t.mo22159J0() == abstractC10458p.f30960Y) {
                abstractC21678YM22215t = abstractC21678YM22215t.f68820y0;
                AbstractC16544l.m18091d(abstractC21678YM22215t);
            }
            abstractC21678YM22215t.mo22171V0(interfaceC14362rM15196m, (C16308b) c16037b.f49479Z.f43260o0);
            return;
        }
        C6546d c6546d = null;
        while (abstractC10458pM22201f != null) {
            if (abstractC10458pM22201f instanceof InterfaceC21708o) {
                InterfaceC21708o interfaceC21708o = (InterfaceC21708o) abstractC10458pM22201f;
                C16308b c16308b = (C16308b) c16037b.f49479Z.f43260o0;
                AbstractC21678Y abstractC21678YM22215t2 = AbstractC21690f.m22215t(interfaceC21708o, 4);
                long jM9645c = AbstractC9113C4.m9645c(abstractC21678YM22215t2.f66983o0);
                C21658D c21658d = abstractC21678YM22215t2.f68819x0;
                c21658d.getClass();
                AbstractC21661G.m22082a(c21658d).getSharedDrawScope().m22081b(interfaceC14362rM15196m, jM9645c, abstractC21678YM22215t2, interfaceC21708o, c16308b);
            } else if ((abstractC10458pM22201f.f30962o0 & 4) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                int i11 = 0;
                for (AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
                    if ((abstractC10458p2.f30962o0 & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            abstractC10458pM22201f = abstractC10458p2;
                        } else {
                            if (c6546d == null) {
                                c6546d = new C6546d(new AbstractC10458p[16]);
                            }
                            if (abstractC10458pM22201f != null) {
                                c6546d.m7099c(abstractC10458pM22201f);
                                abstractC10458pM22201f = null;
                            }
                            c6546d.m7099c(abstractC10458p2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
        }
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: a0 */
    public final void mo17594a0(AbstractC14360p abstractC14360p, long j10, long j11, float f10, int i10, float f11, C14356l c14356l, int i11) {
        this.f68674Y.mo17594a0(abstractC14360p, j10, j11, f10, i10, f11, c14356l, i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m22081b(InterfaceC14362r interfaceC14362r, long j10, AbstractC21678Y abstractC21678Y, InterfaceC21708o interfaceC21708o, C16308b c16308b) {
        InterfaceC21708o interfaceC21708o2 = this.f68675Z;
        this.f68675Z = interfaceC21708o;
        EnumC7546k enumC7546k = abstractC21678Y.f68819x0.f68634E0;
        C16037b c16037b = this.f68674Y;
        InterfaceC7537b interfaceC7537bM15197n = c16037b.f49479Z.m15197n();
        C13711h c13711h = c16037b.f49479Z;
        EnumC7546k enumC7546kM15201w = c13711h.m15201w();
        InterfaceC14362r interfaceC14362rM15196m = c13711h.m15196m();
        long jM15202x = c13711h.m15202x();
        C16308b c16308b2 = (C16308b) c13711h.f43260o0;
        c13711h.m15186I(abstractC21678Y);
        c13711h.m15188K(enumC7546k);
        c13711h.m15185H(interfaceC14362r);
        c13711h.m15189L(j10);
        c13711h.f43260o0 = c16308b;
        interfaceC14362r.mo15706e();
        try {
            interfaceC21708o.mo430e(this);
            interfaceC14362r.mo15719r();
            c13711h.m15186I(interfaceC7537bM15197n);
            c13711h.m15188K(enumC7546kM15201w);
            c13711h.m15185H(interfaceC14362rM15196m);
            c13711h.m15189L(jM15202x);
            c13711h.f43260o0 = c16308b2;
            this.f68675Z = interfaceC21708o2;
        } catch (Throwable th2) {
            interfaceC14362r.mo15719r();
            c13711h.m15186I(interfaceC7537bM15197n);
            c13711h.m15188K(enumC7546kM15201w);
            c13711h.m15185H(interfaceC14362rM15196m);
            c13711h.m15189L(jM15202x);
            c13711h.f43260o0 = c16308b2;
            throw th2;
        }
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return this.f68674Y.getDensity() * f10;
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: c0 */
    public final void mo17597c0(long j10, long j11, long j12, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17597c0(j10, j11, j12, f10, abstractC16040e, c14356l, i10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: d0 */
    public final void mo17599d0(AbstractC14360p abstractC14360p, long j10, long j11, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17599d0(abstractC14360p, j10, j11, f10, abstractC16040e, c14356l, i10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: f0 */
    public final C13711h mo17601f0() {
        return this.f68674Y.f49479Z;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f68674Y.getDensity();
    }

    @Override // p821j1.InterfaceC16039d
    public final EnumC7546k getLayoutDirection() {
        return this.f68674Y.f49478Y.f49475b;
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: i */
    public final long mo17602i() {
        return this.f68674Y.f49479Z.m15202x();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return this.f68674Y.mo7865i0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final int mo7866k0(float f10) {
        C16037b c16037b = this.f68674Y;
        c16037b.getClass();
        return AbstractC3794B0.m4485j(c16037b, f10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: m */
    public final void mo17603m(InterfaceC14333K interfaceC14333K, AbstractC14360p abstractC14360p, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17603m(interfaceC14333K, abstractC14360p, f10, abstractC16040e, c14356l, i10);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: o0 */
    public final long mo17604o0() {
        return this.f68674Y.mo17604o0();
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: r */
    public final void mo17605r(InterfaceC14333K interfaceC14333K, long j10, float f10, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17605r(interfaceC14333K, j10, f10, abstractC16040e, c14356l, i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final long mo7867r0(long j10) {
        C16037b c16037b = this.f68674Y;
        c16037b.getClass();
        return AbstractC3794B0.m4489n(j10, c16037b);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final long mo7868s(long j10) {
        C16037b c16037b = this.f68674Y;
        c16037b.getClass();
        return AbstractC3794B0.m4487l(j10, c16037b);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final float mo7869t0(long j10) {
        C16037b c16037b = this.f68674Y;
        c16037b.getClass();
        return AbstractC3794B0.m4488m(j10, c16037b);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: v */
    public final void mo17606v(long j10, float f10, float f11, long j11, long j12, float f12, AbstractC16040e abstractC16040e, C14356l c14356l, int i10) {
        this.f68674Y.mo17606v(j10, f10, f11, j11, j12, f12, abstractC16040e, c14356l, i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final float mo7870w(long j10) {
        C16037b c16037b = this.f68674Y;
        c16037b.getClass();
        return AbstractC3794B0.m4486k(j10, c16037b);
    }

    @Override // p821j1.InterfaceC16039d
    /* JADX INFO: renamed from: x0 */
    public final void mo17607x0(long j10, long j11, long j12, float f10, int i10, float f11, C14356l c14356l, int i11) {
        this.f68674Y.mo17607x0(j10, j11, j12, f10, i10, f11, c14356l, i11);
    }
}
