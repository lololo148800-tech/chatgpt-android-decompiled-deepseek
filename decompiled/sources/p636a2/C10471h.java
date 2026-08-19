package p636a2;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: a2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10471h {

    /* JADX INFO: renamed from: a */
    public final Integer f31013a;

    /* JADX INFO: renamed from: b */
    public final int f31014b;

    public C10471h(int i10, Integer num) {
        this.f31013a = num;
        this.f31014b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10471h)) {
            return false;
        }
        C10471h c10471h = (C10471h) obj;
        return this.f31013a.equals(c10471h.f31013a) && this.f31014b == c10471h.f31014b;
    }

    public final int hashCode() {
        return (this.f31013a.hashCode() * 31) + this.f31014b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalAnchor(id=");
        sb2.append(this.f31013a);
        sb2.append(", index=");
        return AbstractC12107L1.m13826q(sb2, this.f31014b, ')');
    }
}
