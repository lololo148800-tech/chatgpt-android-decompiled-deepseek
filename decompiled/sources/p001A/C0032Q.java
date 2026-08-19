package p001A;

import android.hardware.camera2.TotalCaptureResult;
import p105E.C2222a;
import p277L.ExecutorC4828a;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0032Q implements InterfaceC0049Z {

    /* JADX INFO: renamed from: a */
    public final C0088t f157a;

    /* JADX INFO: renamed from: b */
    public final C2222a f158b;

    /* JADX INFO: renamed from: c */
    public final int f159c;

    /* JADX INFO: renamed from: d */
    public boolean f160d = false;

    public C0032Q(C0088t c0088t, int i10, C2222a c2222a) {
        this.f157a = c0088t;
        this.f159c = i10;
        this.f158b = c2222a;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo170a(TotalCaptureResult totalCaptureResult) {
        if (!C0063g0.m240g(this.f159c, totalCaptureResult)) {
            return AbstractC5229k.m5779c(Boolean.FALSE);
        }
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "Trigger AE");
        this.f160d = true;
        C5222d c5222dM5765c = C5222d.m5765c(AbstractC16347a.m17947b(new C0072l(this, 3)));
        C0030P c0030p = new C0030P(0);
        ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
        c5222dM5765c.getClass();
        return AbstractC5229k.m5782f(c5222dM5765c, new C7296c(c0030p, 18), executorC4828aM9240b);
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: b */
    public final boolean mo171b() {
        return this.f159c == 0;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: c */
    public final void mo172c() {
        if (this.f160d) {
            AbstractC8072d6.m8486c("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.f157a.f374s0.m10a(false, true);
            this.f158b.f6806b = false;
        }
    }
}
