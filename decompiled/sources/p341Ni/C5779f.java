package p341Ni;

import android.net.Uri;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p1016t3.C19797x;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5779f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5785i f18817Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f18818Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5779f(C5785i c5785i, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18817Y = c5785i;
        this.f18818Z = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5779f(this.f18817Y, this.f18818Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5779f c5779f = (C5779f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5779f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C5785i c5785i = this.f18817Y;
        c5785i.f18876b.m4523N(C19797x.m20752a(new Uri.Builder().scheme("android.resource").path(String.valueOf(this.f18818Z)).build()));
        C1526D c1526d = c5785i.f18876b;
        c1526d.m2246g0();
        c1526d.m2250k0(true);
        return C17296C.f55119a;
    }
}
