package p898n4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p1053v3.C20421b;

/* JADX INFO: renamed from: n4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17477b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f55854a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f55855b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f55856c;

    /* JADX INFO: renamed from: d */
    public int f55857d;

    /* JADX INFO: renamed from: e */
    public int f55858e;

    /* JADX INFO: renamed from: f */
    public int f55859f;

    /* JADX INFO: renamed from: g */
    public int f55860g;

    /* JADX INFO: renamed from: h */
    public int f55861h;

    public C17477b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f55854a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f55855b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f55856c = sb2;
        this.f55860g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f55857d = 15;
        this.f55858e = 0;
        this.f55859f = 0;
        this.f55861h = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m19174a(char c9) {
        StringBuilder sb2 = this.f55856c;
        if (sb2.length() < 32) {
            sb2.append(c9);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19175b() {
        StringBuilder sb2 = this.f55856c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f55854a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C17476a c17476a = (C17476a) arrayList.get(size);
                int i10 = c17476a.f55853c;
                if (i10 != length) {
                    return;
                }
                c17476a.f55853c = i10 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C20421b m19176c(int i10) {
        int i11;
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f55855b;
            if (i12 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i12));
            spannableStringBuilder.append('\n');
            i12++;
        }
        spannableStringBuilder.append((CharSequence) m19177d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i13 = this.f55858e + this.f55859f;
        int length = (32 - i13) - spannableStringBuilder.length();
        int i14 = i13 - length;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f55860g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
            i11 = (this.f55860g != 2 || i14 <= 0) ? 0 : 2;
        } else {
            i11 = 1;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                i13 = 32 - length;
            }
            f10 = ((i13 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        int i15 = this.f55857d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f55860g == 1) {
            i15 -= this.f55861h - 1;
        }
        return new C20421b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m19177d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f55856c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f55854a;
            if (i14 >= arrayList.size()) {
                break;
            }
            C17476a c17476a = (C17476a) arrayList.get(i14);
            boolean z10 = c17476a.f55852b;
            int i16 = c17476a.f55851a;
            if (i16 != 8) {
                boolean z11 = i16 == 7;
                if (i16 != 7) {
                    i13 = C17478c.f55863B[i16];
                }
                z6 = z11;
            }
            int i17 = c17476a.f55853c;
            i14++;
            if (i17 != (i14 < arrayList.size() ? ((C17476a) arrayList.get(i14)).f55853c : length)) {
                if (i10 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z10) {
                    i10 = i17;
                }
                if (i11 != -1 && !z6) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z6) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19178e() {
        return this.f55854a.isEmpty() && this.f55855b.isEmpty() && this.f55856c.length() == 0;
    }
}
