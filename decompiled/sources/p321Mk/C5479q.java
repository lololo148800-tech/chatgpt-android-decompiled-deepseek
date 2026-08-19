package p321Mk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p758g0.C13756d;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5479q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f17892Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f17893Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f17894o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5479q(C11238i c11238i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17893Z = c11238i;
        this.f17894o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5479q(this.f17893Z, this.f17894o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5479q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17892Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11238i c11238i = this.f17893Z;
            C13756d c13756dM12567m0 = c11238i.m12567m0();
            Float f10 = new Float(((Number) c11238i.m12567m0().m15224e()).floatValue() - C13800b.m15306g(this.f17894o0));
            this.f17892Y = 1;
            if (c13756dM12567m0.m15226g(f10, this) == enumC19250a) {
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
