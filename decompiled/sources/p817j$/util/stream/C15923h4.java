package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.h4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15923h4 extends AbstractC15900e {

    /* JADX INFO: renamed from: h */
    private final AbstractC15882b f49309h;

    /* JADX INFO: renamed from: i */
    private final IntFunction f49310i;

    /* JADX INFO: renamed from: j */
    private final boolean f49311j;

    /* JADX INFO: renamed from: k */
    private long f49312k;

    /* JADX INFO: renamed from: l */
    private long f49313l;

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC15798K0 interfaceC15798K0M17531I;
        AbstractC15900e abstractC15900e = this.f49260d;
        if (abstractC15900e != null) {
            if (this.f49311j) {
                C15923h4 c15923h4 = (C15923h4) abstractC15900e;
                long j10 = c15923h4.f49313l;
                this.f49313l = j10;
                if (j10 == c15923h4.f49312k) {
                    this.f49313l = j10 + ((C15923h4) this.f49261e).f49313l;
                }
            }
            C15923h4 c15923h5 = (C15923h4) abstractC15900e;
            long j11 = c15923h5.f49312k;
            C15923h4 c15923h6 = (C15923h4) this.f49261e;
            this.f49312k = j11 + c15923h6.f49312k;
            if (c15923h5.f49312k == 0) {
                interfaceC15798K0M17531I = (InterfaceC15798K0) c15923h6.mo17458c();
            } else if (c15923h6.f49312k == 0) {
                interfaceC15798K0M17531I = (InterfaceC15798K0) c15923h5.mo17458c();
            } else {
                interfaceC15798K0M17531I = AbstractC16012y0.m17531I(this.f49309h.mo17344H(), (InterfaceC15798K0) ((C15923h4) this.f49260d).mo17458c(), (InterfaceC15798K0) ((C15923h4) this.f49261e).mo17458c());
            }
            InterfaceC15798K0 interfaceC15798K0Mo17406h = interfaceC15798K0M17531I;
            if (m17467d() && this.f49311j) {
                interfaceC15798K0Mo17406h = interfaceC15798K0Mo17406h.mo17406h(this.f49313l, interfaceC15798K0Mo17406h.count(), this.f49310i);
            }
            mo17459f(interfaceC15798K0Mo17406h);
        }
        super.onCompletion(countedCompleter);
    }

    C15923h4(AbstractC15882b abstractC15882b, AbstractC15882b abstractC15882b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC15882b2, spliterator);
        this.f49309h = abstractC15882b;
        this.f49310i = intFunction;
        this.f49311j = EnumC15904e3.ORDERED.m17475r(abstractC15882b2.m17449J());
    }

    C15923h4(C15923h4 c15923h4, Spliterator spliterator) {
        super(c15923h4, spliterator);
        this.f49309h = c15923h4.f49309h;
        this.f49310i = c15923h4.f49310i;
        this.f49311j = c15923h4.f49311j;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected final AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C15923h4(this, spliterator);
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: a */
    protected final Object mo17410a() {
        boolean zM17467d = m17467d();
        InterfaceC15758C0 interfaceC15758C0Mo17345M = this.f49257a.mo17345M((!zM17467d && this.f49311j && EnumC15904e3.SIZED.m17476u(this.f49309h.f49228c)) ? this.f49309h.m17447F(this.f49258b) : -1L, this.f49310i);
        InterfaceC15917g4 interfaceC15917g4Mo17422j = ((InterfaceC15911f4) this.f49309h).mo17422j(interfaceC15758C0Mo17345M, this.f49311j && !zM17467d);
        this.f49257a.m17453U(this.f49258b, interfaceC15917g4Mo17422j);
        InterfaceC15798K0 interfaceC15798K0Mo17356a = interfaceC15758C0Mo17345M.mo17356a();
        this.f49312k = interfaceC15798K0Mo17356a.count();
        this.f49313l = interfaceC15917g4Mo17422j.mo17417f();
        return interfaceC15798K0Mo17356a;
    }
}
