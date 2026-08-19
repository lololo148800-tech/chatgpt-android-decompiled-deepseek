package p273Kl;

import java.util.Iterator;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p533Vl.AbstractC8394f;
import p533Vl.C8392d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C4798t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15650Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4808y f15651Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SessionDescription f15652o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4798t(C4808y c4808y, SessionDescription sessionDescription, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15651Z = c4808y;
        this.f15652o0 = sessionDescription;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4798t(this.f15651Z, this.f15652o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4798t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15650Y;
        C4808y c4808y = this.f15651Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            PeerConnection peerConnection = c4808y.f15680c;
            this.f15650Y = 1;
            C2392v c2392v = new C2392v(12);
            peerConnection.setRemoteDescription(c2392v, this.f15652o0);
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
        AbstractC8394f abstractC8394f = (AbstractC8394f) obj;
        if (abstractC8394f instanceof C8392d) {
            Iterator it = c4808y.f15681d.iterator();
            while (it.hasNext()) {
                c4808y.f15680c.addIceCandidate((IceCandidate) it.next());
            }
            c4808y.f15681d.clear();
            c4808y.f15682e = false;
        }
        return abstractC8394f;
    }
}
