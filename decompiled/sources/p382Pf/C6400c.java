package p382Pf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p507Uh.C7677c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Pf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6400c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7677c f20826Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6400c(C7677c c7677c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f20826Y = c7677c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6400c(this.f20826Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6400c c6400c = (C6400c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c6400c.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f20826Y.m7971a();
        return C17296C.f55119a;
    }
}
