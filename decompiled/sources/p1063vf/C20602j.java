package p1063vf;

import bb.C11294T;
import mm.C17296C;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p1053v3.C20422c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20602j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20603k f65366Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20602j(C20603k c20603k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65366Y = c20603k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20602j(this.f65366Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20602j c20602j = (C20602j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20602j.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C0564B0 c0564b0 = this.f65366Y.f65375i.f21949a;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        C1526D c1526d = this.f65366Y.f65377k;
        c1526d.m2256q0();
        c1526d.f4062L0.m2384c(1, c1526d.m2241a0());
        c1526d.m2252m0(null);
        C11294T c11294t = C11294T.f34185q0;
        long j10 = c1526d.f4087k1.f4268s;
        new C20422c(c11294t);
        return C17296C.f55119a;
    }
}
