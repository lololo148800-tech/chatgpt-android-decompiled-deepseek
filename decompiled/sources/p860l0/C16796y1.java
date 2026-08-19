package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16796y1 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f53906Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f53907o0;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16796y1 c16796y1 = new C16796y1(2, interfaceC18770c);
        c16796y1.f53907o0 = obj;
        return c16796y1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16796y1) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53906Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y = (C19748y) this.f53907o0;
            this.f53906Z = 1;
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
