package mh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3759g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C17265m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f55066Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3759g f55067Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17265m(boolean z6, InterfaceC3759g interfaceC3759g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55066Y = z6;
        this.f55067Z = interfaceC3759g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17265m(this.f55066Y, this.f55067Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17265m c17265m = (C17265m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17265m.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (!this.f55066Y) {
            ((InterfaceC1436k) this.f55067Z).invoke(C17258f.f55054a);
        }
        return C17296C.f55119a;
    }
}
