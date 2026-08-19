package p1062vd;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3984T1;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8071d5;
import p635a1.C10456n;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: vd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20550c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C20550c f65235Z = new C20550c(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C20550c f65236o0 = new C20550c(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C20550c f65237p0 = new C20550c(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C20550c f65238q0 = new C20550c(3, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65239Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20550c(int i10, int i11) {
        super(i10);
        this.f65239Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f65239Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23199d));
                }
                break;
            case 1:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23199d));
                }
                break;
            case 2:
                C10845a item3 = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC8071d5.m8482a(0, 1, c6021p3, null);
                }
                break;
            default:
                C10845a item4 = (C10845a) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item4, "$this$item");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3984T1.m4692k(AbstractC10842a.m11234l(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), AbstractC7313q.f23201f, AbstractC7313q.f23199d), 0.0f, 0L, c6021p4, 0, 6);
                    AbstractC3914G1.m4611a(AbstractC20554e.f65246d, null, null, null, AbstractC20554e.f65247e, null, null, 0.0f, 0.0f, c6021p4, 24582, 494);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
