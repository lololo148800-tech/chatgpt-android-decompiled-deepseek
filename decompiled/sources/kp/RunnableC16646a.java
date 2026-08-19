package kp;

/* JADX INFO: renamed from: kp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC16646a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53332Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f53333Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f53334o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f53335p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float[] f53336q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float[] f53337r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f53338s0;

    public /* synthetic */ RunnableC16646a(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        this.f53332Y = i14;
        this.f53333Z = i10;
        this.f53334o0 = i11;
        this.f53335p0 = i12;
        this.f53336q0 = fArr;
        this.f53337r0 = fArr2;
        this.f53338s0 = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53332Y) {
            case 0:
                int i10 = this.f53333Z;
                int i11 = this.f53334o0;
                int i12 = i10 + i11;
                int i13 = this.f53335p0;
                while (i13 > 512) {
                    int i14 = i13 >> 2;
                    AbstractC16648c.m18483t(this.f53336q0, i14, this.f53337r0, i12 - i14, this.f53338s0 - (i13 >> 3));
                    i13 = i14;
                }
                int i15 = i13;
                AbstractC16648c.m18480q(i15, 1, this.f53336q0, i12 - i13, this.f53338s0, this.f53337r0);
                int i16 = i10 - i13;
                int i17 = 0;
                for (int i18 = i11 - i13; i18 > 0; i18 -= i13) {
                    i17++;
                    int i19 = this.f53338s0;
                    float[] fArr = this.f53337r0;
                    float[] fArr2 = this.f53336q0;
                    int i20 = i13;
                    int i21 = this.f53338s0;
                    float[] fArr3 = this.f53337r0;
                    AbstractC16648c.m18480q(i20, AbstractC16648c.m18455A(i20, i18, i17, this.f53333Z, i19, fArr2, fArr), this.f53336q0, i16 + i18, i21, fArr3);
                }
                break;
            default:
                int i22 = this.f53333Z;
                int i23 = this.f53334o0;
                int i24 = i22 + i23;
                int i25 = this.f53335p0;
                int i26 = 1;
                while (i25 > 512) {
                    i25 >>= 2;
                    i26 <<= 2;
                    AbstractC16648c.m18485v(this.f53336q0, i25, this.f53337r0, i24 - i25, this.f53338s0 - i25);
                }
                int i27 = i25;
                AbstractC16648c.m18480q(i27, 0, this.f53336q0, i24 - i25, this.f53338s0, this.f53337r0);
                int i28 = i26 >> 1;
                int i29 = i22 - i25;
                while (true) {
                    i23 -= i25;
                    if (i23 > 0) {
                        i28++;
                        int i30 = this.f53338s0;
                        float[] fArr4 = this.f53337r0;
                        float[] fArr5 = this.f53336q0;
                        int i31 = i25;
                        AbstractC16648c.m18480q(i31, AbstractC16648c.m18455A(i31, i23, i28, this.f53333Z, i30, fArr5, fArr4), this.f53336q0, i29 + i23, this.f53338s0, this.f53337r0);
                    }
                    break;
                }
                break;
        }
    }
}
