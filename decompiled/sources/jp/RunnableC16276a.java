package jp;

/* JADX INFO: renamed from: jp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC16276a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50405Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f50406Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f50407o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float[] f50408p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float[] f50409q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16279d f50410r0;

    public RunnableC16276a(C16279d c16279d, int i10, int i11, int i12, float[] fArr, float[] fArr2) {
        this.f50410r0 = c16279d;
        this.f50405Y = i10;
        this.f50406Z = i11;
        this.f50407o0 = i12;
        this.f50408p0 = fArr;
        this.f50409q0 = fArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = this.f50405Y; i10 < this.f50406Z; i10++) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            int i13 = this.f50407o0 + i10;
            float[] fArr = this.f50409q0;
            float f10 = fArr[i13];
            float[] fArr2 = this.f50410r0.f50439q;
            float f11 = f10 * fArr2[i11];
            float[] fArr3 = this.f50408p0;
            fArr3[i11] = f11;
            fArr3[i12] = (-fArr[i13]) * fArr2[i12];
        }
    }
}
