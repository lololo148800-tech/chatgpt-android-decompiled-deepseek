package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.y2 */
/* JADX INFO: loaded from: classes4.dex */
final class C16014y2 extends AbstractC15888c {

    /* JADX INFO: renamed from: j */
    private final AbstractC15882b f49447j;

    /* JADX INFO: renamed from: k */
    private final IntFunction f49448k;

    /* JADX INFO: renamed from: l */
    private final long f49449l;

    /* JADX INFO: renamed from: m */
    private final long f49450m;

    /* JADX INFO: renamed from: n */
    private long f49451n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f49452o;

    @Override // p817j$.util.stream.AbstractC15888c
    /* JADX INFO: renamed from: h */
    protected final void mo17460h() {
        this.f49242i = true;
        if (this.f49452o) {
            mo17459f(AbstractC16012y0.m17534L(this.f49447j.mo17344H()));
        }
    }

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C16014y2 c16014y2;
        InterfaceC15798K0 interfaceC15798K0M17531I;
        AbstractC15900e abstractC15900e = this.f49260d;
        if (!(abstractC15900e == null)) {
            this.f49451n = ((C16014y2) abstractC15900e).f49451n + ((C16014y2) this.f49261e).f49451n;
            if (this.f49242i) {
                this.f49451n = 0L;
                interfaceC15798K0M17531I = AbstractC16012y0.m17534L(this.f49447j.mo17344H());
            } else if (this.f49451n == 0) {
                interfaceC15798K0M17531I = AbstractC16012y0.m17534L(this.f49447j.mo17344H());
            } else {
                interfaceC15798K0M17531I = ((C16014y2) this.f49260d).f49451n == 0 ? (InterfaceC15798K0) ((C16014y2) this.f49261e).mo17458c() : AbstractC16012y0.m17531I(this.f49447j.mo17344H(), (InterfaceC15798K0) ((C16014y2) this.f49260d).mo17458c(), (InterfaceC15798K0) ((C16014y2) this.f49261e).mo17458c());
            }
            InterfaceC15798K0 interfaceC15798K0Mo17406h = interfaceC15798K0M17531I;
            if (m17467d()) {
                interfaceC15798K0Mo17406h = interfaceC15798K0Mo17406h.mo17406h(this.f49449l, this.f49450m >= 0 ? Math.min(interfaceC15798K0Mo17406h.count(), this.f49449l + this.f49450m) : this.f49451n, this.f49448k);
            }
            mo17459f(interfaceC15798K0Mo17406h);
            this.f49452o = true;
        }
        if (this.f49450m >= 0 && !m17467d()) {
            long j10 = this.f49449l + this.f49450m;
            long jM17577k = this.f49452o ? this.f49451n : m17577k(j10);
            if (jM17577k >= j10) {
                m17461i();
            } else {
                C16014y2 c16014y3 = (C16014y2) ((AbstractC15900e) getCompleter());
                Object obj = this;
                while (true) {
                    if (c16014y3 == null) {
                        if (jM17577k >= j10) {
                            break;
                        }
                    } else {
                        if (obj == c16014y3.f49261e && (c16014y2 = (C16014y2) c16014y3.f49260d) != null) {
                            jM17577k += c16014y2.m17577k(j10);
                            if (jM17577k >= j10) {
                                break;
                            }
                        }
                        obj = c16014y3;
                        c16014y3 = (C16014y2) ((AbstractC15900e) c16014y3.getCompleter());
                    }
                }
                m17461i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    C16014y2(AbstractC15882b abstractC15882b, AbstractC15882b abstractC15882b2, Spliterator spliterator, IntFunction intFunction, long j10, long j11) {
        super(abstractC15882b2, spliterator);
        this.f49447j = abstractC15882b;
        this.f49448k = intFunction;
        this.f49449l = j10;
        this.f49450m = j11;
    }

    C16014y2(C16014y2 c16014y2, Spliterator spliterator) {
        super(c16014y2, spliterator);
        this.f49447j = c16014y2.f49447j;
        this.f49448k = c16014y2.f49448k;
        this.f49449l = c16014y2.f49449l;
        this.f49450m = c16014y2.f49450m;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected final AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C16014y2(this, spliterator);
    }

    @Override // p817j$.util.stream.AbstractC15888c
    /* JADX INFO: renamed from: j */
    protected final Object mo17412j() {
        return AbstractC16012y0.m17534L(this.f49447j.mo17344H());
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: a */
    protected final Object mo17410a() {
        if (m17467d()) {
            InterfaceC15758C0 interfaceC15758C0Mo17345M = this.f49447j.mo17345M(EnumC15904e3.SIZED.m17476u(this.f49447j.f49228c) ? this.f49447j.m17447F(this.f49258b) : -1L, this.f49448k);
            InterfaceC15963o2 interfaceC15963o2Mo17378Q = this.f49447j.mo17378Q(this.f49257a.m17449J(), interfaceC15758C0Mo17345M);
            AbstractC15882b abstractC15882b = this.f49257a;
            abstractC15882b.m17443A(this.f49258b, abstractC15882b.m17454V(interfaceC15963o2Mo17378Q));
            return interfaceC15758C0Mo17345M.mo17356a();
        }
        InterfaceC15758C0 interfaceC15758C0Mo17345M2 = this.f49447j.mo17345M(-1L, this.f49448k);
        if (this.f49449l == 0) {
            InterfaceC15963o2 interfaceC15963o2Mo17378Q2 = this.f49447j.mo17378Q(this.f49257a.m17449J(), interfaceC15758C0Mo17345M2);
            AbstractC15882b abstractC15882b2 = this.f49257a;
            abstractC15882b2.m17443A(this.f49258b, abstractC15882b2.m17454V(interfaceC15963o2Mo17378Q2));
        } else {
            this.f49257a.m17453U(this.f49258b, interfaceC15758C0Mo17345M2);
        }
        InterfaceC15798K0 interfaceC15798K0Mo17356a = interfaceC15758C0Mo17345M2.mo17356a();
        this.f49451n = interfaceC15798K0Mo17356a.count();
        this.f49452o = true;
        this.f49258b = null;
        return interfaceC15798K0Mo17356a;
    }

    /* JADX INFO: renamed from: k */
    private long m17577k(long j10) {
        if (this.f49452o) {
            return this.f49451n;
        }
        C16014y2 c16014y2 = (C16014y2) this.f49260d;
        C16014y2 c16014y3 = (C16014y2) this.f49261e;
        if (c16014y2 == null || c16014y3 == null) {
            return this.f49451n;
        }
        long jM17577k = c16014y2.m17577k(j10);
        return jM17577k >= j10 ? jM17577k : jM17577k + c16014y3.m17577k(j10);
    }
}
