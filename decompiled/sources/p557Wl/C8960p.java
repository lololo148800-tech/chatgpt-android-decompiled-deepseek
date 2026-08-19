package p557Wl;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AbstractC16994F;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.VideoEncoderFallback;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Wl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C8960p implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a */
    public final C8965u f27387a;

    /* JADX INFO: renamed from: b */
    public final SoftwareVideoEncoderFactory f27388b = new SoftwareVideoEncoderFactory();

    public C8960p(C8965u c8965u) {
        this.f27387a = c8965u;
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo info) {
        AbstractC16544l.m18094g(info, "info");
        VideoEncoder videoEncoderCreateEncoder = this.f27388b.createEncoder(info);
        VideoEncoder videoEncoderCreateEncoder2 = this.f27387a.createEncoder(info);
        if (videoEncoderCreateEncoder2 == null || videoEncoderCreateEncoder == null) {
            return videoEncoderCreateEncoder == null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder;
        }
        return new VideoEncoderFallback(videoEncoderCreateEncoder2, videoEncoderCreateEncoder);
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
        ArrayList arrayList = new ArrayList();
        VideoCodecInfo[] supportedCodecs = this.f27388b.getSupportedCodecs();
        AbstractC16544l.m18093f(supportedCodecs, "getSupportedCodecs(...)");
        AbstractC17686t.m19399w(arrayList, supportedCodecs);
        AbstractC17686t.m19399w(arrayList, this.f27387a.getSupportedCodecs());
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
    }
}
