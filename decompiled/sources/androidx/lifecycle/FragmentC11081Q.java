package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p167Gb.C3032c;

/* JADX INFO: renamed from: androidx.lifecycle.Q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m18067d2 = {"Landroidx/lifecycle/Q;", "Landroid/app/Fragment;", "<init>", "()V", "Gb/c", "androidx/lifecycle/O", "a", "lifecycle-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class FragmentC11081Q extends Fragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ int f33408Z = 0;

    /* JADX INFO: renamed from: Y */
    public C3032c f33409Y;

    /* JADX INFO: renamed from: androidx.lifecycle.Q$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C11080P Companion = new C11080P();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC16544l.m18094g(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC16544l.m18094g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC16544l.m18094g(activity, "activity");
            int i10 = FragmentC11081Q.f33408Z;
            AbstractC11079O.m12126a(activity, EnumC11103l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            int i10 = FragmentC11081Q.f33408Z;
            AbstractC11079O.m12126a(activity, EnumC11103l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            int i10 = FragmentC11081Q.f33408Z;
            AbstractC11079O.m12126a(activity, EnumC11103l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            int i10 = FragmentC11081Q.f33408Z;
            AbstractC11079O.m12126a(activity, EnumC11103l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            int i10 = FragmentC11081Q.f33408Z;
            AbstractC11079O.m12126a(activity, EnumC11103l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            int i10 = FragmentC11081Q.f33408Z;
            AbstractC11079O.m12126a(activity, EnumC11103l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC16544l.m18094g(activity, "activity");
            AbstractC16544l.m18094g(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12129a(EnumC11103l enumC11103l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC16544l.m18093f(activity, "activity");
            AbstractC11079O.m12126a(activity, enumC11103l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m12129a(EnumC11103l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m12129a(EnumC11103l.ON_DESTROY);
        this.f33409Y = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m12129a(EnumC11103l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C3032c c3032c = this.f33409Y;
        if (c3032c != null) {
            ((ProcessLifecycleOwner) c3032c.f9127Z).m12128b();
        }
        m12129a(EnumC11103l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C3032c c3032c = this.f33409Y;
        if (c3032c != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c3032c.f9127Z;
            int i10 = processLifecycleOwner.f33400Y + 1;
            processLifecycleOwner.f33400Y = i10;
            if (i10 == 1 && processLifecycleOwner.f33403p0) {
                processLifecycleOwner.f33405r0.m12170f(EnumC11103l.ON_START);
                processLifecycleOwner.f33403p0 = false;
            }
        }
        m12129a(EnumC11103l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m12129a(EnumC11103l.ON_STOP);
    }
}
