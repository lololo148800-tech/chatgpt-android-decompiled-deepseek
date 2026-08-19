package p203I0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3558o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10777Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3559p f10778Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3558o(C3559p c3559p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10778Z = c3559p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3558o c3558o = new C3558o(this.f10778Z, interfaceC18770c);
        c3558o.f10777Y = obj;
        return c3558o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3558o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return AbstractC0575H.m1156D((InterfaceC0571F) this.f10777Y, null, null, new C3557n(this.f10778Z, null), 3);
    }
}
