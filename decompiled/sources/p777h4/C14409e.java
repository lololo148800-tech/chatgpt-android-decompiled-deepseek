package p777h4;

import p372P3.C6330l;

/* JADX INFO: renamed from: h4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14409e {

    /* JADX INFO: renamed from: d */
    public static final long[] f45275d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f45276a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f45277b;

    /* JADX INFO: renamed from: c */
    public int f45278c;

    /* JADX INFO: renamed from: a */
    public static long m15909a(byte[] bArr, boolean z6, int i10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z6) {
            j10 &= ~f45275d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    /* JADX INFO: renamed from: b */
    public static int m15910b(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f45275d[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final long m15911c(C6330l c6330l, boolean z6, boolean z10, int i10) {
        int i11 = this.f45277b;
        byte[] bArr = this.f45276a;
        if (i11 == 0) {
            if (!c6330l.mo3046b(bArr, 0, 1, z6)) {
                return -1L;
            }
            int iM15910b = m15910b(bArr[0] & 255);
            this.f45278c = iM15910b;
            if (iM15910b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f45277b = 1;
        }
        int i12 = this.f45278c;
        if (i12 > i10) {
            this.f45277b = 0;
            return -2L;
        }
        if (i12 != 1) {
            c6330l.mo3046b(bArr, 1, i12 - 1, false);
        }
        this.f45277b = 0;
        return m15909a(bArr, z10, this.f45278c);
    }
}
