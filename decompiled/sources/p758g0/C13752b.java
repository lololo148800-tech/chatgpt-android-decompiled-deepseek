package p758g0;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13752b extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13756d f43380Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f43381Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13752b(C13756d c13756d, Object obj, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f43380Y = c13756d;
        this.f43381Z = obj;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C13752b(this.f43380Y, this.f43381Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13752b c13752b = (C13752b) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c13752b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C13756d c13756d = this.f43380Y;
        C13756d.m15220a(c13756d);
        Object objM15223d = c13756d.m15223d(this.f43381Z);
        c13756d.f43411c.f43502Z.setValue(objM15223d);
        c13756d.f43413e.setValue(objM15223d);
        return C17296C.f55119a;
    }
}
