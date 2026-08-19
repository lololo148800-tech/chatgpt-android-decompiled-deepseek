package mh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p507Uh.InterfaceC7678d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C17267o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC7678d f55069Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17267o(InterfaceC7678d interfaceC7678d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55069Y = interfaceC7678d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17267o(this.f55069Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17267o c17267o = (C17267o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17267o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f55069Y.mo3587b();
        return C17296C.f55119a;
    }
}
