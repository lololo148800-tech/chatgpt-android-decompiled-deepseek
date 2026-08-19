package p278L0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.C3899D4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C4837A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ boolean f15743Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3899D4 f15744Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4837A(C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15744Z = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4837A c4837a = new C4837A(this.f15744Z, interfaceC18770c);
        c4837a.f15743Y = ((Boolean) obj).booleanValue();
        return c4837a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C4837A c4837a = (C4837A) create(bool, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4837a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (!this.f15743Y) {
            this.f15744Z.f11883c.f43331c.setValue(Boolean.FALSE);
        }
        return C17296C.f55119a;
    }
}
