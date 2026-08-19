package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class SimulcastVideoEncoder extends WrappedNativeVideoEncoder {
    VideoEncoderFactory fallback;
    VideoCodecInfo info;
    VideoEncoderFactory primary;

    public SimulcastVideoEncoder(VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2, VideoCodecInfo videoCodecInfo) {
        this.primary = videoEncoderFactory;
        this.fallback = videoEncoderFactory2;
        this.info = videoCodecInfo;
    }

    public static native long nativeCreateEncoder(long j10, VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2, VideoCodecInfo videoCodecInfo);

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long j10) {
        return nativeCreateEncoder(j10, this.primary, this.fallback, this.info);
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
