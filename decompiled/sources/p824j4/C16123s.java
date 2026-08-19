package p824j4;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: j4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C16123s {

    /* JADX INFO: renamed from: a */
    public final C16120p f50027a;

    /* JADX INFO: renamed from: b */
    public final int f50028b;

    /* JADX INFO: renamed from: c */
    public final long[] f50029c;

    /* JADX INFO: renamed from: d */
    public final int[] f50030d;

    /* JADX INFO: renamed from: e */
    public final int f50031e;

    /* JADX INFO: renamed from: f */
    public final long[] f50032f;

    /* JADX INFO: renamed from: g */
    public final int[] f50033g;

    /* JADX INFO: renamed from: h */
    public final long f50034h;

    public C16123s(C16120p c16120p, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        AbstractC20800b.m21316d(iArr.length == jArr2.length);
        AbstractC20800b.m21316d(jArr.length == jArr2.length);
        AbstractC20800b.m21316d(iArr2.length == jArr2.length);
        this.f50027a = c16120p;
        this.f50029c = jArr;
        this.f50030d = iArr;
        this.f50031e = i10;
        this.f50032f = jArr2;
        this.f50033g = iArr2;
        this.f50034h = j10;
        this.f50028b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m17678a(long j10) {
        long[] jArr = this.f50032f;
        for (int iM21401b = AbstractC20817s.m21401b(jArr, j10, true); iM21401b < jArr.length; iM21401b++) {
            if ((this.f50033g[iM21401b] & 1) != 0) {
                return iM21401b;
            }
        }
        return -1;
    }
}
