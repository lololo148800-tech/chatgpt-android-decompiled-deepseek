package p746fa;

import java.util.concurrent.Executor;
import p301M.RunnableC5228j;

/* JADX INFO: renamed from: fa.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13602k implements InterfaceC13604m, InterfaceC13596e, InterfaceC13595d, InterfaceC13593b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42972Y;

    /* JADX INFO: renamed from: Z */
    public final Executor f42973Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13592a f42974o0;

    /* JADX INFO: renamed from: p0 */
    public final C13606o f42975p0;

    public /* synthetic */ C13602k(Executor executor, InterfaceC13592a interfaceC13592a, C13606o c13606o, int i10) {
        this.f42972Y = i10;
        this.f42973Z = executor;
        this.f42974o0 = interfaceC13592a;
        this.f42975p0 = c13606o;
    }

    @Override // p746fa.InterfaceC13604m
    /* JADX INFO: renamed from: a */
    public final void mo15118a(C13606o c13606o) {
        switch (this.f42972Y) {
            case 0:
                this.f42973Z.execute(new RunnableC5228j(this, c13606o, false, 22));
                break;
            default:
                this.f42973Z.execute(new RunnableC5228j(this, c13606o, false, 23));
                break;
        }
    }

    @Override // p746fa.InterfaceC13593b
    /* JADX INFO: renamed from: e */
    public void mo3916e() {
        this.f42975p0.m15136o();
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        this.f42975p0.m15134m(exc);
    }

    @Override // p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        this.f42975p0.m15135n(obj);
    }
}
