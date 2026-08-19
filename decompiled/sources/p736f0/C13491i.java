package p736f0;

import af.C10564U;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21102w;
import p1140z1.AbstractC21668N;
import p193Hf.C3353c0;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p552Wg.C8847i;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p758g0.C13759e0;
import p758g0.C13761f0;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13491i implements InterfaceC21102w {

    /* JADX INFO: renamed from: Y */
    public final C13761f0 f42704Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC5985X f42705Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13493k f42706o0;

    public C13491i(C13493k c13493k, C13761f0 c13761f0, InterfaceC5985X interfaceC5985X) {
        this.f42706o0 = c13493k;
        this.f42704Y = c13761f0;
        this.f42705Z = interfaceC5985X;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: d */
    public final int mo2446d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21056J.mo21532o(i10);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2447f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        C13493k c13493k = this.f42706o0;
        C13759e0 c13759e0M15259a = this.f42704Y.m15259a(new C8847i(c13493k, 23, this), new C10564U(c13493k, 27));
        c13493k.f42715f = c13759e0M15259a;
        long jM9643a = interfaceC21059M.mo19937Z() ? AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z) : ((C7545j) c13759e0M15259a.getValue()).f23903a;
        return interfaceC21059M.mo19936R((int) (jM9643a >> 32), (int) (4294967295L & jM9643a), C17690x.f56481Y, new C3353c0(c13493k, abstractC21069XMo21533p, jM9643a, 3));
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: g */
    public final int mo2448g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21056J.mo21530b(i10);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: h */
    public final int mo2449h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21056J.mo21529G(i10);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: k */
    public final int mo2450k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21056J.mo21531l(i10);
    }
}
