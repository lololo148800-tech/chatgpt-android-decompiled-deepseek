package p192He;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p092Dc.C2001r;
import p103Dn.AbstractC2124C;
import p103Dn.C2217y0;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: He.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3292d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10036Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2001r f10037Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3294f f10038o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3292d(C2001r c2001r, C3294f c3294f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10037Z = c2001r;
        this.f10038o0 = c3294f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3292d(this.f10037Z, this.f10038o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3292d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10036Y;
        C17296C c17296c = C17296C.f55119a;
        C3294f c3294f = this.f10038o0;
        C2001r c2001r = this.f10037Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c3294f.f10049d.remove(c2001r);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C2217y0 c2217y0 = ((C14459O) c2001r.f6116r.get()).f45527z;
        C3291c c3291c = new C3291c(2, null);
        this.f10036Y = 1;
        if (AbstractC2124C.m3220s(c2217y0, c3291c, this) == enumC19250a) {
            return enumC19250a;
        }
        if (C3294f.m4163a(c3294f, c2001r)) {
            return c17296c;
        }
        this.f10036Y = 2;
        if (C3294f.m4164b(c3294f, c2001r, this) == enumC19250a) {
            return enumC19250a;
        }
        c3294f.f10049d.remove(c2001r);
        return c17296c;
    }
}
