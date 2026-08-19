package p435Rl;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.Camera1Capturer;
import livekit.org.webrtc.Camera1Enumerator;
import livekit.org.webrtc.Camera1Helper;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;
import mm.C17314q;
import p387Pl.C6502v;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Rl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6921e implements InterfaceC6919c {

    /* JADX INFO: renamed from: a */
    public final C17314q f22191a = AbstractC9227W.m9800c(C6920d.f22190Y);

    /* JADX INFO: renamed from: b */
    public final int f22192b = 1;

    @Override // p435Rl.InterfaceC6919c
    public final int getCameraVersion() {
        return this.f22192b;
    }

    @Override // p435Rl.InterfaceC6919c
    public final boolean isSupported(Context context) {
        AbstractC16544l.m18094g(context, "context");
        return true;
    }

    @Override // p435Rl.InterfaceC6919c
    public final VideoCapturer provideCapturer(Context context, C6502v c6502v, C6926j c6926j) {
        AbstractC16544l.m18094g(context, "context");
        ArrayList arrayList = C6924h.f22195a;
        C17314q c17314q = this.f22191a;
        String strM7310b = C6924h.m7310b((Camera1Enumerator) c17314q.getValue(), c6502v.f21098b, c6502v.f21099c, true);
        Camera1Helper.Companion companion = Camera1Helper.INSTANCE;
        companion.getSupportedFormats(companion.getCameraId(strM7310b));
        CameraVideoCapturer cameraVideoCapturerCreateCapturer = ((Camera1Enumerator) c17314q.getValue()).createCapturer(strM7310b, c6926j);
        AbstractC16544l.m18092e(cameraVideoCapturerCreateCapturer, "null cannot be cast to non-null type livekit.org.webrtc.Camera1Capturer");
        return new C6917a((Camera1Capturer) cameraVideoCapturerCreateCapturer, strM7310b, c6926j);
    }

    @Override // p435Rl.InterfaceC6919c
    public final CameraEnumerator provideEnumerator(Context context) {
        AbstractC16544l.m18094g(context, "context");
        return (Camera1Enumerator) this.f22191a.getValue();
    }
}
