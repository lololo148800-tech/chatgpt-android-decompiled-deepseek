package p349O0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3581L;
import p544W9.AbstractC8676n;

/* JADX INFO: renamed from: O0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C5960K {

    /* JADX INFO: renamed from: a */
    public int[] f19403a;

    /* JADX INFO: renamed from: b */
    public int f19404b;

    public C5960K() {
        this.f19403a = new int[10];
    }

    /* JADX INFO: renamed from: b */
    public static long m6394b(boolean z6, int i10, int i11, int i12, int i13) {
        int i14 = z6 ? i12 : i13;
        if (z6) {
            i12 = i13;
        }
        if (i10 < i11) {
            return AbstractC8676n.m9365b(i10, i10);
        }
        if (i10 == i11) {
            return i14 == 0 ? AbstractC8676n.m9365b(i11, i12 + i11) : AbstractC8676n.m9365b(i11, i11);
        }
        if (i10 < i11 + i14) {
            return i12 == 0 ? AbstractC8676n.m9365b(i11, i11) : AbstractC8676n.m9365b(i11, i12 + i11);
        }
        int i15 = (i10 - i14) + i12;
        return AbstractC8676n.m9365b(i15, i15);
    }

    /* JADX INFO: renamed from: a */
    public long m6395a(int i10, boolean z6) {
        int i11;
        int iMax;
        int i12 = -1;
        int[] iArr = this.f19403a;
        int i13 = this.f19404b;
        if (i13 < 0) {
            i11 = i10;
            iMax = i11;
        } else if (z6) {
            iMax = i10;
            int i14 = 0;
            i11 = iMax;
            while (i14 < i13) {
                int i15 = i14 * 3;
                int i16 = iArr[i15];
                int i17 = iArr[i15 + 1];
                int i18 = iArr[i15 + 2];
                long jM6394b = m6394b(z6, i11, i16, i17, i18);
                long jM6394b2 = m6394b(z6, iMax, i16, i17, i18);
                int i19 = C3581L.f10907c;
                int iMin = Math.min((int) (jM6394b >> 32), (int) (jM6394b2 >> 32));
                iMax = Math.max((int) (jM6394b & 4294967295L), (int) (jM6394b2 & 4294967295L));
                i14++;
                i11 = iMin;
            }
        } else {
            int iMax2 = i10;
            int i20 = i13 - 1;
            int iMin2 = iMax2;
            while (i12 < i20) {
                int i21 = i20 * 3;
                int i22 = iArr[i21];
                int i23 = iArr[i21 + 1];
                int i24 = iArr[i21 + 2];
                long jM6394b3 = m6394b(z6, iMin2, i22, i23, i24);
                long jM6394b4 = m6394b(z6, iMax2, i22, i23, i24);
                int i25 = C3581L.f10907c;
                iMin2 = Math.min((int) (jM6394b3 >> 32), (int) (jM6394b4 >> 32));
                iMax2 = Math.max((int) (jM6394b3 & 4294967295L), (int) (jM6394b4 & 4294967295L));
                i12 = -1;
                i20--;
                iArr = iArr;
            }
            i11 = iMin2;
            iMax = iMax2;
        }
        return AbstractC8676n.m9365b(i11, iMax);
    }

    /* JADX INFO: renamed from: c */
    public int m6396c() {
        int[] iArr = this.f19403a;
        int i10 = this.f19404b - 1;
        this.f19404b = i10;
        return iArr[i10];
    }

    /* JADX INFO: renamed from: d */
    public void m6397d(int i10) {
        int i11 = this.f19404b;
        int[] iArr = this.f19403a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f19403a = iArrCopyOf;
        }
        int[] iArr2 = this.f19403a;
        int i12 = this.f19404b;
        this.f19404b = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX INFO: renamed from: e */
    public void m6398e(int i10, int i11, int i12) {
        int i13 = this.f19404b;
        int i14 = i13 + 3;
        int[] iArr = this.f19403a;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f19403a = iArrCopyOf;
        }
        int[] iArr2 = this.f19403a;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f19404b = i14;
    }

    /* JADX INFO: renamed from: f */
    public void m6399f(int i10, int i11, int i12, int i13) {
        int i14 = this.f19404b;
        int i15 = i14 + 4;
        int[] iArr = this.f19403a;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f19403a = iArrCopyOf;
        }
        int[] iArr2 = this.f19403a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f19404b = i15;
    }

    /* JADX INFO: renamed from: g */
    public void m6400g(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f19403a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    m6402i(i12, i13);
                }
            }
            m6402i(i12 + 3, i11);
            m6400g(i10, i12);
            m6400g(i12 + 6, i11);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m6401h(int i10, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i12, "Expected newLen to be ≥ 0, was ").toString());
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(iMin, i11) - iMin;
        if (iMax >= 2 || iMax != i12) {
            int i13 = this.f19404b + 1;
            int[] iArr = this.f19403a;
            if (i13 > iArr.length / 3) {
                int[] iArrCopyOf = Arrays.copyOf(this.f19403a, Math.max(i13 * 2, (iArr.length / 3) * 2) * 3);
                AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
                this.f19403a = iArrCopyOf;
            }
            int[] iArr2 = this.f19403a;
            int i14 = this.f19404b * 3;
            iArr2[i14] = iMin;
            iArr2[i14 + 1] = iMax;
            iArr2[i14 + 2] = i12;
            this.f19404b = i13;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m6402i(int i10, int i11) {
        int[] iArr = this.f19403a;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public C5960K(int i10) {
        this.f19403a = new int[i10];
    }
}
