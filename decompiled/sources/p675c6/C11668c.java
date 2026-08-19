package p675c6;

import java.util.Arrays;
import p544W9.AbstractC8751z2;

/* JADX INFO: renamed from: c6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11668c {

    /* JADX INFO: renamed from: a */
    public final float[] f35331a;

    /* JADX INFO: renamed from: b */
    public final int[] f35332b;

    public C11668c(float[] fArr, int[] iArr) {
        this.f35331a = fArr;
        this.f35332b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m13022a(C11668c c11668c) {
        int i10 = 0;
        while (true) {
            int[] iArr = c11668c.f35332b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f35331a[i10] = c11668c.f35331a[i10];
            this.f35332b[i10] = iArr[i10];
            i10++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C11668c m13023b(float[] fArr) {
        int iM9506c;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f10 = fArr[i10];
            float[] fArr2 = this.f35331a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f35332b;
            if (iBinarySearch >= 0) {
                iM9506c = iArr2[iBinarySearch];
            } else {
                int i11 = -(iBinarySearch + 1);
                if (i11 == 0) {
                    iM9506c = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    iM9506c = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f11 = fArr2[i12];
                    iM9506c = AbstractC8751z2.m9506c((f10 - f11) / (fArr2[i11] - f11), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = iM9506c;
        }
        return new C11668c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11668c.class != obj.getClass()) {
            return false;
        }
        C11668c c11668c = (C11668c) obj;
        return Arrays.equals(this.f35331a, c11668c.f35331a) && Arrays.equals(this.f35332b, c11668c.f35332b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35332b) + (Arrays.hashCode(this.f35331a) * 31);
    }
}
