package p341Ni;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.EnumC22033m2;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5744A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18696Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5744A c5744a = new C5744A(2, interfaceC18770c);
        c5744a.f18696Y = obj;
        return c5744a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5744A) create((EnumC22033m2) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((EnumC22033m2) this.f18696Y) == EnumC22033m2.Advanced);
    }
}
