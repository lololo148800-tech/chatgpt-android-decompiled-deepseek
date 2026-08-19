package p1139z0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: z0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C21639s {

    /* JADX INFO: renamed from: a */
    public int f68546a;

    /* JADX INFO: renamed from: b */
    public int f68547b;

    /* JADX INFO: renamed from: c */
    public int f68548c;

    /* JADX INFO: renamed from: d */
    public int f68549d;

    public C21639s(int i10, int i11, int i12, int i13) {
        this.f68546a = i10;
        this.f68547b = i11;
        this.f68548c = i12;
        this.f68549d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21639s)) {
            return false;
        }
        C21639s c21639s = (C21639s) obj;
        return this.f68546a == c21639s.f68546a && this.f68547b == c21639s.f68547b && this.f68548c == c21639s.f68548c && this.f68549d == c21639s.f68549d;
    }

    public final int hashCode() {
        return (((((this.f68546a * 31) + this.f68547b) * 31) + this.f68548c) * 31) + this.f68549d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Change(preStart=");
        sb2.append(this.f68546a);
        sb2.append(", preEnd=");
        sb2.append(this.f68547b);
        sb2.append(", originalStart=");
        sb2.append(this.f68548c);
        sb2.append(", originalEnd=");
        return AbstractC12107L1.m13826q(sb2, this.f68549d, ')');
    }
}
