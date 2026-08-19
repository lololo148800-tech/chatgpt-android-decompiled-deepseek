package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15989t2 extends AbstractC15933j2 {

    /* JADX INFO: renamed from: b */
    long f49404b;

    /* JADX INFO: renamed from: c */
    long f49405c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15994u2 f49406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15989t2(C15994u2 c15994u2, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49406d = c15994u2;
        this.f49404b = c15994u2.f49413m;
        long j10 = c15994u2.f49414n;
        this.f49405c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49325a.mo17364l(AbstractC16012y0.m17523A(j10, this.f49406d.f49413m, this.f49405c));
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        long j11 = this.f49404b;
        if (j11 == 0) {
            long j12 = this.f49405c;
            if (j12 > 0) {
                this.f49405c = j12 - 1;
                this.f49325a.accept(j10);
                return;
            }
            return;
        }
        this.f49404b = j11 - 1;
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return this.f49405c == 0 || this.f49325a.mo17358n();
    }
}
