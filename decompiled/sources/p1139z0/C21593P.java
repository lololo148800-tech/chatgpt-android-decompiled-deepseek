package p1139z0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p350O1.C6063l;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: z0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C21593P implements CharSequence {

    /* JADX INFO: renamed from: Y */
    public CharSequence f68386Y;

    /* JADX INFO: renamed from: Z */
    public C6063l f68387Z;

    /* JADX INFO: renamed from: o0 */
    public int f68388o0 = -1;

    /* JADX INFO: renamed from: p0 */
    public int f68389p0 = -1;

    public C21593P(CharSequence charSequence) {
        this.f68386Y = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final void m21939a(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("start=", i10, i11, " > end=").toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("textStart=", i12, i13, " > textEnd=").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "start must be non-negative, but was ").toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i12, "textStart must be non-negative, but was ").toString());
        }
        C6063l c6063l = this.f68387Z;
        int i14 = i13 - i12;
        if (c6063l == null) {
            int iMax = Math.max(255, i14 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(this.f68386Y.length() - i11, 64);
            int i15 = i10 - iMin;
            AbstractC21627m.m21976x(this.f68386Y, cArr, 0, i15, i10);
            int i16 = iMax - iMin2;
            int i17 = iMin2 + i11;
            AbstractC21627m.m21976x(this.f68386Y, cArr, i16, i11, i17);
            AbstractC21627m.m21976x(charSequence, cArr, iMin, i12, i13);
            C6063l c6063l2 = new C6063l(1);
            c6063l2.f19750b = iMax;
            c6063l2.f19751c = cArr;
            c6063l2.f19752d = iMin + i14;
            c6063l2.f19753e = i16;
            this.f68387Z = c6063l2;
            this.f68388o0 = i15;
            this.f68389p0 = i17;
            return;
        }
        int i18 = this.f68388o0;
        int i19 = i10 - i18;
        int i20 = i11 - i18;
        if (i19 < 0 || i20 > c6063l.f19750b - c6063l.m6638a()) {
            this.f68386Y = toString();
            this.f68387Z = null;
            this.f68388o0 = -1;
            this.f68389p0 = -1;
            m21939a(i10, i11, charSequence, i12, i13);
            return;
        }
        int i21 = i14 - (i20 - i19);
        if (i21 > c6063l.m6638a()) {
            int iM6638a = i21 - c6063l.m6638a();
            int i22 = c6063l.f19750b;
            do {
                i22 *= 2;
            } while (i22 - c6063l.f19750b < iM6638a);
            char[] cArr2 = new char[i22];
            AbstractC17678l.m19306m(c6063l.f19751c, cArr2, 0, 0, c6063l.f19752d);
            int i23 = c6063l.f19750b;
            int i24 = c6063l.f19753e;
            int i25 = i23 - i24;
            int i26 = i22 - i25;
            AbstractC17678l.m19306m(c6063l.f19751c, cArr2, i26, i24, i25 + i24);
            c6063l.f19751c = cArr2;
            c6063l.f19750b = i22;
            c6063l.f19753e = i26;
        }
        int i27 = c6063l.f19752d;
        if (i19 < i27 && i20 <= i27) {
            int i28 = i27 - i20;
            char[] cArr3 = c6063l.f19751c;
            AbstractC17678l.m19306m(cArr3, cArr3, c6063l.f19753e - i28, i20, i27);
            c6063l.f19752d = i19;
            c6063l.f19753e -= i28;
        } else if (i19 >= i27 || i20 < i27) {
            int iM6638a2 = c6063l.m6638a() + i19;
            int iM6638a3 = c6063l.m6638a() + i20;
            int i29 = c6063l.f19753e;
            char[] cArr4 = c6063l.f19751c;
            AbstractC17678l.m19306m(cArr4, cArr4, c6063l.f19752d, i29, iM6638a2);
            c6063l.f19752d += iM6638a2 - i29;
            c6063l.f19753e = iM6638a3;
        } else {
            c6063l.f19753e = c6063l.m6638a() + i20;
            c6063l.f19752d = i19;
        }
        AbstractC21627m.m21976x(charSequence, c6063l.f19751c, c6063l.f19752d, i12, i13);
        c6063l.f19752d += i14;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        C6063l c6063l = this.f68387Z;
        if (c6063l == null) {
            return this.f68386Y.charAt(i10);
        }
        if (i10 < this.f68388o0) {
            return this.f68386Y.charAt(i10);
        }
        int iM6638a = c6063l.f19750b - c6063l.m6638a();
        int i11 = this.f68388o0;
        if (i10 >= iM6638a + i11) {
            return this.f68386Y.charAt(i10 - ((iM6638a - this.f68389p0) + i11));
        }
        int i12 = i10 - i11;
        int i13 = c6063l.f19752d;
        return i12 < i13 ? c6063l.f19751c[i12] : c6063l.f19751c[(i12 - i13) + c6063l.f19753e];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C6063l c6063l = this.f68387Z;
        if (c6063l == null) {
            return this.f68386Y.length();
        }
        return (c6063l.f19750b - c6063l.m6638a()) + (this.f68386Y.length() - (this.f68389p0 - this.f68388o0));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C6063l c6063l = this.f68387Z;
        if (c6063l == null) {
            return this.f68386Y.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f68386Y, 0, this.f68388o0);
        sb2.append(c6063l.f19751c, 0, c6063l.f19752d);
        char[] cArr = c6063l.f19751c;
        int i10 = c6063l.f19753e;
        sb2.append(cArr, i10, c6063l.f19750b - i10);
        CharSequence charSequence = this.f68386Y;
        sb2.append(charSequence, this.f68389p0, charSequence.length());
        return sb2.toString();
    }
}
