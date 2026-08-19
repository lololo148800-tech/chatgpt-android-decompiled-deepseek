package p860l0;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C16773r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53825Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53826Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f53827o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16782u f53828p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16773r(InterfaceC1441p interfaceC1441p, C16782u c16782u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53827o0 = (AbstractC19694j) interfaceC1441p;
        this.f53828p0 = c16782u;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.p, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16773r c16773r = new C16773r(this.f53827o0, this.f53828p0, interfaceC18770c);
        c16773r.f53826Z = obj;
        return c16773r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16773r) create((C17309l) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Bm.p, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53825Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17309l c17309l = (C17309l) this.f53826Z;
            C16670E0 c16670e0 = (C16670E0) c17309l.f55136Y;
            C16779t c16779t = this.f53828p0.f53872n;
            this.f53825Y = 1;
            if (this.f53827o0.mo985d(c16779t, c16670e0, c17309l.f55137Z, this) == enumC19250a) {
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
