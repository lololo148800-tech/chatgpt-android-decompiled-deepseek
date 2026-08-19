package bh;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p624Zg.C10365e0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11427a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f34517Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11431e f34518Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11427a(C11431e c11431e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34518Z = c11431e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11427a c11427a = new C11427a(this.f34518Z, interfaceC18770c);
        c11427a.f34517Y = obj;
        return c11427a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C11427a c11427a = (C11427a) create((C10365e0) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c11427a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f34518Z.f34535r0.setValue((C10365e0) this.f34517Y);
        return C17296C.f55119a;
    }
}
