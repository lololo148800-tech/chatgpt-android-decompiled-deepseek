package p200Hm;

/* JADX INFO: renamed from: Hm.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3505d {

    /* JADX INFO: renamed from: a */
    public final float f10589a;

    /* JADX INFO: renamed from: b */
    public final float f10590b;

    public C3505d(float f10, float f11) {
        this.f10589a = f10;
        this.f10590b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static boolean m4194d(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m4195a() {
        return Float.valueOf(this.f10590b);
    }

    /* JADX INFO: renamed from: b */
    public final Comparable m4196b() {
        return Float.valueOf(this.f10589a);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4197c() {
        return this.f10589a > this.f10590b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3505d) {
            if (!m4197c() || !((C3505d) obj).m4197c()) {
                C3505d c3505d = (C3505d) obj;
                if (this.f10589a != c3505d.f10589a || this.f10590b != c3505d.f10590b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (m4197c()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f10589a) * 31) + Float.floatToIntBits(this.f10590b);
    }

    public final String toString() {
        return this.f10589a + ".." + this.f10590b;
    }
}
