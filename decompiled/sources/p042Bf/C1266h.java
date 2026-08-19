package p042Bf;

import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1166t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1000s0.C19430z;
import p1025te.AbstractC19883n;
import p1025te.C19874e;
import p1042uh.C20263a0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4141u3;
import p229J0.C3949M0;
import p229J0.C4084l0;
import p229J0.C4135t3;
import p349O0.C6013l;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8079e5;
import p527Ve.C8276m;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p870le.C16852I;

/* JADX INFO: renamed from: Bf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1266h extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3359Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f3360Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f3361o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1266h(List list, InterfaceC1436k interfaceC1436k, int i10) {
        super(4);
        this.f3359Y = i10;
        this.f3360Z = list;
        this.f3361o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f3359Y) {
            case 0:
                C19430z HorizontalPager = (C19430z) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6021p c6021p = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(HorizontalPager, "$this$HorizontalPager");
                AbstractC3984T1.m4687f(AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23199d), null, C4084l0.m4752a(AbstractC3984T1.m4703v(c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p), null, null, AbstractC8411c.m8969c(-387536362, c6021p, new C1265g((C1166t) this.f3360Z.get(iIntValue), this.f3361o0, iIntValue)), c6021p, 196608, 26);
                break;
            case 1:
                C10845a c10845a = (C10845a) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i10 = (c6021p2.m6542f(c10845a) ? 4 : 2) | iIntValue3;
                } else {
                    i10 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i10 |= c6021p2.m6538d(iIntValue2) ? 32 : 16;
                }
                if ((i10 & 147) == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C20263a0 c20263a0 = (C20263a0) this.f3360Z.get(iIntValue2);
                    c6021p2.m6524S(390512629);
                    C8410b c8410bM8969c = AbstractC8411c.m8969c(1009008223, c6021p2, new C8276m(c20263a0, 4));
                    c6021p2.m6524S(566791038);
                    InterfaceC1436k interfaceC1436k = this.f3361o0;
                    boolean zM6542f = c6021p2.m6542f(interfaceC1436k) | c6021p2.m6545h(c20263a0);
                    Object objM6514H = c6021p2.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C16852I(interfaceC1436k, c20263a0, 0);
                        c6021p2.m6537c0(objM6514H);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4101o.m4761b(c8410bM8969c, (InterfaceC1426a) objM6514H, null, AbstractC8411c.m8969c(-282030596, c6021p2, new C8276m(c20263a0, 5)), AbstractC8411c.m8969c(-712376869, c6021p2, new C8276m(c20263a0, 6)), false, null, null, null, c6021p2, 27654, 484);
                    c6021p2.m6553p(false);
                }
                break;
            default:
                C10845a c10845a2 = (C10845a) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C6021p c6021p3 = (C6021p) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i11 = (c6021p3.m6542f(c10845a2) ? 4 : 2) | iIntValue5;
                } else {
                    i11 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i11 |= c6021p3.m6538d(iIntValue4) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    Map.Entry entry = (Map.Entry) this.f3360Z.get(iIntValue4);
                    c6021p3.m6524S(-1240515410);
                    AbstractC19883n.m20786a((Uri) entry.getKey(), (C19874e) entry.getValue(), this.f3361o0, AbstractC8079e5.m8501a(AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC19883n.f63029a), ((C4135t3) c6021p3.m6548k(AbstractC4141u3.f13417a)).f13378b), false, c6021p3, 0, 16);
                    c6021p3.m6553p(false);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
