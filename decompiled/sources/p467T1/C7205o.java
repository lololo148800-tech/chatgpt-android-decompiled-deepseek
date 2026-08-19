package p467T1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: T1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7205o {

    /* JADX INFO: renamed from: c */
    public static final C7205o f22871c = new C7205o(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f22872a;

    /* JADX INFO: renamed from: b */
    public final float f22873b;

    public C7205o(float f10, float f11) {
        this.f22872a = f10;
        this.f22873b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7205o)) {
            return false;
        }
        C7205o c7205o = (C7205o) obj;
        return this.f22872a == c7205o.f22872a && this.f22873b == c7205o.f22873b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22873b) + (Float.floatToIntBits(this.f22872a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f22872a);
        sb2.append(", skewX=");
        return AbstractC12107L1.m13825p(sb2, this.f22873b, ')');
    }
}
