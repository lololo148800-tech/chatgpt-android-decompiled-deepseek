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

/* JADX INFO: renamed from: Kl.X0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4754X0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4756Y0 f15509Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ PeerConnection.PeerConnectionState f15510Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4754X0(C4756Y0 c4756y0, PeerConnection.PeerConnectionState peerConnectionState) {
        super(0);
        this.f15509Y = c4756y0;
        this.f15510Z = peerConnectionState;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        int iCompareTo = enumC8397i.compareTo(AbstractC8396h.f26115a);
        PeerConnection.PeerConnectionState peerConnectionState = this.f15510Z;
        if (iCompareTo >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(peerConnectionState);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        C4756Y0 c4756y0 = this.f15509Y;
        C4734N c4734n = c4756y0.f15517d;
        if (c4734n != null) {
            c4734n.invoke(peerConnectionState);
        }
        c4756y0.f15518e.m8944g(peerConnectionState, C4756Y0.f15513f[0]);
        return C17296C.f55119a;
    }
}
