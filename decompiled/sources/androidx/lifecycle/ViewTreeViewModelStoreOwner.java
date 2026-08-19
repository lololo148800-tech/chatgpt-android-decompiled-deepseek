package androidx.lifecycle;

import android.view.View;
import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1091wn.AbstractC21031l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"lifecycle-viewmodel_release"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ViewTreeViewModelStoreOwner {
    /* JADX INFO: renamed from: a */
    public static final ViewModelStoreOwner m12147a(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        return (ViewModelStoreOwner) AbstractC21031l.m21489m(AbstractC21031l.m21496t(AbstractC21031l.m21492p(ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.f33446Y, view), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.f33447Y));
    }

    /* JADX INFO: renamed from: b */
    public static final void m12148b(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC16544l.m18094g(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
