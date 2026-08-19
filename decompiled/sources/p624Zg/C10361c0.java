package p624Zg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p492U1.C7536a;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p909nm.C17690x;
import p911o0.C17794y;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Zg.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10361c0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30710Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f30711Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10361c0(int i10, int i11) {
        super(3);
        this.f30710Y = i11;
        this.f30711Z = i10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f30710Y) {
            case 0:
                C17794y Card = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Card, "$this$Card");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(this.f30711Z, c6021p), AbstractC10842a.m11233k(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), AbstractC7313q.f23201f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131068);
                }
                return C17296C.f55119a;
            case 1:
                InterfaceC21059M layout = (InterfaceC21059M) obj;
                InterfaceC21056J measurable = (InterfaceC21056J) obj2;
                long j10 = ((C7536a) obj3).f23888a;
                AbstractC16544l.m18094g(layout, "$this$layout");
                AbstractC16544l.m18094g(measurable, "measurable");
                int i10 = this.f30711Z;
                AbstractC21069X abstractC21069XMo21533p = measurable.mo21533p(C7536a.m7847b(j10, i10, i10, 0, 0, 12));
                return layout.mo19936R(C7536a.m7854i(j10), abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 7));
            default:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(this.f30711Z, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                return C17296C.f55119a;
        }
    }
}
