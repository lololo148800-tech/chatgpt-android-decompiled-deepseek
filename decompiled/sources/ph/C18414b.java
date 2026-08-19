package ph;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;
import p571X9.AbstractC9400y4;

/* JADX INFO: renamed from: ph.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18414b {

    /* JADX INFO: renamed from: a */
    public final boolean f58750a;

    /* JADX INFO: renamed from: b */
    public final int f58751b;

    /* JADX INFO: renamed from: c */
    public final float f58752c;

    /* JADX INFO: renamed from: d */
    public final float f58753d;

    /* JADX INFO: renamed from: e */
    public final float f58754e;

    /* JADX INFO: renamed from: f */
    public final long f58755f;

    public C18414b(boolean z6, int i10, float f10, float f11) {
        this(z6, i10, f10, f11, z6 ? C18417e.f58766i : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18414b)) {
            return false;
        }
        C18414b c18414b = (C18414b) obj;
        return this.f58750a == c18414b.f58750a && this.f58751b == c18414b.f58751b && C7540e.m7873a(this.f58752c, c18414b.f58752c) && C7540e.m7873a(this.f58753d, c18414b.f58753d) && C7540e.m7873a(this.f58754e, c18414b.f58754e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f58754e) + AbstractC12107L1.m13819j(this.f58753d, AbstractC12107L1.m13819j(this.f58752c, (((this.f58750a ? 1231 : 1237) * 31) + this.f58751b) * 31, 31), 31);
    }

    public final String toString() {
        return "█";
    }

    public C18414b(boolean z6, int i10, float f10, float f11, float f12) {
        this.f58750a = z6;
        this.f58751b = i10;
        this.f58752c = f10;
        this.f58753d = f11;
        this.f58754e = f12;
        float f13 = f11 * 2;
        this.f58755f = AbstractC9400y4.m9979b((C18417e.f58765h * (i10 - 1)) + (i10 * f10) + f13, f13 + (z6 ? f12 + C18417e.f58767j : 0) + f10);
    }
}
