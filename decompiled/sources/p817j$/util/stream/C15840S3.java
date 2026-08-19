package p817j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.S3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15840S3 extends AbstractC15927i2 {

    /* JADX INFO: renamed from: b */
    boolean f49182b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C15845T3 f49183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15840S3(C15845T3 c15845t3, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49183c = c15845t3;
        this.f49182b = true;
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49315a.mo17364l(-1L);
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        if (this.f49182b) {
            this.f49183c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i10);
            throw null;
        }
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return !this.f49182b || this.f49315a.mo17358n();
    }
}
