package p492U1;

/* JADX INFO: renamed from: U1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7540e implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final float f23894Y;

    /* JADX INFO: renamed from: a */
    public static final boolean m7873a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m7874b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f23894Y, ((C7540e) obj).f23894Y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7540e) {
            return Float.compare(this.f23894Y, ((C7540e) obj).f23894Y) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23894Y);
    }

    public final String toString() {
        return m7874b(this.f23894Y);
    }
}
