package p953q0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: q0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C18593n {

    /* JADX INFO: renamed from: a */
    public final int f59233a;

    /* JADX INFO: renamed from: b */
    public final int f59234b;

    public C18593n(int i10, int i11) {
        this.f59233a = i10;
        this.f59234b = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18593n)) {
            return false;
        }
        C18593n c18593n = (C18593n) obj;
        return this.f59233a == c18593n.f59233a && this.f59234b == c18593n.f59234b;
    }

    public final int hashCode() {
        return (this.f59233a * 31) + this.f59234b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f59233a);
        sb2.append(", end=");
        return AbstractC12107L1.m13826q(sb2, this.f59234b, ')');
    }
}
