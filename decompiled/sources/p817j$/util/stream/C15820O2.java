package p817j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.O2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15820O2 extends AbstractC15755B2 {

    /* JADX INFO: renamed from: c */
    private long[] f49139c;

    /* JADX INFO: renamed from: d */
    private int f49140d;

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49139c = new long[(int) j10];
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = 0;
        Arrays.sort(this.f49139c, 0, this.f49140d);
        long j10 = this.f49140d;
        InterfaceC15963o2 interfaceC15963o2 = this.f49325a;
        interfaceC15963o2.mo17364l(j10);
        if (!this.f49037b) {
            while (i10 < this.f49140d) {
                interfaceC15963o2.accept(this.f49139c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f49140d && !interfaceC15963o2.mo17358n()) {
                interfaceC15963o2.accept(this.f49139c[i10]);
                i10++;
            }
        }
        interfaceC15963o2.mo17363k();
        this.f49139c = null;
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        long[] jArr = this.f49139c;
        int i10 = this.f49140d;
        this.f49140d = i10 + 1;
        jArr[i10] = j10;
    }
}
