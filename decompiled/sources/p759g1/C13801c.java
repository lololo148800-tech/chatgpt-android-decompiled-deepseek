package p759g1;

import com.google.protobuf.AbstractC12107L1;
import p523V9.AbstractC8080e6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;

/* JADX INFO: renamed from: g1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13801c {

    /* JADX INFO: renamed from: e */
    public static final C13801c f43585e = new C13801c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f43586a;

    /* JADX INFO: renamed from: b */
    public final float f43587b;

    /* JADX INFO: renamed from: c */
    public final float f43588c;

    /* JADX INFO: renamed from: d */
    public final float f43589d;

    public C13801c(float f10, float f11, float f12, float f13) {
        this.f43586a = f10;
        this.f43587b = f11;
        this.f43588c = f12;
        this.f43589d = f13;
    }

    /* JADX INFO: renamed from: b */
    public static C13801c m15314b(C13801c c13801c, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f10 = c13801c.f43586a;
        }
        if ((i10 & 4) != 0) {
            f11 = c13801c.f43588c;
        }
        if ((i10 & 8) != 0) {
            f12 = c13801c.f43589d;
        }
        return new C13801c(f10, c13801c.f43587b, f11, f12);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15315a(long j10) {
        return C13800b.m15306g(j10) >= this.f43586a && C13800b.m15306g(j10) < this.f43588c && C13800b.m15307h(j10) >= this.f43587b && C13800b.m15307h(j10) < this.f43589d;
    }

    /* JADX INFO: renamed from: c */
    public final long m15316c() {
        return AbstractC8088f6.m8536b((m15321h() / 2.0f) + this.f43586a, this.f43589d);
    }

    /* JADX INFO: renamed from: d */
    public final long m15317d() {
        return AbstractC8088f6.m8536b((m15321h() / 2.0f) + this.f43586a, (m15318e() / 2.0f) + this.f43587b);
    }

    /* JADX INFO: renamed from: e */
    public final float m15318e() {
        return this.f43589d - this.f43587b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13801c)) {
            return false;
        }
        C13801c c13801c = (C13801c) obj;
        return Float.compare(this.f43586a, c13801c.f43586a) == 0 && Float.compare(this.f43587b, c13801c.f43587b) == 0 && Float.compare(this.f43588c, c13801c.f43588c) == 0 && Float.compare(this.f43589d, c13801c.f43589d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final long m15319f() {
        return AbstractC8112i6.m8603a(m15321h(), m15318e());
    }

    /* JADX INFO: renamed from: g */
    public final long m15320g() {
        return AbstractC8088f6.m8536b(this.f43586a, this.f43587b);
    }

    /* JADX INFO: renamed from: h */
    public final float m15321h() {
        return this.f43588c - this.f43586a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43589d) + AbstractC12107L1.m13819j(this.f43588c, AbstractC12107L1.m13819j(this.f43587b, Float.floatToIntBits(this.f43586a) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final C13801c m15322i(C13801c c13801c) {
        return new C13801c(Math.max(this.f43586a, c13801c.f43586a), Math.max(this.f43587b, c13801c.f43587b), Math.min(this.f43588c, c13801c.f43588c), Math.min(this.f43589d, c13801c.f43589d));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15323j() {
        return this.f43586a >= this.f43588c || this.f43587b >= this.f43589d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15324k(C13801c c13801c) {
        return this.f43588c > c13801c.f43586a && c13801c.f43588c > this.f43586a && this.f43589d > c13801c.f43587b && c13801c.f43589d > this.f43587b;
    }

    /* JADX INFO: renamed from: l */
    public final C13801c m15325l(float f10, float f11) {
        return new C13801c(this.f43586a + f10, this.f43587b + f11, this.f43588c + f10, this.f43589d + f11);
    }

    /* JADX INFO: renamed from: m */
    public final C13801c m15326m(long j10) {
        return new C13801c(C13800b.m15306g(j10) + this.f43586a, C13800b.m15307h(j10) + this.f43587b, C13800b.m15306g(j10) + this.f43588c, C13800b.m15307h(j10) + this.f43589d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC8080e6.m8508c(this.f43586a) + ", " + AbstractC8080e6.m8508c(this.f43587b) + ", " + AbstractC8080e6.m8508c(this.f43588c) + ", " + AbstractC8080e6.m8508c(this.f43589d) + ')';
    }
}
