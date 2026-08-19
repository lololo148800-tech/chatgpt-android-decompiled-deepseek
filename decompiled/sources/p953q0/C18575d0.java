package p953q0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: q0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18575d0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f59167Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18577e0 f59168Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f59169o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18575d0(C18577e0 c18577e0, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59168Z = c18577e0;
        this.f59169o0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18575d0(this.f59168Z, this.f59169o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18575d0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f59167Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18569a0 interfaceC18569a0 = this.f59168Z.f59171A0;
            this.f59167Y = 1;
            if (interfaceC18569a0.mo19792c(this.f59169o0, this) == enumC19250a) {
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
