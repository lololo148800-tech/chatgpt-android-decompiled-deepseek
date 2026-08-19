package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
class VideoEncoderWrapper {
    public static VideoEncoder.Callback createEncoderCallback(long j10) {
        return new C16990D(j10);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f54472on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j10, EncodedImage encodedImage);
}
