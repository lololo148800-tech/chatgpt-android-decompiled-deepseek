package p046Bk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p182H3.C3202c;
import p385Pj.C6426a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Bk.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370b1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1376d1 f3633Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f3634Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370b1(C1376d1 c1376d1, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3633Y = c1376d1;
        this.f3634Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1370b1(this.f3633Y, this.f3634Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C1370b1 c1370b1 = (C1370b1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c1370b1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C1376d1 c1376d1 = this.f3633Y;
        c1376d1.f3658b.mo10188b(new C6426a(new C3202c().m4056b(), AbstractC1340N.m2030a(c1376d1.f3662f, this.f3634Z, c1376d1.f3663g)));
        return C17296C.f55119a;
    }
}
