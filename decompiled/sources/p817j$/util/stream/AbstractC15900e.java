package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.e */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15900e extends CountedCompleter {

    /* JADX INFO: renamed from: g */
    private static final int f49256g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a */
    protected final AbstractC15882b f49257a;

    /* JADX INFO: renamed from: b */
    protected Spliterator f49258b;

    /* JADX INFO: renamed from: c */
    protected long f49259c;

    /* JADX INFO: renamed from: d */
    protected AbstractC15900e f49260d;

    /* JADX INFO: renamed from: e */
    protected AbstractC15900e f49261e;

    /* JADX INFO: renamed from: f */
    private Object f49262f;

    /* JADX INFO: renamed from: a */
    protected abstract Object mo17410a();

    /* JADX INFO: renamed from: e */
    protected abstract AbstractC15900e mo17411e(Spliterator spliterator);

    protected AbstractC15900e(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        super(null);
        this.f49257a = abstractC15882b;
        this.f49258b = spliterator;
        this.f49259c = 0L;
    }

    protected AbstractC15900e(AbstractC15900e abstractC15900e, Spliterator spliterator) {
        super(abstractC15900e);
        this.f49258b = spliterator;
        this.f49257a = abstractC15900e.f49257a;
        this.f49259c = abstractC15900e.f49259c;
    }

    /* JADX INFO: renamed from: b */
    public static int m17465b() {
        return f49256g;
    }

    /* JADX INFO: renamed from: g */
    public static long m17466g(long j10) {
        long j11 = j10 / ((long) f49256g);
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f49262f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: c */
    protected Object mo17458c() {
        return this.f49262f;
    }

    /* JADX INFO: renamed from: f */
    protected void mo17459f(Object obj) {
        this.f49262f = obj;
    }

    /* JADX INFO: renamed from: d */
    protected final boolean m17467d() {
        return ((AbstractC15900e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f49258b;
        long jEstimateSize = spliterator.estimateSize();
        long jM17466g = this.f49259c;
        if (jM17466g == 0) {
            jM17466g = m17466g(jEstimateSize);
            this.f49259c = jM17466g;
        }
        boolean z6 = false;
        AbstractC15900e abstractC15900e = this;
        while (jEstimateSize > jM17466g && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC15900e abstractC15900eMo17411e = abstractC15900e.mo17411e(spliteratorTrySplit);
            abstractC15900e.f49260d = abstractC15900eMo17411e;
            AbstractC15900e abstractC15900eMo17411e2 = abstractC15900e.mo17411e(spliterator);
            abstractC15900e.f49261e = abstractC15900eMo17411e2;
            abstractC15900e.setPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
                abstractC15900e = abstractC15900eMo17411e;
                abstractC15900eMo17411e = abstractC15900eMo17411e2;
            } else {
                abstractC15900e = abstractC15900eMo17411e2;
            }
            z6 = !z6;
            abstractC15900eMo17411e.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC15900e.mo17459f(abstractC15900e.mo17410a());
        abstractC15900e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f49258b = null;
        this.f49261e = null;
        this.f49260d = null;
    }
}
