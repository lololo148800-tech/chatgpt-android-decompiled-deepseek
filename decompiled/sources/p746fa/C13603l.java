package p746fa;

import java.util.concurrent.Executor;
import p003A1.RunnableC0153B;
import p277L.ExecutorC4828a;
import p301M.RunnableC5228j;

/* JADX INFO: renamed from: fa.l */
/* JADX INFO: loaded from: classes.dex */
public final class C13603l implements InterfaceC13604m, InterfaceC13596e, InterfaceC13595d, InterfaceC13593b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42976Y;

    /* JADX INFO: renamed from: Z */
    public final Object f42977Z;

    /* JADX INFO: renamed from: o0 */
    public final Executor f42978o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f42979p0;

    public C13603l(ExecutorC4828a executorC4828a, InterfaceC13593b interfaceC13593b) {
        this.f42976Y = 0;
        this.f42977Z = new Object();
        this.f42978o0 = executorC4828a;
        this.f42979p0 = interfaceC13593b;
    }

    /* JADX INFO: renamed from: b */
    private final void m15119b(C13606o c13606o) {
        synchronized (this.f42977Z) {
        }
        this.f42978o0.execute(new RunnableC5228j(this, c13606o, false, 24));
    }

    /* JADX INFO: renamed from: c */
    private final void m15120c(C13606o c13606o) {
        if (c13606o.m15132k() || c13606o.f42985d) {
            return;
        }
        synchronized (this.f42977Z) {
            try {
                if (((InterfaceC13595d) this.f42979p0) == null) {
                    return;
                }
                this.f42978o0.execute(new RunnableC5228j(this, c13606o, false, 25));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m15121d(C13606o c13606o) {
        if (c13606o.m15132k()) {
            synchronized (this.f42977Z) {
                try {
                    if (((InterfaceC13596e) this.f42979p0) == null) {
                        return;
                    }
                    this.f42978o0.execute(new RunnableC5228j(this, c13606o, false, 26));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p746fa.InterfaceC13604m
    /* JADX INFO: renamed from: a */
    public final void mo15118a(C13606o c13606o) {
        switch (this.f42976Y) {
            case 0:
                if (c13606o.f42985d) {
                    synchronized (this.f42977Z) {
                        try {
                            if (((InterfaceC13593b) this.f42979p0) != null) {
                                ExecutorC4828a executorC4828a = (ExecutorC4828a) this.f42978o0;
                                RunnableC0153B runnableC0153B = new RunnableC0153B(this, 19);
                                executorC4828a.getClass();
                                runnableC0153B.run();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 1:
                m15119b(c13606o);
                return;
            case 2:
                m15120c(c13606o);
                return;
            case 3:
                m15121d(c13606o);
                return;
            default:
                this.f42978o0.execute(new RunnableC5228j(this, c13606o, false, 27));
                return;
        }
    }

    @Override // p746fa.InterfaceC13593b
    /* JADX INFO: renamed from: e */
    public void mo3916e() {
        ((C13606o) this.f42979p0).m15136o();
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        ((C13606o) this.f42979p0).m15134m(exc);
    }

    @Override // p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        ((C13606o) this.f42979p0).m15135n(obj);
    }

    public C13603l(Executor executor, InterfaceC13594c interfaceC13594c) {
        this.f42976Y = 1;
        this.f42977Z = new Object();
        this.f42978o0 = executor;
        this.f42979p0 = interfaceC13594c;
    }

    public C13603l(Executor executor, InterfaceC13595d interfaceC13595d) {
        this.f42976Y = 2;
        this.f42977Z = new Object();
        this.f42978o0 = executor;
        this.f42979p0 = interfaceC13595d;
    }

    public C13603l(Executor executor, InterfaceC13596e interfaceC13596e) {
        this.f42976Y = 3;
        this.f42977Z = new Object();
        this.f42978o0 = executor;
        this.f42979p0 = interfaceC13596e;
    }

    public C13603l(Executor executor, InterfaceC13598g interfaceC13598g, C13606o c13606o) {
        this.f42976Y = 4;
        this.f42978o0 = executor;
        this.f42977Z = interfaceC13598g;
        this.f42979p0 = c13606o;
    }
}
