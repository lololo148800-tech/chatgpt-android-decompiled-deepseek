package p773h0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p894n0.C17403i;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14273b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44776Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC17406l f44777Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17403i f44778o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14273b(InterfaceC17406l interfaceC17406l, C17403i c17403i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44777Z = interfaceC17406l;
        this.f44778o0 = c17403i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14273b(this.f44777Z, this.f44778o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14273b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44776Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f44776Y = 1;
            if (this.f44777Z.mo7769c(this.f44778o0, this) == enumC19250a) {
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
