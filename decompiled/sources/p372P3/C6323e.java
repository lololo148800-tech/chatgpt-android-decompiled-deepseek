package p372P3;

import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: P3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6323e {

    /* JADX INFO: renamed from: a */
    public final long f20515a;

    /* JADX INFO: renamed from: b */
    public final long f20516b;

    /* JADX INFO: renamed from: c */
    public final long f20517c;

    /* JADX INFO: renamed from: d */
    public long f20518d = 0;

    /* JADX INFO: renamed from: e */
    public long f20519e;

    /* JADX INFO: renamed from: f */
    public long f20520f;

    /* JADX INFO: renamed from: g */
    public long f20521g;

    /* JADX INFO: renamed from: h */
    public long f20522h;

    public C6323e(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f20515a = j10;
        this.f20516b = j11;
        this.f20519e = j12;
        this.f20520f = j13;
        this.f20521g = j14;
        this.f20517c = j15;
        this.f20522h = m6906a(j11, 0L, j12, j13, j14, j15);
    }

    /* JADX INFO: renamed from: a */
    public static long m6906a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return AbstractC20817s.m21409j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
