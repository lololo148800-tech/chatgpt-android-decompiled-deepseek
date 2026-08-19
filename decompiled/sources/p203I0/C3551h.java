package p203I0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: I0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3551h {

    /* JADX INFO: renamed from: a */
    public final float f10759a;

    /* JADX INFO: renamed from: b */
    public final float f10760b;

    /* JADX INFO: renamed from: c */
    public final float f10761c;

    /* JADX INFO: renamed from: d */
    public final float f10762d;

    public C3551h(float f10, float f11, float f12, float f13) {
        this.f10759a = f10;
        this.f10760b = f11;
        this.f10761c = f12;
        this.f10762d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3551h)) {
            return false;
        }
        C3551h c3551h = (C3551h) obj;
        return this.f10759a == c3551h.f10759a && this.f10760b == c3551h.f10760b && this.f10761c == c3551h.f10761c && this.f10762d == c3551h.f10762d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10762d) + AbstractC12107L1.m13819j(this.f10761c, AbstractC12107L1.m13819j(this.f10760b, Float.floatToIntBits(this.f10759a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f10759a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f10760b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f10761c);
        sb2.append(", pressedAlpha=");
        return AbstractC12107L1.m13825p(sb2, this.f10762d, ')');
    }
}
