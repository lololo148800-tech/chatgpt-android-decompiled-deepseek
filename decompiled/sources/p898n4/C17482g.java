package p898n4;

import p885m4.C17160j;

/* JADX INFO: renamed from: n4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17482g extends C17160j implements Comparable {

    /* JADX INFO: renamed from: w0 */
    public long f55932w0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17482g c17482g = (C17482g) obj;
        if (m1824d(4) == c17482g.m1824d(4)) {
            long j10 = this.f2228s0 - c17482g.f2228s0;
            if (j10 == 0) {
                j10 = this.f55932w0 - c17482g.f55932w0;
                if (j10 == 0) {
                    return 0;
                }
            }
            if (j10 <= 0) {
                return -1;
            }
        } else if (!m1824d(4)) {
            return -1;
        }
        return 1;
    }
}
