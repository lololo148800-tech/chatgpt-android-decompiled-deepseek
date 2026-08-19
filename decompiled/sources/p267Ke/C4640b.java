package p267Ke;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1151ze.C21878b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ke.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4640b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15099Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4641c f15100Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4640b(C4641c c4641c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15100Z = c4641c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4640b c4640b = new C4640b(this.f15100Z, interfaceC18770c);
        c4640b.f15099Y = obj;
        return c4640b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4640b c4640b = (C4640b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4640b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f15099Y;
        for (C21878b c21878b : this.f15100Z.f15101a) {
            c21878b.getClass();
            AbstractC0575H.m1156D(interfaceC0571F, AbstractC0593T.f1824a, null, new C4639a(c21878b, null), 2);
        }
        return C17296C.f55119a;
    }
}
