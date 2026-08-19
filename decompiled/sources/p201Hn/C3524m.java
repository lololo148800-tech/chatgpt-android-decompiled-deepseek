package p201Hn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Hn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C3524m {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10648b = AtomicReferenceFieldUpdater.newUpdater(C3524m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10649c = AtomicIntegerFieldUpdater.newUpdater(C3524m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10650d = AtomicIntegerFieldUpdater.newUpdater(C3524m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10651e = AtomicIntegerFieldUpdater.newUpdater(C3524m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f10652a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC3520i m4216a(AbstractRunnableC3520i abstractRunnableC3520i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10649c;
        if (atomicIntegerFieldUpdater.get(this) - f10650d.get(this) == 127) {
            return abstractRunnableC3520i;
        }
        if (abstractRunnableC3520i.f10639Z) {
            f10651e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f10652a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, abstractRunnableC3520i);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC3520i m4217b() {
        AbstractRunnableC3520i abstractRunnableC3520i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10650d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f10649c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (abstractRunnableC3520i = (AbstractRunnableC3520i) this.f10652a.getAndSet(i11, null)) != null) {
                if (abstractRunnableC3520i.f10639Z) {
                    f10651e.decrementAndGet(this);
                }
                return abstractRunnableC3520i;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractRunnableC3520i m4218c(int i10, boolean z6) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f10652a;
        AbstractRunnableC3520i abstractRunnableC3520i = (AbstractRunnableC3520i) atomicReferenceArray.get(i11);
        if (abstractRunnableC3520i != null && abstractRunnableC3520i.f10639Z == z6) {
            while (!atomicReferenceArray.compareAndSet(i11, abstractRunnableC3520i, null)) {
                if (atomicReferenceArray.get(i11) != abstractRunnableC3520i) {
                }
            }
            if (z6) {
                f10651e.decrementAndGet(this);
            }
            return abstractRunnableC3520i;
        }
        return null;
    }
}
