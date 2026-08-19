package p364Oh;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p432Rh.C6888a;
import p571X9.AbstractC9233X;
import p658b5.C11241l;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17846N;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Oh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6233g extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f20298Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6888a f20299Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17846N f20300o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6233g(C6888a c6888a, InterfaceC17846N interfaceC17846N, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f20299Z = c6888a;
        this.f20300o0 = interfaceC17846N;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C6233g(this.f20299Z, this.f20300o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C6233g) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f20298Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11241l c11241l = new C11241l(this.f20299Z.f22080a, (InterfaceC17842J) this.f20300o0);
            this.f20298Y = 1;
            obj = c11241l.m12591L(c11241l.m12593N(), this);
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
