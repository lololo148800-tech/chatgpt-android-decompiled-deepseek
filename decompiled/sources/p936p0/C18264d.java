package p936p0;

import p049Bm.InterfaceC1436k;
import p537W0.C8410b;
import p953q0.InterfaceC18599t;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18264d implements InterfaceC18599t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f58226a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f58227b;

    /* JADX INFO: renamed from: c */
    public final C8410b f58228c;

    public C18264d(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C8410b c8410b) {
        this.f58226a = interfaceC1436k;
        this.f58227b = interfaceC1436k2;
        this.f58228c = c8410b;
    }

    @Override // p953q0.InterfaceC18599t
    public final InterfaceC1436k getKey() {
        return this.f58226a;
    }

    @Override // p953q0.InterfaceC18599t
    public final InterfaceC1436k getType() {
        return this.f58227b;
    }
}
