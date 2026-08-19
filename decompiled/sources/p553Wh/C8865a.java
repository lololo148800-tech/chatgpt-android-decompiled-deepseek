package p553Wh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p229J0.C3934J3;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8865a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8870f f27132Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8865a(C8870f c8870f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27132Y = c8870f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8865a(this.f27132Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8865a c8865a = (C8865a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8865a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C3934J3 c3934j3 = (C3934J3) this.f27132Y.f27150c.f12253b.getValue();
        if (c3934j3 != null) {
            c3934j3.m4634a();
        }
        return C17296C.f55119a;
    }
}
