package p655b2;

import android.gov.nist.core.Separators;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Arrays;
import p033B5.C0842z;

/* JADX INFO: renamed from: b2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11220d extends C11218b {

    /* JADX INFO: renamed from: f */
    public C11221e[] f33963f;

    /* JADX INFO: renamed from: g */
    public C11221e[] f33964g;

    /* JADX INFO: renamed from: h */
    public int f33965h;

    /* JADX INFO: renamed from: i */
    public C15384c f33966i;

    @Override // p655b2.C11218b
    /* JADX INFO: renamed from: d */
    public final C11221e mo12450d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f33965h; i11++) {
            C11221e[] c11221eArr = this.f33963f;
            C11221e c11221e = c11221eArr[i11];
            if (!zArr[c11221e.f33968Z]) {
                C15384c c15384c = this.f33966i;
                c15384c.f47967Z = c11221e;
                int i12 = 8;
                if (i10 != -1) {
                    C11221e c11221e2 = c11221eArr[i10];
                    while (i12 >= 0) {
                        float f10 = c11221e2.f33974t0[i12];
                        float f11 = ((C11221e) c15384c.f47967Z).f33974t0[i12];
                        if (f11 != f10) {
                            if (f11 >= f10) {
                                break;
                            }
                            i10 = i11;
                            break;
                            break;
                        }
                        i12--;
                    }
                } else {
                    while (i12 >= 0) {
                        float f12 = ((C11221e) c15384c.f47967Z).f33974t0[i12];
                        if (f12 > 0.0f) {
                            break;
                        }
                        if (f12 < 0.0f) {
                            i10 = i11;
                            break;
                        }
                        i12--;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f33963f[i10];
    }

    @Override // p655b2.C11218b
    /* JADX INFO: renamed from: e */
    public final boolean mo12451e() {
        return this.f33965h == 0;
    }

    @Override // p655b2.C11218b
    /* JADX INFO: renamed from: i */
    public final void mo12455i(C11219c c11219c, C11218b c11218b, boolean z6) {
        C11221e c11221e = c11218b.f33941a;
        if (c11221e == null) {
            return;
        }
        C11217a c11217a = c11218b.f33944d;
        int iM12442d = c11217a.m12442d();
        for (int i10 = 0; i10 < iM12442d; i10++) {
            C11221e c11221eM12443e = c11217a.m12443e(i10);
            float fM12444f = c11217a.m12444f(i10);
            C15384c c15384c = this.f33966i;
            c15384c.f47967Z = c11221eM12443e;
            boolean z10 = c11221eM12443e.f33967Y;
            float[] fArr = c11221e.f33974t0;
            if (z10) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((C11221e) c15384c.f47967Z).f33974t0;
                    float f10 = (fArr[i11] * fM12444f) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((C11221e) c15384c.f47967Z).f33974t0[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((C11220d) c15384c.f47968o0).m12477k((C11221e) c15384c.f47967Z);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * fM12444f;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((C11221e) c15384c.f47967Z).f33974t0[i12] = f12;
                    } else {
                        ((C11221e) c15384c.f47967Z).f33974t0[i12] = 0.0f;
                    }
                }
                m12476j(c11221eM12443e);
            }
            this.f33942b = (c11218b.f33942b * fM12444f) + this.f33942b;
        }
        m12477k(c11221e);
    }

    /* JADX INFO: renamed from: j */
    public final void m12476j(C11221e c11221e) {
        int i10;
        int i11 = this.f33965h + 1;
        C11221e[] c11221eArr = this.f33963f;
        if (i11 > c11221eArr.length) {
            C11221e[] c11221eArr2 = (C11221e[]) Arrays.copyOf(c11221eArr, c11221eArr.length * 2);
            this.f33963f = c11221eArr2;
            this.f33964g = (C11221e[]) Arrays.copyOf(c11221eArr2, c11221eArr2.length * 2);
        }
        C11221e[] c11221eArr3 = this.f33963f;
        int i12 = this.f33965h;
        c11221eArr3[i12] = c11221e;
        int i13 = i12 + 1;
        this.f33965h = i13;
        if (i13 > 1 && c11221eArr3[i12].f33968Z > c11221e.f33968Z) {
            int i14 = 0;
            while (true) {
                i10 = this.f33965h;
                if (i14 >= i10) {
                    break;
                }
                this.f33964g[i14] = this.f33963f[i14];
                i14++;
            }
            Arrays.sort(this.f33964g, 0, i10, new C0842z(11));
            for (int i15 = 0; i15 < this.f33965h; i15++) {
                this.f33963f[i15] = this.f33964g[i15];
            }
        }
        c11221e.f33967Y = true;
        c11221e.m12478a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m12477k(C11221e c11221e) {
        int i10 = 0;
        while (i10 < this.f33965h) {
            if (this.f33963f[i10] == c11221e) {
                while (true) {
                    int i11 = this.f33965h;
                    if (i10 >= i11 - 1) {
                        this.f33965h = i11 - 1;
                        c11221e.f33967Y = false;
                        return;
                    } else {
                        C11221e[] c11221eArr = this.f33963f;
                        int i12 = i10 + 1;
                        c11221eArr[i10] = c11221eArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p655b2.C11218b
    public final String toString() {
        String str = " goal -> (" + this.f33942b + ") : ";
        for (int i10 = 0; i10 < this.f33965h; i10++) {
            C11221e c11221e = this.f33963f[i10];
            C15384c c15384c = this.f33966i;
            c15384c.f47967Z = c11221e;
            str = str + c15384c + Separators.f31991SP;
        }
        return str;
    }
}
