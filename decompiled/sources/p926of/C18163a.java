package p926of;

import cd.C11709i;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p478Tc.C7299c;
import p492U1.C7543h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: of.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18163a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7299c f57929Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11709i f57930Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18163a(C7299c c7299c, C11709i c11709i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f57929Y = c7299c;
        this.f57930Z = c11709i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18163a(this.f57929Y, this.f57930Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18163a c18163a = (C18163a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18163a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C7543h c7543h = (C7543h) this.f57929Y.f23109b.getValue();
        if (c7543h != null) {
            this.f57930Z.m13032b(c7543h.f23897a);
        }
        return C17296C.f55119a;
    }
}
