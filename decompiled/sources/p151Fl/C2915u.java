package p151Fl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AudioProcessingFactory;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import p016Ae.C0453o;
import p224Il.C3741a;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p583Xl.AbstractC9537d;

/* JADX INFO: renamed from: Fl.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C2915u implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f8743a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f8744b;

    /* JADX INFO: renamed from: c */
    public final C2918x f8745c;

    /* JADX INFO: renamed from: d */
    public final C2917w f8746d;

    /* JADX INFO: renamed from: e */
    public final C2903i f8747e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4478i f8748f;

    /* JADX INFO: renamed from: g */
    public final C0453o f8749g;

    public C2915u(InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, C2918x c2918x, C2917w c2917w, C2903i c2903i, InterfaceC4478i interfaceC4478i3, C0453o c0453o) {
        this.f8743a = interfaceC4478i;
        this.f8744b = interfaceC4478i2;
        this.f8745c = c2918x;
        this.f8746d = c2917w;
        this.f8747e = c2903i;
        this.f8748f = interfaceC4478i3;
        this.f8749g = c0453o;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        C2899e webrtcInitialization = (C2899e) this.f8743a.get();
        AudioDeviceModule audioDeviceModule = (AudioDeviceModule) this.f8744b.get();
        VideoEncoderFactory videoEncoderFactory = (VideoEncoderFactory) this.f8745c.get();
        VideoDecoderFactory videoDecoderFactory = (VideoDecoderFactory) this.f8746d.get();
        PeerConnectionFactory.Options options = (PeerConnectionFactory.Options) this.f8747e.get();
        C3741a memoryManager = (C3741a) this.f8748f.get();
        AudioProcessingFactory audioProcessingFactory = (AudioProcessingFactory) this.f8749g.get();
        AbstractC16544l.m18094g(webrtcInitialization, "webrtcInitialization");
        AbstractC16544l.m18094g(audioDeviceModule, "audioDeviceModule");
        AbstractC16544l.m18094g(memoryManager, "memoryManager");
        Object objM10030a = AbstractC9537d.m10030a(new C2909o(audioDeviceModule, audioProcessingFactory, videoEncoderFactory, videoDecoderFactory, options, memoryManager));
        AbstractC16544l.m18093f(objM10030a, "executeBlockingOnRTCThread(...)");
        return (PeerConnectionFactory) objM10030a;
    }
}
