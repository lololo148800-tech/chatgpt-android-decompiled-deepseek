package p723e9;

import java.util.Set;

/* JADX INFO: renamed from: e9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13344b {

    /* JADX INFO: renamed from: a */
    public final long f42330a;

    /* JADX INFO: renamed from: b */
    public final long f42331b;

    /* JADX INFO: renamed from: c */
    public final Set f42332c;

    public C13344b(Set set, long j10, long j11) {
        this.f42330a = j10;
        this.f42331b = j11;
        this.f42332c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13344b)) {
            return false;
        }
        C13344b c13344b = (C13344b) obj;
        return this.f42330a == c13344b.f42330a && this.f42331b == c13344b.f42331b && this.f42332c.equals(c13344b.f42332c);
    }

    public final int hashCode() {
        long j10 = this.f42330a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f42331b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f42332c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42330a + ", maxAllowedDelay=" + this.f42331b + ", flags=" + this.f42332c + "}";
    }
}
