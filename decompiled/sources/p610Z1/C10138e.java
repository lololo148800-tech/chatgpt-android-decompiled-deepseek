package p610Z1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p832jb.AbstractC16182b;

/* JADX INFO: renamed from: Z1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10138e extends AbstractC16182b {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f30049a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f30050b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f30051c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f30052d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f30053e;

    public C10138e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f30049a = atomicReferenceFieldUpdater;
        this.f30050b = atomicReferenceFieldUpdater2;
        this.f30051c = atomicReferenceFieldUpdater3;
        this.f30052d = atomicReferenceFieldUpdater4;
        this.f30053e = atomicReferenceFieldUpdater5;
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: b */
    public final boolean mo10732b(AbstractC10141h abstractC10141h, C10137d c10137d, C10137d c10137d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f30052d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC10141h, c10137d, c10137d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC10141h) == c10137d);
        return false;
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: c */
    public final boolean mo10733c(AbstractC10141h abstractC10141h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f30053e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC10141h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC10141h) == obj);
        return false;
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: d */
    public final boolean mo10734d(AbstractC10141h abstractC10141h, C10140g c10140g, C10140g c10140g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f30051c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC10141h, c10140g, c10140g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC10141h) == c10140g);
        return false;
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: e */
    public final void mo10735e(C10140g c10140g, C10140g c10140g2) {
        this.f30050b.lazySet(c10140g, c10140g2);
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: f */
    public final void mo10736f(C10140g c10140g, Thread thread) {
        this.f30049a.lazySet(c10140g, thread);
    }
}
