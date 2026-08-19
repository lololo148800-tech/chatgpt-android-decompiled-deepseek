package p1043ui;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p417R2.C6790b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ui.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20294d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f64160Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20294d c20294d = new C20294d(2, interfaceC18770c);
        c20294d.f64160Y = obj;
        return c20294d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20294d c20294d = (C20294d) create((C6790b) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20294d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C6790b c6790b = (C6790b) this.f64160Y;
        c6790b.m7233a();
        c6790b.f21795a.clear();
        return C17296C.f55119a;
    }
}
