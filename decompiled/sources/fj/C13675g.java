package fj;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p729ej.AbstractC13431v;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13675g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f43157Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13676h f43158Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13675g(C13676h c13676h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43158Z = c13676h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13675g c13675g = new C13675g(this.f43158Z, interfaceC18770c);
        c13675g.f43157Y = obj;
        return c13675g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13675g) create((AbstractC13431v) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return C13676h.m15163a(this.f43158Z, (AbstractC13431v) this.f43157Y);
    }
}
