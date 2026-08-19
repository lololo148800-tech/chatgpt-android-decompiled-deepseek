package p482Tg;

import androidx.compose.foundation.lazy.C10845a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p169Gf.C3046j;
import p229J0.AbstractC3914G1;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Tg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7446c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23565Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f23566Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23567o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7446c(InterfaceC10459q interfaceC10459q, String str, int i10) {
        super(3);
        this.f23565Y = i10;
        this.f23566Z = interfaceC10459q;
        this.f23567o0 = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23565Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3914G1.m4611a(AbstractC7452i.f23623b, this.f23566Z, null, AbstractC8411c.m8969c(1885649068, c6021p, new C3046j(this.f23567o0, 4)), AbstractC7452i.f23624c, null, null, 0.0f, 0.0f, c6021p, 27654, 484);
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
                    AbstractC3914G1.m4611a(AbstractC7452i.f23625d, this.f23566Z, null, AbstractC8411c.m8969c(-1712157227, c6021p2, new C3046j(this.f23567o0, 5)), AbstractC7452i.f23626e, null, null, 0.0f, 0.0f, c6021p2, 27654, 484);
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
                    AbstractC3914G1.m4611a(AbstractC7459p.f23684f, this.f23566Z, null, AbstractC8411c.m8969c(693183677, c6021p3, new C3046j(this.f23567o0, 6)), AbstractC7459p.f23685g, null, null, 0.0f, 0.0f, c6021p3, 27654, 484);
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
                    AbstractC3914G1.m4611a(AbstractC7459p.f23686h, this.f23566Z, null, AbstractC8411c.m8969c(1751035750, c6021p4, new C3046j(this.f23567o0, 7)), AbstractC7459p.f23687i, null, null, 0.0f, 0.0f, c6021p4, 27654, 484);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
