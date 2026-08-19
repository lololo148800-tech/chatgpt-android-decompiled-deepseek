package p028B;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import p053C.C1473h;
import p053C.C1487v;
import p053C.InterfaceC1486u;
import p658b5.C11241l;

/* JADX INFO: renamed from: B.l */
/* JADX INFO: loaded from: classes.dex */
public class C0705l extends C11241l {
    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: B */
    public void mo1478B(C1487v c1487v) throws C0694a {
        CameraDevice cameraDevice = (CameraDevice) this.f34016Y;
        C11241l.m12584z(cameraDevice, c1487v);
        InterfaceC1486u interfaceC1486u = c1487v.f3907a;
        C0700g c0700g = new C0700g(interfaceC1486u.mo2126d(), interfaceC1486u.mo2128f());
        List listMo2129g = interfaceC1486u.mo2129g();
        C0707n c0707n = (C0707n) this.f34017Z;
        c0707n.getClass();
        C1473h c1473hMo2125c = interfaceC1486u.mo2125c();
        Handler handler = c0707n.f2050a;
        try {
            if (c1473hMo2125c != null) {
                InputConfiguration inputConfiguration = c1473hMo2125c.f3882a.f3881a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C1487v.m2131a(listMo2129g), c0700g, handler);
            } else if (interfaceC1486u.mo2127e() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(C11241l.m12583O(listMo2129g), c0700g, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(C1487v.m2131a(listMo2129g), c0700g, handler);
            }
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }
}
