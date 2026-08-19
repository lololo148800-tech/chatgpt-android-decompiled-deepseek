package p341Ni;

/* JADX INFO: renamed from: Ni.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C5796p implements InterfaceC5798r {

    /* JADX INFO: renamed from: a */
    public final long f18931a = System.currentTimeMillis();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5796p) && this.f18931a == ((C5796p) obj).f18931a;
    }

    public final int hashCode() {
        long j10 = this.f18931a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "█";
    }
}
