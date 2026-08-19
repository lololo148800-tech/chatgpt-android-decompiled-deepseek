package p273Kl;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4769e0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15552Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15553Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SessionDescription f15554o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4769e0(SessionDescription sessionDescription, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15554o0 = sessionDescription;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4769e0 c4769e0 = new C4769e0(this.f15554o0, interfaceC18770c);
        c4769e0.f15553Z = obj;
        return c4769e0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4769e0) create((PeerConnection) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15552Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            PeerConnection peerConnection = (PeerConnection) this.f15553Z;
            this.f15552Y = 1;
            C2392v c2392v = new C2392v(12);
            peerConnection.setLocalDescription(c2392v, this.f15554o0);
            obj = c2392v.m3554k(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
