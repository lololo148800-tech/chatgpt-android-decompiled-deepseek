package p230J1;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC16544l;
import p117Eb.C2392v;
import p239Ja.C4312o;
import p279L1.C4900a;
import p279L1.C4907h;
import p544W9.AbstractC8583X2;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: J1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C4199z {

    /* JADX INFO: renamed from: a */
    public final TextPaint f13635a;

    /* JADX INFO: renamed from: b */
    public final boolean f13636b;

    /* JADX INFO: renamed from: d */
    public final boolean f13638d;

    /* JADX INFO: renamed from: e */
    public C4312o f13639e;

    /* JADX INFO: renamed from: f */
    public final Layout f13640f;

    /* JADX INFO: renamed from: g */
    public final int f13641g;

    /* JADX INFO: renamed from: h */
    public final int f13642h;

    /* JADX INFO: renamed from: i */
    public final int f13643i;

    /* JADX INFO: renamed from: j */
    public final float f13644j;

    /* JADX INFO: renamed from: k */
    public final float f13645k;

    /* JADX INFO: renamed from: l */
    public final boolean f13646l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f13647m;

    /* JADX INFO: renamed from: n */
    public final int f13648n;

    /* JADX INFO: renamed from: o */
    public final C4907h[] f13649o;

    /* JADX INFO: renamed from: q */
    public C2392v f13651q;

    /* JADX INFO: renamed from: c */
    public final boolean f13637c = true;

    /* JADX INFO: renamed from: p */
    public final Rect f13650p = new Rect();

    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dd  */
    public C4199z(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z6, int i12, int i13, int i14, int i15, int i16, int i17, C4188o c4188o) {
        boolean z10;
        C4190q c4190q;
        Layout layoutMo4884a;
        long j10;
        C4907h[] c4907hArr;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        boolean zM4887a;
        BoringLayout boringLayoutM4797a;
        this.f13635a = textPaint;
        this.f13636b = z6;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM4792a = AbstractC4173A.m4792a(i11);
        Layout.Alignment alignment = AbstractC4197x.f13632a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : AbstractC4197x.f13633b : AbstractC4197x.f13632a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C4900a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM4881a = c4188o.m4881a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            C4190q c4190q2 = AbstractC4194u.f13610a;
            if (metricsM4881a == null || c4188o.m4882b() > f10 || z11) {
                z10 = true;
                this.f13646l = false;
                c4190q = c4190q2;
                layoutMo4884a = c4190q.mo4884a(new C4196w(charSequence, 0, charSequence.length(), textPaint, iCeil, textDirectionHeuristicM4792a, alignment2, i12, truncateAt, (int) Math.ceil(d10), 1.0f, 0.0f, i17, z6, true, i13, i14, i15, i16, null, null));
            } else {
                this.f13646l = true;
                if (iCeil < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if (iCeil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    z10 = true;
                    boringLayoutM4797a = AbstractC4176c.m4794a(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM4881a, z6, true, truncateAt, iCeil);
                } else {
                    z10 = true;
                    boringLayoutM4797a = AbstractC4177d.m4797a(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM4881a, z6, truncateAt, iCeil);
                }
                layoutMo4884a = boringLayoutM4797a;
                c4190q = c4190q2;
            }
            this.f13640f = layoutMo4884a;
            Trace.endSection();
            int iMin = Math.min(layoutMo4884a.getLineCount(), i12);
            this.f13641g = iMin;
            int i19 = iMin - 1;
            this.f13638d = iMin >= i12 && (layoutMo4884a.getEllipsisCount(i19) > 0 || layoutMo4884a.getLineEnd(i19) != charSequence.length());
            long j11 = AbstractC4173A.f13588b;
            if (z6) {
                j10 = j11;
            } else {
                if (this.f13646l) {
                    zM4887a = Build.VERSION.SDK_INT >= 33 ? AbstractC4176c.m4796c((BoringLayout) layoutMo4884a) : false;
                } else {
                    StaticLayout staticLayout = (StaticLayout) layoutMo4884a;
                    int i20 = Build.VERSION.SDK_INT;
                    zM4887a = i20 >= 33 ? AbstractC4193t.m4887a(staticLayout) : i20 >= 28 ? z10 : false;
                }
                if (zM4887a) {
                    j10 = j11;
                } else {
                    TextPaint paint = layoutMo4884a.getPaint();
                    CharSequence text = layoutMo4884a.getText();
                    Rect rectM4889a = AbstractC4194u.m4889a(paint, text, layoutMo4884a.getLineStart(0), layoutMo4884a.getLineEnd(0));
                    int lineAscent = layoutMo4884a.getLineAscent(0);
                    int i21 = rectM4889a.top;
                    int topPadding = i21 < lineAscent ? lineAscent - i21 : layoutMo4884a.getTopPadding();
                    rectM4889a = iMin != 1 ? AbstractC4194u.m4889a(paint, text, layoutMo4884a.getLineStart(i19), layoutMo4884a.getLineEnd(i19)) : rectM4889a;
                    int lineDescent = layoutMo4884a.getLineDescent(i19);
                    int i22 = rectM4889a.bottom;
                    int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutMo4884a.getBottomPadding();
                    if (topPadding == 0 && bottomPadding == 0) {
                        j10 = j11;
                    } else {
                        j10 = (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
                    }
                }
            }
            if (layoutMo4884a.getText() instanceof Spanned) {
                CharSequence text2 = layoutMo4884a.getText();
                AbstractC16544l.m18092e(text2, "null cannot be cast to non-null type android.text.Spanned");
                if (AbstractC4194u.m4893e((Spanned) text2, C4907h.class) || layoutMo4884a.getText().length() <= 0) {
                    CharSequence text3 = layoutMo4884a.getText();
                    AbstractC16544l.m18092e(text3, "null cannot be cast to non-null type android.text.Spanned");
                    c4907hArr = (C4907h[]) ((Spanned) text3).getSpans(0, layoutMo4884a.getText().length(), C4907h.class);
                } else {
                    c4907hArr = null;
                }
            } else {
                c4907hArr = null;
            }
            this.f13649o = c4907hArr;
            if (c4907hArr != null) {
                int iMax = 0;
                int iMax2 = 0;
                for (C4907h c4907h : c4907hArr) {
                    int i23 = c4907h.f15979v0;
                    iMax = i23 < 0 ? Math.max(iMax, Math.abs(i23)) : iMax;
                    int i24 = c4907h.f15980w0;
                    if (i24 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i24));
                    }
                }
                j11 = (iMax == 0 && iMax2 == 0) ? AbstractC4173A.f13588b : (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
            }
            this.f13642h = Math.max((int) (j10 >> 32), (int) (j11 >> 32));
            this.f13643i = Math.max((int) (j10 & 4294967295L), (int) (j11 & 4294967295L));
            TextPaint textPaint2 = this.f13635a;
            C4907h[] c4907hArr2 = this.f13649o;
            int i25 = this.f13641g - 1;
            Layout layout = this.f13640f;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || c4907hArr2 == null || c4907hArr2.length == 0) {
                i18 = 0;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                C4907h c4907h2 = (C4907h) AbstractC17678l.m19316w(c4907hArr2);
                spannableString.setSpan(new C4907h(c4907h2.f15970Y, spannableString.length(), (i25 == 0 || !c4907h2.f15973p0) ? c4907h2.f15973p0 : false, c4907h2.f15973p0, c4907h2.f15974q0), 0, spannableString.length(), 33);
                i18 = 0;
                StaticLayout staticLayoutMo4884a = c4190q.mo4884a(new C4196w(spannableString, 0, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicM4792a, AbstractC4186m.f13599a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, this.f13636b, this.f13637c, 0, 0, 0, 0, null, null));
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutMo4884a.getLineAscent(0);
                fontMetricsInt.descent = staticLayoutMo4884a.getLineDescent(0);
                fontMetricsInt.top = staticLayoutMo4884a.getLineTop(0);
                fontMetricsInt.bottom = staticLayoutMo4884a.getLineBottom(0);
            }
            this.f13648n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m4898e(i19) - m4900g(i19))) : i18;
            this.f13647m = fontMetricsInt;
            Layout layout2 = this.f13640f;
            this.f13644j = AbstractC8583X2.m9246a(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f13640f;
            this.f13645k = AbstractC8583X2.m9247b(layout3, i19, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4894a() {
        boolean z6 = this.f13638d;
        Layout layout = this.f13640f;
        return (z6 ? layout.getLineBottom(this.f13641g - 1) : layout.getHeight()) + this.f13642h + this.f13643i + this.f13648n;
    }

    /* JADX INFO: renamed from: b */
    public final float m4895b(int i10) {
        if (i10 == this.f13641g - 1) {
            return this.f13644j + this.f13645k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final C2392v m4896c() {
        C2392v c2392v = this.f13651q;
        if (c2392v != null) {
            return c2392v;
        }
        C2392v c2392v2 = new C2392v(this.f13640f);
        this.f13651q = c2392v2;
        return c2392v2;
    }

    /* JADX INFO: renamed from: d */
    public final float m4897d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f13642h + ((i10 != this.f13641g + (-1) || (fontMetricsInt = this.f13647m) == null) ? this.f13640f.getLineBaseline(i10) : m4900g(i10) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: e */
    public final float m4898e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f13641g;
        int i12 = i11 - 1;
        Layout layout = this.f13640f;
        if (i10 != i12 || (fontMetricsInt = this.f13647m) == null) {
            return this.f13642h + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f13643i : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: f */
    public final int m4899f(int i10) {
        Layout layout = this.f13640f;
        return layout.getEllipsisStart(i10) == 0 ? layout.getLineEnd(i10) : layout.getText().length();
    }

    /* JADX INFO: renamed from: g */
    public final float m4900g(int i10) {
        return this.f13640f.getLineTop(i10) + (i10 == 0 ? 0 : this.f13642h);
    }

    /* JADX INFO: renamed from: h */
    public final float m4901h(int i10, boolean z6) {
        return m4895b(this.f13640f.getLineForOffset(i10)) + m4896c().m3563u(i10, true, z6);
    }

    /* JADX INFO: renamed from: i */
    public final float m4902i(int i10, boolean z6) {
        return m4895b(this.f13640f.getLineForOffset(i10)) + m4896c().m3563u(i10, false, z6);
    }

    /* JADX INFO: renamed from: j */
    public final C4312o m4903j() {
        C4312o c4312o = this.f13639e;
        if (c4312o != null) {
            return c4312o;
        }
        Layout layout = this.f13640f;
        C4312o c4312o2 = new C4312o(layout.getText(), layout.getText().length(), this.f13635a.getTextLocale());
        this.f13639e = c4312o2;
        return c4312o2;
    }
}
