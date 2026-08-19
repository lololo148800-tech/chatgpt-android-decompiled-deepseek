package p993rj;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C19030J extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60657Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19031K f60658Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19030J(C19031K c19031k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60658Z = c19031k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19030J(this.f60658Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19030J) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60657Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(qffLJgOYizGmMj.WupVNUrIevAT);
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f60657Y = 1;
        if (AbstractC0575H.m1184m(5000L, this) == enumC19250a) {
            return enumC19250a;
        }
        C3516e c3516e = AbstractC0593T.f1824a;
        C1451e c1451e = AbstractC2935m.f8797a;
        C19029I c19029i = new C19029I(this.f60658Z, null);
        this.f60657Y = 2;
        if (AbstractC0575H.m1168P(c1451e, c19029i, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
