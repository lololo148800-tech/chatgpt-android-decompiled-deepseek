package p124Ei;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20883b0;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2514h1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f7814Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2529m1 f7815Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2514h1(InterfaceC20904w interfaceC20904w, C2529m1 c2529m1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7814Y = interfaceC20904w;
        this.f7815Z = c2529m1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2514h1(this.f7814Y, this.f7815Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C2514h1 c2514h1 = (C2514h1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c2514h1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f7814Y.mo21447a(C20883b0.f66506g, this.f7815Z.f7863d);
        return C17296C.f55119a;
    }
}
