package p129En;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2589I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8028Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8029Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2186j f8030o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2589I(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8030o0 = interfaceC2186j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2589I c2589i = new C2589I(this.f8030o0, interfaceC18770c);
        c2589i.f8029Z = obj;
        return c2589i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2589I) create(obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8028Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Object obj2 = this.f8029Z;
            this.f8028Y = 1;
            if (this.f8030o0.mo395a(obj2, this) == enumC19250a) {
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
