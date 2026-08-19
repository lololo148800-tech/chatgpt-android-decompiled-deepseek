package p655b2;

import java.util.Arrays;

/* JADX INFO: renamed from: b2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11221e implements Comparable {

    /* JADX INFO: renamed from: Y */
    public boolean f33967Y;

    /* JADX INFO: renamed from: q0 */
    public float f33971q0;

    /* JADX INFO: renamed from: x0 */
    public int f33978x0;

    /* JADX INFO: renamed from: Z */
    public int f33968Z = -1;

    /* JADX INFO: renamed from: o0 */
    public int f33969o0 = -1;

    /* JADX INFO: renamed from: p0 */
    public int f33970p0 = 0;

    /* JADX INFO: renamed from: r0 */
    public boolean f33972r0 = false;

    /* JADX INFO: renamed from: s0 */
    public final float[] f33973s0 = new float[9];

    /* JADX INFO: renamed from: t0 */
    public final float[] f33974t0 = new float[9];

    /* JADX INFO: renamed from: u0 */
    public C11218b[] f33975u0 = new C11218b[16];

    /* JADX INFO: renamed from: v0 */
    public int f33976v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public int f33977w0 = 0;

    public C11221e(int i10) {
        this.f33978x0 = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m12478a(C11218b c11218b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f33976v0;
            if (i10 >= i11) {
                C11218b[] c11218bArr = this.f33975u0;
                if (i11 >= c11218bArr.length) {
                    this.f33975u0 = (C11218b[]) Arrays.copyOf(c11218bArr, c11218bArr.length * 2);
                }
                C11218b[] c11218bArr2 = this.f33975u0;
                int i12 = this.f33976v0;
                c11218bArr2[i12] = c11218b;
                this.f33976v0 = i12 + 1;
                return;
            }
            if (this.f33975u0[i10] == c11218b) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12479b(C11218b c11218b) {
        int i10 = this.f33976v0;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f33975u0[i11] == c11218b) {
                while (i11 < i10 - 1) {
                    C11218b[] c11218bArr = this.f33975u0;
                    int i12 = i11 + 1;
                    c11218bArr[i11] = c11218bArr[i12];
                    i11 = i12;
                }
                this.f33976v0--;
                return;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12480c() {
        this.f33978x0 = 5;
        this.f33970p0 = 0;
        this.f33968Z = -1;
        this.f33969o0 = -1;
        this.f33971q0 = 0.0f;
        this.f33972r0 = false;
        int i10 = this.f33976v0;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f33975u0[i11] = null;
        }
        this.f33976v0 = 0;
        this.f33977w0 = 0;
        this.f33967Y = false;
        Arrays.fill(this.f33974t0, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33968Z - ((C11221e) obj).f33968Z;
    }

    /* JADX INFO: renamed from: d */
    public final void m12481d(C11219c c11219c, float f10) {
        this.f33971q0 = f10;
        this.f33972r0 = true;
        int i10 = this.f33976v0;
        this.f33969o0 = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f33975u0[i11].m12454h(c11219c, this, false);
        }
        this.f33976v0 = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m12482e(C11219c c11219c, C11218b c11218b) {
        int i10 = this.f33976v0;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f33975u0[i11].mo12455i(c11219c, c11218b, false);
        }
        this.f33976v0 = 0;
    }

    public final String toString() {
        return "" + this.f33968Z;
    }
}
