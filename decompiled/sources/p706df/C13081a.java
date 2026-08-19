package p706df;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.lazy.C10845a;
import bf.C11377e;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9745I3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13081a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C13081a f41555Z = new C13081a(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13081a f41556o0 = new C13081a(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13081a f41557p0 = new C13081a(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13081a f41558q0 = new C13081a(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13081a f41559r0 = new C13081a(3, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C13081a f41560s0 = new C13081a(3, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41561Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13081a(int i10, int i11) {
        super(i10);
        this.f41561Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f41561Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g((C10845a) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.gizmo_chats, c6021p), null, 0L, c6021p, 0, 6);
                }
                break;
            case 1:
                InterfaceC17763i0 paddingValues = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddingValues, "paddingValues");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddingValues) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddingValues);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i10 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    AbstractC8047a5.m8432e(C13082b.f41562Z, null, c6021p2, 6, 2);
                    c6021p2.m6553p(true);
                }
                break;
            case 2:
                C10845a item = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6542f(item) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC8047a5.m8431d(AbstractC10842a.m11235m(item.m11261a(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f)), 0.0f, AbstractC7313q.f23202g, 1), c6021p3, 0);
                }
                break;
            case 3:
                C11377e file = (C11377e) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(file, "file");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? c6021p4.m6542f(file) : c6021p4.m6545h(file) ? 4 : 2;
                }
                if ((iIntValue4 & 19) == 18 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC8047a5.m8428a(file, c6021p4, iIntValue4 & 14);
                }
                break;
            case 4:
                InterfaceC17763i0 paddingValues2 = (InterfaceC17763i0) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddingValues2, "paddingValues");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6021p5.m6542f(paddingValues2) ? 4 : 2;
                }
                if ((iIntValue5 & 19) == 18 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j2 = AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddingValues2);
                    InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i11 = c6021p5.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p5.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p5, interfaceC10459qM11232j2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p5.m6528W();
                    if (c6021p5.f19563O) {
                        c6021p5.m6549l(c21696i2);
                    } else {
                        c6021p5.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p5, interfaceC21057KM19511e2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p5, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p5.f19563O || !AbstractC16544l.m18089b(c6021p5.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p5, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p5, interfaceC10459qM10923d2);
                    AbstractC8047a5.m8432e(C13082b.f41563o0, null, c6021p5, 6, 2);
                    c6021p5.m6553p(true);
                }
                break;
            default:
                InterfaceC17763i0 paddingValues3 = (InterfaceC17763i0) obj;
                C6021p c6021p6 = (C6021p) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddingValues3, "paddingValues");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c6021p6.m6542f(paddingValues3) ? 4 : 2;
                }
                if ((iIntValue6 & 19) == 18 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11232j3 = AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddingValues3);
                    C10451i c10451i = C10444b.f30934Y;
                    InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i, false);
                    int i12 = c6021p6.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p6.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p6, interfaceC10459qM11232j3);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i3 = C21698j.f68869b;
                    c6021p6.m6528W();
                    if (c6021p6.f19563O) {
                        c6021p6.m6549l(c21696i3);
                    } else {
                        c6021p6.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p6, interfaceC21057KM19511e3);
                    C5997d.m6439Z(C21698j.f68872e, c6021p6, interfaceC6008i0M6550m3);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p6, i12, c21694h3);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p6, interfaceC10459qM10923d3);
                    AbstractC8047a5.m8432e(C13082b.f41564p0, C10843b.f32509a.m11240a(c10456n, c10451i), c6021p6, 6, 0);
                    c6021p6.m6553p(true);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
