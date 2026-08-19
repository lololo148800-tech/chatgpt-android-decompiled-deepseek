package p1156zj;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p909nm.AbstractC17680n;
import p949pj.C18428A;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22099G0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22195t0 f69853Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22107K0 f69854Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC22180o0 f69855o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13421l f69856p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22099G0(C22195t0 c22195t0, C22107K0 c22107k0, AbstractC22180o0 abstractC22180o0, C13421l c13421l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f69853Y = c22195t0;
        this.f69854Z = c22107k0;
        this.f69855o0 = abstractC22180o0;
        this.f69856p0 = c13421l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22099G0(this.f69853Y, this.f69854Z, this.f69855o0, this.f69856p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C22099G0 c22099g0 = (C22099G0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c22099g0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C22195t0 c22195t0 = this.f69853Y;
        if (c22195t0.f70337c.size() == 1) {
            C22130W0 c22130w0 = (C22130W0) AbstractC17680n.m19341Q(c22195t0.f70337c);
            C13421l c13421l = this.f69856p0;
            ArrayList arrayList = c22130w0.f69960p0;
            AbstractC22120R0.m22361h(this.f69855o0, c13421l, c22195t0, null, c22130w0, this.f69854Z.f69887m, new C18428A(), false, arrayList, 0, 1536);
        }
        return C17296C.f55119a;
    }
}
