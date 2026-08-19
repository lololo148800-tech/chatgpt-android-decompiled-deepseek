package p120Ee;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p403Qd.C6636i;
import p523V9.AbstractC8120j6;
import p571X9.AbstractC9233X;
import p763g5.AbstractC13819d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2419m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7517Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7518Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2423q f7519o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6636i f7520p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419m(C2423q c2423q, C6636i c6636i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7519o0 = c2423q;
        this.f7520p0 = c6636i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2419m c2419m = new C2419m(this.f7519o0, this.f7520p0, interfaceC18770c);
        c2419m.f7518Z = obj;
        return c2419m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2419m) create((AbstractC13819d) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7517Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC13819d abstractC13819d = (AbstractC13819d) this.f7518Z;
            C2418l c2418l = new C2418l(this.f7519o0, this.f7520p0, null);
            this.f7517Y = 1;
            if (AbstractC8120j6.m8626d(abstractC13819d, c2418l, this) == enumC19250a) {
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
