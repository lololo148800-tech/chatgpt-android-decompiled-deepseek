package p273Kl;

import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.PeerConnection;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Kl.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C4804w extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4808y f15667Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ PeerConnection.RTCConfiguration f15668Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4804w(C4808y c4808y, PeerConnection.RTCConfiguration rTCConfiguration) {
        super(0);
        this.f15667Y = c4808y;
        this.f15668Z = rTCConfiguration;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return Boolean.valueOf(this.f15667Y.f15680c.setConfiguration(this.f15668Z));
    }
}
