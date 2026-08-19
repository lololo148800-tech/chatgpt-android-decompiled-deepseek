package p017Af;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p478Tc.AbstractC7312p;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p926of.C18160X;

/* JADX INFO: renamed from: Af.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C0481l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C0481l f1560Z = new C0481l(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0481l f1561o0 = new C0481l(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0481l f1562p0 = new C0481l(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C0481l f1563q0 = new C0481l(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1564Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0481l(int i10, int i11) {
        super(i10);
        this.f1564Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1564Y) {
            case 0:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                return C17296C.f55119a;
            case 1:
                InterfaceC7537b appendInlineContent = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(appendInlineContent, "$this$appendInlineContent");
                float f10 = AbstractC7312p.f23184a;
                return new C7545j(AbstractC9113C4.m9643a(AbstractC2119a.m3195i(appendInlineContent.mo7864b0(f10)), AbstractC2119a.m3195i(appendInlineContent.mo7864b0(f10))));
            case 2:
                C18160X it = (C18160X) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f57919j;
            default:
                C0455B webView = (C0455B) obj;
                AbstractC16544l.m18094g(webView, "webView");
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -1;
                layoutParams.height = -1;
                webView.setLayoutParams(layoutParams);
                return C17296C.f55119a;
        }
    }
}
