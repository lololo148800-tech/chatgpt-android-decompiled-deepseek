package bg;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1149zc.C21837F;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C11407g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5982V0 f34441Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f34442Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f34443o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11407g(InterfaceC5982V0 interfaceC5982V0, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34441Y = interfaceC5982V0;
        this.f34442Z = interfaceC5985X;
        this.f34443o0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11407g(this.f34441Y, this.f34442Z, this.f34443o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C11407g c11407g = (C11407g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c11407g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C21837F c21837f = (C21837F) this.f34441Y.getValue();
        if (c21837f != null) {
            ((InterfaceC1436k) this.f34442Z.getValue()).invoke(c21837f);
            ((InterfaceC1426a) this.f34443o0.getValue()).invoke();
        }
        return C17296C.f55119a;
    }
}
