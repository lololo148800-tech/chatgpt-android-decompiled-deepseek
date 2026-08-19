package p911o0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17775o0 {

    /* JADX INFO: renamed from: a */
    public float f56734a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f56735b = true;

    /* JADX INFO: renamed from: c */
    public AbstractC17758g f56736c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17775o0)) {
            return false;
        }
        C17775o0 c17775o0 = (C17775o0) obj;
        return Float.compare(this.f56734a, c17775o0.f56734a) == 0 && this.f56735b == c17775o0.f56735b && AbstractC16544l.m18089b(this.f56736c, c17775o0.f56736c) && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f56734a) * 31) + (this.f56735b ? 1231 : 1237)) * 31;
        AbstractC17758g abstractC17758g = this.f56736c;
        return (iFloatToIntBits + (abstractC17758g == null ? 0 : abstractC17758g.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f56734a + ", fill=" + this.f56735b + ", crossAxisAlignment=" + this.f56736c + ", flowLayoutData=null)";
    }
}
