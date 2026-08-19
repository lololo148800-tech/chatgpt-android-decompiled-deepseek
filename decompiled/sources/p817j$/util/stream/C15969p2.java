package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.p2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15969p2 extends AbstractC15939k2 {

    /* JADX INFO: renamed from: b */
    long f49378b;

    /* JADX INFO: renamed from: c */
    long f49379c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15974q2 f49380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15969p2(C15974q2 c15974q2, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49380d = c15974q2;
        this.f49378b = c15974q2.f49387m;
        long j10 = c15974q2.f49388n;
        this.f49379c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49330a.mo17364l(AbstractC16012y0.m17523A(j10, this.f49380d.f49387m, this.f49379c));
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) {
        long j10 = this.f49378b;
        if (j10 == 0) {
            long j11 = this.f49379c;
            if (j11 > 0) {
                this.f49379c = j11 - 1;
                this.f49330a.m17405p(obj);
                return;
            }
            return;
        }
        this.f49378b = j10 - 1;
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return this.f49379c == 0 || this.f49330a.mo17358n();
    }
}
