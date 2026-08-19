package p254K0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: K0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4519p {

    /* JADX INFO: renamed from: a */
    public final float f14762a;

    /* JADX INFO: renamed from: b */
    public final float f14763b;

    /* JADX INFO: renamed from: c */
    public final float f14764c;

    /* JADX INFO: renamed from: d */
    public final boolean f14765d;

    /* JADX INFO: renamed from: e */
    public final boolean f14766e;

    /* JADX INFO: renamed from: f */
    public final boolean f14767f;

    /* JADX INFO: renamed from: g */
    public final float f14768g;

    public C4519p(float f10, float f11, float f12, boolean z6, boolean z10, boolean z11, float f13) {
        this.f14762a = f10;
        this.f14763b = f11;
        this.f14764c = f12;
        this.f14765d = z6;
        this.f14766e = z10;
        this.f14767f = z11;
        this.f14768g = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4519p)) {
            return false;
        }
        C4519p c4519p = (C4519p) obj;
        return Float.compare(this.f14762a, c4519p.f14762a) == 0 && Float.compare(this.f14763b, c4519p.f14763b) == 0 && Float.compare(this.f14764c, c4519p.f14764c) == 0 && this.f14765d == c4519p.f14765d && this.f14766e == c4519p.f14766e && this.f14767f == c4519p.f14767f && Float.compare(this.f14768g, c4519p.f14768g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14768g) + ((((((AbstractC12107L1.m13819j(this.f14764c, AbstractC12107L1.m13819j(this.f14763b, Float.floatToIntBits(this.f14762a) * 31, 31), 31) + (this.f14765d ? 1231 : 1237)) * 31) + (this.f14766e ? 1231 : 1237)) * 31) + (this.f14767f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Keyline(size=");
        sb2.append(this.f14762a);
        sb2.append(", offset=");
        sb2.append(this.f14763b);
        sb2.append(", unadjustedOffset=");
        sb2.append(this.f14764c);
        sb2.append(", isFocal=");
        sb2.append(this.f14765d);
        sb2.append(", isAnchor=");
        sb2.append(this.f14766e);
        sb2.append(", isPivot=");
        sb2.append(this.f14767f);
        sb2.append(", cutoff=");
        return AbstractC12107L1.m13825p(sb2, this.f14768g, ')');
    }
}
