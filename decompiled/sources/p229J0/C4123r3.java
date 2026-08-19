package p229J0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;

/* JADX INFO: renamed from: J0.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4123r3 {

    /* JADX INFO: renamed from: a */
    public final float f13304a;

    /* JADX INFO: renamed from: b */
    public final float f13305b;

    /* JADX INFO: renamed from: c */
    public final float f13306c;

    /* JADX INFO: renamed from: d */
    public final float f13307d;

    /* JADX INFO: renamed from: e */
    public final float f13308e;

    /* JADX INFO: renamed from: f */
    public final float f13309f;

    public C4123r3(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13304a = f10;
        this.f13305b = f11;
        this.f13306c = f12;
        this.f13307d = f13;
        this.f13308e = f14;
        this.f13309f = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4123r3)) {
            return false;
        }
        C4123r3 c4123r3 = (C4123r3) obj;
        return C7540e.m7873a(this.f13304a, c4123r3.f13304a) && C7540e.m7873a(this.f13305b, c4123r3.f13305b) && C7540e.m7873a(this.f13306c, c4123r3.f13306c) && C7540e.m7873a(this.f13307d, c4123r3.f13307d) && C7540e.m7873a(this.f13309f, c4123r3.f13309f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13309f) + AbstractC12107L1.m13819j(this.f13307d, AbstractC12107L1.m13819j(this.f13306c, AbstractC12107L1.m13819j(this.f13305b, Float.floatToIntBits(this.f13304a) * 31, 31), 31), 31);
    }
}
