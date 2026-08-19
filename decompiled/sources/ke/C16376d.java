package ke;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p1082wd.C20908a;
import p1155zi.C21936L0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ke.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16376d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50859Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16382j f50860Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16376d(C16382j c16382j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50860Z = c16382j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16376d c16376d = new C16376d(this.f50860Z, interfaceC18770c);
        c16376d.f50859Y = obj;
        return c16376d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21936L0 c21936l0 = (C21936L0) obj;
        String str = c21936l0 != null ? c21936l0.f69488a : null;
        C16376d c16376d = (C16376d) create(str != null ? new C21936L0(str) : null, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16376d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C21936L0 c21936l0 = (C21936L0) this.f50859Y;
        if ((c21936l0 != null ? c21936l0.f69488a : null) == null) {
            C2153Q0 c2153q0 = this.f50860Z.f50875b;
            do {
                value = c2153q0.getValue();
            } while (!c2153q0.m3250k(value, C20908a.m21452a((C20908a) value, null, null, null, false, 28)));
        }
        return C17296C.f55119a;
    }
}
