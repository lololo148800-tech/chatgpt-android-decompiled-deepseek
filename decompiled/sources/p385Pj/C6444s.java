package p385Pj;

import mm.C17296C;
import p002A0.C0132i;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20734X;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Pj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6444s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f20908Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f20909Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6445t f20910o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6444s(C6445t c6445t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f20910o0 = c6445t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6444s c6444s = new C6444s(this.f20910o0, interfaceC18770c);
        c6444s.f20909Z = obj;
        return c6444s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C6444s) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f20908Y;
        C6445t c6445t = this.f20910o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = (InterfaceC2186j) this.f20909Z;
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a;
            C6443r c6443r = new C6443r(c6445t, null);
            this.f20909Z = interfaceC2186j;
            this.f20908Y = 1;
            if (AbstractC0575H.m1168P(c1451e, c6443r, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw AbstractC20734X.m21252w(obj);
            }
            interfaceC2186j = (InterfaceC2186j) this.f20909Z;
            AbstractC9233X.m9807c(obj);
        }
        C6436k c6436k = new C6436k();
        C0132i c0132i = new C0132i(c6445t, 21, interfaceC2186j);
        this.f20909Z = null;
        this.f20908Y = 2;
        c6436k.mo3141d(c0132i, this);
        return enumC19250a;
    }
}
