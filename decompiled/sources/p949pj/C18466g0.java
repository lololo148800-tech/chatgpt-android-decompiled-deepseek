package p949pj;

import mm.C17296C;
import mm.C17312o;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2211v0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pj.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18466g0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58905Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18470i0 f58906Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f58907o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18466g0(C18470i0 c18470i0, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58906Z = c18470i0;
        this.f58907o0 = obj;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18466g0(this.f58906Z, this.f58907o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18466g0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58905Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2211v0 interfaceC2211v0 = this.f58906Z.f58914Z;
            C17312o c17312o = new C17312o(this.f58907o0);
            this.f58905Y = 1;
            if (interfaceC2211v0.mo395a(c17312o, this) == enumC19250a) {
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
