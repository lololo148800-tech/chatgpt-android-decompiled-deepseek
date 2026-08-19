package p1063vf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import pf.AbstractC18404t;
import pf.C18403s;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20598f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f65355Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20598f c20598f = new C20598f(2, interfaceC18770c);
        c20598f.f65355Y = obj;
        return c20598f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20598f) create((AbstractC18404t) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((AbstractC18404t) this.f65355Y) instanceof C18403s);
    }
}
