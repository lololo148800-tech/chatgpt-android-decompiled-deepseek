package p303M1;

/* JADX INFO: renamed from: M1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5275a {

    /* JADX INFO: renamed from: a */
    public static final int[] f17342a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Object[] f17343b = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m5783a(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
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
}
