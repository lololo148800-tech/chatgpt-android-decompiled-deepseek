package vi;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20619a extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC20621c f65453Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20619a(AbstractC20621c abstractC20621c, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f65453Y = abstractC20621c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20619a(this.f65453Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20619a c20619a = (C20619a) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c20619a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f65453Y.f64174d.delete();
        return C17296C.f55119a;
    }
}
