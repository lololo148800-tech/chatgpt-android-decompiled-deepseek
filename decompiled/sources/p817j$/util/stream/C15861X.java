package p817j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.X */
/* JADX INFO: loaded from: classes4.dex */
final class C15861X extends AbstractC15883b0 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f49202m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Object f49203n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15861X(AbstractC15882b abstractC15882b, int i10, Object obj, int i11) {
        super(abstractC15882b, i10, 1);
        this.f49202m = i11;
        this.f49203n = obj;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        switch (this.f49202m) {
            case 0:
                return new C15856W(this, interfaceC15963o2, 1);
            case 1:
                return new C15871Z(this, interfaceC15963o2);
            case 2:
                return new C15954n(this, interfaceC15963o2, 4);
            default:
                return new C15891c2(this, interfaceC15963o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15861X(AbstractC15889c0 abstractC15889c0, IntConsumer intConsumer) {
        super(abstractC15889c0, 0, 1);
        this.f49202m = 0;
        this.f49203n = intConsumer;
    }
}
