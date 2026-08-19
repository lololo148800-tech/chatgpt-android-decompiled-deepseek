package p878lo;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C17114w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54697Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54698Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f54699o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17116y f54700p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17114w(C19723A c19723a, C17116y c17116y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54699o0 = c19723a;
        this.f54700p0 = c17116y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17114w c17114w = new C17114w(this.f54699o0, this.f54700p0, interfaceC18770c);
        c17114w.f54698Z = obj;
        return c17114w;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17114w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54697Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f54698Z;
            EnumC0573G enumC0573G = EnumC0573G.f1793p0;
            C17116y c17116y = this.f54700p0;
            AbstractC0575H.m1156D(interfaceC0571F, null, enumC0573G, new C17112u(c17116y, null), 1);
            C17113v c17113v = new C17113v(c17116y, 0);
            C17113v c17113v2 = c17116y.f54705C0 != null ? new C17113v(c17116y, 1) : null;
            C17113v c17113v3 = c17116y.f54706D0 != null ? new C17113v(c17116y, 2) : null;
            C17113v c17113v4 = new C17113v(c17116y, 3);
            C17113v c17113v5 = new C17113v(c17116y, 4);
            this.f54697Y = 1;
            C19723A c19723a = this.f54699o0;
            Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C17110s(c17113v, c17113v3, c17113v2, c19723a, c17113v5, c17113v4, null), this);
            if (objM9428b != enumC19250a) {
                objM9428b = c17296c;
            }
            if (objM9428b == enumC19250a) {
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
