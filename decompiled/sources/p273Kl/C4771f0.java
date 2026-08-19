package p273Kl;

import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4771f0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15557Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15558Z;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4771f0 c4771f0 = new C4771f0(2, interfaceC18770c);
        c4771f0.f15558Z = obj;
        return c4771f0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4771f0) create((PeerConnection) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15557Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            PeerConnection peerConnection = (PeerConnection) this.f15558Z;
            MediaConstraints mediaConstraints = new MediaConstraints();
            this.f15557Y = 1;
            C2392v c2392v = new C2392v(12);
            peerConnection.createAnswer(c2392v, mediaConstraints);
            obj = c2392v.m3553j(this);
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
