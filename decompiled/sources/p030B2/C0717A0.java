package p030B2;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: B2.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0717A0 extends C0796z0 {
    @Override // p523V9.AbstractC8186s0
    /* JADX INFO: renamed from: b */
    public final void mo1489b(boolean z6) {
        Window window = this.f2211a;
        if (!z6) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
