package mh;

import com.google.protobuf.AbstractC12107L1;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p737f1.InterfaceC13515g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17253a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC13515g f55043Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17253a(InterfaceC13515g interfaceC13515g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55043Y = interfaceC13515g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17253a(this.f55043Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17253a c17253a = (C17253a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17253a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC12107L1.m13813d(this.f55043Y);
        return C17296C.f55119a;
    }
}
