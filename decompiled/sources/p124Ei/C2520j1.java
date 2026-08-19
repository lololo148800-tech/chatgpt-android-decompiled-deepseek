package p124Ei;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2520j1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7827Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f7828Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f7829o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2520j1(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7828Z = interfaceC1436k;
        this.f7829o0 = interfaceC1426a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2520j1(this.f7828Z, this.f7829o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2520j1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7827Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f7827Y = 1;
            if (this.f7828Z.invoke(this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f7829o0.invoke();
        return C17296C.f55119a;
    }
}
