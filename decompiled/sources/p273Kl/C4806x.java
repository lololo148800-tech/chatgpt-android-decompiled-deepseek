package p273Kl;

import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C4806x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15670Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f15671Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4808y f15672o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4806x(InterfaceC1439n interfaceC1439n, C4808y c4808y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15671Z = (AbstractC19694j) interfaceC1439n;
        this.f15672o0 = c4808y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4806x(this.f15671Z, this.f15672o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4806x) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15670Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            PeerConnection peerConnection = this.f15672o0.f15680c;
            this.f15670Y = 1;
            obj = this.f15671Z.invoke(peerConnection, this);
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
