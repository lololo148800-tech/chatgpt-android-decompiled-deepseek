package p230J1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: J1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4196w {

    /* JADX INFO: renamed from: a */
    public final CharSequence f13611a;

    /* JADX INFO: renamed from: b */
    public final int f13612b;

    /* JADX INFO: renamed from: c */
    public final int f13613c;

    /* JADX INFO: renamed from: d */
    public final TextPaint f13614d;

    /* JADX INFO: renamed from: e */
    public final int f13615e;

    /* JADX INFO: renamed from: f */
    public final TextDirectionHeuristic f13616f;

    /* JADX INFO: renamed from: g */
    public final Layout.Alignment f13617g;

    /* JADX INFO: renamed from: h */
    public final int f13618h;

    /* JADX INFO: renamed from: i */
    public final TextUtils.TruncateAt f13619i;

    /* JADX INFO: renamed from: j */
    public final int f13620j;

    /* JADX INFO: renamed from: k */
    public final float f13621k;

    /* JADX INFO: renamed from: l */
    public final float f13622l;

    /* JADX INFO: renamed from: m */
    public final int f13623m;

    /* JADX INFO: renamed from: n */
    public final boolean f13624n;

    /* JADX INFO: renamed from: o */
    public final boolean f13625o;

    /* JADX INFO: renamed from: p */
    public final int f13626p;

    /* JADX INFO: renamed from: q */
    public final int f13627q;

    /* JADX INFO: renamed from: r */
    public final int f13628r;

    /* JADX INFO: renamed from: s */
    public final int f13629s;

    /* JADX INFO: renamed from: t */
    public final int[] f13630t;

    /* JADX INFO: renamed from: u */
    public final int[] f13631u;

    public C4196w(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z6, boolean z10, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.f13611a = charSequence;
        this.f13612b = i10;
        this.f13613c = i11;
        this.f13614d = textPaint;
        this.f13615e = i12;
        this.f13616f = textDirectionHeuristic;
        this.f13617g = alignment;
        this.f13618h = i13;
        this.f13619i = truncateAt;
        this.f13620j = i14;
        this.f13621k = f10;
        this.f13622l = f11;
        this.f13623m = i15;
        this.f13624n = z6;
        this.f13625o = z10;
        this.f13626p = i16;
        this.f13627q = i17;
        this.f13628r = i18;
        this.f13629s = i19;
        this.f13630t = iArr;
        this.f13631u = iArr2;
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }
}
