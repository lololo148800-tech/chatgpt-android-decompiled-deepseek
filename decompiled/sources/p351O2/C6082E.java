package p351O2;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.E */
/* JADX INFO: loaded from: classes.dex */
public final class C6082E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19799Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1439n f19800Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f19801o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6082E(InterfaceC1439n interfaceC1439n, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19800Z = interfaceC1439n;
        this.f19801o0 = obj;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6082E(this.f19800Z, this.f19801o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6082E) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19799Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f19799Y = 1;
            obj = this.f19800Z.invoke(this.f19801o0, this);
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
