package p273Kl;

import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpTransceiver;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C4738P extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15438Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MediaStreamTrack f15439Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ RtpTransceiver.RtpTransceiverInit f15440o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4738P(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15439Z = mediaStreamTrack;
        this.f15440o0 = rtpTransceiverInit;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4738P c4738p = new C4738P(this.f15439Z, this.f15440o0, interfaceC18770c);
        c4738p.f15438Y = obj;
        return c4738p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4738P) create((PeerConnection) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return ((PeerConnection) this.f15438Y).addTransceiver(this.f15439Z, this.f15440o0);
    }
}
