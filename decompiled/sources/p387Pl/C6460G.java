package p387Pl;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: Pl.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6460G {

    /* JADX INFO: renamed from: a */
    public final int f20962a;

    /* JADX INFO: renamed from: b */
    public final int f20963b;

    public C6460G(int i10, int i11) {
        this.f20962a = i10;
        this.f20963b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6460G)) {
            return false;
        }
        C6460G c6460g = (C6460G) obj;
        return this.f20962a == c6460g.f20962a && this.f20963b == c6460g.f20963b;
    }

    public final int hashCode() {
        return (this.f20962a * 31) + this.f20963b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dimensions(width=");
        sb2.append(this.f20962a);
        sb2.append(", height=");
        return AbstractC12107L1.m13826q(sb2, this.f20963b, ')');
    }
}
