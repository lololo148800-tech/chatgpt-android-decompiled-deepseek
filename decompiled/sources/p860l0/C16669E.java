package p860l0;

import java.util.concurrent.CancellationException;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C16669E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53384Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53385Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16672F f53386o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16698N1 f53387p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC16794y f53388q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16669E(C16672F c16672f, C16698N1 c16698n1, InterfaceC16794y interfaceC16794y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53386o0 = c16672f;
        this.f53387p0 = c16698n1;
        this.f53388q0 = interfaceC16794y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16669E c16669e = new C16669E(this.f53386o0, this.f53387p0, this.f53388q0, interfaceC18770c);
        c16669e.f53385Z = obj;
        return c16669e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16669E) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53384Y;
        C16672F c16672f = this.f53386o0;
        try {
            try {
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC0627n0 interfaceC0627n0M1192u = AbstractC0575H.m1192u(((InterfaceC0571F) this.f53385Z).getCoroutineContext());
                    c16672f.f53399I0 = true;
                    C16757l1 c16757l1 = c16672f.f53391A0;
                    EnumC14284g0 enumC14284g0 = EnumC14284g0.f44821Y;
                    C16666D c16666d = new C16666D(this.f53387p0, c16672f, this.f53388q0, interfaceC0627n0M1192u, null);
                    this.f53384Y = 1;
                    if (c16757l1.m18535e(enumC14284g0, c16666d, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                c16672f.f53394D0.m15958f();
                c16672f.f53399I0 = false;
                c16672f.f53394D0.m15957e(null);
                c16672f.f53397G0 = false;
                return C17296C.f55119a;
            } catch (CancellationException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            c16672f.f53399I0 = false;
            c16672f.f53394D0.m15957e(null);
            c16672f.f53397G0 = false;
            throw th2;
        }
    }
}
