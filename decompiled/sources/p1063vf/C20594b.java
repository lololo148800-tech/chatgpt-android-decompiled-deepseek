package p1063vf;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20594b extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20603k f65351Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20594b(C20603k c20603k, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f65351Y = c20603k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20594b(this.f65351Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20594b c20594b = (C20594b) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c20594b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f65351Y.f65377k.m2247h0();
        return C17296C.f55119a;
    }
}
