package p467T1;

/* JADX INFO: renamed from: T1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7199i {

    /* JADX INFO: renamed from: a */
    public final int f22862a;

    /* JADX INFO: renamed from: a */
    public static final boolean m7596a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m7597b(int i10) {
        if (m7596a(i10, 1)) {
            return "Left";
        }
        if (m7596a(i10, 2)) {
            return "Right";
        }
        if (m7596a(i10, 3)) {
            return "Center";
        }
        if (m7596a(i10, 4)) {
            return "Justify";
        }
        if (m7596a(i10, 5)) {
            return "Start";
        }
        if (m7596a(i10, 6)) {
            return "End";
        }
        return m7596a(i10, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7199i) {
            return this.f22862a == ((C7199i) obj).f22862a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22862a;
    }

    public final String toString() {
        return m7597b(this.f22862a);
    }
}
