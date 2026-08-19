package p153Fn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Fn.j */
/* JADX INFO: loaded from: classes2.dex */
public class C2932j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8788a = AtomicReferenceFieldUpdater.newUpdater(C2932j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C2934l(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m3753a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8788a;
            C2934l c2934l = (C2934l) atomicReferenceFieldUpdater.get(this);
            int iM3757a = c2934l.m3757a(runnable);
            if (iM3757a == 0) {
                return true;
            }
            if (iM3757a == 1) {
                C2934l c2934lM3759c = c2934l.m3759c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2934l, c2934lM3759c) && atomicReferenceFieldUpdater.get(this) == c2934l) {
                }
            } else if (iM3757a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3754b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8788a;
            C2934l c2934l = (C2934l) atomicReferenceFieldUpdater.get(this);
            if (c2934l.m3758b()) {
                return;
            }
            C2934l c2934lM3759c = c2934l.m3759c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2934l, c2934lM3759c) && atomicReferenceFieldUpdater.get(this) == c2934l) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3755c() {
        C2934l c2934l = (C2934l) f8788a.get(this);
        c2934l.getClass();
        long j10 = C2934l.f8791f.get(c2934l);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m3756d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8788a;
            C2934l c2934l = (C2934l) atomicReferenceFieldUpdater.get(this);
            Object objM3760d = c2934l.m3760d();
            if (objM3760d != C2934l.f8792g) {
                return objM3760d;
            }
            C2934l c2934lM3759c = c2934l.m3759c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2934l, c2934lM3759c) && atomicReferenceFieldUpdater.get(this) == c2934l) {
            }
        }
    }
}
