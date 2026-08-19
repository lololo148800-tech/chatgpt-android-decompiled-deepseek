package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16719Y0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53571Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16733d1 f53572Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f53573o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16719Y0(C16733d1 c16733d1, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53572Z = c16733d1;
        this.f53573o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16719Y0(this.f53572Z, this.f53573o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16719Y0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53571Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16757l1 c16757l1 = this.f53572Z.f53650O0;
            EnumC14284g0 enumC14284g0 = EnumC14284g0.f44822Z;
            C16717X0 c16717x0 = new C16717X0(this.f53573o0, null);
            this.f53571Y = 1;
            if (c16757l1.m18535e(enumC14284g0, c16717x0, this) == enumC19250a) {
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
