package tf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1000s0.C19408d;
import p225Im.InterfaceC3759g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: tf.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C19898C extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC3759g f63045Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19408d f63046Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19898C(InterfaceC3759g interfaceC3759g, C19408d c19408d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63045Y = interfaceC3759g;
        this.f63046Z = c19408d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19898C(this.f63045Y, this.f63046Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C19898C c19898c = (C19898C) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c19898c.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC1436k) this.f63045Y).invoke(new C19933r(this.f63046Z.m20498j()));
        return C17296C.f55119a;
    }
}
