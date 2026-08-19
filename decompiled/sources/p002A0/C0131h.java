package p002A0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p080D0.AbstractC1793a0;
import p571X9.AbstractC9233X;
import p758g0.C13746W;
import p758g0.C13756d;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0131h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f545Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0134k f546Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f547o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131h(C0134k c0134k, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f546Z = c0134k;
        this.f547o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0131h(this.f546Z, this.f547o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0131h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f545Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = this.f546Z.f559G0;
            C13800b c13800b = new C13800b(this.f547o0);
            C13746W c13746w = AbstractC1793a0.f5141d;
            this.f545Y = 1;
            if (C13756d.m15222c(c13756d, c13800b, c13746w, null, this, 12) == enumC19250a) {
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
