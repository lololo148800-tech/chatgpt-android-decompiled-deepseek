package p278L0;

import androidx.compose.material3.internal.AbstractC10860a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4891r extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f15943Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11246q f15944Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f15945o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4872f f15946p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4891r(C11246q c11246q, Object obj, C4872f c4872f, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f15944Z = c11246q;
        this.f15945o0 = obj;
        this.f15946p0 = c4872f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C4891r(this.f15944Z, this.f15945o0, this.f15946p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C4891r) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15943Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Object obj2 = this.f15945o0;
            C11246q c11246q = this.f15944Z;
            c11246q.m12625A(obj2);
            C4886m c4886m = new C4886m(c11246q, 1);
            C4890q c4890q = new C4890q(this.f15946p0, c11246q, null);
            this.f15943Y = 1;
            if (AbstractC10860a.m11286a(c4886m, c4890q, this) == enumC19250a) {
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
