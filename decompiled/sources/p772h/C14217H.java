package p772h;

import android.content.res.Resources;
import android.view.View;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: h.H */
/* JADX INFO: loaded from: classes.dex */
public final class C14217H extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14217H f44648Z = new C14217H(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14217H f44649o0 = new C14217H(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14217H f44650p0 = new C14217H(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44651Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14217H(int i10, int i11) {
        super(i10);
        this.f44651Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44651Y) {
            case 0:
                Resources resources = (Resources) obj;
                AbstractC16544l.m18094g(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View it = (View) obj;
                AbstractC16544l.m18094g(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it2 = (View) obj;
                AbstractC16544l.m18094g(it2, "it");
                Object tag = it2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof InterfaceC14216G) {
                    return (InterfaceC14216G) tag;
                }
                return null;
        }
    }
}
