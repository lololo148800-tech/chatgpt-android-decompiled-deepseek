package p1116y0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: y0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C21359h {

    /* JADX INFO: renamed from: a */
    public final int f67832a;

    public final boolean equals(Object obj) {
        if (obj instanceof C21359h) {
            return this.f67832a == ((C21359h) obj).f67832a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f67832a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("TextHighlightType(value="), this.f67832a, ')');
    }
}
