package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.M2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15810M2 extends AbstractC16019z2 {

    /* JADX INFO: renamed from: c */
    private double[] f49124c;

    /* JADX INFO: renamed from: d */
    private int f49125d;

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49124c = new double[(int) j10];
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = 0;
        Arrays.sort(this.f49124c, 0, this.f49125d);
        long j10 = this.f49125d;
        InterfaceC15963o2 interfaceC15963o2 = this.f49307a;
        interfaceC15963o2.mo17364l(j10);
        if (!this.f49458b) {
            while (i10 < this.f49125d) {
                interfaceC15963o2.accept(this.f49124c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f49125d && !interfaceC15963o2.mo17358n()) {
                interfaceC15963o2.accept(this.f49124c[i10]);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
        this.f49124c = null;
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        double[] dArr = this.f49124c;
        int i10 = this.f49125d;
        this.f49125d = i10 + 1;
        dArr[i10] = d10;
    }
}
