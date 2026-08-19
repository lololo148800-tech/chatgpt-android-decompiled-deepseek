package p341Ni;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p148Fi.C2770J;
import p148Fi.EnumC2779N0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C5754K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18723Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5754K c5754k = new C5754K(2, interfaceC18770c);
        c5754k.f18723Y = obj;
        return c5754k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5754K) create((C2770J) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((C2770J) this.f18723Y).f8478a == EnumC2779N0.Listening);
    }
}
