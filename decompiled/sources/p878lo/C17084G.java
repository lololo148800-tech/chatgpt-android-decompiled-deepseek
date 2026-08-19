package p878lo;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C17084G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54600Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54601Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f54602o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17087J f54603p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17084G(C19723A c19723a, C17087J c17087j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54602o0 = c19723a;
        this.f54603p0 = c17087j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17084G c17084g = new C17084G(this.f54602o0, this.f54603p0, interfaceC18770c);
        c17084g.f54601Z = obj;
        return c17084g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17084G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54600Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f54601Z;
            EnumC0573G enumC0573G = EnumC0573G.f1793p0;
            C17087J c17087j = this.f54603p0;
            AbstractC0575H.m1156D(interfaceC0571F, null, enumC0573G, new C17082E(c17087j, null), 1);
            C17083F c17083f = new C17083F(c17087j, interfaceC0571F, null);
            this.f54600Y = 1;
            if (AbstractC8717t4.m9428b(this.f54602o0, c17083f, this) == enumC19250a) {
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
