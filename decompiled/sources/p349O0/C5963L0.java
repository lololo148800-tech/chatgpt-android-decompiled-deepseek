package p349O0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5963L0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19410Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19411Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f19412o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f19413p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5963L0(InterfaceC1439n interfaceC1439n, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19412o0 = interfaceC1439n;
        this.f19413p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5963L0 c5963l0 = new C5963L0(this.f19412o0, this.f19413p0, interfaceC18770c);
        c5963l0.f19411Z = obj;
        return c5963l0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5963L0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19410Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6010j0 c6010j0 = new C6010j0(this.f19413p0, ((InterfaceC0571F) this.f19411Z).getCoroutineContext());
            this.f19410Y = 1;
            if (this.f19412o0.invoke(c6010j0, this) == enumC19250a) {
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
