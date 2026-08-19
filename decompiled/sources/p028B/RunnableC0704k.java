package p028B;

import android.hardware.camera2.CameraDevice;
import p001A.C0004C;

/* JADX INFO: renamed from: B.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0704k implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2047Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0004C f2048Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ CameraDevice f2049o0;

    public /* synthetic */ RunnableC0704k(C0004C c0004c, CameraDevice cameraDevice, int i10) {
        this.f2047Y = i10;
        this.f2048Z = c0004c;
        this.f2049o0 = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2047Y) {
            case 0:
                ((CameraDevice.StateCallback) this.f2048Z.f16b).onClosed(this.f2049o0);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.f2048Z.f16b).onDisconnected(this.f2049o0);
                break;
            default:
                ((CameraDevice.StateCallback) this.f2048Z.f16b).onOpened(this.f2049o0);
                break;
        }
    }
}
