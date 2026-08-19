package p025An;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC16544l;
import p153Fn.C2934l;
import p153Fn.C2942t;
import p153Fn.C2944v;
import p530Vi.AbstractC8301I;
import p909nm.C17677k;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.c0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0605c0 extends AbstractC0607d0 implements InterfaceC0585M {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1842r0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0605c0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1843s0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0605c0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1844t0 = AtomicIntegerFieldUpdater.newUpdater(AbstractC0605c0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: S */
    public InterfaceC0595V mo1199S(long j10, Runnable runnable, InterfaceC18776i interfaceC18776i) {
        return AbstractC0579J.f1812a.mo1199S(j10, runnable, interfaceC18776i);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        mo1202h1(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {, blocks: (B:51:0x009a, B:53:0x009e), top: B:65:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p025An.AbstractC0607d0
    /* JADX INFO: renamed from: e1 */
    public final long mo1231e1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2942t c2942t;
        Runnable runnable;
        C0603b0 c0603b0;
        AbstractRunnableC0601a0 abstractRunnableC0601a0;
        if (m1242f1()) {
            return 0L;
        }
        m1232i1();
        loop0: while (true) {
            atomicReferenceFieldUpdater = f1842r0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2942t = AbstractC0575H.f1798c;
            if (obj != null) {
                if (obj instanceof C2934l) {
                    C2934l c2934l = (C2934l) obj;
                    Object objM3760d = c2934l.m3760d();
                    if (objM3760d != C2934l.f8792g) {
                        runnable = (Runnable) objM3760d;
                        break;
                    }
                    C2934l c2934lM3759c = c2934l.m3759c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2934lM3759c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj != c2942t) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            runnable = null;
            break;
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C17677k c17677k = this.f1849p0;
        if (((c17677k == null || c17677k.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 == null) {
            c0603b0 = (C0603b0) f1843s0.get(this);
            if (c0603b0 != null) {
                synchronized (c0603b0) {
                    AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = c0603b0.f8810a;
                    abstractRunnableC0601a0 = abstractRunnableC0601a0Arr != null ? abstractRunnableC0601a0Arr[0] : null;
                }
                if (abstractRunnableC0601a0 != null) {
                    return AbstractC8301I.m8916g(abstractRunnableC0601a0.f1834Y - System.nanoTime(), 0L);
                }
            }
        } else if (obj2 instanceof C2934l) {
            long j10 = C2934l.f8791f.get((C2934l) obj2);
            if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
            c0603b0 = (C0603b0) f1843s0.get(this);
            if (c0603b0 != null) {
                synchronized (c0603b0) {
                    AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr2 = c0603b0.f8810a;
                    if (abstractRunnableC0601a0Arr2 != null) {
                    }
                    if (abstractRunnableC0601a0 != null) {
                        return AbstractC8301I.m8916g(abstractRunnableC0601a0.f1834Y - System.nanoTime(), 0L);
                    }
                }
            }
        } else if (obj2 != c2942t) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h1 */
    public void mo1202h1(Runnable runnable) {
        m1232i1();
        if (!m1233j1(runnable)) {
            RunnableC0577I.f1807u0.mo1202h1(runnable);
            return;
        }
        Thread threadMo1200b1 = mo1200b1();
        if (Thread.currentThread() != threadMo1200b1) {
            LockSupport.unpark(threadMo1200b1);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m1232i1() {
        AbstractRunnableC0601a0 abstractRunnableC0601a0M3769c;
        C0603b0 c0603b0 = (C0603b0) f1843s0.get(this);
        if (c0603b0 == null || C2944v.f8809b.get(c0603b0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0603b0) {
                try {
                    AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = c0603b0.f8810a;
                    abstractRunnableC0601a0M3769c = null;
                    AbstractRunnableC0601a0 abstractRunnableC0601a0 = abstractRunnableC0601a0Arr != null ? abstractRunnableC0601a0Arr[0] : null;
                    if (abstractRunnableC0601a0 != null) {
                        abstractRunnableC0601a0M3769c = ((jNanoTime - abstractRunnableC0601a0.f1834Y) > 0L ? 1 : ((jNanoTime - abstractRunnableC0601a0.f1834Y) == 0L ? 0 : -1)) >= 0 ? m1233j1(abstractRunnableC0601a0) : false ? c0603b0.m3769c(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (abstractRunnableC0601a0M3769c != null);
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m1233j1(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1842r0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1844t0.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C2934l)) {
                if (obj == AbstractC0575H.f1798c) {
                    return false;
                }
                C2934l c2934l = new C2934l(8, true);
                c2934l.m3757a((Runnable) obj);
                c2934l.m3757a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2934l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C2934l c2934l2 = (C2934l) obj;
            int iM3757a = c2934l2.m3757a(runnable);
            if (iM3757a == 0) {
                return true;
            }
            if (iM3757a == 1) {
                C2934l c2934lM3759c = c2934l2.m3759c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2934lM3759c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM3757a == 2) {
                return false;
            }
        }
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: k */
    public final void mo1211k(long j10, C0624m c0624m) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0598Y c0598y = new C0598Y(this, j11 + jNanoTime, c0624m);
            m1235l1(jNanoTime, c0598y);
            c0624m.m1265v(new C0616i(c0598y, 2));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m1234k1() {
        C17677k c17677k = this.f1849p0;
        if (!(c17677k != null ? c17677k.isEmpty() : true)) {
            return false;
        }
        C0603b0 c0603b0 = (C0603b0) f1843s0.get(this);
        if (c0603b0 != null && C2944v.f8809b.get(c0603b0) != 0) {
            return false;
        }
        Object obj = f1842r0.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C2934l) {
            long j10 = C2934l.f8791f.get((C2934l) obj);
            if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0575H.f1798c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m1235l1(long j10, AbstractRunnableC0601a0 abstractRunnableC0601a0) {
        int iM1229c;
        Thread threadMo1200b1;
        boolean z6 = f1844t0.get(this) == 1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1843s0;
        AbstractRunnableC0601a0 abstractRunnableC0601a1 = null;
        if (z6) {
            iM1229c = 1;
        } else {
            C0603b0 c0603b0 = (C0603b0) atomicReferenceFieldUpdater.get(this);
            if (c0603b0 == null) {
                C0603b0 c0603b1 = new C0603b0();
                c0603b1.f1837c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0603b1) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC16544l.m18091d(obj);
                c0603b0 = (C0603b0) obj;
            }
            iM1229c = abstractRunnableC0601a0.m1229c(j10, c0603b0, this);
        }
        if (iM1229c != 0) {
            if (iM1229c == 1) {
                mo1201g1(j10, abstractRunnableC0601a0);
                return;
            } else {
                if (iM1229c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0603b0 c0603b2 = (C0603b0) atomicReferenceFieldUpdater.get(this);
        if (c0603b2 != null) {
            synchronized (c0603b2) {
                AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = c0603b2.f8810a;
                abstractRunnableC0601a1 = abstractRunnableC0601a0Arr != null ? abstractRunnableC0601a0Arr[0] : null;
            }
        }
        if (abstractRunnableC0601a1 != abstractRunnableC0601a0 || Thread.currentThread() == (threadMo1200b1 = mo1200b1())) {
            return;
        }
        LockSupport.unpark(threadMo1200b1);
    }

    @Override // p025An.AbstractC0607d0
    public void shutdown() {
        AbstractRunnableC0601a0 abstractRunnableC0601a0M3769c;
        AbstractC0570E0.f1786a.set(null);
        f1844t0.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1842r0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2942t c2942t = AbstractC0575H.f1798c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c2942t)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C2934l) {
                ((C2934l) obj).m3758b();
                break;
            } else {
                if (obj == c2942t) {
                    break;
                }
                C2934l c2934l = new C2934l(8, true);
                c2934l.m3757a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2934l)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (mo1231e1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0603b0 c0603b0 = (C0603b0) f1843s0.get(this);
            if (c0603b0 == null) {
                return;
            }
            synchronized (c0603b0) {
                abstractRunnableC0601a0M3769c = C2944v.f8809b.get(c0603b0) > 0 ? c0603b0.m3769c(0) : null;
            }
            if (abstractRunnableC0601a0M3769c == null) {
                return;
            } else {
                mo1201g1(jNanoTime, abstractRunnableC0601a0M3769c);
            }
        }
    }
}
