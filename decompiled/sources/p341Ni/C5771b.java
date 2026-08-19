package p341Ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5771b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5785i f18794Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5773c f18795Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5771b(C5785i c5785i, C5773c c5773c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18794Y = c5785i;
        this.f18795Z = c5773c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5771b(this.f18794Y, this.f18795Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5771b c5771b = (C5771b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5771b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f18794Y.f18876b.m2248i0(this.f18795Z);
        return C17296C.f55119a;
    }
}
