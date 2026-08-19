package p823j3;

import androidx.glance.session.SessionWorker;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p672c3.C11617m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C16102x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f49874Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SessionWorker f49875Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16102x(SessionWorker sessionWorker, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49875Z = sessionWorker;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16102x c16102x = new C16102x(this.f49875Z, interfaceC18770c);
        c16102x.f49874Y = obj;
        return c16102x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16102x) create((C16095q) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C16095q c16095q = (C16095q) this.f49874Y;
        return (C11617m) c16095q.f49858a.get(this.f49875Z.f33349x0);
    }
}
