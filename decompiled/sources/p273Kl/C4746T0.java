package p273Kl;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1159zo.C22221g;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4746T0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15460Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4750V0 f15461Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f15462o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4746T0(C4750V0 c4750v0, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15461Z = c4750v0;
        this.f15462o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4746T0(this.f15461Z, this.f15462o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4746T0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15460Y;
        C4750V0 c4750v0 = this.f15461Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j10 = c4750v0.f15500x;
            this.f15460Y = 1;
            if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26117Z;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18567d(new Object[0]);
        }
        C22221g c22221g = c4750v0.f15483g;
        if (c22221g != null) {
            c22221g.m22406b(3000, "Ping timeout");
        }
        return C17296C.f55119a;
    }
}
