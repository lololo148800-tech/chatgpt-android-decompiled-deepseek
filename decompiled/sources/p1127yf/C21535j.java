package p1127yf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9961r4;
import p909nm.C17690x;
import p923oc.C18058n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: yf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21535j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f68211Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC9961r4 f68212Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21535j(InterfaceC20904w interfaceC20904w, AbstractC9961r4 abstractC9961r4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68211Y = interfaceC20904w;
        this.f68212Z = abstractC9961r4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21535j(this.f68211Y, this.f68212Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21535j c21535j = (C21535j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21535j.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C20857C c20857c = C20857C.f66331m;
        C18058n c18058n = (C18058n) this.f68212Z;
        this.f68211Y.mo21448b(c20857c, c18058n.f57612b, C17690x.f56481Y);
        return C17296C.f55119a;
    }
}
