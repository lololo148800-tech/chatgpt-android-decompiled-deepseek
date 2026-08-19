package p563X1;

import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0277p;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1436k;
import p1140z1.C21658D;

/* JADX INFO: renamed from: X1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9022b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27524Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9037q f27525Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21658D f27526o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9022b(C9037q c9037q, C21658D c21658d, int i10) {
        super(1);
        this.f27524Y = i10;
        this.f27525Z = c9037q;
        this.f27526o0 = c21658d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f27524Y) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                C9037q c9037q = this.f27525Z;
                if (androidComposeView != null) {
                    HashMap<AbstractC9029i, C21658D> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    C21658D c21658d = this.f27526o0;
                    holderToLayoutNode.put(c9037q, c21658d);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(c9037q);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(c21658d, c9037q);
                    c9037q.setImportantForAccessibility(1);
                    AbstractC0738T.m1584l(c9037q, new C0277p(androidComposeView, c21658d, androidComposeView));
                }
                if (c9037q.getView().getParent() != c9037q) {
                    c9037q.addView(c9037q.getView());
                }
                break;
            case 1:
                AbstractC9031k.m9602d(this.f27525Z, this.f27526o0);
                break;
            default:
                C9037q c9037q2 = this.f27525Z;
                AbstractC9031k.m9602d(c9037q2, this.f27526o0);
                ((AndroidComposeView) c9037q2.f27557q0).f32766I0 = true;
                break;
        }
        return C17296C.f55119a;
    }
}
