package p773h0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14279e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44795Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC14289j f44796Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17409o f44797o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14279e(AbstractC14289j abstractC14289j, C17409o c17409o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44796Z = abstractC14289j;
        this.f44797o0 = c17409o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14279e(this.f44796Z, this.f44797o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14279e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44795Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC17406l interfaceC17406l = this.f44796Z.f44840B0;
            if (interfaceC17406l != null) {
                this.f44795Y = 1;
                if (interfaceC17406l.mo7769c(this.f44797o0, this) == enumC19250a) {
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
