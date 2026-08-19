package p387Pl;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Pl.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6505y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6454A f21103Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6505y(C6454A c6454a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21103Y = c6454a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6505y(this.f21103Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6505y c6505y = (C6505y) create((C17296C) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c6505y.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C6454A.m7034f(this.f21103Y);
        return C17296C.f55119a;
    }
}
