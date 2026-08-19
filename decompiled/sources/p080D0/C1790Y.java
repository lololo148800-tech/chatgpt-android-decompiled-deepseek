package p080D0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13746W;
import p758g0.C13756d;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1790Y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5129Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f5130Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f5131o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790Y(C13756d c13756d, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5130Z = c13756d;
        this.f5131o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1790Y(this.f5130Z, this.f5131o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1790Y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5129Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13800b c13800b = new C13800b(this.f5131o0);
            C13746W c13746w = AbstractC1793a0.f5141d;
            this.f5129Y = 1;
            if (C13756d.m15222c(this.f5130Z, c13800b, c13746w, null, this, 12) == enumC19250a) {
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
