package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16549q;
import livekit.org.webrtc.AbstractC17051u;
import livekit.org.webrtc.CandidatePairChangeEvent;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.IceCandidateErrorEvent;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpTransceiver;
import p1160zp.AbstractC22225a;
import p197Hj.C3457c;
import p225Im.InterfaceC3776x;
import p486Tl.InterfaceC7508g;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.C8398j;
import p533Vl.EnumC8397i;
import p583Xl.AbstractC9537d;
import p594Y9.AbstractC9873d3;
import p817j$.util.Objects;
import p867l8.C16831c;

/* JADX INFO: renamed from: Kl.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C4716E implements PeerConnection.Observer, InterfaceC7508g {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC3776x[] f15338e = {AbstractC16526C.f51263a.mo5697f(new C16549q(C4716E.class, "connectionState", "getConnectionState()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", 0))};

    /* JADX INFO: renamed from: a */
    public final C15102a f15339a;

    /* JADX INFO: renamed from: b */
    public final C4750V0 f15340b;

    /* JADX INFO: renamed from: c */
    public AbstractC16546n f15341c;

    /* JADX INFO: renamed from: d */
    public final C8398j f15342d;

    public C4716E(C15102a engine, C4750V0 client) {
        AbstractC16544l.m18094g(engine, "engine");
        AbstractC16544l.m18094g(client, "client");
        this.f15339a = engine;
        this.f15340b = client;
        this.f15342d = AbstractC9873d3.m10527a(PeerConnection.PeerConnectionState.NEW, null);
    }

    @Override // p486Tl.InterfaceC7508g
    /* JADX INFO: renamed from: a */
    public final PeerConnection.PeerConnectionState mo5404a() {
        return (PeerConnection.PeerConnectionState) this.f15342d.m8943c(f15338e[0]);
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onConnectionChange(PeerConnection.PeerConnectionState newState) {
        AbstractC16544l.m18094g(newState, "newState");
        AbstractC9537d.m10031b(new C4712C(this, newState));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(IceCandidate iceCandidate) {
        AbstractC9537d.m10031b(new C4714D(iceCandidate, 0, this));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent) {
        AbstractC17051u.m18877c(this, iceCandidateErrorEvent);
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        Objects.toString(iceConnectionState);
        AbstractC22225a.f70470a.getClass();
        C16831c.m18570i(new Object[0]);
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onRemoveTrack(RtpReceiver rtpReceiver) {
        AbstractC17051u.m18878d(this, rtpReceiver);
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
        AbstractC9537d.m10031b(new C3457c(this, 14));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onAddStream(MediaStream mediaStream) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onDataChannel(DataChannel dataChannel) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z6) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(MediaStream mediaStream) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onTrack(RtpTransceiver rtpTransceiver) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
    }
}
