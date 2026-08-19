package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.T */
/* JADX INFO: loaded from: classes4.dex */
final class C15841T extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    private Spliterator f49185a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC15963o2 f49186b;

    /* JADX INFO: renamed from: c */
    private final AbstractC15882b f49187c;

    /* JADX INFO: renamed from: d */
    private long f49188d;

    C15841T(AbstractC15882b abstractC15882b, Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        super(null);
        this.f49186b = interfaceC15963o2;
        this.f49187c = abstractC15882b;
        this.f49185a = spliterator;
        this.f49188d = 0L;
    }

    C15841T(C15841T c15841t, Spliterator spliterator) {
        super(c15841t);
        this.f49185a = spliterator;
        this.f49186b = c15841t.f49186b;
        this.f49188d = c15841t.f49188d;
        this.f49187c = c15841t.f49187c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f49185a;
        long jEstimateSize = spliterator.estimateSize();
        long jM17466g = this.f49188d;
        if (jM17466g == 0) {
            jM17466g = AbstractC15900e.m17466g(jEstimateSize);
            this.f49188d = jM17466g;
        }
        boolean zM17475r = EnumC15904e3.SHORT_CIRCUIT.m17475r(this.f49187c.m17449J());
        InterfaceC15963o2 interfaceC15963o2 = this.f49186b;
        boolean z6 = false;
        C15841T c15841t = this;
        while (true) {
            if (zM17475r && interfaceC15963o2.mo17358n()) {
                break;
            }
            if (jEstimateSize <= jM17466g || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                c15841t.f49187c.m17456z(spliterator, interfaceC15963o2);
                break;
            }
            C15841T c15841t2 = new C15841T(c15841t, spliteratorTrySplit);
            c15841t.addToPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
            } else {
                C15841T c15841t3 = c15841t;
                c15841t = c15841t2;
                c15841t2 = c15841t3;
            }
            z6 = !z6;
            c15841t.fork();
            c15841t = c15841t2;
            jEstimateSize = spliterator.estimateSize();
        }
        c15841t.f49185a = null;
        c15841t.propagateCompletion();
    }
}
