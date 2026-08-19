package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p692d0.C12949B;
import p729ej.C13435z;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20712H0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65659Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20752h0 f65660Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17406l f65661o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20712H0(C20752h0 c20752h0, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65660Z = c20752h0;
        this.f65661o0 = interfaceC17406l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20712H0(this.f65660Z, this.f65661o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20712H0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65659Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        this.f65659Y = 1;
        C20752h0 c20752h0 = this.f65660Z;
        c20752h0.getClass();
        this.f65661o0.mo7768b().mo3141d(new C13435z(new C12949B(), 9, c20752h0), this);
        return enumC19250a;
    }
}
