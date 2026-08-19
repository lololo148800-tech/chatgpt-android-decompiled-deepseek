package p387Pl;

import kotlin.jvm.internal.C16525B;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;
import p1160zp.AbstractC22225a;
import p435Rl.AbstractC6925i;
import p435Rl.C6926j;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Pl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6500t implements CameraVideoCapturer.CameraSwitchHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraVideoCapturer f21081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6501u f21082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C16525B f21083c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CameraEnumerator f21084d;

    public C6500t(CameraVideoCapturer cameraVideoCapturer, C6501u c6501u, C16525B c16525b, CameraEnumerator cameraEnumerator) {
        this.f21081a = cameraVideoCapturer;
        this.f21082b = c6501u;
        this.f21083c = c16525b;
        this.f21084d = cameraEnumerator;
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z6) {
        VideoCapturer videoCapturer = this.f21081a;
        if (!(videoCapturer instanceof AbstractC6925i)) {
            C6501u.m7063j(this.f21082b, this.f21083c, this.f21084d);
            return;
        }
        C6926j cameraEventsDispatchHandler = ((AbstractC6925i) videoCapturer).getCameraEventsDispatchHandler();
        C6499s c6499s = new C6499s(this.f21081a, this.f21082b, this.f21083c, this.f21084d);
        synchronized (cameraEventsDispatchHandler) {
            cameraEventsDispatchHandler.f22196a.add(c6499s);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(String str) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26119p0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18571j(new Object[0]);
    }
}
