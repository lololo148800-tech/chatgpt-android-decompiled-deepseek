package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.i4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15929i4 extends AbstractC15888c {

    /* JADX INFO: renamed from: j */
    private final AbstractC15882b f49317j;

    /* JADX INFO: renamed from: k */
    private final IntFunction f49318k;

    /* JADX INFO: renamed from: l */
    private final boolean f49319l;

    /* JADX INFO: renamed from: m */
    private long f49320m;

    /* JADX INFO: renamed from: n */
    private boolean f49321n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f49322o;

    @Override // p817j$.util.stream.AbstractC15888c
    /* JADX INFO: renamed from: h */
    protected final void mo17460h() {
        this.f49242i = true;
        if (this.f49319l && this.f49322o) {
            mo17459f(AbstractC16012y0.m17534L(this.f49317j.mo17344H()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C15929i4 c15929i4;
        C15929i4 c15929i5;
        Object objM17531I;
        AbstractC15900e abstractC15900e = this.f49260d;
        if (abstractC15900e != null) {
            this.f49321n = ((C15929i4) abstractC15900e).f49321n | ((C15929i4) this.f49261e).f49321n;
            if (this.f49319l && this.f49242i) {
                this.f49320m = 0L;
                objM17531I = AbstractC16012y0.m17534L(this.f49317j.mo17344H());
            } else if (this.f49319l) {
                C15929i4 c15929i6 = (C15929i4) this.f49260d;
                if (c15929i6.f49321n) {
                    this.f49320m = c15929i6.f49320m;
                    objM17531I = (InterfaceC15798K0) c15929i6.mo17458c();
                } else {
                    c15929i4 = (C15929i4) this.f49260d;
                    long j10 = c15929i4.f49320m;
                    c15929i5 = (C15929i4) this.f49261e;
                    this.f49320m = j10 + c15929i5.f49320m;
                    if (c15929i4.f49320m == 0) {
                        objM17531I = (InterfaceC15798K0) c15929i5.mo17458c();
                    } else if (c15929i5.f49320m == 0) {
                        objM17531I = (InterfaceC15798K0) c15929i4.mo17458c();
                    } else {
                        objM17531I = AbstractC16012y0.m17531I(this.f49317j.mo17344H(), (InterfaceC15798K0) ((C15929i4) this.f49260d).mo17458c(), (InterfaceC15798K0) ((C15929i4) this.f49261e).mo17458c());
                    }
                }
            } else {
                c15929i4 = (C15929i4) this.f49260d;
                long j11 = c15929i4.f49320m;
                c15929i5 = (C15929i4) this.f49261e;
                this.f49320m = j11 + c15929i5.f49320m;
                if (c15929i4.f49320m == 0) {
                    objM17531I = (InterfaceC15798K0) c15929i5.mo17458c();
                } else if (c15929i5.f49320m == 0) {
                    objM17531I = (InterfaceC15798K0) c15929i4.mo17458c();
                } else {
                    objM17531I = AbstractC16012y0.m17531I(this.f49317j.mo17344H(), (InterfaceC15798K0) ((C15929i4) this.f49260d).mo17458c(), (InterfaceC15798K0) ((C15929i4) this.f49261e).mo17458c());
                }
            }
            mo17459f(objM17531I);
        }
        this.f49322o = true;
        super.onCompletion(countedCompleter);
    }

    C15929i4(AbstractC15882b abstractC15882b, AbstractC15882b abstractC15882b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC15882b2, spliterator);
        this.f49317j = abstractC15882b;
        this.f49318k = intFunction;
        this.f49319l = EnumC15904e3.ORDERED.m17475r(abstractC15882b2.m17449J());
    }

    C15929i4(C15929i4 c15929i4, Spliterator spliterator) {
        super(c15929i4, spliterator);
        this.f49317j = c15929i4.f49317j;
        this.f49318k = c15929i4.f49318k;
        this.f49319l = c15929i4.f49319l;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected final AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C15929i4(this, spliterator);
    }

    @Override // p817j$.util.stream.AbstractC15888c
    /* JADX INFO: renamed from: j */
    protected final Object mo17412j() {
        return AbstractC16012y0.m17534L(this.f49317j.mo17344H());
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: a */
    protected final Object mo17410a() {
        InterfaceC15758C0 interfaceC15758C0Mo17345M = this.f49257a.mo17345M(-1L, this.f49318k);
        InterfaceC15963o2 interfaceC15963o2Mo17378Q = this.f49317j.mo17378Q(this.f49257a.m17449J(), interfaceC15758C0Mo17345M);
        AbstractC15882b abstractC15882b = this.f49257a;
        boolean zM17443A = abstractC15882b.m17443A(this.f49258b, abstractC15882b.m17454V(interfaceC15963o2Mo17378Q));
        this.f49321n = zM17443A;
        if (zM17443A) {
            m17461i();
        }
        InterfaceC15798K0 interfaceC15798K0Mo17356a = interfaceC15758C0Mo17345M.mo17356a();
        this.f49320m = interfaceC15798K0Mo17356a.count();
        return interfaceC15798K0Mo17356a;
    }
}
