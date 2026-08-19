package p278L0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p229J0.C3899D4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C4841E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15760Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15761Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3899D4 f15762o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4841E(C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15762o0 = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4841E c4841e = new C4841E(this.f15762o0, interfaceC18770c);
        c4841e.f15761Z = obj;
        return c4841e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4841E) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15760Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4840D c4840d = new C4840D((C19723A) this.f15761Z, this.f15762o0, null);
            this.f15760Y = 1;
            if (AbstractC0575H.m1183l(c4840d, this) == enumC19250a) {
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
