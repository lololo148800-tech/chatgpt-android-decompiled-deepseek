package com.google.android.gms.internal.play_billing;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w2 */
/* JADX INFO: loaded from: classes.dex */
public class C12022w2 implements InterfaceFutureC12028y0 {

    /* JADX INFO: renamed from: p0 */
    public static final boolean f36345p0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: q0 */
    public static final Logger f36346q0 = Logger.getLogger(C12022w2.class.getName());

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC11957g1 f36347r0;

    /* JADX INFO: renamed from: s0 */
    public static final Object f36348s0;

    /* JADX INFO: renamed from: Y */
    public volatile Object f36349Y;

    /* JADX INFO: renamed from: Z */
    public volatile C11886K1 f36350Z;

    /* JADX INFO: renamed from: o0 */
    public volatile C12018v2 f36351o0;

    /* JADX INFO: renamed from: d */
    public static void m13550d(C12022w2 c12022w2) {
        C12018v2 c12018v2;
        C11886K1 c11886k1;
        C11886K1 c11886k2;
        C11886K1 c11886k3;
        do {
            c12018v2 = c12022w2.f36351o0;
        } while (!f36347r0.mo13463I(c12022w2, c12018v2, C12018v2.f36339c));
        while (true) {
            c11886k1 = null;
            if (c12018v2 == null) {
                break;
            }
            Thread thread = c12018v2.f36340a;
            if (thread != null) {
                c12018v2.f36340a = null;
                LockSupport.unpark(thread);
            }
            c12018v2 = c12018v2.f36341b;
        }
        do {
            c11886k2 = c12022w2.f36350Z;
        } while (!f36347r0.mo13461A(c12022w2, c11886k2, C11886K1.f36156d));
        while (true) {
            c11886k3 = c11886k1;
            c11886k1 = c11886k2;
            if (c11886k1 == null) {
                break;
            }
            c11886k2 = c11886k1.f36159c;
            c11886k1.f36159c = c11886k3;
        }
        while (c11886k3 != null) {
            Runnable runnable = c11886k3.f36157a;
            C11886K1 c11886k4 = c11886k3.f36159c;
            m13551f(runnable, c11886k3.f36158b);
            c11886k3 = c11886k4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m13551f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f36346q0.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", AbstractC10763a.m11055m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Object m13552h(Object obj) throws ExecutionException {
        if (obj instanceof C11920W0) {
            CancellationException cancellationException = ((C11920W0) obj).f36209a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C12009t1) {
            throw new ExecutionException(((C12009t1) obj).f36332a);
        }
        if (obj == f36348s0) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC12028y0
    /* JADX INFO: renamed from: b */
    public final void mo13259b(Runnable runnable, Executor executor) {
        executor.getClass();
        C11886K1 c11886k1 = this.f36350Z;
        C11886K1 c11886k2 = C11886K1.f36156d;
        if (c11886k1 != c11886k2) {
            C11886K1 c11886k3 = new C11886K1(runnable, executor);
            do {
                c11886k3.f36159c = c11886k1;
                if (f36347r0.mo13461A(this, c11886k1, c11886k3)) {
                    return;
                } else {
                    c11886k1 = this.f36350Z;
                }
            } while (c11886k1 != c11886k2);
        }
        m13551f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo13553c() {
        if (this instanceof ScheduledFuture) {
            return AbstractC0168G.m533v("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        C11920W0 c11920w0;
        Object obj = this.f36349Y;
        if (obj != null) {
            return false;
        }
        if (f36345p0) {
            c11920w0 = new C11920W0(new CancellationException("Future.cancel() was called."));
        } else {
            c11920w0 = z6 ? C11920W0.f36207b : C11920W0.f36208c;
        }
        if (!f36347r0.mo13462D(this, obj, c11920w0)) {
            return false;
        }
        m13550d(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m13554e(StringBuilder sb2) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                } catch (Throwable th2) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    /* JADX INFO: renamed from: g */
    public final void m13555g(C12018v2 c12018v2) {
        c12018v2.f36340a = null;
        while (true) {
            C12018v2 c12018v3 = this.f36351o0;
            if (c12018v3 != C12018v2.f36339c) {
                C12018v2 c12018v4 = null;
                while (c12018v3 != null) {
                    C12018v2 c12018v5 = c12018v3.f36341b;
                    if (c12018v3.f36340a != null) {
                        c12018v4 = c12018v3;
                    } else if (c12018v4 != null) {
                        c12018v4.f36341b = c12018v5;
                        if (c12018v4.f36340a == null) {
                        }
                    } else if (!f36347r0.mo13463I(this, c12018v3, c12018v5)) {
                    }
                    c12018v3 = c12018v5;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f36349Y;
        if (obj2 != null) {
            return m13552h(obj2);
        }
        C12018v2 c12018v2 = this.f36351o0;
        C12018v2 c12018v3 = C12018v2.f36339c;
        if (c12018v2 != c12018v3) {
            C12018v2 c12018v4 = new C12018v2();
            do {
                AbstractC11957g1 abstractC11957g1 = f36347r0;
                abstractC11957g1.mo13464k(c12018v4, c12018v2);
                if (abstractC11957g1.mo13463I(this, c12018v2, c12018v4)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m13555g(c12018v4);
                            throw new InterruptedException();
                        }
                        obj = this.f36349Y;
                    } while (obj == null);
                    return m13552h(obj);
                }
                c12018v2 = this.f36351o0;
            } while (c12018v2 != c12018v3);
        }
        return m13552h(this.f36349Y);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36349Y instanceof C11920W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f36349Y != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f36349Y instanceof C11920W0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m13554e(sb2);
        } else {
            try {
                strConcat = mo13553c();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                m13554e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    static {
        AbstractC11957g1 c12014u2;
        try {
            c12014u2 = new C11966i2(AtomicReferenceFieldUpdater.newUpdater(C12018v2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C12018v2.class, C12018v2.class, HJrCuD.mTNOrlYkAnl), AtomicReferenceFieldUpdater.newUpdater(C12022w2.class, C12018v2.class, "o0"), AtomicReferenceFieldUpdater.newUpdater(C12022w2.class, C11886K1.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(C12022w2.class, Object.class, "Y"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c12014u2 = new C12014u2(9);
        }
        Throwable th3 = th;
        f36347r0 = c12014u2;
        if (th3 != null) {
            f36346q0.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f36348s0 = new Object();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f36349Y;
            if (obj != null) {
                return m13552h(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C12018v2 c12018v2 = this.f36351o0;
                C12018v2 c12018v3 = C12018v2.f36339c;
                if (c12018v2 != c12018v3) {
                    C12018v2 c12018v4 = new C12018v2();
                    while (true) {
                        AbstractC11957g1 abstractC11957g1 = f36347r0;
                        abstractC11957g1.mo13464k(c12018v4, c12018v2);
                        if (abstractC11957g1.mo13463I(this, c12018v2, c12018v4)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f36349Y;
                                    if (obj2 != null) {
                                        return m13552h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m13555g(c12018v4);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m13555g(c12018v4);
                            break;
                        }
                        c12018v2 = this.f36351o0;
                        if (c12018v2 == c12018v3) {
                        }
                    }
                }
                return m13552h(this.f36349Y);
            }
            while (nanos > 0) {
                Object obj3 = this.f36349Y;
                if (obj3 != null) {
                    return m13552h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + Separators.f31991SP + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                boolean z6 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z6 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + Separators.f31991SP + lowerCase;
                    if (z6) {
                        strConcat3 = strConcat3.concat(Separators.COMMA);
                    }
                    strConcat2 = strConcat3.concat(Separators.f31991SP);
                }
                if (z6) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC9306j0.m9890i(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
