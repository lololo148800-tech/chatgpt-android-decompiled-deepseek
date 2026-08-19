package p746fa;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: fa.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13601j implements InterfaceC13596e, InterfaceC13595d, InterfaceC13593b {

    /* JADX INFO: renamed from: Y */
    public final Object f42964Y = new Object();

    /* JADX INFO: renamed from: Z */
    public final int f42965Z;

    /* JADX INFO: renamed from: o0 */
    public final C13606o f42966o0;

    /* JADX INFO: renamed from: p0 */
    public int f42967p0;

    /* JADX INFO: renamed from: q0 */
    public int f42968q0;

    /* JADX INFO: renamed from: r0 */
    public int f42969r0;

    /* JADX INFO: renamed from: s0 */
    public Exception f42970s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f42971t0;

    public C13601j(int i10, C13606o c13606o) {
        this.f42965Z = i10;
        this.f42966o0 = c13606o;
    }

    /* JADX INFO: renamed from: a */
    public final void m15117a() {
        int i10 = this.f42967p0 + this.f42968q0 + this.f42969r0;
        int i11 = this.f42965Z;
        if (i10 == i11) {
            Exception exc = this.f42970s0;
            C13606o c13606o = this.f42966o0;
            if (exc == null) {
                if (this.f42971t0) {
                    c13606o.m15136o();
                    return;
                } else {
                    c13606o.m15135n(null);
                    return;
                }
            }
            c13606o.m15134m(new ExecutionException(this.f42968q0 + " out of " + i11 + " underlying tasks failed", this.f42970s0));
        }
    }

    @Override // p746fa.InterfaceC13593b
    /* JADX INFO: renamed from: e */
    public final void mo3916e() {
        synchronized (this.f42964Y) {
            this.f42969r0++;
            this.f42971t0 = true;
            m15117a();
        }
    }

    @Override // p746fa.InterfaceC13595d
    public final void onFailure(Exception exc) {
        synchronized (this.f42964Y) {
            this.f42968q0++;
            this.f42970s0 = exc;
            m15117a();
        }
    }

    @Override // p746fa.InterfaceC13596e
    public final void onSuccess(Object obj) {
        synchronized (this.f42964Y) {
            this.f42967p0++;
            m15117a();
        }
    }
}
