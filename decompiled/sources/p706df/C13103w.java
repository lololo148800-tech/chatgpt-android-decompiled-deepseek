package p706df;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3759g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: df.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C13103w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f41611Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3759g f41612Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13103w(String str, InterfaceC3759g interfaceC3759g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41611Y = str;
        this.f41612Z = interfaceC3759g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13103w(this.f41611Y, this.f41612Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C13103w c13103w = (C13103w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c13103w.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        String str = this.f41611Y;
        if (str != null) {
            ((InterfaceC1436k) this.f41612Z).invoke(new C13091k(str));
        }
        return C17296C.f55119a;
    }
}
