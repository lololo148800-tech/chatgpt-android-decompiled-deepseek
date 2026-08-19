package p894n0;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: n0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17404j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f55599Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC17406l f55600Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f55601o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17404j(InterfaceC17406l interfaceC17406l, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55600Z = interfaceC17406l;
        this.f55601o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17404j(this.f55600Z, this.f55601o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17404j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f55599Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        ArrayList arrayList = new ArrayList();
        C2127D0 c2127d0Mo7768b = this.f55600Z.mo7768b();
        C17400f c17400f = new C17400f(arrayList, this.f55601o0, 1);
        this.f55599Y = 1;
        c2127d0Mo7768b.mo3141d(c17400f, this);
        return enumC19250a;
    }
}
