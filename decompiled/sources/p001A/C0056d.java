package p001A;

import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: A.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0056d {

    /* JADX INFO: renamed from: a */
    public final int f260a;

    /* JADX INFO: renamed from: b */
    public final int f261b;

    /* JADX INFO: renamed from: c */
    public final boolean f262c;

    /* JADX INFO: renamed from: d */
    public final boolean f263d;

    public C0056d(int i10, int i11, boolean z6, boolean z10) {
        this.f260a = i10;
        this.f261b = i11;
        this.f262c = z6;
        this.f263d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0056d)) {
            return false;
        }
        C0056d c0056d = (C0056d) obj;
        return this.f260a == c0056d.f260a && this.f261b == c0056d.f261b && this.f262c == c0056d.f262c && this.f263d == c0056d.f263d;
    }

    public final int hashCode() {
        return ((((((this.f260a ^ 1000003) * 1000003) ^ this.f261b) * 1000003) ^ (this.f262c ? 1231 : 1237)) * 1000003) ^ (this.f263d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings{cameraMode=");
        sb2.append(this.f260a);
        sb2.append(", requiredMaxBitDepth=");
        sb2.append(this.f261b);
        sb2.append(", previewStabilizationOn=");
        sb2.append(this.f262c);
        sb2.append(", ultraHdrOn=");
        return AbstractC14376f.m15823B(sb2, this.f263d, "}");
    }
}
