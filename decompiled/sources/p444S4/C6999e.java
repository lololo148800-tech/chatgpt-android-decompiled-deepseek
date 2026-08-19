package p444S4;

import androidx.work.CoroutineWorker;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: S4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6999e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C7005k f22400Y;

    /* JADX INFO: renamed from: Z */
    public int f22401Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7005k f22402o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ CoroutineWorker f22403p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6999e(C7005k c7005k, CoroutineWorker coroutineWorker, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f22402o0 = c7005k;
        this.f22403p0 = coroutineWorker;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6999e(this.f22402o0, this.f22403p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6999e c6999e = (C6999e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c6999e.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22401Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f22400Y = this.f22402o0;
            this.f22401Z = 1;
            this.f22403p0.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7005k c7005k = this.f22400Y;
        AbstractC9233X.m9807c(obj);
        c7005k.f22413Y.m14769k(obj);
        return C17296C.f55119a;
    }
}
