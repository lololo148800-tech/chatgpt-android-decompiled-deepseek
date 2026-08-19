package p006A4;

import java.util.List;
import java.util.Set;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1143z4.C21778h;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p586Y0.C9566r;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0351l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5985X f1217Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0355p f1218Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9566r f1219o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0351l(InterfaceC5985X interfaceC5985X, C0355p c0355p, C9566r c9566r, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1217Y = interfaceC5985X;
        this.f1218Z = c0355p;
        this.f1219o0 = c9566r;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0351l(this.f1217Y, this.f1218Z, this.f1219o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C0351l c0351l = (C0351l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c0351l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        for (C21778h c21778h : (Set) this.f1217Y.getValue()) {
            C0355p c0355p = this.f1218Z;
            if (!((List) c0355p.m22258b().f69093e.f6797Y.getValue()).contains(c21778h) && !this.f1219o0.contains(c21778h)) {
                c0355p.m22258b().m22268b(c21778h);
            }
        }
        return C17296C.f55119a;
    }
}
