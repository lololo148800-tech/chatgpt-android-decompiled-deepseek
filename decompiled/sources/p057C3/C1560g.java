package p057C3;

/* JADX INFO: renamed from: C3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1560g {

    /* JADX INFO: renamed from: a */
    public final long f4341a;

    /* JADX INFO: renamed from: b */
    public final long f4342b;

    /* JADX INFO: renamed from: c */
    public long f4343c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f4344d = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f4346f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f4347g = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f4350j = 0.97f;

    /* JADX INFO: renamed from: i */
    public float f4349i = 1.03f;

    /* JADX INFO: renamed from: k */
    public float f4351k = 1.0f;

    /* JADX INFO: renamed from: l */
    public long f4352l = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f4345e = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f4348h = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public long f4353m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public long f4354n = -9223372036854775807L;

    public C1560g(long j10, long j11) {
        this.f4341a = j10;
        this.f4342b = j11;
    }

    /* JADX INFO: renamed from: a */
    public final void m2423a() {
        long j10;
        long j11 = this.f4343c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f4344d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f4346f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f4347g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f4345e == j10) {
            return;
        }
        this.f4345e = j10;
        this.f4348h = j10;
        this.f4353m = -9223372036854775807L;
        this.f4354n = -9223372036854775807L;
        this.f4352l = -9223372036854775807L;
    }
}
