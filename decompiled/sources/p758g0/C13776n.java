package p758g0;

/* JADX INFO: renamed from: g0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C13776n extends AbstractC13784r {

    /* JADX INFO: renamed from: a */
    public float f43510a;

    public C13776n(float f10) {
        this.f43510a = f10;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: a */
    public final float mo15283a(int i10) {
        if (i10 == 0) {
            return this.f43510a;
        }
        return 0.0f;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: b */
    public final int mo15284b() {
        return 1;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: c */
    public final AbstractC13784r mo15285c() {
        return new C13776n(0.0f);
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: d */
    public final void mo15286d() {
        this.f43510a = 0.0f;
    }

    @Override // p758g0.AbstractC13784r
    /* JADX INFO: renamed from: e */
    public final void mo15287e(int i10, float f10) {
        if (i10 == 0) {
            this.f43510a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13776n) && ((C13776n) obj).f43510a == this.f43510a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43510a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f43510a;
    }
}
