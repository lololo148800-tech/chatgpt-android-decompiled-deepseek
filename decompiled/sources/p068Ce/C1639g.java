package p068Ce;

import mm.C17296C;
import p017Af.C0491v;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ce.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1639g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4638Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f4639Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f4640o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639g(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4640o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1639g c1639g = new C1639g(this.f4640o0, interfaceC18770c);
        c1639g.f4639Z = obj;
        return c1639g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1639g) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4638Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f4639Z;
            C13693c c13693c = new C13693c();
            c13693c.f43200f.m20652f(AbstractC6241o.f20320b, C17296C.f55119a);
            AbstractC13695e.m15173c(c13693c, "share", new C0491v(this.f4640o0, 9), 7);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50984b, c13693c, c6752c);
            this.f4638Y = 1;
            obj = c14535jM21254y.m16038c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
