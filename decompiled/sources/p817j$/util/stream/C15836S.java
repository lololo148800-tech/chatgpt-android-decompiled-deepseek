package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p817j$.util.Spliterator;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.util.stream.S */
/* JADX INFO: loaded from: classes4.dex */
final class C15836S extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    private final AbstractC15882b f49172a;

    /* JADX INFO: renamed from: b */
    private Spliterator f49173b;

    /* JADX INFO: renamed from: c */
    private final long f49174c;

    /* JADX INFO: renamed from: d */
    private final ConcurrentHashMap f49175d;

    /* JADX INFO: renamed from: e */
    private final AbstractC15827Q f49176e;

    /* JADX INFO: renamed from: f */
    private final C15836S f49177f;

    /* JADX INFO: renamed from: g */
    private InterfaceC15798K0 f49178g;

    protected C15836S(AbstractC15882b abstractC15882b, Spliterator spliterator, AbstractC15827Q abstractC15827Q) {
        super(null);
        this.f49172a = abstractC15882b;
        this.f49173b = spliterator;
        this.f49174c = AbstractC15900e.m17466g(spliterator.estimateSize());
        this.f49175d = new ConcurrentHashMap(Math.max(16, AbstractC15900e.m17465b() << 1));
        this.f49176e = abstractC15827Q;
        this.f49177f = null;
    }

    C15836S(C15836S c15836s, Spliterator spliterator, C15836S c15836s2) {
        super(c15836s);
        this.f49172a = c15836s.f49172a;
        this.f49173b = spliterator;
        this.f49174c = c15836s.f49174c;
        this.f49175d = c15836s.f49175d;
        this.f49176e = c15836s.f49176e;
        this.f49177f = c15836s2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f49173b;
        long j10 = this.f49174c;
        boolean z6 = false;
        C15836S c15836s = this;
        while (spliterator.estimateSize() > j10 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            C15836S c15836s2 = new C15836S(c15836s, spliteratorTrySplit, c15836s.f49177f);
            C15836S c15836s3 = new C15836S(c15836s, spliterator, c15836s2);
            c15836s.addToPendingCount(1);
            c15836s3.addToPendingCount(1);
            c15836s.f49175d.put(c15836s2, c15836s3);
            if (c15836s.f49177f != null) {
                c15836s2.addToPendingCount(1);
                if (c15836s.f49175d.replace(c15836s.f49177f, c15836s, c15836s2)) {
                    c15836s.addToPendingCount(-1);
                } else {
                    c15836s2.addToPendingCount(-1);
                }
            }
            if (z6) {
                spliterator = spliteratorTrySplit;
                c15836s = c15836s2;
                c15836s2 = c15836s3;
            } else {
                c15836s = c15836s3;
            }
            z6 = !z6;
            c15836s2.fork();
        }
        if (c15836s.getPendingCount() > 0) {
            C15936k c15936k = new C15936k(28);
            AbstractC15882b abstractC15882b = c15836s.f49172a;
            InterfaceC15758C0 interfaceC15758C0Mo17345M = abstractC15882b.mo17345M(abstractC15882b.m17447F(spliterator), c15936k);
            c15836s.f49172a.m17453U(spliterator, interfaceC15758C0Mo17345M);
            c15836s.f49178g = interfaceC15758C0Mo17345M.mo17356a();
            c15836s.f49173b = null;
        }
        c15836s.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC15798K0 interfaceC15798K0 = this.f49178g;
        if (interfaceC15798K0 != null) {
            interfaceC15798K0.forEach(this.f49176e);
            this.f49178g = null;
        } else {
            Spliterator spliterator = this.f49173b;
            if (spliterator != null) {
                this.f49172a.m17453U(spliterator, this.f49176e);
                this.f49173b = null;
            }
        }
        C15836S c15836s = (C15836S) this.f49175d.remove(this);
        if (c15836s != null) {
            c15836s.tryComplete();
        }
    }
}
