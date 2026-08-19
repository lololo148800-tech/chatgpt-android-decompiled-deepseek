package p002A0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p860l0.C16685J0;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0106E extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f458Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C16685J0 f459Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ long f460o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17406l f461p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0120T f462q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106E(InterfaceC17406l interfaceC17406l, C0120T c0120t, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f461p0 = interfaceC17406l;
        this.f462q0 = c0120t;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j10 = ((C13800b) obj2).f43584a;
        C0106E c0106e = new C0106E(this.f461p0, this.f462q0, (InterfaceC18770c) obj3);
        c0106e.f459Z = (C16685J0) obj;
        c0106e.f460o0 = j10;
        return c0106e.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f458Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16685J0 c16685j0 = this.f459Z;
            long j10 = this.f460o0;
            InterfaceC17406l interfaceC17406l = this.f461p0;
            if (interfaceC17406l != null) {
                C0105D c0105d = new C0105D(c16685j0, this.f462q0, j10, interfaceC17406l, null);
                this.f458Y = 1;
                if (AbstractC0575H.m1183l(c0105d, this) == enumC19250a) {
                    return enumC19250a;
                }
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
