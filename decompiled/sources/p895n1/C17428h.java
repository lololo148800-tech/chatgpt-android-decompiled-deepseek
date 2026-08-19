package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17428h extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55726c;

    /* JADX INFO: renamed from: d */
    public final float f55727d;

    /* JADX INFO: renamed from: e */
    public final float f55728e;

    /* JADX INFO: renamed from: f */
    public final boolean f55729f;

    /* JADX INFO: renamed from: g */
    public final boolean f55730g;

    /* JADX INFO: renamed from: h */
    public final float f55731h;

    /* JADX INFO: renamed from: i */
    public final float f55732i;

    public C17428h(float f10, float f11, float f12, boolean z6, boolean z10, float f13, float f14) {
        super(3, false, false);
        this.f55726c = f10;
        this.f55727d = f11;
        this.f55728e = f12;
        this.f55729f = z6;
        this.f55730g = z10;
        this.f55731h = f13;
        this.f55732i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17428h)) {
            return false;
        }
        C17428h c17428h = (C17428h) obj;
        return Float.compare(this.f55726c, c17428h.f55726c) == 0 && Float.compare(this.f55727d, c17428h.f55727d) == 0 && Float.compare(this.f55728e, c17428h.f55728e) == 0 && this.f55729f == c17428h.f55729f && this.f55730g == c17428h.f55730g && Float.compare(this.f55731h, c17428h.f55731h) == 0 && Float.compare(this.f55732i, c17428h.f55732i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55732i) + AbstractC12107L1.m13819j(this.f55731h, (((AbstractC12107L1.m13819j(this.f55728e, AbstractC12107L1.m13819j(this.f55727d, Float.floatToIntBits(this.f55726c) * 31, 31), 31) + (this.f55729f ? 1231 : 1237)) * 31) + (this.f55730g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f55726c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f55727d);
        sb2.append(", theta=");
        sb2.append(this.f55728e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f55729f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f55730g);
        sb2.append(", arcStartX=");
        sb2.append(this.f55731h);
        sb2.append(", arcStartY=");
        return AbstractC12107L1.m13825p(sb2, this.f55732i, ')');
    }
}
