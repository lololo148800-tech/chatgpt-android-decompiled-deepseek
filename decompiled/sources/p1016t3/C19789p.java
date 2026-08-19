package p1016t3;

import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C19789p {

    /* JADX INFO: renamed from: a */
    public final String f62766a;

    /* JADX INFO: renamed from: b */
    public final String f62767b;

    static {
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
    }

    public C19789p(String str, String str2) {
        this.f62766a = AbstractC20817s.m21391E(str);
        this.f62767b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19789p.class != obj.getClass()) {
            return false;
        }
        C19789p c19789p = (C19789p) obj;
        return AbstractC20817s.m21400a(this.f62766a, c19789p.f62766a) && AbstractC20817s.m21400a(this.f62767b, c19789p.f62767b);
    }

    public final int hashCode() {
        int iHashCode = this.f62767b.hashCode() * 31;
        String str = this.f62766a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
