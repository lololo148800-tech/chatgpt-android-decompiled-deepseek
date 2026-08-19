package p1016t3;

import p1073w3.AbstractC20817s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.L */
/* JADX INFO: loaded from: classes.dex */
public final class C19762L {

    /* JADX INFO: renamed from: a */
    public Integer f62577a;

    /* JADX INFO: renamed from: b */
    public Object f62578b;

    /* JADX INFO: renamed from: c */
    public int f62579c;

    /* JADX INFO: renamed from: d */
    public long f62580d;

    /* JADX INFO: renamed from: e */
    public long f62581e;

    /* JADX INFO: renamed from: f */
    public boolean f62582f;

    /* JADX INFO: renamed from: g */
    public C19775b f62583g = C19775b.f62661c;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    public final long m20714a(int i10, int i11) {
        C19774a c19774aM20732a = this.f62583g.m20732a(i10);
        if (c19774aM20732a.f62655a != -1) {
            return c19774aM20732a.f62660f[i11];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m20715b(long j10) {
        int i10;
        C19774a c19774aM20732a;
        int i11;
        C19775b c19775b = this.f62583g;
        long j11 = this.f62580d;
        c19775b.getClass();
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i12 = 0;
        while (true) {
            i10 = c19775b.f62663a;
            if (i12 >= i10) {
                break;
            }
            c19775b.m20732a(i12).getClass();
            c19775b.m20732a(i12).getClass();
            if (0 > j10 && ((i11 = (c19774aM20732a = c19775b.m20732a(i12)).f62655a) == -1 || c19774aM20732a.m20731a(-1) < i11)) {
                break;
            }
            i12++;
        }
        if (i12 < i10) {
            return i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m20716c(long j10) {
        C19775b c19775b = this.f62583g;
        int i10 = c19775b.f62663a - 1;
        c19775b.m20733b(i10);
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            c19775b.m20732a(i10).getClass();
            if (j10 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            C19774a c19774aM20732a = c19775b.m20732a(i10);
            int i11 = c19774aM20732a.f62655a;
            if (i11 == -1) {
                return i10;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = c19774aM20732a.f62659e[i12];
                if (i13 == 0 || i13 == 1) {
                    return i10;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m20717d(int i10) {
        this.f62583g.m20732a(i10).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final int m20718e(int i10) {
        return this.f62583g.m20732a(i10).m20731a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19762L.class.equals(obj.getClass())) {
            return false;
        }
        C19762L c19762l = (C19762L) obj;
        return AbstractC20817s.m21400a(this.f62577a, c19762l.f62577a) && AbstractC20817s.m21400a(this.f62578b, c19762l.f62578b) && this.f62579c == c19762l.f62579c && this.f62580d == c19762l.f62580d && this.f62581e == c19762l.f62581e && this.f62582f == c19762l.f62582f && AbstractC20817s.m21400a(this.f62583g, c19762l.f62583g);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20719f(int i10) {
        C19775b c19775b = this.f62583g;
        if (i10 != c19775b.f62663a - 1) {
            return false;
        }
        c19775b.m20733b(i10);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m20720g(int i10) {
        this.f62583g.m20732a(i10).getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m20721h(Integer num, Object obj, int i10, long j10, long j11, C19775b c19775b, boolean z6) {
        this.f62577a = num;
        this.f62578b = obj;
        this.f62579c = i10;
        this.f62580d = j10;
        this.f62581e = j11;
        this.f62583g = c19775b;
        this.f62582f = z6;
    }

    public final int hashCode() {
        Integer num = this.f62577a;
        int iHashCode = (217 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f62578b;
        int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f62579c) * 31;
        long j10 = this.f62580d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f62581e;
        return this.f62583g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f62582f ? 1 : 0)) * 31);
    }
}
