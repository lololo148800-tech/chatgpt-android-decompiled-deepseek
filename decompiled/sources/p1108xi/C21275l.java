package p1108xi;

import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xi.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C21275l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f67663Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f67664Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f67665o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21275l(InterfaceC20904w interfaceC20904w, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67663Y = interfaceC20904w;
        this.f67664Z = interfaceC5985X;
        this.f67665o0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21275l(this.f67663Y, this.f67664Z, this.f67665o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21275l c21275l = (C21275l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21275l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC5985X interfaceC5985X = this.f67664Z;
        Long l4 = (Long) interfaceC5985X.getValue();
        C17296C c17296c = C17296C.f55119a;
        if (l4 != null) {
            InterfaceC5985X interfaceC5985X2 = this.f67665o0;
            if (((Long) interfaceC5985X2.getValue()) != null) {
                C20857C c20857c = C20857C.f66320F;
                Object f10 = (Long) interfaceC5985X.getValue();
                if (f10 == null) {
                    f10 = new Float(-1.0f);
                }
                C17309l c17309l = new C17309l("webViewLoadMs", f10);
                Object f11 = (Long) interfaceC5985X2.getValue();
                if (f11 == null) {
                    f11 = new Float(-1.0f);
                }
                this.f67663Y.mo21447a(c20857c, AbstractC17659D.m19244f(c17309l, new C17309l("syntaxHighlightMs", f11)));
            }
        }
        return c17296c;
    }
}
