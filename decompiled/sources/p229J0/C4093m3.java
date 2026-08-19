package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p193Hf.C3340X;
import p349O0.C5996c0;
import p571X9.AbstractC9233X;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.m3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4093m3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13111Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC17406l f13112Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5996c0 f13113o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4093m3(InterfaceC17406l interfaceC17406l, C5996c0 c5996c0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13112Z = interfaceC17406l;
        this.f13113o0 = c5996c0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4093m3(this.f13112Z, this.f13113o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4093m3) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13111Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C2127D0 c2127d0Mo7768b = this.f13112Z.mo7768b();
        C3340X c3340x = new C3340X(this.f13113o0, 2);
        this.f13111Y = 1;
        c2127d0Mo7768b.mo3141d(c3340x, this);
        return enumC19250a;
    }
}
