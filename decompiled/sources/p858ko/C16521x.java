package p858ko;

import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13785r0;
import p758g0.C13744U;
import p758g0.C13774m;
import p758g0.C13775m0;
import p759g1.C13800b;
import p878lo.C17097f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C16521x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51247Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f51248Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f51249o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13744U f51250p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16521x(long j10, C13744U c13744u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51249o0 = j10;
        this.f51250p0 = c13744u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16521x c16521x = new C16521x(this.f51249o0, this.f51250p0, interfaceC18770c);
        c16521x.f51248Z = obj;
        return c16521x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16521x) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51247Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17097f c17097f = (C17097f) this.f51248Z;
            C16524A c16524a = new C16524A();
            c16524a.f51261Y = 0L;
            C13774m c13774m = new C13774m(AbstractC13785r0.f43533f, new C13800b(0L), null, 60);
            C13800b c13800b = new C13800b(this.f51249o0);
            C13775m0 c13775m0 = new C13775m0(c17097f, 18, c16524a);
            this.f51247Y = 1;
            if (AbstractC13758e.m15244i(c13774m, c13800b, this.f51250p0, false, c13775m0, this, 4) == enumC19250a) {
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
