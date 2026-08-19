package p467T1;

/* JADX INFO: renamed from: T1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7194d {

    /* JADX INFO: renamed from: a */
    public final int f22850a;

    /* JADX INFO: renamed from: a */
    public static final boolean m7592a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m7593b(int i10) {
        if (m7592a(i10, 1)) {
            return "Hyphens.None";
        }
        if (m7592a(i10, 2)) {
            return "Hyphens.Auto";
        }
        return m7592a(i10, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7194d) {
            return this.f22850a == ((C7194d) obj).f22850a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22850a;
    }

    public final String toString() {
        return m7593b(this.f22850a);
    }
}
