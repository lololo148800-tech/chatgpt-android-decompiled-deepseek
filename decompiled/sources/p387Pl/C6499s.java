package p387Pl;

import kotlin.jvm.internal.C16525B;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import p435Rl.AbstractC6925i;

/* JADX INFO: renamed from: Pl.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6499s implements CameraVideoCapturer.CameraEventsHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraVideoCapturer f21077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6501u f21078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C16525B f21079c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CameraEnumerator f21080d;

    public C6499s(CameraVideoCapturer cameraVideoCapturer, C6501u c6501u, C16525B c16525b, CameraEnumerator cameraEnumerator) {
        this.f21077a = cameraVideoCapturer;
        this.f21078b = c6501u;
        this.f21079c = c16525b;
        this.f21080d = cameraEnumerator;
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraClosed() {
        ((AbstractC6925i) this.f21077a).getCameraEventsDispatchHandler().m7313a(this);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraDisconnected() {
        ((AbstractC6925i) this.f21077a).getCameraEventsDispatchHandler().m7313a(this);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraError(String str) {
        ((AbstractC6925i) this.f21077a).getCameraEventsDispatchHandler().m7313a(this);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onFirstFrameAvailable() {
        C6501u.m7063j(this.f21078b, this.f21079c, this.f21080d);
        ((AbstractC6925i) this.f21077a).getCameraEventsDispatchHandler().m7313a(this);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraFreezed(String str) {
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraOpening(String str) {
    }
}
