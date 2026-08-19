package p156G1;

/* JADX INFO: renamed from: G1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2958e {

    /* JADX INFO: renamed from: a */
    public final int f8844a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2958e) {
            return this.f8844a == ((C2958e) obj).f8844a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8844a;
    }

    public final String toString() {
        int i10 = this.f8844a;
        if (i10 == 0) {
            return "Polite";
        }
        return i10 == 1 ? "Assertive" : "Unknown";
    }
}
