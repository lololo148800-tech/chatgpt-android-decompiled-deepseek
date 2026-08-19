package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p296Lk.C5109f;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13774m;
import p758g0.C13796x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16734e extends AbstractC19694j implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public int f53656Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C16779t f53657Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ C16670E0 f53658o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53659p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16782u f53660q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f53661r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16557y f53662s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16734e(C16782u c16782u, float f10, C16557y c16557y, InterfaceC18770c interfaceC18770c) {
        super(4, interfaceC18770c);
        this.f53660q0 = c16782u;
        this.f53661r0 = f10;
        this.f53662s0 = c16557y;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C16557y c16557y = this.f53662s0;
        C16734e c16734e = new C16734e(this.f53660q0, this.f53661r0, c16557y, (InterfaceC18770c) obj4);
        c16734e.f53657Z = (C16779t) obj;
        c16734e.f53658o0 = (C16670E0) obj2;
        c16734e.f53659p0 = obj3;
        return c16734e.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53656Y;
        C16557y c16557y = this.f53662s0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16779t c16779t = this.f53657Z;
            C16670E0 c16670e0 = this.f53658o0;
            Object obj2 = this.f53659p0;
            float fM18495e = c16670e0.m18495e(obj2);
            if (!Float.isNaN(fM18495e)) {
                C16557y c16557y2 = new C16557y();
                C16782u c16782u = this.f53660q0;
                float fM6409g = Float.isNaN(c16782u.f53868j.m6409g()) ? 0.0f : c16782u.f53868j.m6409g();
                c16557y2.f51286Y = fM6409g;
                if (fM6409g != fM18495e) {
                    float f10 = this.f53661r0;
                    if ((fM18495e - fM6409g) * f10 < 0.0f || f10 == 0.0f) {
                        this.f53657Z = null;
                        this.f53658o0 = null;
                        this.f53656Y = 1;
                        if (AbstractC10840a.m11215a(this.f53660q0, f10, c16779t, c16670e0, obj2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        c16557y.f51286Y = 0.0f;
                    } else {
                        C13796x c13796x = c16782u.f53862d;
                        float fM15246k = AbstractC13758e.m15246k(c13796x, fM6409g, f10);
                        float f11 = this.f53661r0;
                        if (f11 <= 0.0f ? fM15246k > fM18495e : fM15246k < fM18495e) {
                            this.f53657Z = null;
                            this.f53658o0 = null;
                            this.f53656Y = 3;
                            if (AbstractC10840a.m11215a(this.f53660q0, f11, c16779t, c16670e0, obj2, this) == enumC19250a) {
                                return enumC19250a;
                            }
                            c16557y.f51286Y = 0.0f;
                        } else {
                            C13774m c13774mM15237b = AbstractC13758e.m15237b(c16557y2.f51286Y, f11, 28);
                            C5109f c5109f = new C5109f(fM18495e, c16779t, c16557y, c16557y2, 2);
                            this.f53657Z = null;
                            this.f53658o0 = null;
                            this.f53656Y = 2;
                            if (AbstractC13758e.m15241f(c13774mM15237b, c13796x, false, c5109f, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    }
                }
            }
        } else if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
            c16557y.f51286Y = 0.0f;
        } else if (i10 == 2) {
            AbstractC9233X.m9807c(obj);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            c16557y.f51286Y = 0.0f;
        }
        return C17296C.f55119a;
    }
}
