package p001A;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p178H.InterfaceC3122O;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.RunnableC5220b;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p610Z1.C10145l;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0057d0 implements InterfaceC0049Z {

    /* JADX INFO: renamed from: f */
    public static final long f264f = TimeUnit.SECONDS.toNanos(2);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f265g = 0;

    /* JADX INFO: renamed from: a */
    public final C0088t f266a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC4836i f267b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorServiceC4831d f268c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3122O f269d;

    /* JADX INFO: renamed from: e */
    public final C7296c f270e;

    public C0057d0(C0088t c0088t, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, C7296c c7296c) {
        this.f266a = c0088t;
        this.f267b = executorC4836i;
        this.f268c = scheduledExecutorServiceC4831d;
        this.f270e = c7296c;
        InterfaceC3122O interfaceC3122O = c0088t.f358B0;
        Objects.requireNonNull(interfaceC3122O);
        this.f269d = interfaceC3122O;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo170a(TotalCaptureResult totalCaptureResult) {
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        AtomicReference atomicReference = new AtomicReference();
        C10145l c10145lM17947b = AbstractC16347a.m17947b(new C0072l(atomicReference, 8));
        C5222d c5222dM5765c = C5222d.m5765c(AbstractC16347a.m17947b(new C0100z(this, 1, atomicReference)));
        C0055c0 c0055c0 = new C0055c0(this, 0);
        c5222dM5765c.getClass();
        ExecutorC4836i executorC4836i = this.f267b;
        RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(AbstractC5229k.m5782f(AbstractC5229k.m5782f(AbstractC5229k.m5782f(AbstractC5229k.m5782f(c5222dM5765c, c0055c0, executorC4836i), new C0055c0(this, 1), executorC4836i), new C0100z(this, 2, c10145lM17947b), executorC4836i), new C0055c0(this, 2), executorC4836i), new C0055c0(this, 3), executorC4836i);
        C0030P c0030p = new C0030P(5);
        return AbstractC5229k.m5782f(runnableC5220bM5782f, new C7296c(c0030p, 18), AbstractC8577W2.m9240b());
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: b */
    public final boolean mo171b() {
        return false;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: c */
    public final void mo172c() {
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
        boolean zM7756H = this.f270e.m7756H();
        C0088t c0088t = this.f266a;
        if (zM7756H) {
            c0088t.m300d(false);
        }
        c0088t.f374s0.m12c(false).mo5766a(new RunnableC0068j(1), this.f267b);
        c0088t.f374s0.m10a(false, true);
        ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831dM9243e = AbstractC8577W2.m9243e();
        InterfaceC3122O interfaceC3122O = this.f269d;
        Objects.requireNonNull(interfaceC3122O);
        scheduledExecutorServiceC4831dM9243e.execute(new RunnableC0000A(interfaceC3122O, 4));
    }
}
