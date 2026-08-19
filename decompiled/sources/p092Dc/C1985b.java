package p092Dc;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1985b extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f5866Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1988e f5867Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985b(C1988e c1988e, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f5867Z = c1988e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C1985b(this.f5867Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C1985b) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5866Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1988e c1988e = this.f5867Z;
            C1996m c1996m = (C1996m) c1988e.f5878d.f6797Y.getValue();
            if (c1996m != null) {
                this.f5866Y = 1;
                if (C1988e.m3157a(c1988e, c1996m, this) == enumC19250a) {
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
