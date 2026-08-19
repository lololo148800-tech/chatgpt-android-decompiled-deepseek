package ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ni.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C17639m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56422Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f56423Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC17640n f56424o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17639m(InterfaceC1436k interfaceC1436k, AbstractC17640n abstractC17640n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56423Z = (AbstractC19694j) interfaceC1436k;
        this.f56424o0 = abstractC17640n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17639m(this.f56423Z, this.f56424o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17639m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56422Y;
        AbstractC17640n abstractC17640n = this.f56424o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                ?? r6 = this.f56423Z;
                this.f56422Y = 1;
                if (r6.invoke(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (abstractC17640n.f56427c.decrementAndGet() == 0) {
                abstractC17640n.f56428d.m1279g0();
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            if (abstractC17640n.f56427c.decrementAndGet() == 0) {
                abstractC17640n.f56428d.m1279g0();
            }
            throw th2;
        }
    }
}
