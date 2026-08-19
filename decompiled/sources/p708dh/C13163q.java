package p708dh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13163q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41789Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13166t f41790Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13163q(C13166t c13166t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41790Z = c13166t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13163q(this.f41790Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13163q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41789Y;
        C13166t c13166t = this.f41790Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C13145X c13145x = c13166t.f41799c;
        this.f41789Y = 1;
        if (c13145x.m14819a(this) == enumC19250a) {
            return enumC19250a;
        }
        C13158l c13158l = c13166t.f41800d;
        this.f41789Y = 2;
        if (c13158l.m14823d(this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
