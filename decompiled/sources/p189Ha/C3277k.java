package p189Ha;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: Ha.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3277k extends AbstractC3276j {

    /* JADX INFO: renamed from: E */
    public static final int[] f9993E = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: D */
    public final AccessibilityManager f9994D;

    public C3277k(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f9994D = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
