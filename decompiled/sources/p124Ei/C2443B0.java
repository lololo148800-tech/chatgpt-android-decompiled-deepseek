package p124Ei;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2443B0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5985X f7591Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f7592Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443B0(InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7591Y = interfaceC5985X;
        this.f7592Z = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2443B0(this.f7591Y, this.f7592Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C2443B0 c2443b0 = (C2443B0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c2443b0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC1426a) this.f7592Z.getValue()).invoke();
        this.f7591Y.setValue(Boolean.FALSE);
        return C17296C.f55119a;
    }
}
