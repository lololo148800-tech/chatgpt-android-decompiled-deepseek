package p931ok;

import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0621k0;
import p025An.InterfaceC0571F;
import p035B7.C0846c;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ok.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18233n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58087Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f58088Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ThemeableLottieAnimationView f58089o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18233n(ThemeableLottieAnimationView themeableLottieAnimationView, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58088Z = str;
        this.f58089o0 = themeableLottieAnimationView;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18233n(this.f58089o0, this.f58088Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18233n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58087Y;
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
        C3516e c3516e = AbstractC0593T.f1824a;
        ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
        C0846c c0846c = new C0846c(this.f58088Z, 26);
        this.f58087Y = 1;
        obj = AbstractC0575H.m1168P(executorC3515d, new C0621k0(c0846c, null), this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        String str = (String) obj;
        if (str != null) {
            C3516e c3516e2 = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a;
            C18232m c18232m = new C18232m(this.f58089o0, str, null);
            this.f58087Y = 2;
            if (AbstractC0575H.m1168P(c1451e, c18232m, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
