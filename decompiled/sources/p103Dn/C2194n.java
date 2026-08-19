package p103Dn;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C2194n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6723Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f6724Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194n(InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6724Z = interfaceC2184i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2194n(this.f6724Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2194n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6723Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f6723Y = 1;
            if (AbstractC2124C.m3211j(this.f6724Z, this) == enumC19250a) {
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
