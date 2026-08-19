package p817j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Supplier;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.b */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15882b implements InterfaceC15918h {

    /* JADX INFO: renamed from: a */
    private final AbstractC15882b f49226a;

    /* JADX INFO: renamed from: b */
    private final AbstractC15882b f49227b;

    /* JADX INFO: renamed from: c */
    protected final int f49228c;

    /* JADX INFO: renamed from: d */
    private AbstractC15882b f49229d;

    /* JADX INFO: renamed from: e */
    private int f49230e;

    /* JADX INFO: renamed from: f */
    private int f49231f;

    /* JADX INFO: renamed from: g */
    private Spliterator f49232g;

    /* JADX INFO: renamed from: h */
    private boolean f49233h;

    /* JADX INFO: renamed from: i */
    private boolean f49234i;

    /* JADX INFO: renamed from: j */
    private Runnable f49235j;

    /* JADX INFO: renamed from: k */
    private boolean f49236k;

    /* JADX INFO: renamed from: E */
    abstract InterfaceC15798K0 mo17342E(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6, IntFunction intFunction);

    /* JADX INFO: renamed from: G */
    abstract boolean mo17343G(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2);

    /* JADX INFO: renamed from: H */
    abstract EnumC15910f3 mo17344H();

    /* JADX INFO: renamed from: M */
    abstract InterfaceC15758C0 mo17345M(long j10, IntFunction intFunction);

    /* JADX INFO: renamed from: P */
    abstract boolean mo17440P();

    /* JADX INFO: renamed from: Q */
    abstract InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2);

    /* JADX INFO: renamed from: T */
    abstract Spliterator mo17346T(AbstractC15882b abstractC15882b, Supplier supplier, boolean z6);

    AbstractC15882b(Spliterator spliterator, int i10, boolean z6) {
        this.f49227b = null;
        this.f49232g = spliterator;
        this.f49226a = this;
        int i11 = EnumC15904e3.f49266g & i10;
        this.f49228c = i11;
        this.f49231f = (~(i11 << 1)) & EnumC15904e3.f49271l;
        this.f49230e = 0;
        this.f49236k = z6;
    }

    AbstractC15882b(AbstractC15882b abstractC15882b, int i10) {
        if (abstractC15882b.f49233h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC15882b.f49233h = true;
        abstractC15882b.f49229d = this;
        this.f49227b = abstractC15882b;
        this.f49228c = EnumC15904e3.f49267h & i10;
        this.f49231f = EnumC15904e3.m17471m(i10, abstractC15882b.f49231f);
        AbstractC15882b abstractC15882b2 = abstractC15882b.f49226a;
        this.f49226a = abstractC15882b2;
        if (mo17440P()) {
            abstractC15882b2.f49234i = true;
        }
        this.f49230e = abstractC15882b.f49230e + 1;
    }

    /* JADX INFO: renamed from: C */
    final Object m17445C(InterfaceC15806L3 interfaceC15806L3) {
        if (this.f49233h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f49233h = true;
        if (this.f49226a.f49236k) {
            return interfaceC15806L3.mo17374c(this, m17442R(interfaceC15806L3.mo17375d()));
        }
        return interfaceC15806L3.mo17373b(this, m17442R(interfaceC15806L3.mo17375d()));
    }

    /* JADX INFO: renamed from: D */
    final InterfaceC15798K0 m17446D(IntFunction intFunction) {
        AbstractC15882b abstractC15882b;
        if (this.f49233h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f49233h = true;
        if (this.f49226a.f49236k && (abstractC15882b = this.f49227b) != null && mo17440P()) {
            this.f49230e = 0;
            return mo17377N(abstractC15882b, abstractC15882b.m17442R(0), intFunction);
        }
        return m17444B(m17442R(0), true, intFunction);
    }

    /* JADX INFO: renamed from: S */
    final Spliterator m17452S() {
        AbstractC15882b abstractC15882b = this.f49226a;
        if (this != abstractC15882b) {
            throw new IllegalStateException();
        }
        if (this.f49233h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f49233h = true;
        Spliterator spliterator = abstractC15882b.f49232g;
        if (spliterator != null) {
            abstractC15882b.f49232g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h sequential() {
        this.f49226a.f49236k = false;
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h parallel() {
        this.f49226a.f49236k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f49233h = true;
        this.f49232g = null;
        AbstractC15882b abstractC15882b = this.f49226a;
        Runnable runnable = abstractC15882b.f49235j;
        if (runnable != null) {
            abstractC15882b.f49235j = null;
            runnable.run();
        }
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h onClose(Runnable runnable) {
        if (this.f49233h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC15882b abstractC15882b = this.f49226a;
        Runnable runnable2 = abstractC15882b.f49235j;
        if (runnable2 != null) {
            runnable = new RunnableC15801K3(runnable2, runnable);
        }
        abstractC15882b.f49235j = runnable;
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public Spliterator spliterator() {
        if (this.f49233h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f49233h = true;
        AbstractC15882b abstractC15882b = this.f49226a;
        if (this == abstractC15882b) {
            Spliterator spliterator = abstractC15882b.f49232g;
            if (spliterator != null) {
                abstractC15882b.f49232g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return mo17346T(this, new C15876a(0, this), abstractC15882b.f49236k);
    }

    /* JADX INFO: renamed from: L */
    final /* synthetic */ Spliterator m17451L() {
        return m17442R(0);
    }

    /* JADX INFO: renamed from: B */
    final InterfaceC15798K0 m17444B(Spliterator spliterator, boolean z6, IntFunction intFunction) {
        if (this.f49226a.f49236k) {
            return mo17342E(this, spliterator, z6, intFunction);
        }
        InterfaceC15758C0 interfaceC15758C0Mo17345M = mo17345M(m17447F(spliterator), intFunction);
        m17453U(spliterator, interfaceC15758C0Mo17345M);
        return interfaceC15758C0Mo17345M.mo17356a();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final boolean isParallel() {
        return this.f49226a.f49236k;
    }

    /* JADX INFO: renamed from: R */
    private Spliterator m17442R(int i10) {
        int i11;
        int i12;
        AbstractC15882b abstractC15882b = this.f49226a;
        Spliterator spliteratorMo17415O = abstractC15882b.f49232g;
        if (spliteratorMo17415O != null) {
            abstractC15882b.f49232g = null;
            if (abstractC15882b.f49236k && abstractC15882b.f49234i) {
                AbstractC15882b abstractC15882b2 = abstractC15882b.f49229d;
                int i13 = 1;
                while (abstractC15882b != this) {
                    int i14 = abstractC15882b2.f49228c;
                    if (abstractC15882b2.mo17440P()) {
                        if (EnumC15904e3.SHORT_CIRCUIT.m17475r(i14)) {
                            i14 &= ~EnumC15904e3.f49280u;
                        }
                        spliteratorMo17415O = abstractC15882b2.mo17415O(abstractC15882b, spliteratorMo17415O);
                        if (spliteratorMo17415O.hasCharacteristics(64)) {
                            i11 = (~EnumC15904e3.f49279t) & i14;
                            i12 = EnumC15904e3.f49278s;
                        } else {
                            i11 = (~EnumC15904e3.f49278s) & i14;
                            i12 = EnumC15904e3.f49279t;
                        }
                        i14 = i11 | i12;
                        i13 = 0;
                    }
                    abstractC15882b2.f49230e = i13;
                    abstractC15882b2.f49231f = EnumC15904e3.m17471m(i14, abstractC15882b.f49231f);
                    i13++;
                    AbstractC15882b abstractC15882b3 = abstractC15882b2;
                    abstractC15882b2 = abstractC15882b2.f49229d;
                    abstractC15882b = abstractC15882b3;
                }
            }
            if (i10 != 0) {
                this.f49231f = EnumC15904e3.m17471m(i10, this.f49231f);
            }
            return spliteratorMo17415O;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: renamed from: I */
    final EnumC15910f3 m17448I() {
        AbstractC15882b abstractC15882b = this;
        while (abstractC15882b.f49230e > 0) {
            abstractC15882b = abstractC15882b.f49227b;
        }
        return abstractC15882b.mo17344H();
    }

    /* JADX INFO: renamed from: F */
    final long m17447F(Spliterator spliterator) {
        if (EnumC15904e3.SIZED.m17475r(this.f49231f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: U */
    final InterfaceC15963o2 m17453U(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        m17456z(spliterator, m17454V((InterfaceC15963o2) Objects.requireNonNull(interfaceC15963o2)));
        return interfaceC15963o2;
    }

    /* JADX INFO: renamed from: z */
    final void m17456z(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        Objects.requireNonNull(interfaceC15963o2);
        if (!EnumC15904e3.SHORT_CIRCUIT.m17475r(this.f49231f)) {
            interfaceC15963o2.mo17364l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC15963o2);
            interfaceC15963o2.mo17363k();
            return;
        }
        m17443A(spliterator, interfaceC15963o2);
    }

    /* JADX INFO: renamed from: A */
    final boolean m17443A(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        AbstractC15882b abstractC15882b = this;
        while (abstractC15882b.f49230e > 0) {
            abstractC15882b = abstractC15882b.f49227b;
        }
        interfaceC15963o2.mo17364l(spliterator.getExactSizeIfKnown());
        boolean zMo17343G = abstractC15882b.mo17343G(spliterator, interfaceC15963o2);
        interfaceC15963o2.mo17363k();
        return zMo17343G;
    }

    /* JADX INFO: renamed from: J */
    final int m17449J() {
        return this.f49231f;
    }

    /* JADX INFO: renamed from: K */
    final boolean m17450K() {
        return EnumC15904e3.ORDERED.m17475r(this.f49231f);
    }

    /* JADX INFO: renamed from: V */
    final InterfaceC15963o2 m17454V(InterfaceC15963o2 interfaceC15963o2) {
        Objects.requireNonNull(interfaceC15963o2);
        AbstractC15882b abstractC15882b = this;
        while (abstractC15882b.f49230e > 0) {
            AbstractC15882b abstractC15882b2 = abstractC15882b.f49227b;
            interfaceC15963o2 = abstractC15882b.mo17378Q(abstractC15882b2.f49231f, interfaceC15963o2);
            abstractC15882b = abstractC15882b2;
        }
        return interfaceC15963o2;
    }

    /* JADX INFO: renamed from: W */
    final Spliterator m17455W(Spliterator spliterator) {
        return this.f49230e == 0 ? spliterator : mo17346T(this, new C15876a(1, spliterator), this.f49226a.f49236k);
    }

    /* JADX INFO: renamed from: N */
    InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* JADX INFO: renamed from: O */
    Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return mo17377N(abstractC15882b, spliterator, new C15936k(13)).spliterator();
    }
}
