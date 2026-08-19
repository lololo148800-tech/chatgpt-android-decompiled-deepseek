package p953q0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7543h;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: q0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C18605z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f59264Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18546D f59265Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18605z(C18546D c18546d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59265Z = c18546d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18605z(this.f59265Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18605z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f59264Y;
        C18546D c18546d = this.f59265Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = c18546d.f59095o;
            C7543h c7543h = new C7543h(0L);
            this.f59264Y = 1;
            if (c13756d.m15226g(c7543h, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        int i11 = C18546D.f59080t;
        c18546d.m19917g(0L);
        c18546d.m19916f(false);
        return C17296C.f55119a;
    }
}
