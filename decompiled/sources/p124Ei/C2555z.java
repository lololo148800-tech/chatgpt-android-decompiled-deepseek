package p124Ei;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C2555z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7976Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2532n1 f7977Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f7978o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2555z(C2532n1 c2532n1, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7977Z = c2532n1;
        this.f7978o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2555z(this.f7977Z, this.f7978o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2555z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7976Y;
        InterfaceC5985X interfaceC5985X = this.f7978o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC5985X.setValue(this.f7977Z.f7872D);
            this.f7976Y = 1;
            if (AbstractC0575H.m1184m(3000L, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        interfaceC5985X.setValue(null);
        return C17296C.f55119a;
    }
}
