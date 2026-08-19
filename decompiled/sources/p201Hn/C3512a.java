package p201Hn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p153Fn.C2942t;

/* JADX INFO: renamed from: Hn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3512a extends Thread {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10607u0 = AtomicIntegerFieldUpdater.newUpdater(C3512a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: Y */
    public final C3524m f10608Y;

    /* JADX INFO: renamed from: Z */
    public final C16525B f10609Z;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o0 */
    public EnumC3513b f10610o0;

    /* JADX INFO: renamed from: p0 */
    public long f10611p0;

    /* JADX INFO: renamed from: q0 */
    public long f10612q0;

    /* JADX INFO: renamed from: r0 */
    public int f10613r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f10614s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ ExecutorC3514c f10615t0;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C3512a(ExecutorC3514c executorC3514c, int i10) {
        this.f10615t0 = executorC3514c;
        setDaemon(true);
        setContextClassLoader(executorC3514c.getClass().getClassLoader());
        this.f10608Y = new C3524m();
        this.f10609Z = new C16525B();
        this.f10610o0 = EnumC3513b.f10619p0;
        this.nextParkedWorker = ExecutorC3514c.f10625w0;
        int iNanoTime = (int) System.nanoTime();
        this.f10613r0 = iNanoTime == 0 ? 42 : iNanoTime;
        m4206f(i10);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC3520i m4201a(boolean z6) {
        AbstractRunnableC3520i abstractRunnableC3520iM4205e;
        AbstractRunnableC3520i abstractRunnableC3520iM4205e2;
        ExecutorC3514c executorC3514c;
        long j10;
        EnumC3513b enumC3513b = this.f10610o0;
        EnumC3513b enumC3513b2 = EnumC3513b.f10616Y;
        AbstractRunnableC3520i abstractRunnableC3520i = null;
        C3524m c3524m = this.f10608Y;
        ExecutorC3514c executorC3514c2 = this.f10615t0;
        if (enumC3513b != enumC3513b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3514c.f10623u0;
            do {
                executorC3514c = this.f10615t0;
                j10 = atomicLongFieldUpdater.get(executorC3514c);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    c3524m.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3524m.f10648b;
                        AbstractRunnableC3520i abstractRunnableC3520i2 = (AbstractRunnableC3520i) atomicReferenceFieldUpdater.get(c3524m);
                        if (abstractRunnableC3520i2 == null || !abstractRunnableC3520i2.f10639Z) {
                            int i10 = C3524m.f10650d.get(c3524m);
                            int i11 = C3524m.f10649c.get(c3524m);
                            while (i10 != i11 && C3524m.f10651e.get(c3524m) != 0) {
                                i11--;
                                AbstractRunnableC3520i abstractRunnableC3520iM4218c = c3524m.m4218c(i11, true);
                                if (abstractRunnableC3520iM4218c != null) {
                                    abstractRunnableC3520i = abstractRunnableC3520iM4218c;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c3524m, abstractRunnableC3520i2, null)) {
                                abstractRunnableC3520i = abstractRunnableC3520i2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c3524m) == abstractRunnableC3520i2);
                    }
                    if (abstractRunnableC3520i != null) {
                        return abstractRunnableC3520i;
                    }
                    AbstractRunnableC3520i abstractRunnableC3520i3 = (AbstractRunnableC3520i) executorC3514c2.f10631r0.m3756d();
                    return abstractRunnableC3520i3 == null ? m4209i(1) : abstractRunnableC3520i3;
                }
            } while (!ExecutorC3514c.f10623u0.compareAndSet(executorC3514c, j10, j10 - 4398046511104L));
            this.f10610o0 = EnumC3513b.f10616Y;
        }
        if (z6) {
            boolean z10 = m4204d(executorC3514c2.f10626Y * 2) == 0;
            if (z10 && (abstractRunnableC3520iM4205e2 = m4205e()) != null) {
                return abstractRunnableC3520iM4205e2;
            }
            c3524m.getClass();
            AbstractRunnableC3520i abstractRunnableC3520iM4217b = (AbstractRunnableC3520i) C3524m.f10648b.getAndSet(c3524m, null);
            if (abstractRunnableC3520iM4217b == null) {
                abstractRunnableC3520iM4217b = c3524m.m4217b();
            }
            if (abstractRunnableC3520iM4217b != null) {
                return abstractRunnableC3520iM4217b;
            }
            if (!z10 && (abstractRunnableC3520iM4205e = m4205e()) != null) {
                return abstractRunnableC3520iM4205e;
            }
        } else {
            AbstractRunnableC3520i abstractRunnableC3520iM4205e3 = m4205e();
            if (abstractRunnableC3520iM4205e3 != null) {
                return abstractRunnableC3520iM4205e3;
            }
        }
        return m4209i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m4202b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m4203c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m4204d(int i10) {
        int i11 = this.f10613r0;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f10613r0 = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC3520i m4205e() {
        int iM4204d = m4204d(2);
        ExecutorC3514c executorC3514c = this.f10615t0;
        if (iM4204d == 0) {
            AbstractRunnableC3520i abstractRunnableC3520i = (AbstractRunnableC3520i) executorC3514c.f10630q0.m3756d();
            return abstractRunnableC3520i != null ? abstractRunnableC3520i : (AbstractRunnableC3520i) executorC3514c.f10631r0.m3756d();
        }
        AbstractRunnableC3520i abstractRunnableC3520i2 = (AbstractRunnableC3520i) executorC3514c.f10631r0.m3756d();
        return abstractRunnableC3520i2 != null ? abstractRunnableC3520i2 : (AbstractRunnableC3520i) executorC3514c.f10630q0.m3756d();
    }

    /* JADX INFO: renamed from: f */
    public final void m4206f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10615t0.f10629p0);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    /* JADX INFO: renamed from: g */
    public final void m4207g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4208h(EnumC3513b enumC3513b) {
        EnumC3513b enumC3513b2 = this.f10610o0;
        boolean z6 = enumC3513b2 == EnumC3513b.f10616Y;
        if (z6) {
            ExecutorC3514c.f10623u0.addAndGet(this.f10615t0, 4398046511104L);
        }
        if (enumC3513b2 != enumC3513b) {
            this.f10610o0 = enumC3513b;
        }
        return z6;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractRunnableC3520i m4209i(int i10) {
        AbstractRunnableC3520i abstractRunnableC3520iM4218c;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3514c.f10623u0;
        ExecutorC3514c executorC3514c = this.f10615t0;
        int i11 = (int) (atomicLongFieldUpdater.get(executorC3514c) & 2097151);
        if (i11 < 2) {
            return null;
        }
        int iM4204d = m4204d(i11);
        long jMin = Long.MAX_VALUE;
        for (int i12 = 0; i12 < i11; i12++) {
            iM4204d++;
            if (iM4204d > i11) {
                iM4204d = 1;
            }
            C3512a c3512a = (C3512a) executorC3514c.f10632s0.m3762b(iM4204d);
            if (c3512a != null && c3512a != this) {
                C3524m c3524m = c3512a.f10608Y;
                if (i10 != 3) {
                    c3524m.getClass();
                    int i13 = C3524m.f10650d.get(c3524m);
                    int i14 = C3524m.f10649c.get(c3524m);
                    boolean z6 = i10 == 1;
                    while (true) {
                        if (i13 == i14 || (z6 && C3524m.f10651e.get(c3524m) == 0)) {
                            abstractRunnableC3520iM4218c = null;
                            break;
                        }
                        int i15 = i13 + 1;
                        abstractRunnableC3520iM4218c = c3524m.m4218c(i13, z6);
                        if (abstractRunnableC3520iM4218c != null) {
                            break;
                        }
                        i13 = i15;
                    }
                } else {
                    abstractRunnableC3520iM4218c = c3524m.m4217b();
                }
                C16525B c16525b = this.f10609Z;
                if (abstractRunnableC3520iM4218c != null) {
                    c16525b.f51262Y = abstractRunnableC3520iM4218c;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3524m.f10648b;
                        AbstractRunnableC3520i abstractRunnableC3520i = (AbstractRunnableC3520i) atomicReferenceFieldUpdater.get(c3524m);
                        j10 = -2;
                        if (abstractRunnableC3520i == null) {
                            break;
                        }
                        if (((abstractRunnableC3520i.f10639Z ? 1 : 2) & i10) == 0) {
                            break;
                        }
                        AbstractC3522k.f10646f.getClass();
                        long jNanoTime = System.nanoTime() - abstractRunnableC3520i.f10638Y;
                        long j12 = AbstractC3522k.f10642b;
                        if (jNanoTime < j12) {
                            j10 = j12 - jNanoTime;
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c3524m, abstractRunnableC3520i, null)) {
                                c16525b.f51262Y = abstractRunnableC3520i;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c3524m) == abstractRunnableC3520i);
                    }
                    j11 = j10;
                }
                if (j11 == -1) {
                    AbstractRunnableC3520i abstractRunnableC3520i2 = (AbstractRunnableC3520i) c16525b.f51262Y;
                    c16525b.f51262Y = null;
                    return abstractRunnableC3520i2;
                }
                if (j11 > 0) {
                    jMin = Math.min(jMin, j11);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f10612q0 = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z6;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        int i10;
        boolean z10 = false;
        loop0: while (true) {
            boolean z11 = z10;
            while (true) {
                ExecutorC3514c executorC3514c = this.f10615t0;
                executorC3514c.getClass();
                if (ExecutorC3514c.f10624v0.get(executorC3514c) != 1) {
                    EnumC3513b enumC3513b = this.f10610o0;
                    EnumC3513b enumC3513b2 = EnumC3513b.f10620q0;
                    if (enumC3513b == enumC3513b2) {
                        break loop0;
                    }
                    AbstractRunnableC3520i abstractRunnableC3520iM4201a = m4201a(this.f10614s0);
                    if (abstractRunnableC3520iM4201a != null) {
                        this.f10612q0 = 0L;
                        this.f10611p0 = 0L;
                        if (this.f10610o0 == EnumC3513b.f10618o0) {
                            this.f10610o0 = EnumC3513b.f10617Z;
                        }
                        boolean z12 = abstractRunnableC3520iM4201a.f10639Z;
                        ExecutorC3514c executorC3514c2 = this.f10615t0;
                        if (!z12) {
                            executorC3514c2.getClass();
                            try {
                                abstractRunnableC3520iM4201a.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (m4208h(EnumC3513b.f10617Z) && !executorC3514c2.m4212P() && !executorC3514c2.m4211E(ExecutorC3514c.f10623u0.get(executorC3514c2))) {
                            executorC3514c2.m4212P();
                        }
                        executorC3514c2.getClass();
                        try {
                            abstractRunnableC3520iM4201a.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        ExecutorC3514c.f10623u0.addAndGet(executorC3514c2, -2097152L);
                        if (this.f10610o0 == enumC3513b2) {
                            break;
                        }
                        this.f10610o0 = EnumC3513b.f10619p0;
                        break;
                    }
                    this.f10614s0 = z10;
                    if (this.f10612q0 == 0) {
                        Object obj = this.nextParkedWorker;
                        C2942t c2942t = ExecutorC3514c.f10625w0;
                        if (obj != c2942t ? true : z10) {
                            f10607u0.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC3514c.f10625w0) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10607u0;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ExecutorC3514c executorC3514c3 = this.f10615t0;
                                executorC3514c3.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC3514c.f10624v0;
                                if (atomicIntegerFieldUpdater2.get(executorC3514c3) == 1) {
                                    break;
                                }
                                EnumC3513b enumC3513b3 = this.f10610o0;
                                EnumC3513b enumC3513b4 = EnumC3513b.f10620q0;
                                if (enumC3513b3 == enumC3513b4) {
                                    break;
                                }
                                m4208h(EnumC3513b.f10618o0);
                                Thread.interrupted();
                                if (this.f10611p0 == 0) {
                                    this.f10611p0 = System.nanoTime() + this.f10615t0.f10628o0;
                                }
                                LockSupport.parkNanos(this.f10615t0.f10628o0);
                                if (System.nanoTime() - this.f10611p0 >= 0) {
                                    this.f10611p0 = 0L;
                                    ExecutorC3514c executorC3514c4 = this.f10615t0;
                                    synchronized (executorC3514c4.f10632s0) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(executorC3514c4) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC3514c.f10623u0;
                                                if (((int) (atomicLongFieldUpdater2.get(executorC3514c4) & 2097151)) > executorC3514c4.f10626Y && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i11 = this.indexInArray;
                                                    z6 = false;
                                                    m4206f(0);
                                                    executorC3514c4.m4215m(this, i11, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(executorC3514c4) & 2097151);
                                                    if (andDecrement != i11) {
                                                        Object objM3762b = executorC3514c4.f10632s0.m3762b(andDecrement);
                                                        AbstractC16544l.m18091d(objM3762b);
                                                        C3512a c3512a = (C3512a) objM3762b;
                                                        executorC3514c4.f10632s0.m3763c(i11, c3512a);
                                                        c3512a.m4206f(i11);
                                                        executorC3514c4.m4215m(c3512a, andDecrement, i11);
                                                    }
                                                    executorC3514c4.f10632s0.m3763c(andDecrement, null);
                                                    this.f10610o0 = enumC3513b4;
                                                }
                                            }
                                            z6 = false;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                } else {
                                    z6 = false;
                                }
                                z10 = z6;
                            }
                        } else {
                            ExecutorC3514c executorC3514c5 = this.f10615t0;
                            executorC3514c5.getClass();
                            if (this.nextParkedWorker == c2942t) {
                                do {
                                    atomicLongFieldUpdater = ExecutorC3514c.f10622t0;
                                    j10 = atomicLongFieldUpdater.get(executorC3514c5);
                                    i10 = this.indexInArray;
                                    this.nextParkedWorker = executorC3514c5.f10632s0.m3762b((int) (j10 & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(executorC3514c5, j10, ((2097152 + j10) & (-2097152)) | ((long) i10)));
                            }
                        }
                        z10 = z10;
                    } else {
                        if (z11) {
                            m4208h(EnumC3513b.f10618o0);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10612q0);
                            this.f10612q0 = 0L;
                            break;
                        }
                        z11 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        m4208h(EnumC3513b.f10620q0);
    }
}
