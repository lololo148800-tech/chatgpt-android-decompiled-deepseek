package p736f0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13483a {

    /* JADX INFO: renamed from: a */
    public final float f42666a;

    /* JADX INFO: renamed from: b */
    public final float f42667b;

    public C13483a(float f10, float f11) {
        this.f42666a = f10;
        this.f42667b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13483a)) {
            return false;
        }
        C13483a c13483a = (C13483a) obj;
        return Float.compare(this.f42666a, c13483a.f42666a) == 0 && Float.compare(this.f42667b, c13483a.f42667b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f42667b) + (Float.floatToIntBits(this.f42666a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f42666a);
        sb2.append(", velocityCoefficient=");
        return AbstractC12107L1.m13825p(sb2, this.f42667b, ')');
    }
}
