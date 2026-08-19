package p860l0;

import io.sentry.android.replay.C15298l;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16707S0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53521Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53522Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16757l1 f53523o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f53524p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16557y f53525q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16707S0(C16757l1 c16757l1, long j10, C16557y c16557y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53523o0 = c16757l1;
        this.f53524p0 = j10;
        this.f53525q0 = c16557y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16707S0 c16707s0 = new C16707S0(this.f53523o0, this.f53524p0, this.f53525q0, interfaceC18770c);
        c16707s0.f53522Z = obj;
        return c16707s0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16707S0) create((C16748i1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53521Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16748i1 c16748i1 = (C16748i1) this.f53522Z;
            C16757l1 c16757l1 = this.f53523o0;
            float fM18536f = c16757l1.m18536f(this.f53524p0);
            C15298l c15298l = new C15298l(this.f53525q0, c16757l1, c16748i1, 2);
            this.f53521Y = 1;
            if (AbstractC13758e.m15240e(0.0f, fM18536f, null, c15298l, this, 12) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
