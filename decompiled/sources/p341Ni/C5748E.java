package p341Ni;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p172Gi.EnumC3068a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C5748E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18705Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5784h0 f18706Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5748E(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18706Z = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5748E(this.f18706Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5748E) create((C17296C) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18705Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC3068a enumC3068a = EnumC3068a.UserRequest;
            this.f18705Y = 1;
            if (this.f18706Z.m6176i(enumC3068a, this) == enumC19250a) {
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
