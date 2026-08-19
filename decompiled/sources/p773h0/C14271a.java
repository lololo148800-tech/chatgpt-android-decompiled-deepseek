package p773h0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p894n0.C17402h;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14271a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44772Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC17406l f44773Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17402h f44774o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14271a(InterfaceC17406l interfaceC17406l, C17402h c17402h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44773Z = interfaceC17406l;
        this.f44774o0 = c17402h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14271a(this.f44773Z, this.f44774o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14271a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44772Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f44772Y = 1;
            if (this.f44773Z.mo7769c(this.f44774o0, this) == enumC19250a) {
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
