package p878lo;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13744U;
import p858ko.C16484C;
import p858ko.C16501d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C17099h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54643Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17100i f54644Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f54645o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f54646p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17099h(C17100i c17100i, float f10, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54644Z = c17100i;
        this.f54645o0 = f10;
        this.f54646p0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17099h(this.f54644Z, this.f54645o0, this.f54646p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17099h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM18059l;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54643Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16484C c16484c = this.f54644Z.f54651z0;
            C13744U c13744u = new C13744U(0);
            this.f54643Y = 1;
            C16501d c16501dM18049b = c16484c.m18049b();
            if (c16501dM18049b == null || (objM18059l = c16484c.m18059l(c16501dM18049b.f51185b * this.f54645o0, this.f54646p0, c13744u, this)) != enumC19250a) {
                objM18059l = c17296c;
            }
            if (objM18059l == enumC19250a) {
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
