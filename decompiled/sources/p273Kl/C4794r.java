package p273Kl;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p533Vl.AbstractC8394f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C4794r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15636Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f15637Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4808y f15638o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ SessionDescription f15639p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4794r(boolean z6, C4808y c4808y, SessionDescription sessionDescription, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15637Z = z6;
        this.f15638o0 = c4808y;
        this.f15639p0 = sessionDescription;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4794r(this.f15637Z, this.f15638o0, this.f15639p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4794r) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15636Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                return (AbstractC8394f) obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return (AbstractC8394f) obj;
        }
        AbstractC9233X.m9807c(obj);
        boolean z6 = this.f15637Z;
        SessionDescription sessionDescription = this.f15639p0;
        C4808y c4808y = this.f15638o0;
        if (z6) {
            PeerConnection peerConnection = c4808y.f15680c;
            this.f15636Y = 1;
            C2392v c2392v = new C2392v(12);
            peerConnection.setRemoteDescription(c2392v, sessionDescription);
            obj = c2392v.m3554k(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            return (AbstractC8394f) obj;
        }
        PeerConnection peerConnection2 = c4808y.f15680c;
        this.f15636Y = 2;
        C2392v c2392v2 = new C2392v(12);
        peerConnection2.setLocalDescription(c2392v2, sessionDescription);
        obj = c2392v2.m3554k(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC8394f) obj;
    }
}
