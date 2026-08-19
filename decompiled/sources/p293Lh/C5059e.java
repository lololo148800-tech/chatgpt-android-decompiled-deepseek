package p293Lh;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2052a;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Lh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5059e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f16535Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f16536Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5059e(InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16536Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5059e c5059e = new C5059e(this.f16536Z, interfaceC18770c);
        c5059e.f16535Y = obj;
        return c5059e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5059e c5059e = (C5059e) create((InterfaceC2052a) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5059e.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC1436k) this.f16536Z.getValue()).invoke((InterfaceC2052a) this.f16535Y);
        return C17296C.f55119a;
    }
}
