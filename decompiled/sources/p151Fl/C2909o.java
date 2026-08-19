package p151Fl;

import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.AudioProcessingFactory;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import p049Bm.InterfaceC1426a;
import p224Il.C3741a;

/* JADX INFO: renamed from: Fl.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C2909o extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AudioDeviceModule f8723Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AudioProcessingFactory f8724Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VideoEncoderFactory f8725o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VideoDecoderFactory f8726p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ PeerConnectionFactory.Options f8727q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C3741a f8728r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2909o(AudioDeviceModule audioDeviceModule, AudioProcessingFactory audioProcessingFactory, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, PeerConnectionFactory.Options options, C3741a c3741a) {
        super(0);
        this.f8723Y = audioDeviceModule;
        this.f8724Z = audioProcessingFactory;
        this.f8725o0 = videoEncoderFactory;
        this.f8726p0 = videoDecoderFactory;
        this.f8727q0 = options;
        this.f8728r0 = c3741a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        PeerConnectionFactory.Builder videoDecoderFactory = PeerConnectionFactory.builder().setAudioDeviceModule(this.f8723Y).setAudioProcessingFactory(this.f8724Z).setVideoEncoderFactory(this.f8725o0).setVideoDecoderFactory(this.f8726p0);
        PeerConnectionFactory.Options options = this.f8727q0;
        if (options != null) {
            videoDecoderFactory.setOptions(options);
        }
        PeerConnectionFactory peerConnectionFactoryCreatePeerConnectionFactory = videoDecoderFactory.createPeerConnectionFactory();
        this.f8728r0.m4434a(new C2895a(peerConnectionFactoryCreatePeerConnectionFactory, 3));
        return peerConnectionFactoryCreatePeerConnectionFactory;
    }
}
