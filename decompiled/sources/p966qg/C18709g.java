package p966qg;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p523V9.AbstractC8056b6;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: qg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18709g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f59539Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f59540Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f59541o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f59542p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f59543q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18709g(int i10, boolean z6, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59541o0 = i10;
        this.f59542p0 = z6;
        this.f59543q0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18709g c18709g = new C18709g(this.f59541o0, this.f59542p0, this.f59543q0, interfaceC18770c);
        c18709g.f59540Z = obj;
        return c18709g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18709g) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f59539Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f59540Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("prompt_library/");
            c13693cM21253x.f43200f.m20652f(AbstractC6241o.f20320b, C17296C.f55119a);
            AbstractC8056b6.m8452c(c13693cM21253x, "offset", new Integer(0));
            AbstractC8056b6.m8452c(c13693cM21253x, "limit", new Integer(this.f59541o0));
            AbstractC8056b6.m8452c(c13693cM21253x, "use_v2", Boolean.valueOf(this.f59542p0));
            AbstractC8056b6.m8452c(c13693cM21253x, "model_slug", this.f59543q0);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50984b, c13693cM21253x, c6752c);
            this.f59539Y = 1;
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
