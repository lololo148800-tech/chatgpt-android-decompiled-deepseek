package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p650ui.layout.AbstractC10868a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p302M0.AbstractC5268t;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p530Vi.AbstractC8301I;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p911o0.C17794y;

/* JADX INFO: renamed from: J0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4023b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12634Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1439n f12635Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4023b(InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f12634Y = i10;
        this.f12635Z = interfaceC1439n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12634Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM19543a = C17794y.f56777a.m19543a(AbstractC10842a.m11232j(C10456n.f30959Y, AbstractC4071j.f12958f), C10444b.f30947z0);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19543a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    this.f12635Z.invoke(c6021p, 0);
                    c6021p.m6553p(true);
                }
                return C17296C.f55119a;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17794y c17794y = C17794y.f56777a;
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    InterfaceC10459q interfaceC10459qM19543a2 = c17794y.m19543a(AbstractC10842a.m11232j(new LayoutWeightElement(AbstractC8301I.m8917h(1.0f, Float.MAX_VALUE), false), AbstractC4071j.f12960h), C10444b.f30946y0);
                    InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i11 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM19543a2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i2);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p2, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d2);
                    this.f12635Z.invoke(c6021p2, 0);
                    c6021p2.m6553p(true);
                }
                return C17296C.f55119a;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11242b = AbstractC10844c.m11242b(C10456n.f30959Y, AbstractC5268t.f17275f, 0.0f, 2);
                    InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i12 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11242b);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i3 = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i3);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, interfaceC21057KM19511e3);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m3);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p3, i12, c21694h3);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d3);
                    this.f12635Z.invoke(c6021p3, 0);
                    c6021p3.m6553p(true);
                }
                return C17296C.f55119a;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11242b2 = AbstractC10844c.m11242b(C10456n.f30959Y, AbstractC5268t.f17280k, 0.0f, 2);
                    InterfaceC21057K interfaceC21057KM19511e4 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i13 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11242b2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i4 = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i4);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p4, interfaceC21057KM19511e4);
                    C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m4);
                    C21694h c21694h4 = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i13))) {
                        AbstractC0168G.m537z(i13, c6021p4, i13, c21694h4);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d4);
                    this.f12635Z.invoke(c6021p4, 0);
                    c6021p4.m6553p(true);
                }
                return C17296C.f55119a;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    this.f12635Z.invoke(c6021p5, 0);
                }
                return C17296C.f55119a;
            case 5:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11317c = AbstractC10868a.m11317c(C10456n.f30959Y, "Container");
                    InterfaceC21057K interfaceC21057KM19511e5 = AbstractC17780r.m19511e(C10444b.f30934Y, true);
                    int i14 = c6021p6.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p6.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p6, interfaceC10459qM11317c);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i5 = C21698j.f68869b;
                    c6021p6.m6528W();
                    if (c6021p6.f19563O) {
                        c6021p6.m6549l(c21696i5);
                    } else {
                        c6021p6.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p6, interfaceC21057KM19511e5);
                    C5997d.m6439Z(C21698j.f68872e, c6021p6, interfaceC6008i0M6550m5);
                    C21694h c21694h5 = C21698j.f68874g;
                    if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p6, i14, c21694h5);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p6, interfaceC10459qM10923d5);
                    this.f12635Z.invoke(c6021p6, 0);
                    c6021p6.m6553p(true);
                }
                return C17296C.f55119a;
            case 6:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    float f10 = AbstractC7313q.f23202g;
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10842a.m11237o(c10456n, 0.0f, f10 - 4, 0.0f, AbstractC7313q.f23201f, 5), f10, 0.0f, 2);
                    InterfaceC21057K interfaceC21057KM19511e6 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i15 = c6021p7.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p7.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p7, interfaceC10459qM11235m);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i6 = C21698j.f68869b;
                    c6021p7.m6528W();
                    if (c6021p7.f19563O) {
                        c6021p7.m6549l(c21696i6);
                    } else {
                        c6021p7.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p7, interfaceC21057KM19511e6);
                    C5997d.m6439Z(C21698j.f68872e, c6021p7, interfaceC6008i0M6550m6);
                    C21694h c21694h6 = C21698j.f68874g;
                    if (c6021p7.f19563O || !AbstractC16544l.m18089b(c6021p7.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p7, i15, c21694h6);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p7, interfaceC10459qM10923d6);
                    c6021p7.m6524S(1184461157);
                    InterfaceC1439n interfaceC1439n = this.f12635Z;
                    if (interfaceC1439n != null) {
                        interfaceC1439n.invoke(c6021p7, 0);
                    }
                    c6021p7.m6553p(false);
                    c6021p7.m6553p(true);
                }
                return C17296C.f55119a;
            case 7:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    this.f12635Z.invoke(c6021p8, 0);
                }
                return C17296C.f55119a;
            case 8:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    this.f12635Z.invoke(c6021p9, 0);
                }
                return C17296C.f55119a;
            default:
                C6021p c6021p10 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    this.f12635Z.invoke(c6021p10, 0);
                }
                return C17296C.f55119a;
        }
    }
}
