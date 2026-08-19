package p435Rl;

import livekit.org.webrtc.AbstractC17003K;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;
import livekit.org.webrtc.VideoSink;

/* JADX INFO: renamed from: Rl.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6928l implements VideoProcessor {

    /* JADX INFO: renamed from: a */
    public VideoSink f22199a;

    /* JADX INFO: renamed from: b */
    public VideoProcessor f22200b;

    @Override // livekit.org.webrtc.CapturerObserver
    public final void onCapturerStarted(boolean z6) {
        VideoProcessor videoProcessor = this.f22200b;
        if (videoProcessor != null) {
            videoProcessor.onCapturerStarted(z6);
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public final void onCapturerStopped() {
        VideoProcessor videoProcessor = this.f22200b;
        if (videoProcessor != null) {
            videoProcessor.onCapturerStopped();
        }
    }

    @Override // livekit.org.webrtc.VideoProcessor
    public final /* synthetic */ void onFrameCaptured(VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        AbstractC17003K.m18740a(this, videoFrame, frameAdaptationParameters);
    }

    @Override // livekit.org.webrtc.VideoProcessor
    public final void setSink(VideoSink videoSink) {
        VideoProcessor videoProcessor = this.f22200b;
        if (videoProcessor != null) {
            videoProcessor.setSink(videoSink);
        }
        this.f22199a = videoSink;
    }
}
