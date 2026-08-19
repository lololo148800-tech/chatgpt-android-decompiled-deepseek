package tf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20897p;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: tf.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C19897B extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f63044Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19897B(InterfaceC20904w interfaceC20904w, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63044Y = interfaceC20904w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19897B(this.f63044Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C19897B c19897b = (C19897B) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c19897b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f63044Y.mo21447a(C20897p.f66607g, C17690x.f56481Y);
        return C17296C.f55119a;
    }
}
