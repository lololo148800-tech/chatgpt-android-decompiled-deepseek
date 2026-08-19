package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C17445y extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55783c;

    public C17445y(float f10) {
        super(3, false, false);
        this.f55783c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17445y) && Float.compare(this.f55783c, ((C17445y) obj).f55783c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55783c);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("RelativeVerticalTo(dy="), this.f55783c, ')');
    }
}
