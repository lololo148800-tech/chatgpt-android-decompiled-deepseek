package za;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: za.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21824g {

    /* JADX INFO: renamed from: a */
    public CharSequence f69258a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f69259b;

    /* JADX INFO: renamed from: c */
    public final int f69260c;

    /* JADX INFO: renamed from: d */
    public int f69261d;

    /* JADX INFO: renamed from: j */
    public boolean f69267j;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f69262e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f69263f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f69264g = 1.0f;

    /* JADX INFO: renamed from: h */
    public int f69265h = 1;

    /* JADX INFO: renamed from: i */
    public boolean f69266i = true;

    /* JADX INFO: renamed from: k */
    public TextUtils.TruncateAt f69268k = null;

    public C21824g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f69258a = charSequence;
        this.f69259b = textPaint;
        this.f69260c = i10;
        this.f69261d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m22305a() {
        if (this.f69258a == null) {
            this.f69258a = "";
        }
        int iMax = Math.max(0, this.f69260c);
        CharSequence charSequenceEllipsize = this.f69258a;
        int i10 = this.f69263f;
        TextPaint textPaint = this.f69259b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f69268k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f69261d);
        this.f69261d = iMin;
        if (this.f69267j && this.f69263f == 1) {
            this.f69262e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f69262e);
        builderObtain.setIncludePad(this.f69266i);
        builderObtain.setTextDirection(this.f69267j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f69268k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f69263f);
        float f10 = this.f69264g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f10);
        }
        if (this.f69263f > 1) {
            builderObtain.setHyphenationFrequency(this.f69265h);
        }
        return builderObtain.build();
    }
}
