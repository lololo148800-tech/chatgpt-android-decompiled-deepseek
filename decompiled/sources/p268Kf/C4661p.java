package p268Kf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p403Qd.C6617X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C4661p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15170Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15171Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4666u f15172o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6617X f15173p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4653h f15174q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4661p(C4653h c4653h, C4666u c4666u, C6617X c6617x, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15172o0 = c4666u;
        this.f15173p0 = c6617x;
        this.f15174q0 = c4653h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4661p c4661p = new C4661p(this.f15174q0, this.f15172o0, this.f15173p0, interfaceC18770c);
        c4661p.f15171Z = obj;
        return c4661p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4661p) create((String) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15170Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = (String) this.f15171Z;
            this.f15170Y = 1;
            obj = C4666u.m5374a(this.f15172o0, this.f15173p0, str, this.f15174q0, this);
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
