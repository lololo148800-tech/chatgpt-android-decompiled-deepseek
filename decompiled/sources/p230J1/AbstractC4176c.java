package p230J1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p053C.AbstractC1466a;

/* JADX INFO: renamed from: J1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4176c {
    /* JADX INFO: renamed from: a */
    public static final BoringLayout m4794a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z6, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return AbstractC1466a.m2093m(charSequence, textPaint, i10, alignment, f10, f11, metrics, z6, z10, truncateAt, i11);
    }

    /* JADX INFO: renamed from: b */
    public static final BoringLayout.Metrics m4795b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4796c(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
