package cg;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p364Oh.AbstractC6241o;
import p364Oh.C6226E;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: cg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C11734f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35584Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35585Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11745q f35586o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11734f(C11745q c11745q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35586o0 = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11734f c11734f = new C11734f(this.f35586o0, interfaceC18770c);
        c11734f.f35585Z = obj;
        return c11734f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11734f) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35584Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f35585Z;
            C13693c c13693c = new C13693c();
            C6226E c6226e = this.f35586o0.f35623b;
            AbstractC13695e.m15172b(c13693c, "https://api.openai.com");
            AbstractC13695e.m15173c(c13693c, "dashboard/onboarding/login", null, 23);
            c13693c.f43200f.m20652f(AbstractC6241o.f20322d, C17296C.f55119a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f35584Y = 1;
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
