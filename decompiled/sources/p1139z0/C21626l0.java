package p1139z0;

import java.io.Serializable;
import mm.C17296C;
import p002A0.C0106E;
import p002A0.C0120T;
import p002A0.C0146w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p823j3.C16084f;
import p860l0.AbstractC16689K1;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21626l0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68513Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21640s0 f68514Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f68515o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19723A f68516p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16084f f68517q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21626l0(C21640s0 c21640s0, C0120T c0120t, C19723A c19723a, C16084f c16084f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68514Z = c21640s0;
        this.f68515o0 = c0120t;
        this.f68516p0 = c19723a;
        this.f68517q0 = c16084f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21626l0(this.f68514Z, this.f68515o0, this.f68516p0, this.f68517q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21626l0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68513Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21640s0 c21640s0 = this.f68514Z;
            InterfaceC17406l interfaceC17406l = c21640s0.f68557I0;
            C21616g0 c21616g0 = new C21616g0(c21640s0, 8);
            this.f68513Y = 1;
            C0120T c0120t = this.f68515o0;
            c0120t.getClass();
            Object objM18507d = AbstractC16689K1.m18507d(this.f68516p0, new C0106E(interfaceC17406l, c0120t, null), new C0146w((Serializable) this.f68517q0, c0120t, (Serializable) c21616g0, 1), this);
            if (objM18507d != enumC19250a) {
                objM18507d = c17296c;
            }
            if (objM18507d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
