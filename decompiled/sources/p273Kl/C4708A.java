package p273Kl;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;
import p025An.AbstractC0563B;
import p151Fl.AbstractC2897c;
import p668c.C11548h;

/* JADX INFO: renamed from: Kl.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C4708A implements InterfaceC4766d {

    /* JADX INFO: renamed from: a */
    public final C4810z f15304a;

    public C4708A(C4810z c4810z) {
        this.f15304a = c4810z;
    }

    /* JADX INFO: renamed from: a */
    public final C4808y m5403a(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer, C4716E c4716e) {
        return new C4808y(rTCConfiguration, observer, c4716e, (AbstractC0563B) AbstractC2897c.f8708a.get(), (PeerConnectionFactory) this.f15304a.f15690a.get(), C11548h.f34919a);
    }
}
