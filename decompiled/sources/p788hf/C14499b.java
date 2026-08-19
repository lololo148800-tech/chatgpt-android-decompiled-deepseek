package p788hf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p215Ic.C3685b;
import p571X9.AbstractC9233X;
import p620Zc.InterfaceC10277b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: hf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14499b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45702Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3685b f45703Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14499b(C3685b c3685b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45703Z = c3685b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14499b c14499b = new C14499b(this.f45703Z, interfaceC18770c);
        c14499b.f45702Y = obj;
        return c14499b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14499b c14499b = (C14499b) create((C1705j) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14499b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC10277b) this.f45703Z.f11179Z).setEnabled(((C1705j) this.f45702Y).f4885r);
        return C17296C.f55119a;
    }
}
