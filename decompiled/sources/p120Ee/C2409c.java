package p120Ee;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p402Qc.C6589e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2409c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7482Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2423q f7483Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f7484o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2409c(C2423q c2423q, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7483Z = c2423q;
        this.f7484o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2409c(this.f7483Z, this.f7484o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2409c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7482Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2423q c2423q = this.f7483Z;
            C6589e c6589e = c2423q.f7535b;
            C2408b c2408b = new C2408b(c2423q, this.f7484o0, null);
            this.f7482Y = 1;
            if (C2423q.m3578c(c2423q, c6589e, "delete", c2408b, this) == enumC19250a) {
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
