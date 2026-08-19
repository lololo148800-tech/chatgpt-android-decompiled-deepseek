package p001A;

import java.util.concurrent.TimeUnit;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.C5226h;
import p301M.InterfaceC5219a;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.c0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0055c0 implements InterfaceC5219a, InterfaceC10143j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f258Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0057d0 f259Z;

    public /* synthetic */ C0055c0(C0057d0 c0057d0, int i10) {
        this.f258Y = i10;
        this.f259Z = c0057d0;
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        switch (this.f258Y) {
            case 0:
                return this.f259Z.f266a.f374s0.m12c(true);
            case 1:
                C0057d0 c0057d0 = this.f259Z;
                c0057d0.getClass();
                return AbstractC16347a.m17947b(new C0055c0(c0057d0, 4));
            case 2:
                C0007D0 c0007d0 = this.f259Z.f266a.f374s0;
                c0007d0.getClass();
                return AbstractC16347a.m17947b(new C0072l(c0007d0, 9));
            default:
                C0030P c0030p = new C0030P(4);
                C0057d0 c0057d1 = this.f259Z;
                ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d = c0057d1.f268c;
                long millis = TimeUnit.NANOSECONDS.toMillis(C0057d0.f264f);
                C0051a0 c0051a0 = new C0051a0(c0030p);
                C0088t c0088t = c0057d1.f266a;
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
        C0057d0 c0057d0 = this.f259Z;
        if (!c0057d0.f270e.m7756H()) {
            c10142i.m10747a(null);
            return "EnableTorchInternal";
        }
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
        c0057d0.f266a.m300d(true);
        c10142i.m10747a(null);
        return "EnableTorchInternal";
    }
}
