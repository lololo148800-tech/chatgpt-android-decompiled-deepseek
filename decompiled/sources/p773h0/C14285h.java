package p773h0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p894n0.C17402h;
import p894n0.C17403i;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C14285h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC14289j f44825Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14285h(AbstractC14289j abstractC14289j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44825Y = abstractC14289j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14285h(this.f44825Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14285h c14285h = (C14285h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14285h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC14289j abstractC14289j = this.f44825Y;
        C17402h c17402h = abstractC14289j.f44851M0;
        if (c17402h != null) {
            C17403i c17403i = new C17403i(c17402h);
            InterfaceC17406l interfaceC17406l = abstractC14289j.f44840B0;
            if (interfaceC17406l != null) {
                AbstractC0575H.m1156D(abstractC14289j.m10935y0(), null, null, new C14273b(interfaceC17406l, c17403i, null), 3);
            }
            abstractC14289j.f44851M0 = null;
        }
        return C17296C.f55119a;
    }
}
