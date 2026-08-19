package p120Ee;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8120j6;
import p571X9.AbstractC9233X;
import p763g5.AbstractC13819d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2411e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7487Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7488Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2423q f7489o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2411e(C2423q c2423q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7489o0 = c2423q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2411e c2411e = new C2411e(this.f7489o0, interfaceC18770c);
        c2411e.f7488Z = obj;
        return c2411e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2411e) create((AbstractC13819d) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7487Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC13819d abstractC13819d = (AbstractC13819d) this.f7488Z;
            C2410d c2410d = new C2410d(this.f7489o0, null);
            this.f7487Y = 1;
            if (AbstractC8120j6.m8626d(abstractC13819d, c2410d, this) == enumC19250a) {
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
