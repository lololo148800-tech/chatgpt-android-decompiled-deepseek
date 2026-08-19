package p492U1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: U1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7544i {

    /* JADX INFO: renamed from: e */
    public static final C7544i f23898e = new C7544i(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f23899a;

    /* JADX INFO: renamed from: b */
    public final int f23900b;

    /* JADX INFO: renamed from: c */
    public final int f23901c;

    /* JADX INFO: renamed from: d */
    public final int f23902d;

    public C7544i(int i10, int i11, int i12, int i13) {
        this.f23899a = i10;
        this.f23900b = i11;
        this.f23901c = i12;
        this.f23902d = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m7884a() {
        return this.f23902d - this.f23900b;
    }

    /* JADX INFO: renamed from: b */
    public final int m7885b() {
        return this.f23901c - this.f23899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7544i)) {
            return false;
        }
        C7544i c7544i = (C7544i) obj;
        return this.f23899a == c7544i.f23899a && this.f23900b == c7544i.f23900b && this.f23901c == c7544i.f23901c && this.f23902d == c7544i.f23902d;
    }

    public final int hashCode() {
        return (((((this.f23899a * 31) + this.f23900b) * 31) + this.f23901c) * 31) + this.f23902d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f23899a);
        sb2.append(", ");
        sb2.append(this.f23900b);
        sb2.append(", ");
        sb2.append(this.f23901c);
        sb2.append(", ");
        return AbstractC12107L1.m13826q(sb2, this.f23902d, ')');
    }
}
