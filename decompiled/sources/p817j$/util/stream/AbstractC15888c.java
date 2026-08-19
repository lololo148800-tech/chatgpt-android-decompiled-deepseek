package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.c */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15888c extends AbstractC15900e {

    /* JADX INFO: renamed from: h */
    protected final AtomicReference f49241h;

    /* JADX INFO: renamed from: i */
    protected volatile boolean f49242i;

    /* JADX INFO: renamed from: j */
    protected abstract Object mo17412j();

    protected AbstractC15888c(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        super(abstractC15882b, spliterator);
        this.f49241h = new AtomicReference(null);
    }

    protected AbstractC15888c(AbstractC15888c abstractC15888c, Spliterator spliterator) {
        super(abstractC15888c, spliterator);
        this.f49241h = abstractC15888c.f49241h;
    }

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objMo17412j;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f49258b;
        long jEstimateSize = spliterator.estimateSize();
        long jM17466g = this.f49259c;
        if (jM17466g == 0) {
            jM17466g = AbstractC15900e.m17466g(jEstimateSize);
            this.f49259c = jM17466g;
        }
        AtomicReference atomicReference = this.f49241h;
        boolean z6 = false;
        AbstractC15888c abstractC15888c = this;
        while (true) {
            objMo17412j = atomicReference.get();
            if (objMo17412j != null) {
                break;
            }
            boolean z10 = abstractC15888c.f49242i;
            if (!z10) {
                CountedCompleter<?> completer = abstractC15888c.getCompleter();
                while (true) {
                    AbstractC15888c abstractC15888c2 = (AbstractC15888c) ((AbstractC15900e) completer);
                    if (z10 || abstractC15888c2 == null) {
                        break;
                    }
                    z10 = abstractC15888c2.f49242i;
                    completer = abstractC15888c2.getCompleter();
                }
            }
            if (z10) {
                objMo17412j = abstractC15888c.mo17412j();
                break;
            }
            if (jEstimateSize <= jM17466g || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objMo17412j = abstractC15888c.mo17410a();
                break;
            }
            AbstractC15888c abstractC15888c3 = (AbstractC15888c) abstractC15888c.mo17411e(spliteratorTrySplit);
            abstractC15888c.f49260d = abstractC15888c3;
            AbstractC15888c abstractC15888c4 = (AbstractC15888c) abstractC15888c.mo17411e(spliterator);
            abstractC15888c.f49261e = abstractC15888c4;
            abstractC15888c.setPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
                abstractC15888c = abstractC15888c3;
                abstractC15888c3 = abstractC15888c4;
            } else {
                abstractC15888c = abstractC15888c4;
            }
            z6 = !z6;
            abstractC15888c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC15888c.mo17459f(objMo17412j);
        abstractC15888c.tryComplete();
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: f */
    protected final void mo17459f(Object obj) {
        if (!m17467d()) {
            super.mo17459f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f49241h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return mo17458c();
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: c */
    public final Object mo17458c() {
        if (m17467d()) {
            Object obj = this.f49241h.get();
            return obj == null ? mo17412j() : obj;
        }
        return super.mo17458c();
    }

    /* JADX INFO: renamed from: h */
    protected void mo17460h() {
        this.f49242i = true;
    }

    /* JADX INFO: renamed from: i */
    protected final void m17461i() {
        AbstractC15888c abstractC15888c = this;
        for (AbstractC15888c abstractC15888c2 = (AbstractC15888c) ((AbstractC15900e) getCompleter()); abstractC15888c2 != null; abstractC15888c2 = (AbstractC15888c) ((AbstractC15900e) abstractC15888c2.getCompleter())) {
            if (abstractC15888c2.f49260d == abstractC15888c) {
                AbstractC15888c abstractC15888c3 = (AbstractC15888c) abstractC15888c2.f49261e;
                if (!abstractC15888c3.f49242i) {
                    abstractC15888c3.mo17460h();
                }
            }
            abstractC15888c = abstractC15888c2;
        }
    }
}
