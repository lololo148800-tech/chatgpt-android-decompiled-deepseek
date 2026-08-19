package p229J0;

import mm.C17296C;
import p025An.C0624m;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p758g0.C13740P;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.C4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3893C4 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f11816Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3899D4 f11817Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3893C4(C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f11817Z = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C3893C4(this.f11817Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C3893C4) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11816Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3899D4 c3899d4 = this.f11817Z;
            this.f11816Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            C13740P c13740p = c3899d4.f11883c;
            c13740p.f43331c.setValue(Boolean.TRUE);
            c3899d4.f11884d = c0624m;
            if (c0624m.m1261q() == enumC19250a) {
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
