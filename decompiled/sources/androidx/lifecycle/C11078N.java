package androidx.lifecycle;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.lifecycle.N */
/* JADX INFO: loaded from: classes.dex */
public final class C11078N extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f33394Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f33395Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC11105n f33396o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC11104m f33397p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19694j f33398q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11078N(AbstractC11105n abstractC11105n, EnumC11104m enumC11104m, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f33396o0 = abstractC11105n;
        this.f33397p0 = enumC11104m;
        this.f33398q0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11078N c11078n = new C11078N(this.f33396o0, this.f33397p0, this.f33398q0, interfaceC18770c);
        c11078n.f33395Z = obj;
        return c11078n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11078N) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f33394Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f33395Z;
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
            C11077M c11077m = new C11077M(this.f33396o0, this.f33397p0, interfaceC0571F, this.f33398q0, null);
            this.f33394Y = 1;
            if (AbstractC0575H.m1168P(c1451e, c11077m, this) == enumC19250a) {
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
