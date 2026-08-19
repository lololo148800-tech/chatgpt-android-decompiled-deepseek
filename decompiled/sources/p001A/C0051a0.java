package p001A;

import android.hardware.camera2.TotalCaptureResult;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0051a0 implements InterfaceC0086s {

    /* JADX INFO: renamed from: a */
    public C10142i f240a;

    /* JADX INFO: renamed from: b */
    public final C10145l f241b = AbstractC16347a.m17947b(new C0072l(this, 7));

    /* JADX INFO: renamed from: c */
    public final C0030P f242c;

    public C0051a0(C0030P c0030p) {
        this.f242c = c0030p;
    }

    @Override // p001A.InterfaceC0086s
    /* JADX INFO: renamed from: b */
    public final boolean mo3b(TotalCaptureResult totalCaptureResult) {
        boolean zM239f;
        C0030P c0030p = this.f242c;
        if (c0030p != null) {
            switch (c0030p.f151Y) {
                case 2:
                    zM239f = C0063g0.m239f(totalCaptureResult, false);
                    break;
                case 3:
                default:
                    zM239f = C0063g0.m239f(totalCaptureResult, true);
                    break;
                case 4:
                    zM239f = C0063g0.m239f(totalCaptureResult, false);
                    break;
            }
            if (!zM239f) {
                return false;
            }
        }
        this.f240a.m10747a(totalCaptureResult);
        return true;
    }
}
