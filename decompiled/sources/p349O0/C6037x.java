package p349O0;

import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: O0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6037x extends AbstractC6012k0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f19671b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f19672c;

    public C6037x(InterfaceC1426a interfaceC1426a, InterfaceC5959J0 interfaceC5959J0) {
        super(interfaceC1426a);
        this.f19672c = interfaceC5959J0;
    }

    @Override // p349O0.AbstractC6012k0
    /* JADX INFO: renamed from: a */
    public final C6014l0 mo6405a(Object obj) {
        switch (this.f19671b) {
            case 0:
                return new C6014l0(this, obj, obj == null, null, true);
            default:
                return new C6014l0(this, obj, obj == null, (InterfaceC5959J0) this.f19672c, true);
        }
    }

    @Override // p349O0.AbstractC6012k0
    /* JADX INFO: renamed from: b */
    public InterfaceC5988Y0 mo6480b() {
        switch (this.f19671b) {
            case 0:
                return (C6039y) this.f19672c;
            default:
                return super.mo6480b();
        }
    }

    public C6037x(InterfaceC1436k interfaceC1436k) {
        super(C5991a.f19467o0);
        this.f19672c = new C6039y(interfaceC1436k);
    }
}
