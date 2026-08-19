package p179H0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p773h0.C14288i0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: H0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3195m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f9635Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3196n f9636Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f9637o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3195m(C3196n c3196n, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f9636Z = c3196n;
        this.f9637o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3195m(this.f9636Z, this.f9637o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3195m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f9635Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3196n c3196n = this.f9636Z;
            C14292k0 c14292k0 = c3196n.f9646i;
            C3194l c3194l = new C3194l(c3196n, this.f9637o0, null);
            this.f9635Y = 1;
            EnumC14284g0 enumC14284g0 = EnumC14284g0.f44821Y;
            c14292k0.getClass();
            if (AbstractC0575H.m1183l(new C14288i0(enumC14284g0, c14292k0, c3194l, null), this) == enumC19250a) {
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
