package p442S2;

import p179H0.C3183a;

/* JADX INFO: renamed from: S2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6991e {

    /* JADX INFO: renamed from: a */
    public double f22363a;

    /* JADX INFO: renamed from: b */
    public double f22364b;

    /* JADX INFO: renamed from: c */
    public boolean f22365c;

    /* JADX INFO: renamed from: d */
    public double f22366d;

    /* JADX INFO: renamed from: e */
    public double f22367e;

    /* JADX INFO: renamed from: f */
    public double f22368f;

    /* JADX INFO: renamed from: g */
    public double f22369g;

    /* JADX INFO: renamed from: h */
    public double f22370h;

    /* JADX INFO: renamed from: i */
    public double f22371i;

    /* JADX INFO: renamed from: j */
    public final C3183a f22372j;

    public C6991e() {
        this.f22363a = Math.sqrt(1500.0d);
        this.f22364b = 0.5d;
        this.f22365c = false;
        this.f22371i = Double.MAX_VALUE;
        this.f22372j = new C3183a();
    }

    /* JADX INFO: renamed from: a */
    public final C3183a m7391a(double d10, double d11, long j10) {
        double dCos;
        double dPow;
        if (!this.f22365c) {
            if (this.f22371i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f22364b;
            if (d12 > 1.0d) {
                double d13 = this.f22363a;
                this.f22368f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f22364b;
                double d15 = this.f22363a;
                this.f22369g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f22370h = Math.sqrt(1.0d - (d12 * d12)) * this.f22363a;
            }
            this.f22365c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d10 - this.f22371i;
        double d18 = this.f22364b;
        if (d18 > 1.0d) {
            double d19 = this.f22369g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f22368f);
            double d21 = d17 - d20;
            dPow = (Math.pow(2.718281828459045d, this.f22368f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f22369g;
            double dPow2 = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f22368f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow2;
        } else if (d18 == 1.0d) {
            double d24 = this.f22363a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow3 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f22363a) * d16) * d26;
            double d27 = -this.f22363a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow4 * d27);
            dPow = dPow3;
        } else {
            double d28 = 1.0d / this.f22370h;
            double d29 = this.f22363a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            double dSin = ((Math.sin(this.f22370h * d16) * d30) + (Math.cos(this.f22370h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f22363a;
            double d32 = this.f22364b;
            double d33 = (-d31) * dSin * d32;
            double dPow5 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f22370h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f22370h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow5) + d33;
            dPow = dSin;
        }
        float f10 = (float) (dPow + this.f22371i);
        C3183a c3183a = this.f22372j;
        c3183a.f9593Y = f10;
        c3183a.f9594Z = (float) dCos;
        return c3183a;
    }

    public C6991e(float f10) {
        this.f22363a = Math.sqrt(1500.0d);
        this.f22364b = 0.5d;
        this.f22365c = false;
        this.f22372j = new C3183a();
        this.f22371i = f10;
    }
}
