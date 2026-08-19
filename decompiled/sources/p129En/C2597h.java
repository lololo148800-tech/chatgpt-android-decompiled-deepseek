package p129En;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C2597h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8050Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8051Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC2598i f8052o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597h(AbstractC2598i abstractC2598i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8052o0 = abstractC2598i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2597h c2597h = new C2597h(this.f8052o0, interfaceC18770c);
        c2597h.f8051Z = obj;
        return c2597h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2597h) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8050Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f8051Z;
            this.f8050Y = 1;
            if (this.f8052o0.mo3616l(interfaceC2186j, this) == enumC19250a) {
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
