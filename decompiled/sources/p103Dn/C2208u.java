package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C2208u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6775Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6776Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2184i f6777o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2208u(InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6777o0 = interfaceC2184i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2208u c2208u = new C2208u(this.f6777o0, interfaceC18770c);
        c2208u.f6776Z = obj;
        return c2208u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2208u) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6775Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2206t c2206t = new C2206t((InterfaceC1758z) this.f6776Z, 0);
            this.f6775Y = 1;
            if (this.f6777o0.mo3141d(c2206t, this) == enumC19250a) {
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
