package p1041uf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: uf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20216e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f64006Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f64007Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f64008o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20216e(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f64008o0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20216e c20216e = new C20216e(this.f64008o0, interfaceC18770c);
        c20216e.f64007Z = obj;
        return c20216e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20216e) create((AbstractC21933K1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f64006Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) this.f64007Z;
            this.f64006Y = 1;
            if (this.f64008o0.invoke(abstractC21933K1, this) == enumC19250a) {
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
