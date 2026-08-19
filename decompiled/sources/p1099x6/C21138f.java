package p1099x6;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21138f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f67171Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21139g f67172Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21138f(C21139g c21139g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67172Z = c21139g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21138f(this.f67172Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21138f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67171Y;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C21139g c21139g = this.f67172Z;
                this.f67171Y = 1;
                if (c21139g.invoke(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (Throwable th2) {
            Exception exc = new Exception("An exception occurred while writing to the cache asynchronously", th2);
            System.out.println((Object) "Apollo: unhandled exception");
            exc.printStackTrace();
        }
        return C17296C.f55119a;
    }
}
