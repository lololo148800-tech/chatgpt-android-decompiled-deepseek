package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p278L0.C4893t;
import p571X9.AbstractC9233X;
import p758g0.C13775m0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16789w0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53884Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53885Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16771q0 f53886o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16798z0 f53887p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16789w0(C16771q0 c16771q0, C16798z0 c16798z0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53886o0 = c16771q0;
        this.f53887p0 = c16798z0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16789w0 c16789w0 = new C16789w0(this.f53886o0, this.f53887p0, interfaceC18770c);
        c16789w0.f53885Z = obj;
        return c16789w0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16789w0) create((C4893t) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53884Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13775m0 c13775m0 = new C13775m0((C4893t) this.f53885Z, 21, this.f53887p0);
            this.f53884Y = 1;
            if (this.f53886o0.invoke(c13775m0, this) == enumC19250a) {
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
