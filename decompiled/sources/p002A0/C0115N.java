package p002A0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0115N extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f481Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f482Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f483o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115N(C0120T c0120t, InterfaceC18770c interfaceC18770c, C19723A c19723a) {
        super(2, interfaceC18770c);
        this.f482Z = c0120t;
        this.f483o0 = c19723a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0115N(this.f482Z, interfaceC18770c, this.f483o0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0115N) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f481Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f481Y = 1;
            if (this.f482Z.m405j(this.f483o0, this) == enumC19250a) {
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
