package p349O0;

import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: O0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C5946D implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f19362Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC5948E f19363Z;

    public C5946D(InterfaceC1436k interfaceC1436k) {
        this.f19362Y = interfaceC1436k;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        InterfaceC5948E interfaceC5948E = this.f19363Z;
        if (interfaceC5948E != null) {
            interfaceC5948E.dispose();
        }
        this.f19363Z = null;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        this.f19363Z = (InterfaceC5948E) this.f19362Y.invoke(C5997d.f19482h);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
    }
}
