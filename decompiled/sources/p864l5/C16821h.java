package p864l5;

import mm.C17296C;
import p007A5.AbstractC0371f;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0583L;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p1075w5.C20831i;
import p1121y5.C21388a;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16821h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53966Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53967Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20831i f53968o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16826m f53969p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16821h(C16826m c16826m, InterfaceC18770c interfaceC18770c, C20831i c20831i) {
        super(2, interfaceC18770c);
        this.f53968o0 = c20831i;
        this.f53969p0 = c16826m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16821h c16821h = new C16821h(this.f53969p0, interfaceC18770c, this.f53968o0);
        c16821h.f53967Z = obj;
        return c16821h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16821h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53966Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f53967Z;
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
            C16826m c16826m = this.f53969p0;
            C20831i c20831i = this.f53968o0;
            C0583L c0583lM1177f = AbstractC0575H.m1177f(interfaceC0571F, c1451e, new C16820g(c16826m, null, c20831i), 2);
            AbstractC0371f.m1003c(((C21388a) c20831i.f66212c).f67898Z).m21441b();
            this.f53966Y = 1;
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
