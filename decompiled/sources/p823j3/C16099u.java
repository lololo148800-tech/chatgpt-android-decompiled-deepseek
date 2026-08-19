package p823j3;

import androidx.glance.session.SessionWorker;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C16099u extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16075N f49866Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SessionWorker f49867Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16099u(SessionWorker sessionWorker, C16075N c16075n, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f49866Y = c16075n;
        this.f49867Z = sessionWorker;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C16099u(this.f49867Z, this.f49866Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16099u c16099u = (C16099u) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c16099u.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f49866Y.m17644b(this.f49867Z.f33347v0.f49770c);
        return C17296C.f55119a;
    }
}
