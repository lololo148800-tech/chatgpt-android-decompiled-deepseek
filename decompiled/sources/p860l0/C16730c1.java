package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16730c1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53636Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ long f53637Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16733d1 f53638o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16730c1(C16733d1 c16733d1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53638o0 = c16733d1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16730c1 c16730c1 = new C16730c1(this.f53638o0, interfaceC18770c);
        c16730c1.f53637Z = ((C13800b) obj).f43584a;
        return c16730c1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((C13800b) obj).f43584a;
        C16730c1 c16730c1 = new C16730c1(this.f53638o0, (InterfaceC18770c) obj2);
        c16730c1.f53637Z = j10;
        return c16730c1.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53636Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j10 = this.f53637Z;
            C16757l1 c16757l1 = this.f53638o0.f53650O0;
            this.f53636Y = 1;
            obj = AbstractC10840a.m11217c(c16757l1, j10, this);
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
