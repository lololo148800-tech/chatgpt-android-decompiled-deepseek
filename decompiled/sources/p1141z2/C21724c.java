package p1141z2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p419R4.AbstractC6809c;
import p817j$.util.Objects;

/* JADX INFO: renamed from: z2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21724c {

    /* JADX INFO: renamed from: a */
    public final TextPaint f68917a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f68918b;

    /* JADX INFO: renamed from: c */
    public final int f68919c;

    /* JADX INFO: renamed from: d */
    public final int f68920d;

    public C21724c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC6809c.m7249h(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f68917a = textPaint;
        this.f68918b = textDirectionHeuristic;
        this.f68919c = i10;
        this.f68920d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21724c)) {
            return false;
        }
        C21724c c21724c = (C21724c) obj;
        int i10 = Build.VERSION.SDK_INT;
        if (this.f68919c == c21724c.f68919c && this.f68920d == c21724c.f68920d) {
            TextPaint textPaint = this.f68917a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c21724c.f68917a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i10 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f68918b == c21724c.f68918b;
        }
        return false;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f68918b;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f68920d;
        int i12 = this.f68919c;
        TextPaint textPaint = this.f68917a;
        return i10 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f68917a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            sb2.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f68918b);
        sb2.append(", breakStrategy=" + this.f68919c);
        sb2.append(", hyphenationFrequency=" + this.f68920d);
        sb2.append("}");
        return sb2.toString();
    }

    public C21724c(PrecomputedText.Params params) {
        this.f68917a = params.getTextPaint();
        this.f68918b = params.getTextDirection();
        this.f68919c = params.getBreakStrategy();
        this.f68920d = params.getHyphenationFrequency();
    }
}
