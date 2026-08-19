package p776h3;

/* JADX INFO: renamed from: h3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C14393g {

    /* JADX INFO: renamed from: a */
    public final int f45129a;

    /* JADX INFO: renamed from: a */
    public static final boolean m15895a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m15896b(int i10) {
        return "ContentScale(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14393g) {
            return this.f45129a == ((C14393g) obj).f45129a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45129a;
    }

    public final String toString() {
        return m15896b(this.f45129a);
    }
}
