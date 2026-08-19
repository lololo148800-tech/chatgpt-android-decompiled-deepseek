package p615Z6;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: Z6.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10238s0 {

    /* JADX INFO: renamed from: a */
    public final float f30405a;

    /* JADX INFO: renamed from: b */
    public final float f30406b;

    /* JADX INFO: renamed from: c */
    public float f30407c;

    /* JADX INFO: renamed from: d */
    public float f30408d;

    /* JADX INFO: renamed from: e */
    public boolean f30409e = false;

    public C10238s0(float f10, float f11, float f12, float f13) {
        this.f30407c = 0.0f;
        this.f30408d = 0.0f;
        this.f30405a = f10;
        this.f30406b = f11;
        double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
        if (dSqrt != 0.0d) {
            this.f30407c = (float) (((double) f12) / dSqrt);
            this.f30408d = (float) (((double) f13) / dSqrt);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10798a(float f10, float f11) {
        float f12 = f10 - this.f30405a;
        float f13 = f11 - this.f30406b;
        double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
        if (dSqrt != 0.0d) {
            f12 = (float) (((double) f12) / dSqrt);
            f13 = (float) (((double) f13) / dSqrt);
        }
        float f14 = this.f30407c;
        if (f12 != (-f14) || f13 != (-this.f30408d)) {
            this.f30407c = f14 + f12;
            this.f30408d += f13;
        } else {
            this.f30409e = true;
            this.f30407c = -f13;
            this.f30408d = f12;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10799b(C10238s0 c10238s0) {
        float f10 = c10238s0.f30407c;
        float f11 = this.f30407c;
        if (f10 == (-f11)) {
            float f12 = c10238s0.f30408d;
            if (f12 == (-this.f30408d)) {
                this.f30409e = true;
                this.f30407c = -f12;
                this.f30408d = c10238s0.f30407c;
                return;
            }
        }
        this.f30407c = f11 + f10;
        this.f30408d += c10238s0.f30408d;
    }

    public final String toString() {
        return Separators.LPAREN + this.f30405a + Separators.COMMA + this.f30406b + Separators.f31991SP + this.f30407c + Separators.COMMA + this.f30408d + Separators.RPAREN;
    }
}
