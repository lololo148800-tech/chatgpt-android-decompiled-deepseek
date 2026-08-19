package p001A;

import java.util.concurrent.TimeUnit;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.C5226h;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.e0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0059e0 implements InterfaceC10143j, InterfaceC5219a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f271Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0061f0 f272Z;

    public /* synthetic */ C0059e0(C0061f0 c0061f0, int i10) {
        this.f271Y = i10;
        this.f272Z = c0061f0;
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        switch (this.f271Y) {
            case 1:
                C0061f0 c0061f0 = this.f272Z;
                if (!c0061f0.f280f) {
                    return C5231m.f16977o0;
                }
                C0007D0 c0007d0 = c0061f0.f275a.f374s0;
                c0007d0.getClass();
                return AbstractC16347a.m17947b(new C0072l(c0007d0, 9));
            default:
                C0030P c0030p = new C0030P(7);
                C0061f0 c0061f1 = this.f272Z;
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d = c0061f1.f279e;
                long millis = TimeUnit.NANOSECONDS.toMillis(C0061f0.f273g);
                C0051a0 c0051a0 = new C0051a0(c0030p);
                C0088t c0088t = c0061f1.f275a;
                c0088t.m297a(c0051a0);
                RunnableC0074m runnableC0074m = new RunnableC0074m(c0088t, 7, c0051a0);
                C10145l c10145l = c0051a0.f241b;
                c10145l.f30070Z.mo5766a(runnableC0074m, c0088t.f369Z);
                return AbstractC16347a.m17947b(new C5226h(c10145l, scheduledExecutorServiceC4831d, millis, 0));
        }
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        this.f272Z.f275a.f376u0.m192d(c10142i, true);
        return "TorchOn";
    }
}
