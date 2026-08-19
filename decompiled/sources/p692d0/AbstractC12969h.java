package p692d0;

import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12969h {

    /* JADX INFO: renamed from: a */
    public static final float[] f41179a;

    static {
        long[] jArr = AbstractC12957J.f41150a;
        int iM14640f = AbstractC12957J.m14640f(0);
        int iMax = iM14640f > 0 ? Math.max(7, AbstractC12957J.m14639e(iM14640f)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        float[] fArr = new float[iMax];
        f41179a = new float[0];
    }
}
