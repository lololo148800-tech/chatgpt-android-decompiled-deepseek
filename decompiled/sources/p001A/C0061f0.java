package p001A;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.TimeUnit;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0061f0 implements InterfaceC0049Z {

    /* JADX INFO: renamed from: g */
    public static final long f273g = TimeUnit.SECONDS.toNanos(2);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f274h = 0;

    /* JADX INFO: renamed from: a */
    public final C0088t f275a;

    /* JADX INFO: renamed from: b */
    public final int f276b;

    /* JADX INFO: renamed from: c */
    public boolean f277c = false;

    /* JADX INFO: renamed from: d */
    public final ExecutorC4836i f278d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorServiceC4831d f279e;

    /* JADX INFO: renamed from: f */
    public final boolean f280f;

    public C0061f0(C0088t c0088t, int i10, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, boolean z6) {
        this.f275a = c0088t;
        this.f276b = i10;
        this.f278d = executorC4836i;
        this.f279e = scheduledExecutorServiceC4831d;
        this.f280f = z6;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo170a(TotalCaptureResult totalCaptureResult) {
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C0063g0.m240g(this.f276b, totalCaptureResult));
        if (C0063g0.m240g(this.f276b, totalCaptureResult)) {
            if (!this.f275a.f359C0) {
                AbstractC8072d6.m8486c("Camera2CapturePipeline", "Turn on torch");
                this.f277c = true;
                C5222d c5222dM5765c = C5222d.m5765c(AbstractC16347a.m17947b(new C0059e0(this, 0)));
                C0059e0 c0059e0 = new C0059e0(this, 1);
                ExecutorC4836i executorC4836i = this.f278d;
                c5222dM5765c.getClass();
                return AbstractC5229k.m5782f(AbstractC5229k.m5782f(AbstractC5229k.m5782f(c5222dM5765c, c0059e0, executorC4836i), new C0059e0(this, 2), this.f278d), new C7296c(new C0030P(6), 18), AbstractC8577W2.m9240b());
            }
            AbstractC8072d6.m8486c("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return AbstractC5229k.m5779c(Boolean.FALSE);
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: b */
    public final boolean mo171b() {
        return this.f276b == 0;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: c */
    public final void mo172c() {
        if (this.f277c) {
            C0088t c0088t = this.f275a;
            c0088t.f376u0.m192d(null, false);
            AbstractC8072d6.m8486c("Camera2CapturePipeline", "Turning off torch");
            if (this.f280f) {
                c0088t.f374s0.m10a(false, true);
            }
        }
    }
}
