package p273Kl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpSender;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4785m0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15606Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MediaStreamTrack f15607Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4785m0(MediaStreamTrack mediaStreamTrack, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15607Z = mediaStreamTrack;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4785m0 c4785m0 = new C4785m0(this.f15607Z, interfaceC18770c);
        c4785m0.f15606Y = obj;
        return c4785m0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4785m0 c4785m0 = (C4785m0) create((PeerConnection) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4785m0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        PeerConnection peerConnection = (PeerConnection) this.f15606Y;
        for (RtpSender rtpSender : peerConnection.getSenders()) {
            MediaStreamTrack mediaStreamTrackTrack = rtpSender.track();
            if (mediaStreamTrackTrack != null && AbstractC16544l.m18089b(mediaStreamTrackTrack.m18749id(), this.f15607Z.m18749id())) {
                peerConnection.removeTrack(rtpSender);
            }
        }
        return C17296C.f55119a;
    }
}
