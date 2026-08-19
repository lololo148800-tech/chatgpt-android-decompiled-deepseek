package livekit.org.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreate(long j10, long j11, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j10);

    private static native boolean nativeIsSupported(long j10, VideoCodecInfo videoCodecInfo);

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoEncoder() { // from class: livekit.org.webrtc.SoftwareVideoEncoderFactory.1
                @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
                public long createNative(long j10) {
                    return SoftwareVideoEncoderFactory.nativeCreate(SoftwareVideoEncoderFactory.this.nativeFactory, j10, videoCodecInfo);
                }

                @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.m18746w(TAG, "Trying to create encoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return AbstractC16994F.m18727a(this);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoCodecInfo[] getImplementations() {
        return AbstractC16994F.m18728b(this);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
