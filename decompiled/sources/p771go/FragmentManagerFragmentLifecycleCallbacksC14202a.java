package p771go;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager$FragmentLifecycleCallbacks;
import android.view.View;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.C0372g;

/* JADX INFO: renamed from: go.a */
/* JADX INFO: loaded from: classes2.dex */
public final class FragmentManagerFragmentLifecycleCallbacksC14202a extends FragmentManager$FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0372g f44613a;

    public FragmentManagerFragmentLifecycleCallbacksC14202a(C0372g c0372g) {
        this.f44613a = c0372g;
    }

    public final void onFragmentDestroyed(FragmentManager fm, Fragment fragment) {
        AbstractC16544l.m18095h(fm, "fm");
        AbstractC16544l.m18095h(fragment, "fragment");
        ((C13711h) this.f44613a.f1266o0).m15194i(fragment, fragment.getClass().getName().concat(" received Fragment#onDestroy() callback"));
    }

    public final void onFragmentViewDestroyed(FragmentManager fm, Fragment fragment) {
        AbstractC16544l.m18095h(fm, "fm");
        AbstractC16544l.m18095h(fragment, "fragment");
        View view = fragment.getView();
        if (view != null) {
            ((C13711h) this.f44613a.f1266o0).m15194i(view, fragment.getClass().getName().concat(" received Fragment#onDestroyView() callback (references to its views should be cleared to prevent leaks)"));
        }
    }
}
