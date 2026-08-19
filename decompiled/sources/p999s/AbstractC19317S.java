package p999s;

import android.widget.TextView;

/* JADX INFO: renamed from: s.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19317S {
    /* JADX INFO: renamed from: a */
    public static int m20402a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m20403b(TextView textView, int i10, int i11, int i12, int i13) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static void m20404c(TextView textView, int[] iArr, int i10) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20405d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
