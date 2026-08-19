package p480Te;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Te.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7381f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23385Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f23386Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23387o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f23388p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7381f(String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23387o0 = str;
        this.f23388p0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7381f c7381f = new C7381f(this.f23387o0, this.f23388p0, interfaceC18770c);
        c7381f.f23386Z = obj;
        return c7381f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7381f) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23385Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f23386Z;
            StringBuilder sb2 = new StringBuilder("conversation/");
            sb2.append(this.f23387o0);
            sb2.append("/attachment/");
            C13693c c13693cM21253x = AbstractC20734X.m21253x(AbstractC9306j0.m9891j(this.f23388p0, "/download", sb2));
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50984b, c13693cM21253x, c6752c);
            this.f23385Y = 1;
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
