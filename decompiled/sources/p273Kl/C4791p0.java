package p273Kl;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p557Wl.AbstractC8959o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4791p0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15629Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4791p0 c4791p0 = new C4791p0(2, interfaceC18770c);
        c4791p0.f15629Y = obj;
        return c4791p0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4791p0) create((PeerConnection) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        SessionDescription localDescription = ((PeerConnection) this.f15629Y).getLocalDescription();
        if (localDescription != null) {
            return AbstractC8959o.m9572a(localDescription);
        }
        return null;
    }
}
