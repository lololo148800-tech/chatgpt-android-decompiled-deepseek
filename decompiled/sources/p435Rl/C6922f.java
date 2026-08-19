package p435Rl;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.Camera2Capturer;
import livekit.org.webrtc.Camera2Enumerator;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;
import p387Pl.C6502v;

/* JADX INFO: renamed from: Rl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6922f implements InterfaceC6919c {

    /* JADX INFO: renamed from: a */
    public Camera2Enumerator f22193a;

    @Override // p435Rl.InterfaceC6919c
    public final int getCameraVersion() {
        return 2;
    }

    @Override // p435Rl.InterfaceC6919c
    public final boolean isSupported(Context context) {
        AbstractC16544l.m18094g(context, "context");
        return Camera2Enumerator.isSupported(context);
    }

    @Override // p435Rl.InterfaceC6919c
    public final VideoCapturer provideCapturer(Context context, C6502v c6502v, C6926j c6926j) {
        AbstractC16544l.m18094g(context, "context");
        CameraEnumerator cameraEnumeratorProvideEnumerator = provideEnumerator(context);
        ArrayList arrayList = C6924h.f22195a;
        String strM7310b = C6924h.m7310b(cameraEnumeratorProvideEnumerator, c6502v.f21098b, c6502v.f21099c, true);
        CameraVideoCapturer cameraVideoCapturerCreateCapturer = cameraEnumeratorProvideEnumerator.createCapturer(strM7310b, c6926j);
        AbstractC16544l.m18092e(cameraVideoCapturerCreateCapturer, "null cannot be cast to non-null type livekit.org.webrtc.Camera2Capturer");
        Object systemService = context.getSystemService("camera");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return new C6918b((Camera2Capturer) cameraVideoCapturerCreateCapturer, (CameraManager) systemService, strM7310b, c6926j);
    }

    @Override // p435Rl.InterfaceC6919c
    public final CameraEnumerator provideEnumerator(Context context) {
        AbstractC16544l.m18094g(context, "context");
        Camera2Enumerator camera2Enumerator = this.f22193a;
        if (camera2Enumerator != null) {
            return camera2Enumerator;
        }
        Camera2Enumerator camera2Enumerator2 = new Camera2Enumerator(context);
        this.f22193a = camera2Enumerator2;
        return camera2Enumerator2;
    }
}
