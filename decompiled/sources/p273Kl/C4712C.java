package p273Kl;

import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p817j$.util.Objects;
import p867l8.C16831c;

/* JADX INFO: renamed from: Kl.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C4712C extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4716E f15321Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ PeerConnection.PeerConnectionState f15322Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4712C(C4716E c4716e, PeerConnection.PeerConnectionState peerConnectionState) {
        super(0);
        this.f15321Y = c4716e;
        this.f15322Z = peerConnectionState;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        int iCompareTo = enumC8397i.compareTo(AbstractC8396h.f26115a);
        PeerConnection.PeerConnectionState peerConnectionState = this.f15322Z;
        if (iCompareTo >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(peerConnectionState);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        C4716E c4716e = this.f15321Y;
        ?? r6 = c4716e.f15341c;
        if (r6 != 0) {
            r6.invoke(peerConnectionState);
        }
        c4716e.f15342d.m8944g(peerConnectionState, C4716E.f15338e[0]);
        return C17296C.f55119a;
    }
}
