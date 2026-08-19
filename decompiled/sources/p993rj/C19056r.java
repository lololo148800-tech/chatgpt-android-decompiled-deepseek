package p993rj;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: rj.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C19056r extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0624m f60719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C19024D f60720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f60721c;

    public C19056r(C0624m c0624m, C19024D c19024d, String str) {
        this.f60719a = c0624m;
        this.f60720b = c19024d;
        this.f60721c = str;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice device) {
        AbstractC16544l.m18094g(device, "device");
        this.f60720b.f60629n = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice device, int i10) {
        String str;
        AbstractC16544l.m18094g(device, "device");
        if (i10 == 1) {
            str = "Camera in use";
        } else if (i10 == 2) {
            str = "Maximum cameras in use";
        } else if (i10 == 3) {
            str = "Device policy";
        } else if (i10 != 4) {
            str = i10 != 5 ? "Unknown" : "Fatal (service)";
        } else {
            str = "Fatal (device)";
        }
        RuntimeException runtimeException = new RuntimeException("Camera " + this.f60721c + " error: (" + i10 + ") " + str);
        C0624m c0624m = this.f60719a;
        if (c0624m.m1266w()) {
            c0624m.resumeWith(AbstractC9233X.m9806b(runtimeException));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice device) {
        AbstractC16544l.m18094g(device, "device");
        this.f60719a.resumeWith(device);
    }
}
