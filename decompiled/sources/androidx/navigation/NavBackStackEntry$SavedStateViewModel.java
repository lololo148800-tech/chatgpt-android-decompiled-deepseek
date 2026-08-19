package androidx.navigation;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"androidx/navigation/NavBackStackEntry$SavedStateViewModel", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/S;", "handle", "<init>", "(Landroidx/lifecycle/S;)V", "navigation-common_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class NavBackStackEntry$SavedStateViewModel extends ViewModel {

    /* JADX INFO: renamed from: b */
    public final C11082S f33519b;

    public NavBackStackEntry$SavedStateViewModel(C11082S handle) {
        AbstractC16544l.m18094g(handle, "handle");
        this.f33519b = handle;
    }
}
