package p232J3;

import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19775b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: J3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4232d extends AbstractC4242n {

    /* JADX INFO: renamed from: c */
    public final long f13829c;

    /* JADX INFO: renamed from: d */
    public final long f13830d;

    /* JADX INFO: renamed from: e */
    public final long f13831e;

    /* JADX INFO: renamed from: f */
    public final boolean f13832f;

    public C4232d(AbstractC19764N abstractC19764N, long j10, long j11) throws C4233e {
        super(abstractC19764N);
        boolean z6 = false;
        if (abstractC19764N.mo2417h() != 1) {
            throw new C4233e(0);
        }
        C19763M c19763mMo2411m = abstractC19764N.mo2411m(0, new C19763M(), 0L);
        long jMax = Math.max(0L, j10);
        if (!c19763mMo2411m.f62595j && jMax != 0 && !c19763mMo2411m.f62592g) {
            throw new C4233e(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? c19763mMo2411m.f62597l : Math.max(0L, j11);
        long j12 = c19763mMo2411m.f62597l;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                throw new C4233e(2);
            }
        }
        this.f13829c = jMax;
        this.f13830d = jMax2;
        this.f13831e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c19763mMo2411m.f62593h && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z6 = true;
        }
        this.f13832f = z6;
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: f */
    public final C19762L mo2410f(int i10, C19762L c19762l, boolean z6) {
        this.f13864b.mo2410f(0, c19762l, z6);
        long j10 = c19762l.f62581e - this.f13829c;
        long j11 = this.f13831e;
        c19762l.m20721h(c19762l.f62577a, c19762l.f62578b, 0, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - j10, j10, C19775b.f62661c, false);
        return c19762l;
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: m */
    public final C19763M mo2411m(int i10, C19763M c19763m, long j10) {
        this.f13864b.mo2411m(0, c19763m, 0L);
        long j11 = c19763m.f62600o;
        long j12 = this.f13829c;
        c19763m.f62600o = j11 + j12;
        c19763m.f62597l = this.f13831e;
        c19763m.f62593h = this.f13832f;
        long j13 = c19763m.f62596k;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            c19763m.f62596k = jMax;
            long j14 = this.f13830d;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            c19763m.f62596k = jMax - j12;
        }
        long jM21399M = AbstractC20817s.m21399M(j12);
        long j15 = c19763m.f62589d;
        if (j15 != -9223372036854775807L) {
            c19763m.f62589d = j15 + jM21399M;
        }
        long j16 = c19763m.f62590e;
        if (j16 != -9223372036854775807L) {
            c19763m.f62590e = j16 + jM21399M;
        }
        return c19763m;
    }
}
