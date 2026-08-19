package p054C0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21690f;
import p117Eb.C2392v;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3582M;
import p204I1.C3590f;
import p204I1.C3599o;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p774h1.C14365u;
import p774h1.InterfaceC14366v;
import p909nm.C17689w;

/* JADX INFO: renamed from: C0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1504q extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4006Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1505r f4007Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1504q(C1505r c1505r, int i10) {
        super(1);
        this.f4006Y = i10;
        this.f4007Z = c1505r;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC7537b interfaceC7537b;
        C3578I c3578i;
        C3578I c3578i2;
        switch (this.f4006Y) {
            case 0:
                List list = (List) obj;
                C1505r c1505r = this.f4007Z;
                C1492e c1492eM2167K0 = c1505r.m2167K0();
                C3582M c3582m = c1505r.f4008A0;
                InterfaceC14366v interfaceC14366v = c1505r.f4014G0;
                C3582M c3582mM4276h = C3582M.m4276h(c3582m, interfaceC14366v != null ? interfaceC14366v.mo4719a() : C14365u.f45060j, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                EnumC7546k enumC7546k = c1492eM2167K0.f3950o;
                if (enumC7546k == null || (interfaceC7537b = c1492eM2167K0.f3944i) == null) {
                    c3578i = null;
                } else {
                    C3590f c3590f = new C3590f(6, c1492eM2167K0.f3936a, null);
                    if (c1492eM2167K0.f3945j == null || c1492eM2167K0.f3949n == null) {
                        c3578i = null;
                    } else {
                        long jM7847b = C7536a.m7847b(c1492eM2167K0.f3951p, 0, 0, 0, 0, 10);
                        C17689w c17689w = C17689w.f56480Y;
                        int i10 = c1492eM2167K0.f3941f;
                        boolean z6 = c1492eM2167K0.f3940e;
                        int i11 = c1492eM2167K0.f3939d;
                        InterfaceC5598n interfaceC5598n = c1492eM2167K0.f3938c;
                        c3578i = new C3578I(new C3577H(c3590f, c3582mM4276h, c17689w, i10, z6, i11, interfaceC7537b, enumC7546k, interfaceC5598n, jM7847b), new C3599o(new C2392v(c3590f, c3582mM4276h, c17689w, interfaceC7537b, interfaceC5598n), jM7847b, c1492eM2167K0.f3941f, AbstractC9160K3.m9708a(c1492eM2167K0.f3939d, 2)), c1492eM2167K0.f3947l);
                    }
                }
                if (c3578i != null) {
                    list.add(c3578i);
                    c3578i2 = c3578i;
                } else {
                    c3578i2 = null;
                }
                return Boolean.valueOf(c3578i2 != null);
            case 1:
                String str = ((C3590f) obj).f10934Y;
                C1505r c1505r2 = this.f4007Z;
                C1503p c1503p = c1505r2.f4018K0;
                if (c1503p == null) {
                    C1503p c1503p2 = new C1503p(c1505r2.f4019z0, str);
                    C1492e c1492e = new C1492e(str, c1505r2.f4008A0, c1505r2.f4009B0, c1505r2.f4010C0, c1505r2.f4011D0, c1505r2.f4012E0, c1505r2.f4013F0);
                    c1492e.m2141c(c1505r2.m2167K0().f3944i);
                    c1503p2.f4005d = c1492e;
                    c1505r2.f4018K0 = c1503p2;
                } else if (!AbstractC16544l.m18089b(str, c1503p.f4003b)) {
                    c1503p.f4003b = str;
                    C1492e c1492e2 = c1503p.f4005d;
                    if (c1492e2 != null) {
                        C3582M c3582m2 = c1505r2.f4008A0;
                        InterfaceC5598n interfaceC5598n2 = c1505r2.f4009B0;
                        int i12 = c1505r2.f4010C0;
                        boolean z10 = c1505r2.f4011D0;
                        int i13 = c1505r2.f4012E0;
                        int i14 = c1505r2.f4013F0;
                        c1492e2.f3936a = str;
                        c1492e2.f3937b = c3582m2;
                        c1492e2.f3938c = interfaceC5598n2;
                        c1492e2.f3939d = i12;
                        c1492e2.f3940e = z10;
                        c1492e2.f3941f = i13;
                        c1492e2.f3942g = i14;
                        c1492e2.f3945j = null;
                        c1492e2.f3949n = null;
                        c1492e2.f3950o = null;
                        c1492e2.f3952q = -1;
                        c1492e2.f3953r = -1;
                        c1492e2.f3951p = AbstractC9388w4.m9966i(0, 0, 0, 0);
                        c1492e2.f3947l = AbstractC9113C4.m9643a(0, 0);
                        c1492e2.f3946k = false;
                        C17296C c17296c = C17296C.f55119a;
                    }
                }
                AbstractC21690f.m22211p(c1505r2);
                AbstractC21690f.m22210o(c1505r2);
                AbstractC21690f.m22209n(c1505r2);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1505r c1505r3 = this.f4007Z;
                C1503p c1503p3 = c1505r3.f4018K0;
                if (c1503p3 == null) {
                    return Boolean.FALSE;
                }
                c1503p3.f4004c = zBooleanValue;
                AbstractC21690f.m22211p(c1505r3);
                AbstractC21690f.m22210o(c1505r3);
                AbstractC21690f.m22209n(c1505r3);
                return Boolean.TRUE;
        }
    }
}
