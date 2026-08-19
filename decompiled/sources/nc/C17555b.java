package nc;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6010j0;
import p571X9.AbstractC9233X;
import p712dp.C13189e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17555b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f56160Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13189e f56161Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f56162o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17555b(C13189e c13189e, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56161Z = c13189e;
        this.f56162o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17555b c17555b = new C17555b(this.f56161Z, this.f56162o0, interfaceC18770c);
        c17555b.f56160Y = obj;
        return c17555b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17555b c17555b = (C17555b) create((C6010j0) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17555b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((C6010j0) this.f56160Y).setValue(this.f56161Z.m14846a(this.f56162o0));
        return C17296C.f55119a;
    }
}
