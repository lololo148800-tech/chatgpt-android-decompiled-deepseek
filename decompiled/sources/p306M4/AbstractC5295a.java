package p306M4;

import android.os.Trace;

/* JADX INFO: renamed from: M4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5295a {
    /* JADX INFO: renamed from: a */
    public static boolean m5835a() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: b */
    public static void m5836b(int i10, String str) {
        Trace.setCounter(str, i10);
    }
}
