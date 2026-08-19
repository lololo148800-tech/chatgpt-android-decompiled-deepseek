package p554Wi;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p530Vi.InterfaceC8294B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8875b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27158Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8878e f27159Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8875b(C8878e c8878e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27159Z = c8878e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8875b(this.f27159Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8875b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27158Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC8294B interfaceC8294BM8932b = this.f27159Z.f27171a.m8932b();
            this.f27158Y = 1;
            if (interfaceC8294BM8932b.mo7526c(this) == enumC19250a) {
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
