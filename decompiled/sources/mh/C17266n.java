package mh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3759g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mh.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C17266n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC3759g f55068Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17266n(InterfaceC3759g interfaceC3759g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55068Y = interfaceC3759g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17266n(this.f55068Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17266n c17266n = (C17266n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17266n.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC1436k) this.f55068Y).invoke(C17259g.f55055a);
        return C17296C.f55119a;
    }
}
