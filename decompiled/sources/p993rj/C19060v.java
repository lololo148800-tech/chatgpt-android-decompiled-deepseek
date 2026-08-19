package p993rj;

import mm.C17296C;
import mm.C17312o;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C19060v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60729Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19024D f60730Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19060v(C19024D c19024d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60730Z = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19060v(this.f60730Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19060v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60729Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f60730Z.f60634s) {
                return new C17312o(AbstractC9233X.m9806b(new RuntimeException("Image capture already requested.")));
            }
            this.f60730Z.f60636u.setValue(null);
            this.f60730Z.f60634s = true;
            C3516e c3516e = AbstractC0593T.f1824a;
            ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
            C19059u c19059u = new C19059u(this.f60730Z, null);
            this.f60729Y = 1;
            obj = AbstractC0575H.m1168P(executorC3515d, c19059u, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        Object obj2 = ((C17312o) obj).f55139Y;
        this.f60730Z.f60634s = false;
        return new C17312o(obj2);
    }
}
