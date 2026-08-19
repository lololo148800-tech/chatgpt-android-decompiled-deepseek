package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C17439s extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55768c;

    public C17439s(float f10) {
        super(3, false, false);
        this.f55768c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17439s) && Float.compare(this.f55768c, ((C17439s) obj).f55768c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55768c);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("RelativeHorizontalTo(dx="), this.f55768c, ')');
    }
}
