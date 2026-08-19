package p758g0;

import p530Vi.AbstractC8301I;
import p658b5.C11238i;

/* JADX INFO: renamed from: g0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C13730F implements InterfaceC13727C {

    /* JADX INFO: renamed from: a */
    public final int f43294a;

    /* JADX INFO: renamed from: b */
    public final int f43295b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13798z f43296c;

    /* JADX INFO: renamed from: d */
    public final long f43297d;

    /* JADX INFO: renamed from: e */
    public final long f43298e;

    public C13730F(int i10, int i11, InterfaceC13798z interfaceC13798z) {
        this.f43294a = i10;
        this.f43295b = i11;
        this.f43296c = interfaceC13798z;
        this.f43297d = ((long) i10) * 1000000;
        this.f43298e = ((long) i11) * 1000000;
    }

    @Override // p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 mo15214a(C13783q0 c13783q0) {
        return new C11238i(this);
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: b */
    public final float mo15210b(long j10, float f10, float f11, float f12) {
        long jM8922m = AbstractC8301I.m8922m(j10 - this.f43298e, 0L, this.f43297d);
        if (jM8922m < 0) {
            return 0.0f;
        }
        if (jM8922m == 0) {
            return f12;
        }
        return (mo15213e(jM8922m, f10, f11, f12) - mo15213e(jM8922m - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: c */
    public final long mo15211c(float f10, float f11, float f12) {
        return ((long) (this.f43295b + this.f43294a)) * 1000000;
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: d */
    public final float mo15212d(float f10, float f11, float f12) {
        return mo15210b(mo15211c(f10, f11, f12), f10, f11, f12);
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: e */
    public final float mo15213e(long j10, float f10, float f11, float f12) {
        float fM8922m = this.f43294a == 0 ? 1.0f : AbstractC8301I.m8922m(j10 - this.f43298e, 0L, this.f43297d) / this.f43297d;
        if (fM8922m < 0.0f) {
            fM8922m = 0.0f;
        }
        float fMo9579a = this.f43296c.mo9579a(fM8922m <= 1.0f ? fM8922m : 1.0f);
        C13783q0 c13783q0 = AbstractC13785r0.f43528a;
        return (f11 * fMo9579a) + ((1 - fMo9579a) * f10);
    }
}
