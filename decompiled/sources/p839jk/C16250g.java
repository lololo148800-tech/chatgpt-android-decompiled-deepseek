package p839jk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p222Ij.InterfaceC3738c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: jk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16250g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f50373Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16251h f50374Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3738c f50375o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16250g(C16251h c16251h, InterfaceC3738c interfaceC3738c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50374Z = c16251h;
        this.f50375o0 = interfaceC3738c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16250g(this.f50374Z, this.f50375o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16250g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50373Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2127D0 c2127d0 = (C2127D0) this.f50374Z.f50376a.f7161q0;
            this.f50373Y = 1;
            if (c2127d0.mo395a(this.f50375o0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
