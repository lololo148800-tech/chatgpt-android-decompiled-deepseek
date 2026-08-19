package p1152zf;

import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20886e;
import p1081wc.InterfaceC20904w;
import p479Td.C7352g;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21879a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f69371Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7352g f69372Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f69373o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21879a(InterfaceC20904w interfaceC20904w, C7352g c7352g, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f69371Y = interfaceC20904w;
        this.f69372Z = c7352g;
        this.f69373o0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21879a(this.f69371Y, this.f69372Z, this.f69373o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21879a c21879a = (C21879a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21879a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C20886e c20886e = C20886e.f66517e;
        String str = this.f69372Z.f23312a;
        if (str == null) {
            str = "unknown";
        }
        this.f69371Y.mo21447a(c20886e, AbstractC17659D.m19244f(new C17309l("type", str), new C17309l("index", String.valueOf(this.f69373o0))));
        return C17296C.f55119a;
    }
}
