package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16799z1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16685J0 f53915Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16799z1(C16685J0 c16685j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53915Y = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16799z1(this.f53915Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16799z1 c16799z1 = (C16799z1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16799z1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C16685J0 c16685j0 = this.f53915Y;
        c16685j0.f53460p0 = true;
        c16685j0.f53461q0.m5450g(null);
        return C17296C.f55119a;
    }
}
