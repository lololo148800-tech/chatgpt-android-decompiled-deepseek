package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C15205X implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final long f47418Y;

    /* JADX INFO: renamed from: Z */
    public final long f47419Z;

    /* JADX INFO: renamed from: o0 */
    public final long f47420o0;

    /* JADX INFO: renamed from: p0 */
    public final long f47421p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f47422q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f47423r0;

    /* JADX INFO: renamed from: s0 */
    public final long f47424s0;

    public C15205X(long j10) {
        this(j10, j10, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f47419Z, ((C15205X) obj).f47419Z);
    }

    public C15205X(long j10, long j11, long j12, long j13, boolean z6, boolean z10, long j14) {
        this.f47418Y = j10;
        this.f47419Z = j11;
        this.f47420o0 = j12;
        this.f47421p0 = j13;
        this.f47422q0 = z6;
        this.f47423r0 = z10;
        this.f47424s0 = j14;
    }
}
