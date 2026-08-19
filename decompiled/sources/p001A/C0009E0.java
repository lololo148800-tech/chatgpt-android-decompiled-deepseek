package p001A;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import p003A1.AbstractC0168G;
import p079D.AbstractC1762b;
import p1138z.C21572a;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;

/* JADX INFO: renamed from: A.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009E0 extends C0028O {

    /* JADX INFO: renamed from: b */
    public static final C0009E0 f45b = new C0009E0();

    @Override // p001A.C0028O
    /* JADX INFO: renamed from: a */
    public final void mo16a(C3815Q c3815q, C0063g0 c0063g0) {
        super.mo16a(c3815q, c0063g0);
        if (!(c3815q instanceof C3815Q)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        C3828c c3828c = C3815Q.f11548Z;
        if (c3815q.mo37O(c3828c)) {
            int iIntValue = ((Integer) AbstractC0168G.m519h(c3815q, c3828c)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) AbstractC1762b.f5032a.m4579f(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c3825a0M4558d.m4561x(C21572a.m21847d0(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c3825a0M4558d.m4561x(C21572a.m21847d0(key2), Boolean.FALSE);
                }
            }
        }
        c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
    }
}
