package p758g0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: g0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C13782q extends AbstractC13784r {

    /* JADX INFO: renamed from: a */
    public float f43522a;

    /* JADX INFO: renamed from: b */
    public float f43523b;

    /* JADX INFO: renamed from: c */
    public float f43524c;

    /* JADX INFO: renamed from: d */
    public float f43525d;

    public C13782q(float f10, float f11, float f12, float f13) {
        this.f43522a = f10;
        this.f43523b = f11;
        this.f43524c = f12;
        this.f43525d = f13;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: a */
    public final float mo15283a(int i10) {
        if (i10 == 0) {
            return this.f43522a;
        }
        if (i10 == 1) {
            return this.f43523b;
        }
        if (i10 == 2) {
            return this.f43524c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f43525d;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: b */
    public final int mo15284b() {
        return 4;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: c */
    public final AbstractC13784r mo15285c() {
        return new C13782q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: d */
    public final void mo15286d() {
        this.f43522a = 0.0f;
        this.f43523b = 0.0f;
        this.f43524c = 0.0f;
        this.f43525d = 0.0f;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: e */
    public final void mo15287e(int i10, float f10) {
        if (i10 == 0) {
            this.f43522a = f10;
            return;
        }
        if (i10 == 1) {
            this.f43523b = f10;
        } else if (i10 == 2) {
            this.f43524c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f43525d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13782q) {
            C13782q c13782q = (C13782q) obj;
            if (c13782q.f43522a == this.f43522a && c13782q.f43523b == this.f43523b && c13782q.f43524c == this.f43524c && c13782q.f43525d == this.f43525d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43525d) + AbstractC12107L1.m13819j(this.f43524c, AbstractC12107L1.m13819j(this.f43523b, Float.floatToIntBits(this.f43522a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f43522a + ", v2 = " + this.f43523b + ", v3 = " + this.f43524c + ", v4 = " + this.f43525d;
    }
}
