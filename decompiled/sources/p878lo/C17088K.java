package p878lo;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C17088K extends AbstractC19694j implements InterfaceC1439n {
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17088K(2, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17088K c17088k = (C17088K) create((C17097f) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17088k.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return C17296C.f55119a;
    }
}
