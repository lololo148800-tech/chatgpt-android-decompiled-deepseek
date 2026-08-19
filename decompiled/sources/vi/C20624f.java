package vi;

import bg.C11400B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20624f extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C11400B f65460Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20624f(C11400B c11400b, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f65460Y = c11400b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20624f(this.f65460Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20624f c20624f = (C20624f) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c20624f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f65460Y.f64174d.delete();
        return C17296C.f55119a;
    }
}
