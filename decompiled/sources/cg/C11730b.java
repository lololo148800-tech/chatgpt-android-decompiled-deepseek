package cg;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p364Oh.AbstractC6241o;
import p364Oh.C6226E;
import p409Qk.C6752c;
import p523V9.AbstractC8056b6;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: cg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11730b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35571Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35572Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11745q f35573o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11730b(C11745q c11745q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35573o0 = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11730b c11730b = new C11730b(this.f35573o0, interfaceC18770c);
        c11730b.f35572Z = obj;
        return c11730b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11730b) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35571Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f35572Z;
            C13693c c13693c = new C13693c();
            C6226E c6226e = this.f35573o0.f35623b;
            AbstractC13695e.m15172b(c13693c, "https://api.openai.com");
            AbstractC13695e.m15173c(c13693c, "dashboard/public/countries", null, 23);
            AbstractC8056b6.m8452c(c13693c, "expand", "dial_code,label_local");
            C19666a c19666a = AbstractC6241o.f20322d;
            C17296C c17296c = C17296C.f55119a;
            C19675j c19675j = c13693c.f43200f;
            c19675j.m20652f(c19666a, c17296c);
            c19675j.m20652f(AbstractC6241o.f20319a, c17296c);
            c19675j.m20652f(AbstractC6241o.f20321c, c17296c);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50984b, c13693c, c6752c);
            this.f35571Y = 1;
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
