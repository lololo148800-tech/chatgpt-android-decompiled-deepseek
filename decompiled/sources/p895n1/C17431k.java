package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C17431k extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55740c;

    public C17431k(float f10) {
        super(3, false, false);
        this.f55740c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17431k) && Float.compare(this.f55740c, ((C17431k) obj).f55740c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55740c);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("HorizontalTo(x="), this.f55740c, ')');
    }
}
