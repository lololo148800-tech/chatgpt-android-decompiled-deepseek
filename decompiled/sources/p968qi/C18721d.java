package p968qi;

/* JADX INFO: renamed from: qi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18721d extends AbstractC18724g {

    /* JADX INFO: renamed from: a */
    public final double f59563a;

    public C18721d(double d10) {
        this.f59563a = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18721d) && Double.compare(this.f59563a, ((C18721d) obj).f59563a) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f59563a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return "█";
    }
}
