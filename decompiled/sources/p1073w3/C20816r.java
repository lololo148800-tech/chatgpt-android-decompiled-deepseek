package p1073w3;

/* JADX INFO: renamed from: w3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C20816r {

    /* JADX INFO: renamed from: a */
    public long f66102a;

    /* JADX INFO: renamed from: b */
    public long f66103b;

    /* JADX INFO: renamed from: c */
    public long f66104c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f66105d = new ThreadLocal();

    public C20816r(long j10) {
        m21386g(j10);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m21380a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m21385f()) {
                long jLongValue = this.f66102a;
                if (jLongValue == 9223372036854775806L) {
                    Long l4 = (Long) this.f66105d.get();
                    l4.getClass();
                    jLongValue = l4.longValue();
                }
                this.f66103b = jLongValue - j10;
                notifyAll();
            }
            this.f66104c = j10;
            return j10 + this.f66103b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m21381b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f66104c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                j10 = Math.abs(j14 - j12) < Math.abs(j15 - j12) ? j14 : j15;
            }
            return m21380a((j10 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m21382c(long j10) {
        long j11;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j12 = this.f66104c;
        if (j12 != -9223372036854775807L) {
            long j13 = (j12 * 90000) / 1000000;
            long j14 = j13 / 8589934592L;
            Long.signum(j14);
            long j15 = (j14 * 8589934592L) + j10;
            j11 = ((j14 + 1) * 8589934592L) + j10;
            if (j15 >= j13) {
                j11 = j15;
            }
        } else {
            j11 = j10;
        }
        return m21380a((j11 * 1000000) / 90000);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m21383d() {
        long j10;
        j10 = this.f66102a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m21384e() {
        return this.f66103b;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m21385f() {
        return this.f66103b != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m21386g(long j10) {
        this.f66102a = j10;
        this.f66103b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f66104c = -9223372036854775807L;
    }
}
