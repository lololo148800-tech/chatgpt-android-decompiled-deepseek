package p501Ub;

import com.auth0.android.request.internal.RunnableC11843b;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p277L.ExecutorC4828a;
import p301M.RunnableC5228j;
import p594Y9.C9895g4;
import p746fa.C13599h;
import p746fa.C13606o;
import p960q9.C18655i;

/* JADX INFO: renamed from: Ub.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC7613o implements Executor {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24061Y;

    /* JADX INFO: renamed from: Z */
    public final Object f24062Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f24063o0;

    /* JADX INFO: renamed from: p0 */
    public Object f24064p0;

    /* JADX INFO: renamed from: q0 */
    public Object f24065q0;

    public /* synthetic */ ExecutorC7613o(Executor executor, C9895g4 c9895g4, C18655i c18655i, C13599h c13599h) {
        this.f24061Y = 0;
        this.f24062Z = executor;
        this.f24063o0 = c9895g4;
        this.f24064p0 = c18655i;
        this.f24065q0 = c13599h;
    }

    /* JADX INFO: renamed from: a */
    private final void m7958a(Runnable runnable) {
        synchronized (this.f24065q0) {
            try {
                ((ArrayDeque) this.f24062Z).add(new RunnableC5228j(this, 20, runnable));
                if (((Runnable) this.f24064p0) == null) {
                    m7960c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m7959b() {
        boolean z6;
        synchronized (this.f24065q0) {
            z6 = !((ArrayDeque) this.f24062Z).isEmpty();
        }
        return z6;
    }

    /* JADX INFO: renamed from: c */
    public void m7960c() {
        switch (this.f24061Y) {
            case 1:
                Runnable runnable = (Runnable) ((ArrayDeque) this.f24062Z).poll();
                this.f24064p0 = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.f24063o0).execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f24062Z) {
                    try {
                        Runnable runnable2 = (Runnable) ((ArrayDeque) this.f24063o0).poll();
                        this.f24065q0 = runnable2;
                        if (runnable2 != null) {
                            ((ExecutorC4828a) this.f24064p0).execute(runnable2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f24061Y) {
            case 0:
                try {
                    ((Executor) this.f24062Z).execute(runnable);
                    return;
                } catch (RuntimeException e10) {
                    if (((C13606o) ((C9895g4) this.f24063o0).f29409Y).m15131j()) {
                        ((C18655i) this.f24064p0).m20028h();
                    } else {
                        ((C13599h) this.f24065q0).m15113a(e10);
                    }
                    throw e10;
                }
            case 1:
                m7958a(runnable);
                return;
            default:
                synchronized (this.f24062Z) {
                    try {
                        ((ArrayDeque) this.f24063o0).add(new RunnableC11843b(this, 29, runnable));
                        if (((Runnable) this.f24065q0) == null) {
                            m7960c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public ExecutorC7613o(ExecutorService executorService) {
        this.f24061Y = 1;
        this.f24063o0 = executorService;
        this.f24062Z = new ArrayDeque();
        this.f24065q0 = new Object();
    }

    public ExecutorC7613o(ExecutorC4828a executorC4828a) {
        this.f24061Y = 2;
        this.f24062Z = new Object();
        this.f24063o0 = new ArrayDeque();
        this.f24064p0 = executorC4828a;
    }
}
