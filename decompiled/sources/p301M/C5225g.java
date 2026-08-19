package p301M;

import p202I.InterfaceC3531g;
import p277L.ExecutorC4828a;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: M.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5225g implements InterfaceC10143j, InterfaceC5219a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16966Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceFutureC13608b f16967Z;

    public /* synthetic */ C5225g(InterfaceFutureC13608b interfaceFutureC13608b, int i10) {
        this.f16966Y = i10;
        this.f16967Z = interfaceFutureC13608b;
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        switch (this.f16966Y) {
            case 2:
                return ((InterfaceC3531g) this.f16967Z.get()).mo195a();
            default:
                return ((InterfaceC3531g) this.f16967Z.get()).mo196b();
        }
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f16966Y) {
            case 0:
                RunnableC5227i runnableC5227i = new RunnableC5227i(c10142i, 0);
                ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
                InterfaceFutureC13608b interfaceFutureC13608b = this.f16967Z;
                interfaceFutureC13608b.mo5766a(runnableC5227i, executorC4828aM9240b);
                return "transformVoidFuture [" + interfaceFutureC13608b + "]";
            default:
                ExecutorC4828a executorC4828aM9240b2 = AbstractC8577W2.m9240b();
                InterfaceFutureC13608b interfaceFutureC13608b2 = this.f16967Z;
                AbstractC5229k.m5781e(false, interfaceFutureC13608b2, c10142i, executorC4828aM9240b2);
                return "nonCancellationPropagating[" + interfaceFutureC13608b2 + "]";
        }
    }
}
