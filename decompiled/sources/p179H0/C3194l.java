package p179H0;

import mm.C17296C;
import p003A1.C0227a;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: H0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3194l extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f9632Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3196n f9633Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f9634o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3194l(C3196n c3196n, float f10, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f9633Z = c3196n;
        this.f9634o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C3194l(this.f9633Z, this.f9634o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C3194l) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f9632Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3196n c3196n = this.f9633Z;
            float fM6409g = c3196n.f9642e.m6409g();
            C0227a c0227a = new C0227a(c3196n, 9);
            this.f9632Y = 1;
            if (AbstractC13758e.m15240e(fM6409g, this.f9634o0, null, c0227a, this, 12) == enumC19250a) {
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
