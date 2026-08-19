package vi;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vi.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20626h extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC20628j f65465Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20626h(AbstractC20628j abstractC20628j, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f65465Y = abstractC20628j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20626h(this.f65465Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20626h c20626h = (C20626h) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c20626h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f65465Y.f64174d.delete();
        return C17296C.f55119a;
    }
}
