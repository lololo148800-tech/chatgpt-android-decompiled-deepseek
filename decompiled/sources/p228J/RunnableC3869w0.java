package p228J;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p817j$.util.Objects;

/* JADX INFO: renamed from: J.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3869w0 implements Runnable {

    /* JADX INFO: renamed from: t0 */
    public static final Object f11695t0 = new Object();

    /* JADX INFO: renamed from: Y */
    public final Executor f11696Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC3831d0 f11697Z;

    /* JADX INFO: renamed from: p0 */
    public final AtomicReference f11699p0;

    /* JADX INFO: renamed from: o0 */
    public final AtomicBoolean f11698o0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q0 */
    public Object f11700q0 = f11695t0;

    /* JADX INFO: renamed from: r0 */
    public int f11701r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public boolean f11702s0 = false;

    public RunnableC3869w0(AtomicReference atomicReference, Executor executor, InterfaceC3831d0 interfaceC3831d0) {
        this.f11699p0 = atomicReference;
        this.f11696Y = executor;
        this.f11697Z = interfaceC3831d0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4592a(int i10) {
        synchronized (this) {
            try {
                if (this.f11698o0.get()) {
                    if (i10 <= this.f11701r0) {
                        return;
                    }
                    this.f11701r0 = i10;
                    if (this.f11702s0) {
                        return;
                    }
                    this.f11702s0 = true;
                    try {
                        this.f11696Y.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f11702s0 = false;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f11698o0.get()) {
                    this.f11702s0 = false;
                    return;
                }
                Object obj = this.f11699p0.get();
                int i10 = this.f11701r0;
                while (true) {
                    if (!Objects.equals(this.f11700q0, obj)) {
                        this.f11700q0 = obj;
                        if (obj instanceof AbstractC3834f) {
                            InterfaceC3831d0 interfaceC3831d0 = this.f11697Z;
                            ((AbstractC3834f) obj).getClass();
                            interfaceC3831d0.onError(null);
                        } else {
                            this.f11697Z.mo207A(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i10 == this.f11701r0 || !this.f11698o0.get()) {
                                break;
                                break;
                            } else {
                                obj = this.f11699p0.get();
                                i10 = this.f11701r0;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.f11702s0 = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
