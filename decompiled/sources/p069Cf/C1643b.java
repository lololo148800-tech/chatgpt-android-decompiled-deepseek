package p069Cf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Cf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1643b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4649Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1644c f4650Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f4651o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643b(C1644c c1644c, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4650Z = c1644c;
        this.f4651o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1643b(this.f4650Z, this.f4651o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1643b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4649Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = this.f4650Z.f4655D0;
            Float f10 = new Float(this.f4651o0);
            this.f4649Y = 1;
            if (C13756d.m15222c(c13756d, f10, null, null, this, 14) == enumC19250a) {
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
