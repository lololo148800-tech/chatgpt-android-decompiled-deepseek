package p797i1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: i1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C14917s {

    /* JADX INFO: renamed from: a */
    public final float f46474a;

    /* JADX INFO: renamed from: b */
    public final float f46475b;

    public C14917s(float f10, float f11) {
        this.f46474a = f10;
        this.f46475b = f11;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m16086a() {
        float f10 = this.f46474a;
        float f11 = this.f46475b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14917s)) {
            return false;
        }
        C14917s c14917s = (C14917s) obj;
        return Float.compare(this.f46474a, c14917s.f46474a) == 0 && Float.compare(this.f46475b, c14917s.f46475b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46475b) + (Float.floatToIntBits(this.f46474a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f46474a);
        sb2.append(", y=");
        return AbstractC12107L1.m13825p(sb2, this.f46475b, ')');
    }
}
