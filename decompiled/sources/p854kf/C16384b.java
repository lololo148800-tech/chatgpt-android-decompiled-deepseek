package p854kf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p758g0.C13775m0;
import p792hl.C14535j;
import p857kl.C16438E;
import p871lf.C16937u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: kf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16384b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f50882Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50883Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16937u f50884o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16384b(C16937u c16937u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50884o0 = c16937u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16384b c16384b = new C16384b(this.f50884o0, interfaceC18770c);
        c16384b.f50883Z = obj;
        return c16384b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16384b) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50882Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f50883Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "jawbones", new C13775m0(c13693c, 17, this.f50884o0), 7);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f50882Y = 1;
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
