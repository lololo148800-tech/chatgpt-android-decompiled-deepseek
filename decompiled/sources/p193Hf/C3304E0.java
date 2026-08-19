package p193Hf;

import mm.C17296C;
import p040Bd.C1032Y1;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3304E0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10068Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3337V0 f10069Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3304E0(C3337V0 c3337v0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10069Z = c3337v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3304E0 c3304e0 = new C3304E0(this.f10069Z, interfaceC18770c);
        c3304e0.f10068Y = obj;
        return c3304e0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3304E0 c3304e0 = (C3304E0) create((C1032Y1) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3304e0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f10069Z.m4172a(new C3299C((C1032Y1) this.f10068Y));
        return C17296C.f55119a;
    }
}
