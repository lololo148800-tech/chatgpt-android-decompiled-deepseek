package af;

import bf.C11349D;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: af.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C10567X extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f31370Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f31371Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10571a0 f31372o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10567X(InterfaceC20904w interfaceC20904w, C11349D c11349d, C10571a0 c10571a0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31370Y = interfaceC20904w;
        this.f31371Z = c11349d;
        this.f31372o0 = c10571a0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10567X(this.f31370Y, this.f31371Z, this.f31372o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C10567X c10567x = (C10567X) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c10567x.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C20893l c20893l = C20893l.f66581s;
        C17309l c17309l = new C17309l("gizmo_id", this.f31371Z.f34318a);
        C10571a0 c10571a0 = this.f31372o0;
        this.f31370Y.mo21447a(c20893l, AbstractC17659D.m19244f(c17309l, new C17309l("search_term", c10571a0.f31386a), new C17309l("search_id", c10571a0.f31388c)));
        return C17296C.f55119a;
    }
}
