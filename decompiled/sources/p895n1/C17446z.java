package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C17446z extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55784c;

    public C17446z(float f10) {
        super(3, false, false);
        this.f55784c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17446z) && Float.compare(this.f55784c, ((C17446z) obj).f55784c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55784c);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("VerticalTo(y="), this.f55784c, ')');
    }
}
