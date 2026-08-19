package p1062vd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vd.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C20564n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20541V f65275Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f65276Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20564n(C20541V c20541v, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65275Y = c20541v;
        this.f65276Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20564n(this.f65275Y, this.f65276Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20564n c20564n = (C20564n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20564n.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC1436k) this.f65276Z.getValue()).invoke(new C20530J(this.f65275Y.f65169a));
        return C17296C.f55119a;
    }
}
