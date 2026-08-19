package p1138z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import p1009s9.C19506i;
import p228J.C3828c;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21572a extends C19506i {

    /* JADX INFO: renamed from: p0 */
    public static final C3828c f68305p0 = new C3828c("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* JADX INFO: renamed from: q0 */
    public static final C3828c f68306q0 = new C3828c("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* JADX INFO: renamed from: r0 */
    public static final C3828c f68307r0 = new C3828c("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* JADX INFO: renamed from: s0 */
    public static final C3828c f68308s0 = new C3828c("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* JADX INFO: renamed from: t0 */
    public static final C3828c f68309t0 = new C3828c("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* JADX INFO: renamed from: u0 */
    public static final C3828c f68310u0 = new C3828c("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    /* JADX INFO: renamed from: d0 */
    public static C3828c m21847d0(CaptureRequest.Key key) {
        return new C3828c("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
