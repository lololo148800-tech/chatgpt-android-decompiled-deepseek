package p1071w0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1139z0.C21573A;
import p1139z0.C21575B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20774s0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65977Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21575B f65978Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20774s0(C21575B c21575b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65978Z = c21575b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20774s0(this.f65978Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20774s0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65977Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f65977Y = 1;
            C21575B c21575b = this.f65978Z;
            c21575b.getClass();
            Object objM1183l = AbstractC0575H.m1183l(new C21573A(c21575b, null), this);
            if (objM1183l != enumC19250a) {
                objM1183l = c17296c;
            }
            if (objM1183l == enumC19250a) {
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
