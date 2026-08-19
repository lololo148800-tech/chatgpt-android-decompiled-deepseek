package p054C0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0130g;
import p1071w0.AbstractC20740b0;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.C21094o;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1140z1.InterfaceC21701k0;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21718w;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3585a;
import p204I1.C3590f;
import p204I1.InterfaceC3603s;
import p225Im.InterfaceC3776x;
import p230J1.C4199z;
import p328N1.InterfaceC5598n;
import p467T1.C7200j;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9393x3;
import p635a1.AbstractC10458p;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p774h1.InterfaceC14366v;
import p821j1.AbstractC16040e;
import p821j1.C16042g;

/* JADX INFO: renamed from: C0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1505r extends AbstractC10458p implements InterfaceC21718w, InterfaceC21708o, InterfaceC21701k0 {

    /* JADX INFO: renamed from: A0 */
    public C3582M f4008A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC5598n f4009B0;

    /* JADX INFO: renamed from: C0 */
    public int f4010C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f4011D0;

    /* JADX INFO: renamed from: E0 */
    public int f4012E0;

    /* JADX INFO: renamed from: F0 */
    public int f4013F0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC14366v f4014G0;

    /* JADX INFO: renamed from: H0 */
    public Map f4015H0;

    /* JADX INFO: renamed from: I0 */
    public C1492e f4016I0;

    /* JADX INFO: renamed from: J0 */
    public C1504q f4017J0;

    /* JADX INFO: renamed from: K0 */
    public C1503p f4018K0;

    /* JADX INFO: renamed from: z0 */
    public String f4019z0;

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        C1504q c1504q = this.f4017J0;
        if (c1504q == null) {
            c1504q = new C1504q(this, 0);
            this.f4017J0 = c1504q;
        }
        C3590f c3590f = new C3590f(6, this.f4019z0, null);
        InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
        c2963j.m3787m(C2971r.f8935u, AbstractC9393x3.m9974d(c3590f));
        C1503p c1503p = this.f4018K0;
        if (c1503p != null) {
            boolean z6 = c1503p.f4004c;
            C2974u c2974u = C2971r.f8937w;
            InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
            InterfaceC3776x interfaceC3776x = interfaceC3776xArr2[15];
            c2974u.m3814a(c2963j, Boolean.valueOf(z6));
            C3590f c3590f2 = new C3590f(6, c1503p.f4003b, null);
            C2974u c2974u2 = C2971r.f8936v;
            InterfaceC3776x interfaceC3776x2 = interfaceC3776xArr2[14];
            c2974u2.m3814a(c2963j, c3590f2);
        }
        c2963j.m3787m(AbstractC2962i.f8863j, new C2954a(null, new C1504q(this, 1)));
        c2963j.m3787m(AbstractC2962i.f8864k, new C2954a(null, new C1504q(this, 2)));
        c2963j.m3787m(AbstractC2962i.f8865l, new C2954a(null, new C0130g(this, 12)));
        AbstractC2973t.m3809d(c2963j, c1504q);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final C1492e m2167K0() {
        if (this.f4016I0 == null) {
            this.f4016I0 = new C1492e(this.f4019z0, this.f4008A0, this.f4009B0, this.f4010C0, this.f4011D0, this.f4012E0, this.f4013F0);
        }
        C1492e c1492e = this.f4016I0;
        AbstractC16544l.m18091d(c1492e);
        return c1492e;
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: L0 */
    public final C1492e m2168L0(InterfaceC7537b interfaceC7537b) {
        C1492e c1492e;
        C1503p c1503p = this.f4018K0;
        if (c1503p != null && c1503p.f4004c && (c1492e = c1503p.f4005d) != null) {
            c1492e.m2141c(interfaceC7537b);
            return c1492e;
        }
        C1492e c1492eM2167K0 = m2167K0();
        c1492eM2167K0.m2141c(interfaceC7537b);
        return c1492eM2167K0;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20740b0.m21275p(m2168L0(abstractC21668N).m2142d(abstractC21668N.getLayoutDirection()).mo3548e());
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        if (this.f30972y0) {
            C1492e c1492eM2168L0 = m2168L0(c21660f);
            C3585a c3585a = c1492eM2168L0.f3945j;
            if (c3585a == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f4016I0 + ", textSubstitution=" + this.f4018K0 + ')').toString());
            }
            InterfaceC14362r interfaceC14362rM15196m = c21660f.f68674Y.f49479Z.m15196m();
            boolean z6 = c1492eM2168L0.f3946k;
            if (z6) {
                long j10 = c1492eM2168L0.f3947l;
                interfaceC14362rM15196m.mo15706e();
                interfaceC14362rM15196m.mo15716o(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L), 1);
            }
            try {
                C3573D c3573d = this.f4008A0.f10910a;
                C7200j c7200j = c3573d.f10871m;
                if (c7200j == null) {
                    c7200j = C7200j.f22863b;
                }
                C7200j c7200j2 = c7200j;
                C14338P c14338p = c3573d.f10872n;
                if (c14338p == null) {
                    c14338p = C14338P.f45000d;
                }
                C14338P c14338p2 = c14338p;
                AbstractC16040e abstractC16040e = c3573d.f10874p;
                if (abstractC16040e == null) {
                    abstractC16040e = C16042g.f49483a;
                }
                AbstractC16040e abstractC16040e2 = abstractC16040e;
                AbstractC14360p abstractC14360pMo7591e = c3573d.f10859a.mo7591e();
                if (abstractC14360pMo7591e != null) {
                    c3585a.m4287g(interfaceC14362rM15196m, abstractC14360pMo7591e, this.f4008A0.f10910a.f10859a.mo7587a(), c14338p2, c7200j2, abstractC16040e2, 3);
                } else {
                    InterfaceC14366v interfaceC14366v = this.f4014G0;
                    long jMo4719a = interfaceC14366v != null ? interfaceC14366v.mo4719a() : C14365u.f45060j;
                    if (jMo4719a == 16) {
                        jMo4719a = this.f4008A0.m4277d() != 16 ? this.f4008A0.m4277d() : C14365u.f45052b;
                    }
                    c3585a.m4286f(interfaceC14362rM15196m, jMo4719a, c14338p2, c7200j2, abstractC16040e2, 3);
                }
            } finally {
                if (z6) {
                    interfaceC14362rM15196m.mo15719r();
                }
            }
        }
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        long jM2133a;
        boolean z6;
        InterfaceC3603s interfaceC3603s;
        C1492e c1492eM2168L0 = m2168L0(interfaceC21059M);
        EnumC7546k layoutDirection = interfaceC21059M.getLayoutDirection();
        if (c1492eM2168L0.f3942g > 1) {
            C1489b c1489b = c1492eM2168L0.f3948m;
            C3582M c3582m = c1492eM2168L0.f3937b;
            InterfaceC7537b interfaceC7537b = c1492eM2168L0.f3944i;
            AbstractC16544l.m18091d(interfaceC7537b);
            C1489b c1489bM8089a = AbstractC7841A0.m8089a(c1489b, layoutDirection, c3582m, interfaceC7537b, c1492eM2168L0.f3938c);
            c1492eM2168L0.f3948m = c1489bM8089a;
            jM2133a = c1489bM8089a.m2133a(c1492eM2168L0.f3942g, j10);
        } else {
            jM2133a = j10;
        }
        C3585a c3585a = c1492eM2168L0.f3945j;
        if (c3585a == null || (interfaceC3603s = c1492eM2168L0.f3949n) == null || interfaceC3603s.mo3544a() || layoutDirection != c1492eM2168L0.f3950o || (!C7536a.m7848c(jM2133a, c1492eM2168L0.f3951p) && (C7536a.m7854i(jM2133a) != C7536a.m7854i(c1492eM2168L0.f3951p) || C7536a.m7853h(jM2133a) < c3585a.m4282b() || c3585a.f10918d.f13638d))) {
            C3585a c3585aM2140b = c1492eM2168L0.m2140b(jM2133a, layoutDirection);
            c1492eM2168L0.f3951p = jM2133a;
            long jM9962e = AbstractC9388w4.m9962e(jM2133a, AbstractC9113C4.m9643a(AbstractC20740b0.m21275p(c3585aM2140b.m4284d()), AbstractC20740b0.m21275p(c3585aM2140b.m4282b())));
            c1492eM2168L0.f3947l = jM9962e;
            c1492eM2168L0.f3946k = !AbstractC9160K3.m9708a(c1492eM2168L0.f3939d, 3) && (((float) ((int) (jM9962e >> 32))) < c3585aM2140b.m4284d() || ((float) ((int) (jM9962e & 4294967295L))) < c3585aM2140b.m4282b());
            c1492eM2168L0.f3945j = c3585aM2140b;
            z6 = true;
        } else {
            if (!C7536a.m7848c(jM2133a, c1492eM2168L0.f3951p)) {
                C3585a c3585a2 = c1492eM2168L0.f3945j;
                AbstractC16544l.m18091d(c3585a2);
                long jM9962e2 = AbstractC9388w4.m9962e(jM2133a, AbstractC9113C4.m9643a(AbstractC20740b0.m21275p(Math.min(c3585a2.f10915a.f21205u0.m4882b(), c3585a2.m4284d())), AbstractC20740b0.m21275p(c3585a2.m4282b())));
                c1492eM2168L0.f3947l = jM9962e2;
                c1492eM2168L0.f3946k = !AbstractC9160K3.m9708a(c1492eM2168L0.f3939d, 3) && (((float) ((int) (jM9962e2 >> 32))) < c3585a2.m4284d() || ((float) ((int) (jM9962e2 & 4294967295L))) < c3585a2.m4282b());
                c1492eM2168L0.f3951p = jM2133a;
            }
            z6 = false;
        }
        InterfaceC3603s interfaceC3603s2 = c1492eM2168L0.f3949n;
        if (interfaceC3603s2 != null) {
            interfaceC3603s2.mo3544a();
        }
        C3585a c3585a3 = c1492eM2168L0.f3945j;
        AbstractC16544l.m18091d(c3585a3);
        long j11 = c1492eM2168L0.f3947l;
        if (z6) {
            AbstractC21690f.m22215t(this, 2).m22165P0();
            Map linkedHashMap = this.f4015H0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            C21094o c21094o = AbstractC21076c.f66994a;
            C4199z c4199z = c3585a3.f10918d;
            linkedHashMap.put(c21094o, Integer.valueOf(Math.round(c4199z.m4897d(0))));
            linkedHashMap.put(AbstractC21076c.f66995b, Integer.valueOf(Math.round(c4199z.m4897d(c4199z.f13641g - 1))));
            this.f4015H0 = linkedHashMap;
        }
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        int iMin = Math.min(i10, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int iM9960c = AbstractC9388w4.m9960c(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iMin, iMin2, Math.min(iM9960c, i11), i11 != Integer.MAX_VALUE ? Math.min(iM9960c, i11) : Integer.MAX_VALUE));
        Map map = this.f4015H0;
        AbstractC16544l.m18091d(map);
        return interfaceC21059M.mo19936R(i10, i11, map, new C1501n(abstractC21069XMo21533p, 1));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return m2168L0(abstractC21668N).m2139a(i10, abstractC21668N.getLayoutDirection());
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return m2168L0(abstractC21668N).m2139a(i10, abstractC21668N.getLayoutDirection());
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20740b0.m21275p(m2168L0(abstractC21668N).m2142d(abstractC21668N.getLayoutDirection()).mo3546c());
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }
}
