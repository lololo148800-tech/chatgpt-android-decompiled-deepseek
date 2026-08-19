package p057C3;

import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: C3.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561g0 {

    /* JADX INFO: renamed from: c */
    public static final C1561g0 f4355c;

    /* JADX INFO: renamed from: a */
    public final long f4356a;

    /* JADX INFO: renamed from: b */
    public final long f4357b;

    static {
        C1561g0 c1561g0 = new C1561g0(0L, 0L);
        new C1561g0(Long.MAX_VALUE, Long.MAX_VALUE);
        new C1561g0(Long.MAX_VALUE, 0L);
        new C1561g0(0L, Long.MAX_VALUE);
        f4355c = c1561g0;
    }

    public C1561g0(long j10, long j11) {
        AbstractC20800b.m21316d(j10 >= 0);
        AbstractC20800b.m21316d(j11 >= 0);
        this.f4356a = j10;
        this.f4357b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1561g0.class != obj.getClass()) {
            return false;
        }
        C1561g0 c1561g0 = (C1561g0) obj;
        return this.f4356a == c1561g0.f4356a && this.f4357b == c1561g0.f4357b;
    }

    public final int hashCode() {
        return (((int) this.f4356a) * 31) + ((int) this.f4357b);
    }
}
