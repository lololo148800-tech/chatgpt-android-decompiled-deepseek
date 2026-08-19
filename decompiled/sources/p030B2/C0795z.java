package p030B2;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p720e6.C13287b;

/* JADX INFO: renamed from: B2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0795z extends C13287b {

    /* JADX INFO: renamed from: o0 */
    public View f2210o0;

    /* JADX WARN: Type inference failed for: r4v0, types: [B2.y] */
    @Override // p720e6.C13287b
    /* JADX INFO: renamed from: l */
    public final void mo1818l() {
        View view = this.f2210o0;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.mo1818l();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r6 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: B2.y
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                atomicBoolean.set((i10 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r6);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r6);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // p720e6.C13287b
    /* JADX INFO: renamed from: s */
    public final void mo1819s() {
        View view = this.f2210o0;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo1819s();
    }
}
