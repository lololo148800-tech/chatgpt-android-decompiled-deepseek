package p1000s0;

import p013Ab.C0420b;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p953q0.AbstractC18551I;

/* JADX INFO: renamed from: s0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C19425u extends AbstractC18551I {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f61570b;

    /* JADX INFO: renamed from: c */
    public final C0420b f61571c;

    public C19425u(InterfaceC1441p interfaceC1441p, InterfaceC1436k interfaceC1436k, int i10) {
        this.f61570b = interfaceC1436k;
        C0420b c0420b = new C0420b(15, (byte) 0);
        c0420b.m1047b(i10, new C19420p(interfaceC1436k, interfaceC1441p));
        this.f61571c = c0420b;
    }

    @Override // p953q0.AbstractC18551I
    /* JADX INFO: renamed from: k */
    public final C0420b mo19801k() {
        return this.f61571c;
    }
}
