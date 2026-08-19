package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p773h0.InterfaceC14300o0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16715W0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53552Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16733d1 f53553Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f53554o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16715W0(C16733d1 c16733d1, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53553Z = c16733d1;
        this.f53554o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16715W0(this.f53553Z, this.f53554o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16715W0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objInvokeSuspend;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53552Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16757l1 c16757l1 = this.f53553Z.f53650O0;
            this.f53552Y = 1;
            EnumC16673F0 enumC16673F0 = c16757l1.f53760d;
            EnumC16673F0 enumC16673F1 = EnumC16673F0.f53402Z;
            long j10 = this.f53554o0;
            long jM7901b = enumC16673F0 == enumC16673F1 ? C7550o.m7901b(j10, 0.0f, 0.0f, 1) : C7550o.m7901b(j10, 0.0f, 0.0f, 2);
            C16751j1 c16751j1 = new C16751j1(c16757l1, null);
            InterfaceC14300o0 interfaceC14300o0 = c16757l1.f53758b;
            if (interfaceC14300o0 == null || !(c16757l1.f53757a.mo5258d() || c16757l1.f53757a.mo5257c())) {
                C16751j1 c16751j2 = new C16751j1(c16751j1.f53733p0, this);
                c16751j2.f53732o0 = jM7901b;
                objInvokeSuspend = c16751j2.invokeSuspend(c17296c);
                if (objInvokeSuspend != enumC19250a) {
                    objInvokeSuspend = c17296c;
                }
            } else {
                objInvokeSuspend = interfaceC14300o0.mo15582e(jM7901b, c16751j1, this);
                if (objInvokeSuspend != enumC19250a) {
                    objInvokeSuspend = c17296c;
                }
            }
            if (objInvokeSuspend == enumC19250a) {
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
