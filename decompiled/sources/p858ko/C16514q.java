package p858ko;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p482Tg.C7448e;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13746W;
import p758g0.C13774m;
import p878lo.C17097f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C16514q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51215Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f51216Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16501d f51217o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f51218p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16514q(C16501d c16501d, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51217o0 = c16501d;
        this.f51218p0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16514q c16514q = new C16514q(this.f51217o0, this.f51218p0, interfaceC18770c);
        c16514q.f51216Z = obj;
        return c16514q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16514q) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51215Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17097f c17097f = (C17097f) this.f51216Z;
            C16557y c16557y = new C16557y();
            C16501d c16501d = this.f51217o0;
            float f10 = c16501d.f51185b;
            c16557y.f51286Y = f10;
            C13774m c13774mM15237b = AbstractC13758e.m15237b(f10, 0.0f, 30);
            Float f11 = new Float(this.f51218p0);
            C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 0.0f, null, 7);
            C7448e c7448e = new C7448e(c16501d, c16557y, c17097f, 29);
            this.f51215Y = 1;
            if (AbstractC13758e.m15244i(c13774mM15237b, f11, c13746wM15254s, false, c7448e, this, 4) == enumC19250a) {
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
