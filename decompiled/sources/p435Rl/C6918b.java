package p435Rl;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.MediaRecorder;
import livekit.org.webrtc.AbstractC17034d;
import livekit.org.webrtc.Camera2Capturer;
import livekit.org.webrtc.Camera2Helper;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.SurfaceTextureHelper;

/* JADX INFO: renamed from: Rl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6918b extends AbstractC6925i implements CameraVideoCapturer {

    /* JADX INFO: renamed from: Y */
    public final Camera2Capturer f22187Y;

    /* JADX INFO: renamed from: Z */
    public final CameraManager f22188Z;

    /* JADX INFO: renamed from: o0 */
    public final String f22189o0;

    public C6918b(Camera2Capturer camera2Capturer, CameraManager cameraManager, String str, C6926j c6926j) {
        super(c6926j);
        this.f22187Y = camera2Capturer;
        this.f22188Z = cameraManager;
        this.f22189o0 = str;
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        AbstractC17034d.m18858a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void changeCaptureFormat(int i10, int i11, int i12) {
        this.f22187Y.changeCaptureFormat(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void dispose() {
        this.f22187Y.dispose();
    }

    @Override // p435Rl.AbstractC6925i
    public final Size findCaptureFormat(int i10, int i11) {
        return Camera2Helper.INSTANCE.findClosestCaptureFormat(this.f22188Z, this.f22189o0, i10, i11);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.f22187Y.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final boolean isScreencast() {
        return this.f22187Y.isScreencast();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        AbstractC17034d.m18859b(this, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void startCapture(int i10, int i11, int i12) {
        this.f22187Y.startCapture(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void stopCapture() {
        this.f22187Y.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.f22187Y.switchCamera(cameraSwitchHandler);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.f22187Y.switchCamera(cameraSwitchHandler, str);
    }
}
