package p502Uc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p758g0.C13781p0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7617a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24076Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f24077Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7617a(C13756d c13756d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24077Z = c13756d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7617a(this.f24077Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7617a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24076Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Float f10 = new Float(0.0f);
            C13781p0 c13781p0M15255t = AbstractC13758e.m15255t(1400, 0, AbstractC13725A.f43288a, 2);
            this.f24076Y = 1;
            if (C13756d.m15222c(this.f24077Z, f10, c13781p0M15255t, null, this, 12) == enumC19250a) {
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
