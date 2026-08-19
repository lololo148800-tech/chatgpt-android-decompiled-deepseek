package p059C5;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p492U1.C7536a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: C5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1599q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ long f4480Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1599q c1599q = new C1599q(2, interfaceC18770c);
        c1599q.f4480Y = ((C7536a) obj).f23888a;
        return c1599q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((C7536a) obj).f23888a;
        C1599q c1599q = new C1599q(2, (InterfaceC18770c) obj2);
        c1599q.f4480Y = j10;
        return c1599q.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(!C7536a.m7857l(this.f4480Y));
    }
}
