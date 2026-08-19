package p1016t3;

import p1073w3.AbstractC20817s;
import p372P3.C6337s;

/* JADX INFO: renamed from: t3.q */
/* JADX INFO: loaded from: classes.dex */
public class C19790q {

    /* JADX INFO: renamed from: a */
    public final long f62768a;

    static {
        new C19790q(new C6337s(5));
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
        AbstractC20817s.m21425z(4);
        AbstractC20817s.m21425z(5);
        AbstractC20817s.m21425z(6);
    }

    public C19790q(C6337s c6337s) {
        c6337s.getClass();
        int i10 = AbstractC20817s.f66106a;
        this.f62768a = c6337s.f20561a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19790q)) {
            return false;
        }
        C19790q c19790q = (C19790q) obj;
        c19790q.getClass();
        return this.f62768a == c19790q.f62768a;
    }

    public final int hashCode() {
        long j10 = this.f62768a;
        return ((((int) 0) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 29791;
    }
}
