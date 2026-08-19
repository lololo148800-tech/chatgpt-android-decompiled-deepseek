package p878lo;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: lo.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C17109r extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f54673Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54674o0;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17109r c17109r = new C17109r(2, interfaceC18770c);
        c17109r.f54674o0 = obj;
        return c17109r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17109r) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54673Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y = (C19748y) this.f54674o0;
            this.f54673Z = 1;
            obj = AbstractC16689K1.m18509f(c19748y, EnumC19730g.f62466Z, this);
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
