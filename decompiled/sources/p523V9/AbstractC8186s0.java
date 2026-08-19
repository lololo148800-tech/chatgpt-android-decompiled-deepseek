package p523V9;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* JADX INFO: renamed from: V9.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8186s0 {
    /* JADX INFO: renamed from: a */
    public static void m8768a(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1532c(boolean z6);

    /* JADX INFO: renamed from: d */
    public abstract void mo8769d(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: b */
    public void mo1489b(boolean z6) {
    }
}
