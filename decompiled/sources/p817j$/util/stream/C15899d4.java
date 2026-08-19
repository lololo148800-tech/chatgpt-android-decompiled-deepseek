package p817j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: j$.util.stream.d4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15899d4 extends AbstractC15921h2 implements InterfaceC15917g4 {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C15905e4 f49255b;

    @Override // p817j$.util.stream.InterfaceC15917g4
    /* JADX INFO: renamed from: f */
    public final long mo17417f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15899d4(C15905e4 c15905e4, InterfaceC15963o2 interfaceC15963o2, boolean z6) {
        super(interfaceC15963o2);
        this.f49255b = c15905e4;
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        this.f49255b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d10);
        throw null;
    }
}
