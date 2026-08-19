package p444S4;

import androidx.work.CoroutineWorker;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: S4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7000f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f22404Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CoroutineWorker f22405Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7000f(CoroutineWorker coroutineWorker, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f22405Z = coroutineWorker;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7000f(this.f22405Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7000f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22404Y;
        CoroutineWorker coroutineWorker = this.f22405Z;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f22404Y = 1;
                obj = coroutineWorker.mo12108f(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            coroutineWorker.f33692r0.m14769k((AbstractC7009o) obj);
        } catch (Throwable th2) {
            coroutineWorker.f33692r0.m14770l(th2);
        }
        return C17296C.f55119a;
    }
}
