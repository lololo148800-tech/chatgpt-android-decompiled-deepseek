package p183H4;

import android.view.View;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: H4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3233h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C3233h f9803Z = new C3233h(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3233h f9804o0 = new C3233h(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9805Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3233h(int i10, int i11) {
        super(i10);
        this.f9805Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f9805Y) {
            case 0:
                View view = (View) obj;
                AbstractC16544l.m18094g(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                AbstractC16544l.m18094g(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof InterfaceC3232g) {
                    return (InterfaceC3232g) tag;
                }
                return null;
        }
    }
}
