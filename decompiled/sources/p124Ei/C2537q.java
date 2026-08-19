package p124Ei;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p635a1.C10456n;

/* JADX INFO: renamed from: Ei.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C2537q extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7925Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2549w f7926Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f7927o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2537q(C2549w c2549w, float f10, int i10) {
        super(3);
        this.f7925Y = i10;
        this.f7926Z = c2549w;
        this.f7927o0 = f10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7925Y) {
            case 0:
                String it = (String) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C2549w c2549w = this.f7926Z;
                    Integer num = c2549w != null ? c2549w.f7959c : null;
                    if (num != null) {
                        AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(num.intValue(), c6021p, 0), null, AbstractC10844c.m11252l(C10456n.f30959Y, this.f7927o0), 0L, c6021p, 48, 8);
                    }
                }
                break;
            default:
                String it2 = (String) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it2, "it");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C2549w c2549w2 = this.f7926Z;
                    Integer num2 = c2549w2 != null ? c2549w2.f7960d : null;
                    if (num2 != null) {
                        AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(num2.intValue(), c6021p2, 0), null, AbstractC10844c.m11252l(C10456n.f30959Y, this.f7927o0), 0L, c6021p2, 48, 8);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
