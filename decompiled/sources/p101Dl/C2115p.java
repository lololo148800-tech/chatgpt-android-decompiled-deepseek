package p101Dl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2207t0;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C2115p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6473Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2117r f6474Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2115p(C2117r c2117r, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6474Z = c2117r;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2115p(this.f6474Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2115p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6473Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2117r c2117r = this.f6474Z;
            InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new C2207t0(c2117r.f6476b, c2117r.f6477c, new C2113n(3, null), 0));
            C2114o c2114o = new C2114o(c2117r, null);
            this.f6473Y = 1;
            if (AbstractC2124C.m3212k(interfaceC2184iM3215n, c2114o, this) == enumC19250a) {
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
