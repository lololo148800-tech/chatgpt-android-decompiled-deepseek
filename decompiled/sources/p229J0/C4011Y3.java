package p229J0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4011Y3 extends AbstractC19694j implements InterfaceC1439n {
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4011Y3(2, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4011Y3 c4011y3 = (C4011Y3) create((C19723A) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4011y3.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return C17296C.f55119a;
    }
}
