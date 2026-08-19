package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: androidx.appcompat.view.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10828k {
    /* JADX INFO: renamed from: a */
    public static boolean m11120a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* JADX INFO: renamed from: b */
    public static ActionMode m11121b(Window.Callback callback, ActionMode.Callback callback2, int i10) {
        return callback.onWindowStartingActionMode(callback2, i10);
    }
}
