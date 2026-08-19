package p679ce;

import com.google.protobuf.AbstractC12107L1;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p571X9.AbstractC9233X;
import p737f1.InterfaceC13515g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ce.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C11716g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8775T f35530Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC13515g f35531Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11716g(C8775T c8775t, InterfaceC13515g interfaceC13515g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35530Y = c8775t;
        this.f35531Z = interfaceC13515g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11716g(this.f35530Y, this.f35531Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C11716g c11716g = (C11716g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c11716g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (this.f35530Y.m9529a() != EnumC8776U.f26771o0) {
            AbstractC12107L1.m13813d(this.f35531Z);
        }
        return C17296C.f55119a;
    }
}
