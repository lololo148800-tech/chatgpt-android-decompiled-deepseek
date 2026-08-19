package p1016t3;

import android.util.Pair;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19764N {

    /* JADX INFO: renamed from: a */
    public static final C19761K f62601a = new C19761K();

    static {
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo2412a(boolean z6) {
        return m20728p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2413b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo2414c(boolean z6) {
        if (m20728p()) {
            return -1;
        }
        return mo2420o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m20724d(int i10, C19762L c19762l, C19763M c19763m, int i11, boolean z6) {
        int i12 = mo2410f(i10, c19762l, false).f62579c;
        if (mo2411m(i12, c19763m, 0L).f62599n != i10) {
            return i10 + 1;
        }
        int iMo2415e = mo2415e(i12, i11, z6);
        if (iMo2415e == -1) {
            return -1;
        }
        return mo2411m(iMo2415e, c19763m, 0L).f62598m;
    }

    /* JADX INFO: renamed from: e */
    public int mo2415e(int i10, int i11, boolean z6) {
        if (i11 == 0) {
            if (i10 == mo2414c(z6)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo2414c(z6) ? mo2412a(z6) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iMo2414c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC19764N)) {
            return false;
        }
        AbstractC19764N abstractC19764N = (AbstractC19764N) obj;
        if (abstractC19764N.mo2420o() != mo2420o() || abstractC19764N.mo2417h() != mo2417h()) {
            return false;
        }
        C19763M c19763m = new C19763M();
        C19762L c19762l = new C19762L();
        C19763M c19763m2 = new C19763M();
        C19762L c19762l2 = new C19762L();
        for (int i10 = 0; i10 < mo2420o(); i10++) {
            if (!mo2411m(i10, c19763m, 0L).equals(abstractC19764N.mo2411m(i10, c19763m2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < mo2417h(); i11++) {
            if (!mo2410f(i11, c19762l, true).equals(abstractC19764N.mo2410f(i11, c19762l2, true))) {
                return false;
            }
        }
        int iMo2412a = mo2412a(true);
        if (iMo2412a != abstractC19764N.mo2412a(true) || (iMo2414c = mo2414c(true)) != abstractC19764N.mo2414c(true)) {
            return false;
        }
        while (iMo2412a != iMo2414c) {
            int iMo2415e = mo2415e(iMo2412a, 0, true);
            if (iMo2415e != abstractC19764N.mo2415e(iMo2412a, 0, true)) {
                return false;
            }
            iMo2412a = iMo2415e;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract C19762L mo2410f(int i10, C19762L c19762l, boolean z6);

    /* JADX INFO: renamed from: g */
    public C19762L mo2416g(Object obj, C19762L c19762l) {
        return mo2410f(mo2413b(obj), c19762l, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo2417h();

    public final int hashCode() {
        C19763M c19763m = new C19763M();
        C19762L c19762l = new C19762L();
        int iMo2420o = mo2420o() + 217;
        for (int i10 = 0; i10 < mo2420o(); i10++) {
            iMo2420o = (iMo2420o * 31) + mo2411m(i10, c19763m, 0L).hashCode();
        }
        int iMo2417h = mo2417h() + (iMo2420o * 31);
        for (int i11 = 0; i11 < mo2417h(); i11++) {
            iMo2417h = (iMo2417h * 31) + mo2410f(i11, c19762l, true).hashCode();
        }
        int iMo2412a = mo2412a(true);
        while (iMo2412a != -1) {
            iMo2417h = (iMo2417h * 31) + iMo2412a;
            iMo2412a = mo2415e(iMo2412a, 0, true);
        }
        return iMo2417h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m20725i(C19763M c19763m, C19762L c19762l, int i10, long j10) {
        Pair pairM20726j = m20726j(c19763m, c19762l, i10, j10, 0L);
        pairM20726j.getClass();
        return pairM20726j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m20726j(C19763M c19763m, C19762L c19762l, int i10, long j10, long j11) {
        AbstractC20800b.m21318f(i10, mo2420o());
        mo2411m(i10, c19763m, j11);
        if (j10 == -9223372036854775807L) {
            j10 = c19763m.f62596k;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = c19763m.f62598m;
        mo2410f(i11, c19762l, false);
        while (i11 < c19763m.f62599n && c19762l.f62581e != j10) {
            int i12 = i11 + 1;
            if (mo2410f(i12, c19762l, false).f62581e > j10) {
                break;
            }
            i11 = i12;
        }
        mo2410f(i11, c19762l, true);
        long jMin = j10 - c19762l.f62581e;
        long j12 = c19762l.f62580d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c19762l.f62578b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo2418k(int i10, int i11, boolean z6) {
        if (i11 == 0) {
            if (i10 == mo2412a(z6)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo2412a(z6) ? mo2414c(z6) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo2419l(int i10);

    /* JADX INFO: renamed from: m */
    public abstract C19763M mo2411m(int i10, C19763M c19763m, long j10);

    /* JADX INFO: renamed from: n */
    public final void m20727n(int i10, C19763M c19763m) {
        mo2411m(i10, c19763m, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo2420o();

    /* JADX INFO: renamed from: p */
    public final boolean m20728p() {
        return mo2420o() == 0;
    }
}
