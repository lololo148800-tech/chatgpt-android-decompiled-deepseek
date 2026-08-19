package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // livekit.org.webrtc.VideoEncoder
    public abstract long createNative(long j10);

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final /* synthetic */ VideoEncoder.EncoderInfo getEncoderInfo() {
        return AbstractC16991E.m18695b(this);
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return AbstractC16991E.m18696c(this);
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i10) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final /* synthetic */ VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return AbstractC16991E.m18698e(this, rateControlParameters);
    }
}
