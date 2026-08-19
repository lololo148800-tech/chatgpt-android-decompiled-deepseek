package p120Ee;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p402Qc.C6589e;
import p571X9.AbstractC9233X;
import p763g5.C13820e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2410d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7485Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2423q f7486Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2410d(C2423q c2423q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7486Z = c2423q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2410d(this.f7486Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2410d) create((C13820e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7485Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6589e c6589e = this.f7486Z.f7535b;
            this.f7485Y = 1;
            if (c6589e.m7155S(this) == enumC19250a) {
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
