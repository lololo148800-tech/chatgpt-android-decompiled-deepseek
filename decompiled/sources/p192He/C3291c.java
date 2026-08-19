package p192He;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p216Id.InterfaceC3698f;
import p216Id.InterfaceC3702j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: He.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3291c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10035Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3291c c3291c = new C3291c(2, interfaceC18770c);
        c3291c.f10035Y = obj;
        return c3291c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3291c) create((InterfaceC3702j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(!(((InterfaceC3702j) this.f10035Y) instanceof InterfaceC3698f));
    }
}
