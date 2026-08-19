package p328N1;

/* JADX INFO: renamed from: N1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C5606v {

    /* JADX INFO: renamed from: a */
    public final int f18149a;

    /* JADX INFO: renamed from: a */
    public static final boolean m5994a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m5995b(int i10) {
        if (m5994a(i10, 0)) {
            return "None";
        }
        if (m5994a(i10, 1)) {
            return "All";
        }
        if (m5994a(i10, 2)) {
            return "Weight";
        }
        return m5994a(i10, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5606v) {
            return this.f18149a == ((C5606v) obj).f18149a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18149a;
    }

    public final String toString() {
        return m5995b(this.f18149a);
    }
}
