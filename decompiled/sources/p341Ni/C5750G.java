package p341Ni;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C5750G extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5784h0 f18710Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5750G(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f18710Y = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C5750G(this.f18710Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C5750G c5750g = (C5750G) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c5750g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C5784h0 c5784h0 = this.f18710Y;
        c5784h0.f18871w.f15382g.close();
        ((C5785i) c5784h0.f18873y.getValue()).f18876b.m2247h0();
        c5784h0.f18848V.release();
        return C17296C.f55119a;
    }
}
