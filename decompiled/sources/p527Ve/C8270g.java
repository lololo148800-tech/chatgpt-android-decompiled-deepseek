package p527Ve;

import bf.C11349D;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1155zi.C21936L0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ve.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C8270g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f25778Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f25779Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f25780o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8270g(InterfaceC20904w interfaceC20904w, C11349D c11349d, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25778Y = interfaceC20904w;
        this.f25779Z = c11349d;
        this.f25780o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8270g(this.f25778Y, this.f25779Z, this.f25780o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8270g c8270g = (C8270g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8270g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (((Boolean) this.f25780o0.getValue()).booleanValue()) {
            this.f25778Y.mo21448b(C20893l.f66577o, new C21936L0(this.f25779Z.f34318a), C17690x.f56481Y);
        }
        return C17296C.f55119a;
    }
}
