package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.E */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC16991E {
    /* JADX INFO: renamed from: a */
    public static long m18694a(VideoEncoder videoEncoder, long j10) {
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public static VideoEncoder.EncoderInfo m18695b(VideoEncoder videoEncoder) {
        return new VideoEncoder.EncoderInfo(1, false);
    }

    /* JADX INFO: renamed from: c */
    public static VideoEncoder.ResolutionBitrateLimits[] m18696c(VideoEncoder videoEncoder) {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18697d(VideoEncoder videoEncoder) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static VideoCodecStatus m18698e(VideoEncoder videoEncoder, VideoEncoder.RateControlParameters rateControlParameters) {
        return videoEncoder.setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }
}
