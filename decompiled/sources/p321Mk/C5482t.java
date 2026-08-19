package p321Mk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p758g0.C13796x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C5482t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f17901Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f17902Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f17903o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5482t(C11238i c11238i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17902Z = c11238i;
        this.f17903o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5482t(this.f17902Z, this.f17903o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5482t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17901Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756dM12567m0 = this.f17902Z.m12567m0();
            Float f10 = new Float(-C7550o.m7902c(this.f17903o0));
            C13796x c13796xM15250o = AbstractC13758e.m15250o();
            this.f17901Y = 1;
            if (C13756d.m15221b(c13756dM12567m0, f10, c13796xM15250o, this) == enumC19250a) {
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
