package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.b2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15885b2 extends AbstractC15900e {

    /* JADX INFO: renamed from: h */
    private final AbstractC16012y0 f49238h;

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC15900e abstractC15900e = this.f49260d;
        if (abstractC15900e != null) {
            InterfaceC15848U1 interfaceC15848U1 = (InterfaceC15848U1) ((C15885b2) abstractC15900e).mo17458c();
            interfaceC15848U1.mo17361g((InterfaceC15848U1) ((C15885b2) this.f49261e).mo17458c());
            mo17459f(interfaceC15848U1);
        }
        super.onCompletion(countedCompleter);
    }

    C15885b2(AbstractC16012y0 abstractC16012y0, AbstractC15882b abstractC15882b, Spliterator spliterator) {
        super(abstractC15882b, spliterator);
        this.f49238h = abstractC16012y0;
    }

    C15885b2(C15885b2 c15885b2, Spliterator spliterator) {
        super(c15885b2, spliterator);
        this.f49238h = c15885b2.f49238h;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected final AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C15885b2(this, spliterator);
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: a */
    protected final Object mo17410a() {
        AbstractC15882b abstractC15882b = this.f49257a;
        InterfaceC15848U1 interfaceC15848U1Mo17357e0 = this.f49238h.mo17357e0();
        abstractC15882b.m17453U(this.f49258b, interfaceC15848U1Mo17357e0);
        return interfaceC15848U1Mo17357e0;
    }
}
