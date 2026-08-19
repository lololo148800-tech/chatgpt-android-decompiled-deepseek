package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: androidx.lifecycle.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11079O {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m12126a(Activity activity, EnumC11103l event) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(event, "event");
        if (activity instanceof InterfaceC11112u) {
            AbstractC11105n abstractC11105nMo7809i = ((InterfaceC11112u) activity).mo7809i();
            if (abstractC11105nMo7809i instanceof C11114w) {
                ((C11114w) abstractC11105nMo7809i).m12170f(event);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12127b(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC11081Q.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC11081Q.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC11081Q(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
