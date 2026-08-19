package p937p1;

import androidx.compose.p650ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: p1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18286b implements InterfaceC18285a {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f58376a;

    public C18286b(AndroidComposeView androidComposeView) {
        this.f58376a = androidComposeView;
    }

    /* JADX INFO: renamed from: a */
    public final void m19828a(int i10) {
        boolean z6 = i10 == 0;
        AndroidComposeView androidComposeView = this.f58376a;
        if (z6) {
            androidComposeView.performHapticFeedback(0);
        } else if (i10 == 9) {
            androidComposeView.performHapticFeedback(9);
        }
    }
}
