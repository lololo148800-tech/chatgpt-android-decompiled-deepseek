package p100Dk;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dk.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C2091r extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f6433Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2093t f6434Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2091r(C2093t c2093t, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f6434Z = c2093t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C2091r(this.f6434Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C2091r) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6433Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2093t c2093t = this.f6434Z;
            InterfaceC2094u interfaceC2094u = c2093t.f6441d;
            this.f6433Y = 1;
            obj = interfaceC2094u.m3182e(c2093t.f6439b, c2093t.f6440c, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
