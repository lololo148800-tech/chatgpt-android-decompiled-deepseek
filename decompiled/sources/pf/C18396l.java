package pf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18396l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5982V0 f58680Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f58681Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18396l(InterfaceC5982V0 interfaceC5982V0, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58680Y = interfaceC5982V0;
        this.f58681Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18396l(this.f58680Y, this.f58681Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18396l c18396l = (C18396l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18396l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC5982V0 interfaceC5982V0 = this.f58680Y;
        float f10 = AbstractC18397m.f58682a;
        if (C7540e.m7873a(((C7540e) interfaceC5982V0.getValue()).f23894Y, AbstractC18397m.f58682a)) {
            this.f58681Z.setValue(Boolean.TRUE);
        }
        return C17296C.f55119a;
    }
}
