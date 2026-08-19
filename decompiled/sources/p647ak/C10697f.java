package p647ak;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p045Bj.C1311i;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9233X;
import p949pj.C18451Y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10697f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31790Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC8170q0 f31791Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10713l f31792o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10697f(AbstractC8170q0 abstractC8170q0, C10713l c10713l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31791Z = abstractC8170q0;
        this.f31792o0 = c10713l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10697f(this.f31791Z, this.f31792o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10697f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31790Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C10648I0 c10648i0 = (C10648I0) this.f31791Z;
            this.f31790Y = 1;
            if (AbstractC0575H.m1184m(c10648i0.f31593a, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C1311i c1311i = this.f31792o0.f31837e;
        if (c1311i != null) {
            c1311i.invoke(new C18451Y());
        }
        return C17296C.f55119a;
    }
}
