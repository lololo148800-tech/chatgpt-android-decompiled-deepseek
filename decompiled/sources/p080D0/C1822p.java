package p080D0;

import p467T1.EnumC7198h;

/* JADX INFO: renamed from: D0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1822p {

    /* JADX INFO: renamed from: a */
    public final EnumC7198h f5253a;

    /* JADX INFO: renamed from: b */
    public final int f5254b;

    /* JADX INFO: renamed from: c */
    public final long f5255c;

    public C1822p(EnumC7198h enumC7198h, int i10, long j10) {
        this.f5253a = enumC7198h;
        this.f5254b = i10;
        this.f5255c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1822p)) {
            return false;
        }
        C1822p c1822p = (C1822p) obj;
        return this.f5253a == c1822p.f5253a && this.f5254b == c1822p.f5254b && this.f5255c == c1822p.f5255c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f5253a.hashCode() * 31) + this.f5254b) * 31;
        long j10 = this.f5255c;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f5253a + ", offset=" + this.f5254b + ", selectableId=" + this.f5255c + ')';
    }
}
