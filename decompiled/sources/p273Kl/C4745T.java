package p273Kl;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RtpReceiver;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C4745T extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15457Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RtpReceiver f15458Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ RTCStatsCollectorCallback f15459o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4745T(RtpReceiver rtpReceiver, RTCStatsCollectorCallback rTCStatsCollectorCallback, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15458Z = rtpReceiver;
        this.f15459o0 = rTCStatsCollectorCallback;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4745T c4745t = new C4745T(this.f15458Z, this.f15459o0, interfaceC18770c);
        c4745t.f15457Y = obj;
        return c4745t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4745T c4745t = (C4745T) create((PeerConnection) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4745t.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((PeerConnection) this.f15457Y).getStats(this.f15458Z, this.f15459o0);
        return C17296C.f55119a;
    }
}
