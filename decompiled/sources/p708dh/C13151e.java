package p708dh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p1155zi.C22038o;
import p552Wg.C8847i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13151e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41747Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13168v f41748Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13158l f41749o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13151e(C13168v c13168v, C13158l c13158l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41748Z = c13168v;
        this.f41749o0 = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13151e(this.f41748Z, this.f41749o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13151e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2146N c2146n;
        C13150d c13150d;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41747Y;
        C13168v c13168v = this.f41748Z;
        C13158l c13158l = this.f41749o0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                this.f41747Y = 3;
                if (c13168v.m21028a(this) == enumC19250a) {
                    return enumC19250a;
                }
                this.f41747Y = 4;
                if (c13158l.m14823d(this) == enumC19250a) {
                    return enumC19250a;
                }
                c2146n = new C2146N(c13158l.f41776a.f64176f, 2);
                c13150d = new C13150d(c13158l, null);
                this.f41747Y = 5;
                if (AbstractC2124C.m3212k(c2146n, c13150d, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i10 == 3) {
                AbstractC9233X.m9807c(obj);
                this.f41747Y = 4;
                if (c13158l.m14823d(this) == enumC19250a) {
                    return enumC19250a;
                }
                c2146n = new C2146N(c13158l.f41776a.f64176f, 2);
                c13150d = new C13150d(c13158l, null);
                this.f41747Y = 5;
                if (AbstractC2124C.m3212k(c2146n, c13150d, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i10 == 4) {
                AbstractC9233X.m9807c(obj);
                c2146n = new C2146N(c13158l.f41776a.f64176f, 2);
                c13150d = new C13150d(c13158l, null);
                this.f41747Y = 5;
                if (AbstractC2124C.m3212k(c2146n, c13150d, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f41747Y = 1;
        obj = AbstractC2124C.m3221t(c13168v.f64176f, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C13159m c13159m = c13158l.f41776a;
        C8847i c8847i = new C8847i((C22038o) obj, 19, c13158l);
        this.f41747Y = 2;
        if (c13159m.m21029b(c8847i, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f41747Y = 3;
        if (c13168v.m21028a(this) == enumC19250a) {
            return enumC19250a;
        }
        this.f41747Y = 4;
        if (c13158l.m14823d(this) == enumC19250a) {
            return enumC19250a;
        }
        c2146n = new C2146N(c13158l.f41776a.f64176f, 2);
        c13150d = new C13150d(c13158l, null);
        this.f41747Y = 5;
        if (AbstractC2124C.m3212k(c2146n, c13150d, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
