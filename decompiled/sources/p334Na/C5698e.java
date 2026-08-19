package p334Na;

import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import p357Oa.AbstractRunnableC6156i;
import p357Oa.C6161n;
import p477Tb.C7296c;
import p746fa.C13599h;

/* JADX INFO: renamed from: Na.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5698e extends AbstractRunnableC6156i {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f18470Z = 0;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13599h f18471o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f18472p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f18473q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5698e(C5700g c5700g, C13599h c13599h, String str, C13599h c13599h2) {
        super(c13599h);
        this.f18473q0 = c5700g;
        this.f18472p0 = str;
        this.f18471o0 = c13599h2;
    }

    @Override // p357Oa.AbstractRunnableC6156i
    /* JADX INFO: renamed from: a */
    public final void mo6140a() {
        switch (this.f18470Z) {
            case 0:
                C13599h c13599h = this.f18471o0;
                C5700g c5700g = (C5700g) this.f18473q0;
                String str = (String) this.f18472p0;
                try {
                    c5700g.f18480a.f20062m.mo6713f(c5700g.f18481b, C5700g.m6141a(c5700g, str), new BinderC5699f(c5700g, c13599h, str));
                    return;
                } catch (RemoteException e10) {
                    C7296c c7296c = C5700g.f18478e;
                    Object[] objArr = {str};
                    c7296c.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        AbstractC15256t.m16466d("PlayCore", C7296c.m7748L((String) c7296c.f23104Z, "requestUpdateInfo(%s)", objArr), e10);
                    }
                    c13599h.m15115c(new RuntimeException(e10));
                    return;
                }
            default:
                synchronized (((C6161n) this.f18473q0).f20055f) {
                    try {
                        C6161n c6161n = (C6161n) this.f18473q0;
                        C13599h c13599h2 = this.f18471o0;
                        c6161n.f20054e.add(c13599h2);
                        c13599h2.f42961a.m15122a(new C15384c(c6161n, 11, c13599h2));
                        if (((C6161n) this.f18473q0).f20060k.getAndIncrement() > 0) {
                            ((C6161n) this.f18473q0).f20051b.m7758K("Already connected to the service.", new Object[0]);
                        }
                        C6161n.m6716b((C6161n) this.f18473q0, (C5698e) this.f18472p0);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5698e(C6161n c6161n, C13599h c13599h, C13599h c13599h2, C5698e c5698e) {
        super(c13599h);
        this.f18473q0 = c6161n;
        this.f18471o0 = c13599h2;
        this.f18472p0 = c5698e;
    }
}
