package p547Wc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p860l0.C16782u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8793f0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16782u f26900Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f26901Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8793f0(C16782u c16782u, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26900Y = c16782u;
        this.f26901Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8793f0(this.f26900Y, this.f26901Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8793f0 c8793f0 = (C8793f0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8793f0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (((Number) this.f26900Y.f53865g.getValue()).intValue() == 1) {
            ((InterfaceC1426a) this.f26901Z.getValue()).invoke();
        }
        return C17296C.f55119a;
    }
}
