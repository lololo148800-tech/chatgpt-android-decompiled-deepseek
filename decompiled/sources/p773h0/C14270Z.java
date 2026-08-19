package p773h0;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21660F;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p715e1.InterfaceC13259e;

/* JADX INFO: renamed from: h0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C14270Z implements InterfaceC13259e {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC14268X f44771Y;

    public C14270Z(InterfaceC14268X interfaceC14268X) {
        this.f44771Y = interfaceC14268X;
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

    @Override // p715e1.InterfaceC13259e
    /* JADX INFO: renamed from: e */
    public final void mo14858e(C21660F c21660f) {
        this.f44771Y.mo4225b(c21660f);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }
}
