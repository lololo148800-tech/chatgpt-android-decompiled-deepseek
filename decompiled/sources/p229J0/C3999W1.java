package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3999W1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12548Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f12549Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3999W1(C13756d c13756d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12549Z = c13756d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3999W1(this.f12549Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3999W1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12548Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Float f10 = new Float(0.0f);
            this.f12548Y = 1;
            if (C13756d.m15222c(this.f12549Z, f10, null, null, this, 14) == enumC19250a) {
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
