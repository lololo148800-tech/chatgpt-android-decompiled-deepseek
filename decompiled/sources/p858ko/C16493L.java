package p858ko;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.L */
/* JADX INFO: loaded from: classes2.dex */
public final class C16493L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51164Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16495N f51165Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16493L(C16495N c16495n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51165Z = c16495n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16493L(this.f51165Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16493L) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51164Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16495N c16495n = this.f51165Z;
            c16495n.f51171D0.m16689b();
            C16484C c16484c = c16495n.f51169B0;
            this.f51164Y = 1;
            if (c16484c.m18048a(this) == enumC19250a) {
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
