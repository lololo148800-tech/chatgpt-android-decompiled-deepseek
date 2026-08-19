package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.K */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17003K {
    /* JADX INFO: renamed from: a */
    public static void m18740a(VideoProcessor videoProcessor, VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame videoFrameM18741b = m18741b(videoFrame, frameAdaptationParameters);
        if (videoFrameM18741b != null) {
            videoProcessor.onFrameCaptured(videoFrameM18741b);
            videoFrameM18741b.release();
        }
    }

    /* JADX INFO: renamed from: b */
    public static VideoFrame m18741b(VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }
}
