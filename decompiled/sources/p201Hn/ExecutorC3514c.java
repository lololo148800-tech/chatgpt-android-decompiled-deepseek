package p201Hn;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p153Fn.C2938p;
import p153Fn.C2942t;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Hn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC3514c implements Executor, Closeable {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f10622t0 = AtomicLongFieldUpdater.newUpdater(ExecutorC3514c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f10623u0 = AtomicLongFieldUpdater.newUpdater(ExecutorC3514c.class, "controlState$volatile");

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10624v0 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3514c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: w0 */
    public static final C2942t f10625w0 = new C2942t("NOT_IN_STACK", 0);

    /* JADX INFO: renamed from: Y */
    public final int f10626Y;

    /* JADX INFO: renamed from: Z */
    public final int f10627Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: o0 */
    public final long f10628o0;

    /* JADX INFO: renamed from: p0 */
    public final String f10629p0;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: q0 */
    public final C3517f f10630q0;

    /* JADX INFO: renamed from: r0 */
    public final C3517f f10631r0;

    /* JADX INFO: renamed from: s0 */
    public final C2938p f10632s0;

    public ExecutorC3514c(long j10, String str, int i10, int i11) {
        this.f10626Y = i10;
        this.f10627Z = i11;
        this.f10628o0 = j10;
        this.f10629p0 = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Max pool size ", i11, i10, " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("Idle worker keep alive time ", j10, " must be positive").toString());
        }
        this.f10630q0 = new C3517f();
        this.f10631r0 = new C3517f();
        this.f10632s0 = new C2938p((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m4210k(ExecutorC3514c executorC3514c, Runnable runnable, boolean z6, int i10) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        executorC3514c.m4214e(runnable, false, z6);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4211E(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f10626Y;
        if (i10 < i11) {
            int iM4213a = m4213a();
            if (iM4213a == 1 && i11 > 1) {
                m4213a();
            }
            if (iM4213a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m4212P() {
        C2942t c2942t;
        int iM4202b;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10622t0;
            long j10 = atomicLongFieldUpdater.get(this);
            C3512a c3512a = (C3512a) this.f10632s0.m3762b((int) (2097151 & j10));
            if (c3512a == null) {
                c3512a = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objM4203c = c3512a.m4203c();
                while (true) {
                    c2942t = f10625w0;
                    if (objM4203c == c2942t) {
                        iM4202b = -1;
                        break;
                    }
                    if (objM4203c == null) {
                        iM4202b = 0;
                        break;
                    }
                    C3512a c3512a2 = (C3512a) objM4203c;
                    iM4202b = c3512a2.m4202b();
                    if (iM4202b != 0) {
                        break;
                    }
                    objM4203c = c3512a2.m4203c();
                }
                if (iM4202b >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | ((long) iM4202b))) {
                    c3512a.m4207g(c2942t);
                }
            }
            if (c3512a == null) {
                return false;
            }
            if (C3512a.f10607u0.compareAndSet(c3512a, -1, 0)) {
                LockSupport.unpark(c3512a);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4213a() {
        synchronized (this.f10632s0) {
            try {
                if (f10624v0.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f10623u0;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f10626Y) {
                    return 0;
                }
                if (i10 >= this.f10627Z) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f10632s0.m3762b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C3512a c3512a = new C3512a(this, i12);
                this.f10632s0.m3763c(i12, c3512a);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                c3512a.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        AbstractRunnableC3520i abstractRunnableC3520iM4201a;
        if (f10624v0.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C3512a c3512a = threadCurrentThread instanceof C3512a ? (C3512a) threadCurrentThread : null;
            if (c3512a == null || !AbstractC16544l.m18089b(c3512a.f10615t0, this)) {
                c3512a = null;
            }
            synchronized (this.f10632s0) {
                i10 = (int) (f10623u0.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objM3762b = this.f10632s0.m3762b(i11);
                    AbstractC16544l.m18091d(objM3762b);
                    C3512a c3512a2 = (C3512a) objM3762b;
                    if (c3512a2 != c3512a) {
                        while (c3512a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c3512a2);
                            c3512a2.join(10000L);
                        }
                        C3524m c3524m = c3512a2.f10608Y;
                        C3517f c3517f = this.f10631r0;
                        c3524m.getClass();
                        AbstractRunnableC3520i abstractRunnableC3520i = (AbstractRunnableC3520i) C3524m.f10648b.getAndSet(c3524m, null);
                        if (abstractRunnableC3520i != null) {
                            c3517f.m3753a(abstractRunnableC3520i);
                        }
                        while (true) {
                            AbstractRunnableC3520i abstractRunnableC3520iM4217b = c3524m.m4217b();
                            if (abstractRunnableC3520iM4217b == null) {
                                break;
                            } else {
                                c3517f.m3753a(abstractRunnableC3520iM4217b);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f10631r0.m3754b();
            this.f10630q0.m3754b();
            while (true) {
                if (c3512a != null) {
                    abstractRunnableC3520iM4201a = c3512a.m4201a(true);
                    if (abstractRunnableC3520iM4201a == null) {
                        abstractRunnableC3520iM4201a = (AbstractRunnableC3520i) this.f10630q0.m3756d();
                        if (abstractRunnableC3520iM4201a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC3520iM4201a = (AbstractRunnableC3520i) this.f10630q0.m3756d();
                    if (abstractRunnableC3520iM4201a == null && (abstractRunnableC3520iM4201a = (AbstractRunnableC3520i) this.f10631r0.m3756d()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC3520iM4201a.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (c3512a != null) {
                c3512a.m4208h(EnumC3513b.f10620q0);
            }
            f10622t0.set(this, 0L);
            f10623u0.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4214e(Runnable runnable, boolean z6, boolean z10) {
        AbstractRunnableC3520i c3521j;
        EnumC3513b enumC3513b;
        AbstractC3522k.f10646f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC3520i) {
            c3521j = (AbstractRunnableC3520i) runnable;
            c3521j.f10638Y = jNanoTime;
            c3521j.f10639Z = z6;
        } else {
            c3521j = new C3521j(runnable, jNanoTime, z6);
        }
        boolean z11 = c3521j.f10639Z;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10623u0;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C3512a c3512a = threadCurrentThread instanceof C3512a ? (C3512a) threadCurrentThread : null;
        if (c3512a == null || !AbstractC16544l.m18089b(c3512a.f10615t0, this)) {
            c3512a = null;
        }
        if (c3512a != null && (enumC3513b = c3512a.f10610o0) != EnumC3513b.f10620q0 && (c3521j.f10639Z || enumC3513b != EnumC3513b.f10617Z)) {
            c3512a.f10614s0 = true;
            C3524m c3524m = c3512a.f10608Y;
            if (z10) {
                c3521j = c3524m.m4216a(c3521j);
            } else {
                c3524m.getClass();
                AbstractRunnableC3520i abstractRunnableC3520i = (AbstractRunnableC3520i) C3524m.f10648b.getAndSet(c3524m, c3521j);
                c3521j = abstractRunnableC3520i == null ? null : c3524m.m4216a(abstractRunnableC3520i);
            }
        }
        if (c3521j != null) {
            if (!(c3521j.f10639Z ? this.f10631r0.m3753a(c3521j) : this.f10630q0.m3753a(c3521j))) {
                throw new RejectedExecutionException(AbstractC9306j0.m9891j(this.f10629p0, " was terminated", new StringBuilder()));
            }
        }
        if (z11) {
            if (m4212P() || m4211E(jAddAndGet)) {
                return;
            }
            m4212P();
            return;
        }
        if (m4212P() || m4211E(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m4212P();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m4210k(this, runnable, false, 6);
    }

    /* JADX INFO: renamed from: m */
    public final void m4215m(C3512a c3512a, int i10, int i11) {
        while (true) {
            long j10 = f10622t0.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objM4203c = c3512a.m4203c();
                    while (true) {
                        if (objM4203c == f10625w0) {
                            i12 = -1;
                            break;
                        }
                        if (objM4203c == null) {
                            i12 = 0;
                            break;
                        }
                        C3512a c3512a2 = (C3512a) objM4203c;
                        int iM4202b = c3512a2.m4202b();
                        if (iM4202b != 0) {
                            i12 = iM4202b;
                            break;
                        }
                        objM4203c = c3512a2.m4203c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f10622t0.compareAndSet(this, j10, ((long) i12) | j11)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2938p c2938p = this.f10632s0;
        int iM3761a = c2938p.m3761a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM3761a; i15++) {
            C3512a c3512a = (C3512a) c2938p.m3762b(i15);
            if (c3512a != null) {
                C3524m c3524m = c3512a.f10608Y;
                c3524m.getClass();
                int i16 = C3524m.f10648b.get(c3524m) != null ? (C3524m.f10649c.get(c3524m) - C3524m.f10650d.get(c3524m)) + 1 : C3524m.f10649c.get(c3524m) - C3524m.f10650d.get(c3524m);
                int iOrdinal = c3512a.f10610o0.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C0644w();
                    }
                    i14++;
                }
            }
        }
        long j10 = f10623u0.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f10629p0);
        sb5.append('@');
        sb5.append(AbstractC0575H.m1191t(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f10626Y;
        sb5.append(i17);
        sb5.append(", max = ");
        sb5.append(this.f10627Z);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f10630q0.m3755c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f10631r0.m3755c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
