package p647ak;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10694e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31770Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10713l f31771Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC8170q0 f31772o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10694e(AbstractC8170q0 abstractC8170q0, C10713l c10713l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31771Z = c10713l;
        this.f31772o0 = abstractC8170q0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10694e(this.f31772o0, this.f31771Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10694e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31770Y;
        C10713l c10713l = this.f31771Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C1970n c1970n = new C1970n(c10713l.f31834b.mo209b(), new C10685b(2, null));
        this.f31770Y = 1;
        if (AbstractC2124C.m3211j(c1970n, this) == enumC19250a) {
            return enumC19250a;
        }
        C3516e c3516e = AbstractC0593T.f1824a;
        C1451e c1451e = AbstractC2935m.f8797a;
        C10688c c10688c = new C10688c(this.f31772o0, c10713l, null);
        this.f31770Y = 2;
        if (AbstractC0575H.m1168P(c1451e, c10688c, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
