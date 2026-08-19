package p002A0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2219z0;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0133j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f551Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f552Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0134k f553o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133j(C0134k c0134k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f553o0 = c0134k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0133j c0133j = new C0133j(this.f553o0, interfaceC18770c);
        c0133j.f552Z = obj;
        return c0133j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0133j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f551Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f552Z;
            C0134k c0134k = this.f553o0;
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C0130g(c0134k, 0));
            C0132i c0132i = new C0132i(c0134k, 0, interfaceC0571F);
            this.f551Y = 1;
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
