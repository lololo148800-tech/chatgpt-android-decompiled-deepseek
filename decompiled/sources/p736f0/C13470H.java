package p736f0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: f0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C13470H {

    /* JADX INFO: renamed from: a */
    public final float f42628a;

    /* JADX INFO: renamed from: b */
    public final float f42629b;

    /* JADX INFO: renamed from: c */
    public final long f42630c;

    public C13470H(float f10, float f11, long j10) {
        this.f42628a = f10;
        this.f42629b = f11;
        this.f42630c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13470H)) {
            return false;
        }
        C13470H c13470h = (C13470H) obj;
        return Float.compare(this.f42628a, c13470h.f42628a) == 0 && Float.compare(this.f42629b, c13470h.f42629b) == 0 && this.f42630c == c13470h.f42630c;
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f42629b, Float.floatToIntBits(this.f42628a) * 31, 31);
        long j10 = this.f42630c;
        return iM13819j + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f42628a + ", distance=" + this.f42629b + ", duration=" + this.f42630c + ')';
    }
}
