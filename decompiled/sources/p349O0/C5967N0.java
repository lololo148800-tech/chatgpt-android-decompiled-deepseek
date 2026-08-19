package p349O0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5967N0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19424Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19425Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f19426o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f19427p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5967N0(InterfaceC1439n interfaceC1439n, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19426o0 = interfaceC1439n;
        this.f19427p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5967N0 c5967n0 = new C5967N0(this.f19426o0, this.f19427p0, interfaceC18770c);
        c5967n0.f19425Z = obj;
        return c5967n0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5967N0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19424Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6010j0 c6010j0 = new C6010j0(this.f19427p0, ((InterfaceC0571F) this.f19425Z).getCoroutineContext());
            this.f19424Y = 1;
            if (this.f19426o0.invoke(c6010j0, this) == enumC19250a) {
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
