package p746fa;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p001A.C0093v0;
import p1060v9.AbstractC20502t;
import p556Wk.C8919d0;

/* JADX INFO: renamed from: fa.o */
/* JADX INFO: loaded from: classes.dex */
public final class C13606o {

    /* JADX INFO: renamed from: a */
    public final Object f42982a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0093v0 f42983b = new C0093v0(7);

    /* JADX INFO: renamed from: c */
    public boolean f42984c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f42985d;

    /* JADX INFO: renamed from: e */
    public Object f42986e;

    /* JADX INFO: renamed from: f */
    public Exception f42987f;

    /* JADX INFO: renamed from: a */
    public final void m15122a(InterfaceC13594c interfaceC13594c) {
        this.f42983b.m338B(new C13603l(AbstractC13600i.f42962a, interfaceC13594c));
        m15139r();
    }

    /* JADX INFO: renamed from: b */
    public final void m15123b(Executor executor, InterfaceC13594c interfaceC13594c) {
        this.f42983b.m338B(new C13603l(executor, interfaceC13594c));
        m15139r();
    }

    /* JADX INFO: renamed from: c */
    public final void m15124c(InterfaceC13595d interfaceC13595d) {
        m15125d(AbstractC13600i.f42962a, interfaceC13595d);
    }

    /* JADX INFO: renamed from: d */
    public final void m15125d(Executor executor, InterfaceC13595d interfaceC13595d) {
        this.f42983b.m338B(new C13603l(executor, interfaceC13595d));
        m15139r();
    }

    /* JADX INFO: renamed from: e */
    public final void m15126e(Executor executor, InterfaceC13596e interfaceC13596e) {
        this.f42983b.m338B(new C13603l(executor, interfaceC13596e));
        m15139r();
    }

    /* JADX INFO: renamed from: f */
    public final C13606o m15127f(Executor executor, InterfaceC13592a interfaceC13592a) {
        C13606o c13606o = new C13606o();
        this.f42983b.m338B(new C13602k(executor, interfaceC13592a, c13606o, 0));
        m15139r();
        return c13606o;
    }

    /* JADX INFO: renamed from: g */
    public final C13606o m15128g(Executor executor, InterfaceC13592a interfaceC13592a) {
        C13606o c13606o = new C13606o();
        this.f42983b.m338B(new C13602k(executor, interfaceC13592a, c13606o, 1));
        m15139r();
        return c13606o;
    }

    /* JADX INFO: renamed from: h */
    public final Exception m15129h() {
        Exception exc;
        synchronized (this.f42982a) {
            exc = this.f42987f;
        }
        return exc;
    }

    /* JADX INFO: renamed from: i */
    public final Object m15130i() {
        Object obj;
        synchronized (this.f42982a) {
            try {
                AbstractC20502t.m21159j("Task is not yet complete", this.f42984c);
                if (this.f42985d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f42987f;
                if (exc != null) {
                    throw new C13597f(exc);
                }
                obj = this.f42986e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15131j() {
        boolean z6;
        synchronized (this.f42982a) {
            z6 = this.f42984c;
        }
        return z6;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15132k() {
        boolean z6;
        synchronized (this.f42982a) {
            try {
                z6 = false;
                if (this.f42984c && !this.f42985d && this.f42987f == null) {
                    z6 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: l */
    public final C13606o m15133l(Executor executor, InterfaceC13598g interfaceC13598g) {
        C13606o c13606o = new C13606o();
        this.f42983b.m338B(new C13603l(executor, interfaceC13598g, c13606o));
        m15139r();
        return c13606o;
    }

    /* JADX INFO: renamed from: m */
    public final void m15134m(Exception exc) {
        AbstractC20502t.m21158i(exc, "Exception must not be null");
        synchronized (this.f42982a) {
            m15138q();
            this.f42984c = true;
            this.f42987f = exc;
        }
        this.f42983b.m339C(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m15135n(Object obj) {
        synchronized (this.f42982a) {
            m15138q();
            this.f42984c = true;
            this.f42986e = obj;
        }
        this.f42983b.m339C(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m15136o() {
        synchronized (this.f42982a) {
            try {
                if (this.f42984c) {
                    return;
                }
                this.f42984c = true;
                this.f42985d = true;
                this.f42983b.m339C(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15137p(Object obj) {
        synchronized (this.f42982a) {
            try {
                if (this.f42984c) {
                    return false;
                }
                this.f42984c = true;
                this.f42986e = obj;
                this.f42983b.m339C(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m15138q() {
        String strConcat;
        if (this.f42984c) {
            int i10 = C8919d0.f27290Y;
            if (!m15131j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM15129h = m15129h();
            if (excM15129h != null) {
                strConcat = "failure";
            } else if (m15132k()) {
                strConcat = "result ".concat(String.valueOf(m15130i()));
            } else {
                strConcat = this.f42985d ? "cancellation" : "unknown issue";
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15139r() {
        synchronized (this.f42982a) {
            try {
                if (this.f42984c) {
                    this.f42983b.m339C(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
