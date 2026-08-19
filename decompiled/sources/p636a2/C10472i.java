package p636a2;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: a2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10472i {

    /* JADX INFO: renamed from: a */
    public final Integer f31015a;

    /* JADX INFO: renamed from: b */
    public final int f31016b;

    public C10472i(int i10, Integer num) {
        this.f31015a = num;
        this.f31016b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10472i)) {
            return false;
        }
        C10472i c10472i = (C10472i) obj;
        return this.f31015a.equals(c10472i.f31015a) && this.f31016b == c10472i.f31016b;
    }

    public final int hashCode() {
        return (this.f31015a.hashCode() * 31) + this.f31016b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalAnchor(id=");
        sb2.append(this.f31015a);
        sb2.append(", index=");
        return AbstractC12107L1.m13826q(sb2, this.f31016b, ')');
    }
}
