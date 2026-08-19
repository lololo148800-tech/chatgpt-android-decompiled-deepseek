package p273Kl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4770f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15555Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4808y f15556Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4770f(C4808y c4808y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15556Z = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4770f(this.f15556Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4770f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15555Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f15555Y = 1;
            if (this.f15556Z.m5437a(this) == enumC19250a) {
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
