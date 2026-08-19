package p001A;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import p028B.C0703j;
import p109E3.C2292p;
import p514V.C7730d;
import p610Z1.C10142i;

/* JADX INFO: renamed from: A.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0052b implements InterfaceC0040U0 {

    /* JADX INFO: renamed from: Y */
    public final C0703j f243Y;

    /* JADX INFO: renamed from: Z */
    public final Range f244Z;

    /* JADX INFO: renamed from: p0 */
    public C10142i f246p0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f248r0;

    /* JADX INFO: renamed from: o0 */
    public float f245o0 = 1.0f;

    /* JADX INFO: renamed from: q0 */
    public float f247q0 = 1.0f;

    public C0052b(C0703j c0703j) {
        boolean z6 = false;
        this.f248r0 = false;
        this.f243Y = c0703j;
        this.f244Z = (Range) c0703j.m1476a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) c0703j.f2044b.f42001Y).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 1) {
                        z6 = true;
                        break;
                    }
                }
            }
        }
        this.f248r0 = z6;
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: b */
    public final void mo198b(TotalCaptureResult totalCaptureResult) {
        if (this.f246p0 != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f247q0 == f10.floatValue()) {
                this.f246p0.m10747a(null);
                this.f246p0 = null;
            }
        }
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: d */
    public final void mo199d(float f10, C10142i c10142i) {
        this.f245o0 = f10;
        C10142i c10142i2 = this.f246p0;
        if (c10142i2 != null) {
            c10142i2.m10748b(new C2292p("There is a new zoomRatio being set"));
        }
        this.f247q0 = this.f245o0;
        this.f246p0 = c10142i;
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: e */
    public final float mo200e() {
        return ((Float) this.f244Z.getUpper()).floatValue();
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: g */
    public final float mo201g() {
        return ((Float) this.f244Z.getLower()).floatValue();
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: l */
    public final Rect mo202l() {
        Rect rect = (Rect) this.f243Y.m1476a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: n */
    public final void mo203n(C7730d c7730d) {
        c7730d.m7996a(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f245o0));
        if (!this.f248r0 || Build.VERSION.SDK_INT < 34) {
            return;
        }
        c7730d.m7996a(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: p */
    public final void mo204p() {
        this.f245o0 = 1.0f;
        C10142i c10142i = this.f246p0;
        if (c10142i != null) {
            c10142i.m10748b(new C2292p("Camera is not active."));
            this.f246p0 = null;
        }
    }
}
