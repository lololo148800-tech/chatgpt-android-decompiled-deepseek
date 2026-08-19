package p1063vf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20596d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20603k f65353Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20596d(C20603k c20603k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65353Y = c20603k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20596d(this.f65353Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20596d c20596d = (C20596d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20596d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C1526D c1526d = this.f65353Y.f65377k;
        c1526d.getClass();
        c1526d.m2250k0(false);
        return C17296C.f55119a;
    }
}
