package p341Ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5775d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5785i f18806Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5775d(C5785i c5785i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18806Y = c5785i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5775d(this.f18806Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5775d c5775d = (C5775d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5775d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C1526D c1526d = this.f18806Y.f18876b;
        c1526d.getClass();
        c1526d.m2250k0(false);
        return C17296C.f55119a;
    }
}
