package p708dh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C13143V extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41725Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13145X f41726Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13143V(C13145X c13145x, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41726Z = c13145x;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13143V(this.f41726Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13143V) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41725Y;
        C13145X c13145x = this.f41726Z;
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
        this.f41725Y = 1;
        if (c13145x.m14819a(this) == enumC19250a) {
            return enumC19250a;
        }
        C2146N c2146n = new C2146N(c13145x.f41733a.f64176f, 2);
        C13142U c13142u = new C13142U(c13145x, null);
        this.f41725Y = 2;
        if (AbstractC2124C.m3212k(c2146n, c13142u, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
