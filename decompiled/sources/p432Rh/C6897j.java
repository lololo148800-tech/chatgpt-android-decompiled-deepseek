package p432Rh;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p092Dc.C1988e;
import p092Dc.C1996m;
import p092Dc.C2005v;
import p103Dn.C2217y0;
import p190Hc.C3287h;
import p571X9.AbstractC9233X;
import p708dh.C13166t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6897j extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f22107Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6900m f22108Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6897j(C6900m c6900m, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f22108Z = c6900m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C6897j(this.f22108Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C6897j) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM14826a;
        C1988e c1988e;
        C2217y0 c2217y0;
        C1996m c1996m;
        C13166t c13166t;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22107Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3287h c3287h = (C3287h) this.f22108Z.f22117c.get();
            this.f22107Y = 1;
            Object value = c3287h.f10025s0.f6797Y.getValue();
            C2005v c2005v = value instanceof C2005v ? (C2005v) value : null;
            if (c2005v == null || (c1988e = (C1988e) c2005v.f6142j.get()) == null || (c2217y0 = c1988e.f5878d) == null || (c1996m = (C1996m) c2217y0.f6797Y.getValue()) == null || (c13166t = (C13166t) c1996m.f5942d.f6148p.get()) == null || (objM14826a = c13166t.m14826a(this)) != enumC19250a) {
                objM14826a = c17296c;
            }
            if (objM14826a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
