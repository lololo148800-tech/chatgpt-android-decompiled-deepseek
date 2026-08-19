package p003A1;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: A1.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306y1 {

    /* JADX INFO: renamed from: a */
    public static final C0306y1 f1078a = new C0306y1();

    /* JADX INFO: renamed from: a */
    public final void m908a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    /* JADX INFO: renamed from: b */
    public final ActionMode m909b(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
