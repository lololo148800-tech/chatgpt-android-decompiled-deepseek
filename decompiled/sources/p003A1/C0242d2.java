package p003A1;

import android.view.ViewParent;
import androidx.compose.p650ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: A1.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242d2 {

    /* JADX INFO: renamed from: a */
    public static final C0242d2 f902a = new C0242d2();

    /* JADX INFO: renamed from: a */
    public final void m812a(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
