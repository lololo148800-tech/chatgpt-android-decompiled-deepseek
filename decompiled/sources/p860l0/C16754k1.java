package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16754k1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53747Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53748Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16757l1 f53749o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f53750p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16754k1(C16757l1 c16757l1, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53749o0 = c16757l1;
        this.f53750p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16754k1 c16754k1 = new C16754k1(this.f53749o0, this.f53750p0, interfaceC18770c);
        c16754k1.f53748Z = obj;
        return c16754k1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16754k1) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53747Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC16694M0 interfaceC16694M0 = (InterfaceC16694M0) this.f53748Z;
            C16757l1 c16757l1 = this.f53749o0;
            c16757l1.f53764h = interfaceC16694M0;
            this.f53747Y = 1;
            if (this.f53750p0.invoke(c16757l1.f53765i, this) == enumC19250a) {
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
