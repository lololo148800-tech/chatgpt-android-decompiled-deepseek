package p492U1;

import com.google.protobuf.AbstractC12107L1;
import p516V1.InterfaceC7737a;

/* JADX INFO: renamed from: U1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7547l implements InterfaceC7737a {

    /* JADX INFO: renamed from: a */
    public final float f23907a;

    public C7547l(float f10) {
        this.f23907a = f10;
    }

    @Override // p516V1.InterfaceC7737a
    /* JADX INFO: renamed from: a */
    public final float mo7891a(float f10) {
        return f10 / this.f23907a;
    }

    @Override // p516V1.InterfaceC7737a
    /* JADX INFO: renamed from: b */
    public final float mo7892b(float f10) {
        return f10 * this.f23907a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7547l) && Float.compare(this.f23907a, ((C7547l) obj).f23907a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23907a);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f23907a, ')');
    }
}
