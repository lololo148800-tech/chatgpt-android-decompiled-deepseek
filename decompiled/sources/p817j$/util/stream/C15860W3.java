package p817j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.stream.W3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15860W3 extends AbstractC15933j2 {

    /* JADX INFO: renamed from: b */
    boolean f49200b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C15865X3 f49201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15860W3(C15865X3 c15865x3, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49201c = c15865x3;
        this.f49200b = true;
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49325a.mo17364l(-1L);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        if (this.f49200b) {
            this.f49201c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j10);
            throw null;
        }
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return !this.f49200b || this.f49325a.mo17358n();
    }
}
