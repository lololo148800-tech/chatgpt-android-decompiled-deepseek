package p1053v3;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: v3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20421b {

    /* JADX INFO: renamed from: A */
    public static final String f64558A;

    /* JADX INFO: renamed from: B */
    public static final String f64559B;

    /* JADX INFO: renamed from: C */
    public static final String f64560C;

    /* JADX INFO: renamed from: D */
    public static final String f64561D;

    /* JADX INFO: renamed from: E */
    public static final String f64562E;

    /* JADX INFO: renamed from: F */
    public static final String f64563F;

    /* JADX INFO: renamed from: G */
    public static final String f64564G;

    /* JADX INFO: renamed from: H */
    public static final String f64565H;

    /* JADX INFO: renamed from: I */
    public static final String f64566I;

    /* JADX INFO: renamed from: J */
    public static final String f64567J;

    /* JADX INFO: renamed from: r */
    public static final String f64568r;

    /* JADX INFO: renamed from: s */
    public static final String f64569s;

    /* JADX INFO: renamed from: t */
    public static final String f64570t;

    /* JADX INFO: renamed from: u */
    public static final String f64571u;

    /* JADX INFO: renamed from: v */
    public static final String f64572v;

    /* JADX INFO: renamed from: w */
    public static final String f64573w;

    /* JADX INFO: renamed from: x */
    public static final String f64574x;

    /* JADX INFO: renamed from: y */
    public static final String f64575y;

    /* JADX INFO: renamed from: z */
    public static final String f64576z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f64577a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f64578b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f64579c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f64580d;

    /* JADX INFO: renamed from: e */
    public final float f64581e;

    /* JADX INFO: renamed from: f */
    public final int f64582f;

    /* JADX INFO: renamed from: g */
    public final int f64583g;

    /* JADX INFO: renamed from: h */
    public final float f64584h;

    /* JADX INFO: renamed from: i */
    public final int f64585i;

    /* JADX INFO: renamed from: j */
    public final float f64586j;

    /* JADX INFO: renamed from: k */
    public final float f64587k;

    /* JADX INFO: renamed from: l */
    public final boolean f64588l;

    /* JADX INFO: renamed from: m */
    public final int f64589m;

    /* JADX INFO: renamed from: n */
    public final int f64590n;

    /* JADX INFO: renamed from: o */
    public final float f64591o;

    /* JADX INFO: renamed from: p */
    public final int f64592p;

    /* JADX INFO: renamed from: q */
    public final float f64593q;

    static {
        new C20421b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i10 = AbstractC20817s.f66106a;
        f64568r = Integer.toString(0, 36);
        f64569s = Integer.toString(17, 36);
        f64570t = Integer.toString(1, 36);
        f64571u = Integer.toString(2, 36);
        f64572v = Integer.toString(3, 36);
        f64573w = Integer.toString(18, 36);
        f64574x = Integer.toString(4, 36);
        f64575y = Integer.toString(5, 36);
        f64576z = Integer.toString(6, 36);
        f64558A = Integer.toString(7, 36);
        f64559B = Integer.toString(8, 36);
        f64560C = Integer.toString(9, 36);
        f64561D = Integer.toString(10, 36);
        f64562E = Integer.toString(11, 36);
        f64563F = Integer.toString(12, 36);
        f64564G = Integer.toString(13, 36);
        f64565H = Integer.toString(14, 36);
        f64566I = Integer.toString(15, 36);
        f64567J = Integer.toString(16, 36);
    }

    public C20421b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z6, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC20800b.m21316d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f64577a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f64577a = charSequence.toString();
        } else {
            this.f64577a = null;
        }
        this.f64578b = alignment;
        this.f64579c = alignment2;
        this.f64580d = bitmap;
        this.f64581e = f10;
        this.f64582f = i10;
        this.f64583g = i11;
        this.f64584h = f11;
        this.f64585i = i12;
        this.f64586j = f13;
        this.f64587k = f14;
        this.f64588l = z6;
        this.f64589m = i14;
        this.f64590n = i13;
        this.f64591o = f12;
        this.f64592p = i15;
        this.f64593q = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20421b.class != obj.getClass()) {
            return false;
        }
        C20421b c20421b = (C20421b) obj;
        if (TextUtils.equals(this.f64577a, c20421b.f64577a) && this.f64578b == c20421b.f64578b && this.f64579c == c20421b.f64579c) {
            Bitmap bitmap = c20421b.f64580d;
            Bitmap bitmap2 = this.f64580d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f64581e == c20421b.f64581e && this.f64582f == c20421b.f64582f && this.f64583g == c20421b.f64583g && this.f64584h == c20421b.f64584h && this.f64585i == c20421b.f64585i && this.f64586j == c20421b.f64586j && this.f64587k == c20421b.f64587k && this.f64588l == c20421b.f64588l && this.f64589m == c20421b.f64589m && this.f64590n == c20421b.f64590n && this.f64591o == c20421b.f64591o && this.f64592p == c20421b.f64592p && this.f64593q == c20421b.f64593q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f64577a, this.f64578b, this.f64579c, this.f64580d, Float.valueOf(this.f64581e), Integer.valueOf(this.f64582f), Integer.valueOf(this.f64583g), Float.valueOf(this.f64584h), Integer.valueOf(this.f64585i), Float.valueOf(this.f64586j), Float.valueOf(this.f64587k), Boolean.valueOf(this.f64588l), Integer.valueOf(this.f64589m), Integer.valueOf(this.f64590n), Float.valueOf(this.f64591o), Integer.valueOf(this.f64592p), Float.valueOf(this.f64593q)});
    }
}
