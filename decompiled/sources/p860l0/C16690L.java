package p860l0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p773h0.C14290j0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C16690L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53474Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16696N f53475Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC14284g0 f53476o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1439n f53477p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16690L(C16696N c16696n, EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53475Z = c16696n;
        this.f53476o0 = enumC14284g0;
        this.f53477p0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16690L(this.f53475Z, this.f53476o0, this.f53477p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16690L) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53474Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16696N c16696n = this.f53475Z;
            C14292k0 c14292k0 = c16696n.f53501c;
            C16693M c16693m = c16696n.f53500b;
            C16687K c16687k = new C16687K(c16696n, this.f53477p0, null);
            this.f53474Y = 1;
            c14292k0.getClass();
            if (AbstractC0575H.m1183l(new C14290j0(this.f53476o0, c14292k0, c16687k, c16693m, null), this) == enumC19250a) {
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
