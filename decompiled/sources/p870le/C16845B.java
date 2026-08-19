package p870le;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20859E;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C16845B extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f54031Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16845B(InterfaceC20904w interfaceC20904w, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54031Y = interfaceC20904w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16845B(this.f54031Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16845B c16845b = (C16845B) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16845b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f54031Y.mo21448b(C20859E.f66353g, "camera", C17690x.f56481Y);
        return C17296C.f55119a;
    }
}
