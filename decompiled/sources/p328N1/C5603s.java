package p328N1;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: N1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5603s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18143Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5592h f18144Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5603s(C5592h c5592h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18144Z = c5592h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5603s(this.f18144Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5603s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18143Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f18143Y = 1;
            if (this.f18144Z.m5988c(this) == enumC19250a) {
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
