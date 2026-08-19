package p229J0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;

/* JADX INFO: renamed from: J0.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4103o1 {

    /* JADX INFO: renamed from: a */
    public final float f13161a;

    /* JADX INFO: renamed from: b */
    public final float f13162b;

    /* JADX INFO: renamed from: c */
    public final float f13163c;

    /* JADX INFO: renamed from: d */
    public final float f13164d;

    public C4103o1(float f10, float f11, float f12, float f13) {
        this.f13161a = f10;
        this.f13162b = f11;
        this.f13163c = f12;
        this.f13164d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4103o1)) {
            return false;
        }
        C4103o1 c4103o1 = (C4103o1) obj;
        if (C7540e.m7873a(this.f13161a, c4103o1.f13161a) && C7540e.m7873a(this.f13162b, c4103o1.f13162b) && C7540e.m7873a(this.f13163c, c4103o1.f13163c)) {
            return C7540e.m7873a(this.f13164d, c4103o1.f13164d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13164d) + AbstractC12107L1.m13819j(this.f13163c, AbstractC12107L1.m13819j(this.f13162b, Float.floatToIntBits(this.f13161a) * 31, 31), 31);
    }
}
