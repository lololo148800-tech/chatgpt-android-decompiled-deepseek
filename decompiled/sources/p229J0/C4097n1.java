package p229J0;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p066Cc.C1625b;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4097n1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13133Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f13134Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17406l f13135o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4121r1 f13136p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4097n1(InterfaceC17406l interfaceC17406l, C4121r1 c4121r1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13135o0 = interfaceC17406l;
        this.f13136p0 = c4121r1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4097n1 c4097n1 = new C4097n1(this.f13135o0, this.f13136p0, interfaceC18770c);
        c4097n1.f13134Z = obj;
        return c4097n1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4097n1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13133Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f13134Z;
        ArrayList arrayList = new ArrayList();
        C2127D0 c2127d0Mo7768b = this.f13135o0.mo7768b();
        C1625b c1625b = new C1625b(arrayList, interfaceC0571F, this.f13136p0, 6);
        this.f13133Y = 1;
        c2127d0Mo7768b.mo3141d(c1625b, this);
        return enumC19250a;
    }
}
