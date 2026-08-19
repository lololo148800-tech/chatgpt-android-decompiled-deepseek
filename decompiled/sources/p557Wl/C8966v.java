package p557Wl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AbstractC16994F;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.HardwareVideoEncoderFactory;
import livekit.org.webrtc.SimulcastVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;

/* JADX INFO: renamed from: Wl.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C8966v implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a */
    public final SimulcastVideoEncoderFactory f27400a;

    public C8966v(EglBase.Context context) {
        C8965u c8965u = new C8965u(new HardwareVideoEncoderFactory(context, true, false));
        this.f27400a = new SimulcastVideoEncoderFactory(c8965u, new C8965u(new C8960p(c8965u)));
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return this.f27400a.createEncoder(videoCodecInfo);
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
        VideoCodecInfo[] supportedCodecs = this.f27400a.getSupportedCodecs();
        AbstractC16544l.m18093f(supportedCodecs, "getSupportedCodecs(...)");
        return supportedCodecs;
    }
}
