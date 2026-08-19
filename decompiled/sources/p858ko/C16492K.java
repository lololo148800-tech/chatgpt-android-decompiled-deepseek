package p858ko;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p773h0.EnumC14284g0;
import p878lo.C17088K;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C16492K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51162Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16495N f51163Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16492K(C16495N c16495n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51163Z = c16495n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16492K(this.f51163Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16492K) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51162Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11238i c11238i = this.f51163Z.f51169B0.f51149p;
            EnumC14284g0 enumC14284g0 = EnumC14284g0.f44821Y;
            this.f51162Y = 1;
            Object objM12542I0 = c11238i.m12542I0(enumC14284g0, new C17088K(2, null), this);
            if (objM12542I0 != enumC19250a) {
                objM12542I0 = c17296c;
            }
            if (objM12542I0 == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
