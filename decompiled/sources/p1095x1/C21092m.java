package p1095x1;

/* JADX INFO: renamed from: x1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C21092m implements InterfaceC21090k {
    @Override // p1095x1.InterfaceC21090k
    /* JADX INFO: renamed from: a */
    public final long mo21575a(long j10, long j11) {
        return AbstractC21075b0.m21561b(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21092m)) {
            return false;
        }
        ((C21092m) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
