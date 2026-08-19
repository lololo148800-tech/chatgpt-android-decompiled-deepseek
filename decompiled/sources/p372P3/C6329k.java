package p372P3;

/* JADX INFO: renamed from: P3.k */
/* JADX INFO: loaded from: classes.dex */
public class C6329k implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final long f20538a;

    /* JADX INFO: renamed from: b */
    public final long f20539b;

    /* JADX INFO: renamed from: c */
    public final int f20540c;

    /* JADX INFO: renamed from: d */
    public final long f20541d;

    /* JADX INFO: renamed from: e */
    public final int f20542e;

    /* JADX INFO: renamed from: f */
    public final long f20543f;

    /* JADX INFO: renamed from: g */
    public final boolean f20544g;

    public C6329k(long j10, long j11, int i10, int i11, boolean z6) {
        this.f20538a = j10;
        this.f20539b = j11;
        this.f20540c = i11 == -1 ? 1 : i11;
        this.f20542e = i10;
        this.f20544g = z6;
        if (j10 == -1) {
            this.f20541d = -1L;
            this.f20543f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f20541d = j12;
            this.f20543f = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return this.f20541d != -1 || this.f20544g;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        long j11 = this.f20541d;
        long j12 = this.f20539b;
        if (j11 == -1 && !this.f20544g) {
            C6311C c6311c = new C6311C(0L, j12);
            return new C6309A(c6311c, c6311c);
        }
        int i10 = this.f20542e;
        long j13 = this.f20540c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = (Math.max(0L, jMax - j12) * 8000000) / ((long) i10);
        C6311C c6311c2 = new C6311C(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f20538a) {
                return new C6309A(c6311c2, new C6311C((Math.max(0L, j14 - j12) * 8000000) / ((long) i10), j14));
            }
        }
        return new C6309A(c6311c2, c6311c2);
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f20543f;
    }
}
