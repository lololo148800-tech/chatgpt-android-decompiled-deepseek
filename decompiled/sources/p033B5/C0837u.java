package p033B5;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0583L;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p374P5.C6354g;
import p571X9.AbstractC9233X;
import p658b5.C11234e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: B5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0837u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f2324Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f2325Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6354g f2326o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0840x f2327p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837u(C0840x c0840x, C6354g c6354g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f2326o0 = c6354g;
        this.f2327p0 = c0840x;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0837u c0837u = new C0837u(this.f2327p0, this.f2326o0, interfaceC18770c);
        c0837u.f2325Z = obj;
        return c0837u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0837u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2324Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f2325Z;
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
            C0840x c0840x = this.f2327p0;
            C6354g c6354g = this.f2326o0;
            C0583L c0583lM1177f = AbstractC0575H.m1177f(interfaceC0571F, c1451e, new C0836t(c0840x, c6354g, null), 2);
            C11234e c11234e = c6354g.f20663c;
            this.f2324Y = 1;
            obj = c0583lM1177f.m1309u(this);
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
