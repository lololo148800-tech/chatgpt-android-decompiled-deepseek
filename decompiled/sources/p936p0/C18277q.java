package p936p0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p860l0.InterfaceC16694M0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: p0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C18277q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18280t f58337Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f58338Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f58339o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18277q(C18280t c18280t, int i10, int i11, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58337Y = c18280t;
        this.f58338Z = i10;
        this.f58339o0 = i11;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18277q(this.f58337Y, this.f58338Z, this.f58339o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18277q c18277q = (C18277q) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18277q.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f58337Y.m19826j(this.f58338Z, this.f58339o0);
        return C17296C.f55119a;
    }
}
