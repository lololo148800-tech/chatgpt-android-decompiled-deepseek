package af;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: af.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C10598z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f31448Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10545A f31449Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10598z(InterfaceC20904w interfaceC20904w, C10545A c10545a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31448Y = interfaceC20904w;
        this.f31449Z = c10545a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10598z(this.f31448Y, this.f31449Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C10598z c10598z = (C10598z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c10598z.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f31448Y.mo21448b(C20893l.f66580r, this.f31449Z.f31301a, C17690x.f56481Y);
        return C17296C.f55119a;
    }
}
