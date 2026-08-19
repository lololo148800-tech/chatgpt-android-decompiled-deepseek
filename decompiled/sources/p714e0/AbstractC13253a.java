package p714e0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13253a {

    /* JADX INFO: renamed from: a */
    public static final int[] f41865a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f41866b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f41867c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m14848a(int i10, int i11, int[] array) {
        AbstractC16544l.m18094g(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    /* JADX INFO: renamed from: b */
    public static final int m14849b(long[] array, int i10, long j10) {
        AbstractC16544l.m18094g(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = array[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* JADX INFO: renamed from: c */
    public static final void m14850c(String message) {
        AbstractC16544l.m18094g(message, "message");
        throw new IllegalArgumentException(message);
    }
}
