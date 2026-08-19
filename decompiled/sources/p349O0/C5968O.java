package p349O0;

import p025An.AbstractC0575H;
import p025An.C0564B0;
import p049Bm.InterfaceC1439n;
import p153Fn.C2925c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: O0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C5968O implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1439n f19428Y;

    /* JADX INFO: renamed from: Z */
    public final C2925c f19429Z;

    /* JADX INFO: renamed from: o0 */
    public C0564B0 f19430o0;

    public C5968O(InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n) {
        this.f19428Y = interfaceC1439n;
        this.f19429Z = AbstractC0575H.m1174c(interfaceC18776i);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        C0564B0 c0564b0 = this.f19430o0;
        if (c0564b0 != null) {
            c0564b0.mo1311w(new C5972Q());
        }
        this.f19430o0 = null;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        C0564B0 c0564b0 = this.f19430o0;
        if (c0564b0 != null) {
            c0564b0.mo1311w(new C5972Q());
        }
        this.f19430o0 = null;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        C0564B0 c0564b0 = this.f19430o0;
        if (c0564b0 != null) {
            c0564b0.mo1275e(AbstractC0575H.m1172a("Old job was still running!", null));
        }
        this.f19430o0 = AbstractC0575H.m1156D(this.f19429Z, null, null, this.f19428Y, 3);
    }
}
