package p001A;

import android.hardware.camera2.CameraCaptureSession;
import p228J.AbstractC3842j;

/* JADX INFO: renamed from: A.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0077n0 extends AbstractC3842j {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession.CaptureCallback f318a;

    public C0077n0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f318a = captureCallback;
    }
}
