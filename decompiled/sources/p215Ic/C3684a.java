package p215Ic;

import mm.C17296C;
import p003A1.C0254h0;
import p049Bm.InterfaceC1439n;
import p1155zi.C21891A;
import p571X9.AbstractC9233X;
import p836jh.C16211c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ic.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3684a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f11176Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3685b f11177Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3684a(C3685b c3685b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11177Z = c3685b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3684a c3684a = new C3684a(this.f11177Z, interfaceC18770c);
        c3684a.f11176Y = obj;
        return c3684a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3684a c3684a = (C3684a) create((C21891A) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3684a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((C16211c) this.f11177Z.f11182q0).m17805a(new C0254h0((C21891A) this.f11176Y, 25));
        return C17296C.f55119a;
    }
}
