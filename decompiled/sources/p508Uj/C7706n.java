package p508Uj;

import mm.C17296C;
import p002A0.C0132i;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20734X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C7706n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24275Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f24276Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7707o f24277o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7706n(C7707o c7707o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24277o0 = c7707o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7706n c7706n = new C7706n(this.f24277o0, interfaceC18770c);
        c7706n.f24276Z = obj;
        return c7706n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C7706n) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24275Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f24276Z;
        C7707o c7707o = this.f24277o0;
        c7707o.f24278b.mo10188b(new C7696d(c7707o.f24280d, c7707o.f24281e, c7707o.f24282f, c7707o.f24283g, null, c7707o.f24284h));
        C7702j c7702j = new C7702j();
        C0132i c0132i = new C0132i(c7707o, 24, interfaceC2186j);
        this.f24275Y = 1;
        c7702j.mo3141d(c0132i, this);
        return enumC19250a;
    }
}
