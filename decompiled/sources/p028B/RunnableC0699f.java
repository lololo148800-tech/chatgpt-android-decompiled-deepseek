package p028B;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: renamed from: B.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0699f implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2037Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0700g f2038Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ CameraCaptureSession f2039o0;

    public /* synthetic */ RunnableC0699f(C0700g c0700g, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f2037Y = i10;
        this.f2038Z = c0700g;
        this.f2039o0 = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2037Y) {
            case 0:
                ((CameraCaptureSession.StateCallback) this.f2038Z.f2041b).onActive(this.f2039o0);
                break;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f2038Z.f2041b).onClosed(this.f2039o0);
                break;
            case 2:
                ((CameraCaptureSession.StateCallback) this.f2038Z.f2041b).onCaptureQueueEmpty(this.f2039o0);
                break;
            case 3:
                ((CameraCaptureSession.StateCallback) this.f2038Z.f2041b).onConfigured(this.f2039o0);
                break;
            case 4:
                ((CameraCaptureSession.StateCallback) this.f2038Z.f2041b).onReady(this.f2039o0);
                break;
            default:
                ((CameraCaptureSession.StateCallback) this.f2038Z.f2041b).onConfigureFailed(this.f2039o0);
                break;
        }
    }
}
