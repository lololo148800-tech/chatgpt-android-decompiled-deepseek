package p406Qg;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p507Uh.C7681g;
import p507Uh.InterfaceC7678d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Qg.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C6726v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC7678d f21604Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f21605Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f21606o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6726v(InterfaceC7678d interfaceC7678d, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21604Y = interfaceC7678d;
        this.f21605Z = interfaceC5985X;
        this.f21606o0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6726v(this.f21604Y, this.f21605Z, this.f21606o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6726v c6726v = (C6726v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c6726v.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = this.f21604Y.mo3586a() instanceof C7681g;
        if (((Boolean) this.f21605Z.getValue()).booleanValue() != z6) {
            ((InterfaceC1436k) this.f21606o0.getValue()).invoke(Boolean.valueOf(z6));
        }
        return C17296C.f55119a;
    }
}
