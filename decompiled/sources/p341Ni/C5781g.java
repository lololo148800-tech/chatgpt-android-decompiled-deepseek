package p341Ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p1016t3.C19797x;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5781g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5785i f18820Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18821Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5781g(C5785i c5785i, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18820Y = c5785i;
        this.f18821Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5781g(this.f18820Y, this.f18821Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5781g c5781g = (C5781g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5781g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C5785i c5785i = this.f18820Y;
        C19797x c19797xM20753b = C19797x.m20753b(this.f18821Z);
        C1526D c1526d = c5785i.f18876b;
        c1526d.m4523N(c19797xM20753b);
        c1526d.m2246g0();
        c1526d.m2250k0(true);
        return C17296C.f55119a;
    }
}
