package p350O1;

/* JADX INFO: renamed from: O1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6066o {

    /* JADX INFO: renamed from: a */
    public final int f19762a;

    /* JADX INFO: renamed from: a */
    public static final boolean m6641a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m6642b(int i10) {
        if (m6641a(i10, -1)) {
            return "Unspecified";
        }
        if (m6641a(i10, 0)) {
            return "None";
        }
        if (m6641a(i10, 1)) {
            return "Characters";
        }
        if (m6641a(i10, 2)) {
            return "Words";
        }
        return m6641a(i10, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6066o) {
            return this.f19762a == ((C6066o) obj).f19762a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19762a;
    }

    public final String toString() {
        return m6642b(this.f19762a);
    }
}
