package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15999v2 extends AbstractC15921h2 {

    /* JADX INFO: renamed from: b */
    long f49420b;

    /* JADX INFO: renamed from: c */
    long f49421c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C16004w2 f49422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15999v2(C16004w2 c16004w2, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49422d = c16004w2;
        this.f49420b = c16004w2.f49435m;
        long j10 = c16004w2.f49436n;
        this.f49421c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49307a.mo17364l(AbstractC16012y0.m17523A(j10, this.f49422d.f49435m, this.f49421c));
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        long j10 = this.f49420b;
        if (j10 == 0) {
            long j11 = this.f49421c;
            if (j11 > 0) {
                this.f49421c = j11 - 1;
                this.f49307a.accept(d10);
                return;
            }
            return;
        }
        this.f49420b = j10 - 1;
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return this.f49421c == 0 || this.f49307a.mo17358n();
    }
}
