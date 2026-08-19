package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.N2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15815N2 extends AbstractC15750A2 {

    /* JADX INFO: renamed from: c */
    private int[] f49132c;

    /* JADX INFO: renamed from: d */
    private int f49133d;

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49132c = new int[(int) j10];
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = 0;
        Arrays.sort(this.f49132c, 0, this.f49133d);
        long j10 = this.f49133d;
        InterfaceC15963o2 interfaceC15963o2 = this.f49315a;
        interfaceC15963o2.mo17364l(j10);
        if (!this.f49027b) {
            while (i10 < this.f49133d) {
                interfaceC15963o2.accept(this.f49132c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f49133d && !interfaceC15963o2.mo17358n()) {
                interfaceC15963o2.accept(this.f49132c[i10]);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
        this.f49132c = null;
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        int[] iArr = this.f49132c;
        int i11 = this.f49133d;
        this.f49133d = i11 + 1;
        iArr[i11] = i10;
    }
}
