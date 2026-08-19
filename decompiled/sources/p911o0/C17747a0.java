package p911o0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: o0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17747a0 {

    /* JADX INFO: renamed from: a */
    public final int f56667a;

    /* JADX INFO: renamed from: b */
    public final int f56668b;

    /* JADX INFO: renamed from: c */
    public final int f56669c;

    /* JADX INFO: renamed from: d */
    public final int f56670d;

    public C17747a0(int i10, int i11, int i12, int i13) {
        this.f56667a = i10;
        this.f56668b = i11;
        this.f56669c = i12;
        this.f56670d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17747a0)) {
            return false;
        }
        C17747a0 c17747a0 = (C17747a0) obj;
        return this.f56667a == c17747a0.f56667a && this.f56668b == c17747a0.f56668b && this.f56669c == c17747a0.f56669c && this.f56670d == c17747a0.f56670d;
    }

    public final int hashCode() {
        return (((((this.f56667a * 31) + this.f56668b) * 31) + this.f56669c) * 31) + this.f56670d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f56667a);
        sb2.append(", top=");
        sb2.append(this.f56668b);
        sb2.append(", right=");
        sb2.append(this.f56669c);
        sb2.append(", bottom=");
        return AbstractC12107L1.m13826q(sb2, this.f56670d, ')');
    }
}
