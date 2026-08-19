package p001A;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: A.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0006D extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    public final String f19a;

    /* JADX INFO: renamed from: b */
    public boolean f20b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0018J f21c;

    public C0006D(C0018J c0018j, String str) {
        this.f21c = c0018j;
        this.f19a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f19a.equals(str)) {
            this.f20b = true;
            if (this.f21c.f89T0 == 4) {
                this.f21c.m102L(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f19a.equals(str)) {
            this.f20b = false;
        }
    }
}
