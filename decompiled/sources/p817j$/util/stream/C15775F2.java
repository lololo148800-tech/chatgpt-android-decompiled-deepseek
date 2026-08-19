package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.F2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15775F2 extends AbstractC15755B2 {

    /* JADX INFO: renamed from: c */
    private C15859W2 f49068c;

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        C15859W2 c15859w2;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            c15859w2 = new C15859W2();
        } else {
            c15859w2 = new C15859W2((int) j10);
        }
        this.f49068c = c15859w2;
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        long[] jArr = (long[]) this.f49068c.mo17398d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC15963o2 interfaceC15963o2 = this.f49325a;
        interfaceC15963o2.mo17364l(length);
        int i10 = 0;
        if (!this.f49037b) {
            int length2 = jArr.length;
            while (i10 < length2) {
                interfaceC15963o2.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length3 = jArr.length;
            while (i10 < length3) {
                long j10 = jArr[i10];
                if (interfaceC15963o2.mo17358n()) {
                    break;
                }
                interfaceC15963o2.accept(j10);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f49068c.accept(j10);
    }
}
