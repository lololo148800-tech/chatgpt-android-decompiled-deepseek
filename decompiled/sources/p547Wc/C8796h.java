package p547Wc;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p562X0.C9008c;

/* JADX INFO: renamed from: Wc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C8796h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C8796h f26910Z = new C8796h(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8796h f26911o0 = new C8796h(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C8796h f26912p0 = new C8796h(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C8796h f26913q0 = new C8796h(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C8796h f26914r0 = new C8796h(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C8796h f26915s0 = new C8796h(2, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26916Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8796h(int i10, int i11) {
        super(i10);
        this.f26916Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26916Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.arrow_left, c6021p, 0), AbstractC8142m4.m8676d(R.string.design_up_button, c6021p), null, 0L, c6021p, 0, 12);
                }
                return C17296C.f55119a;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.close_lg, c6021p2, 0), AbstractC8142m4.m8676d(R.string.design_up_button, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                return C17296C.f55119a;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.arrow_left, c6021p3, 0), AbstractC8142m4.m8676d(R.string.design_up_button, c6021p3), null, 0L, c6021p3, 0, 12);
                }
                return C17296C.f55119a;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.close_lg, c6021p4, 0), AbstractC8142m4.m8676d(R.string.design_search_clear, c6021p4), null, 0L, c6021p4, 0, 12);
                }
                return C17296C.f55119a;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                }
                return C17296C.f55119a;
            default:
                C9008c Saver = (C9008c) obj;
                C8775T it = (C8775T) obj2;
                AbstractC16544l.m18094g(Saver, "$this$Saver");
                AbstractC16544l.m18094g(it, "it");
                return (EnumC8776U) it.f26768b.f53865g.getValue();
        }
    }
}
