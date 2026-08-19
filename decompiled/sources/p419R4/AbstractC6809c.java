package p419R4;

import android.database.CursorWindow;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: R4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6809c {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ CursorWindow m7244c(long j10) {
        return new CursorWindow(null, j10);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ PrecomputedText.Params.Builder m7249h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ DisplayCutout m7252k(Object obj) {
        return (DisplayCutout) obj;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m7264w(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m7265x(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
