package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.D2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15765D2 extends AbstractC16019z2 {

    /* JADX INFO: renamed from: c */
    private C15839S2 f49052c;

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        C15839S2 c15839s2;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            c15839s2 = new C15839S2();
        } else {
            c15839s2 = new C15839S2((int) j10);
        }
        this.f49052c = c15839s2;
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        double[] dArr = (double[]) this.f49052c.mo17398d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC15963o2 interfaceC15963o2 = this.f49307a;
        interfaceC15963o2.mo17364l(length);
        int i10 = 0;
        if (!this.f49458b) {
            int length2 = dArr.length;
            while (i10 < length2) {
                interfaceC15963o2.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length3 = dArr.length;
            while (i10 < length3) {
                double d10 = dArr[i10];
                if (interfaceC15963o2.mo17358n()) {
                    break;
                }
                interfaceC15963o2.accept(d10);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        this.f49052c.accept(d10);
    }
}
