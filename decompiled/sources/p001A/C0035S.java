package p001A;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p301M.AbstractC5229k;
import p301M.C5231m;
import p523V9.AbstractC8072d6;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: A.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0035S implements InterfaceC0049Z {

    /* JADX INFO: renamed from: a */
    public final C0088t f185a;

    /* JADX INFO: renamed from: b */
    public boolean f186b = false;

    public C0035S(C0088t c0088t) {
        this.f185a = c0088t;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo170a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        C5231m c5231mM5779c = AbstractC5229k.m5779c(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return c5231mM5779c;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            AbstractC8072d6.m8486c("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                AbstractC8072d6.m8486c("Camera2CapturePipeline", "Trigger AF");
                this.f186b = true;
                this.f185a.f374s0.m15f(false);
            }
        }
        return c5231mM5779c;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: b */
    public final boolean mo171b() {
        return true;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: c */
    public final void mo172c() {
        if (this.f186b) {
            AbstractC8072d6.m8486c("Camera2CapturePipeline", "cancel TriggerAF");
            this.f185a.f374s0.m10a(true, false);
        }
    }
}
