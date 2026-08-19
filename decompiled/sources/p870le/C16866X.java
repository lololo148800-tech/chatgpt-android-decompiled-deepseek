package p870le;

import ge.C14090n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p229J0.C3899D4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C16866X extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54117Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3899D4 f54118Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f54119o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16866X(C3899D4 c3899d4, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54118Z = c3899d4;
        this.f54119o0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16866X(this.f54118Z, this.f54119o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16866X) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54117Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f54118Z.m4608a()) {
                long j10 = AbstractC16868Z.f54121a;
                this.f54117Y = 1;
                if (AbstractC0575H.m1185n(j10, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        this.f54119o0.invoke(C14090n.f44324a);
        return C17296C.f55119a;
    }
}
