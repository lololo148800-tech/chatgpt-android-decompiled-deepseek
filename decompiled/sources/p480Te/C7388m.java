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

/* JADX INFO: renamed from: Te.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C7388m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23410Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f23411Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23412o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7388m(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23412o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7388m c7388m = new C7388m(this.f23412o0, interfaceC18770c);
        c7388m.f23411Z = obj;
        return c7388m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7388m) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23410Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f23411Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x(AbstractC9306j0.m9891j(this.f23412o0, "/uploaded", new StringBuilder("files/")));
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50985c, c13693cM21253x, c6752c);
            this.f23410Y = 1;
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
