package p895n1;

import p049Bm.InterfaceC1436k;
import p821j1.InterfaceC16039d;
import p858ko.C16482A;

/* JADX INFO: renamed from: n1.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17414B {

    /* JADX INFO: renamed from: a */
    public C16482A f55611a;

    /* JADX INFO: renamed from: a */
    public abstract void mo19108a(InterfaceC16039d interfaceC16039d);

    /* JADX INFO: renamed from: b */
    public InterfaceC1436k mo19109b() {
        return this.f55611a;
    }

    /* JADX INFO: renamed from: c */
    public final void m19110c() {
        InterfaceC1436k interfaceC1436kMo19109b = mo19109b();
        if (interfaceC1436kMo19109b != null) {
            interfaceC1436kMo19109b.invoke(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo19111d(C16482A c16482a) {
        this.f55611a = c16482a;
    }
}
