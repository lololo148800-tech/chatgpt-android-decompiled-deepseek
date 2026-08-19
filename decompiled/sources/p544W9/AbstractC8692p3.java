package p544W9;

import android.view.KeyEvent;

/* JADX INFO: renamed from: W9.p3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8692p3 {
    /* JADX INFO: renamed from: a */
    public static String m9388a(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }
}
