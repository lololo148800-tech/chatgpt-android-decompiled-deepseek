package p350O1;

/* JADX INFO: renamed from: O1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6064m {

    /* JADX INFO: renamed from: a */
    public final int f19754a;

    /* JADX INFO: renamed from: a */
    public static final boolean m6639a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m6640b(int i10) {
        if (m6639a(i10, -1)) {
            return "Unspecified";
        }
        if (m6639a(i10, 0)) {
            return "None";
        }
        if (m6639a(i10, 1)) {
            return "Default";
        }
        if (m6639a(i10, 2)) {
            return "Go";
        }
        if (m6639a(i10, 3)) {
            return "Search";
        }
        if (m6639a(i10, 4)) {
            return "Send";
        }
        if (m6639a(i10, 5)) {
            return "Previous";
        }
        if (m6639a(i10, 6)) {
            return "Next";
        }
        return m6639a(i10, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6064m) {
            return this.f19754a == ((C6064m) obj).f19754a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19754a;
    }

    public final String toString() {
        return m6640b(this.f19754a);
    }
}
