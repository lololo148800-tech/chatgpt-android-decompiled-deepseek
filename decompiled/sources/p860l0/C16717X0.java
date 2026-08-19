package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16717X0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f53561Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f53562Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16717X0(long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53562Z = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16717X0 c16717x0 = new C16717X0(this.f53562Z, interfaceC18770c);
        c16717x0.f53561Y = obj;
        return c16717x0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16717X0 c16717x0 = (C16717X0) create((C16748i1) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16717x0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C16757l1 c16757l1 = ((C16748i1) this.f53561Y).f53725a;
        C16757l1.m18531a(c16757l1, c16757l1.f53764h, this.f53562Z, 1);
        return C17296C.f55119a;
    }
}
