package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21329w;
import p324Mn.C5554x;

/* JADX INFO: renamed from: Wc.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C8810t extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26975Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5554x f26976Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f26977o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8810t(C5554x c5554x, InterfaceC1436k interfaceC1436k, int i10) {
        super(1);
        this.f26975Y = i10;
        this.f26976Z = c5554x;
        this.f26977o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f26975Y) {
            case 0:
                String item = (String) obj;
                AbstractC16544l.m18094g(item, "item");
                Integer numM21736w = AbstractC21329w.m21736w(item);
                C5554x c5554x = this.f26976Z;
                int iIntValue = numM21736w != null ? numM21736w.intValue() : c5554x.f18006Y.getDayOfMonth();
                if (iIntValue != c5554x.f18006Y.getDayOfMonth()) {
                    this.f26977o0.invoke(AbstractC8815y.m9543g(c5554x, 0, 0, iIntValue, 3));
                }
                break;
            case 1:
                String item2 = (String) obj;
                AbstractC16544l.m18094g(item2, "item");
                int iIndexOf = AbstractC8815y.f26997c.indexOf(item2) + 1;
                C5554x c5554x2 = this.f26976Z;
                if (iIndexOf != c5554x2.f18006Y.getMonthValue()) {
                    this.f26977o0.invoke(AbstractC8815y.m9543g(c5554x2, 0, iIndexOf, 0, 5));
                }
                break;
            default:
                String item3 = (String) obj;
                AbstractC16544l.m18094g(item3, "item");
                Integer numM21736w2 = AbstractC21329w.m21736w(item3);
                C5554x c5554x3 = this.f26976Z;
                int iIntValue2 = numM21736w2 != null ? numM21736w2.intValue() : c5554x3.f18006Y.getYear();
                if (iIntValue2 != c5554x3.f18006Y.getYear()) {
                    this.f26977o0.invoke(AbstractC8815y.m9543g(c5554x3, iIntValue2, 0, 0, 6));
                }
                break;
        }
        return C17296C.f55119a;
    }
}
