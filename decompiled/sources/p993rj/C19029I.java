package p993rj;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C19029I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19031K f60656Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19029I(C19031K c19031k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60656Y = c19031k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19029I(this.f60656Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C19029I c19029i = (C19029I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c19029i.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C19031K c19031k = this.f60656Y;
        c19031k.f60666g = null;
        c19031k.m20293a();
        return C17296C.f55119a;
    }
}
