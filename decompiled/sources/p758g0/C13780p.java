package p758g0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: g0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C13780p extends AbstractC13784r {

    /* JADX INFO: renamed from: a */
    public float f43516a;

    /* JADX INFO: renamed from: b */
    public float f43517b;

    /* JADX INFO: renamed from: c */
    public float f43518c;

    public C13780p(float f10, float f11, float f12) {
        this.f43516a = f10;
        this.f43517b = f11;
        this.f43518c = f12;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: a */
    public final float mo15283a(int i10) {
        if (i10 == 0) {
            return this.f43516a;
        }
        if (i10 == 1) {
            return this.f43517b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f43518c;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: b */
    public final int mo15284b() {
        return 3;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: c */
    public final AbstractC13784r mo15285c() {
        return new C13780p(0.0f, 0.0f, 0.0f);
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: d */
    public final void mo15286d() {
        this.f43516a = 0.0f;
        this.f43517b = 0.0f;
        this.f43518c = 0.0f;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: e */
    public final void mo15287e(int i10, float f10) {
        if (i10 == 0) {
            this.f43516a = f10;
        } else if (i10 == 1) {
            this.f43517b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f43518c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13780p) {
            C13780p c13780p = (C13780p) obj;
            if (c13780p.f43516a == this.f43516a && c13780p.f43517b == this.f43517b && c13780p.f43518c == this.f43518c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43518c) + AbstractC12107L1.m13819j(this.f43517b, Float.floatToIntBits(this.f43516a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f43516a + ", v2 = " + this.f43517b + ", v3 = " + this.f43518c;
    }
}
