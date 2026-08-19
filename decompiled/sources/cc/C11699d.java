package cc;

import fo.C13711h;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p310M9.C5311e;
import p571X9.C9250Z4;

/* JADX INFO: renamed from: cc.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11699d {

    /* JADX INFO: renamed from: a */
    public final int f35492a;

    /* JADX INFO: renamed from: b */
    public final float f35493b;

    public /* synthetic */ C11699d(int i10, float f10) {
        this.f35492a = i10;
        this.f35493b = f10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11699d)) {
            return false;
        }
        C11699d c11699d = (C11699d) obj;
        if (Float.floatToIntBits(this.f35493b) == Float.floatToIntBits(c11699d.f35493b) && AbstractC20502t.m21161l(Integer.valueOf(this.f35492a), Integer.valueOf(c11699d.f35492a)) && AbstractC20502t.m21161l(1, 1) && AbstractC20502t.m21161l(1, 1)) {
            Boolean bool = Boolean.FALSE;
            if (AbstractC20502t.m21161l(bool, bool) && AbstractC20502t.m21161l(1, 1) && AbstractC20502t.m21161l(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(this.f35493b)), Integer.valueOf(this.f35492a), 1, 1, Boolean.FALSE, 1, null});
    }

    public final String toString() {
        C5311e c5311e = new C5311e("FaceDetectorOptions", 17);
        c5311e.m5850E(this.f35492a, "landmarkMode");
        c5311e.m5850E(1, "contourMode");
        c5311e.m5850E(1, "classificationMode");
        c5311e.m5850E(1, "performanceMode");
        String strValueOf = String.valueOf(false);
        C9250Z4 c9250z4 = new C9250Z4(16, false);
        ((C13711h) c5311e.f17486p0).f43261p0 = c9250z4;
        c5311e.f17486p0 = c9250z4;
        c9250z4.f43260o0 = strValueOf;
        c9250z4.f43259Z = "trackingEnabled";
        c5311e.m5847B("minFaceSize", this.f35493b);
        return c5311e.toString();
    }
}
