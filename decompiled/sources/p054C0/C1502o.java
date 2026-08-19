package p054C0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0130g;
import p049Bm.InterfaceC1436k;
import p080D0.C1821o0;
import p080D0.C1842z;
import p1071w0.AbstractC20740b0;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21701k0;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21718w;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3582M;
import p204I1.C3590f;
import p204I1.C3599o;
import p225Im.InterfaceC3776x;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9393x3;
import p635a1.AbstractC10458p;
import p774h1.InterfaceC14366v;
import p909nm.C17689w;

/* JADX INFO: renamed from: C0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1502o extends AbstractC10458p implements InterfaceC21718w, InterfaceC21708o, InterfaceC21701k0 {

    /* JADX INFO: renamed from: A0 */
    public C3582M f3985A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC5598n f3986B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC1436k f3987C0;

    /* JADX INFO: renamed from: D0 */
    public int f3988D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f3989E0;

    /* JADX INFO: renamed from: F0 */
    public int f3990F0;

    /* JADX INFO: renamed from: G0 */
    public int f3991G0;

    /* JADX INFO: renamed from: H0 */
    public List f3992H0;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC1436k f3993I0;

    /* JADX INFO: renamed from: J0 */
    public C1495h f3994J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC14366v f3995K0;

    /* JADX INFO: renamed from: L0 */
    public InterfaceC1436k f3996L0;

    /* JADX INFO: renamed from: M0 */
    public Map f3997M0;

    /* JADX INFO: renamed from: N0 */
    public C1491d f3998N0;

    /* JADX INFO: renamed from: O0 */
    public C1500m f3999O0;

    /* JADX INFO: renamed from: P0 */
    public C1499l f4000P0;

    /* JADX INFO: renamed from: z0 */
    public C3590f f4001z0;

    public C1502o(C3590f c3590f, C3582M c3582m, InterfaceC5598n interfaceC5598n, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, int i12, List list, InterfaceC1436k interfaceC1436k2, C1495h c1495h, InterfaceC14366v interfaceC14366v, InterfaceC1436k interfaceC1436k3) {
        this.f4001z0 = c3590f;
        this.f3985A0 = c3582m;
        this.f3986B0 = interfaceC5598n;
        this.f3987C0 = interfaceC1436k;
        this.f3988D0 = i10;
        this.f3989E0 = z6;
        this.f3990F0 = i11;
        this.f3991G0 = i12;
        this.f3992H0 = list;
        this.f3993I0 = interfaceC1436k2;
        this.f3994J0 = c1495h;
        this.f3995K0 = interfaceC14366v;
        this.f3996L0 = interfaceC1436k3;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        C1500m c1500m = this.f3999O0;
        if (c1500m == null) {
            c1500m = new C1500m(this, 0);
            this.f3999O0 = c1500m;
        }
        C3590f c3590f = this.f4001z0;
        InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
        c2963j.m3787m(C2971r.f8935u, AbstractC9393x3.m9974d(c3590f));
        C1499l c1499l = this.f4000P0;
        if (c1499l != null) {
            C3590f c3590f2 = c1499l.f3978b;
            C2974u c2974u = C2971r.f8936v;
            InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
            InterfaceC3776x interfaceC3776x = interfaceC3776xArr2[14];
            c2974u.m3814a(c2963j, c3590f2);
            boolean z6 = c1499l.f3979c;
            C2974u c2974u2 = C2971r.f8937w;
            InterfaceC3776x interfaceC3776x2 = interfaceC3776xArr2[15];
            c2974u2.m3814a(c2963j, Boolean.valueOf(z6));
        }
        c2963j.m3787m(AbstractC2962i.f8863j, new C2954a(null, new C1500m(this, 1)));
        c2963j.m3787m(AbstractC2962i.f8864k, new C2954a(null, new C1500m(this, 2)));
        c2963j.m3787m(AbstractC2962i.f8865l, new C2954a(null, new C0130g(this, 11)));
        AbstractC2973t.m3809d(c2963j, c1500m);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2161K0(boolean z6, boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            C1491d c1491dM2162L0 = m2162L0();
            C3590f c3590f = this.f4001z0;
            C3582M c3582m = this.f3985A0;
            InterfaceC5598n interfaceC5598n = this.f3986B0;
            int i10 = this.f3988D0;
            boolean z13 = this.f3989E0;
            int i11 = this.f3990F0;
            int i12 = this.f3991G0;
            List list = this.f3992H0;
            c1491dM2162L0.f3920a = c3590f;
            c1491dM2162L0.f3921b = c3582m;
            c1491dM2162L0.f3922c = interfaceC5598n;
            c1491dM2162L0.f3923d = i10;
            c1491dM2162L0.f3924e = z13;
            c1491dM2162L0.f3925f = i11;
            c1491dM2162L0.f3926g = i12;
            c1491dM2162L0.f3927h = list;
            c1491dM2162L0.f3931l = null;
            c1491dM2162L0.f3933n = null;
            c1491dM2162L0.f3935p = -1;
            c1491dM2162L0.f3934o = -1;
        }
        if (this.f30972y0) {
            if (z10 || (z6 && this.f3999O0 != null)) {
                AbstractC21690f.m22211p(this);
            }
            if (z10 || z11 || z12) {
                AbstractC21690f.m22210o(this);
                AbstractC21690f.m22209n(this);
            }
            if (z6) {
                AbstractC21690f.m22209n(this);
            }
        }
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: L0 */
    public final C1491d m2162L0() {
        if (this.f3998N0 == null) {
            this.f3998N0 = new C1491d(this.f4001z0, this.f3985A0, this.f3986B0, this.f3988D0, this.f3989E0, this.f3990F0, this.f3991G0, this.f3992H0);
        }
        C1491d c1491d = this.f3998N0;
        AbstractC16544l.m18091d(c1491d);
        return c1491d;
    }

    /* JADX INFO: renamed from: M0 */
    public final C1491d m2163M0(InterfaceC7537b interfaceC7537b) {
        C1491d c1491d;
        C1499l c1499l = this.f4000P0;
        if (c1499l != null && c1499l.f3979c && (c1491d = c1499l.f3980d) != null) {
            c1491d.m2136c(interfaceC7537b);
            return c1491d;
        }
        C1491d c1491dM2162L0 = m2162L0();
        c1491dM2162L0.m2136c(interfaceC7537b);
        return c1491dM2162L0;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m2164N0(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C1495h c1495h, InterfaceC1436k interfaceC1436k3) {
        boolean z6;
        if (this.f3987C0 != interfaceC1436k) {
            this.f3987C0 = interfaceC1436k;
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f3993I0 != interfaceC1436k2) {
            this.f3993I0 = interfaceC1436k2;
            z6 = true;
        }
        if (!AbstractC16544l.m18089b(this.f3994J0, c1495h)) {
            this.f3994J0 = c1495h;
            z6 = true;
        }
        if (this.f3996L0 == interfaceC1436k3) {
            return z6;
        }
        this.f3996L0 = interfaceC1436k3;
        return true;
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m2165O0(C3582M c3582m, List list, int i10, int i11, boolean z6, InterfaceC5598n interfaceC5598n, int i12) {
        boolean z10 = !this.f3985A0.m4279f(c3582m);
        this.f3985A0 = c3582m;
        if (!AbstractC16544l.m18089b(this.f3992H0, list)) {
            this.f3992H0 = list;
            z10 = true;
        }
        if (this.f3991G0 != i10) {
            this.f3991G0 = i10;
            z10 = true;
        }
        if (this.f3990F0 != i11) {
            this.f3990F0 = i11;
            z10 = true;
        }
        if (this.f3989E0 != z6) {
            this.f3989E0 = z6;
            z10 = true;
        }
        if (!AbstractC16544l.m18089b(this.f3986B0, interfaceC5598n)) {
            this.f3986B0 = interfaceC5598n;
            z10 = true;
        }
        if (AbstractC9160K3.m9708a(this.f3988D0, i12)) {
            return z10;
        }
        this.f3988D0 = i12;
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m2166P0(C3590f c3590f) {
        boolean zM18089b = AbstractC16544l.m18089b(this.f4001z0.f10934Y, c3590f.f10934Y);
        boolean zEquals = this.f4001z0.m4299b().equals(c3590f.m4299b());
        List list = this.f4001z0.f10936o0;
        List list2 = C17689w.f56480Y;
        if (list == null) {
            list = list2;
        }
        List list3 = c3590f.f10936o0;
        if (list3 != null) {
            list2 = list3;
        }
        boolean z6 = (zM18089b && zEquals && list.equals(list2) && AbstractC16544l.m18089b(this.f4001z0.f10937p0, c3590f.f10937p0)) ? false : true;
        if (z6) {
            this.f4001z0 = c3590f;
        }
        if (!zM18089b) {
            this.f4000P0 = null;
        }
        return z6;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20740b0.m21275p(m2163M0(abstractC21668N).m2137d(abstractC21668N.getLayoutDirection()).mo3548e());
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(p1140z1.C21660F r23) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p054C0.C1502o.mo430e(z1.F):void");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        boolean z6;
        C1842z c1842z;
        C1491d c1491dM2163M0 = m2163M0(interfaceC21059M);
        EnumC7546k layoutDirection = interfaceC21059M.getLayoutDirection();
        if (c1491dM2163M0.f3926g > 1) {
            C1489b c1489b = c1491dM2163M0.f3928i;
            C3582M c3582m = c1491dM2163M0.f3921b;
            InterfaceC7537b interfaceC7537b = c1491dM2163M0.f3930k;
            AbstractC16544l.m18091d(interfaceC7537b);
            C1489b c1489bM8089a = AbstractC7841A0.m8089a(c1489b, layoutDirection, c3582m, interfaceC7537b, c1491dM2163M0.f3922c);
            c1491dM2163M0.f3928i = c1489bM8089a;
            j10 = c1489bM8089a.m2133a(c1491dM2163M0.f3926g, j10);
        }
        C3578I c3578i = c1491dM2163M0.f3933n;
        if (c3578i == null) {
            c1491dM2163M0.f3933n = c1491dM2163M0.m2138e(layoutDirection, j10, c1491dM2163M0.m2135b(j10, layoutDirection));
            z6 = true;
        } else {
            C3599o c3599o = c3578i.f10893b;
            if (c3599o.f10958a.mo3544a()) {
                c1491dM2163M0.f3933n = c1491dM2163M0.m2138e(layoutDirection, j10, c1491dM2163M0.m2135b(j10, layoutDirection));
                z6 = true;
            } else {
                C3577H c3577h = c3578i.f10892a;
                if (layoutDirection != c3577h.f10889h) {
                    c1491dM2163M0.f3933n = c1491dM2163M0.m2138e(layoutDirection, j10, c1491dM2163M0.m2135b(j10, layoutDirection));
                    z6 = true;
                } else {
                    long j11 = c3577h.f10891j;
                    if (!C7536a.m7848c(j10, j11) && (C7536a.m7854i(j10) != C7536a.m7854i(j11) || C7536a.m7853h(j10) < c3599o.f10962e || c3599o.f10960c)) {
                        c1491dM2163M0.f3933n = c1491dM2163M0.m2138e(layoutDirection, j10, c1491dM2163M0.m2135b(j10, layoutDirection));
                    } else {
                        C3578I c3578i2 = c1491dM2163M0.f3933n;
                        AbstractC16544l.m18091d(c3578i2);
                        if (C7536a.m7848c(j10, c3578i2.f10892a.f10891j)) {
                            z6 = false;
                        } else {
                            C3578I c3578i3 = c1491dM2163M0.f3933n;
                            AbstractC16544l.m18091d(c3578i3);
                            c1491dM2163M0.f3933n = c1491dM2163M0.m2138e(layoutDirection, j10, c3578i3.f10893b);
                        }
                    }
                    z6 = true;
                }
            }
        }
        C3578I c3578i4 = c1491dM2163M0.f3933n;
        if (c3578i4 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        c3578i4.f10893b.f10958a.mo3544a();
        if (z6) {
            AbstractC21690f.m22215t(this, 2).m22165P0();
            InterfaceC1436k interfaceC1436k = this.f3987C0;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(c3578i4);
            }
            C1495h c1495h = this.f3994J0;
            if (c1495h != null) {
                C3578I c3578i5 = c1495h.f3962p0.f3976b;
                if (c3578i5 != null && !AbstractC16544l.m18089b(c3578i5.f10892a.f10882a, c3578i4.f10892a.f10882a) && (c1842z = ((C1821o0) c1495h.f3960Z).f5250i) != null) {
                    c1842z.invoke(Long.valueOf(c1495h.f3959Y));
                }
                c1495h.f3962p0 = C1498k.m2160a(c1495h.f3962p0, null, c3578i4, 1);
            }
            Map linkedHashMap = this.f3997M0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AbstractC21076c.f66994a, Integer.valueOf(Math.round(c3578i4.f10895d)));
            linkedHashMap.put(AbstractC21076c.f66995b, Integer.valueOf(Math.round(c3578i4.f10896e)));
            this.f3997M0 = linkedHashMap;
        }
        InterfaceC1436k interfaceC1436k2 = this.f3993I0;
        if (interfaceC1436k2 != null) {
            interfaceC1436k2.invoke(c3578i4.f10897f);
        }
        long j12 = c3578i4.f10894c;
        int i10 = (int) (j12 >> 32);
        int i11 = (int) (j12 & 4294967295L);
        int iMin = Math.min(i10, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int iM9960c = AbstractC9388w4.m9960c(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iMin, iMin2, Math.min(iM9960c, i11), i11 != Integer.MAX_VALUE ? Math.min(iM9960c, i11) : Integer.MAX_VALUE));
        Map map = this.f3997M0;
        AbstractC16544l.m18091d(map);
        return interfaceC21059M.mo19936R(i10, i11, map, new C1501n(abstractC21069XMo21533p, 0));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return m2163M0(abstractC21668N).m2134a(i10, abstractC21668N.getLayoutDirection());
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return m2163M0(abstractC21668N).m2134a(i10, abstractC21668N.getLayoutDirection());
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20740b0.m21275p(m2163M0(abstractC21668N).m2137d(abstractC21668N.getLayoutDirection()).mo3546c());
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }
}
