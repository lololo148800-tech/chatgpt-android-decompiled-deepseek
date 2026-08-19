package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p059C5.C1592j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C16764o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53789Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53790Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1592j f53791o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16782u f53792p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16764o(C1592j c1592j, C16782u c16782u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53791o0 = c1592j;
        this.f53792p0 = c16782u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16764o c16764o = new C16764o(this.f53791o0, this.f53792p0, interfaceC18770c);
        c16764o.f53790Z = obj;
        return c16764o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16764o) create((C16670E0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53789Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16670E0 c16670e0 = (C16670E0) this.f53790Z;
            C16779t c16779t = this.f53792p0.f53872n;
            this.f53789Y = 1;
            if (this.f53791o0.invoke(c16779t, c16670e0, this) == enumC19250a) {
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
