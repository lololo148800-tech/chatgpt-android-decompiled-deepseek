package p898n4;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: n4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17480e {

    /* JADX INFO: renamed from: A */
    public static final boolean[] f55891A;

    /* JADX INFO: renamed from: B */
    public static final int[] f55892B;

    /* JADX INFO: renamed from: C */
    public static final int[] f55893C;

    /* JADX INFO: renamed from: D */
    public static final int[] f55894D;

    /* JADX INFO: renamed from: E */
    public static final int[] f55895E;

    /* JADX INFO: renamed from: v */
    public static final int f55896v = m19186c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w */
    public static final int f55897w;

    /* JADX INFO: renamed from: x */
    public static final int[] f55898x;

    /* JADX INFO: renamed from: y */
    public static final int[] f55899y;

    /* JADX INFO: renamed from: z */
    public static final int[] f55900z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f55901a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f55902b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f55903c;

    /* JADX INFO: renamed from: d */
    public boolean f55904d;

    /* JADX INFO: renamed from: e */
    public int f55905e;

    /* JADX INFO: renamed from: f */
    public boolean f55906f;

    /* JADX INFO: renamed from: g */
    public int f55907g;

    /* JADX INFO: renamed from: h */
    public int f55908h;

    /* JADX INFO: renamed from: i */
    public int f55909i;

    /* JADX INFO: renamed from: j */
    public int f55910j;

    /* JADX INFO: renamed from: k */
    public int f55911k;

    /* JADX INFO: renamed from: l */
    public int f55912l;

    /* JADX INFO: renamed from: m */
    public int f55913m;

    /* JADX INFO: renamed from: n */
    public int f55914n;

    /* JADX INFO: renamed from: o */
    public int f55915o;

    /* JADX INFO: renamed from: p */
    public int f55916p;

    /* JADX INFO: renamed from: q */
    public int f55917q;

    /* JADX INFO: renamed from: r */
    public int f55918r;

    /* JADX INFO: renamed from: s */
    public int f55919s;

    /* JADX INFO: renamed from: t */
    public int f55920t;

    /* JADX INFO: renamed from: u */
    public int f55921u;

    static {
        int iM19186c = m19186c(0, 0, 0, 0);
        f55897w = iM19186c;
        int iM19186c2 = m19186c(0, 0, 0, 3);
        f55898x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f55899y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f55900z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f55891A = new boolean[]{false, false, false, true, true, true, false};
        f55892B = new int[]{iM19186c, iM19186c2, iM19186c, iM19186c, iM19186c2, iM19186c, iM19186c};
        f55893C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f55894D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f55895E = new int[]{iM19186c, iM19186c, iM19186c, iM19186c, iM19186c, iM19186c2, iM19186c2};
    }

    public C17480e() {
        m19189d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m19186c(int i10, int i11, int i12, int i13) {
        int i14;
        AbstractC20800b.m21318f(i10, 4);
        AbstractC20800b.m21318f(i11, 4);
        AbstractC20800b.m21318f(i12, 4);
        AbstractC20800b.m21318f(i13, 4);
        if (i13 == 0 || i13 == 1) {
            i14 = 255;
        } else if (i13 == 2) {
            i14 = 127;
        } else if (i13 != 3) {
            i14 = 255;
        } else {
            i14 = 0;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m19187a(char c9) {
        SpannableStringBuilder spannableStringBuilder = this.f55902b;
        if (c9 != '\n') {
            spannableStringBuilder.append(c9);
            return;
        }
        ArrayList arrayList = this.f55901a;
        arrayList.add(m19188b());
        spannableStringBuilder.clear();
        if (this.f55915o != -1) {
            this.f55915o = 0;
        }
        if (this.f55916p != -1) {
            this.f55916p = 0;
        }
        if (this.f55917q != -1) {
            this.f55917q = 0;
        }
        if (this.f55919s != -1) {
            this.f55919s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f55910j && arrayList.size() < 15) {
                this.f55921u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m19188b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f55902b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f55915o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f55915o, length, 33);
            }
            if (this.f55916p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f55916p, length, 33);
            }
            if (this.f55917q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f55918r), this.f55917q, length, 33);
            }
            if (this.f55919s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f55920t), this.f55919s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m19189d() {
        this.f55901a.clear();
        this.f55902b.clear();
        this.f55915o = -1;
        this.f55916p = -1;
        this.f55917q = -1;
        this.f55919s = -1;
        this.f55921u = 0;
        this.f55903c = false;
        this.f55904d = false;
        this.f55905e = 4;
        this.f55906f = false;
        this.f55907g = 0;
        this.f55908h = 0;
        this.f55909i = 0;
        this.f55910j = 15;
        this.f55911k = 0;
        this.f55912l = 0;
        this.f55913m = 0;
        int i10 = f55897w;
        this.f55914n = i10;
        this.f55918r = f55896v;
        this.f55920t = i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m19190e(boolean z6, boolean z10) {
        int i10 = this.f55915o;
        SpannableStringBuilder spannableStringBuilder = this.f55902b;
        if (i10 != -1) {
            if (!z6) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f55915o, spannableStringBuilder.length(), 33);
                this.f55915o = -1;
            }
        } else if (z6) {
            this.f55915o = spannableStringBuilder.length();
        }
        if (this.f55916p == -1) {
            if (z10) {
                this.f55916p = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f55916p, spannableStringBuilder.length(), 33);
            this.f55916p = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19191f(int i10, int i11) {
        int i12 = this.f55917q;
        SpannableStringBuilder spannableStringBuilder = this.f55902b;
        if (i12 != -1 && this.f55918r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f55918r), this.f55917q, spannableStringBuilder.length(), 33);
        }
        if (i10 != f55896v) {
            this.f55917q = spannableStringBuilder.length();
            this.f55918r = i10;
        }
        if (this.f55919s != -1 && this.f55920t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f55920t), this.f55919s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f55897w) {
            this.f55919s = spannableStringBuilder.length();
            this.f55920t = i11;
        }
    }
}
