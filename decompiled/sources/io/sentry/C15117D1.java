package io.sentry;

/* JADX INFO: renamed from: io.sentry.D1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15117D1 implements InterfaceC15137K0, InterfaceC15141L1 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15126G1 f47067Y;

    public /* synthetic */ C15117D1(C15126G1 c15126g1) {
        this.f47067Y = c15126g1;
    }

    @Override // io.sentry.InterfaceC15141L1
    /* JADX INFO: renamed from: d */
    public void mo269d(C15135J1 c15135j1) {
        C15126G1 c15126g1 = this.f47067Y;
        InterfaceC15167U1 interfaceC15167U1 = c15126g1.f47091q;
        if (interfaceC15167U1 != null) {
            interfaceC15167U1.mo16349c(c15135j1);
        }
        C15123F1 c15123f1 = c15126g1.f47080f;
        C15164T1 c15164t1 = c15126g1.f47092r;
        if (c15164t1.f47222r0 == null) {
            if (c15123f1.f47071a) {
                c15126g1.mo16290u(c15123f1.f47072b, null);
            }
        } else if (!c15164t1.f47221q0 || c15126g1.m16268B()) {
            c15126g1.mo16286q();
        }
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public void mo390f(C15134J0 c15134j0) {
        C15126G1 c15126g1 = this.f47067Y;
        c15126g1.getClass();
        synchronized (c15134j0.f47125m) {
            if (c15134j0.f47113a == c15126g1) {
                c15134j0.m16304a();
            }
        }
    }
}
