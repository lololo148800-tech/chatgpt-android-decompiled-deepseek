package p278L0;

import androidx.compose.material3.internal.AbstractC10860a;
import mm.C17296C;
import p041Be.C1217J;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4888o extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f15932Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11246q f15933Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1217J f15934o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4888o(C1217J c1217j, C11246q c11246q, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f15933Z = c11246q;
        this.f15934o0 = c1217j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C4888o(this.f15934o0, this.f15933Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C4888o) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15932Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11246q c11246q = this.f15933Z;
            C4886m c4886m = new C4886m(c11246q, 0);
            C4887n c4887n = new C4887n(this.f15934o0, c11246q, null);
            this.f15932Y = 1;
            if (AbstractC10860a.m11286a(c4886m, c4887n, this) == enumC19250a) {
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
