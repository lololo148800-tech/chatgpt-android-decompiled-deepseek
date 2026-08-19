package p758g0;

/* JADX INFO: renamed from: g0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C13778o extends AbstractC13784r {

    /* JADX INFO: renamed from: a */
    public float f43513a;

    /* JADX INFO: renamed from: b */
    public float f43514b;

    public C13778o(float f10, float f11) {
        this.f43513a = f10;
        this.f43514b = f11;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: a */
    public final float mo15283a(int i10) {
        if (i10 == 0) {
            return this.f43513a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f43514b;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: b */
    public final int mo15284b() {
        return 2;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: c */
    public final AbstractC13784r mo15285c() {
        return new C13778o(0.0f, 0.0f);
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: d */
    public final void mo15286d() {
        this.f43513a = 0.0f;
        this.f43514b = 0.0f;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: e */
    public final void mo15287e(int i10, float f10) {
        if (i10 == 0) {
            this.f43513a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f43514b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13778o) {
            C13778o c13778o = (C13778o) obj;
            if (c13778o.f43513a == this.f43513a && c13778o.f43514b == this.f43514b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43514b) + (Float.floatToIntBits(this.f43513a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f43513a + ", v2 = " + this.f43514b;
    }
}
