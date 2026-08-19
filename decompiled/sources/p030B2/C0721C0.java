package p030B2;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p523V9.AbstractC8186s0;

/* JADX INFO: renamed from: B2.C0 */
/* JADX INFO: loaded from: classes.dex */
public class C0721C0 extends AbstractC8186s0 {

    /* JADX INFO: renamed from: a */
    public final WindowInsetsController f2076a;

    /* JADX INFO: renamed from: b */
    public final Window f2077b;

    public C0721C0(Window window) {
        this.f2076a = window.getInsetsController();
        this.f2077b = window;
    }

    @Override // p523V9.AbstractC8186s0
    /* JADX INFO: renamed from: b */
    public final void mo1489b(boolean z6) {
        Window window = this.f2077b;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f2076a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f2076a.setSystemBarsAppearance(0, 16);
    }

    @Override // p523V9.AbstractC8186s0
    /* JADX INFO: renamed from: c */
    public final void mo1532c(boolean z6) {
        Window window = this.f2077b;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f2076a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f2076a.setSystemBarsAppearance(0, 8);
    }
}
