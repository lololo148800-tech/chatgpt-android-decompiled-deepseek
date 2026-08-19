package p753fh;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13645c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f43101Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f43102Z;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13645c c13645c = new C13645c(2, interfaceC18770c);
        c13645c.f43102Z = obj;
        return c13645c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13645c) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f43101Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f43102Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("accounts/data_export");
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50985c, c13693cM21253x, c6752c);
            this.f43101Y = 1;
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
