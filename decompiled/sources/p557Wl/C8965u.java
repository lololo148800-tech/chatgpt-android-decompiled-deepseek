package p557Wl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AbstractC16994F;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.WrappedNativeVideoEncoder;

/* JADX INFO: renamed from: Wl.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C8965u implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a */
    public final VideoEncoderFactory f27399a;

    public C8965u(VideoEncoderFactory videoEncoderFactory) {
        this.f27399a = videoEncoderFactory;
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder videoEncoderCreateEncoder = this.f27399a.createEncoder(videoCodecInfo);
        if (videoEncoderCreateEncoder == null) {
            return null;
        }
        return videoEncoderCreateEncoder instanceof WrappedNativeVideoEncoder ? videoEncoderCreateEncoder : new C8964t(videoEncoderCreateEncoder);
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
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.f27399a.getSupportedCodecs();
        AbstractC16544l.m18093f(supportedCodecs, "getSupportedCodecs(...)");
        return supportedCodecs;
    }
}
