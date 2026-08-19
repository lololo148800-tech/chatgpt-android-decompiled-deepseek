package p817j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: j$.util.stream.b4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15887b4 extends AbstractC15921h2 {

    /* JADX INFO: renamed from: b */
    boolean f49239b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C15893c4 f49240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15887b4(C15893c4 c15893c4, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49240c = c15893c4;
        this.f49239b = true;
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49307a.mo17364l(-1L);
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        if (this.f49239b) {
            this.f49240c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d10);
            throw null;
        }
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return !this.f49239b || this.f49307a.mo17358n();
    }
}
