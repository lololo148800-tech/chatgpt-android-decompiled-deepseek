package p273Kl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4768e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4808y f15551Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4768e(C4808y c4808y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15551Y = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4768e(this.f15551Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4768e c4768e = (C4768e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4768e.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C4808y c4808y = this.f15551Y;
        c4808y.f15685h.set(true);
        c4808y.f15680c.dispose();
        return C17296C.f55119a;
    }
}
