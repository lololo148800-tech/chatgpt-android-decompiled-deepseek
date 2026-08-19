package p817j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.s */
/* JADX INFO: loaded from: classes4.dex */
final class C15981s extends AbstractC15909f2 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f49396m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Object f49397n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15981s(AbstractC15882b abstractC15882b, int i10, Object obj, int i11) {
        super(abstractC15882b, i10, 1);
        this.f49396m = i11;
        this.f49397n = obj;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        switch (this.f49396m) {
            case 0:
                return new C15976r(this, interfaceC15963o2, 0);
            case 1:
                return new C15856W(this, interfaceC15963o2, 0);
            case 2:
                return new C15901e0(this, interfaceC15963o2, 0);
            case 3:
                return new C15954n(this, interfaceC15963o2, 1);
            case 4:
                return new C15954n(this, interfaceC15963o2, 2);
            case 5:
                return new C15954n(this, interfaceC15963o2, 3);
            default:
                return new C15948m(this, interfaceC15963o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15981s(AbstractC15915g2 abstractC15915g2, Consumer consumer) {
        super(abstractC15915g2, 0, 1);
        this.f49396m = 3;
        this.f49397n = consumer;
    }
}
