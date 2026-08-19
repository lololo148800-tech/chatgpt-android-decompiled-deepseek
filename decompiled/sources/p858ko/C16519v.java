package p858ko;

import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p147Fh.C2750g;
import p492U1.C7550o;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9233X;
import p588Y2.C9642z;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13785r0;
import p758g0.C13774m;
import p758g0.C13778o;
import p758g0.C13783q0;
import p758g0.C13796x;
import p759g1.C13800b;
import p878lo.C17097f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C16519v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51240Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f51241Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16501d f51242o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f51243p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC7537b f51244q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16484C f51245r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16519v(C16501d c16501d, long j10, InterfaceC7537b interfaceC7537b, C16484C c16484c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51242o0 = c16501d;
        this.f51243p0 = j10;
        this.f51244q0 = interfaceC7537b;
        this.f51245r0 = c16484c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16519v c16519v = new C16519v(this.f51242o0, this.f51243p0, this.f51244q0, this.f51245r0, interfaceC18770c);
        c16519v.f51241Z = obj;
        return c16519v;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16519v) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51240Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17097f c17097f = (C17097f) this.f51241Z;
            C16524A c16524a = new C16524A();
            C16501d c16501d = this.f51242o0;
            long j10 = c16501d.f51184a;
            c16524a.f51261Y = j10;
            C13783q0 c13783q0 = AbstractC13785r0.f43533f;
            C13800b c13800b = new C13800b(j10);
            long j11 = this.f51243p0;
            C13774m c13774m = new C13774m(c13783q0, c13800b, new C13778o(C7550o.m7902c(j11), C7550o.m7903d(j11)), 56);
            C13796x c13796x = new C13796x(new C9642z(this.f51244q0));
            C2750g c2750g = new C2750g(c16501d, c16524a, c17097f, this.f51245r0, this.f51243p0, 4);
            this.f51240Y = 1;
            if (AbstractC13758e.m15241f(c13774m, c13796x, false, c2750g, this) == enumC19250a) {
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
