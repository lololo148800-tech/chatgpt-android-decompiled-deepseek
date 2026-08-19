package p610Z1;

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
import p571X9.AbstractC9306j0;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p747fb.InterfaceFutureC13608b;
import p832jb.AbstractC16182b;

/* JADX INFO: renamed from: Z1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10141h implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: p0 */
    public static final boolean f30057p0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: q0 */
    public static final Logger f30058q0 = Logger.getLogger(AbstractC10141h.class.getName());

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC16182b f30059r0;

    /* JADX INFO: renamed from: s0 */
    public static final Object f30060s0;

    /* JADX INFO: renamed from: Y */
    public volatile Object f30061Y;

    /* JADX INFO: renamed from: Z */
    public volatile C10137d f30062Z;

    /* JADX INFO: renamed from: o0 */
    public volatile C10140g f30063o0;

    static {
        AbstractC16182b c10139f;
        try {
            c10139f = new C10138e(AtomicReferenceFieldUpdater.newUpdater(C10140g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C10140g.class, C10140g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC10141h.class, C10140g.class, "o0"), AtomicReferenceFieldUpdater.newUpdater(AbstractC10141h.class, C10137d.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractC10141h.class, Object.class, "Y"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c10139f = new C10139f();
        }
        f30059r0 = c10139f;
        if (th != null) {
            f30058q0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f30060s0 = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m10737e(AbstractC10141h abstractC10141h) {
        C10140g c10140g;
        C10137d c10137d;
        C10137d c10137d2;
        C10137d c10137d3;
        do {
            c10140g = abstractC10141h.f30063o0;
        } while (!f30059r0.mo10734d(abstractC10141h, c10140g, C10140g.f30054c));
        while (true) {
            c10137d = null;
            if (c10140g == null) {
                break;
            }
            Thread thread = c10140g.f30055a;
            if (thread != null) {
                c10140g.f30055a = null;
                LockSupport.unpark(thread);
            }
            c10140g = c10140g.f30056b;
        }
        abstractC10141h.mo10742d();
        do {
            c10137d2 = abstractC10141h.f30062Z;
        } while (!f30059r0.mo10732b(abstractC10141h, c10137d2, C10137d.f30045d));
        while (true) {
            c10137d3 = c10137d;
            c10137d = c10137d2;
            if (c10137d == null) {
                break;
            }
            c10137d2 = c10137d.f30048c;
            c10137d.f30048c = c10137d3;
        }
        while (c10137d3 != null) {
            C10137d c10137d4 = c10137d3.f30048c;
            m10738f(c10137d3.f30046a, c10137d3.f30047b);
            c10137d3 = c10137d4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10738f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f30058q0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m10739g(Object obj) throws ExecutionException {
        if (obj instanceof C10134a) {
            CancellationException cancellationException = ((C10134a) obj).f30042b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C10136c) {
            throw new ExecutionException(((C10136c) obj).f30044a);
        }
        if (obj == f30060s0) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m10740h(InterfaceFutureC13608b interfaceFutureC13608b) {
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
        C10137d c10137d = this.f30062Z;
        C10137d c10137d2 = C10137d.f30045d;
        if (c10137d != c10137d2) {
            C10137d c10137d3 = new C10137d(runnable, executor);
            do {
                c10137d3.f30048c = c10137d;
                if (f30059r0.mo10732b(this, c10137d, c10137d3)) {
                    return;
                } else {
                    c10137d = this.f30062Z;
                }
            } while (c10137d != c10137d2);
        }
        m10738f(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m10741c(StringBuilder sb2) {
        try {
            Object objM10740h = m10740h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objM10740h == this ? "this future" : String.valueOf(objM10740h));
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
        C10134a c10134a;
        Object obj = this.f30061Y;
        if (obj != null) {
            return false;
        }
        if (f30057p0) {
            c10134a = new C10134a(z6, new CancellationException("Future.cancel() was called."));
        } else {
            c10134a = z6 ? C10134a.f30039c : C10134a.f30040d;
        }
        if (!f30059r0.mo10733c(this, obj, c10134a)) {
            return false;
        }
        m10737e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f30061Y;
        if (obj != null) {
            return m10739g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C10140g c10140g = this.f30063o0;
            C10140g c10140g2 = C10140g.f30054c;
            if (c10140g != c10140g2) {
                C10140g c10140g3 = new C10140g();
                while (true) {
                    AbstractC16182b abstractC16182b = f30059r0;
                    abstractC16182b.mo10735e(c10140g3, c10140g);
                    if (abstractC16182b.mo10734d(this, c10140g, c10140g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m10744j(c10140g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f30061Y;
                            if (obj2 != null) {
                                return m10739g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10744j(c10140g3);
                        break;
                    }
                    c10140g = this.f30063o0;
                    if (c10140g == c10140g2) {
                    }
                }
            }
            return m10739g(this.f30061Y);
        }
        while (nanos > 0) {
            Object obj3 = this.f30061Y;
            if (obj3 != null) {
                return m10739g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM9894m = AbstractC9306j0.m9894m("Waited ", j10, Separators.f31991SP);
        sbM9894m.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM9894m.toString();
        if (nanos + 1000 < 0) {
            String strM11052j = AbstractC10763a.m11052j(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM11052j2 = strM11052j + jConvert + Separators.f31991SP + lowerCase;
                if (z6) {
                    strM11052j2 = AbstractC10763a.m11052j(strM11052j2, Separators.COMMA);
                }
                strM11052j = AbstractC10763a.m11052j(strM11052j2, Separators.f31991SP);
            }
            if (z6) {
                strM11052j = strM11052j + nanos2 + " nanoseconds ";
            }
            string3 = AbstractC10763a.m11052j(strM11052j, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC10763a.m11052j(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC9306j0.m9890i(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public String mo10743i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f30061Y instanceof C10134a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f30061Y != null;
    }

    /* JADX INFO: renamed from: j */
    public final void m10744j(C10140g c10140g) {
        c10140g.f30055a = null;
        while (true) {
            C10140g c10140g2 = this.f30063o0;
            if (c10140g2 == C10140g.f30054c) {
                return;
            }
            C10140g c10140g3 = null;
            while (c10140g2 != null) {
                C10140g c10140g4 = c10140g2.f30056b;
                if (c10140g2.f30055a != null) {
                    c10140g3 = c10140g2;
                } else if (c10140g3 != null) {
                    c10140g3.f30056b = c10140g4;
                    if (c10140g3.f30055a == null) {
                    }
                } else if (!f30059r0.mo10734d(this, c10140g2, c10140g4)) {
                }
                c10140g2 = c10140g4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m10745k(Object obj) {
        if (obj == null) {
            obj = f30060s0;
        }
        if (!f30059r0.mo10733c(this, null, obj)) {
            return false;
        }
        m10737e(this);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo10746l(Throwable th2) {
        th2.getClass();
        if (!f30059r0.mo10733c(this, null, new C10136c(th2))) {
            return false;
        }
        m10737e(this);
        return true;
    }

    public final String toString() {
        String strMo10743i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        boolean z6 = this.f30061Y instanceof C10134a;
        String str = MMVKXkcLpuHFDi.XKxOpVeZuVy;
        if (z6) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m10741c(sb2);
        } else {
            try {
                strMo10743i = mo10743i();
            } catch (RuntimeException e10) {
                strMo10743i = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strMo10743i != null && !strMo10743i.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strMo10743i);
                sb2.append(str);
            } else if (isDone()) {
                m10741c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public void mo10742d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f30061Y;
            if (obj2 != null) {
                return m10739g(obj2);
            }
            C10140g c10140g = this.f30063o0;
            C10140g c10140g2 = C10140g.f30054c;
            if (c10140g != c10140g2) {
                C10140g c10140g3 = new C10140g();
                do {
                    AbstractC16182b abstractC16182b = f30059r0;
                    abstractC16182b.mo10735e(c10140g3, c10140g);
                    if (abstractC16182b.mo10734d(this, c10140g, c10140g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f30061Y;
                            } else {
                                m10744j(c10140g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m10739g(obj);
                    }
                    c10140g = this.f30063o0;
                } while (c10140g != c10140g2);
            }
            return m10739g(this.f30061Y);
        }
        throw new InterruptedException();
    }
}
