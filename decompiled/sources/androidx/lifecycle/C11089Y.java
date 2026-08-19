package androidx.lifecycle;

import android.view.View;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: androidx.lifecycle.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C11089Y extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C11089Y f33453Z = new C11089Y(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C11089Y f33454o0 = new C11089Y(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f33455Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11089Y(int i10, int i11) {
        super(i10);
        this.f33455Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f33455Y) {
            case 0:
                View currentView = (View) obj;
                AbstractC16544l.m18094g(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View viewParent = (View) obj;
                AbstractC16544l.m18094g(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC11112u) {
                    return (InterfaceC11112u) tag;
                }
                return null;
        }
    }
}
