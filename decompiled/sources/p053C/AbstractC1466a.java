package p053C;

import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: C.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1466a {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ LineBreakConfig.Builder m2087g() {
        return new LineBreakConfig.Builder();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles m2091k(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ BoringLayout m2093m(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z6, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z6, truncateAt, i11, z10);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m2095o(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m2098r(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
