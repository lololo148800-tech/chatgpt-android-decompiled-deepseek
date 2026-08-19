package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.R0 */
/* JADX INFO: loaded from: classes4.dex */
class C15832R0 extends AbstractC15900e {

    /* JADX INFO: renamed from: h */
    protected final AbstractC15882b f49164h;

    /* JADX INFO: renamed from: i */
    protected final LongFunction f49165i;

    /* JADX INFO: renamed from: j */
    protected final BinaryOperator f49166j;

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC15900e abstractC15900e = this.f49260d;
        if (abstractC15900e != null) {
            mo17459f((InterfaceC15798K0) this.f49166j.apply((InterfaceC15798K0) ((C15832R0) abstractC15900e).mo17458c(), (InterfaceC15798K0) ((C15832R0) this.f49261e).mo17458c()));
        }
        super.onCompletion(countedCompleter);
    }

    C15832R0(AbstractC15882b abstractC15882b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC15882b, spliterator);
        this.f49164h = abstractC15882b;
        this.f49165i = longFunction;
        this.f49166j = binaryOperator;
    }

    C15832R0(C15832R0 c15832r0, Spliterator spliterator) {
        super(c15832r0, spliterator);
        this.f49164h = c15832r0.f49164h;
        this.f49165i = c15832r0.f49165i;
        this.f49166j = c15832r0.f49166j;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C15832R0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC15798K0 mo17410a() {
        InterfaceC15758C0 interfaceC15758C0 = (InterfaceC15758C0) this.f49165i.apply(this.f49164h.m17447F(this.f49258b));
        this.f49164h.m17453U(this.f49258b, interfaceC15758C0);
        return interfaceC15758C0.mo17356a();
    }
}
