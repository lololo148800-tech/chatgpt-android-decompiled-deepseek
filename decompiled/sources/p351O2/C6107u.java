package p351O2;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p066Cc.C1625b;
import p086D6.C1971o;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6107u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19857Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19858Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6084G f19859o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6107u(C6084G c6084g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19859o0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6107u c6107u = new C6107u(this.f19859o0, interfaceC18770c);
        c6107u.f19858Z = obj;
        return c6107u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6107u) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19857Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f19858Z;
        C6084G c6084g = this.f19859o0;
        AbstractC6085H abstractC6085H = (AbstractC6085H) c6084g.f19817g.getValue();
        if (!(abstractC6085H instanceof C6089c)) {
            c6084g.f19819i.m12576u0(new C6099m(abstractC6085H));
        }
        C6105s c6105s = new C6105s(abstractC6085H, null);
        this.f19857Y = 1;
        AbstractC2124C.m3219r(interfaceC2186j);
        c6084g.f19817g.mo3141d(new C1625b(new C16556x(), new C1971o(interfaceC2186j, 15), c6105s), this);
        return enumC19250a;
    }
}
