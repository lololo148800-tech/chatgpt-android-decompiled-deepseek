package p817j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.t */
/* JADX INFO: loaded from: classes4.dex */
final class C15986t extends AbstractC16016z {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f49401m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Object f49402n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15986t(AbstractC15882b abstractC15882b, int i10, Object obj, int i11) {
        super(abstractC15882b, i10, 1);
        this.f49401m = i11;
        this.f49402n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15986t(AbstractC15747A abstractC15747A, DoubleConsumer doubleConsumer) {
        super(abstractC15747A, 0, 1);
        this.f49401m = 2;
        this.f49402n = doubleConsumer;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        switch (this.f49401m) {
            case 0:
                return new C15976r(this, interfaceC15963o2, 1);
            case 1:
                return new C16001w(this, interfaceC15963o2);
            case 2:
                return new C15976r(this, interfaceC15963o2, 5);
            case 3:
                return new C15954n(this, interfaceC15963o2, 6);
            default:
                return new C15891c2(this, interfaceC15963o2);
        }
    }
}
