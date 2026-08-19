package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.P2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15825P2 extends AbstractC15760C2 {

    /* JADX INFO: renamed from: d */
    private Object[] f49146d;

    /* JADX INFO: renamed from: e */
    private int f49147e;

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49146d = new Object[(int) j10];
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = 0;
        Arrays.sort(this.f49146d, 0, this.f49147e, this.f49042b);
        long j10 = this.f49147e;
        InterfaceC15963o2 interfaceC15963o2 = this.f49330a;
        interfaceC15963o2.mo17364l(j10);
        if (!this.f49043c) {
            while (i10 < this.f49147e) {
                interfaceC15963o2.accept(this.f49146d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f49147e && !interfaceC15963o2.mo17358n()) {
                interfaceC15963o2.accept(this.f49146d[i10]);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
        this.f49146d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f49146d;
        int i10 = this.f49147e;
        this.f49147e = i10 + 1;
        objArr[i10] = obj;
    }
}
