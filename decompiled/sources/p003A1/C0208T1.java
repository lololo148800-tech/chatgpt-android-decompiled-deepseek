package p003A1;

import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.T1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0208T1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f795Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2149O0 f796Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0245e1 f797o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208T1(InterfaceC2149O0 interfaceC2149O0, C0245e1 c0245e1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f796Z = interfaceC2149O0;
        this.f797o0 = c0245e1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0208T1(this.f796Z, this.f797o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C0208T1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f795Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0205S1 c0205s1 = new C0205S1(this.f797o0, 0);
            this.f795Y = 1;
            if (this.f796Z.mo3141d(c0205s1, this) == enumC19250a) {
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
