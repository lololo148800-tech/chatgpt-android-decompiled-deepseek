package p069Cf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1013t0.C19715c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Cf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C1651j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4675Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19715c f4676Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1651j(C19715c c19715c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4676Z = c19715c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1651j(this.f4676Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1651j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4675Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f4675Y = 1;
            if (this.f4676Z.m20665a(null, this) == enumC19250a) {
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
