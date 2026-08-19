package p281L3;

/* JADX INFO: renamed from: L3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4914a {

    /* JADX INFO: renamed from: a */
    public final long f16001a;

    /* JADX INFO: renamed from: b */
    public final long f16002b;

    public C4914a(long j10, long j11) {
        this.f16001a = j10;
        this.f16002b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4914a)) {
            return false;
        }
        C4914a c4914a = (C4914a) obj;
        return this.f16001a == c4914a.f16001a && this.f16002b == c4914a.f16002b;
    }

    public final int hashCode() {
        return (((int) this.f16001a) * 31) + ((int) this.f16002b);
    }
}
