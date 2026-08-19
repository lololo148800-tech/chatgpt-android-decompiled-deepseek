package p229J0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;

/* JADX INFO: renamed from: J0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3877A0 {

    /* JADX INFO: renamed from: a */
    public final float f11723a;

    /* JADX INFO: renamed from: b */
    public final float f11724b;

    /* JADX INFO: renamed from: c */
    public final float f11725c;

    /* JADX INFO: renamed from: d */
    public final float f11726d;

    /* JADX INFO: renamed from: e */
    public final float f11727e;

    /* JADX INFO: renamed from: f */
    public final float f11728f;

    public C3877A0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f11723a = f10;
        this.f11724b = f11;
        this.f11725c = f12;
        this.f11726d = f13;
        this.f11727e = f14;
        this.f11728f = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3877A0)) {
            return false;
        }
        C3877A0 c3877a0 = (C3877A0) obj;
        return C7540e.m7873a(this.f11723a, c3877a0.f11723a) && C7540e.m7873a(this.f11724b, c3877a0.f11724b) && C7540e.m7873a(this.f11725c, c3877a0.f11725c) && C7540e.m7873a(this.f11726d, c3877a0.f11726d) && C7540e.m7873a(this.f11728f, c3877a0.f11728f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11728f) + AbstractC12107L1.m13819j(this.f11726d, AbstractC12107L1.m13819j(this.f11725c, AbstractC12107L1.m13819j(this.f11724b, Float.floatToIntBits(this.f11723a) * 31, 31), 31), 31);
    }
}
