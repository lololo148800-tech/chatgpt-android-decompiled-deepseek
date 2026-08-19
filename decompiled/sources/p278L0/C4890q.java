package p278L0;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4890q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15939Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15940Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4872f f15941o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11246q f15942p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4890q(C4872f c4872f, C11246q c11246q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15941o0 = c4872f;
        this.f15942p0 = c11246q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4890q c4890q = new C4890q(this.f15941o0, this.f15942p0, interfaceC18770c);
        c4890q.f15940Z = obj;
        return c4890q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4890q) create((C17309l) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15939Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17309l c17309l = (C17309l) this.f15940Z;
            C4855T c4855t = (C4855T) c17309l.f55136Y;
            C4892s c4892s = (C4892s) this.f15942p0.f34077n;
            this.f15939Y = 1;
            if (this.f15941o0.mo985d(c4892s, c4855t, c17309l.f55137Z, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
