package p1156zj;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8215v5;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22089B0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13421l f69820Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22107K0 f69821Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22089B0(C13421l c13421l, C22107K0 c22107k0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f69820Y = c13421l;
        this.f69821Z = c22107k0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22089B0(this.f69820Y, this.f69821Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C22089B0 c22089b0 = (C22089B0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c22089b0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC13418i interfaceC13418iMo3400l = this.f69820Y.f42503Y.mo3400l();
        C22107K0 c22107k0 = this.f69821Z;
        interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c22107k0, new C22087A0(c22107k0, 0)));
        return C17296C.f55119a;
    }
}
