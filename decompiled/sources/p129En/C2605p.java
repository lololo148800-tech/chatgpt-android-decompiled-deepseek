package p129En;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C2605p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8074Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f8075Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2586F f8076o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2605p(InterfaceC2184i interfaceC2184i, C2586F c2586f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8075Z = interfaceC2184i;
        this.f8076o0 = c2586f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2605p(this.f8075Z, this.f8076o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2605p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8074Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f8074Y = 1;
            if (this.f8075Z.mo3141d(this.f8076o0, this) == enumC19250a) {
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
