package p230J1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: J1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4177d {
    /* JADX INFO: renamed from: a */
    public static final BoringLayout m4797a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z6, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z6, truncateAt, i11);
    }

    /* JADX INFO: renamed from: b */
    public static final BoringLayout.Metrics m4798b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
