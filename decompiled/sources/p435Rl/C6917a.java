package p435Rl;

import android.content.Context;
import android.media.MediaRecorder;
import livekit.org.webrtc.AbstractC17034d;
import livekit.org.webrtc.Camera1Capturer;
import livekit.org.webrtc.Camera1Helper;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.SurfaceTextureHelper;

/* JADX INFO: renamed from: Rl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6917a extends AbstractC6925i implements CameraVideoCapturer {

    /* JADX INFO: renamed from: Y */
    public final Camera1Capturer f22185Y;

    /* JADX INFO: renamed from: Z */
    public final String f22186Z;

    public C6917a(Camera1Capturer camera1Capturer, String str, C6926j c6926j) {
        super(c6926j);
        this.f22185Y = camera1Capturer;
        this.f22186Z = str;
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        AbstractC17034d.m18858a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void changeCaptureFormat(int i10, int i11, int i12) {
        this.f22185Y.changeCaptureFormat(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void dispose() {
        this.f22185Y.dispose();
    }

    @Override // p435Rl.AbstractC6925i
    public final Size findCaptureFormat(int i10, int i11) {
        Camera1Helper.Companion companion = Camera1Helper.INSTANCE;
        return companion.findClosestCaptureFormat(companion.getCameraId(this.f22186Z), i10, i11);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.f22185Y.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final boolean isScreencast() {
        return this.f22185Y.isScreencast();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        AbstractC17034d.m18859b(this, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void startCapture(int i10, int i11, int i12) {
        this.f22185Y.startCapture(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void stopCapture() {
        this.f22185Y.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.f22185Y.switchCamera(cameraSwitchHandler);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.f22185Y.switchCamera(cameraSwitchHandler, str);
    }
}
