package p273Kl;

import livekit.org.webrtc.MediaConstraints;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C4786n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15608Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15609Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4808y f15610o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4786n(C4808y c4808y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15610o0 = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4786n c4786n = new C4786n(this.f15610o0, interfaceC18770c);
        c4786n.f15609Z = obj;
        return c4786n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4786n) create((MediaConstraints) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15608Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            MediaConstraints mediaConstraints = (MediaConstraints) this.f15609Z;
            C4808y c4808y = this.f15610o0;
            if (mediaConstraints != null) {
                this.f15608Y = 1;
                if (c4808y.m5438b(mediaConstraints, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                this.f15608Y = 2;
                if (c4808y.m5438b(new MediaConstraints(), this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
