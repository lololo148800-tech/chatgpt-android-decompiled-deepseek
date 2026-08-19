package p749fd;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: fd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13616a {

    /* JADX INFO: renamed from: a */
    public final float f43006a;

    /* JADX INFO: renamed from: b */
    public final float f43007b;

    /* JADX INFO: renamed from: c */
    public final float f43008c;

    public C13616a(float f10, float f11, float f12, int i10) {
        f11 = (i10 & 2) != 0 ? 0.0f : f11;
        f12 = (i10 & 4) != 0 ? 0.0f : f12;
        this.f43006a = f10;
        this.f43007b = f11;
        this.f43008c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13616a)) {
            return false;
        }
        C13616a c13616a = (C13616a) obj;
        return Float.compare(this.f43006a, c13616a.f43006a) == 0 && Float.compare(this.f43007b, c13616a.f43007b) == 0 && Float.compare(this.f43008c, c13616a.f43008c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43008c) + AbstractC12107L1.m13819j(this.f43007b, Float.floatToIntBits(this.f43006a) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
