package livekit.org.webrtc;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: livekit.org.webrtc.HardwareVideoDecoderFactory.1
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
            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
        }
    };

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }

    @Override // livekit.org.webrtc.MediaCodecVideoDecoderFactory, livekit.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.MediaCodecVideoDecoderFactory, livekit.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        Predicate<MediaCodecInfo> predicateAnd;
        if (predicate == null) {
            predicateAnd = defaultAllowedPredicate;
        } else {
            predicateAnd = predicate.and(defaultAllowedPredicate);
        }
        super(context, predicateAnd);
    }
}
