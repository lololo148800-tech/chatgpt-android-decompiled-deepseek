package p692d0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: d0.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12957J {

    /* JADX INFO: renamed from: a */
    public static final long[] f41150a = {-9187201950435737345L, -1};

    static {
        new C12951D(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m14635a(long[] metadata, int i10) {
        AbstractC16544l.m18094g(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int length = metadata.length;
        int i13 = length - 1;
        int i14 = length - 2;
        metadata[i14] = (metadata[i14] & 72057594037927935L) | (-72057594037927936L);
        metadata[i13] = metadata[0];
    }

    /* JADX INFO: renamed from: b */
    public static final int m14636b(long[] metadata, int i10, int i11) {
        AbstractC16544l.m18094g(metadata, "metadata");
        while (i10 < i11) {
            if (((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m14637c(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    /* JADX INFO: renamed from: d */
    public static final int m14638d(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    /* JADX INFO: renamed from: e */
    public static final int m14639e(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static final int m14640f(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return ((i10 - 1) / 7) + i10;
    }
}
