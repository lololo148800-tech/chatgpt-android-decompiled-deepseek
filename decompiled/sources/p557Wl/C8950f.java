package p557Wl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoDecoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoDecoder;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.WrappedVideoDecoderFactory;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Wl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8950f implements VideoDecoderFactory {

    /* JADX INFO: renamed from: a */
    public final boolean f27363a;

    /* JADX INFO: renamed from: b */
    public final List f27364b;

    /* JADX INFO: renamed from: c */
    public final SoftwareVideoDecoderFactory f27365c;

    /* JADX INFO: renamed from: d */
    public final WrappedVideoDecoderFactory f27366d;

    public C8950f(EglBase.Context context) {
        List listM9974d = AbstractC9393x3.m9974d("VP9");
        this.f27363a = false;
        this.f27364b = listM9974d;
        this.f27365c = new SoftwareVideoDecoderFactory();
        this.f27366d = new WrappedVideoDecoderFactory(context);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        AbstractC16544l.m18094g(videoCodecInfo, "videoCodecInfo");
        boolean z6 = this.f27363a;
        SoftwareVideoDecoderFactory softwareVideoDecoderFactory = this.f27365c;
        if (z6) {
            return softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        List list = this.f27364b;
        return (list.isEmpty() || !list.contains(videoCodecInfo.name)) ? this.f27366d.createDecoder(videoCodecInfo) : softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        if (this.f27363a && this.f27364b.isEmpty()) {
            VideoCodecInfo[] supportedCodecs = this.f27365c.getSupportedCodecs();
            AbstractC16544l.m18091d(supportedCodecs);
            return supportedCodecs;
        }
        VideoCodecInfo[] supportedCodecs2 = this.f27366d.getSupportedCodecs();
        AbstractC16544l.m18091d(supportedCodecs2);
        return supportedCodecs2;
    }
}
