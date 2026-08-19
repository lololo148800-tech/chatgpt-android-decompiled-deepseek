package p1099x6;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p787he.C14462S;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.u */
/* JADX INFO: loaded from: classes.dex */
public final class C21153u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f67227Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f67228Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21150r f67229o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21153u(C21150r c21150r, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67229o0 = c21150r;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21153u c21153u = new C21153u(this.f67229o0, interfaceC18770c);
        c21153u.f67228Z = obj;
        return c21153u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21153u) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67227Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C14462S c14462s = new C14462S((InterfaceC2186j) this.f67228Z, 15);
            this.f67227Y = 1;
            if (this.f67229o0.mo3141d(c14462s, this) == enumC19250a) {
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
