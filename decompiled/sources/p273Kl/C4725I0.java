package p273Kl;

import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2215x0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4725I0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15364Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f15365Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4725I0(C4727J0 c4727j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15365Z = c4727j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4725I0(this.f15365Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C4725I0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15364Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4727J0 c4727j0 = this.f15365Z;
            C2215x0 c2215x0 = (C2215x0) c4727j0.f15400y.f18998e.f34082o0;
            C4715D0 c4715d0 = new C4715D0(c4727j0, 1);
            this.f15364Y = 1;
            if (c2215x0.f6793Y.mo3141d(c4715d0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
