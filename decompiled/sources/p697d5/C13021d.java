package p697d5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p523V9.AbstractC7925K4;

/* JADX INFO: renamed from: d5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13021d extends AbstractC7925K4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f41312a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f41313b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f41314c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f41315d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f41316e;

    public C13021d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f41312a = atomicReferenceFieldUpdater;
        this.f41313b = atomicReferenceFieldUpdater2;
        this.f41314c = atomicReferenceFieldUpdater3;
        this.f41315d = atomicReferenceFieldUpdater4;
        this.f41316e = atomicReferenceFieldUpdater5;
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: b */
    public final boolean mo8216b(AbstractC13025h abstractC13025h, C13020c c13020c, C13020c c13020c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f41315d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13025h, c13020c, c13020c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13025h) == c13020c);
        return false;
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: c */
    public final boolean mo8217c(AbstractC13025h abstractC13025h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f41316e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13025h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13025h) == obj);
        return false;
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: d */
    public final boolean mo8218d(AbstractC13025h abstractC13025h, C13024g c13024g, C13024g c13024g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f41314c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13025h, c13024g, c13024g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13025h) == c13024g);
        return false;
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: g */
    public final void mo8219g(C13024g c13024g, C13024g c13024g2) {
        this.f41313b.lazySet(c13024g, c13024g2);
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: h */
    public final void mo8220h(C13024g c13024g, Thread thread) {
        this.f41312a.lazySet(c13024g, thread);
    }
}
