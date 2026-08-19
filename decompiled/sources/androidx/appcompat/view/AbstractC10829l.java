package androidx.appcompat.view;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: androidx.appcompat.view.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10829l {
    /* JADX INFO: renamed from: a */
    public static void m11122a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        callback.onProvideKeyboardShortcuts(list, menu, i10);
    }
}
