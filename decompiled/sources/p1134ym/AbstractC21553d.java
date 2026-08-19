package p1134ym;

import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: ym.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21553d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f68256a;

    /* JADX INFO: renamed from: b */
    public static final int[] f68257b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f68258c;

    /* JADX INFO: renamed from: d */
    public static final int[] f68259d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f68256a = bArr;
        int[] iArr = new int[256];
        int i10 = 0;
        AbstractC17678l.m19312s(iArr, -1, 0, 6);
        iArr[61] = -2;
        int i11 = 0;
        int i12 = 0;
        while (i11 < 64) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f68257b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f68258c = bArr2;
        int[] iArr2 = new int[256];
        AbstractC17678l.m19312s(iArr2, -1, 0, 6);
        iArr2[61] = -2;
        int i13 = 0;
        while (i10 < 64) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f68259d = iArr2;
    }
}
