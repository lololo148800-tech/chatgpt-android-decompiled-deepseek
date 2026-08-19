package p028B;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import p053C.C1487v;

/* JADX INFO: renamed from: B.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0706m extends C0705l {
    @Override // p028B.C0705l, p658b5.C11241l
    /* JADX INFO: renamed from: B */
    public final void mo1478B(C1487v c1487v) throws C0694a {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c1487v.f3907a.mo2123a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f34016Y).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }
}
