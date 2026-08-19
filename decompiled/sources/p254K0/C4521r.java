package p254K0;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: K0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4521r {

    /* JADX INFO: renamed from: a */
    public final float f14776a;

    /* JADX INFO: renamed from: b */
    public final boolean f14777b;

    public C4521r(float f10, boolean z6) {
        this.f14776a = f10;
        this.f14777b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4521r)) {
            return false;
        }
        C4521r c4521r = (C4521r) obj;
        return Float.compare(this.f14776a, c4521r.f14776a) == 0 && this.f14777b == c4521r.f14777b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f14776a) * 31) + (this.f14777b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TmpKeyline(size=");
        sb2.append(this.f14776a);
        sb2.append(", isAnchor=");
        return AbstractC3794B0.m4499x(sb2, this.f14777b, ')');
    }
}
