package p054C0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21690f;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3582M;
import p204I1.C3590f;
import p328N1.InterfaceC5598n;
import p774h1.C14365u;
import p774h1.InterfaceC14366v;

/* JADX INFO: renamed from: C0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1500m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1502o f3982Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1500m(C1502o c1502o, int i10) {
        super(1);
        this.f3981Y = i10;
        this.f3982Z = c1502o;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C3578I c3578i;
        switch (this.f3981Y) {
            case 0:
                List list = (List) obj;
                C1502o c1502o = this.f3982Z;
                C3578I c3578i2 = c1502o.m2162L0().f3933n;
                if (c3578i2 != null) {
                    C3577H c3577h = c3578i2.f10892a;
                    C3590f c3590f = c3577h.f10882a;
                    C3582M c3582m = c1502o.f3985A0;
                    InterfaceC14366v interfaceC14366v = c1502o.f3995K0;
                    c3578i = new C3578I(new C3577H(c3590f, C3582M.m4276h(c3582m, interfaceC14366v != null ? interfaceC14366v.mo4719a() : C14365u.f45060j, 0L, null, null, null, 0L, null, 0, 0L, 16777214), c3577h.f10884c, c3577h.f10885d, c3577h.f10886e, c3577h.f10887f, c3577h.f10888g, c3577h.f10889h, c3577h.f10890i, c3577h.f10891j), c3578i2.f10893b, c3578i2.f10894c);
                    list.add(c3578i);
                } else {
                    c3578i = null;
                }
                return Boolean.valueOf(c3578i != null);
            case 1:
                C3590f c3590f2 = (C3590f) obj;
                C1502o c1502o2 = this.f3982Z;
                C1499l c1499l = c1502o2.f4000P0;
                if (c1499l == null) {
                    C1499l c1499l2 = new C1499l(c1502o2.f4001z0, c3590f2);
                    C1491d c1491d = new C1491d(c3590f2, c1502o2.f3985A0, c1502o2.f3986B0, c1502o2.f3988D0, c1502o2.f3989E0, c1502o2.f3990F0, c1502o2.f3991G0, c1502o2.f3992H0);
                    c1491d.m2136c(c1502o2.m2162L0().f3930k);
                    c1499l2.f3980d = c1491d;
                    c1502o2.f4000P0 = c1499l2;
                } else if (!AbstractC16544l.m18089b(c3590f2, c1499l.f3978b)) {
                    c1499l.f3978b = c3590f2;
                    C1491d c1491d2 = c1499l.f3980d;
                    if (c1491d2 != null) {
                        C3582M c3582m2 = c1502o2.f3985A0;
                        InterfaceC5598n interfaceC5598n = c1502o2.f3986B0;
                        int i10 = c1502o2.f3988D0;
                        boolean z6 = c1502o2.f3989E0;
                        int i11 = c1502o2.f3990F0;
                        int i12 = c1502o2.f3991G0;
                        List list2 = c1502o2.f3992H0;
                        c1491d2.f3920a = c3590f2;
                        c1491d2.f3921b = c3582m2;
                        c1491d2.f3922c = interfaceC5598n;
                        c1491d2.f3923d = i10;
                        c1491d2.f3924e = z6;
                        c1491d2.f3925f = i11;
                        c1491d2.f3926g = i12;
                        c1491d2.f3927h = list2;
                        c1491d2.f3931l = null;
                        c1491d2.f3933n = null;
                        c1491d2.f3935p = -1;
                        c1491d2.f3934o = -1;
                        C17296C c17296c = C17296C.f55119a;
                    }
                }
                AbstractC21690f.m22211p(c1502o2);
                AbstractC21690f.m22210o(c1502o2);
                AbstractC21690f.m22209n(c1502o2);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1502o c1502o3 = this.f3982Z;
                C1499l c1499l3 = c1502o3.f4000P0;
                if (c1499l3 == null) {
                    return Boolean.FALSE;
                }
                InterfaceC1436k interfaceC1436k = c1502o3.f3996L0;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(c1499l3);
                }
                C1499l c1499l4 = c1502o3.f4000P0;
                if (c1499l4 != null) {
                    c1499l4.f3979c = zBooleanValue;
                }
                AbstractC21690f.m22211p(c1502o3);
                AbstractC21690f.m22210o(c1502o3);
                AbstractC21690f.m22209n(c1502o3);
                return Boolean.TRUE;
        }
    }
}
