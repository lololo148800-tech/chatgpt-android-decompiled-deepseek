package p341Ni;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p1081wc.C20860F;
import p148Fi.C2812d;
import p387Pl.EnumC6481b;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C5806z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18955Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5784h0 f18956Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5806z(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18956Z = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5806z c5806z = new C5806z(this.f18956Z, interfaceC18770c);
        c5806z.f18955Y = obj;
        return c5806z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5806z c5806z = (C5806z) create((EnumC6481b) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5806z.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        EnumC6481b enumC6481b = (EnumC6481b) this.f18955Y;
        C5784h0 c5784h0 = this.f18956Z;
        C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
        if (c5788j0 != null) {
            C20860F c20860f = C20860F.f66364E;
            C2812d c2812d = C2812d.f8540a;
            c5788j0.m6189b(c20860f, AbstractC17660E.m19258c(new C17309l("camera", C2812d.m3713a(enumC6481b))));
        }
        c5784h0.f18871w.m5418m(C5784h0.m6173n(enumC6481b));
        return C17296C.f55119a;
    }
}
