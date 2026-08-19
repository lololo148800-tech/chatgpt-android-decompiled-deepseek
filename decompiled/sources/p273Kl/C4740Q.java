package p273Kl;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RtpSender;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C4740Q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15443Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RtpSender f15444Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ RTCStatsCollectorCallback f15445o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4740Q(RtpSender rtpSender, RTCStatsCollectorCallback rTCStatsCollectorCallback, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15444Z = rtpSender;
        this.f15445o0 = rTCStatsCollectorCallback;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4740Q c4740q = new C4740Q(this.f15444Z, this.f15445o0, interfaceC18770c);
        c4740q.f15443Y = obj;
        return c4740q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4740Q c4740q = (C4740Q) create((PeerConnection) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4740q.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((PeerConnection) this.f15443Y).getStats(this.f15444Z, this.f15445o0);
        return C17296C.f55119a;
    }
}
