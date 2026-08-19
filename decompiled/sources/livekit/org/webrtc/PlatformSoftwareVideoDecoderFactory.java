package livekit.org.webrtc;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: livekit.org.webrtc.PlatformSoftwareVideoDecoderFactory.1
        @Override // livekit.org.webrtc.Predicate
        public final /* synthetic */ Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
            return Predicate.CC.m18763a(this, predicate);
        }

        @Override // livekit.org.webrtc.Predicate
        public final /* synthetic */ Predicate<MediaCodecInfo> negate() {
            return Predicate.CC.m18764b(this);
        }

        @Override // livekit.org.webrtc.Predicate
        /* JADX INFO: renamed from: or */
        public final /* synthetic */ Predicate<MediaCodecInfo> mo18731or(Predicate<? super MediaCodecInfo> predicate) {
            return Predicate.CC.m18765c(this, predicate);
        }

        @Override // livekit.org.webrtc.Predicate
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override // livekit.org.webrtc.MediaCodecVideoDecoderFactory, livekit.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.MediaCodecVideoDecoderFactory, livekit.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
