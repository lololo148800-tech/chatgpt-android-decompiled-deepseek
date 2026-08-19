package p120Ee;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p763g5.AbstractC13819d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2415i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7503Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7504Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2423q f7505o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f7506p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415i(C2423q c2423q, InterfaceC18770c interfaceC18770c, boolean z6) {
        super(2, interfaceC18770c);
        this.f7505o0 = c2423q;
        this.f7506p0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2415i c2415i = new C2415i(this.f7505o0, interfaceC18770c, this.f7506p0);
        c2415i.f7504Z = obj;
        return c2415i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2415i) create((AbstractC13819d) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7503Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC13819d abstractC13819d = (AbstractC13819d) this.f7504Z;
            C2414h c2414h = new C2414h(this.f7505o0, null, this.f7506p0);
            this.f7503Y = 1;
            obj = abstractC13819d.m15420Q(false, c2414h, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
