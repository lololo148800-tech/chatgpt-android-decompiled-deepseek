package p971ql;

import io.ktor.utils.p815io.InterfaceC15088n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ql.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18763d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f59662Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC15088n f59663Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18763d(InterfaceC15088n interfaceC15088n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59663Z = interfaceC15088n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18763d c18763d = new C18763d(this.f59663Z, interfaceC18770c);
        c18763d.f59662Y = obj;
        return c18763d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18763d) create(obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(this.f59662Y != null || this.f59663Z.mo1141e());
    }
}
