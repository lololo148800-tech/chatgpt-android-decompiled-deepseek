package p120Ee;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p402Qc.C6589e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2412f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7490Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2423q f7491Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2412f(C2423q c2423q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7491Z = c2423q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2412f(this.f7491Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2412f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7490Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2423q c2423q = this.f7491Z;
            C6589e c6589e = c2423q.f7535b;
            C2411e c2411e = new C2411e(c2423q, null);
            this.f7490Y = 1;
            if (C2423q.m3578c(c2423q, c6589e, "deleteAll", c2411e, this) == enumC19250a) {
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
