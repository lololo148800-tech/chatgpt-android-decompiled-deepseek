package p273Kl;

import io.livekit.android.room.C15102a;
import livekit.org.webrtc.MediaStreamTrack;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4787n0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15611Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15102a f15612Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MediaStreamTrack f15613o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4787n0(C15102a c15102a, MediaStreamTrack mediaStreamTrack, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15612Z = c15102a;
        this.f15613o0 = mediaStreamTrack;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4787n0(this.f15612Z, this.f15613o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4787n0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15611Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4808y c4808y = this.f15612Z.f46958r;
            if (c4808y == null) {
                return null;
            }
            C4785m0 c4785m0 = new C4785m0(this.f15613o0, null);
            this.f15611Y = 1;
            obj = c4808y.m5444h(c4785m0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return (C17296C) obj;
    }
}
