package p999s;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: s.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19331Z {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m20431a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, AbstractC19340c0 abstractC19340c0) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            abstractC19340c0.mo20433a(builderObtain, textView);
        } catch (ClassCastException unused) {
            AbstractC15256t.m16482t("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }
}
