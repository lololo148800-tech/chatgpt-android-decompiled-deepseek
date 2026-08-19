package p773h0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C14281f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44816Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC14289j f44817Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17409o f44818o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14281f(AbstractC14289j abstractC14289j, C17409o c17409o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44817Z = abstractC14289j;
        this.f44818o0 = c17409o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14281f(this.f44817Z, this.f44818o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14281f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44816Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC17406l interfaceC17406l = this.f44817Z.f44840B0;
            if (interfaceC17406l != null) {
                C17410p c17410p = new C17410p(this.f44818o0);
                this.f44816Y = 1;
                if (interfaceC17406l.mo7769c(c17410p, this) == enumC19250a) {
                    return enumC19250a;
                }
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
