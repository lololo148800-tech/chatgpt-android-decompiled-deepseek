package p544W9;

import android.os.Handler;
import android.os.Looper;
import p283L5.AbstractC4941g;
import p895n1.C17425e;

/* JADX INFO: renamed from: W9.H2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8488H2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26310a;

    /* JADX INFO: renamed from: a */
    public static void m9140a() {
        AbstractC4941g.m5559R("Not in application's main thread", m9141b());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9141b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: c */
    public static void m9142c(Runnable runnable) {
        if (m9141b()) {
            runnable.run();
        } else {
            AbstractC4941g.m5559R("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
