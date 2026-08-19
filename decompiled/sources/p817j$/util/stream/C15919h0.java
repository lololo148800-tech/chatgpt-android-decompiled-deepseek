package p817j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.h0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15919h0 extends AbstractC15931j0 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f49305m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Object f49306n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15919h0(AbstractC15882b abstractC15882b, int i10, Object obj, int i11) {
        super(abstractC15882b, i10, 1);
        this.f49305m = i11;
        this.f49306n = obj;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        switch (this.f49305m) {
            case 0:
                return new C15913g0(this, interfaceC15963o2);
            case 1:
                return new C15901e0(this, interfaceC15963o2, 5);
            case 2:
                return new C15891c2(this, interfaceC15963o2);
            default:
                return new C15954n(this, interfaceC15963o2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15919h0(AbstractC15937k0 abstractC15937k0, LongConsumer longConsumer) {
        super(abstractC15937k0, 0, 1);
        this.f49305m = 1;
        this.f49306n = longConsumer;
    }
}
