package p527Ve;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9268c4;
import p737f1.C13522n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ve.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C8278o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13522n f25804Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8278o(C13522n c13522n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25804Y = c13522n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8278o(this.f25804Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8278o c8278o = (C8278o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8278o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC9268c4.m9841b(this.f25804Y);
        return C17296C.f55119a;
    }
}
