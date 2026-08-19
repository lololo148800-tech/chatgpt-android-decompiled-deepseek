package gh;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p523V9.AbstractC8056b6;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C14145m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44502Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44503Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f44504o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f44505p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14145m(String str, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44504o0 = str;
        this.f44505p0 = obj;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14145m c14145m = new C14145m(this.f44504o0, this.f44505p0, interfaceC18770c);
        c14145m.f44503Z = obj;
        return c14145m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14145m) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44502Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f44503Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("settings/account_user_setting");
            AbstractC8056b6.m8452c(c13693cM21253x, "feature", this.f44504o0);
            AbstractC8056b6.m8452c(c13693cM21253x, "value", this.f44505p0);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50987e, c13693cM21253x, c6752c);
            this.f44502Y = 1;
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
