package p774h1;

/* JADX INFO: renamed from: h1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C14326D {

    /* JADX INFO: renamed from: a */
    public final int f44962a;

    /* JADX INFO: renamed from: a */
    public static final boolean m15601a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14326D) {
            return this.f44962a == ((C14326D) obj).f44962a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44962a;
    }

    public final String toString() {
        int i10 = this.f44962a;
        if (m15601a(i10, 0)) {
            return "Argb8888";
        }
        if (m15601a(i10, 1)) {
            return "Alpha8";
        }
        if (m15601a(i10, 2)) {
            return "Rgb565";
        }
        if (m15601a(i10, 3)) {
            return "F16";
        }
        return m15601a(i10, 4) ? "Gpu" : "Unknown";
    }
}
