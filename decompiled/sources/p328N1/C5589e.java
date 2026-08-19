package p328N1;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: N1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5589e extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f18107Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5592h f18108Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5576C f18109o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5589e(C5592h c5592h, C5576C c5576c, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f18108Z = c5592h;
        this.f18109o0 = c5576c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C5589e(this.f18108Z, this.f18109o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C5589e) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18107Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f18107Y = 1;
            obj = this.f18108Z.m5989d(this.f18109o0, this);
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
