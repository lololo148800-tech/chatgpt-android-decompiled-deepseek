package to;

import java.net.SocketTimeoutException;
import p026Ao.C0672f;
import p571X9.AbstractC9306j0;
import p950po.C18528b;

/* JADX INFO: renamed from: to.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C20029t extends C0672f {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C20030u f63427m;

    public C20029t(C20030u c20030u) {
        this.f63427m = c20030u;
    }

    @Override // p026Ao.C0672f
    /* JADX INFO: renamed from: k */
    public final void mo1385k() {
        this.f63427m.m20838e(9);
        C20022m c20022m = this.f63427m.f63429b;
        synchronized (c20022m) {
            long j10 = c20022m.f63398z0;
            long j11 = c20022m.f63397y0;
            if (j10 < j11) {
                return;
            }
            c20022m.f63397y0 = j11 + 1;
            c20022m.f63374A0 = System.nanoTime() + ((long) 1000000000);
            c20022m.f63392t0.m19890c(new C18528b(AbstractC9306j0.m9891j(c20022m.f63387o0, " ping", new StringBuilder()), 2, c20022m), 0L);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m20833l() {
        if (m1414j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
