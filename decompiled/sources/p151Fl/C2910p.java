package p151Fl;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpCapabilities;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Fl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C2910p extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ PeerConnectionFactory f8729Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910p(PeerConnectionFactory peerConnectionFactory) {
        super(1);
        this.f8729Y = peerConnectionFactory;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        MediaStreamTrack.MediaType mediaType = (MediaStreamTrack.MediaType) obj;
        AbstractC16544l.m18094g(mediaType, "mediaType");
        RtpCapabilities rtpSenderCapabilities = this.f8729Y.getRtpSenderCapabilities(mediaType);
        AbstractC16544l.m18093f(rtpSenderCapabilities, "getRtpSenderCapabilities(...)");
        return rtpSenderCapabilities;
    }
}
