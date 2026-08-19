package p773h0;

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

/* JADX INFO: renamed from: h0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C14313v extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44931Y;

    /* JADX INFO: renamed from: Z */
    public int f44932Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ C16685J0 f44933o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ long f44934p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC14289j f44935q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14313v(AbstractC14289j abstractC14289j, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f44931Y = i10;
        this.f44935q0 = abstractC14289j;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C16685J0 c16685j0 = (C16685J0) obj;
        C13800b c13800b = (C13800b) obj2;
        switch (this.f44931Y) {
            case 0:
                long j10 = c13800b.f43584a;
                C14313v c14313v = new C14313v((C14315w) this.f44935q0, (InterfaceC18770c) obj3, 0);
                c14313v.f44933o0 = c16685j0;
                c14313v.f44934p0 = j10;
                return c14313v.invokeSuspend(C17296C.f55119a);
            default:
                long j11 = c13800b.f43584a;
                C14313v c14313v2 = new C14313v((C14245A) this.f44935q0, (InterfaceC18770c) obj3, 1);
                c14313v2.f44933o0 = c16685j0;
                c14313v2.f44934p0 = j11;
                return c14313v2.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM1183l;
        Object objM1183l2;
        switch (this.f44931Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f44932Z;
                C17296C c17296c = C17296C.f55119a;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C16685J0 c16685j0 = this.f44933o0;
                    long j10 = this.f44934p0;
                    C14315w c14315w = (C14315w) this.f44935q0;
                    if (c14315w.f44844F0) {
                        this.f44932Z = 1;
                        InterfaceC17406l interfaceC17406l = c14315w.f44840B0;
                        if (interfaceC17406l == null || (objM1183l = AbstractC0575H.m1183l(new C14277d(c16685j0, j10, interfaceC17406l, c14315w, null), this)) != enumC19250a) {
                            objM1183l = c17296c;
                        }
                        if (objM1183l == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return c17296c;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f44932Z;
                C17296C c17296c2 = C17296C.f55119a;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C16685J0 c16685j1 = this.f44933o0;
                    long j11 = this.f44934p0;
                    C14245A c14245a = (C14245A) this.f44935q0;
                    if (c14245a.f44844F0) {
                        this.f44932Z = 1;
                        InterfaceC17406l interfaceC17406l2 = c14245a.f44840B0;
                        if (interfaceC17406l2 == null || (objM1183l2 = AbstractC0575H.m1183l(new C14277d(c16685j1, j11, interfaceC17406l2, c14245a, null), this)) != enumC19250a2) {
                            objM1183l2 = c17296c2;
                        }
                        if (objM1183l2 == enumC19250a2) {
                            return enumC19250a2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return c17296c2;
        }
    }
}
