package p736f0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p066Cc.C1625b;
import p103Dn.C2219z0;
import p349O0.C5997d;
import p349O0.C6010j0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p758g0.C13771k0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: f0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C13496n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f42720Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f42721Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13771k0 f42722o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f42723p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13496n(C13771k0 c13771k0, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f42722o0 = c13771k0;
        this.f42723p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13496n c13496n = new C13496n(this.f42722o0, this.f42723p0, interfaceC18770c);
        c13496n.f42721Z = obj;
        return c13496n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13496n) create((C6010j0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f42720Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6010j0 c6010j0 = (C6010j0) this.f42721Z;
            C13771k0 c13771k0 = this.f42722o0;
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C13495m(c13771k0, 0));
            C1625b c1625b = new C1625b(c6010j0, c13771k0, this.f42723p0, 10);
            this.f42720Y = 1;
            if (c2219z0M6441a0.mo3141d(c1625b, this) == enumC19250a) {
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
