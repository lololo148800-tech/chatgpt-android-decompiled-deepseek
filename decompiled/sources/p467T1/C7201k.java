package p467T1;

/* JADX INFO: renamed from: T1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7201k {

    /* JADX INFO: renamed from: a */
    public final int f22867a;

    /* JADX INFO: renamed from: a */
    public static final boolean m7598a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m7599b(int i10) {
        if (m7598a(i10, 1)) {
            return "Ltr";
        }
        if (m7598a(i10, 2)) {
            return "Rtl";
        }
        if (m7598a(i10, 3)) {
            return "Content";
        }
        if (m7598a(i10, 4)) {
            return "ContentOrLtr";
        }
        if (m7598a(i10, 5)) {
            return "ContentOrRtl";
        }
        return m7598a(i10, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7201k) {
            return this.f22867a == ((C7201k) obj).f22867a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22867a;
    }

    public final String toString() {
        return m7599b(this.f22867a);
    }
}
