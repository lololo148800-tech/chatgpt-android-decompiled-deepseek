package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: androidx.lifecycle.I */
/* JADX INFO: loaded from: classes.dex */
public final class C11073I extends AbstractC11098g {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.I$a */
    public static final class a extends AbstractC11098g {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            this.this$0.m12128b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC16544l.m18094g(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i10 = processLifecycleOwner.f33400Y + 1;
            processLifecycleOwner.f33400Y = i10;
            if (i10 == 1 && processLifecycleOwner.f33403p0) {
                processLifecycleOwner.f33405r0.m12170f(EnumC11103l.ON_START);
                processLifecycleOwner.f33403p0 = false;
            }
        }
    }

    public C11073I(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.AbstractC11098g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC16544l.m18094g(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = FragmentC11081Q.f33408Z;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC16544l.m18092e(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC11081Q) fragmentFindFragmentByTag).f33409Y = this.this$0.f33407t0;
        }
    }

    @Override // androidx.lifecycle.AbstractC11098g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f33401Z - 1;
        processLifecycleOwner.f33401Z = i10;
        if (i10 == 0) {
            Handler handler = processLifecycleOwner.f33404q0;
            AbstractC16544l.m18091d(handler);
            handler.postDelayed(processLifecycleOwner.f33406s0, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC11072H.m12125a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC11098g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f33400Y - 1;
        processLifecycleOwner.f33400Y = i10;
        if (i10 == 0 && processLifecycleOwner.f33402o0) {
            processLifecycleOwner.f33405r0.m12170f(EnumC11103l.ON_STOP);
            processLifecycleOwner.f33403p0 = true;
        }
    }
}
