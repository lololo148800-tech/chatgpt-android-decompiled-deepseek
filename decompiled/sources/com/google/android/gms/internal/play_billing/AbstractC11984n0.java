package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p003A1.AbstractC0168G;
import p582Xk.HXHG.bQBnquXS;
import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11984n0 extends AbstractC11885K0 implements InterfaceFutureC12028y0 {

    /* JADX INFO: renamed from: p0 */
    public static final boolean f36300p0;

    /* JADX INFO: renamed from: q0 */
    public static final C12024x0 f36301q0;

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC11957g1 f36302r0;

    /* JADX INFO: renamed from: s0 */
    public static final Object f36303s0;

    /* JADX INFO: renamed from: Y */
    public volatile Object f36304Y;

    /* JADX INFO: renamed from: Z */
    public volatile C11952f0 f36305Z;

    /* JADX INFO: renamed from: o0 */
    public volatile C11980m0 f36306o0;

    static {
        boolean z6;
        Throwable th2;
        Throwable th3;
        AbstractC11957g1 c11964i0;
        int i10 = 7;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f36300p0 = z6;
        f36301q0 = new C12024x0(AbstractC11984n0.class);
        try {
            c11964i0 = new C11976l0(i10);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = null;
                th3 = e10;
                c11964i0 = new C11956g0(AtomicReferenceFieldUpdater.newUpdater(C11980m0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C11980m0.class, C11980m0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11984n0.class, C11980m0.class, "o0"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11984n0.class, C11952f0.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11984n0.class, Object.class, "Y"));
            } catch (Error | Exception e11) {
                th2 = e11;
                th3 = e10;
                c11964i0 = new C11964i0(i10);
            }
        }
        f36302r0 = c11964i0;
        if (th2 != null) {
            C12024x0 c12024x0 = f36301q0;
            Logger loggerM13556a = c12024x0.m13556a();
            Level level = Level.SEVERE;
            loggerM13556a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", VjclRfeKsMflo.sDMOxoqyJyFuX, th3);
            c12024x0.m13556a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f36303s0 = new Object();
    }

    /* JADX INFO: renamed from: g */
    public static Object m13492g(InterfaceFutureC12028y0 interfaceFutureC12028y0) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = interfaceFutureC12028y0.get();
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

    /* JADX INFO: renamed from: i */
    public static void m13493i(AbstractC11984n0 abstractC11984n0) {
        C11952f0 c11952f0 = null;
        while (true) {
            for (C11980m0 c11980m0Mo13426r = f36302r0.mo13426r(abstractC11984n0); c11980m0Mo13426r != null; c11980m0Mo13426r = c11980m0Mo13426r.f36298b) {
                Thread thread = c11980m0Mo13426r.f36297a;
                if (thread != null) {
                    c11980m0Mo13426r.f36297a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC11984n0.mo13268d();
            C11952f0 c11952f1 = c11952f0;
            C11952f0 c11952f0Mo13425e = f36302r0.mo13425e(abstractC11984n0);
            C11952f0 c11952f2 = c11952f1;
            while (c11952f0Mo13425e != null) {
                C11952f0 c11952f3 = c11952f0Mo13425e.f36263c;
                c11952f0Mo13425e.f36263c = c11952f2;
                c11952f2 = c11952f0Mo13425e;
                c11952f0Mo13425e = c11952f3;
            }
            while (c11952f2 != null) {
                Runnable runnable = c11952f2.f36261a;
                C11952f0 c11952f4 = c11952f2.f36263c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC11960h0) {
                    RunnableC11960h0 runnableC11960h0 = (RunnableC11960h0) runnable;
                    abstractC11984n0 = runnableC11960h0.f36271Y;
                    if (abstractC11984n0.f36304Y == runnableC11960h0) {
                        if (f36302r0.mo13423L(abstractC11984n0, runnableC11960h0, m13491f(runnableC11960h0.f36272Z))) {
                            c11952f0 = c11952f4;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c11952f2.f36262b;
                    Objects.requireNonNull(executor);
                    m13494j(runnable, executor);
                }
                c11952f2 = c11952f4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m13494j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f36301q0.m13556a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC10763a.m11055m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Object m13495l(Object obj) throws ExecutionException {
        if (obj instanceof C11944d0) {
            RuntimeException runtimeException = ((C11944d0) obj).f36250b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C11948e0) {
            throw new ExecutionException(((C11948e0) obj).f36254a);
        }
        if (obj == f36303s0) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC12028y0
    /* JADX INFO: renamed from: b */
    public final void mo13259b(Runnable runnable, Executor executor) {
        C11952f0 c11952f0;
        C11952f0 c11952f1;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c11952f0 = this.f36305Z) != (c11952f1 = C11952f0.f36260d)) {
            C11952f0 c11952f2 = new C11952f0(runnable, executor);
            do {
                c11952f2.f36263c = c11952f0;
                if (f36302r0.mo13422H(this, c11952f0, c11952f2)) {
                    return;
                } else {
                    c11952f0 = this.f36305Z;
                }
            } while (c11952f0 != c11952f1);
        }
        m13494j(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo13260c() {
        if (this instanceof ScheduledFuture) {
            return AbstractC0168G.m533v("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        C11944d0 c11944d0;
        Object obj = this.f36304Y;
        if (!(obj instanceof RunnableC11960h0) && !(obj == null)) {
            return false;
        }
        if (f36300p0) {
            c11944d0 = new C11944d0(z6, new CancellationException("Future.cancel() was called."));
        } else {
            c11944d0 = z6 ? C11944d0.f36247c : C11944d0.f36248d;
            Objects.requireNonNull(c11944d0);
        }
        AbstractC11984n0 abstractC11984n0 = this;
        boolean z10 = false;
        while (true) {
            if (f36302r0.mo13423L(abstractC11984n0, obj, c11944d0)) {
                m13493i(abstractC11984n0);
                if (obj instanceof RunnableC11960h0) {
                    InterfaceFutureC12028y0 interfaceFutureC12028y0 = ((RunnableC11960h0) obj).f36272Z;
                    if (interfaceFutureC12028y0 instanceof InterfaceC11968j0) {
                        abstractC11984n0 = (AbstractC11984n0) interfaceFutureC12028y0;
                        obj = abstractC11984n0.f36304Y;
                        if ((obj == null) | (obj instanceof RunnableC11960h0)) {
                            z10 = true;
                        }
                    } else {
                        interfaceFutureC12028y0.cancel(z6);
                    }
                }
                return true;
            }
            obj = abstractC11984n0.f36304Y;
            if (!(obj instanceof RunnableC11960h0)) {
                return z10;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo13268d() {
    }

    /* JADX INFO: renamed from: e */
    public final void m13496e(Throwable th2) {
        if (f36302r0.mo13423L(this, null, new C11948e0(th2))) {
            m13493i(this);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f36304Y;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC11960h0))) {
            return m13495l(obj2);
        }
        C11980m0 c11980m0 = this.f36306o0;
        C11980m0 c11980m1 = C11980m0.f36296c;
        if (c11980m0 != c11980m1) {
            C11980m0 c11980m2 = new C11980m0();
            do {
                AbstractC11957g1 abstractC11957g1 = f36302r0;
                abstractC11957g1.mo13427z(c11980m2, c11980m0);
                if (abstractC11957g1.mo13424N(this, c11980m0, c11980m2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m13498k(c11980m2);
                            throw new InterruptedException();
                        }
                        obj = this.f36304Y;
                    } while (!((obj != null) & (!(obj instanceof RunnableC11960h0))));
                    return m13495l(obj);
                }
                c11980m0 = this.f36306o0;
            } while (c11980m0 != c11980m1);
        }
        Object obj3 = this.f36304Y;
        Objects.requireNonNull(obj3);
        return m13495l(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36304Y instanceof C11944d0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f36304Y;
        return (obj != null) & (!(obj instanceof RunnableC11960h0));
    }

    /* JADX INFO: renamed from: k */
    public final void m13498k(C11980m0 c11980m0) {
        c11980m0.f36297a = null;
        while (true) {
            C11980m0 c11980m1 = this.f36306o0;
            if (c11980m1 != C11980m0.f36296c) {
                C11980m0 c11980m2 = null;
                while (c11980m1 != null) {
                    C11980m0 c11980m3 = c11980m1.f36298b;
                    if (c11980m1.f36297a != null) {
                        c11980m2 = c11980m1;
                    } else if (c11980m2 != null) {
                        c11980m2.f36298b = c11980m3;
                        if (c11980m2.f36297a == null) {
                        }
                    } else if (!f36302r0.mo13424N(this, c11980m1, c11980m3)) {
                    }
                    c11980m1 = c11980m3;
                }
                return;
            }
            return;
        }
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f36304Y instanceof C11944d0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m13497h(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f36304Y;
            if (obj instanceof RunnableC11960h0) {
                sb2.append(", setFuture=[");
                InterfaceFutureC12028y0 interfaceFutureC12028y0 = ((RunnableC11960h0) obj).f36272Z;
                try {
                    if (interfaceFutureC12028y0 == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(interfaceFutureC12028y0);
                    }
                } catch (Exception e10) {
                    e = e10;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                } catch (StackOverflowError e11) {
                    e = e11;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = mo13260c();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Exception | StackOverflowError e12) {
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e12.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                m13497h(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static Object m13491f(InterfaceFutureC12028y0 interfaceFutureC12028y0) {
        Throwable th2;
        String str = bQBnquXS.sJfJHPExazHVvSO;
        if (interfaceFutureC12028y0 instanceof InterfaceC11968j0) {
            Object c11944d0 = ((AbstractC11984n0) interfaceFutureC12028y0).f36304Y;
            if (c11944d0 instanceof C11944d0) {
                C11944d0 c11944d1 = (C11944d0) c11944d0;
                if (c11944d1.f36249a) {
                    RuntimeException runtimeException = c11944d1.f36250b;
                    c11944d0 = runtimeException != null ? new C11944d0(false, runtimeException) : C11944d0.f36248d;
                }
            }
            Objects.requireNonNull(c11944d0);
            return c11944d0;
        }
        if (interfaceFutureC12028y0 instanceof AbstractC11885K0) {
            AbstractC11984n0 abstractC11984n0 = (AbstractC11984n0) ((AbstractC11885K0) interfaceFutureC12028y0);
            abstractC11984n0.getClass();
            if (abstractC11984n0 instanceof InterfaceC11968j0) {
                Object obj = abstractC11984n0.f36304Y;
                if (obj instanceof C11948e0) {
                    th2 = ((C11948e0) obj).f36254a;
                } else {
                    th2 = null;
                }
            } else {
                th2 = null;
            }
            if (th2 != null) {
                return new C11948e0(th2);
            }
        }
        boolean zIsCancelled = interfaceFutureC12028y0.isCancelled();
        if ((!f36300p0) && zIsCancelled) {
            C11944d0 c11944d2 = C11944d0.f36248d;
            Objects.requireNonNull(c11944d2);
            return c11944d2;
        }
        try {
            Object objM13492g = m13492g(interfaceFutureC12028y0);
            if (zIsCancelled) {
                return new C11944d0(false, new IllegalArgumentException(str.concat(String.valueOf(interfaceFutureC12028y0))));
            }
            return objM13492g == null ? f36303s0 : objM13492g;
        } catch (Error e10) {
            e = e10;
            return new C11948e0(e);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new C11948e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC12028y0)), e11)) : new C11944d0(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new C11944d0(false, new IllegalArgumentException(str.concat(String.valueOf(interfaceFutureC12028y0)), e12)) : new C11948e0(e12.getCause());
        } catch (Exception e13) {
            e = e13;
            return new C11948e0(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m13497h(StringBuilder sb2) {
        try {
            Object objM13492g = m13492g(this);
            sb2.append("SUCCESS, result=[");
            if (objM13492g == null) {
                sb2.append("null");
            } else if (objM13492g == this) {
                sb2.append("this future");
            } else {
                sb2.append(objM13492g.getClass().getName());
                sb2.append(bQBnquXS.IgKK);
                sb2.append(Integer.toHexString(System.identityHashCode(objM13492g)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4 A[EDGE_INSN: B:56:0x00b4->B:36:0x007d BREAK  A[LOOP:0: B:21:0x0041->B:85:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00b4 -> B:36:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC11984n0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
