package p030B2;

import android.view.View;
import android.view.Window;
import p523V9.AbstractC8186s0;

/* JADX INFO: renamed from: B2.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C0796z0 extends AbstractC8186s0 {

    /* JADX INFO: renamed from: a */
    public final Window f2211a;

    public C0796z0(Window window) {
        this.f2211a = window;
    }

    @Override // p523V9.AbstractC8186s0
    /* JADX INFO: renamed from: c */
    public final void mo1532c(boolean z6) {
        Window window = this.f2211a;
        if (!z6) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
