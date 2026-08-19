package p080D0;

import mm.C17296C;
import p002A0.C0132i;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2219z0;
import p349O0.C5997d;
import p349O0.InterfaceC5982V0;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C1791Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5132Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5133Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5982V0 f5134o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13756d f5135p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791Z(InterfaceC5982V0 interfaceC5982V0, C13756d c13756d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5134o0 = interfaceC5982V0;
        this.f5135p0 = c13756d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1791Z c1791z = new C1791Z(this.f5134o0, this.f5135p0, interfaceC18770c);
        c1791z.f5133Z = obj;
        return c1791z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1791Z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5132Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f5133Z;
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C1789X(this.f5134o0, 0));
            C0132i c0132i = new C0132i(this.f5135p0, 1, interfaceC0571F);
            this.f5132Y = 1;
            if (c2219z0M6441a0.mo3141d(c0132i, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
