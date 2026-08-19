package p328N1;

/* JADX INFO: renamed from: N1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C5605u {

    /* JADX INFO: renamed from: a */
    public final int f18148a;

    /* JADX INFO: renamed from: a */
    public static final boolean m5992a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m5993b(int i10) {
        if (m5992a(i10, 0)) {
            return "Normal";
        }
        return m5992a(i10, 1) ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5605u) {
            return this.f18148a == ((C5605u) obj).f18148a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18148a;
    }

    public final String toString() {
        return m5993b(this.f18148a);
    }
}
