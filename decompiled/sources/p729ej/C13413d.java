package p729ej;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p153Fn.C2925c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ej.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13413d extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f42487Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f42488Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13414e f42489o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13413d(InterfaceC1439n interfaceC1439n, C13414e c13414e, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f42488Z = (AbstractC19694j) interfaceC1439n;
        this.f42489o0 = c13414e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C13413d(this.f42488Z, this.f42489o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C13413d) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f42487Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2925c c2925cM1174c = AbstractC0575H.m1174c(getContext());
            this.f42487Y = 1;
            if (this.f42488Z.invoke(c2925cM1174c, this) == enumC19250a) {
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
