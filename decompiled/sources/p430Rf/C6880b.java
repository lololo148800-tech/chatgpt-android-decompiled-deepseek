package p430Rf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6880b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f22066Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f22067Z;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6880b c6880b = new C6880b(2, interfaceC18770c);
        c6880b.f22067Z = obj;
        return c6880b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6880b) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22066Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f22067Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("models");
            c13693cM21253x.f43200f.m20652f(AbstractC6241o.f20320b, C17296C.f55119a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50984b, c13693cM21253x, c6752c);
            this.f22066Y = 1;
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
