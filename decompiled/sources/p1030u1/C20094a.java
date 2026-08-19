package p1030u1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: u1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20094a {

    /* JADX INFO: renamed from: a */
    public long f63622a;

    /* JADX INFO: renamed from: b */
    public float f63623b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20094a)) {
            return false;
        }
        C20094a c20094a = (C20094a) obj;
        return this.f63622a == c20094a.f63622a && Float.compare(this.f63623b, c20094a.f63623b) == 0;
    }

    public final int hashCode() {
        long j10 = this.f63622a;
        return Float.floatToIntBits(this.f63623b) + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f63622a);
        sb2.append(", dataPoint=");
        return AbstractC12107L1.m13825p(sb2, this.f63623b, ')');
    }
}
