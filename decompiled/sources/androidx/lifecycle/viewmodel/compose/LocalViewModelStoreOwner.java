package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.C6037x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "<init>", "()V", "lifecycle-viewmodel-compose_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocalViewModelStoreOwner {

    /* JADX INFO: renamed from: a */
    public static final LocalViewModelStoreOwner f33491a = new LocalViewModelStoreOwner();

    /* JADX INFO: renamed from: b */
    public static final C6037x f33492b = C5997d.m6415B(LocalViewModelStoreOwner$LocalViewModelStoreOwner$1.f33493Y);

    private LocalViewModelStoreOwner() {
    }

    /* JADX INFO: renamed from: a */
    public static ViewModelStoreOwner m12165a(C6021p c6021p) {
        c6021p.m6525T(-584162872);
        ViewModelStoreOwner viewModelStoreOwnerM12147a = (ViewModelStoreOwner) c6021p.m6548k(f33492b);
        if (viewModelStoreOwnerM12147a == null) {
            c6021p.m6525T(1382572291);
            viewModelStoreOwnerM12147a = ViewTreeViewModelStoreOwner.m12147a((View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f));
            c6021p.m6553p(false);
        }
        c6021p.m6553p(false);
        return viewModelStoreOwnerM12147a;
    }
}
