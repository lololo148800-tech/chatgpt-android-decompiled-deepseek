package p858ko;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21073a0;
import p544W9.AbstractC8753z4;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13746W;
import p775h2.AbstractC14376f;
import p878lo.C17106o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C16490I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51157Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16495N f51158Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f51159o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16490I(C16495N c16495n, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51158Z = c16495n;
        this.f51159o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16490I(this.f51158Z, this.f51159o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16490I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM15834M;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51157Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16495N c16495n = this.f51158Z;
            C16500c c16500c = c16495n.f51170C0;
            C16484C c16484c = c16495n.f51169B0;
            this.f51157Y = 1;
            c16500c.getClass();
            C17106o c17106oM18054g = c16484c.m18054g();
            if (!c17106oM18054g.f54659a) {
                c17106oM18054g = null;
            }
            if (c17106oM18054g != null) {
                Float f10 = c16500c.f51183a;
                float fFloatValue = f10 != null ? f10.floatValue() : c16484c.m18056i().f51152a;
                if (fFloatValue - AbstractC21073a0.m21556b(c17106oM18054g.f54660b) < 0.05f) {
                    C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 400.0f, null, 5);
                    C16503f c16503fM18050c = c16484c.m18050c();
                    if (c16503fM18050c == null || (objM15834M = AbstractC14376f.m15834M(c16484c, AbstractC8753z4.m9514b(c16503fM18050c.f51188b), 0L, c13746wM15254s, this, 2)) != enumC19250a) {
                        objM15834M = c17296c;
                    }
                    if (objM15834M != enumC19250a) {
                        objM15834M = c17296c;
                    }
                } else {
                    objM15834M = AbstractC14376f.m15834M(c16484c, fFloatValue, this.f51159o0, null, this, 4);
                    if (objM15834M != enumC19250a) {
                        objM15834M = c17296c;
                    }
                }
            } else {
                objM15834M = c17296c;
            }
            if (objM15834M == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
