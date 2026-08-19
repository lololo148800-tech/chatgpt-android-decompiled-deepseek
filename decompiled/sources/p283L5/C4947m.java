package p283L5;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p111E5.EnumC2324h;
import p111E5.InterfaceC2333q;
import p160G5.C3003i;
import p354O5.C6135e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C4947m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f16128Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f16129Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4951q f16130o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4947m(C4951q c4951q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16130o0 = c4951q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4947m c4947m = new C4947m(this.f16130o0, interfaceC18770c);
        c4947m.f16129Z = obj;
        return c4947m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4947m) create((C4955u) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C4955u c4955u;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16128Y;
        C4951q c4951q = this.f16130o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4955u c4955u2 = (C4955u) this.f16129Z;
            C6135e c6135e = c4955u2.f16165e;
            if (c6135e == null) {
                throw new IllegalStateException("body == null");
            }
            this.f16129Z = c4955u2;
            this.f16128Y = 1;
            Object objM5592b = C4951q.m5592b(c4951q, c6135e, this);
            if (objM5592b == enumC19250a) {
                return enumC19250a;
            }
            c4955u = c4955u2;
            obj = objM5592b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4955u = (C4955u) this.f16129Z;
            AbstractC9233X.m9807c(obj);
        }
        return new C3003i((InterfaceC2333q) obj, C4951q.m5594f(c4951q.f16149a, c4955u.f16164d.m5601a()), EnumC2324h.f7227p0);
    }
}
