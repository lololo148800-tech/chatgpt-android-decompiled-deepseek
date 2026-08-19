package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.A4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3881A4 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11738Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3893C4 f11739Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3881A4(C3893C4 c3893c4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11739Z = c3893c4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3881A4(this.f11739Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3881A4) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11738Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f11738Y = 1;
            if (this.f11739Z.invoke(this) == enumC19250a) {
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
