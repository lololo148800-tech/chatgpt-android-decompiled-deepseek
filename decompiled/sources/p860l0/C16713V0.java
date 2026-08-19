package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13775m0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16713V0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53544Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53545Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16771q0 f53546o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16757l1 f53547p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16713V0(C16771q0 c16771q0, C16757l1 c16757l1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53546o0 = c16771q0;
        this.f53547p0 = c16757l1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16713V0 c16713v0 = new C16713V0(this.f53546o0, this.f53547p0, interfaceC18770c);
        c16713v0.f53545Z = obj;
        return c16713v0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16713V0) create((C16748i1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53544Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13775m0 c13775m0 = new C13775m0((C16748i1) this.f53545Z, 22, this.f53547p0);
            this.f53544Y = 1;
            if (this.f53546o0.invoke(c13775m0, this) == enumC19250a) {
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
