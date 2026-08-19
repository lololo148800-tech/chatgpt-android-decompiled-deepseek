package p228J;

/* JADX INFO: renamed from: J.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3830d {

    /* JADX INFO: renamed from: a */
    public final Object f11596a;

    public C3830d(Object obj) {
        this.f11596a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3830d)) {
            return false;
        }
        return this.f11596a.equals(((C3830d) obj).f11596a);
    }

    public final int hashCode() {
        return this.f11596a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f11596a + "}";
    }
}
