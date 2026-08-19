package p435Rl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.CameraVideoCapturer;
import p387Pl.C6499s;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Rl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6926j implements CameraVideoCapturer.CameraEventsHandler {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f22196a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized void m7313a(C6499s c6499s) {
        this.f22196a.remove(c6499s);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraClosed() {
        Iterator it = AbstractC17680n.m19326F0(this.f22196a).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraClosed();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraDisconnected() {
        Iterator it = AbstractC17680n.m19326F0(this.f22196a).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraDisconnected();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraError(String errorDescription) {
        AbstractC16544l.m18094g(errorDescription, "errorDescription");
        Iterator it = AbstractC17680n.m19326F0(this.f22196a).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraError(errorDescription);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraFreezed(String errorDescription) {
        AbstractC16544l.m18094g(errorDescription, "errorDescription");
        Iterator it = AbstractC17680n.m19326F0(this.f22196a).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraFreezed(errorDescription);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraOpening(String cameraName) {
        AbstractC16544l.m18094g(cameraName, "cameraName");
        Iterator it = AbstractC17680n.m19326F0(this.f22196a).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraOpening(cameraName);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onFirstFrameAvailable() {
        Iterator it = AbstractC17680n.m19326F0(this.f22196a).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onFirstFrameAvailable();
        }
    }
}
