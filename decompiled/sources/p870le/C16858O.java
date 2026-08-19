package p870le;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1025te.C19866Q;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C16858O extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19866Q f54083Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f54084Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16858O(C19866Q c19866q, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54083Y = c19866q;
        this.f54084Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16858O(this.f54083Y, this.f54084Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16858O c16858o = (C16858O) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16858o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C19866Q c19866q = this.f54083Y;
        if (c19866q.f62970a.f19682a.f10934Y.length() > 0 || !c19866q.f62975f.isEmpty()) {
            this.f54084Z.setValue(Boolean.FALSE);
        }
        return C17296C.f55119a;
    }
}
