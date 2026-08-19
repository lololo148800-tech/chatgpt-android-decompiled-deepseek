package p911o0;

import p002A0.C0136m;

/* JADX INFO: renamed from: o0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17770m {

    /* JADX INFO: renamed from: a */
    public static final C17756f f56724a = new C17756f(4);

    /* JADX INFO: renamed from: b */
    public static final C17756f f56725b = new C17756f(3);

    /* JADX INFO: renamed from: c */
    public static final C17756f f56726c = new C17756f(5);

    /* JADX INFO: renamed from: d */
    public static final C17756f f56727d = new C17756f(2);

    /* JADX INFO: renamed from: e */
    public static final C0136m f56728e = new C0136m(2);

    /* JADX INFO: renamed from: f */
    public static final C0136m f56729f;

    static {
        new C0136m(5);
        f56729f = new C0136m(4);
        new C0136m(3);
    }

    /* JADX INFO: renamed from: a */
    public static void m19494a(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z6) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19495b(int[] iArr, int[] iArr2, boolean z6) {
        int i10 = 0;
        if (!z6) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m19496c(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z6) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19497d(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = iArr.length == 0 ? 0.0f : (i10 - i12) / iArr.length;
        float f10 = length / 2;
        if (!z6) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f10);
            f10 += i16 + length;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m19498e(int i10, int[] iArr, int[] iArr2, boolean z6) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(iArr.length - 1, 1);
        float f10 = (z6 && iArr.length == 1) ? fMax : 0.0f;
        if (z6) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m19499f(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z6) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static C17764j m19500g(float f10) {
        return new C17764j(f10, true, C17768l.f56722Y);
    }
}
