package livekit.org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.MediaRecorder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p435Rl.AbstractC6925i;
import p435Rl.C6926j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001a\u001a\u00020\u00112\u000e\u0010\u000e\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00162\u000e\u0010\u000f\u001a\n \u0017*\u0004\u0018\u00010\u00180\u00182\u000e\u0010\u0010\u001a\n \u0017*\u0004\u0018\u00010\u00190\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010 \u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b \u0010\u0015J \u0010\"\u001a\u00020\u00112\u000e\u0010\u000e\u001a\n \u0017*\u0004\u0018\u00010!0!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J0\u0010\"\u001a\u00020\u00112\u000e\u0010\u000e\u001a\n \u0017*\u0004\u0018\u00010!0!2\u000e\u0010\u000f\u001a\n \u0017*\u0004\u0018\u00010\u00070\u0007H\u0096\u0001¢\u0006\u0004\b\"\u0010$J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.¨\u0006/"}, m18067d2 = {"Llivekit/org/webrtc/CameraXCapturerWithSize;", "LRl/i;", "Llivekit/org/webrtc/CameraVideoCapturer;", "Llivekit/org/webrtc/CameraXCapturer;", "capturer", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "", "deviceName", "LRl/j;", "cameraEventsDispatchHandler", "<init>", "(Llivekit/org/webrtc/CameraXCapturer;Landroid/hardware/camera2/CameraManager;Ljava/lang/String;LRl/j;)V", "", "p0", "p1", "p2", "Lmm/C;", "changeCaptureFormat", "(III)V", "dispose", "()V", "Llivekit/org/webrtc/SurfaceTextureHelper;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "Llivekit/org/webrtc/CapturerObserver;", "initialize", "(Llivekit/org/webrtc/SurfaceTextureHelper;Landroid/content/Context;Llivekit/org/webrtc/CapturerObserver;)V", "", "isScreencast", "()Z", "startCapture", "stopCapture", "Llivekit/org/webrtc/CameraVideoCapturer$CameraSwitchHandler;", "switchCamera", "(Llivekit/org/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V", "(Llivekit/org/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V", "width", "height", "Llivekit/org/webrtc/Size;", "findCaptureFormat", "(II)Llivekit/org/webrtc/Size;", "Llivekit/org/webrtc/CameraXCapturer;", "getCapturer$livekit_android_camerax_release", "()Llivekit/org/webrtc/CameraXCapturer;", "Landroid/hardware/camera2/CameraManager;", "Ljava/lang/String;", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CameraXCapturerWithSize extends AbstractC6925i implements CameraVideoCapturer {
    private final CameraManager cameraManager;
    private final CameraXCapturer capturer;
    private final String deviceName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraXCapturerWithSize(CameraXCapturer capturer, CameraManager cameraManager, String str, C6926j cameraEventsDispatchHandler) {
        super(cameraEventsDispatchHandler);
        AbstractC16544l.m18094g(capturer, "capturer");
        AbstractC16544l.m18094g(cameraManager, "cameraManager");
        AbstractC16544l.m18094g(cameraEventsDispatchHandler, "cameraEventsDispatchHandler");
        this.capturer = capturer;
        this.cameraManager = cameraManager;
        this.deviceName = str;
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        AbstractC17034d.m18858a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int p10, int p11, int p12) {
        this.capturer.changeCaptureFormat(p10, p11, p12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
        this.capturer.dispose();
    }

    @Override // p435Rl.AbstractC6925i
    public Size findCaptureFormat(int width, int height) {
        return CameraXHelper.INSTANCE.findClosestCaptureFormat(this.cameraManager, this.deviceName, width, height);
    }

    /* JADX INFO: renamed from: getCapturer$livekit_android_camerax_release, reason: from getter */
    public final CameraXCapturer getCapturer() {
        return this.capturer;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper p10, Context p11, CapturerObserver p12) {
        this.capturer.initialize(p10, p11, p12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return this.capturer.isScreencast();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        AbstractC17034d.m18859b(this, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int p10, int p11, int p12) {
        this.capturer.startCapture(p10, p11, p12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        this.capturer.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler p10) {
        this.capturer.switchCamera(p10);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler p10, String p11) {
        this.capturer.switchCamera(p10, p11);
    }
}
