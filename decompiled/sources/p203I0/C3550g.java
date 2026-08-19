package p203I0;

import mm.C17296C;
import p002A0.C0132i;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3550g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10755Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10756Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17406l f10757o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3544a f10758p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3550g(InterfaceC17406l interfaceC17406l, C3544a c3544a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10757o0 = interfaceC17406l;
        this.f10758p0 = c3544a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3550g c3550g = new C3550g(this.f10757o0, this.f10758p0, interfaceC18770c);
        c3550g.f10756Z = obj;
        return c3550g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3550g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10755Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f10756Z;
        C2127D0 c2127d0Mo7768b = this.f10757o0.mo7768b();
        C0132i c0132i = new C0132i(this.f10758p0, 11, interfaceC0571F);
        this.f10755Y = 1;
        c2127d0Mo7768b.mo3141d(c0132i, this);
        return enumC19250a;
    }
}
