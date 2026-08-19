package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.E2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15770E2 extends AbstractC15750A2 {

    /* JADX INFO: renamed from: c */
    private C15849U2 f49062c;

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        C15849U2 c15849u2;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            c15849u2 = new C15849U2();
        } else {
            c15849u2 = new C15849U2((int) j10);
        }
        this.f49062c = c15849u2;
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int[] iArr = (int[]) this.f49062c.mo17398d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC15963o2 interfaceC15963o2 = this.f49315a;
        interfaceC15963o2.mo17364l(length);
        int i10 = 0;
        if (!this.f49027b) {
            int length2 = iArr.length;
            while (i10 < length2) {
                interfaceC15963o2.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length3 = iArr.length;
            while (i10 < length3) {
                int i11 = iArr[i10];
                if (interfaceC15963o2.mo17358n()) {
                    break;
                }
                interfaceC15963o2.accept(i11);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        this.f49062c.accept(i10);
    }
}
