package p895n1;

import com.google.protobuf.AbstractC12107L1;
import p509Uk.lpqL.SfpOlmlMATQ;

/* JADX INFO: renamed from: n1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C17437q extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55755c;

    /* JADX INFO: renamed from: d */
    public final float f55756d;

    /* JADX INFO: renamed from: e */
    public final float f55757e;

    /* JADX INFO: renamed from: f */
    public final boolean f55758f;

    /* JADX INFO: renamed from: g */
    public final boolean f55759g;

    /* JADX INFO: renamed from: h */
    public final float f55760h;

    /* JADX INFO: renamed from: i */
    public final float f55761i;

    public C17437q(float f10, float f11, float f12, boolean z6, boolean z10, float f13, float f14) {
        super(3, false, false);
        this.f55755c = f10;
        this.f55756d = f11;
        this.f55757e = f12;
        this.f55758f = z6;
        this.f55759g = z10;
        this.f55760h = f13;
        this.f55761i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17437q)) {
            return false;
        }
        C17437q c17437q = (C17437q) obj;
        return Float.compare(this.f55755c, c17437q.f55755c) == 0 && Float.compare(this.f55756d, c17437q.f55756d) == 0 && Float.compare(this.f55757e, c17437q.f55757e) == 0 && this.f55758f == c17437q.f55758f && this.f55759g == c17437q.f55759g && Float.compare(this.f55760h, c17437q.f55760h) == 0 && Float.compare(this.f55761i, c17437q.f55761i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55761i) + AbstractC12107L1.m13819j(this.f55760h, (((AbstractC12107L1.m13819j(this.f55757e, AbstractC12107L1.m13819j(this.f55756d, Float.floatToIntBits(this.f55755c) * 31, 31), 31) + (this.f55758f ? 1231 : 1237)) * 31) + (this.f55759g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f55755c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f55756d);
        sb2.append(", theta=");
        sb2.append(this.f55757e);
        sb2.append(SfpOlmlMATQ.MteoJQsl);
        sb2.append(this.f55758f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f55759g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f55760h);
        sb2.append(", arcStartDy=");
        return AbstractC12107L1.m13825p(sb2, this.f55761i, ')');
    }
}
