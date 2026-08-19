package p697d5;

import cn.UfGr.EhBykzn;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p523V9.AbstractC7925K4;
import p571X9.AbstractC9306j0;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: d5.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13025h implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: p0 */
    public static final boolean f41322p0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: q0 */
    public static final Logger f41323q0 = Logger.getLogger(AbstractC13025h.class.getName());

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC7925K4 f41324r0;

    /* JADX INFO: renamed from: s0 */
    public static final Object f41325s0;

    /* JADX INFO: renamed from: Y */
    public volatile Object f41326Y;

    /* JADX INFO: renamed from: Z */
    public volatile C13020c f41327Z;

    /* JADX INFO: renamed from: o0 */
    public volatile C13024g f41328o0;

    /* JADX INFO: renamed from: d */
    public static void m14761d(AbstractC13025h abstractC13025h) {
        C13020c c13020c;
        C13020c c13020c2;
        C13020c c13020c3 = null;
        while (true) {
            C13024g c13024g = abstractC13025h.f41328o0;
            if (f41324r0.mo8218d(abstractC13025h, c13024g, C13024g.f41319c)) {
                while (c13024g != null) {
                    Thread thread = c13024g.f41320a;
                    if (thread != null) {
                        c13024g.f41320a = null;
                        LockSupport.unpark(thread);
                    }
                    c13024g = c13024g.f41321b;
                }
                do {
                    c13020c = abstractC13025h.f41327Z;
                } while (!f41324r0.mo8216b(abstractC13025h, c13020c, C13020c.f41308d));
                while (true) {
                    c13020c2 = c13020c3;
                    c13020c3 = c13020c;
                    if (c13020c3 == null) {
                        break;
                    }
                    c13020c = c13020c3.f41311c;
                    c13020c3.f41311c = c13020c2;
                }
                while (c13020c2 != null) {
                    c13020c3 = c13020c2.f41311c;
                    Runnable runnable = c13020c2.f41309a;
                    if (runnable instanceof RunnableC13022e) {
                        RunnableC13022e runnableC13022e = (RunnableC13022e) runnable;
                        abstractC13025h = runnableC13022e.f41317Y;
                        if (abstractC13025h.f41326Y == runnableC13022e) {
                            if (f41324r0.mo8217c(abstractC13025h, runnableC13022e, m14764g(runnableC13022e.f41318Z))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m14762e(runnable, c13020c2.f41310b);
                    }
                    c13020c2 = c13020c3;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m14762e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f41323q0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m14763f(Object obj) throws ExecutionException {
        if (obj instanceof C13018a) {
            CancellationException cancellationException = ((C13018a) obj).f41305b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C13019b) {
            throw new ExecutionException(((C13019b) obj).f41307a);
        }
        if (obj == f41325s0) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static Object m14764g(InterfaceFutureC13608b interfaceFutureC13608b) {
        if (interfaceFutureC13608b instanceof AbstractC13025h) {
            Object obj = ((AbstractC13025h) interfaceFutureC13608b).f41326Y;
            if (!(obj instanceof C13018a)) {
                return obj;
            }
            C13018a c13018a = (C13018a) obj;
            if (c13018a.f41304a) {
                return c13018a.f41305b != null ? new C13018a(false, c13018a.f41305b) : C13018a.f41303d;
            }
            return obj;
        }
        boolean zIsCancelled = interfaceFutureC13608b.isCancelled();
        if ((!f41322p0) && zIsCancelled) {
            return C13018a.f41303d;
        }
        try {
            Object objM14765h = m14765h(interfaceFutureC13608b);
            return objM14765h == null ? f41325s0 : objM14765h;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new C13018a(false, e10);
            }
            return new C13019b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC13608b, e10));
        } catch (ExecutionException e11) {
            return new C13019b(e11.getCause());
        } catch (Throwable th2) {
            return new C13019b(th2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m14765h(InterfaceFutureC13608b interfaceFutureC13608b) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = interfaceFutureC13608b.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th2) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // p747fb.InterfaceFutureC13608b
    /* JADX INFO: renamed from: a */
    public final void mo5766a(Runnable runnable, Executor executor) {
        executor.getClass();
        C13020c c13020c = this.f41327Z;
        C13020c c13020c2 = C13020c.f41308d;
        if (c13020c != c13020c2) {
            C13020c c13020c3 = new C13020c(runnable, executor);
            do {
                c13020c3.f41311c = c13020c;
                if (f41324r0.mo8216b(this, c13020c, c13020c3)) {
                    return;
                } else {
                    c13020c = this.f41327Z;
                }
            } while (c13020c != c13020c2);
        }
        m14762e(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m14766c(StringBuilder sb2) {
        try {
            Object objM14765h = m14765h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objM14765h == this ? "this future" : String.valueOf(objM14765h));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        C13018a c13018a;
        Object obj = this.f41326Y;
        if (!(obj == null) && !(obj instanceof RunnableC13022e)) {
            return false;
        }
        if (f41322p0) {
            c13018a = new C13018a(z6, new CancellationException("Future.cancel() was called."));
        } else {
            c13018a = z6 ? C13018a.f41302c : C13018a.f41303d;
        }
        AbstractC13025h abstractC13025h = this;
        boolean z10 = false;
        while (true) {
            if (f41324r0.mo8217c(abstractC13025h, obj, c13018a)) {
                m14761d(abstractC13025h);
                if (!(obj instanceof RunnableC13022e)) {
                    return true;
                }
                InterfaceFutureC13608b interfaceFutureC13608b = ((RunnableC13022e) obj).f41318Z;
                if (!(interfaceFutureC13608b instanceof AbstractC13025h)) {
                    interfaceFutureC13608b.cancel(z6);
                    return true;
                }
                abstractC13025h = (AbstractC13025h) interfaceFutureC13608b;
                obj = abstractC13025h.f41326Y;
                if (!(obj == null) && !(obj instanceof RunnableC13022e)) {
                    return true;
                }
                z10 = true;
            } else {
                obj = abstractC13025h.f41326Y;
                if (!(obj instanceof RunnableC13022e)) {
                    return z10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8 A[EDGE_INSN: B:56:0x00a8->B:36:0x0074 BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p697d5.AbstractC13025h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final String m14767i() {
        Object obj = this.f41326Y;
        if (obj instanceof RunnableC13022e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            InterfaceFutureC13608b interfaceFutureC13608b = ((RunnableC13022e) obj).f41318Z;
            return AbstractC9306j0.m9891j(interfaceFutureC13608b == this ? "this future" : String.valueOf(interfaceFutureC13608b), "]", sb2);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41326Y instanceof C13018a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f41326Y;
        return (!(obj instanceof RunnableC13022e)) & (obj != null);
    }

    /* JADX INFO: renamed from: j */
    public final void m14768j(C13024g c13024g) {
        c13024g.f41320a = null;
        while (true) {
            C13024g c13024g2 = this.f41328o0;
            if (c13024g2 == C13024g.f41319c) {
                return;
            }
            C13024g c13024g3 = null;
            while (c13024g2 != null) {
                C13024g c13024g4 = c13024g2.f41321b;
                if (c13024g2.f41320a != null) {
                    c13024g3 = c13024g2;
                } else if (c13024g3 != null) {
                    c13024g3.f41321b = c13024g4;
                    if (c13024g3.f41320a == null) {
                    }
                } else if (!f41324r0.mo8218d(this, c13024g2, c13024g4)) {
                }
                c13024g2 = c13024g4;
            }
            return;
        }
    }

    public final String toString() {
        String strM14767i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f41326Y instanceof C13018a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m14766c(sb2);
        } else {
            try {
                strM14767i = m14767i();
            } catch (RuntimeException e10) {
                strM14767i = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM14767i != null && !strM14767i.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM14767i);
                sb2.append("]");
            } else if (isDone()) {
                m14766c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    static {
        AbstractC7925K4 c13023f;
        try {
            c13023f = new C13021d(AtomicReferenceFieldUpdater.newUpdater(C13024g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C13024g.class, C13024g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC13025h.class, C13024g.class, "o0"), AtomicReferenceFieldUpdater.newUpdater(AbstractC13025h.class, C13020c.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractC13025h.class, Object.class, EhBykzn.aZNgcYtEnl));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c13023f = new C13023f();
        }
        f41324r0 = c13023f;
        if (th != null) {
            f41323q0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f41325s0 = new Object();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41326Y;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC13022e))) {
                return m14763f(obj2);
            }
            C13024g c13024g = this.f41328o0;
            C13024g c13024g2 = C13024g.f41319c;
            if (c13024g != c13024g2) {
                C13024g c13024g3 = new C13024g();
                do {
                    AbstractC7925K4 abstractC7925K4 = f41324r0;
                    abstractC7925K4.mo8219g(c13024g3, c13024g);
                    if (abstractC7925K4.mo8218d(this, c13024g, c13024g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41326Y;
                            } else {
                                m14768j(c13024g3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC13022e))));
                        return m14763f(obj);
                    }
                    c13024g = this.f41328o0;
                } while (c13024g != c13024g2);
            }
            return m14763f(this.f41326Y);
        }
        throw new InterruptedException();
    }
}
