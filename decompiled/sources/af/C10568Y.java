package af;

import bf.C11363S;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: af.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10568Y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C11363S f31373Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f31374Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10568Y(C11363S c11363s, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31373Y = c11363s;
        this.f31374Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10568Y(this.f31373Y, this.f31374Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C10568Y c10568y = (C10568Y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c10568y.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C11363S c11363s = this.f31373Y;
        if (c11363s.f34361c != null) {
            ((InterfaceC1436k) this.f31374Z.getValue()).invoke(new C10550F(c11363s));
        }
        return C17296C.f55119a;
    }
}
