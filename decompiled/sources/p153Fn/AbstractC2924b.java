package p153Fn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Fn.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2924b {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8767Y = AtomicReferenceFieldUpdater.newUpdater(AbstractC2924b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8768Z = AtomicReferenceFieldUpdater.newUpdater(AbstractC2924b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2924b(AbstractC2940r abstractC2940r) {
        this._prev$volatile = abstractC2940r;
    }

    /* JADX INFO: renamed from: a */
    public final void m3743a() {
        f8768Z.set(this, null);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2924b m3744c() {
        Object obj = f8767Y.get(this);
        if (obj == AbstractC2923a.f8760a) {
            return null;
        }
        return (AbstractC2924b) obj;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo3745d();

    /* JADX INFO: renamed from: e */
    public final void m3746e() {
        AbstractC2924b abstractC2924bM3744c;
        if (m3744c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8768Z;
            AbstractC2924b abstractC2924b = (AbstractC2924b) atomicReferenceFieldUpdater.get(this);
            while (abstractC2924b != null && abstractC2924b.mo3745d()) {
                abstractC2924b = (AbstractC2924b) atomicReferenceFieldUpdater.get(abstractC2924b);
            }
            AbstractC2924b abstractC2924bM3744c2 = m3744c();
            AbstractC16544l.m18091d(abstractC2924bM3744c2);
            while (abstractC2924bM3744c2.mo3745d() && (abstractC2924bM3744c = abstractC2924bM3744c2.m3744c()) != null) {
                abstractC2924bM3744c2 = abstractC2924bM3744c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC2924bM3744c2);
                AbstractC2924b abstractC2924b2 = ((AbstractC2924b) obj) == null ? null : abstractC2924b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2924bM3744c2, obj, abstractC2924b2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(abstractC2924bM3744c2) != obj) {
                    }
                }
            }
            if (abstractC2924b != null) {
                f8767Y.set(abstractC2924b, abstractC2924bM3744c2);
            }
            if (!abstractC2924bM3744c2.mo3745d() || abstractC2924bM3744c2.m3744c() == null) {
                if (abstractC2924b == null || !abstractC2924b.mo3745d()) {
                    return;
                }
            }
        }
    }
}
