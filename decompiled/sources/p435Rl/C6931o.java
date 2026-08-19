package p435Rl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;
import livekit.org.webrtc.VideoSink;
import p102Dm.AbstractC2119a;

/* JADX INFO: renamed from: Rl.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6931o extends AbstractC6928l {

    /* JADX INFO: renamed from: c */
    public int f22205c;

    /* JADX INFO: renamed from: d */
    public int f22206d;

    @Override // livekit.org.webrtc.CapturerObserver
    public final void onFrameCaptured(VideoFrame frame) {
        int iM3194h;
        int i10;
        int iM3194h2;
        int i11;
        AbstractC16544l.m18094g(frame, "frame");
        int rotatedWidth = frame.getRotatedWidth();
        int i12 = this.f22206d;
        int i13 = this.f22205c;
        if (rotatedWidth == i13 && frame.getRotatedHeight() == i12) {
            VideoProcessor videoProcessor = this.f22200b;
            if (videoProcessor != null) {
                videoProcessor.onFrameCaptured(frame);
                return;
            }
            VideoSink videoSink = this.f22199a;
            if (videoSink != null) {
                videoSink.onFrame(frame);
                return;
            }
            return;
        }
        int width = frame.getBuffer().getWidth();
        int height = frame.getBuffer().getHeight();
        if (i13 > width || i12 > height) {
            double d10 = i13;
            double d11 = i12;
            double dMax = Math.max(d10 / ((double) width), d11 / ((double) height));
            int iM3194h3 = AbstractC2119a.m3194h(d10 / dMax);
            iM3194h = AbstractC2119a.m3194h(d11 / dMax);
            i10 = iM3194h3;
        } else {
            iM3194h = i12;
            i10 = i13;
        }
        double d12 = width;
        double d13 = height;
        double d14 = ((double) i10) / ((double) iM3194h);
        if (d12 / d13 > d14) {
            iM3194h2 = AbstractC2119a.m3194h(d13 * d14);
            i11 = height;
        } else {
            int iM3194h4 = AbstractC2119a.m3194h(d12 / d14);
            iM3194h2 = width;
            i11 = iM3194h4;
        }
        VideoFrame videoFrame = new VideoFrame(frame.getBuffer().cropAndScale((width - iM3194h2) / 2, (height - i11) / 2, iM3194h2, i11, i10, iM3194h), frame.getRotation(), frame.getTimestampNs());
        VideoProcessor videoProcessor2 = this.f22200b;
        if (videoProcessor2 != null) {
            videoProcessor2.onFrameCaptured(videoFrame);
        } else {
            VideoSink videoSink2 = this.f22199a;
            if (videoSink2 != null) {
                videoSink2.onFrame(videoFrame);
            }
        }
        videoFrame.release();
    }
}
