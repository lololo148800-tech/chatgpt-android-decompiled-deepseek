package p787he;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C14492u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC7343b0 f45673Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14492u(AbstractC7343b0 abstractC7343b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45673Y = abstractC7343b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14492u(this.f45673Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14492u c14492u = (C14492u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14492u.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((C7320F) this.f45673Y).m7778d();
        return C17296C.f55119a;
    }
}
