package p516V1;

import io.sentry.hints.C15370i;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: V1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7739c implements InterfaceC7737a {

    /* JADX INFO: renamed from: a */
    public final float[] f24406a;

    /* JADX INFO: renamed from: b */
    public final float[] f24407b;

    public C7739c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f24406a = fArr;
        this.f24407b = fArr2;
    }

    @Override // p516V1.InterfaceC7737a
    /* JADX INFO: renamed from: a */
    public final float mo7891a(float f10) {
        return C15370i.m16624j(f10, this.f24407b, this.f24406a);
    }

    @Override // p516V1.InterfaceC7737a
    /* JADX INFO: renamed from: b */
    public final float mo7892b(float f10) {
        return C15370i.m16624j(f10, this.f24406a, this.f24407b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7739c)) {
            return false;
        }
        C7739c c7739c = (C7739c) obj;
        return Arrays.equals(this.f24406a, c7739c.f24406a) && Arrays.equals(this.f24407b, c7739c.f24407b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24407b) + (Arrays.hashCode(this.f24406a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f24406a);
        AbstractC16544l.m18093f(string, "toString(this)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f24407b);
        AbstractC16544l.m18093f(string2, "toString(this)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
