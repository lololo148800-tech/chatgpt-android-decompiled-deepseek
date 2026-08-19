package p1016t3;

import p030B2.C0781s;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C19783j {

    /* JADX INFO: renamed from: a */
    public final int f62682a;

    /* JADX INFO: renamed from: b */
    public final int f62683b;

    static {
        C0781s c0781s = new C0781s(9);
        AbstractC20800b.m21316d(c0781s.f2192b <= c0781s.f2193c);
        new C19783j(c0781s);
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
    }

    public C19783j(C0781s c0781s) {
        c0781s.getClass();
        this.f62682a = c0781s.f2192b;
        this.f62683b = c0781s.f2193c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19783j)) {
            return false;
        }
        C19783j c19783j = (C19783j) obj;
        c19783j.getClass();
        return this.f62682a == c19783j.f62682a && this.f62683b == c19783j.f62683b && AbstractC20817s.m21400a(null, null);
    }

    public final int hashCode() {
        return (((16337 + this.f62682a) * 31) + this.f62683b) * 31;
    }
}
