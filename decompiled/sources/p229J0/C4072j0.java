package p229J0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;

/* JADX INFO: renamed from: J0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4072j0 {

    /* JADX INFO: renamed from: a */
    public final float f12961a;

    /* JADX INFO: renamed from: b */
    public final float f12962b;

    /* JADX INFO: renamed from: c */
    public final float f12963c;

    /* JADX INFO: renamed from: d */
    public final float f12964d;

    /* JADX INFO: renamed from: e */
    public final float f12965e;

    public C4072j0(float f10, float f11, float f12, float f13, float f14) {
        this.f12961a = f10;
        this.f12962b = f11;
        this.f12963c = f12;
        this.f12964d = f13;
        this.f12965e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4072j0)) {
            return false;
        }
        C4072j0 c4072j0 = (C4072j0) obj;
        return C7540e.m7873a(this.f12961a, c4072j0.f12961a) && C7540e.m7873a(this.f12962b, c4072j0.f12962b) && C7540e.m7873a(this.f12963c, c4072j0.f12963c) && C7540e.m7873a(this.f12964d, c4072j0.f12964d) && C7540e.m7873a(this.f12965e, c4072j0.f12965e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f12965e) + AbstractC12107L1.m13819j(this.f12964d, AbstractC12107L1.m13819j(this.f12963c, AbstractC12107L1.m13819j(this.f12962b, Float.floatToIntBits(this.f12961a) * 31, 31), 31), 31);
    }
}
