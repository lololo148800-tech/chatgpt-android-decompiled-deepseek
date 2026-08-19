package p247Jj;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p066Cc.C1625b;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2211v0;
import p110E4.C2307e;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4453r0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14494Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4390J0 f14495Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f14496o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC4433h0 f14497p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4453r0(AbstractC4433h0 abstractC4433h0, C4390J0 c4390j0, C13421l c13421l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14495Z = c4390j0;
        this.f14496o0 = c13421l;
        this.f14497p0 = abstractC4433h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4453r0(this.f14497p0, this.f14495Z, this.f14496o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4453r0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f14494Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C4390J0 c4390j0 = this.f14495Z;
        C2307e c2307e = c4390j0.f14268j;
        C1625b c1625b = new C1625b(this.f14496o0, c4390j0, this.f14497p0, 7);
        this.f14494Y = 1;
        C2127D0 c2127d0 = (C2127D0) ((InterfaceC2211v0) c2307e.f7159o0);
        c2127d0.getClass();
        C2127D0.m3228m(c2127d0, c1625b, this);
        return enumC19250a;
    }
}
