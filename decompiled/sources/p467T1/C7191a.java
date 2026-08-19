package p467T1;

/* JADX INFO: renamed from: T1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7191a {

    /* JADX INFO: renamed from: a */
    public final float f22846a;

    public final boolean equals(Object obj) {
        if (obj instanceof C7191a) {
            return Float.compare(this.f22846a, ((C7191a) obj).f22846a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22846a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f22846a + ')';
    }
}
