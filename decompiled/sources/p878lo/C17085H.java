package p878lo;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C17085H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54604Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54605Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17087J f54606o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17085H(C17087J c17087j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54606o0 = c17087j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17085H c17085h = new C17085H(this.f54606o0, interfaceC18770c);
        c17085h.f54605Z = obj;
        return c17085h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17085H) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54604Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f54605Z;
            C17087J c17087j = this.f54606o0;
            if (!c17087j.f54611D0) {
                return c17296c;
            }
            C17084G c17084g = new C17084G(c19723a, c17087j, null);
            this.f54604Y = 1;
            if (AbstractC0575H.m1183l(c17084g, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
