package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.r2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15979r2 extends AbstractC15927i2 {

    /* JADX INFO: renamed from: b */
    long f49391b;

    /* JADX INFO: renamed from: c */
    long f49392c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15984s2 f49393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15979r2(C15984s2 c15984s2, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49393d = c15984s2;
        this.f49391b = c15984s2.f49399m;
        long j10 = c15984s2.f49400n;
        this.f49392c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49315a.mo17364l(AbstractC16012y0.m17523A(j10, this.f49393d.f49399m, this.f49392c));
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        long j10 = this.f49391b;
        if (j10 == 0) {
            long j11 = this.f49392c;
            if (j11 > 0) {
                this.f49392c = j11 - 1;
                this.f49315a.accept(i10);
                return;
            }
            return;
        }
        this.f49391b = j10 - 1;
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return this.f49392c == 0 || this.f49315a.mo17358n();
    }
}
