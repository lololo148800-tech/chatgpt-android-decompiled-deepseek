package p936p0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13746W;
import p758g0.C13774m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: p0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C18278r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58340Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18280t f58341Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18278r(C18280t c18280t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58341Z = c18280t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18278r(this.f58341Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18278r) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58340Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13774m c13774m = this.f58341Z.f58367w;
            Float f10 = new Float(0.0f);
            C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 400.0f, new Float(0.5f), 1);
            this.f58340Y = 1;
            if (AbstractC13758e.m15244i(c13774m, f10, c13746wM15254s, true, null, this, 8) == enumC19250a) {
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
