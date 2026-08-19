package p278L0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p229J0.C3899D4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C4844H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15770Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15771Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f15772o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3899D4 f15773p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4844H(C19723A c19723a, C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15772o0 = c19723a;
        this.f15773p0 = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4844H c4844h = new C4844H(this.f15772o0, this.f15773p0, interfaceC18770c);
        c4844h.f15771Z = obj;
        return c4844h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4844H) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15770Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4843G c4843g = new C4843G((InterfaceC0571F) this.f15771Z, this.f15773p0, null);
            this.f15770Y = 1;
            if (this.f15772o0.m20667K0(c4843g, this) == enumC19250a) {
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
