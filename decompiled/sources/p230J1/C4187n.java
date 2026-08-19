package p230J1;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: J1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4187n {

    /* JADX INFO: renamed from: a */
    public final int f13600a;

    /* JADX INFO: renamed from: b */
    public final int f13601b;

    /* JADX INFO: renamed from: c */
    public final boolean f13602c;

    public C4187n(int i10, int i11, boolean z6) {
        this.f13600a = i10;
        this.f13601b = i11;
        this.f13602c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4187n)) {
            return false;
        }
        C4187n c4187n = (C4187n) obj;
        return this.f13600a == c4187n.f13600a && this.f13601b == c4187n.f13601b && this.f13602c == c4187n.f13602c;
    }

    public final int hashCode() {
        return (((this.f13600a * 31) + this.f13601b) * 31) + (this.f13602c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f13600a);
        sb2.append(", end=");
        sb2.append(this.f13601b);
        sb2.append(", isRtl=");
        return AbstractC3794B0.m4499x(sb2, this.f13602c, ')');
    }
}
