package p148Fi;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fi.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2759D0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8456Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2761E0 f8457Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2759D0(C2761E0 c2761e0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8457Z = c2761e0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2759D0(this.f8457Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2759D0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8456Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2127D0 c2127d0 = this.f8457Z.f8462d;
            this.f8456Y = 1;
            if (c2127d0.mo395a(c17296c, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
