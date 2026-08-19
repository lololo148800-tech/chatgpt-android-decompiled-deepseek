package livekit.org.webrtc;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Llivekit/org/webrtc/VideoFrame;", "frame", "Lmm/C;", "invoke", "(Llivekit/org/webrtc/VideoFrame;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class CameraXSession$surfaceTextureListener$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ CameraXSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraXSession$surfaceTextureListener$1(CameraXSession cameraXSession) {
        super(1);
        this.this$0 = cameraXSession;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VideoFrame) obj);
        return C17296C.f55119a;
    }

    public final void invoke(VideoFrame frame) {
        AbstractC16544l.m18094g(frame, "frame");
        this.this$0.checkIsOnCameraThread();
        if (this.this$0.state != CameraXSession.SessionState.RUNNING) {
            Logging.m18742d("CameraXSession", "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!this.this$0.firstFrameReported) {
            this.this$0.firstFrameReported = true;
            CameraXSession.cameraXStartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.this$0.constructionTimeNs));
        }
        VideoFrame.Buffer buffer = frame.getBuffer();
        AbstractC16544l.m18092e(buffer, "null cannot be cast to non-null type livekit.org.webrtc.TextureBufferImpl");
        VideoFrame videoFrame = new VideoFrame(AbstractC17033c.m18856a((TextureBufferImpl) buffer, this.this$0.isCameraFrontFacing, -this.this$0.cameraOrientation), this.this$0.getFrameOrientation(), frame.getTimestampNs());
        this.this$0.events.onFrameCaptured(this.this$0, videoFrame);
        videoFrame.release();
    }
}
