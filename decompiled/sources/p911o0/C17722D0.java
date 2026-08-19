package p911o0;

import androidx.compose.p650ui.layout.AbstractC10868a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.EnumC0123W;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1440o;
import p054C0.C1501n;
import p1071w0.AbstractC20778u0;
import p1071w0.C20708F0;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p1116y0.C21353b;
import p1139z0.C21640s0;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3573D;
import p204I1.C3581L;
import p204I1.C3582M;
import p328N1.AbstractC5599o;
import p328N1.C5600p;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p328N1.InterfaceC5598n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC5982V0;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p544W9.AbstractC8682o;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17722D0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f56582Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17722D0(Object obj, int i10) {
        super(3);
        this.f56581Y = i10;
        this.f56582Z = obj;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = 1;
        C5975S c5975s = C6013l.f19514a;
        Object obj4 = this.f56582Z;
        switch (this.f56581Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p.m6524S(-1415685722);
                InterfaceC17716A0 interfaceC17716A0 = (InterfaceC17716A0) obj4;
                boolean zM6542f = c6021p.m6542f(interfaceC17716A0);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == c5975s) {
                    objM6514H = new C17744Y(interfaceC17716A0);
                    c6021p.m6537c0(objM6514H);
                }
                C17744Y c17744y = (C17744Y) objM6514H;
                c6021p.m6553p(false);
                return c17744y;
            case 1:
                long j10 = ((C7536a) obj3).f23888a;
                long j11 = ((C20708F0) obj4).f65647f;
                AbstractC21069X abstractC21069XMo21533p = ((InterfaceC21056J) obj2).mo21533p(C7536a.m7847b(j10, AbstractC8301I.m8921l((int) (j11 >> 32), C7536a.m7856k(j10), C7536a.m7854i(j10)), 0, AbstractC8301I.m8921l((int) (4294967295L & j11), C7536a.m7855j(j10), C7536a.m7853h(j10)), 0, 10));
                return ((InterfaceC21059M) obj).mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 14));
            case 2:
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p2.m6524S(1582736677);
                InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p2.m6548k(AbstractC0187M0.f704f);
                InterfaceC5598n interfaceC5598n = (InterfaceC5598n) c6021p2.m6548k(AbstractC0187M0.f707i);
                EnumC7546k enumC7546k = (EnumC7546k) c6021p2.m6548k(AbstractC0187M0.f710l);
                C3582M c3582m = (C3582M) obj4;
                boolean zM6542f2 = c6021p2.m6542f(c3582m) | c6021p2.m6542f(enumC7546k);
                Object objM6514H2 = c6021p2.m6514H();
                if (zM6542f2 || objM6514H2 == c5975s) {
                    objM6514H2 = AbstractC8682o.m9379b(c3582m, enumC7546k);
                    c6021p2.m6537c0(objM6514H2);
                }
                C3582M c3582m2 = (C3582M) objM6514H2;
                boolean zM6542f3 = c6021p2.m6542f(interfaceC5598n) | c6021p2.m6542f(c3582m2);
                Object objM6514H3 = c6021p2.m6514H();
                if (zM6542f3 || objM6514H3 == c5975s) {
                    C3573D c3573d = c3582m2.f10910a;
                    AbstractC5599o abstractC5599o = c3573d.f10864f;
                    C5609y c5609y = c3573d.f10861c;
                    if (c5609y == null) {
                        c5609y = C5609y.f18155r0;
                    }
                    C5605u c5605u = c3573d.f10862d;
                    int i11 = c5605u != null ? c5605u.f18148a : 0;
                    C5606v c5606v = c3573d.f10863e;
                    objM6514H3 = ((C5600p) interfaceC5598n).m5991b(abstractC5599o, c5609y, i11, c5606v != null ? c5606v.f18149a : 1);
                    c6021p2.m6537c0(objM6514H3);
                }
                InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H3;
                Object objM6514H4 = c6021p2.m6514H();
                Object obj5 = objM6514H4;
                if (objM6514H4 == c5975s) {
                    Object value = interfaceC5982V0.getValue();
                    C20708F0 c20708f0 = new C20708F0();
                    c20708f0.f65642a = enumC7546k;
                    c20708f0.f65643b = interfaceC7537b;
                    c20708f0.f65644c = interfaceC5598n;
                    c20708f0.f65645d = c3582m;
                    c20708f0.f65646e = value;
                    c20708f0.f65647f = AbstractC20778u0.m21304a(c3582m, interfaceC7537b, interfaceC5598n, AbstractC20778u0.f65985a, 1);
                    c6021p2.m6537c0(c20708f0);
                    obj5 = c20708f0;
                }
                C20708F0 c20708f1 = (C20708F0) obj5;
                Object value2 = interfaceC5982V0.getValue();
                if (enumC7546k != c20708f1.f65642a || !AbstractC16544l.m18089b(interfaceC7537b, c20708f1.f65643b) || !AbstractC16544l.m18089b(interfaceC5598n, c20708f1.f65644c) || !AbstractC16544l.m18089b(c3582m2, c20708f1.f65645d) || !AbstractC16544l.m18089b(value2, c20708f1.f65646e)) {
                    c20708f1.f65642a = enumC7546k;
                    c20708f1.f65643b = interfaceC7537b;
                    c20708f1.f65644c = interfaceC5598n;
                    c20708f1.f65645d = c3582m2;
                    c20708f1.f65646e = value2;
                    c20708f1.f65647f = AbstractC20778u0.m21304a(c3582m2, interfaceC7537b, interfaceC5598n, AbstractC20778u0.f65985a, 1);
                }
                C10456n c10456n = C10456n.f30959Y;
                boolean zM6545h = c6021p2.m6545h(c20708f1);
                Object objM6514H5 = c6021p2.m6514H();
                if (zM6545h || objM6514H5 == c5975s) {
                    objM6514H5 = new C17722D0(c20708f1, i10);
                    c6021p2.m6537c0(objM6514H5);
                }
                InterfaceC10459q interfaceC10459qM11316b = AbstractC10868a.m11316b(c10456n, (InterfaceC1440o) objM6514H5);
                c6021p2.m6553p(false);
                return interfaceC10459qM11316b;
            case 3:
                C6021p c6021p3 = ((C6042z0) obj).f19677a;
                C6021p c6021p4 = (C6021p) obj2;
                ((Number) obj3).intValue();
                int i12 = c6021p4.f19564P;
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p4, (InterfaceC10459q) obj4);
                c6021p3.m6525T(509942095);
                InterfaceC21700k.f68875m0.getClass();
                C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i12))) {
                    AbstractC0168G.m537z(i12, c6021p3, i12, c21694h);
                }
                c6021p3.m6553p(false);
                return C17296C.f55119a;
            default:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                C21640s0 c21640s0 = (C21640s0) obj4;
                C21353b c21353bM21750b = zBooleanValue ? c21640s0.f68550B0.f68337a.m21750b() : c21640s0.f68550B0.m21881c();
                long j12 = c21353bM21750b.f67818Z;
                if (!c21640s0.f68553E0 || Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > c21353bM21750b.f67817Y.length()) {
                    return Boolean.FALSE;
                }
                int i13 = C3581L.f10907c;
                if (iIntValue == ((int) (j12 >> 32)) && iIntValue2 == ((int) (4294967295L & j12))) {
                    return Boolean.TRUE;
                }
                long jM9365b = AbstractC8676n.m9365b(iIntValue, iIntValue2);
                if (zBooleanValue || iIntValue == iIntValue2) {
                    c21640s0.f68552D0.m419x(EnumC0123W.f526Y);
                } else {
                    c21640s0.f68552D0.m419x(EnumC0123W.f528o0);
                }
                if (zBooleanValue) {
                    c21640s0.f68550B0.m21885i(jM9365b);
                } else {
                    c21640s0.f68550B0.m21884h(jM9365b);
                }
                return Boolean.TRUE;
        }
    }
}
