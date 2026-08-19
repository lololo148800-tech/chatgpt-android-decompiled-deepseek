package p120Ee;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p402Qc.C6589e;
import p571X9.AbstractC9233X;
import p763g5.C13820e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2407a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7475Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2423q f7476Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f7477o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2407a(C2423q c2423q, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7476Z = c2423q;
        this.f7477o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2407a(this.f7476Z, this.f7477o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2407a) create((C13820e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7475Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6589e c6589e = this.f7476Z.f7535b;
            this.f7475Y = 1;
            if (c6589e.m7154R(this.f7477o0, this) == enumC19250a) {
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
