package p557Wl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AbstractC16994F;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Wl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C8951g implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a */
    public final boolean f27367a;

    /* JADX INFO: renamed from: b */
    public final List f27368b;

    /* JADX INFO: renamed from: c */
    public final SoftwareVideoEncoderFactory f27369c;

    /* JADX INFO: renamed from: d */
    public final C8966v f27370d;

    public C8951g(EglBase.Context context) {
        List listM9974d = AbstractC9393x3.m9974d("VP9");
        this.f27367a = false;
        this.f27368b = listM9974d;
        this.f27369c = new SoftwareVideoEncoderFactory();
        this.f27370d = new C8966v(context);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        AbstractC16544l.m18094g(videoCodecInfo, "videoCodecInfo");
        boolean z6 = this.f27367a;
        SoftwareVideoEncoderFactory softwareVideoEncoderFactory = this.f27369c;
        if (z6) {
            return softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        }
        List list = this.f27368b;
        return (list.isEmpty() || !list.contains(videoCodecInfo.name)) ? this.f27370d.f27400a.createEncoder(videoCodecInfo) : softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
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
        if (!this.f27367a || !this.f27368b.isEmpty()) {
            return this.f27370d.getSupportedCodecs();
        }
        VideoCodecInfo[] supportedCodecs = this.f27369c.getSupportedCodecs();
        AbstractC16544l.m18091d(supportedCodecs);
        return supportedCodecs;
    }
}
