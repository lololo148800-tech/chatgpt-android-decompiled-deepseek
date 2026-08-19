package p895n1;

import com.google.protobuf.AbstractC12107L1;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: n1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C17438r extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55762c;

    /* JADX INFO: renamed from: d */
    public final float f55763d;

    /* JADX INFO: renamed from: e */
    public final float f55764e;

    /* JADX INFO: renamed from: f */
    public final float f55765f;

    /* JADX INFO: renamed from: g */
    public final float f55766g;

    /* JADX INFO: renamed from: h */
    public final float f55767h;

    public C17438r(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2, true, false);
        this.f55762c = f10;
        this.f55763d = f11;
        this.f55764e = f12;
        this.f55765f = f13;
        this.f55766g = f14;
        this.f55767h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17438r)) {
            return false;
        }
        C17438r c17438r = (C17438r) obj;
        return Float.compare(this.f55762c, c17438r.f55762c) == 0 && Float.compare(this.f55763d, c17438r.f55763d) == 0 && Float.compare(this.f55764e, c17438r.f55764e) == 0 && Float.compare(this.f55765f, c17438r.f55765f) == 0 && Float.compare(this.f55766g, c17438r.f55766g) == 0 && Float.compare(this.f55767h, c17438r.f55767h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55767h) + AbstractC12107L1.m13819j(this.f55766g, AbstractC12107L1.m13819j(this.f55765f, AbstractC12107L1.m13819j(this.f55764e, AbstractC12107L1.m13819j(this.f55763d, Float.floatToIntBits(this.f55762c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f55762c);
        sb2.append(", dy1=");
        sb2.append(this.f55763d);
        sb2.append(", dx2=");
        sb2.append(this.f55764e);
        sb2.append(sVoFrD.AYekgESDllaQb);
        sb2.append(this.f55765f);
        sb2.append(", dx3=");
        sb2.append(this.f55766g);
        sb2.append(", dy3=");
        return AbstractC12107L1.m13825p(sb2, this.f55767h, ')');
    }
}
