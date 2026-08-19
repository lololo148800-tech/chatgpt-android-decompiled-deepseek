package p179H0;

import p736f0.AbstractC13471I;
import p736f0.AbstractC13484b;
import p736f0.C13470H;
import p758g0.InterfaceC13728D;

/* JADX INFO: renamed from: H0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3183a implements InterfaceC13728D {

    /* JADX INFO: renamed from: Y */
    public float f9593Y;

    /* JADX INFO: renamed from: Z */
    public float f9594Z;

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: B */
    public long mo4028B(float f10) {
        return ((long) ((((float) Math.log(this.f9593Y / Math.abs(f10))) * 1000.0f) / this.f9594Z)) * 1000000;
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: F */
    public float mo4029F(float f10, float f11) {
        float fAbs = Math.abs(f11);
        float f12 = this.f9593Y;
        if (fAbs <= f12) {
            return f10;
        }
        double dLog = Math.log(Math.abs(f12 / f11));
        float f13 = this.f9594Z;
        return ((f11 / f13) * ((float) Math.exp((((double) f13) * ((dLog / ((double) f13)) * ((double) 1000))) / ((double) 1000.0f)))) + (f10 - (f11 / f13));
    }

    /* JADX INFO: renamed from: a */
    public C13470H m4030a(float f10) {
        double dM4031b = m4031b(f10);
        double d10 = AbstractC13471I.f42631a;
        double d11 = d10 - 1.0d;
        return new C13470H(f10, (float) (Math.exp((d10 / d11) * dM4031b) * ((double) (this.f9593Y * this.f9594Z))), (long) (Math.exp(dM4031b / d11) * 1000.0d));
    }

    /* JADX INFO: renamed from: b */
    public double m4031b(float f10) {
        float[] fArr = AbstractC13484b.f42668a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f9593Y * this.f9594Z)));
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: h */
    public float mo4032h() {
        return this.f9593Y;
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: q */
    public float mo4033q(float f10, long j10) {
        return f10 * ((float) Math.exp(((j10 / 1000000) / 1000.0f) * this.f9594Z));
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: s */
    public float mo4034s(float f10, float f11, long j10) {
        float f12 = this.f9594Z;
        return ((f11 / f12) * ((float) Math.exp((f12 * (j10 / 1000000)) / 1000.0f))) + (f10 - (f11 / f12));
    }
}
